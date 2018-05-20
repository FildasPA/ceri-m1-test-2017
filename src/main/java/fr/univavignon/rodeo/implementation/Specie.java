package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;
import java.util.List;

public class Specie extends NamedObject implements ISpecie {

	private int area;
	private List<IAnimal> animals;

	public Specie(final String name, final int area, final List<IAnimal> animals) {
		super(name);
		this.area = area;
		this.animals = animals;
	}

	@Override
	public int getArea() {
		return area;
	}

	@Override
	public List<IAnimal> getAnimals() {
		return animals;
	}

	public boolean equals(Object o) {
		ISpecie s = (ISpecie) o;

		return this.getName() == s.getName() &&
		       this.getArea() == s.getArea() &&
		       this.getAnimals().equals(s.getAnimals());
	}
}
