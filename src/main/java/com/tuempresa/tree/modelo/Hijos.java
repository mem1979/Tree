package com.tuempresa.tree.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.tuempresa.tree.calculadores.*;

import lombok.*;

@Tab(properties = " padre.id, id, path, treeOrden, nombre")
@Entity
@Getter @Setter
public class Hijos {
	
    @Id
    @DefaultValueCalculator(value = HijosIdCalculator.class, 
        properties = @PropertyValue(name = "estructura", from = "estructura"))
    private String id;
	
	@ManyToOne
	private Padre padre;
	
	@Required
	@Enumerated(EnumType.STRING)
	private Estructura estructura;

	private String nombre;
	
	private String path;
	
	private Integer treeOrden;
}
