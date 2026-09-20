import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Rectangle;

public class Pipe {
    private int x;
    private int gapY;

    private int width;
    private int gapHeight;

    private int speed;

    private Random random;

    private boolean scored;

    public Pipe(){

        random = new Random();

        x=600;

        gapY = random.nextInt(250) + 100;
        gapHeight = 150;

        width = 60;
        speed = 3;

        scored = false;

    }

    public void update(){
        x -= speed;
    }

    public void draw(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(x, 0, width, gapY); //Top Pipe
        g.fillRect(x, gapY + gapHeight, width, 600-(gapY + gapHeight)); //Bottem Pipe
    }

    public boolean isOffScreen(){
        return x + width < 0;
    }

    public boolean isScored(){
        return scored;
    }

    public void setScored(){
        scored = true;
    }

    public Rectangle getTopBounds(){
        return new Rectangle(x, 0, width, gapY);
    }

    public boolean isPassed(int birdX){
        return x + width < birdX;
    }

    public Rectangle getBottomBounds(){
        return new Rectangle(x, gapY + gapHeight, width, 600 - (gapY +gapHeight));
    }
}
