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
public class MultiDataPacket extends DataPacket{
    // Convert an array of common strings to an array of hexadecimal strings
    public String[] stringToHex(String[] str) {
        String[] hex = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            hex[i] = stringToHex(str[i]);
        }
        return hex;
    }
    
    // Convert an array of common strings to a MultiDataPacket with a single
    // hexadecimal string
    public String convertToHexDataPacket(String[] data) {
        String single = "";
        for (int i = 0; i < data.length; i++) {
            single += convertToDataPacket(data[i]) + "#";
        }
        return single;
    }
    
    // Retrieve and return several data from the MultiDataPacket string "hexData"
    // Throws a "DataPacketExcaption" exception when any validation is failed
    public String[] getMultiDataFromHexDataPacket(String hexData) throws DataPacketException{
        String[] sub = hexData.split("#");
        String[] output = new String[sub.length];
        for(int i = 0; i < sub.length; i++){
            output[i] = getDataFromDataPacket(sub[i]);
        }
        return output ;
    }
}
