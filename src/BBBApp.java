import UI.*;
import UI.Panel;
import java.awt.*;

public class BBBApp {
    public static void main(String[] args){
        setupScreen();
    }

    private static void setupScreen(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final double screenHeight = screenSize.getHeight();
        final double screenWidth = screenSize.getWidth();

        int height = (int)(screenHeight * 0.6);
        int width = (int)(screenWidth * 0.7);

        Panel mainWindow = new Panel(width, height, "BBB Firework Timing Application", CloseStatus.EXIT_ON_CLOSE);
        mainWindow.generatePanel();
    }
}
