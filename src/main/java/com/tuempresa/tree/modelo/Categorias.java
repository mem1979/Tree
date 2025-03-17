package com.tuempresa.tree.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.tuempresa.tree.calculadores.*;

public class Categorias {
	
	@Id
    @Column(length = 10)
    @DefaultValueCalculator(value = CodigoAtnCalculator.class)
    private String codigo;

    @Column(length = 10)
    @DefaultValueCalculator(
        value = PathAtnCalculator.class,
        properties = {@PropertyValue(name = "agrupamientoCodigo", from = "agrupamiento.codigo"),
			          @PropertyValue(name = "tramoCodigo", from = "tramo.codigo")})
    private String path;
    
    @Column(length = 150)
    private String nombre;

    @Column(length = 150)
    private String descripcion;
}


