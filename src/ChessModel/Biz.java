package ChessModel;

import ChessView.*;

public class Biz extends Pieces{
    public Biz(int color, int col, int row){
        super(color, col, row);

        if(color == GamePanel.RED){
            image = getImage("/piece/r-Bizpiece");
        }else{
            image = getImage("/piece/b-Bizpiece");
        }
    }
}
