import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CW1Week12 {
    
    // Exercise 12.1
    public static int maxStretch(List<Integer> list) {
	if (list.size() == 0) {
            return 0;
        } else {
            int i, j;
            List<Integer> lenList = new ArrayList<Integer>();
            for (i = 0; i < list.size(); i++) {
                for (j = list.size() - 1; j > i; j--) {
                    if (list.get(i) == list.get(j)) {
                        lenList.add(j - i + 1);
                        break;
                    }
                }
            }
            int maxLen = 0;
            for (i = 0; i < lenList.size(); i++) {
                if (maxLen < lenList.get(i)) {
                    maxLen = lenList.get(i);
                }
            }
            if (maxLen == 0) {
                return 1;
            } else {
                return maxLen;
            }
        }	
    }
    
    
    // CW1 12.1
    public static boolean isPartitionable(List<Integer> list) {
	int i, j, leftSum = 0, rightSum = 0;
        for (i = 0; i < list.size(); i++){
            leftSum += list.get(i);
            for (j = list.size() - 1; j > i; j--){
                rightSum += list.get(j);
            }
            if (leftSum == rightSum) {
                return true;
            }  
            rightSum = 0;
        }	
	return false;	
    }

    
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(8, 5, 1, 2, 5, 3, 4, 5, 10);
        System.out.println(maxStretch(list1));                // 7

        List<Integer> list2 = Arrays.asList(2, 7, 1, 2, 3, 7);
        System.out.println(maxStretch(list2));                // 5
   
        List<Integer> list_1 = Arrays.asList(1, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_1));          // true

        List<Integer> list_2 = Arrays.asList(2, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_2));          // false
        
        // add your own test case here:
        
        
        
        
        
    }
    
}
