package com.tuempresa.tree.modelo;

public enum Estructura {
	
	AGRUPAMIENTO("A"),
    TRAMO("T"),
    NIVEL("N");

    private final String prefix;

    Estructura(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}

