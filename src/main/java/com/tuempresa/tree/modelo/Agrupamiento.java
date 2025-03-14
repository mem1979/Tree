package com.tuempresa.tree.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
@DiscriminatorValue("AGRUPAMIENTO")

public class Agrupamiento extends Atn {
    // No requiere propiedades adicionales
}