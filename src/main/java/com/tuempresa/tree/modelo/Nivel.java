package com.tuempresa.tree.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@DiscriminatorValue("NIVEL")
public class Nivel extends Atn {

    @ManyToOne
    @DescriptionsList
    private Tramo tramo;
}