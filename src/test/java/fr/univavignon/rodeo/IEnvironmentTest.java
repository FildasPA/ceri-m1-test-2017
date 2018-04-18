package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import fr.univavignon.rodeo.api.*;

@RunWith(MockitoJUnitRunner.class)
public class IEnvironmentTest {

	private IEnvironment environment;
	private static List<ISpecie> species;

	protected IEnvironment getTestInstance() {
		IEnvironment environment = mock(IEnvironment.class);

		when(environment.getAreas()).thenReturn(5);
		when(environment.getSpecies()).thenReturn(species);

		return environment;
	}

	@Before
	public void setUp() {
		species = new ArrayList<ISpecie>();
		species.add(new ISpecieTest().getTestInstance());
		species.add(new ISpecieTest().getTestInstance());
		
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

