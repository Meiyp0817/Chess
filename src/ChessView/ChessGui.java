/*package ChessView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessGui extends JPanel{




    public ChessGui(JFrame frame){
        setPreferredSize(new Dimension(width,height));
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());
        //JPanel boardContainer = new JPanel();
        //boardContainer.setLayout(new BorderLayout());
        //boardContainer.setLayout(new FlowLayout(FlowLayout.CENTER,50,10));

        //boardContainer.setLayout(new GridLayout());
        Board board = new Board();
        add(board);


        //add(boardContainer, BorderLayout.CENTER);

        JPanel controls = new JPanel();
        controls.setLayout(new FlowLayout());
        //controls.setLayout(new GridLayout(1,2));

        //button for exit
        JButton backButton = new JButton("Back to Menu");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.setPreferredSize(new Dimension(400,300));
                frame.add(new Menu(frame));
                frame.revalidate();
                frame.repaint();
                frame.pack();
                frame.setLocationRelativeTo(null);
            }
        });
        controls.add(backButton);
        add(controls, BorderLayout.EAST);
        frame.pack();
    }


}*/
