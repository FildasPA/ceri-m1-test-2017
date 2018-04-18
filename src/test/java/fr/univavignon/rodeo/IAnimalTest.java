package fr.univavignon.rodeo;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import fr.univavignon.rodeo.api.IAnimal;

@RunWith(MockitoJUnitRunner.class)
public class IAnimalTest {

	private IAnimal animal;
	
	protected IAnimal getTestInstance() {
		IAnimal ianimal = mock(IAnimal.class);

        when(ianimal.getXP()).thenReturn(50);
        when(ianimal.isSecret()).thenReturn(true);
        when(ianimal.isEndangered()).thenReturn(true);
        when(ianimal.isBoss()).thenReturn(false);

        return ianimal;
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
