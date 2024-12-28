import ChessView.*;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        //frame.setSize(400, 300);

        //Menu
        //frame.add(new Menu(frame));
        GamePanel panel = new GamePanel();
        frame.add(panel);
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}