// public class Vehicle {
//     String name ,brand;
//     double speed;
//     int Whells;
//     void drive ()
//     {
//         System.out.println(name +"is going forward at " + speed + "km/h");
//     }
//     public static void main(String[] args) {
//         Vehicle v = new Vehicle();
//         v.name = "Car";
//         v.brand ="Toyota";
//         v.speed = 80.5;
//         v.Whells = 4;
//         v.drive();

//         Student s1= new Student();
//         s1.name = "X";
//         s1.cgpa = 4.00;
//         s1.id = "242-115-007";
//         s1.address = "Syleht";
//         s1.write();
//         Student s2= new Student();
//         s2.name = "Y";
//         s2.cgpa = 3.99;
//         s2.id = "242-115-007";
//         s2.address = "Syleht";
//         Student.compareCGPA(s1, s2);



//     }
    
// }



public class Vehicle {
    String name, brand;
    double speed;
    int wheels;

    void drive() {
        System.out.println(name + " is going forward at " + speed + " km/h");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.name = "Car";
        v.brand = "Toyota";
        v.speed = 80.5;
        v.wheels = 4;
        v.drive();

        Student s1 = new Student();
        s1.name = "X";
        s1.cgpa = 4.00;
        s1.id = "242-115-007";
        s1.address = "Sylhet";
        s1.write();

        Student s2 = new Student();
        s2.name = "Y";
        s2.cgpa = 3.99;
        s2.id = "242-115-007";
        s2.address = "Sylhet";
        s2.write();

        Student.compareCGPA(s1, s2);
    }
}

