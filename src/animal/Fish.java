package animal;

public class Fish extends Animal implements Pet {
    private String name;
    
    public Fish(){
        super(0);
        name = "unknown";
    }
    
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String n){
        this.name = n;
    }
    @Override
    public void play(){
        System.out.println("Ikan sedan bermain!");
    }
    @Override
    public void walk(){   
        System.out.println("Ikan tidak berjalan, tapi berenang di air");
    }
    @Override
    public void eat(){
        System.out.println("Ikan sedang makan!");
    }
}
