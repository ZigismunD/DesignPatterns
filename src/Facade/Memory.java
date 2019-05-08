package Facade;

import java.util.Arrays;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Ladataan positiosta " + position);

        System.out.println("Positio: " + position + ", data: " + Arrays.toString(data));
    }
}
