package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.*;
import java.util.Map;

public class GameState extends NamedObject implements IGameState {

	private Map<ISpecie, SpecieLevel> levelBySpecie;
	private Map<ISpecie, Integer> xpBySpecies;

	private IEnvironment currentEnvironment;
	private int currentArea;

	private IEnvironmentProvider environmentProvider;

	public GameState(final String name) {
		super(name);
		environmentProvider = new EnvironmentProvider();
	}

	@Override
	public void exploreArea() throws IllegalStateException {

		currentArea++;

		if (currentArea > currentEnvironment.getAreas()) {
			// Passer à l'environnement suivant, s'il existe
			int i = environmentProvider.getAvailableEnvironments().indexOf(currentEnvironment);
			if (i < environmentProvider.getAvailableEnvironments().size()) {
				// TODO : Déterminer l'environnement suivant
				String newEnvironmentName = environmentProvider.getAvailableEnvironments().get(i + 1);
				currentEnvironment = environmentProvider.getEnvironment(newEnvironmentName);
				currentArea = 0;
			}
			
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
