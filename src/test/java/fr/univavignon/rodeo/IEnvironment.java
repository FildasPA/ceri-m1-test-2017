package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import fr.univavignon.rodeo.api.*;

@RunWith(MockitoJUnitRunner.class)
public class IEnvironment {

	private static List<ISpecie> species;

	protected IEnvironment getTestInstance() {
		IEnvironment environment = mock(IEnvironment.class);

		when(environment.getAreas()).thenReturn(5);

		species = new ArrayList<ISpecie>();
		species.add(new ISpecieTest().getTestInstance());
		species.add(new ISpecieTest().getTestInstance());

		when(environment.getSpecies()).thenReturn(species);

		return environment;
	}

	@Test
	public void testGetAreas() {
		final IEnvironment environment = getTestInstance();
		assertEquals(environment.getAreas(), 5);
	}

	@Test
	public void testGetSpecies() {
		final IEnvironment environment = getTestInstance();
		assertEquals(environment.getSpecies().equals(species), true);
	}
}
