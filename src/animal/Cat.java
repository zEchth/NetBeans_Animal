package animal;

public class Cat extends Animal implements Pet{
    private String name;
    
    public Cat(String n){
        super(4);
        this.name = n;
    }
    public Cat(){
        super(4);
        name = "Unknown";
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
        System.out.println("Kucing sedang bermain!");
    }
    @Override
    public void eat(){
        System.out.println("Kucing sedang makan!");
    }
    @Override
    public void walk(){
        System.out.println("Kucing berjalan dengan 4 kaki");
    }
}
