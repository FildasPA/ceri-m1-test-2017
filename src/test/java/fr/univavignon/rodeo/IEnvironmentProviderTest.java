package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import fr.univavignon.rodeo.api.*;

@RunWith(MockitoJUnitRunner.class)
public class IEnvironmentProviderTest {

	private IEnvironmentProvider environmentProvider;
	private static List<String> environments = Arrays.asList("e1", "e2");
	private static IEnvironment environment = new IEnvironmentTest().getTestInstance();

	protected IEnvironmentProvider getTestInstance() {
		IEnvironmentProvider environmentProvider = mock(IEnvironmentProvider.class);

		when(environmentProvider.getAvailableEnvironments()).thenReturn(environments);
		when(environmentProvider.getEnvironment("e1")).thenReturn(environment);

		return environmentProvider;
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

