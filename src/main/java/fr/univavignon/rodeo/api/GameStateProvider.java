package fr.univavignon.rodeo.api;

public class GameStateProvider implements IGameStateProvider {

	private IGameState gameState;

	@Override
	public void save(IGameState gameState) {
		// Sauvegarder le game state dans un fichier
	}

	@Override
	public IGameState get(String name) throws IllegalArgumentException {
		if (name == null)
			throw new IllegalArgumentException("");

		// Lire le fichier

		return gameState;
	}

}
