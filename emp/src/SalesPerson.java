public class SalesPerson extends Employee {
    protected float commission;

    public SalesPerson  (String name, String address, int age, String gender, float basicsalary, float commission){
        super(name, address , age , gender , basicsalary);
        setCommission(commission);

    }
    public float getCommission(){
        return commission;
    }
    public void setCommission(float commission){
        if (commission >= 0) {
            this.commission = commission;
        } else {
            this.commission = 0;
        }
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Basic Salary: " + getBasicsalary());
        System.out.println("Commission: " + getCommission());
    }
}
