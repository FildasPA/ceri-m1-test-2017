package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;
import java.util.List;

public class Environment extends NamedObject implements IEnvironment {

	private int areas;
	private List<ISpecie> species;

	public Environment(final String name, final int areas, final List<ISpecie> species) {
		super(name);
		this.areas = areas;
		this.species = species;
	}

	@Override
	public int getAreas() {
		return areas;
	}

	@Override
	public List<ISpecie> getSpecies() {
		return species;
	}

	public boolean equals(Object o) {
		IEnvironment e = (IEnvironment) o;

		return this.getName() == e.getName() &&
		       this.getAreas() == e.getAreas() &&
		       this.getSpecies() == e.getSpecies();
	}
}
