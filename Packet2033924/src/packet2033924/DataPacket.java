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
public class DataPacket {
    // Convert a common string into a hexadecimal string.
    public static String stringToHex(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++){
            int single = (int) str.charAt(i);
            String single16 = Integer.toHexString(single);
            output += single16;
        }
        return output;
    }
    
    // Encapuslate a string into data packet and return a hexdecimal string.
    public static String convertToDataPacket(String data) {
        // Data length
        String dataLen = Integer.toString(data.length());
        if (data.length() < 10){
            dataLen = "0" + dataLen;
        }
        // Data segment
        String dataSeg = stringToHex(data);
        // CRC
        String dataCRC = CRC16.getCRC(data);
        return "AA" + dataLen + dataSeg + dataCRC + "BB";
    }
    
    /*
    Retrieve string data from a hexadecimal string of a data packet.
    Should check the validation of the header and tail of the packet, the length
    of the data and the CRC code.
    */
    public static String getDataFromDataPacket(String hexData) throws DataPacketException{
        // Check header
        if (!hexData.startsWith("AA")) {
            throw (new DataPacketException(1, "Header Error"));
        }
        // Check tail
        if (!hexData.endsWith("BB")){
            throw (new DataPacketException(2, "Tail Erro"));
        }
        // Retrievee string data from a hexadecimal string of a data packet
        // from "getStringData" method
        String strData = getStringData(hexData.substring(4, hexData.length() - 6)); 
        // Check data length
        int dataLen = Integer.parseInt(hexData.substring(2, 4));
        if (strData.length() != dataLen) {
            throw (new DataPacketException(3, "Length Error"));
        }
        // Check CRC code
        String hexCRC = hexData.substring(hexData.length() - 6, hexData.length() - 2);
        if (!CRC16.getCRC(strData).equals(hexCRC)) {
            throw (new DataPacketException(4, "CRC Error"));
        }
        return strData;
    }
    
    // Retrievee string data from a hexadecimal string of a data packet
    public static String getStringData(String data) {
        byte[] baKeyword = new byte[data.length() / 2];
        for (int i = 0; i < baKeyword.length; i++) {
            try {
                baKeyword[i] = (byte) (0xff & Integer.parseInt(data.substring(i * 2, i * 2 + 2), 16));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            data = new String(baKeyword, "utf-8");//UTF-16 le:Not
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return data;
    }
}
