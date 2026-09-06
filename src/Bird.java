import java.awt.Color;
import java.awt.Graphics;

public class Bird {
    private int x;
    private int y;

    private int height;
    private int width;

    private double velocityY;
    private double gravity;

    public Bird() {
        x = 100;
        y = 250;

        width = 40;
        height = 30;

        velocityY = 0;
        gravity = 0.5;
    }

    public void update(int gameHeight) {
        velocityY += gravity;
        y += velocityY;

        if(y<0){
            y=0;
            velocityY=0;
        }
        if (y + height > gameHeight) {
        y = gameHeight - height;
        velocityY = 0;
    }
    }

    public void flap() {
        velocityY = -8;
    }

    public void draw(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
    }
}
