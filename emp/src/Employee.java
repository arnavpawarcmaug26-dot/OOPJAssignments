public abstract class Employee {

    protected String name;
    protected String address;
    protected int age;
    protected String gender;
    protected float basicsalary;


    public Employee(String name, String address, int age, String gender, float basicsalary) {
        super();

        setName(name);
        setAddress(address);
        setAge(age);
        setGender(gender);
        setBasicsalary(basicsalary);
    }

    public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            this.address = "Not Provided";
        } else {
            this.address = address;
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            this.age = 21;
        }
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        if (gender == null || gender.trim().isEmpty()) {
            this.gender = "Not Specified";
        }
        else if (gender.equalsIgnoreCase("Male") ||
                gender.equalsIgnoreCase("Female") ||
                gender.equalsIgnoreCase("Other")) {

            this.gender = gender;
        }
        else {
            this.gender = "Other";
        }
    }


    public float getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(float basicsalary) {
        if (basicsalary >= 0) {
            this.basicsalary = basicsalary;
        } else {
            this.basicsalary = 0;
        }

    }

    public abstract void display();
}