package arrayBasics;


import java.time.LocalDate;
import java.util.*;


public class CCIPBQuestion {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the date - ");
        String date = s.nextLine();
        System.out.println("date entered - "+date);

        CCIPBQuestion c = new CCIPBQuestion();
        System.out.println(Arrays.toString(c.dateString(date)));


    }

    public String[] dateString(String date) {
        System.out.println(date);
        int dayOfWeek;
        Calendar c = Calendar.getInstance();

        LocalDate currentDate = LocalDate.parse(date);
        String datesToReturn[] = new String[2];

        System.out.println(currentDate);

        int lastYear = currentDate.getYear() - 1;
        int lastMonth = 04;
        int lastDay = 01;

        int curYear = currentDate.getYear();
        int curMonth = 03;
        int curDay = 30;

        c.set(lastYear, lastMonth - 1, lastDay);
        dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        System.out.println("day of the week" + dayOfWeek);

        switch (dayOfWeek) {
            case 7:
                lastDay = lastDay + 2;
                break;

            case 1:
                lastDay = lastDay + 1;
                break;
        }
        System.out.println(lastDay);
        String fisStart = String.valueOf(lastYear) + "-" + String.format("%02d", lastMonth) + "-" + String.format("%02d", lastDay);
        System.out.println(fisStart);

        c.set(curYear, curMonth - 1, curDay);
        dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case 7:
                curDay = curDay - 1;
                break;

            case 1:
                curDay = curDay - 2;
                break;
        }

        String fisEnd = String.valueOf(curYear) + "-" + String.format("%02d", curMonth) + "-" + String.format("%02d", curDay);
        System.out.println(fisEnd);
        datesToReturn[0] = fisStart;
        datesToReturn[1] = fisEnd;

        return datesToReturn;

    }

}
