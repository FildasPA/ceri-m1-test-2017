package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.*;

public class IEnvironmentTest {

	private IEnvironment environment;

	private static List<ISpecie> species = Arrays.asList(new ISpecieTest().getTestInstance(),
			new ISpecieTest().getTestInstance());

	protected IEnvironment getTestInstance() {
		IEnvironment mock = Mockito.mock(IEnvironment.class);

		Mockito.when(mock.getAreas()).thenReturn(5);
		Mockito.when(mock.getSpecies()).thenReturn(species);

		return mock;
	}

	@Before
	public void setUp() {
		environment = getTestInstance();
	}

	@Test
	public void testGetAreas() {
		assertEquals(environment.getAreas(), 5);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(environment.getSpecies().equals(species), true);
	}
}

