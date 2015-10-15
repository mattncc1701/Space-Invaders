package SpaceInvaders;

public class GameMain {

    public static void main(String[] args) {
        // Define a local variable called game of type Game and intialize it
        // to a new Game object
        Game game = new Game();
        
        // Loop while the game is not over
        // Test game.gameOver is false to detemine if the game is over
        while (!game.gameOver) {
            // Call game.play() to execute game play
            game.play();
        } // End while loop
       
    } // main
} // GameMain
