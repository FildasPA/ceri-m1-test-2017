package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.*;

public class IGameStateProviderTest {

	private IGameStateProvider gameStateProvider;

	private static IGameState gameState = new IGameStateTest().getTestInstance();

	protected IGameStateProvider getTestInstance() {
		IGameStateProvider mock = Mockito.mock(IGameStateProvider.class);

		Mockito.when(mock.get("state")).thenReturn(gameState);
		Mockito.doThrow(IllegalArgumentException.class).when(mock).get(null);

		return mock;
	}

	@Before
	public void setUp() {
		gameStateProvider = getTestInstance();
	}

	@Test
	public void testGet() {
		assertEquals(gameStateProvider.get("state"), gameState);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetNull() {
		gameStateProvider.get(null);
	}
}

