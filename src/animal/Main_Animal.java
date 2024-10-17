package animal;

public class Main_Animal {
    public static void main(String args[]){
        Cat catObj = new Cat("Garfiel");
        Fish fishObj = new Fish();
        Spider spiderObj = new Spider();
        
        // cat
        catObj.setName("Garfiel");
        System.out.println(catObj.getName()); 
        catObj.eat();
        catObj.play();
        catObj.walk();
        
        //fish
        System.out.println("");
        fishObj.setName("Nemo"); // set nama
        System.out.println(fishObj.getName());
        fishObj.eat();
        fishObj.play();
        fishObj.walk();
        
        //spider
        System.out.println("");
        spiderObj.eat();
        spiderObj.walk();
    }
}
