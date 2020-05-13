package UI;

import javax.swing.*;

public class Panel extends JFrame{
    int width;
    int height;
    String title;

    public Panel(int width, int height, String title){
        this.width = width;
        this.height = height;
        this.title = title;
    }

    public void generateMainPanel(){
        JFrame newPanel = new JFrame(this.title);
        newPanel.setDefaultCloseOperation(EXIT_ON_CLOSE);
        newPanel.setSize(this.width, this.height);
        newPanel.setLocationRelativeTo(null);
        newPanel.setResizable(false);
        newPanel.setVisible(true);
    }
}
