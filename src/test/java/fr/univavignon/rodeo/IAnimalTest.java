package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import fr.univavignon.rodeo.api.IAnimal;

@RunWith(MockitoJUnitRunner.class)
public class IAnimalTest {

	protected IAnimal getTestInstance() {
		IAnimal ianimal = mock(IAnimal.class);

        when(ianimal.getXP()).thenReturn(50);
        when(ianimal.isSecret()).thenReturn(true);
        when(ianimal.isEndangered()).thenReturn(true);
        when(ianimal.isBoss()).thenReturn(false);

        return ianimal;
    }

	@Test
	public void testGetXP() {
		final IAnimal animal = getTestInstance();
		assertEquals(animal.getXP(), 50);
	}

	@Test
	public void testIsSecret() {
		final IAnimal animal = getTestInstance();
		assertEquals(animal.isSecret(), true);
	}

	@Test
	public void testIsEndangered() {
		final IAnimal animal = getTestInstance();
		assertEquals(animal.isEndangered(), true);
	}

	@Test
	public void testIsBoss() {
		final IAnimal animal = getTestInstance();
		assertEquals(animal.isBoss(), false);
	}
}
