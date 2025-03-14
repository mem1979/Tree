package com.tuempresa.tree.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.tuempresa.tree.calculadores.*;

import lombok.*;

@Entity
@Getter @Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "AGRUPAMIENTO_TRAMO_NIVEL", discriminatorType = DiscriminatorType.STRING)
public abstract class Atn {

    @Id
    @Column(length = 10)
    @DefaultValueCalculator(
            value = CodigoAtnCalculator.class,
            properties = @PropertyValue(name = "entity", from = "this") // Pasa la entidad completa
        )
    private String codigo;

    @Column(length = 10)
    @DefaultValueCalculator(
        value = PathAtnCalculator.class,
        properties = {
            @PropertyValue(name = "agrupamientoCodigo", from = "agrupamiento.codigo"),
            @PropertyValue(name = "tramoCodigo", from = "tramo.codigo")
        }
    )
    private String path;
    
    @Column(length = 150)
    private String nombre;

    @Column(length = 150)
    private String descripcion;
}