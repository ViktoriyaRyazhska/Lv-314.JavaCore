import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import H4.Breed;
import H4.Dog;

public class testDog {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testCompareName() {
		Dog[] dogs = new Dog[3];
		dogs[0] = new Dog("Lucy", Breed.BRITTANY, 4);
		dogs[1] = new Dog("Sirko", Breed.CHOW_CHOW, 2);
		dogs[2] = new Dog("Wonderdog", Breed.BULLDOG, 7);
		assertTrue(Dog.compareName(dogs));
		
	}

	@Test
	public final void testOldestDog() {
		Dog[] dogs = new Dog[3];
		dogs[0] = new Dog("Lucy", Breed.BRITTANY, 4);
		dogs[1] = new Dog("Sirko", Breed.CHOW_CHOW, 2);
		dogs[2] = new Dog("Wonderdog", Breed.BULLDOG, 7);
		assertEquals(dogs[Dog.oldestDog(dogs)].getAge(), 7);
		
	}

}
