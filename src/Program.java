public class Program {

    public static void main(String[] args) {

        Date objDate = new Date();

        int choice;

        do {

            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            choice = Input.getInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter Day: ");
                    int day = Input.getInt();

                    System.out.println("Enter Month: ");
                    int month = Input.getInt();

                    System.out.println("Enter Year: ");
                    int year = Input.getInt();

                    objDate.setDate(day, month, year);
                    break;

                case 2:
                    System.out.println("Enter number of days to add: ");
                    int days = Input.getInt();

                    objDate.addDays(days);
                    break;

                case 3:
                    System.out.println("Enter number of months to add: ");
                    int months = Input.getInt();

                    objDate.addMonths(months);
                    break;

                case 4:
                    System.out.println("Enter number of years to add: ");
                    int years = Input.getInt();

                    objDate.addYear(years);
                    break;

                case 5:
                    System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}