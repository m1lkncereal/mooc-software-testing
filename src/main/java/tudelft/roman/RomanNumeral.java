package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }





/*
    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
*/
    public int convert(String s) {
        int i=0;
        int result=0;
        int repeat=1;
        for (i=0; i<s.length(); i++) {
            //get current val
            int val = map.get(s.charAt(i));
            int next=0;
            if((i+1) != s.length())
                next = map.get(s.charAt(i+1));
//            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0;

            if(val==next) {
                repeat++;
                if (repeat==4)
                    return -1;
            } else
                repeat=1;

            if(val<next) {
                result-=val;
            }
            else
                result+=val;



        }
        return result;
    }












/*
    public int convert(String s) {

        int convertedNumber = 0;
        for(int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0;

            if(currentNumber >= next)
                convertedNumber += currentNumber;
            else
                convertedNumber -= currentNumber;
        }

        return convertedNumber;

    }
*/
}
