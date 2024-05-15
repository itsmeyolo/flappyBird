import javax.swing.*; 

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360; 
        int boardHeight = 640; 

        JFrame frame = new JFrame("Flappy Bird"); 
        // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); // sets the frame in the center of screen
        frame.setResizable(false); // user cant resize window 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when user clicks the X button frame closes 

        FlappyBird flappyBird = new FlappyBird(); 
        frame.add(flappyBird); 
        frame.pack(); // if we didnt add this the title bar would also be blue
        frame.setVisible(true);

    }
}
