/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xingyu hu
 */
public class Exercise_5_1 {

    public static void main(String[] args) {
        System.out.println(warAndPeace("there was never a gowarpeacepeaceod war, or a bad peacewar"));
    }

    public static boolean warAndPeace(String text) {
        boolean valid = true;

        //check war
        int warCount = 0;
        for (int i = 0; i < text.length() - 2; i++) {
            String check = text.substring(i, i + 3);
            if (check.equals("war")) {
                warCount++;
            }
        }
        //check peace
        int peaceCount = 0;
        for (int i = 0; i < text.length() - 4; i++) {
            String check = text.substring(i, i + 5);
            if (check.equals("peace")) {
                peaceCount++;
            }
        }
        //compare war and peace
        if (warCount != peaceCount) {
            valid = false;
        }

        return valid;
    }

    /*
    public static boolean warAndPeace(String text) {
        boolean valid = true;
        String[] blocks = text.split(" ");

        int warCount = 0;
        int peaceCount = 0;
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].startsWith("peace")) {
                peaceCount++;
            } else if (blocks[i].startsWith("war")) {
                warCount++;
            }
        }

        if (peaceCount != warCount) {
            valid = false;
        }

        return valid;
    }
     */
}
