import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 12;

        if(x < 10 ) {
            System.out.print("A");

            if(x < 20)  {
                System.out.print("E");
            } else {
                System.out.print("X");
            }

        } else {
            System.out.print ("Z");
        }



    }

    }



//Scanner scanner = new Scanner(System.in);
//int secretNumber = 7;  // The number to guess
//int userGuess = 0;  // Initialize with a number that is not the secret number
//
//// While loop that keeps running until the correct guess
//        while (userGuess != secretNumber) { // Exit condition
//        System.out.print("Guess the number from 1 to 9: ");
//userGuess = scanner.nextInt(); // Get input from user
//
//            if (userGuess != secretNumber) {
//        System.out.println("Wrong guess, try again!");
//            }
//                    }
//
//                    System.out.println("Congratulations! You guessed the correct number."); // Congratulate the user
//        scanner.close();  // Close the scanner after use





//        // The string given
//        String stringToReverse = "madam";
//        // The string to contain the reversed string
//        String reversed = "";
//        for (int indexPosition = stringToReverse.length() - 1; indexPosition >= 0; indexPosition--) {
//            char ch = stringToReverse.charAt(indexPosition);
//            reversed = reversed + ch;
//
//
//        }
//        if (stringToReverse.equals(reversed)) {
//            System.out.println(stringToReverse + " is a palindrome.");
//        } else {
//            System.out.println(stringToReverse + " is not a palindrome.");
//        }
//        System.out.println("The reverse of " + stringToReverse + " is: " + reversed);
//
//
//    }
//}


















//        /** TODO 2: Create a Scanner variable named "keyboard" **/
//        Scanner keyboard = new Scanner(System.in);
//
//        /** TODO 3: A variable for getting the day of the week is given below **/
//        /**         Initialize the variable to have the value 1 **/
//        /** 1- is Monday, 2- is Tuesday and so on **/
//        int dayOfTheWeek = 1;
//        int subChoice;
//
//        /** TODO 4: Display a menu to get the day of the week from the user **/
//        /**
//         ********** MENU *****************
//         These are the choices for week of the day. \n Please enter only values from 1-7:
//         1. MONDAY
//         2. TUESDAY
//         3. WEDNESDAY
//         4. THURSDAY
//         5. FRIDAY
//         6. SATURDAY
//         7. SUNDAY
//         ***********************************
//         **/
//        System.out.println("These are the days of the week: \n" +
//                 "1.Monday\n"
//                + "2.Tuesday\n"
//                + "3.Wednesday\n"
//                + "4.Thursday\n"
//                + "5.Friday\n"
//                + "6.Saturday\n"
//                + "7.Sunday\n"
//        +"Please enter only values from 1 to 7");
//
//        /** TODO 5: Prompt Toni for input. Also let Toni know the valid choices like (1-7). **/
//        System.out.println("Enter your choice of the day (1-7): ");
//        dayOfTheWeek = keyboard.nextInt();
//
//        /** TODO 6: Create a switch with case values from 1-7 to handle the schedule **/
//        /**         for the input in "dayOfTheWeek" **/
//        switch (dayOfTheWeek) {
//            case 1:
//                System.out.println("Monday: It is back to work.....");System.out.println("Did you have your breakfast?");
//
//                /** TODO 9 Solution Start: Move below the display "Monday: It is back to work....." **/
//                System.out.println("************ SUB MENU *****************");
//                System.out.println("1. Yes, I had my breakfast");
//                System.out.println("2. No, I would like one ");
//                System.out.println("****************************************");
//
//                /** TODO 10 Solution Start: After the sub-menu inside case 1, prompt for input on choice **/
//                System.out.println("Enter choice (1 or 2):");
//                subChoice = keyboard.nextInt();
//
//                /** TODO 11 Solution Start: Display appropriate response to Toni, based on value in **/
//                switch (subChoice) {
//                    case 1:
//                        System.out.println("Good. Now you have a catchup meeting at 9 A.M. Prepare your notes. ");
//                        break;
//                    case 2:
//                        System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
//                        break;
//                    default :
//                        //user has entered a value which is neither 1 nor 2
//                        System.out.println("NO such choice available");
//                }
//
//                /** TODO 7 Solution Start: Introduce a "break" after each case code, except the last  **/
//                break;
//
//            /** TODO 6(a): Implement all other cases for Tuesday to Sunday **/
//            case 2:
//                System.out.println("Tuesday: It is time to code");
//                break;
//
//            case 3:
//                System.out.println("Wednesday: I will be working with frontend today");
//                break;
//            case 4:
//                System.out.println("Thursday: I will recap with my javascript code");
//                break;
//            case 5:
//                System.out.println("Friday: i will organise my files on extern hdd all day");
//                break;
//            case 6:
//                System.out.println("Saturday: chill day");
//                break;
//            case 7:
//                System.out.println("Sunday: talk to my boy today");
//                break;
//            default:
//                System.out.println("Please enter only values from 1 to 7");
//
//
//            /** TODO 6(b): Implement "default" to handle Toni entering  **/
//            /**            values less than 1 or more than 7 **/
//        }
//
//        /** TODO 7: Introduce a "break" after each case code, except the last  **/
//
//        /** TODO 8: Go below the TODO 2 after the creation of Scanner variable  **/
//        /**         and declare a variable "subChoice" **/
//
//        /** TODO 9: Move below the display "Monday: It is back to work....." **/
//        /**         in case 1 and create a menu  **/
//        /** The sub-menu inside case 1 show appear as below:
//         *********** SUB MENU FOR MONDAY ******
//         * 1. Yes, I had my breakfast
//         2. No, I would like one
//         **************************************
//         **/
//
//        /** TODO 10: After the sub-menu inside case 1, prompt for input on choice **/
//        /**         from Toni and store it in the variable subChoice **/
//
//        /** TODO 11: Display appropriate response to Toni, based on value in **/
//        /**          variable subChoice using if, if-else, else **/
//        /**
//         1. When subChoice has value of 1 display -
//         Good. Now you have a catchup meeting at 9AM Prepare your notes
//
//         2. When subChoice has value of 2 display -
//         Lets us divert on Highway 54 and have a Burger on the drive in
//
//         3. When subChoice has any other value then 1 or 2 display -
//         NO such choice available
//         **/
//    }
//
//












































//
//        int moneyLeftWithToni = 500;
//
//        if (moneyLeftWithToni >= 300) {
//            System.out.println("Go to Las Vegas");
//            System.out.println("Enjoy some luck games");
//            System.out.println("Enjoy some concerts");
//            System.out.println("Enjoy fine dining");
//            System.out.println("Go on a helicopter ride");
//            System.out.println("Go shop some souvenirs");
//
//        } else if (moneyLeftWithToni >= 200) {
//            System.out.println("Go to Hoover Dam");
//
//        } else if (moneyLeftWithToni >= 100) {
//            System.out.println("go to Area 51");
//
//        } else if (moneyLeftWithToni >= 50) {
//            System.out.println("Have an ice cream");
//
//        } else {
//            System.out.println("think about the money spent");
//
//        }
        // Put your else-if statements here.
        // Advice: Use best practice and use curly braces always.
        // Tip 1: The 2nd condition needs to be checked for only >=200.
        // Since it moves 1st else-if only when the value is < 300.
        // Tip 2: The 3rd condition needs to be checked for only >=100.
        // Tip 3: The 4th condition needs to be checked for only >=50.
        // Tip 4: Last condition can be an else. It will cover everything.

//        System.out.println("On trip to parents.");
//    }


//        int moneyLeftWithToni = 200;
//
//        if( moneyLeftWithToni >= 300 ) {
//            System.out.println("Go to Las Vegas");
//
//        }
//            System.out.println("Enjoy some luck games");
//            System.out.println("Enjoy some concerts");
//            System.out.println("Enjoy fine dining");
//            System.out.println("Go on a helicopter ride");
//            System.out.println("Go shop for some souvenirs");
//
//
//
//
//        System.out.println("On trip to parents.");


    //TODO 1: Declare and initialize variable for First Name
//        String firstName = "John";
//
//        //TODO 1: Declare and initialize variable for Last Name
//        String lastName = "Doe";
//
//        //TODO 1: Declare and initialize variable for Movie Title
//        String movieTitle = "The Godfather";
//
//        //TODO 1: Declare and initialize variable for Number of tickets
//        int numberOfTickets = 10;
//        System.out.println("Number of tickets: " + numberOfTickets);
//
//        //TODO 1: Declare and initialize variable for Price per ticket
//        double pricePerTicket = 10.5;
//        System.out.println("Price per ticket: " + pricePerTicket);
//
//        //TODO 2: Calculate the total price based on number of tickets and price per ticket. Print the output of the total price
//        double totalPrice = pricePerTicket * numberOfTickets;
//        System.out.println("Total price of tickets: " + totalPrice);
//
//        //TODO 3: Concatenate first name and last name into new variable username with no space in between
//        // first and last name and convert them to lower case
//        String username = firstName + " " + lastName;
//        System.out.println("Username is " + username.toLowerCase());
//
//
//        // TODO 4: Convert the movie title to upper case and assign to variable movieName
//        String movieName = movieTitle.toUpperCase();
//        System.out.println("Movie title is " + movieName);
//
//        // TODO 5: Write multiple print statements to match your output as per the Final Expected Output
//
//        System.out.println("Movie title is " + movieName);
//        System.out.println("Ticket price is " + pricePerTicket);
//        System.out.println("Available tickets is " + numberOfTickets);


//        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};
//        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};
//
//        System.out.println("Superheroes: " + Arrays.toString(superheroes));
//        System.out.println("Introduction year: " + Arrays.toString(introductionYears));
//
//        System.out.println("Original superhero name at position 3: "+ superheroes[2]);
//
//
//        System.out.println("Modify the third superheroes: " + (superheroes[2] = "Thor"));


//        String text = "Adventure";
//        // TODO: Check the length using length() and print the length
//        System.out.println("The length of the text is: " + text.length());
//        // TODO: Get the character at position 3 and print the character
//        System.out.println("The character at index 3: " + text.charAt(2));
//        // TODO: Get a part of the String from position 1 to 4 and print the string
//        System.out.println("The substring from position 1 to 4: " + text.substring(0, 4));
//
//
//
//        String anotherText= "Adventure";
//        // TODO: Compare text with anotherText using equals() and print the output
//        System.out.println("Compere text to anotherText if is equal: " + text.equals(anotherText));
//        // TODO: Change to uppercase using toUpperCase() and print the converted string
//        System.out.println("Change to uppercase: " + anotherText.toUpperCase());
//        // TODO: Change to lowercase using toLowerCase() and print the converted string
//        System.out.println("Change to lowercase: " + anotherText.toLowerCase());
//        // TODO: Check if it contains "vent" using contains() and print the output
//        System.out.println("Check if it contains the word: " + anotherText.contains("vent"));
//        // TODO: Replace 'e' with 'a' and print the output
//        System.out.println("Replace the character with the word: " + anotherText.replace("e", "a"));

//        String firstName = "Harry";
//        String lastName = "Grow";
//        String email = "harry.grow@exemple.com";
//
//        String username = firstName + "" + lastName;
//        System.out.println("toLowerCase: " + username.toLowerCase());
//
//        System.out.println("replace the string: " + email.replace("example.com", "gmail.com"));
//
//        System.out.println("Find the index of @: " + email.indexOf('@'));


//}


