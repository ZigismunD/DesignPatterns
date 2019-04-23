package Builder;

public class Main {


    public static void main(String[] args) {
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
    }
}
