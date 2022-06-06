import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Solution {
    public static int romanToInt(String s) {
        
        //Initialize HashMap for roman numeral values
        Map<Character, Integer> romanNumerals = new HashMap<>();
        
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        
        //Initialize result value
        int result;
        result = 0;
        
        //Iterate through each roman numeral contained in s
        for (int i = 0; i < s.length(); i++){
            if (i < s.length() && (romanNumerals.get(s.charAt(i)) < romanNumerals.get(s.charAt(i)))){
                result -= romanNumerals.get(s.charAt(i));
            } else {
                result += romanNumerals.get(s.charAt(i));
            }
        }
        
        return result;
        
    }

public static void main(String[] args) {
    
    System.out.println("Enter a Roman numeral: ");
    String romanNumeral = new java.util.Scanner(System.in).nextLine();

    romanToInt(romanNumeral);

    System.out.println(romanToInt(romanNumeral));
} 
}
    