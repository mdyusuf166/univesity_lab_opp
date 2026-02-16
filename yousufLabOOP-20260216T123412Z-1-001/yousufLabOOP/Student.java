// public class Student {
//     String name ;
//     String address;
//     String id;
//     double cgpa;
//     public Student(){

//     }
//     void  write(){
//         System.out.println("Name : "+ this.name);
//         System.out.println("Address : " + this.address);
//         System.out.println("ID" + this.id);
//         System.out.println("CGPA : "+ this.cgpa);
//     }
//      void compareCGPA(Student s1, Student s2) {
//         if (s1.cgpa > s2.cgpa) {
//             System.out.println(s1.name + " has higher CGPA");
//         } else if (s1.cgpa < s2.cgpa) {
//             System.out.println(s2.name + " has higher CGPA");
//         } else {
//             System.out.println("Both students have same CGPA");
//         }
//     }
//  }
public class Student {
    String name;
    String address;
    String id;
    double cgpa;

    void write() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("ID : " + id);
        System.out.println("CGPA : " + cgpa);
    }

      static void compareCGPA(Student s1, Student s2) {
        if (s1.cgpa > s2.cgpa) {
            System.out.println(s1.name + " has higher CGPA");
        } else if (s1.cgpa < s2.cgpa) {
            System.out.println(s2.name + " has higher CGPA");
        } else {
            System.out.println("Both students have the same CGPA");
        }
    }
}
