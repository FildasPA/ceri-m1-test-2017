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
public class ISpecieTest {

	private ISpecie specie;
	private static List<IAnimal> animals;

	protected ISpecie getTestInstance() {
		ISpecie specie = mock(ISpecie.class);

		when(specie.getArea()).thenReturn(50);

		animals = new ArrayList<IAnimal>();
		animals.add(new IAnimalTest().getTestInstance());
		animals.add(new IAnimalTest().getTestInstance());

		when(specie.getAnimals()).thenReturn(animals);

		return specie;
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

