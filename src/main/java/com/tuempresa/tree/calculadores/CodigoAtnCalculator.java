package com.tuempresa.tree.calculadores;

import javax.persistence.*;

import org.openxava.calculators.*;
import org.openxava.jpa.*;

public class CodigoAtnCalculator implements ICalculator {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Object entity; // La instancia de la entidad en ejecución

    @Override
    public Object calculate() throws Exception {
    	
    	System.out.println(entity);
    	
        if (entity == null) return "X0001"; // Evitar errores

        String prefijo = determinarPrefijo(entity);
        int siguienteNumero = obtenerSiguienteNumero(prefijo);
        return prefijo + siguienteNumero;
    }

    private String determinarPrefijo(Object obj) {
        if (obj instanceof com.tuempresa.tree.modelo.Agrupamiento) return "A";
        if (obj instanceof com.tuempresa.tree.modelo.Tramo) return "T";
        if (obj instanceof com.tuempresa.tree.modelo.Nivel) return "N";
        return "X"; // En caso de error
    }

    private int obtenerSiguienteNumero(String prefijo) {
        EntityManager em = XPersistence.getManager();
        String query = "SELECT MAX(CAST(SUBSTRING(c.codigo, 2) AS int)) FROM Atn c WHERE c.codigo LIKE :prefijo";
        Integer maxCodigo = (Integer) em.createQuery(query)
                                        .setParameter("prefijo", prefijo + "%")
                                        .getSingleResult();

        return (maxCodigo == null) ? 1 : maxCodigo + 1;
    }

    // Métodos para recibir la entidad
    public Object getEntity() { return entity; }
    public void setEntity(Object entity) { this.entity = entity; }
}