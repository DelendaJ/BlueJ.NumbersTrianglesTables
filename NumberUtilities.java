


public class NumberUtilities {

    public static String getRange(int stop) {
        String ans = ""; 
        for (int i = 0; i < stop; i++) {
            ans += i;
    }
     return ans; } 

    public static String getRange(int start, int stop) {
        String ans = ""; 
        for (int i = 0; start < stop; start++) {
            ans += start;
    }
     return ans; }


    public static String getRange(int start, int stop, int step) {
        String ans = ""; 
        for (int i = 0; start < stop; start+=step) {
            ans += start;
    }
     return ans; }

     
    public static String getEvenNumbers(int start, int stop) {
        String ans = ""; 
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                ans += i;
            
            }
        }
        return ans; 
    }
    
     
    public static String getOddNumbers(int start, int stop) {
         String ans = ""; 
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                ans += i;
            
            }
        }
        return ans; 
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String ans = ""; 
        for (int i = start; i <= stop; i++){
             double ans2 = Math.pow(i, exponent);
             ans += (int)ans2;
        }
        
       
    return ans; 
}
}
