package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;

public class Animal extends NamedObject implements IAnimal {

	private int xp;
	private boolean secret;
	private boolean endangered;
	private boolean boss;

	public Animal(final String name, final int xp, final boolean secret,
	              final boolean endangered, final boolean boss) {
		super(name);
		this.xp = xp;
		this.secret = secret;
		this.endangered = endangered;
		this.boss = boss;
	}

	@Override
	public int getXP() {
		return xp;
	}

	@Override
	public boolean isSecret() {
		return secret;
	}

	@Override
	public boolean isEndangered() {
		return endangered;
	}

	@Override
	public boolean isBoss() {
		return boss;
	}

	public boolean equals(Object o) {
		IAnimal a = (IAnimal) o;

		return this.getName() == a.getName() &&
		       this.getXP() == a.getXP() &&
		       this.isSecret() == a.isSecret() &&
		       this.isEndangered() == a.isEndangered() &&
		       this.isBoss() == a.isBoss();
	}
}
