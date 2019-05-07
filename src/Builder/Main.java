package Builder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


public class Main {

    private static final String key = "aesEncryptionKey";
    private static final String initVector = "encryptionIntVec";
    public static void main(String[] args) {

        String s1 = "";
        String s2 = "Halipatsuippa";




        System.out.println(encrypt(s1));
        System.out.println(encrypt(s2));


        /*
        Director dir = new Director();
        HamburgerBuilder makkibu = new MakkiBuilder();
        HamburgerBuilder hesebu = new HeseBuilder();

        System.out.println("Mäkkäribuilder lista:");
        dir.setHampBuilder(makkibu);
        dir.constructHamburger();
        Object obj = dir.getHamburger();
        System.out.println(obj);

        System.out.println();
        System.out.println("Hesebuilder StringBuilder:");
        dir.setHampBuilder(hesebu);
        dir.constructHamburger();
        obj = dir.getHamburger();

        System.out.println(obj);
    }*/
}

    public static String encrypt(String value) {
        return Base64.getEncoder().encodeToString(value.getBytes());
    }

}