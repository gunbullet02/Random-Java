public class MovieTestDrive {
    
    public static void main(String[] args)
    {
        Movie one = new Movie();
        one.title = "Final Destination";
        one.genre = "Action";
        one.rating = - 2;

        Movie two = new Movie();
        two.title = "Avengers Endgame";
        two.genre = "Action";
        two.rating = -1;
        two.playIt();

        Movie three = new Movie();
        three.title = "No way home";
        three.genre = "Sci-fi";
        three.rating = 200;
    }
}
