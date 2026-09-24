public class Engineer extends Employee {
    protected float overtime;

    public Engineer(String name, String address, int age, String gender, float basicsalary, float overtime){
        super(name, address , age , gender , basicsalary);
        setOvertime(overtime);

    }
    public float getOvertime(){
        return overtime;
    }
    public void setOvertime(float overtime){
        if (overtime >= 0) {
            this.overtime = overtime;
        } else {
            this.overtime = 0;
        }
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Basic Salary: " + getBasicsalary());
        System.out.println("Overtime: " + getOvertime());
    }
}
