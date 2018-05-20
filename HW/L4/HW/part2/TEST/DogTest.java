import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;1
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import home2.Breed;
import home2.Dog;

class DogTest {
	static Dog[] dogs = new Dog[3];
	public static void main(String[] args) throws IOException {	
	
	dogs[0] = new Dog("Lucy", Breed.BRITTANY, 4);
	}
	
	
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCompareName() {
		
		
	//	
		
		
	}

	@Test
	void testOldestDog() {
		
	}

}
