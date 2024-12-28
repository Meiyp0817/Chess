package ChessModel;

import ChessView.*;

public class Tor extends Pieces{
    public Tor(int color, int col, int row){
        super(color, col, row);

        if(color == GamePanel.RED){
            image = getImage("/piece/r-Torpiece");
        }else{
            image = getImage("/piece/b-Torpiece");
        }
    }
}
