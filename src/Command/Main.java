package Command;

public class Main {

    public static void main(String[] args) {
        Screen screen = new Screen();
        Command scrUp = new ScreenUpCommand(screen);
        Command scrDown = new ScreenDownCommand(screen);
        WallButton btn1 = new WallButton(scrUp);
        WallButton btn2 = new WallButton(scrDown);

        btn2.push();
        btn1.push();
    }

}
