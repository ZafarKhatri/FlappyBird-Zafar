import javax.swing.JFrame;
public class Game {
    public Game(){

        JFrame window = new JFrame();
        GamePanel gamePanel = new GamePanel();

        window.setTitle("Flappy Bird");
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        window.add(gamePanel);

        window.setVisible(true);
    }
}
