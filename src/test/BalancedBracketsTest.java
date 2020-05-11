package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    //Test #1
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //Test #2
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //Test #3
    @Test
    public void reverseBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    //Test #4
    @Test
    public void unbalancedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }
    //Test #5
    @Test
    public void onlyOpenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[["));
    }
    //Test #6
    @Test
    public void onlyClosedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]]"));
    }
    //Test #7
    @Test
    public void wordButnoBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("test"));
    }
    //Test #8
    @Test
    public void nameInBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Ally]"));
    }
    //Test #9
    @Test
    public void beginningButNoEndBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test"));
    }
    //Test #10
    @Test
    public void endButNoBeginningBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("test]"));
    }
    //Test #11
    @Test
    public void noFinalClosingBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test][test"));
    }
    //Test #12
    @Test
    public void newLineBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[\n]"));
    }


}
