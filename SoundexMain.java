public class SoundexMain {
    
    public static void main(String[] args)
    {
        String name1 = "beer";
        String name2 = "bear";
        String name3 = "bearer";

        System.out.println(Soundex.getGode(name1));
        System.out.println(Soundex.getGode(name2));
        System.out.println(Soundex.getGode(name3));
    }
}
