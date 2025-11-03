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
         System.out.println(grade("APeace", "white"));
         System.out.println(grade("WhirledPeas", "white"));
         System.out.println(grade("Oscar", "red"));
         System.out.println(grade("Amy", "white"));
         System.out.println(grade("Ben", "blue"));
      }
      
      public static int grade(String name,String color)
      {
         int points = 0;
         String firstChar = name.charAt(0)+"";
         String firstCharUpper = firstChar.toUpperCase();
         if ((firstCharUpper.equals("A") || firstCharUpper.equals("E") || firstCharUpper.equals("I") || firstCharUpper.equals("O") || firstCharUpper.equals("U")) && (color != "white"))
         {
            points += 50;
         }
         int asciiValue = (int)(name.charAt(name.length() - 1));
         if (asciiValue <  105 || color != "white")
         {
            points += 3000;
         }
         return points;
      }
   
   }