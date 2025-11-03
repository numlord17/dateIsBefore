import java.util.Scanner;
public class Grader
   {
      public static void main(String[] args)
      {
         boolean useScanner = false;
         if (useScanner)
         {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your GitHub Username?");
            String githubUsername = scanner.nextLine();
            System.out.println("What is your shoe color?");
            String shoeColor = scanner.nextLine();
            System.out.println(grade(githubUsername, shoeColor));
            scanner.close();
         }
         System.out.println(grade("EasyPeasy", "black"));
      }
      
      public static int grade(String name,String color)
      {
         int points = 0;
         String firstChar = name.charAt(0)+"";
         String firstCharUpper = firstChar.toUpperCase();
         System.out.println(firstCharUpper);
         System.out.println(color);
         if ((firstCharUpper == "A" || firstCharUpper == "E" || firstCharUpper == "I" || firstCharUpper == "O" || firstCharUpper == "U") && (color != "white"))
         {
            points += 50;
         }
         int asciiValue = (int)(name.charAt(name.length() - 1));
         System.out.println(asciiValue);
         if (asciiValue <  105 || color != "white")
         {
            points += 3000;
         }
         return points;
      }
   
   }