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
public class ISpecieTest {

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

	@Test
	public void testGetArea() {
		final ISpecie specie = getTestInstance();
		assertEquals(specie.getArea(), 50);
	}

	@Test
	public void testGetAnimals() {
		final ISpecie specie = getTestInstance();
		assertEquals(specie.getAnimals().equals(animals), true);
	}
}

