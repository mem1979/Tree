package com.tuempresa.tree.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity
@Getter @Setter

public class Padre extends Identifiable {
	
	String nombre;
	
	@OneToMany(mappedBy="padre", cascade = CascadeType.REMOVE)
	@Editor(value="TreeView") // 1
	@ListProperties("nombre") // 2
	@OrderBy("treeOrden") // 3
	@Tree(    pathProperty="path",        // 3
			  idProperties="id",            // 4
			  initialExpandedState=true,  // 5
			  pathSeparator="/"           // 7
			)
	private Collection<Hijos> tree;
}
