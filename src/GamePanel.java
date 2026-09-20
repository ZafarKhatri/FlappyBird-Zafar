import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.KeyStroke;
import java.util.ArrayList;
import java.util.Iterator;

public class GamePanel extends JPanel implements ActionListener {

    private Timer timer;

    private Bird bird;

    private ArrayList<Pipe> pipes;

    private int pipeTimer;

    private boolean gameOver;

    private int score;

    public GamePanel() {

        bird = new Bird();
        pipes = new ArrayList<>();
        pipes.add(new Pipe());
        pipeTimer = 0;
        gameOver = false;
        score = 0;

        timer = new Timer(16, this);
        timer.start();

        setFocusable(true);

        getInputMap().put(KeyStroke.getKeyStroke("SPACE"),"flap");
        getActionMap().put("flap", new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e){
                bird.flap();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        bird.draw(g);

        for(Pipe pipe : pipes){
            pipe.draw(g);
        }

        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 20, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(gameOver){
            return;
        }
        
        bird.update(getHeight());

        if(bird.isOnGround(getHeight())){
            gameOver = true;
            System.out.println("Game Over!");
        }

        Iterator<Pipe> iterator = pipes.iterator();

        while (iterator.hasNext()) {
            Pipe pipe = iterator.next();

            pipe.update();

            if(bird.getBounds().intersects(pipe.getTopBounds()) || bird.getBounds().intersects(pipe.getBottomBounds())){

                gameOver = true;
                System.out.println("Game Over!");
            }

            if(!pipe.isScored() && pipe.isPassed(bird.getX())){
                score++;
                pipe.setScored();
            }
            
            if(pipe.isOffScreen()){
                iterator.remove();
            }   
        }

        pipeTimer++;

        if(pipeTimer >= 100){
            pipes.add(new Pipe());
            pipeTimer = 0;
        }

        repaint();
    }
}
