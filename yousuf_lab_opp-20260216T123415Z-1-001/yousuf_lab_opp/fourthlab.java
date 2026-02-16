public class fourthlab {
    public static void main(String[] args) {
        Smartphone galaxy = new Smartphone("Relme", "17 ProMax", "sst",13);
        Smartphone Iphone = new Smartphone("Relme", "17 ProMax", "sst",12);
        galaxy.takePhoto();
        // galaxy.takePhoto();
        Iphone.compa(galaxy,Iphone);
        galaxy.compa(galaxy, Iphone);

    }
}