/*package ChessView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel {
    public Menu(JFrame frame) {
        JPanel mainMenu = new JPanel();
        mainMenu.setPreferredSize(new Dimension(400, 300));

        JLabel title = new JLabel("Menu", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 36));
        mainMenu.add(title, BorderLayout.NORTH);
        title.setBorder(BorderFactory.createEmptyBorder(50, 50, 0, 50));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        JButton startButton = new JButton("Start Game");

        buttonPanel.add(startButton);

        mainMenu.add(buttonPanel, BorderLayout.CENTER);
        startButton.setFont(new Font("Arial", Font.PLAIN, 24));

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                //frame.setMinimumSize(new Dimension(1000, 1100));
                //frame.setLayout(new GridBagLayout());
                //frame.setSize(1000,1000);
                frame.add(new GamePanel(frame));
                frame.setPreferredSize(new Dimension(640, 900));//630,1000
                frame.revalidate();
                frame.repaint();
                frame.pack();
                frame.setLocationRelativeTo(null);
            }
        });
        frame.add(mainMenu);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //frame.add(new ChessGui(frame));
    }
}*/
