package H4;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Lucy", Breed.BRITTANY, 4));
		dogs.add(new Dog("Sirko", Breed.CHOW_CHOW, 2));
		dogs.add(new Dog("Wonderdog", Breed.BULLDOG, 7));
		assertTrue(Dog.compareName(dogs));
		
	}

	@Test
	public final void testOldestDog() {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Lucy", Breed.BRITTANY, 4));
		dogs.add(new Dog("Sirko", Breed.CHOW_CHOW, 2));
		dogs.add(new Dog("Wonderdog", Breed.BULLDOG, 7));
		assertEquals(dogs.get(2).getAge(), 7);
		
	}

}
