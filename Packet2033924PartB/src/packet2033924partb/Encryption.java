/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet2033924partb;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 *
 * @author xingyu hu
 */
public class Encryption {
    private static String sKey="xingyu.hu20@student.xjtlu.edu.cn"; // encryption key
    // create a secret key
    private static SecretKey makeKeyFactory() throws Exception{
         SecretKeyFactory des = SecretKeyFactory.getInstance("DES");// DES algorithm
         SecretKey secretKey = des.generateSecret(new DESKeySpec(sKey.getBytes()));
         return secretKey;
    }
    //get an encrypted string using DES algorithm
    public static String encrypt(String text) throws Exception{
            Cipher cipher = Cipher.getInstance("DES");
            SecretKey secretKey = makeKeyFactory();
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return new String(Base64.getEncoder().encode(cipher.doFinal(text.getBytes())));    
    }
    // retrive a normal string from an encrypted string
    public static String decrypt(String text) throws Exception{
            Cipher cipher = Cipher.getInstance("DES");
            SecretKey secretKey = makeKeyFactory();
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(text.getBytes())));
    }    
}
