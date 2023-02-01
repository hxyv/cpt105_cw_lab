/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_12;
import java.util.*;
/**
 *
 * @author xingyu hu
 */
public class maxStretch {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList();
        System.out.println(maxStretch(list1));
    }
    
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
}
