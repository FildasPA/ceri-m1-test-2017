package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.*;

public class ISpecieTest {

	private ISpecie specie;
	private static List<IAnimal> animals = Arrays.asList(new IAnimalTest().getTestInstance(),
			new IAnimalTest().getTestInstance());

	protected ISpecie getTestInstance() {
		ISpecie mock = Mockito.mock(ISpecie.class);

		Mockito.when(mock.getArea()).thenReturn(50);
		Mockito.when(mock.getAnimals()).thenReturn(animals);

		return mock;
	}

	@Before
	public void setUp() {
		specie = getTestInstance();
	}

	@Test
	public void testGetArea() {
		assertEquals(specie.getArea(), 50);
	}

	@Test
	public void testGetAnimals() {
		assertEquals(specie.getAnimals().equals(animals), true);
	}
}

