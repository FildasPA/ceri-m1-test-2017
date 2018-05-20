package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;
import java.util.Map;

public class GameState implements IGameState {

	private String name;

	private Map<ISpecie, SpecieLevel> levelBySpecie;
	private Map<ISpecie, Integer> xpBySpecies;

	private String currentEnvironment;
	private int currentArea;

	private IEnvironmentProvider environmentProvider;

	public GameState(final String name) {
		this.name = name;
		environmentProvider = new EnvironmentProvider();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void exploreArea() throws IllegalStateException {
		currentArea++;
		if (currentArea > environmentProvider.getEnvironment(currentEnvironment).getAreas()) {
			// Déterminer l'environnement suivant
			currentArea = 0;
		}
	}

	@Override
	public void catchAnimal(IAnimal animal) throws IllegalArgumentException,
		IllegalStateException {

	}

	@Override
	public SpecieLevel getSpecieLevel(ISpecie specie)
	throws IllegalArgumentException {
		return null;
	}

	@Override
	public int getProgression() {
		//int numberOfEnvironments = environmentProvider.getAvailableEnvironments().size();
		//int progression = floor(currentEnvironment/numberOfEnvironments);
		return 50;
	}

}
