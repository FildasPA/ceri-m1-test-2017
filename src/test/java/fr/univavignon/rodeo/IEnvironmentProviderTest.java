package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.*;

public class IEnvironmentProviderTest {

	private IEnvironmentProvider environmentProvider;

	private static List<String> environments = Arrays.asList("e1", "e2");
	private static IEnvironment environment = new IEnvironmentTest().getTestInstance();

	protected IEnvironmentProvider getTestInstance() {
		IEnvironmentProvider mock = Mockito.mock(IEnvironmentProvider.class);

		Mockito.when(mock.getAvailableEnvironments()).thenReturn(environments);
		Mockito.when(mock.getEnvironment("e1")).thenReturn(environment);

		return mock;
	}

	@Before
	public void setUp() {
		environmentProvider = getTestInstance();
	}

	@Test
	public void testGetAvailableEnvironments() {
		assertEquals(environmentProvider.getAvailableEnvironments(), environments);
	}

	@Test
	public void testGetEnvironment() {
		assertEquals(environmentProvider.getEnvironment("e1"), environment);
	}
}

