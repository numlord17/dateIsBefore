import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
      {
         int month1 = 100;
         int day1 = 100;
         int month2 = 100;
         int day2 = 100;
         //**************************//
         Scanner scanner = new Scanner(System.in);
         //**************************//
         while (month1 <= 0 || month1 > 12)
         {
         System.out.println("First Month?");
         month1 = scanner.nextInt();
         }
         if (month1 == 1 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 8 || month1 == 10 || month1 == 12)
         {
            while (day1 <= 0 || day1 > 31)
            {
               System.out.println("First Day?");
               day1 = scanner.nextInt();
            }
         }
         else if (month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11)
         {
            while (day1 <= 0 || day1 > 30)
            {
               System.out.println("First Day?");
               day1 = scanner.nextInt();
            }
         }
         else
         {
            while (day1 <= 0 || day1 > 28)
            {
               System.out.println("First Day?");
               day1 = scanner.nextInt();
            }
         }
         //***********//
         //***********//
         while (month2 <= 0 || month2 > 12)
         {
         System.out.println("Second Month?");
         month2 = scanner.nextInt();
         }
         if (month2 == 1 || month2 == 3 || month2 == 5 || month2 == 7 || month2 == 8 || month2 == 10 || month2 == 12)
         {
            while (day2 <= 0 || day2 > 31)
            {
               System.out.println("Second Day?");
               day2 = scanner.nextInt();
            }
         }
         else if (month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11)
         {
            while (day2 <= 0 || day2 > 30)
            {
               System.out.println("Second Day?");
               day2 = scanner.nextInt();
            }
         }
         else
         {
            while (day2 <= 0 || day2 > 28)
            {
               System.out.println("Second Day?");
               day2 = scanner.nextInt();
            }
         }
         //***********//
         //***********//
         if (month1 < month2)
         {
            System.out.println(true);
         }
         else if (month1 > month2)
         {
            System.out.println(false);
         }
         else
         {
            if (day1 < day2)
            {
               System.out.println(true);
            }
            else if (day1 > day2)
            {
               System.out.println(false);
            }
            else
            {
               System.out.print("They are the same day");
            }
         }
         
      }    
}