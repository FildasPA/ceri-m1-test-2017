package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import fr.univavignon.rodeo.api.*;

@RunWith(MockitoJUnitRunner.class)
public class IGameStateTest {

	private IGameState gameState;
	
	private static ISpecie specie = new ISpecieTest().getTestInstance();
	private static IAnimal animal = new IAnimalTest().getTestInstance();

	protected IGameState getTestInstance() {
		IGameState igameState = mock(IGameState.class);
		
		when(igameState.getProgression()).thenReturn(50);
		when(igameState.getSpecieLevel(specie)).thenReturn(SpecieLevel.NOVICE);
		doThrow(IllegalStateException.class).when(igameState).exploreArea();
		doThrow(IllegalArgumentException.class).when(igameState).catchAnimal(null);
		doThrow(IllegalStateException.class).when(igameState).catchAnimal(animal);
		
		return igameState;
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
