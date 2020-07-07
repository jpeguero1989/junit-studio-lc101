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

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsInMidleReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }

    @Test
    public void stringWithNoBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch"));
    }

    @Test
    public void bracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello]"));
    }

    @Test
    public void bracketsAtFirstWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]hello"));
    }

    @Test
    public void bracketsAtEndWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("hello[]"));
    }

    @Test
    public void oneBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneBracketsWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]bnb"));
    }

    @Test
    public void misplacedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void misplacedBracketsAtEndWithStringReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]["));
    }

    @Test
    public void misplacedBracketsAtFirstWithStringReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][LaunchCode"));
    }


}
