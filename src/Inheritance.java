import org.w3c.dom.css.Rect;

class Parent {
    void display(){
        System.out.println("This is parent class.");
    }
}

class Child extends Parent{
    void childDisplay(){
        System.out.println("This is child class");
    }
}

class Member {
    private String name;
    private int age;
    private String phone_number;
    private String address;
    private int salary;

    Member(String name, int age, String phone_number, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


class PrimeMembers extends Member {
    private int joiningYear;
    private int joiningFees;
    private boolean isActive;

    PrimeMembers(String name, int age, String phone_number, String address,
                 int salary, int joiningYear, int joiningFees, boolean isActive) {

        super(name, age, phone_number, address, salary);

        this.joiningYear = joiningYear;
        this.joiningFees = joiningFees;
        this.isActive = isActive;
    }

    // Getters
    public int getJoiningYear() {
        return joiningYear;
    }

    public int getJoiningFees() {
        return joiningFees;
    }

    public boolean getIsActive() {
        return isActive;
    }

    // Setters
    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public void setJoiningFees(int joiningFees) {
        this.joiningFees = joiningFees;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());
        System.out.println("Joining Year: " + joiningYear);
        System.out.println("Joining Fees: " + joiningFees);
        System.out.println("Active: " + isActive);
    }
}

class Rectangle{
    int l;
    int b;

    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }

    void printArea(){
        int result = l*b;
        System.out.println("Area: " + result);
    }
    void printPerimeter(){
        int result = 2*(l+b);
        System.out.println("Perimeter: " + result);
    }
}

class Square extends Rectangle{
    int side;

    Square(int side) {
        super(side, side);
    }

}

class Shape{
    void printShape(){
        System.out.println("This is shape. ");
    }
}
class RectangleShape extends Shape{
    void rectangleDisplay() {
        System.out.println("This is rectangular shape");
    }
}
class Circle extends  Shape{
    void circleDisplay() {
        System.out.println("This is circular shape");
    }

}
class SquareShape extends RectangleShape {
    void squareDisplay() {
        System.out.println("Square is a rectangle");
    }
}

public class Inheritance{
    public static void main(String[] args){
//        Parent p = new Parent();
//        Child c = new Child();
//
//        p.display();
//        c.childDisplay();
//        c.display();

//        System.out.println("Enter member name: ");
//        String name = Input.getString();
//
//        System.out.println("Enter age: ");
//        int age = Input.getInt();
//
//        System.out.println("Enter phone number: ");
//        String phone_number = Input.getString();
//
//        System.out.println("Enter address: ");
//        String address = Input.getString();
//
//        System.out.println("Enter salary: ");
//        int salary = Input.getInt();
//
//        System.out.println("Enter joining year: ");
//        int joiningYear = Input.getInt();
//
//        System.out.println("Enter joining fees: ");
//        int joiningFees = Input.getInt();
//
//        System.out.println("Is member active (true/false): ");
//        boolean isActive = Input.getBoolean();
//
//        PrimeMembers pm = new PrimeMembers(
//                name,
//                age,
//                phone_number,
//                address,
//                salary,
//                joiningYear,
//                joiningFees,
//                isActive
//        );
//
//        pm.display();

//        Rectangle r = new Rectangle(10, 5);
//
//        r.printArea();
//        r.printPerimeter();
//
//        Square s = new Square(5);
//
//        s.printArea();
//        s.printPerimeter();

        SquareShape s = new SquareShape();
        s.printShape();
        s.squareDisplay();






    }
}


