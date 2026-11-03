import javax.sound.sampled.*;
import java.io.File;

public class SoundManager{
    private Clip flapSound;
    private Clip scoreSound;
    private Clip gameOverSound;

    public void loadFlapSound(){
        try{
            File soundFile = new File("assets/sounds/flap.wav");

            AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundFile);

            flapSound = AudioSystem.getClip();

            flapSound.open(audioInput);
            flapSound.start();
            flapSound.stop();
            flapSound.setFramePosition(0);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void playFlapSound(){
        if(flapSound != null){
            flapSound.setFramePosition(0);
            flapSound.start();
        }
    }

    public void loadScoreSound(){
        try {
            File soundFile = new File("assets/sounds/score.wav");

            AudioInputStream audioInput =
            AudioSystem.getAudioInputStream(soundFile);

            scoreSound = AudioSystem.getClip();

            scoreSound.open(audioInput);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playScoreSound(){
        if(scoreSound != null){
            scoreSound.setFramePosition(0);
            scoreSound.start();
        }
    }

    public void loadGameOverSound(){
        try {
            File soundFile = new File("assets/sounds/game-over.wav");

            AudioInputStream audioInput =
            AudioSystem.getAudioInputStream(soundFile);

            gameOverSound = AudioSystem.getClip();

            gameOverSound.open(audioInput);

            }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playGameOverSound(){
        if(gameOverSound != null){
            gameOverSound.setFramePosition(0);
            gameOverSound.start();
        }
    }
}