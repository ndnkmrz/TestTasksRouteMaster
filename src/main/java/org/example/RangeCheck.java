package org.example;
import java.util.Arrays;

public class RangeCheck {

    private String range;
    private int x;

    public int getX() {
        return x;
    }

    public String getRange() {
        return range;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public RangeCheck(String range, int x) {
        this.range = range;
        this.x = x;
    }

    public boolean checkNumberInRange(){
        if(range.contains("to")){
            int[] array_range = Arrays.stream(range.split(" to ")).mapToInt(Integer::parseInt).toArray();
            return array_range[0] <= x && x <= array_range[1];
        }
        else {
            int eq_range = Integer.parseInt(range);
            return x == eq_range;
        }
    }
}
