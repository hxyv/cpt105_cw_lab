/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet2033924;

/**
 *
 * @author xingyu hu
 */
public class CRC16 {
    // Return a 2 bytes CRC code from a byte array.
    private static String getCRC(byte[] bytes) {
        int CRC = 0X0000FFFF;
        final int POLYNOMIAL = 0x0000A001;
        int i,j;
        for(i = 0; i < bytes.length; i++){
            CRC = CRC ^ ((int) (bytes[i] & 0x000000ff));
            for (j = 0; j < 8; j++) {
                if ((CRC & 0X00000001) != 0) {
                    CRC = CRC >> 1;
                    CRC = CRC ^ POLYNOMIAL;
                } else {
                    CRC = CRC >> 1;
                }
            }
        }
        String result = Integer.toHexString(CRC).toUpperCase();
        if (result.length() != 4) {
            StringBuffer sb = new StringBuffer("0000");
            result = sb.replace(4 - result.length(), 4, result).toString();
        }
        return result.substring(2,4) + result.substring(0,2);
    }
    
    // Return a 2 bytes CRC code from an input string.
    public static String getCRC(String hexData) {
        int CRC = 0X0000FFFF;
        final int POLYNOMIAL = 0x0000A001;
        int i,j;
        for(i = 0; i < hexData.length(); i++){
            CRC = CRC ^ ((int) (hexData.charAt(i) & 0x000000ff));
            for (j = 0; j < 8; j++) {
                if ((CRC & 0x00000001) != 0) {
                    CRC = CRC >> 1;
                    CRC = CRC ^ POLYNOMIAL;
                } else {
                    CRC = CRC >> 1;
                }
            }
        }
        String result = Integer.toHexString(CRC).toUpperCase();
        if (result.length() != 4) {
            StringBuffer sb = new StringBuffer("0000");
            result = sb.replace(4 - result.length(), 4, result).toString();
        }
        return result.substring(2,4) + result.substring(0,2);
    }
}
