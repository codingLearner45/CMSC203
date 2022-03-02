/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: (JUnit Lab 5).
 * Programming multiple classes testing them.
 * Due: 3/4/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the lab assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sachin Pathak.
*/
import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	GradeBook gradeOne;
	GradeBook gradeTwo;
	@Before
	public void setUp() throws Exception {
		gradeOne = new GradeBook(5);
		gradeTwo = new GradeBook(5);
		gradeOne.addScore(90);
		gradeOne.addScore(85);
		gradeTwo.addScore(95);
		gradeTwo.addScore(80);
	}
	
	@Test
    //tests to see if scores were properly added to the gradeBook class
	public void testAddScore() {
		
		assertTrue(gradeOne.toString().equals("90.0 85.0 0.0 0.0 0.0 "));
		
	}

	@After
	//changes the values of the gradeBook variables to null
	public void tearDown() throws Exception {
		gradeOne = null;
		gradeTwo = null;
	}

	

	@Test
	//tests to see if the value of the scores were properly added together
	public void testSum() {
		
		assertEquals(gradeOne.sum(), 175.0, 0.1);
	}

	@Test
	//tests to see if the smallest value was added
	public void testMinimum() {
		
		assertEquals(gradeOne.minimum(), 85.0, 0.1);
	}

	@Test
	//tests to see if the highest scores were added
	public void testFinalScore() {
		
		assertEquals(gradeOne.finalScore(), 90.0, 0.1);
	}

	@Test
	public void testGetScoreSize() {
		assertEquals(gradeOne.getScoreSize(), 2);
		
	}

}
