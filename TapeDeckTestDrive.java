class TapeDeck
{
    static boolean canRecord = false;

    static void playTape()
    {
        System.out.println("tape playing");
    }

    static void recordTape() {
        System.out.println("tape recording");
     }
}

public class TapeDeckTestDrive {
    public static void main(String[] args)
    {
        TapeDeck.canRecord = true;
        TapeDeck.playTape();

        if (TapeDeck.canRecord == true) {
            TapeDeck.recordTape();
            }
    }
}
