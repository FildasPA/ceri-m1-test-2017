package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import fr.univavignon.rodeo.api.*;

@RunWith(MockitoJUnitRunner.class)
public class IGameStateProviderTest {

	private IGameStateProvider gameStateProvider;
	
	private static IGameState gameState = new IGameStateTest().getTestInstance();

	protected IGameStateProvider getTestInstance() {
		IGameStateProvider igameStateProvider = mock(IGameStateProvider.class);
		
		when(igameStateProvider.get("state")).thenReturn(gameState);
		doThrow(IllegalArgumentException.class).when(igameStateProvider).get(null);
		
		return igameStateProvider;
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

