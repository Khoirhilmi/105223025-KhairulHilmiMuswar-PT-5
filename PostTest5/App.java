// class Person {
//     private String name;
//     private int age;

//     public Person(String n, int a) {
//         name = n;
//         age = a;
//    }
//         public void display() {
//         System.out.println("Name: " + name + ", Age: " + age);
       
//    }
// class Employee extends Person {
//         private double salary;
//         public Employee(String n, int a, double s) {
//         salary = s;
//    }
//         public void showSalary() {
//         System.out.println("Salary: " + salary),
//    }
// }
// public class MainApp {
//         public static void main(String[] args) {
//         Employee emp = new Employee("Alice", 25, 5.000);
//         emp.display();
//    }
// }
       
// setelah diperbaiki

class Person {
    private String name;
    private int age;
    
    public Person(String n, int a) {
        name = n;
        age = a;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    private double salary;
    
    public Employee(String n, int a, double s) {
        super(n, a);  //memanggil konstruktor kelas induk 
        salary = s;
    }
    
    public void showSalary() {
        System.out.println("Salary: " + salary);  //memperbaiki tanda koma menjadi titik
    }
}

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 25, 5000.0);  //memperbaiki format desimal
        emp.display();
        emp.showSalary();  
    }
}


// Penjelasan Hasil:

// Kelas Person berfungsi sebagai kelas induk dengan atribut name dan age
// Kelas Employee mewarisi dari Person dan menambahkan atribut salary
// Objek Employee sekarang bisa:
// Menampilkan nama dan umur (dari method display() di Person)
// Menampilkan gaji (dari method showSalary() di Employee)
// Konstruktor bekerja dengan benar melalui pemanggilan super()