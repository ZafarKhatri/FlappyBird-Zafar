import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Pipe {
    private int x;
    private int gapY;

    private int width;
    private int gapHeight;

    private int speed;

    private Random random;

    public Pipe(){

        random = new Random();

        x=600;

        gapY = random.nextInt(250) + 100;
        gapHeight = 150;

        width = 60;
        speed = 3;

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
}
