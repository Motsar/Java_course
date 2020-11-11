public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }
        return false;
    }


    public int differenceInYears(MyDate compared) {
        int years = Math.abs(this.year - compared.year);
        int age;
        if (this.month < compared.month){
            age = years;
        } else if(this.month > compared.month){
            age = years - 1;
        } else {
            if(this.day == compared.day){
                age = years;
            } else {
                age =  years - 1;
            }
        }
        return age;
    }
}
