package animal;

public class Spider extends Animal{
    public Spider(){
        super(8);
    }
    @Override
    public void eat(){
        System.out.println("Laba-laba sedang memakan mangsanya!");
    }
    @Override
    public void walk(){
        System.out.println("Laba-laba berjalan dengan 8 kaki!");
    }
}
