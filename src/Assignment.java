class Student{
    String name;
    int roll_no;
    String phone_no;
    String address;

    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;

    }

}

class Triangle{
    int s1;
    int s2;
    int s3;

    Triangle(int s1, int s2, int s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    int perimeter(){
        return s1+s2+s3;
    }
    double area(){
        double res = 0.5*(s2*s3);
        return res;
    }
}

class Rectangles{
    int l;
    int b;
    Rectangles(int l,int b){
        this.l = l;
        this.b = b;
    }
    int area(){
        return l*b;

    }

}

class Complex{
    int  imaginary;
    int real;

    Complex(int imaginary, int  real){
        this.imaginary = imaginary;
        this.real = real;

    }
    void sum(Complex c) {
        System.out.println((real + c.real) + " + " + (imaginary + c.imaginary) + "i");
    }

    void difference(Complex c) {
        System.out.println((real - c.real) + " + " + (imaginary - c.imaginary) + "i");
    }

    void product(Complex c) {
        double r = (real * c.real) - (imaginary * c.imaginary);
        double i = (real * c.imaginary) + (imaginary * c.real);

        System.out.println(r + " + " + i + "i");
    }


}

class Employee{
    String name;
    int yoj;
    int salary;
    String address;
    int noh;

    Employee(String name , int yoj , int salary , String address){
        this.name = name;
        this.yoj = yoj;
        this.salary = salary;
        this.address = address;

    }
    void display() {
        System.out.println(name + " " + yoj + " " + salary + " " + address);
    }

    void getInfo(int salary, int noh){
        this.salary = salary;
        this.noh = noh;
    }
    void addSal() {
        if (salary < 500) {
            salary = salary + 10;
        }
    }

    void addWork() {
        if (noh > 6) {
            salary = salary + 5;
        }
    }
    void sal_display() {
        System.out.println("Final salary: $" + salary);
    }
}


public class Assignment {
    public static void main(String[] args){
//        Student s1 = new Student("John", 2);
//        System.out.println(s1.name);
//        System.out.println(s1.roll_no);
//
//        Student s2 = new Student("Sam", 4);
//        System.out.println(s2.name);
//        System.out.println(s2.roll_no);

//        Triangle t = new Triangle(10,20,30);
//        int perimeter = t.perimeter();
//        double area = t.area();
//        System.out.println(perimeter);
//        System.out.println(area);

//        Rectangles r1 = new Rectangles(4, 5);
//        Rectangles r2 = new Rectangles(5, 8);
//        System.out.println(r1.area());
//        System.out.println(r2.area());

//        System.out.print("Enter real part of first number: ");
//        int r1 = Input.getInt();
//
//        System.out.print("Enter imaginary part of first number: ");
//        int i1 = Input.getInt();
//
//        System.out.print("Enter real part of second number: ");
//        int r2 = Input.getInt();
//
//        System.out.print("Enter imaginary part of second number: ");
//        int i2 = Input.getInt();
//
//        Complex c1 = new Complex(r1, i1);
//        Complex c2 = new Complex(r2, i2);
//
//
//        c1.sum(c2);
//        c1.difference(c2);
//        c1.product(c2);


//        Employee e1 = new Employee("Robert", 1994, 50000, "64C-WallsStreat");
//        Employee e2 = new Employee("Sam", 2000, 60000, "68D-WallsStreat");
//        Employee e3 = new Employee("John", 1999, 55000, "26B-WallsStreat");
//
//        e1.display();
//        e2.display();
//        e3.display();

        Employee e = new Employee("Robert", 1994, 450, "64C-WallsStreat");

        e.getInfo(450, 8);
        e.addSal();
        e.addWork();

        e.sal_display();




    }
}
