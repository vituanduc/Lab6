import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	
	private GradeBook grade1, grade2;

	@BeforeEach
	void setUp() throws Exception {
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(4);
		
		grade1.addScore(10);
		grade1.addScore(20);
		grade1.addScore(25);
		grade1.addScore(30);
		grade1.addScore(49);
		
		grade2.addScore(25);
		grade2.addScore(35);
		grade2.addScore(60);
		grade2.addScore(18);
	}

	@AfterEach
	void tearDown() throws Exception {
		grade1= null;
		grade2= null;
				
	}

	@Test
	void testAddScore() {
		assertTrue (grade1.toString().equals("10.0 20.0 25.0 30.0 49.0 ")); 
		assertTrue (grade2.toString().equals("25.0 35.0 60.0 18.0 ")); 
		
		assertEquals(5,grade1.getScoreSize());
		assertEquals(4,grade2.getScoreSize());

	}

	@Test
	void testSum() {
		assertEquals(134.0,grade1.sum());
		assertEquals(138.0,grade2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(10.0,grade1.minimum());
		assertEquals(18.0,grade2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(124.0,grade1.finalScore());
		assertEquals(120.0,grade2.finalScore());
	}

}
