package ChessModel;

import ChessView.*;

public class Ram extends Pieces{
    public Ram(int color, int col, int row){
        super(color, col, row);

        if(color == GamePanel.RED){
            image = getImage("/piece/r-Rampiece");
        }else{
            image = getImage("/piece/b-Rampiece");
        }
    }
}