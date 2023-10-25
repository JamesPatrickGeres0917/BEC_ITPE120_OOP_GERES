public class EnumDemo {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day currentDay = Day.FRIDAY;

        switch (currentDay) {
            case MONDAY:
                System.out.println("It's Monday. Time to start the workweek!");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's a weekday. Keep working hard.");
                break;
            case FRIDAY:
                System.out.println("It's Friday. The weekend is almost here!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend. Time to relax and enjoy!");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}
