import greenfoot.*;

/**
 * The ScoreBoard is used to display results on the screen. It can display some
 * text and a score.
 * 
 * @author M Kölling
 * @version 1.1
 */
public class ScoreBoard extends Actor
{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;

    /**
     * Create a score board with dummy result for testing.
     */
    public ScoreBoard()
    {
        this(100);
    }

    /**
     * Create a score board for the final result.
     */
    public ScoreBoard(int score)
    {
        GreenfootImage image = new GreenfootImage("gameoveralien.png"); // Assuming "gameoveralien.png" is the image file

        setImage(image);
        displayScore(score);
    }

    /**
     * Display the score on the score board.
     */
    private void displayScore(int score)
    {
        GreenfootImage image = getImage();
        
        // Create a new image for displaying the score
        GreenfootImage textImage = new GreenfootImage("Score: " + score, 30, Color.WHITE, new Color(0, 0, 0, 0));
        
        // Draw the score image onto the scoreboard image
        image.drawImage(textImage, (image.getWidth() - textImage.getWidth()) / 2, (image.getHeight() - textImage.getHeight()) / 2);
    }
}
