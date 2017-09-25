package com.wugz.app.aop;
import java.security.Key;  
import javax.crypto.Cipher;  
import javax.crypto.KeyGenerator;  
import javax.crypto.SecretKey;  
  
public class DESedeCoderTest {  
    public static void main(String[] args) throws Exception {  
        String sHexPlainText = "120107199302045713";  
        SecretKey skSecretkey=(SecretKey)TDESCoder.generateKey(112);  
        byte[] byteaPlainText = hexStr2ByteArr(sHexPlainText);  
        byte[] byteaCryptograph = TDESCoder.enc(byteaPlainText, skSecretkey);  
        byte[] byteaPlainTextAftDec = TDESCoder.dec(byteaCryptograph, skSecretkey);  
        System.out.println("原明文byte[]长度:"+byteaPlainText.length+"\t相应的16进制字符串值:"+byteArr2HexStr(byteaPlainText));  
        System.out.println("加密后byte[]长度:"+byteaCryptograph.length+"\t相应的16进制字符串值:"+byteArr2HexStr(byteaCryptograph));  
        System.out.println("解密后byte[]长度:"+byteaPlainTextAftDec.length+"\t相应的16进制字符串值:"+byteArr2HexStr(byteaPlainTextAftDec));  
    }  
    public static String byteArr2HexStr(byte[] bytea) throws Exception {  
        String sHex = "";  
        int iUnsigned = 0;  
        StringBuffer sbHex = new StringBuffer();  
        for (int i = 0; i < bytea.length; i++) {  
            iUnsigned = bytea[i];  
            if (iUnsigned < 0) {  
                iUnsigned += 256;  
            }  
            if (iUnsigned < 16) {  
                sbHex.append("0");  
            }  
            sbHex.append(Integer.toString(iUnsigned, 16));  
        }  
        sHex = sbHex.toString();  
        return sHex;  
    }  
  
  
    public static byte[] hexStr2ByteArr(String sHex) throws Exception {  
          
        if(sHex.length()%2!=0){  
            sHex="0"+sHex;  
        }  
        byte[] bytea =bytea=new byte[sHex.length() / 2];  
          
        String sHexSingle = "";  
        for (int i = 0; i < bytea.length; i++) {  
            sHexSingle = sHex.substring(i * 2, i * 2 + 2);  
            bytea[i] = (byte) Integer.parseInt(sHexSingle, 16);  
        }  
        return bytea;  
    }  
       
}  
class TDESCoder {  
    private static final String S_KEY_ALGORITHM = "DESede";  
    private static final String S_CIPHER_ALGORITHM = "DESede/ECB/PKCS5Padding";  
    private static SecretKey skSecretkey;  
    public static byte[] enc(byte[] byteaPlainText,SecretKey skSecretkey) throws Exception {  
        Cipher cipher = Cipher.getInstance(S_CIPHER_ALGORITHM);  
        cipher.init(Cipher.ENCRYPT_MODE, skSecretkey);  
        byte[] byteaCryptograph=cipher.doFinal(byteaPlainText);  
        return byteaCryptograph;  
    }  
      
    public static byte[] dec(byte[] byteaCryptograph,SecretKey skSecretkey) throws Exception {  
        Cipher cCipher = Cipher.getInstance(S_CIPHER_ALGORITHM);  
        cCipher.init(Cipher.DECRYPT_MODE, skSecretkey);  
        byte[] byteaPlainText=cCipher.doFinal(byteaCryptograph);  
        return byteaPlainText;  
    }  
  
    public static Key generateKey(int iBits) throws Exception {  
        iBits=112;  
        KeyGenerator kg = KeyGenerator.getInstance(S_KEY_ALGORITHM);  
        kg.init(iBits);  
        skSecretkey = kg.generateKey();  
        return   skSecretkey;  
    }  
}  