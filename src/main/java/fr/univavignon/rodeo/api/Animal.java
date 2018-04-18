package fr.univavignon.rodeo.api;

/**
 * Animal implementation.
 *
 * @author jb
 */
public class Animal implements IAnimal {

	private String name;
	private int xp;
	private boolean secret;
	private boolean endangered;
	private boolean boss;

	public Animal(final String name, final int xp, final boolean secret,
	              final boolean endangered, final boolean boss) {
		this.name = name;
		this.xp = xp;
		this.secret = secret;
		this.endangered = endangered;
		this.boss = boss;
	}

	@Override
	public String getName() {
		return name;
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


}
