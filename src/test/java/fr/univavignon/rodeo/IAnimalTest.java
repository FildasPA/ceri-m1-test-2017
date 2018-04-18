package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.*;

public class IAnimalTest {

	private IAnimal animal;

	protected IAnimal getTestInstance() {
		IAnimal mock = Mockito.mock(IAnimal.class);

		Mockito.when(mock.getXP()).thenReturn(50);
		Mockito.when(mock.isSecret()).thenReturn(true);
		Mockito.when(mock.isEndangered()).thenReturn(true);
		Mockito.when(mock.isBoss()).thenReturn(false);

		return mock;
	}

	@Before
	public void setUp() {
		animal = getTestInstance();
	}

	@Test
	public void testGetXP() {
		assertEquals(animal.getXP(), 50);
	}

	@Test
	public void testIsSecret() {
		assertEquals(animal.isSecret(), true);
	}

	@Test
	public void testIsEndangered() {
		assertEquals(animal.isEndangered(), true);
	}

	@Test
	public void testIsBoss() {
		assertEquals(animal.isBoss(), false);
	}
}
