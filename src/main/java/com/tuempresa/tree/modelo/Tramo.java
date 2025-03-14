package com.tuempresa.tree.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@DiscriminatorValue("TRAMO")
public class Tramo extends Atn {

    @ManyToOne
    @DescriptionsList
    private Agrupamiento agrupamiento;
}