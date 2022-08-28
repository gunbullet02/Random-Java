public class DogTestDrive {
    
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.size = 40;
        Dog e = new Dog();
        e.size = 60;
        Dog f = new Dog();
        f.size = 80;

        d.bark();
        e.bark();
        f.bark();
    }
}
