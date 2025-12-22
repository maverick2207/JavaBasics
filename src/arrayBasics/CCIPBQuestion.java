package arrayBasics;


import java.time.LocalDate;
import java.util.*;


public class CCIPBQuestion {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Prompt user to enter a date in the format YYYY-MM-DD
        System.out.println("Enter the date - ");
        String date = s.nextLine();

        // Print the entered date
        System.out.println("date entered - " + date);

        // Create an object of CCIPBQuestion to call the instance method
        CCIPBQuestion c = new CCIPBQuestion();

        // Call dateString method to get financial year start and end date based on logic
        // Print the returned date array
        System.out.println(Arrays.toString(c.dateString(date)));
    }

    /**
     * Purpose:
     * This method takes an input date (in "YYYY-MM-DD" format), and returns the
     * start and end dates of the financial year (April 1st of last year to March 30th
     * of current year). If the start or end date falls on a weekend (Saturday/Sunday),
     * it adjusts to the next Monday (for start) or previous Friday (for end).
     */
    public String[] dateString(String date) {
        // Print input date for debug
        System.out.println(date);

        // Day of the week tracker
        int dayOfWeek;

        // Calendar instance to manipulate dates
        Calendar c = Calendar.getInstance();

        // Parse the input date string to a LocalDate object
        LocalDate currentDate = LocalDate.parse(date);

        // Print parsed date for debug
        System.out.println(currentDate);

        // Create a string array to store the adjusted financial year start and end dates
        String datesToReturn[] = new String[2];

        // Define static financial year start: April 1st of previous year
        int lastYear = currentDate.getYear() - 1;
        int lastMonth = 4; // April
        int lastDay = 1;   // 1st

        // Define static financial year end: March 30th of current year
        int curYear = currentDate.getYear();
        int curMonth = 3; // March
        int curDay = 30;  // 30th

        // Set calendar to April 1st of last year
        c.set(lastYear, lastMonth - 1, lastDay); // month is 0-based in Calendar
        dayOfWeek = c.get(Calendar.DAY_OF_WEEK); // Get day of week (1=Sunday, 7=Saturday)

        // Print for debugging
        System.out.println("day of the week: " + dayOfWeek);

        // Adjust financial year start date if it falls on weekend:
        // If Saturday (7), move to Monday (+2 days)
        // If Sunday (1), move to Monday (+1 day)
        switch (dayOfWeek) {
            case 7:
                lastDay = lastDay + 2;
                break;
            case 1:
                lastDay = lastDay + 1;
                break;
        }

        // Print adjusted start day
        System.out.println("Adjusted FY start day: " + lastDay);

        // Build start date string in format YYYY-MM-DD
        String fisStart = String.valueOf(lastYear) + "-"
                + String.format("%02d", lastMonth) + "-"
                + String.format("%02d", lastDay);

        System.out.println("Financial Year Start Date: " + fisStart);

        // Set calendar to March 30th of current year
        c.set(curYear, curMonth - 1, curDay);
        dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        // Adjust financial year end date if it falls on weekend:
        // If Saturday (7), move to Friday (-1 day)
        // If Sunday (1), move to Friday (-2 days)
        switch (dayOfWeek) {
            case 7:
                curDay = curDay - 1;
                break;
            case 1:
                curDay = curDay - 2;
                break;
        }

        // Build end date string in format YYYY-MM-DD
        String fisEnd = String.valueOf(curYear) + "-"
                + String.format("%02d", curMonth) + "-"
                + String.format("%02d", curDay);

        System.out.println("Financial Year End Date: " + fisEnd);

        // Store adjusted dates in array
        datesToReturn[0] = fisStart;
        datesToReturn[1] = fisEnd;

        // Return the date array
        return datesToReturn;
    }
}