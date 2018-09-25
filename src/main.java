import java.util.Scanner;

public class main {

    public static void main(String [] args)
    {
        int numOfGuess = 0;

        System.out.println("Hello, what is your first name?");
        Scanner firstName = new Scanner(System.in);
        String name = firstName.nextLine();
        System.out.println("Hello "  + name);

        System.out.println("Type 1 if you want guess, Type 2 if you want me to guess");
        Scanner input = new Scanner(System.in);
        int gameChoice = input.nextInt();

        if (gameChoice == 1)
        {
            numOfGuess = 1;
            double randomDouble = Math.random() * 100 ;
            int random = (int)randomDouble;
            System.out.println(random);
            System.out.println("Alright, I am thinking of a number from 1 - 100. Can you try to guess " + name + "?");
            Scanner userGuess = new Scanner(System.in);
            int guess =  userGuess.nextInt();

            while (guess != random)
            {
                System.out.println("That's not the right number, try again " + name);
                numOfGuess++;
                guess =  userGuess.nextInt();
            }

            if (guess == random)
            {
                System.out.println("Congrats "+ name + "!" + "You've got my number!");
                System.out.println("You took " + numOfGuess + " tries.");
            }
        }

        if (gameChoice == 2)
        {
            numOfGuess = 1;
            int lowerBunk = 0;
            int upperBunk = 100;
            int avg = (lowerBunk + upperBunk) / 2;

            double randomDouble = Math.random() * 100 ;
            int random = (int)randomDouble;
            System.out.println(random);
            System.out.println("Hi " + name + "! Is your number higher or lower than " + avg);

            while (avg != random)
            {
                Scanner answer = new Scanner(System.in);
                String aiAnswer = answer.nextLine();

                if (aiAnswer.equals("lower"))
                {
                    numOfGuess++;
                    upperBunk = avg;
                    avg = (lowerBunk + upperBunk) / 2;
                    System.out.println(avg);
                    System.out.println("Is your number higher or lower than " + avg);
                }
                if (aiAnswer.equals("higher"))
                {
                    numOfGuess++;
                    lowerBunk = avg;
                    avg = (lowerBunk + upperBunk) / 2;
                    System.out.println(avg);
                    System.out.println("Is your number higher or lower than " + avg);
                }
            }
            System.out.println("Correct! Attemps : " + numOfGuess);
        }
    }
}
