package ChessModel;

import ChessView.*;

public class Xor extends Pieces{
    public Xor(int color, int col, int row){
        super(color, col, row);

        if(color == GamePanel.RED){
            image = getImage("/piece/r-Xorpiece");
        }else{
            image = getImage("/piece/b-Xorpiece");
        }
    }
}