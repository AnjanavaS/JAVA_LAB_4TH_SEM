class program3 {
    public static void main(String[] args) {

        int dayNo = 15;   
        int weekDay = dayNo % 7;  

        String dayName;

        switch(weekDay) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 0:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid";
        }

        System.out.println("Week Day: " + dayName);
    }
}
