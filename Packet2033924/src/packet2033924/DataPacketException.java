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
class DataPacketException extends Exception {
    private int id;
    private String message;
    
    // Constructor
    public DataPacketException (int id, String message) {
        this.id = id;
        this.message = message;
    }
    
    // Retrieve id from the exception
    public int getId() {
        return id;
    }
    
    // Return a string with the id and message
    public String toString() {
        return "DataPacketException: "
                + "\nException Id = {" + id
                + "}\nException Message = {" + message 
                + "}";
    }
}
