package Logic_1;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        if(day >= 1 && day <= 5 && !vacation) {
            return "7:00";
        }
        if(((day == 0 || day == 6) && !vacation) || (day >= 1 && day <= 5 && vacation)) {
            return "10:00";
        }
        return "off";
    }
}
