public class Date {
    private int day;
    private int month;
    private int year;

    public void setDate(int dd,int mm, int yy){
        year = yy;
        if(mm < 1 || mm > 12){
            month = 1;
        }
        else{
            month = mm;
        }
        if(month == 1 || month == 3 || month ==5 || month == 7 || month == 8 ){
            if(dd < 1 || dd > 31){
                day = 1;
            }
            else{
                day = dd;
            }

        }
        else if(month == 4 || month == 6 || month == 9 || month ==11){
            if(dd<1 || dd>30){
                day = 1;
            }
            else{
                day = dd;
            }

        }

        else if (month == 2) {

            if ((yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0) {

                if (dd < 1 || dd > 29)
                    day = 1;
                else
                    day = dd;

            }
            else {

                if (dd < 1 || dd > 28)
                    day = 1;
                else
                    day = dd;
            }
        }

    }

    public void addDays(int days){

        while (days > 0) {

            int daysInMonth;

            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    daysInMonth = 29;
                else
                    daysInMonth = 28;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            }
            else {
                daysInMonth = 31;
            }

            if (day == daysInMonth) {
                day = 1;
                month++;

                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
            else {
                day++;
            }

            days--;
        }


    }

    public void addMonths(int months) {

        while (months > 0) {

            month++;

            if (month > 12) {
                month = 1;
                year++;
            }

            int daysInMonth;

            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    daysInMonth = 29;
                else
                    daysInMonth = 28;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            }
            else {
                daysInMonth = 31;
            }

            if (day > daysInMonth) {
                day = daysInMonth;
            }

            months--;
        }
    }
    public void addYear(int years) {
        year = year + years;
        if (month == 2 && day == 29) {

            if (!((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                day = 28;
            }
        }
    }

    public void display(){

        System.out.println("DATE"+day+"Month"+month +"Year"+year);
    }
    public int getDay(){

        return day;
    }
    public int getMonth(){

        return month;
    }
    public int getYear() {

        return year;
    }






}
