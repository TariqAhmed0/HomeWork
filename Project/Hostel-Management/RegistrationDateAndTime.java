package ConcreteClasses;

import java.time.LocalTime;
import java.io.Serializable;
import java.time.LocalDate;


public class RegistrationDateAndTime implements Serializable{
    
    private String currentDateString;
    private String currentTimeString;
    private String month, day , year , hour , minute , second;

    public RegistrationDateAndTime() {
        // Taking local Data and Time from the System
        month = LocalDate.now().getMonth().toString();
        day = LocalDate.now().getDayOfMonth() + "";
        year = LocalDate.now().getYear() + "";
        hour = LocalTime.now().getHour() + "";
        minute = LocalTime.now().getMinute() + "";
        second = LocalTime.now().getSecond() + "";

        // Concatenating the local Data and Time
        currentDateString = month + " " + day + " " + year;
        
        if (LocalTime.now().getHour() > 12) {
            currentTimeString = (Integer.parseInt(hour) - 12) + ":" + minute + ":" + second + " PM";
        } 
        else {
            currentTimeString = hour +":" + minute + ":" + second + " AM";
        }
    }
    
    public String getCurrentDateString() {
        return this.currentDateString;
    }

    public String getCurrentTimeString() {
        return this.currentTimeString;
    }

    public String getMonth() {
        return this.month;
    }

    public String getDay() {
        return this.day;
    }


    public String getYear() {
        return this.year;
    }

    public String getHour() {
        return this.hour;
    }

    public String getMinute() {
        return this.minute;
    }

    public String getSecond() {
        return this.second;
    }


    public String toString() {
        return "Registration Date : " + currentDateString + "\n" +
                "Registration Time : " + currentTimeString;
    }

}
