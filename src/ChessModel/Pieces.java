package ChessModel;

import ChessView.Board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pieces {
    public int x;
    public int y;
    public int col;
    public int row;
    public int preCol;
    public int preRow;
    public int color;

    public BufferedImage image;

    public Pieces(int color, int col, int row){
        this.color = color;
        this.col = col;
        this.row = row;
        x = getX(col);
        y = getY(row);
        preCol = col;
        preRow = row;
    }

    public BufferedImage getImage(String imagePath) {
        BufferedImage image = null;

        try{
            image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    public int getX(int col){
        return col * Board.squareSize;
    }

    public int getY(int row){
        return row * Board.squareSize;
    }

    public void paintComponent(Graphics2D g2d){
        g2d.drawImage(image, x, y,Board.squareSize,Board.squareSize, null);
    }
}

