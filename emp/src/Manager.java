public class Manager extends Employee{
    protected float hra;

    public Manager(String name, String address, int age, String gender, float basicsalary, float hra){
        super(name, address , age , gender , basicsalary);
        sethra(hra);

    }

    public float getHra(){
        return hra;
    }

    public void sethra(float hra) {
        if (hra >= 0) {
            this.hra = hra;
        } else {
            this.hra = 0;
        }
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Basic Salary: " + getBasicsalary());
        System.out.println("HRA: " + getHra());
    }

}