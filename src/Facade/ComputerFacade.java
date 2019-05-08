package Facade;

public class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;
    private long BOOT_ADDRESS;
    private  long BOOT_SECTOR;
    private int SECTOR_SIZE;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
        this.BOOT_ADDRESS = 4;
        this.BOOT_SECTOR = 12;
        this.SECTOR_SIZE = 10;
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(15);
        processor.execute();

    }
}
