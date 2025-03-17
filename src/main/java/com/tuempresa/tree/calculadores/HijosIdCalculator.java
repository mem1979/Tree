package com.tuempresa.tree.calculadores;

import javax.persistence.*;

import org.openxava.calculators.*;
import org.openxava.jpa.*;

import com.tuempresa.tree.modelo.*;

public class HijosIdCalculator implements ICalculator {

    private static final long serialVersionUID = 1L;

    private Estructura estructura; // Se inyecta automáticamente

    public void setEstructura(Estructura estructura) {
        this.estructura = estructura;
    }

    @Override
    public Object calculate() throws Exception {
        if (estructura == null) {
            return "EEE"; // Si no hay estructura, no generamos ID
        }

        String prefix = estructura.getPrefix();
        
        EntityManager em = XPersistence.getManager();

        // Buscar el último ID generado con el mismo prefijo
        Query query = em.createQuery("SELECT MAX(h.id) FROM Hijos h WHERE h.id LIKE :prefix");
        query.setParameter("prefix", prefix + "%");

        String lastId = (String) query.getSingleResult();
        int nextNumber = 1; // Por defecto, el primer número

        if (lastId != null) {
            // Extraer los números del ID y aumentar en 1
            nextNumber = Integer.parseInt(lastId.substring(1)) + 1;
        }

        // Formatear como A01, T02, N03, etc.
        return String.format("%s%02d", prefix, nextNumber);
    }
}