package Facade;

public class HardDrive {

    public byte[] read(long lba, int size) {

        byte data = 3;

        byte[] b = new byte[size];

        b[data] = (byte) (size + lba);

        return b;
    }
}
