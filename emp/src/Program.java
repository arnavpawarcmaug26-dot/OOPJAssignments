public class Program {

    Employee[] employees = new Employee[100];
    int count = 0;
    int current = 0;

    public void addEmployee(Employee employee) {

        if (count >= employees.length) {
            System.out.println("Employee storage is full.");
            return;
        }

        employees[count] = employee;
        count++;

        System.out.println("Employee added successfully.");
    }

    public void displayAll() {

        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("--------------------");

            employees[i].display();

            System.out.println("--------------------");
        }
    }

    public void displayFirst() {

        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        current = 0;

        System.out.println("\nFirst Employee");
        System.out.println("--------------------");

        employees[current].display();

        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        Program p = new Program();

        Input in = new Input();

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("      EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Display First Employee");
            System.out.println("4. Exit");
            System.out.println("=================================");
            System.out.print("Enter your choice: ");

            choice = in.getInt();

            switch (choice) {

                case 1:

                    System.out.println("\n------- Add Employee -------");

                    System.out.println("1. Manager");
                    System.out.println("2. Engineer");
                    System.out.println("3. SalesPerson");

                    System.out.print("Enter employee type: ");
                    int type = in.getInt();

                    if (type < 1 || type > 3) {
                        System.out.println("Invalid employee type.");
                        break;
                    }

                    System.out.print("Enter name: ");
                    String name = in.getString();

                    System.out.print("Enter address: ");
                    String address = in.getString();

                    System.out.print("Enter age: ");
                    int age = in.getInt();

                    System.out.print("Enter gender: ");
                    String gender = in.getString();

                    System.out.print("Enter basic salary: ");
                    float basicSalary = in.getFloat();

                    if (type == 1) {

                        System.out.print("Enter HRA: ");
                        float hra = in.getFloat();

                        Manager manager = new Manager(
                                name,
                                address,
                                age,
                                gender,
                                basicSalary,
                                hra
                        );

                        p.addEmployee(manager);
                    }

                    else if (type == 2) {

                        System.out.print("Enter overtime: ");
                        float overtime = in.getFloat();

                        Engineer engineer = new Engineer(
                                name,
                                address,
                                age,
                                gender,
                                basicSalary,
                                overtime
                        );

                        p.addEmployee(engineer);
                    }

                    else {

                        System.out.print("Enter commission: ");
                        float commission = in.getFloat();

                        SalesPerson salesPerson = new SalesPerson(
                                name,
                                address,
                                age,
                                gender,
                                basicSalary,
                                commission
                        );

                        p.addEmployee(salesPerson);
                    }

                    break;


                case 2:

                    p.displayAll();

                    break;


                case 3:

                    p.displayFirst();

                    break;


                case 4:

                    System.out.println("Exiting program...");
                    break;


                default:

                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }
}