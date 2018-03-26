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
public class IEnvironmentProvider {

	private static List<String> environments = Arrays.asList("e1", "e2");

	protected IEnvironmentProvider getTestInstance() {
		IEnvironmentProvider environmentProvider = mock(IEnvironmentProvider.class);

		when(environmentProvider.getEnvironments()).thenReturn(environments);
		when(environmentProvider.getEnvironment("e1")).thenReturn(species);

		return environmentProvider;
	}

	@Test
	public void testGetAvailableEnvironments() {
		final IEnvironmentProvider environment = getTestInstance();
		assertEquals(environment.getAreas(), 5);
	}

	@Test
	public void testGetEnvironment(String s) {
		final IEnvironmentProvider environment = getTestInstance();
		assertEquals(environment.getSpecies().equals("e1"), true);
	}
}

