package fr.univavignon.rodeo.implementation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import fr.univavignon.rodeo.api.*;

public class GameStateProvider implements IGameStateProvider {

	private final String SAVE_FOLDER = "saves/";
	
	private IGameState gameState;

	@Override
	public void save(IGameState gameState) {
		if (gameState == null) {
			return; // error
		}
		PrintWriter writer;
		try {
			String filepath = SAVE_FOLDER + gameState.getName();
			writer = new PrintWriter(filepath, "UTF-8");
			writer.println(gameState.toString());
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public IGameState get(String name) throws IllegalArgumentException {
		if (name == null) {
			throw new IllegalArgumentException("");
		}
		
		BufferedReader br;
		try {
			String filepath = SAVE_FOLDER + name;
			br = new BufferedReader(new FileReader(filepath));

			
		    int progression = Integer.parseInt(br.readLine());
		    int availableEnvironment = Integer.parseInt(br.readLine());

		    br.close();
		} catch(Exception e) {
			System.out.println("Le fichier de sauvegarde n'existe pas ou est peut-être corrompu (bzzzt)");
			e.printStackTrace();
		}
		// Lire le fichier

		return gameState;
	}

}
