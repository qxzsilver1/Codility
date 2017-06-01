// you can also use imports, for example:
// import java.util.*;
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String s = Integer.toBinaryString(N);
        s = s.replace("0", " ").trim();
        
        String[] zeroGrouping = s.split("1");
        
        if (zeroGrouping.length == 0) return 0;
        
        int[] gaps = new int[zeroGrouping.length];
        
        for (int i = 0; i < gaps.length; i++)
            gaps[i] = zeroGrouping[i].length();
            
        
        Arrays.sort(gaps);
        return gaps[gaps.length-1];
    }
}
