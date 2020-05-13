package UI;

import javax.swing.*;

public class Panel extends JFrame {
    int width;
    int height;
    String title;
    JFrame newPanel;
    CloseStatus closeStatus;

    public Panel(int width, int height, String title, CloseStatus status){
        this.width = width;
        this.height = height;
        this.title = title;
        this.closeStatus = status;
        this.newPanel = new JFrame(title);
    }

    public void generatePanel(){
        this.newPanel.setSize(this.width, this.height);
        this.newPanel.setLocationRelativeTo(null);
        this.newPanel.setResizable(false);
        this.newPanel.setVisible(true);
        setCloseStatus(this.closeStatus);
    }

    private void setCloseStatus(CloseStatus status){
        switch (status){
            case EXIT_ON_CLOSE -> this.newPanel.setDefaultCloseOperation(EXIT_ON_CLOSE);
            case HIDE_ON_CLOSE -> this.newPanel.setDefaultCloseOperation(HIDE_ON_CLOSE);
            case DISPOSE_ON_CLOSE -> this.newPanel.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            case DO_NOTHING_ON_CLOSE -> this.newPanel.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }

    public void addButton(int height, int width, int pos_x, int pos_y, String text){
        JButton newButton = new JButton(text);
        this.newPanel.add(newButton);
        newButton.setBounds(pos_x, pos_y, width, height);
        newButton.setVisible(true);
    }
}
