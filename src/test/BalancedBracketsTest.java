package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void inversedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlySquareBracketsMatter(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("{]"));
    }

    @Test
    public void textAroundBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("dkok[,.foo]f"));
    }

    @Test
    public void nestingBracketsCorrectlyReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    @Test
    public void nestingBracketsIncorrectlyReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[][]][]]]"));
    }

    @Test
    public void adjacentPairsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }

    @Test
    public void specialWithBalancedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[%$#]^^*&"));
    }

    @Test
    public void noBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void nestingBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    @Test
    public void oneOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneClosingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void textWithNoBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("test text"));
    }

    @Test
    public void balancedBracketsWithNewLineReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[\n]"));
    }
}
