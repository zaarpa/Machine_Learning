package Assignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calender {
    int day;
    int month;
    int year;

    public Calender(String date) {
        String[] arrOfDate = date.split("/");
        this.day = Integer.parseInt(arrOfDate[0]);
        this.month = Integer.parseInt(arrOfDate[1]);
        this.year = Integer.parseInt(arrOfDate[2]);
    }

    public String nextDate(){
        if (isNextYear() == true) {
            shiftYear();
        } else if (isNextMonth() == true) {
            shiftMonth();
        } else if (isNextDay() == true) {
            shiftDay();
        }
        return day + "/" + month + "/" + year;
    }

    public boolean isLeapYear() {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNextYear() {
        if (month == 12 && day == 31) {
            return true;
        }
        return false;
    }

    public boolean isA31DaysMonth(){
        List<Integer> MonthOf31Days = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        return MonthOf31Days.indexOf(month)!=-1;
    }
    public boolean isA30DaysMonth(){
        List<Integer> MonthOf30Days = Arrays.asList(4, 6, 9, 11);
        return MonthOf30Days.indexOf(month)!=-1;
    }
    public boolean isNextMonth() {

        boolean LastDayOf31DaysMonth = isA31DaysMonth() && day == 31;
        boolean LastDayOf30DaysMonth = isA30DaysMonth() && day == 30;
        boolean LastDayOfFebruary = (month==2 && isLeapYear() == true && day == 29) || (month==2 && isLeapYear() == false && day == 28);
        if (LastDayOf31DaysMonth || LastDayOf30DaysMonth) {
            return true;
        }
        else if(LastDayOfFebruary)
        {
            return true;
        }
        return false;


}
    public boolean isNextDay(){
        if(isNextMonth()==true || isNextYear()==true)
        {
            return false;
        }
        else{
            return true;
        }
    }
    public void shiftYear(){
        year++;
        month=1;
        day=1;
    }
    public void shiftMonth(){
        month++;
        day=1;
    }
    public void shiftDay(){
        day=day+1;
    }
}
