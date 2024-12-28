package ChessModel;

import ChessView.*;

import java.awt.*;

public class Sau extends Pieces{
    public Sau(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.RED) {
            image = getImage("/piece/r-Saupiece");
        } else {
            image = getImage("/piece/b-Saupiece");
        }
    }
}
