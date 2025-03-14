package com.tuempresa.tree.calculadores;

import org.openxava.calculators.*;

public class PathAtnCalculator implements ICalculator {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String agrupamientoCodigo;
    private String tramoCodigo;

    @Override
    public Object calculate() throws Exception {
        if (agrupamientoCodigo == null) return ""; // Agrupamiento no tiene path

        if (tramoCodigo == null) { 
            return "/" + agrupamientoCodigo; // Tramo
        }

        return "/" + agrupamientoCodigo + "/" + tramoCodigo; // Nivel
    }

    // Métodos para recibir valores
    public String getAgrupamientoCodigo() { return agrupamientoCodigo; }
    public void setAgrupamientoCodigo(String agrupamientoCodigo) { this.agrupamientoCodigo = agrupamientoCodigo; }

    public String getTramoCodigo() { return tramoCodigo; }
    public void setTramoCodigo(String tramoCodigo) { this.tramoCodigo = tramoCodigo; }
}