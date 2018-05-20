package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;

public class NamedObject implements INamedObject {

	String name;

	public NamedObject(final String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
