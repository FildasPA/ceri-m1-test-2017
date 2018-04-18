package fr.univavignon.rodeo.api;

import java.util.List;

public class Environment implements IEnvironment {

	private String name;
	private int areas;
	private List<ISpecie> species;

	public Environment(final String name, final int areas, final List<ISpecie> species) {
		this.name = name;
		this.areas = areas;
		this.species = species;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAreas() {
		return areas;
	}

	@Override
	public List<ISpecie> getSpecies() {
		return species;
	}

}
