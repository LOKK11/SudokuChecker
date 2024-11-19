import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// Correct string
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
// Non integer value in the string
String nonInteger = "417369825632158947958724316825437169791586432346912a58289643571573291684164875293";
// Negative integer value in the string
String negativeInteger = "417369825632-158947958724316825437169791586432346912758289643571573291684164875293";
// String is too short
String tooShort = "17369825632158947958724316825437169791586432346912758289643571573291684164875293";
// Same number appears in a sub-grid more than once
String duplicateSubGrid = "417368925632159847958723416825431769791584632346917258289645371573296184164872593";
// Same number appears in a row more than once
String duplicateRow = "417369825632158947958724316825437169791586432346912758289643571573291683164875294";
// Same number appears in a column more than once
String duplicateColumn = "417369825632158947958724316825437169791586432346912758289643571573291684164875239";
// Empty string
String empty = "";
// Null string
String nullString = null;
SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testNonIntegerValue() {
		int a = v.verify(nonInteger);
		assertEquals("incorrect string", a, 1);
	}
	
	@Test
	public void testNegativeIntegerValue() {
		int a = v.verify(negativeInteger);
		assertEquals("incorrect string", a, -1);
	}
	
	@Test
	public void testStringTooShort() {
		int a = v.verify(tooShort);
		assertEquals("incorrect string", a, -1);
	}

	@Test
	public void testDuplicateInSubGrid() {
		int a = v.verify(duplicateSubGrid);
		assertEquals("incorrect string", a, -2);
	}

	@Test
	public void testDuplicateInRow() {
		int a = v.verify(duplicateRow);
		assertEquals("incorrect string", a, -3);
	}

	@Test
	public void testDuplicateInColumn() {
		int a = v.verify(duplicateColumn);
		assertEquals("incorrect string", a, -4);
	}

	@Test
	public void testEmptyString() {
		int a = v.verify(empty);
		assertEquals("incorrect string", a, -1);
	}

	@Test
	public void testNullString() {
		int a = v.verify(nullString);	
		assertEquals("incorrect string", a, -1);
	}
}
