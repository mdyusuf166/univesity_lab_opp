public class Smartphone {
    String  brand,model,processor;
    double cameraSize;

    public Smartphone(String brand,String model,String processor,double cameraSize){
        this.brand = brand;
        this.cameraSize = cameraSize;
        this.model = model;
        this.processor = processor;
    
    }
    // void takePhoto(){
    // System.out.println("Took photo with :" + cameraSize + " MegaPixel Camer. '\n' ");
    // }
    void takePhoto(int times){
        for(int i = 0; i <= times ;i++){
            System.out.println("Took photo with :"   + cameraSize + " MegaPixel Camer. '\n' ");
        }
    }
    void takePhoto(){

    if(cameraSize == 0){
        System.out.println("this phone is not work");

    }else{
        System.out.println("Took photo with :"   + cameraSize + " MegaPixel Camer. '\n' ");

    }

    }
    // void compa(Smartphone a ,Smartphone b ){
    //     if(a.cameraSize < b.cameraSize){
    //         System.out.println( " A has better #");
    //     }
    //     else{
    //         System.out.println("  B has better #");
    //     }
    // }
    
    static void compa(Smartphone phone1, Smartphone phone2) {
        if (phone1.cameraSize > phone2.cameraSize) {
            System.out.println(phone1.brand + " has better camera.");
        } else if (phone1.cameraSize < phone2.cameraSize) {
            System.out.println(phone2.brand + " has better camera.");
        } else {
            System.out.println("Both phones have equal camera quality.");
        }
    }
    
}
