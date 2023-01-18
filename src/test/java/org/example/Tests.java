package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {

    @Test
    public void checkNumberInRange(){
        RangeCheck rangeCheck1 = new RangeCheck("12 to 13", 12);
        Assertions.assertTrue(rangeCheck1.checkNumberInRange());
        RangeCheck rangeCheck2 = new RangeCheck("12 to 13", 15);
        Assertions.assertFalse(rangeCheck2.checkNumberInRange());
        RangeCheck rangeCheck3 = new RangeCheck("12 to 15", 14);
        Assertions.assertTrue(rangeCheck3.checkNumberInRange());
        RangeCheck rangeCheck4 = new RangeCheck("12 to 14", 11);
        Assertions.assertFalse(rangeCheck4.checkNumberInRange());
        RangeCheck rangeCheck5 = new RangeCheck("12", 12);
        Assertions.assertTrue(rangeCheck5.checkNumberInRange());
        RangeCheck rangeCheck6 = new RangeCheck("12", 15);
        Assertions.assertFalse(rangeCheck6.checkNumberInRange());
    }

    @Test
    public void chooseRightQueue(){
        RightQueue rightQueue1 = new RightQueue("A");
        Assertions.assertEquals(rightQueue1.chooseRightQueue(), "queue0");
        RightQueue rightQueue2 = new RightQueue("a");
        Assertions.assertEquals(rightQueue2.chooseRightQueue(), "defaultQueue");
    }

    @Test
    public void checkMatchPattern(){
        PatternMatch patternMatch1 = new PatternMatch(new String[] {"ABC123", "AB-D3 2-4","32 3C DE", "9-4-5-A-B-C"},
                "AB??2?");
        Assertions.assertArrayEquals(patternMatch1.matchPattern(), new String[] {"ABC123","AB-D3 2-4"});
        PatternMatch patternMatch2 = new PatternMatch(new String[] {"XZY--123", "X Y-DZ 3-4","3X YZ DE", "X-4-Z-X-Y-Z"},
                " XYZ???");
        Assertions.assertArrayEquals(patternMatch2.matchPattern(), new String[] {});
    }
}
