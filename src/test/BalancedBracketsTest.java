package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Assert that bracket in the correct order, "[]", return true.
    @Test
    public void onlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Assert that an empty string has balanced brackets.
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //Assert the string may contain non-bracket characters as well.
    @Test
    public void stringContainsOtherCharsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //Assert that the string can contain balanced brackets within the string.
    @Test
    public void stringContainsBracketsWithinString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    //Assert that the string can contain balanced brackets at the beginning of the string.
    @Test
    public void containsBracketsAtBeginningOfString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //Assert that the string cna contain balanced brackets at the end of the string.
    @Test
    public void containsBracketsAtEndOfString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    //Assert that a string more than one pair of balanced brackets returns true.
    @Test
    public void containsMoreThanOnePairOfBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode][]"));
    }

    //Assert false a string containing only one bracket is balanced.
    @Test
    public void stringContainsOneOpeningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //Assert false a string containing only one closing bracket is balanced.
    @Test
    public void stringContainsOneClosingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    //Assert false that one bracket is balanced.
    @Test
    public void oneBracketIsNotBalanced(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //Assert false a string with an odd number of brackets has balanced brackets.
    @Test
    public void stringContainsOddNumberOfBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
    }

    //Assert false that out of order brackets are balanced.
    @Test
    public void outOfOrderBracketPair(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //Assert false that out of order brackets within a string of characters are balanced.
    @Test
    public void stringContainsOutOfOrderBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void stringWithNoBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Dog Cat"));
    }
}
