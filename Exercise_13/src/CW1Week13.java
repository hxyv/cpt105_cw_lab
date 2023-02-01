

public class CW1Week13 {
    
    // Exercise 13.1
    public static int numXY(String input) {

        // base case
	if (!input.contains("XY"))	
            return 0;
        // recursive step
        int counter = 0;
        if (input.substring(0,2).equals("XY"))
            return counter++;
        else 
        return numXY(input.substring(2)) + counter;
    }
    
    
    // Exercise 13.2
    public static String remDup(String input) {

        // base case
		
		
		
        // recursive step
		
	return null;	
		
    }
    
    
    // Exercise 13.3
    public static String sepStar(String input) {

        // base case
		
		
		
        // recursive step
		
		
	return null;	
    }
    
    
    // CW1 13.1 Recursive Smallest Integer
    // Appear in FINAL EXAM 2019
    
    public static int smallest(int[] array) {
        return smallest(array, 0);
    }

    private static int smallest(int[] array, int start) {
        
        // base case
	if (array.length == start + 1) {
            return array[start];
        }
			
        // recursive step
        int num = smallest(array, start + 1);
        
        if(num < array[start]){
            return num;
        } else {
            return array[start];
        }
    }
    
    
    public static void main(String[] args) {
        
        //System.out.println(numXY("AAXYAA"));       // 1
        //System.out.println(numXY("AXYBXYAA"));     // 2
        
       // System.out.println(remDup("hello"));       // helo
        //System.out.println(remDup("abbbcd"));      // abcd
        
       // System.out.println(sepStar("hello"));      // hel*lo
        //System.out.println(sepStar("uuvxxyzzz"));  // u*uvx*xyz*z*z
        
        int[] arr1 = {10,2,1};
        System.out.println(smallest(arr1));        // 5
		
		// add your own test cases :
		
		
		
		
		
    }
    
}
