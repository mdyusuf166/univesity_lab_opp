public class Bird  extends Animal{

    public Bird (String name, String specises,double height){
        super(name,specises,height);
    }
    void eat (){
        System.out.println(name + "eat insects");
    }

    void eat(int time ){
        System.out.println(name + "eats insects for" + time +"hours");
    }
    
}
