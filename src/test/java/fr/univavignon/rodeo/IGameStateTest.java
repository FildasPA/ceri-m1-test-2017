package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.*;

public class IGameStateTest {

	private IGameState gameState;

	private static ISpecie specie = new ISpecieTest().getTestInstance();
	private static IAnimal animal = new IAnimalTest().getTestInstance();

	protected IGameState getTestInstance() {
		IGameState mock = Mockito.mock(IGameState.class);

		Mockito.when(mock.getProgression()).thenReturn(50);
		Mockito.when(mock.getSpecieLevel(specie)).thenReturn(SpecieLevel.NOVICE);
		Mockito.doThrow(IllegalStateException.class).when(mock).exploreArea();
		Mockito.doThrow(IllegalArgumentException.class).when(mock).catchAnimal(null);
		Mockito.doThrow(IllegalStateException.class).when(mock).catchAnimal(animal);

		return mock;
	}

	@Before
	public void setUp() {
		gameState = getTestInstance();
	}

	@Test
	public void testGetProgression() {
		assertEquals(gameState.getProgression(), 50);
	}

	@Test
	public void testGetSpecieLevel() {
		assertEquals(gameState.getSpecieLevel(specie), SpecieLevel.NOVICE);
	}

	@Test(expected = IllegalStateException.class)
	public void testExploreArea() {
		gameState.exploreArea();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCatchAnimalNull() {
		gameState.catchAnimal(null);
	}

	@Test(expected = IllegalStateException.class)
	public void testCatchAnimal() {
		gameState.catchAnimal(animal);
	}
}
