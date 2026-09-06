import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.KeyStroke;

public class GamePanel extends JPanel implements ActionListener {

    private Timer timer;

    private Bird bird;

    private Pipe pipe;

    public GamePanel() {

        bird = new Bird();
        pipe = new Pipe();

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

        pipe.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        bird.update(getHeight());

        pipe.update();

        repaint();
    }
}
