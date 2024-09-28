package programming;


//import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Programs {

    public static void main(String[] args) {

        //Java keywords to learn
        //Class(instance, static), Method(s)
        //Method or Function (argument, parameter, void, return)
        //Datatypes (string, integer, boolean, double, Object )
        //Constructor, Object
        //Access modifier (private, public , protected)
        //Operators (+ - /, * , %,  % is called Modulo. Modulo can be related to a division
        //String manipulation, Concatenation
        //Control statements can be divided in Selection, Iteration or Jump statements
        //Selection statements (if, switch-case)
        //Iteration statements (foreach, while, for)
        //Jump statements (break , continue, return )
        //Error handling (Try-catch statement)
        //Collections can be divided into Generic and Non-Generic
        //Generic collection (List<T>, HashMap, Array etc)
        //Non-Generic collection (ArrayList )
        //Object Oriented Programming {OOP} (Encapsulation, Polymorphism, Inheritance, Abstraction)
        //Debugging. Important one to learn
        //Read and write of data (Notepad and SQL Server Database)


        ////Task 1
        ////Write a computer program to add two numbers and display the result to the console
        ////Variables (placeholders = 3), datatypes (int), operator (+)
        Scanner userInput = new Scanner(System.in);
//        System.out.println("Please enter first number: ");
//        int firstNumber =userInput.nextInt();
//        System.out.println("First number is " +firstNumber);
//        System.out.println("Enter second number and press enter: ");
//        int secondNumber =userInput.nextInt();
//        int answer = firstNumber + secondNumber;
//        System.out.println("The answer is " +answer);

        ////Task 2
        ////Write a computer program to add any two numbers and display the result to the console
        ////Variables (placeholders = 3), datatypes (long), operator (+)
        System.out.println("Please enter first number: ");
        long firstNumber =userInput.nextInt();
        System.out.println("First number is " +firstNumber);
        System.out.println("Enter second number and press enter: ");
        long secondNumber =userInput.nextLong();
        long answer = firstNumber + secondNumber;
        System.out.println("The answer is " +answer);

        ////Task 3
        ////Write a computer program to multiply any three numbers and display the result to the console
        ////Variables (placeholders = 4), datatypes (long), operator (*)
//        System.out.println("A Computer program to multiply three numbers:");
//        System.out.println("Input the first number and press Enter");
//        long firstNumber = userInput.nextLong();
//        System.out.println("Input the second number and press Enter");
//        long secondNumber = userInput.nextLong();
//        System.out.println("Input the third number and press Enter");
//        long thirdNumber = userInput.nextLong();
//        long answer = firstNumber * secondNumber * thirdNumber;
//        System.out.println("Multiplication of three numbers  = " + answer);

        ////Task 4
        ////Write a computer program to divide any two numbers and display the result to the console
        ////Variables (placeholders = 3), datatypes (double), operator (/)
//        System.out.println("A Computer program to divide two numbers:");
//        System.out.println("Input the first number and press Enter");
//        double firstNumber = userInput.nextLong();
//        System.out.println("Input the second number and press Enter");
//        double secondNumber = userInput.nextLong();
//        double answer = firstNumber / secondNumber;
//        System.out.println("Division of two numbers  = " + answer);

        ////Task 5
        ////Write a computer program to find a modulo of two numbers and display the result to the console
        ////Variables (placeholders = 3), datatypes (double), operator (%)
//        System.out.println("A Computer program to divide two numbers:");
//        System.out.println("Input the first number and press Enter");
//        double firstNumber = userInput.nextLong();
//        System.out.println("Input the second number and press Enter");
//        double secondNumber = userInput.nextLong();
//        double answer = firstNumber % secondNumber;
//        System.out.println("Module of two numbers  = " + answer);

        ////Task 6
        ////Methods and Classes to solve a task
        ////Write a computer program to display to the console ITupskilling nine times.
        ////Put all your code in one method  (first way of doing it)

//        System.out.println("1. ITupskilling");
//        System.out.println("2. ITupskilling");
//        System.out.println("3. ITupskilling");
//        System.out.println("4. ITupskilling");
//        System.out.println("5. ITupskilling");
//        System.out.println("6. ITupskilling");
//        System.out.println("7. ITupskilling");
//        System.out.println("8. ITupskilling");
//        System.out.println("9. ITupskilling");

        ////Task 7
        ////Methods and Classes to solve a task
        ////Write a computer program to display to the console ITupskilling nine times.
        ////Use 3 new methods within this same class to do the task (second way of doing it)
        //MethodOne();
        //MethodTwo();
        //MethodThree();

        //Note
        //int age = 30;  //where int = datatype, age = variable, 30 is the data or value

        ////Task 8
        ////Methods and Classes to solve a task
        ////Write a computer program to display to the console ITupskilling nine times.
        ////Use 3 new methods. Put each method in a new class. You should have three new classes in total
        ////(third way of doing the same task)
        //// To reference a class, you need to create an instance of that class (called Object)
        //// This is not the only to reference a class but learn this one for now
//        firstClass firstClassObj = new firstClass();     //firstClassObj is called an Object
//        secondClass secondClassObj = new secondClass();
//        thirdClass thirdClassObj = new thirdClass();
//        firstClassObj.MethodOneClassOne();
//        secondClassObj.MethodTwoClassTwo();
//        thirdClassObj.MethodThreeClassThree();

        ////Task 9
        ////If-statement
        ////Write a computer program to ask a user to input an integer number and
        ////display to the console 'Even' or 'Odd' number based on the user data entry
//        System.out.println("Input an integer number and press enter");
//        int number = userInput.nextInt();
//        if (number % 2 == 0)       //any code within () must be true before code between {} can be executed
//        {
//            System.out.println("This is an even number");
//        }
//        else if (number % 2 == 1)
//        {
//            System.out.println("This is an odd number");
//        }


        ////Task 10
        //// Write a computer program to allow a user to input both firstname and lastname
        ////and display back their fullname
//        System.out.print("Input your firstname and press enter");
//        String firstName = userInput.nextLine();
//        System.out.println("Input your lastname and press enter");
//        String lastName = userInput.nextLine();
//        System.out.println("Your fullname is " + firstName + " " + lastName);


        ////Task 11
        //// Assignment number 1
        //// Write a computer program to ask a user for their Nationality and write back the
        //// followings to the console depends on the user's response:
        //// (1) If a user inputs 'UK', write back "You are from Europe"
        //// (2) If a user inputs 'Nigeria', write back "You are from Africa"
        //// (3) If a user inputs 'Mexico', write back "You are from Rest of the world"
        //// (4) If a user didn't give correct input, then write back "Your input is incorrect"
        //// Note that a user input does not have to be case sensitive for example treat
        //// 'nigeria' the same way you will treat 'NIGERIA' or 'Nigeria'
        ////Solution
//       System.out.println("What is your nationality e.g. UK, Nigeria, Mexico");
//        String countryOfOrigin = userInput.nextLine();
//        if (countryOfOrigin.equalsIgnoreCase("uk"))
//        {
//            System.out.println("You are from Europe");
//        }
//        else if (countryOfOrigin.equalsIgnoreCase("nigeria"))
//        {
//            System.out.println("You are from Africa");
//        }
//        else if (countryOfOrigin.equalsIgnoreCase("mexico"))
//        {
//            System.out.println("You are from Rest of the world");
//        }
//        else
//        {
//            System.out.println("Your input is incorrect");
//        }


        ////Task 12
        ////Try-Catch statement
        ////Write a computer program to ask a user to input an integer number and
        ////display to the console 'Even' or 'Odd' number based on the user data entry
        ////Enclose your code within try-catch statement for errors handling purpose
//   System.out.println("Input an integer number and press enter");
//    try
//    {
//        int number = userInput.nextInt();
//        if (number % 2 == 0)       //any code within () must be true before code between {} can be executed
//        {
//            System.out.println("This is an even number");
//        }
//        else if (number % 2 == 1)
//        {
//            System.out.println("This is an odd number");
//        }
//    }
//    catch (Exception e)
//    {
//        System.out.println("Please input an integer number only. No letters or decimals is allowed");
//        System.out.println(e.getMessage());
//    }
//
//    //Note
//    String firstName = "Leslie";
//    int age = 40;
//    double vat = 19.5;
//    Boolean isEnabled = true;
//    Boolean isLoaded = false;


        ////Task 13
        ////Switch-Case statement
        ////Write a computer program which allows a user to input a browser name (e.g IE, Firefox,
        ////or Chrome). Then the inputted browser name can be used to run test automation scripts
        ////Breakdown of tasks to do
        ////(1) Give a user an instruction around what to input
        ////(2) Collect user's input and store it to a variable of string datatype
        ////(3) Used the stored data to match one of the available conditions (i.e. browsers)
        ////(4) Execute the code within the matched condition

//
//        System.out.println("Input a browser (let it be one of IE, Firefox or Chrome");
//        String browserName = userInput.nextLine().toLowerCase();
//
//       switch (browserName)
//        {
//            case "ie":
//                System.out.println("Use Internet Explorer to run test automation scripts");
//                break;
//            case "firefox":
//                System.out.println("Use Firefox to run test automation scripts");
//                break;
//            case "chrome":
//                System.out.println("Use Google Chrome to run test automation scripts");
//                break;
//            default:
//                System.out.println("Use Safari browser to run test automation scripts");
//                break;
//
//        }


        //Debugging helps us to see what is going within our code at run time
        //You can make use of F8 (step over) and F7 (step into) for now
        //You need to decide (as a Programmer or a Test Analyst) on a line number that
        //you want debugging to start from (i.e. put a 'Break Point').
        //This Debugging thing is optional but from experience it will help you a lot
        //to become a better Test Automation Analyst if you can
        //incorporate it as part of your daily programming routine


        ////Task 14
        ////Use an If-statement to solve below task
        ////Write a computer program which allows a user to input a browser name (e.g IE, Firefox,
        ////or Chrome). Then the inputted browser name can be used to run test automation scripts
        ////Breakdown of tasks to do
        ////(1) Give a user an instruction around what to input
        ////(2) Collect user's input and store it to a variable of string datatype
        ////(3) Used the stored data to match one of the available conditions (i.e. browsers)
        ////(4) Execute the code within the matched condition
//        System.out.println("Input a browser (let it be one of IE, Firefox or Chrome");
//        String browserName = userInput.nextLine().toLowerCase();
//        if (browserName.equals("ie"))
//        {
//            System.out.println("Use Internet Explorer to run test automation scripts");
//        }
//        else if (browserName.equals("firefox"))
//        {
//            System.out.println("Use Firefox to run test automation scripts");
//        }
//        else if (browserName.equals("chrome"))
//        {
//            System.out.println("Use Google Chrome to run test automation scripts");
//        }
//        else
//        {
//            System.out.println("Use Safari browser to run test automation scripts");
//        }

        ////Task 15
        //// For-statement
        //// Write a computer program to generate numbers between 1 and 20 to the console
//        for (int i = 1; i <= 20; i++)
//        {
//            System.out.println(i);
//        }


        //Task 16
        // For-statement
        // Write a computer program to generate numbers between 1 and 20 to the console
        // Only display all even numbers
//        for (int i = 1; i <= 20; i++)
//        {
//            if (i % 2 == 0)
//            {
//               System.out.println(i);
//            }
//        }

        //Below demonstrate inefficient way of capturing group of data i.e. firstnames for 5 students
        //Collections can be used to capture below data in a more efficient way
        //Capture five student names and diplay them to the console
//        String firstName1 = "Eric";
//        String firstName2 = "Ola";
//        String firstName3 = "Leslie";
//        String firstName4 = "Francis";
//        String firstName5 = "Patrick";
//        System.out.println(firstName1);
//        System.out.println(firstName2);
//        System.out.println(firstName3);
//        System.out.println(firstName4);
//        System.out.println(firstName5);

        //Collections (List, Array, ArrayList, HashMap)

        ////Task 17
        ////An array can be used to group data of a known number. For example 5 students
        ////You can have arrays of different datatypes i.e. string, int, boolean, double etc
        //// string[] and int[] means arrays of string and arrays of integer respectively
        ////Capture five student names and diplay them to the console
//        String[] firstNames = new String[]{ "Eric", "Ola", "Leslie", "Francis", "Patrick" };
//       // System.out.println(firstNames); //this is not a way of displaying data in an array
//        //To display data to the console, you need to implement foreach-statement
//        for(Object firstName : firstNames)// you can use String as well instead of Object datatype
//        {
//            System.out.println(firstName);
//        }

        ////Task 18
        ////Capture five student ages and diplay them to the console
//        int[] ages = new int[] { 34, 45, 50, 33, 27 };
//        System.out.println(ages); //this is not a way of displaying data in an array
//        //To display data to the console, you need to implement foreach-statement
//        for (Integer age : ages)//you can use Object type in place of Integer
//        {
//            System.out.println(age);
//        }

        ////Task 19
        ////Capture five student ages and diplay them to the console
//        int[] ages = new int[] { 34, 45, 50, 33, 27 };
//        System.out.println(ages); //this is not a way of displaying data in an array
//        //only display age(s) that is above 40 to the console
//        for (Integer age : ages)
//        {
//            if (age > 40)
//            {
//                System.out.println(age);
//            }
//        }

        ////Task 20
        ////Declare arrays of 3 strings with no initial values
        ////Print those strings to the console using foreach statement
        ////Then assign values to 2 strings out of 3
        ////And print them to the console again
        ////Finally assign a value to the last variable of string
        ////And print them all to the console
//        String[] firstnames = new String[3];
//        for (String firstname : firstnames)
//        {
//            System.out.println(firstname);
//        }
//        System.out.println();
//        firstnames[0] = "Benji";
//        firstnames[2] = "Lucas";
//        for (String firstname : firstnames)
//        {
//            System.out.println(firstname);
//        }
//        System.out.println();
//        firstnames[1] = "Niyi";
//        for (String firstname : firstnames)
//        {
//            System.out.println(firstname);
//        }


        ////Task 21
        ////List (as a collection) can be used to manage group of data with similar datatypes
        ////Datatypes can be string, integer, boolean, double etc. This is not a fixed length
        ////collection (unlike an array). List can evolve (grow) i.e. you can add and remove
        ////data from a list
        ////Write a computer program to capture three student names and diplay them
        ////to the console.
        ////Add three more students to the list and display all of them to the console
        ////Remove 2 students from the list and display all of them to the console
//        List<String> firstNames = new ArrayList<>(Arrays.asList( "Kwame", "Olasupo", "Vivan" ));
//        for (Object firstName : firstNames)
//        {
//            System.out.println(firstName);
//        }
//        System.out.println();
//        firstNames.add("Francis");
//        firstNames.add("Benji");
//        firstNames.add("Anthony");
//        System.out.println();
//        for (String firstName : firstNames)
//        {
//            System.out.println(firstName);
//        }
//        System.out.println();
//        firstNames.remove("Kwame");
//        firstNames.remove("Olasupo");
//        for(String firstName : firstNames)
//        {
//            System.out.println(firstName);
//        }


        ////Task 22
        ////Write a computer program to capture three students age and diplay them
        ////to the console.
        ////Add three more students age to the list and display all of them to the console
        ////Remove 2 students age from the list and display all of them to the console
//        List<Integer> ages = new ArrayList<>(Arrays.asList( 33, 44, 50 ));
//        for (Integer age : ages)
//        {
//            System.out.println(age);
//        }
//        ages.add(28);
//        ages.add(31);
//        ages.add(45);
//        System.out.println();
//        for (Integer age : ages)
//        {
//            System.out.println(age);
//        }
//        System.out.println();
//        ages.remove(0); // is removing by index
//        ages.remove(1);
//        System.out.println();
//        for(Integer age : ages)
//        {
//            System.out.println(age);
//        }

////Task 23
        ////ArrayList, as a collection, can be used to manage a group of data with different
        ////datatypes in the list. For example, ArrayList allows int, String, boolean, double etc
        ////on the same list (as opposed to both Array and List which only allow single datatype)
        ////Write a computer program to print to the console a set of data with different datatypes
//        ArrayList mixedData = new ArrayList(Arrays.asList("Leslie", 34, true, 45.23 ));
//        for(Object data : mixedData)
//        {
//            System.out.println(data);
//        }
//
//        Integer age = 40;
//
//        System.out.println(age.toString());

        //Task 24
        //Write a computer program to print to the console only
        //integers set of data on the ArrayList
//        ArrayList mixedData2 = new ArrayList(Arrays.asList( "Leslie", 34, true, 30, 45.23, 45 ));
//        for(Object data : mixedData2)
//        {
//            if (data.toString().contains("true"))
//            {
//                System.out.println(data);
//            }
//        }

        ////Task 25
        ////Dictionary, as a collection, can be used to manage two data (i.e. Key and Value)
        ////for a single variable in a list. Two datatypes will be required when you have
        ////a dictionary declared. For example, StudentName and StudentMark will attract
        ////both string and integer respectively
        ////Write a computer program to capture students name with their marks
        ////Display to the console something like "Student Melvin has a mark of 70"
//        HashMap<String, Integer> studentMarks = new HashMap<>();
//        studentMarks.put("Melvin", 70);
//        studentMarks.put("Fehintola", 68);
//        studentMarks.put("Kenny", 73);
//        studentMarks.put("Test", 37);
//        for(Map.Entry<String, Integer> studentMark : studentMarks.entrySet())
//        {
//            System.out.println("Student " + studentMark.getKey() + " has a mark of " + studentMark.getValue());
//        }

        ////Task 26
        ////Write a computer program to capture students name with their marks
        ////Display to the console something like "Student Melvin has a mark of 70" for a student who
        ////scores more than 40 and below 70
//        HashMap<String, Integer> studentMarks = new HashMap<>();
//        studentMarks.put("Melvin", 70);
//        studentMarks.put("Fehintola", 68);
//        studentMarks.put("Kenny", 73);
//        studentMarks.put("Test", 37);
//        for( Map.Entry<String, Integer> studentMark : studentMarks.entrySet())
//        {
//            if (studentMark.getValue() > 40 && studentMark.getValue() < 70)
//            {
//                System.out.println("Student " + studentMark.getKey() + " has a mark of " + studentMark.getValue());
//            }
//        }

        ////Task 27
        ////While statement, as an iteration statement (like for, foreach), can be used to loop
        ////through a set of data so as to meet a certain condition
        ////Print Congratulation to the console 20 times using both for and while statement
//       System.out.println("Use of for statement");
//        for (int i = 1; i <= 20; i++)
//        {
//            System.out.println(i + " Congratulation");
//        }
//        System.out.println();
//        System.out.println("Use of While statement to do the work");
//        int counter = 1;
//        while (counter <= 20)
//        {
//            System.out.println(counter + " Congratulation");
//            counter++;
//        }

        ////Task 28
        ////Write a computer program to manage a user data input such that if an input is less
        ////than 20 then print 'Congratulations' to the console.
//        System.out.println("Input an integer number");
//        int number = userInput.nextInt();
//        while (number < 20)
//        {
//            System.out.println(number + " Congratulation");
//            break;
//        }

        ////Task 29
        ////Method or Function (void, return, parameter, argument)
        ////A void method is the one that returns no values whenever is called or referenced
        ////A method that is capable of giving back a value is called a return method
        ////A method that is capable of taking values when it is referenced can be referred to as
        ////a method with both parameter and argument.
        ////You can be asked at an interview for the difference between argument and parameter
        ////Answer: Parameter(s) are the variable(s) you declare at the point of creating a method
        ////While Argument(s) are the value(s) you give at the point of using that method
        ////
        ////Write a computer program to add two numbers. Create a method to do this in another
        ////class (use 'FirstClass'). Create two variables in the chosen class to get data
        ////for addition. Display addition result to the console
//        firstClass firstClassObj = new firstClass();
//        firstClassObj.Addition();


        ////Task 30
        ////Write a computer program to add two numbers. Create a method to do this in another
        ////class (use 'FirstClass'). Create two variables in the chosen class to get data
        ////for addition. Display addition result to the console
        ////Multiply the result by 5 and display answer to the console. Do the multiplication
        ////within Main method in the Program class
        //firstClass firstClassObj = new firstClass();
//        int result = firstClassObj.AddTwoNumbers();
//      System.out.println("Result of addition multiply by 5 = " + result * 5);


        ////Task 31
        ////Method (parameter and argument) //interview question
        ////Write a computer program to add two numbers. Create a method to do this task in another
        ////class (use 'FirstClass') such that the method takes two values (parameters) and use
        ////those values for addition
//        firstClass firstClassObj = new firstClass();
//        firstClassObj.AdditionOfTwoNumber(5,10);  //5 and 10 are arguments

        ////Task 32
        ////Class (instance or static)
        ////Instance class will allow you to create an object for it
        ////for example 'FirstClass', 'SecondClass' and 'ThirdClass' are all instance classes
        ////because we were able to create objects for them all. Please check line numbers
        ////124, 125 and 126 respectively
        ////Static class will not allow you to create an object for it i.e. there won't be
        ////an instance of a Static class. In addition to that, variable(s) and method(s) in
        ////a static class have to be static as well
        ////Write a computer program to create a Static class such that there is a method and a
        ////variable in that class. Reference (call) those method and variable from Main method
        ////within Program class. Add two years to the variable and print the result to the console
        //Static.MyAge();
        //int newAge = Static.age + 2;
        //System.out.println("He will be " + newAge + " in two years time");

        ////Task 33
        ////This is also a possible interview question
        ////Constructor is a method which has the same as the class. It does not have to be void
        //// or any type. It gets executed first when an instance of a class is created
        ////Write a computer program to create atleast two constructors in a class (create
        ////a new class called 'Constructor') and carry out addition of two numbers and
        ////addition of three numbers respectively. Allow those constructors to take parameters.
        ////Reference (or call) those constructors from Program class
        //Constructor constructorObj1 = new Constructor();
        //Constructor constructorObj2 = new Constructor(2,3);
        //Constructor constructorObj3 = new Constructor(3,3,3);

        ////Task 34
        ////String Manipulation
        ////Write a computer program to declare a string variable and use that variable
        ////for various things (around a string datatype is capable of)
//        System.out.println("Input a string value");
//        String value = userInput.nextLine();
//        //var newValue = value.Clone().ToString();
//        //System.out.println(newValue);
//        System.out.println(value.contains("ter")); //true or false = boolean
//        System.out.println(value.equals("London")); // boolean
//        System.out.println(value.length()); //gives back a number = 10
//        System.out.println(value.substring(0, 5)); //will print the first 4 letters from inputted value
//        System.out.println(value.substring(4, 7));//ignore the first 4 and take the next 3
//        System.out.println(value.getClass());


        ////Task 35
        ////Write a computer program to read data from file 'ReadFromAFile.txt' and
        ////display its content to the console
//        StringBuilder sb = new StringBuilder();
//
//        try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\olura\\workspace\\sampletests\\comexampleapplication\\src\\sampletext.txt"))) {
//            // read line by line
//            String line;
//            while ((line = br.readLine()) != null) {
//                sb.append(line).append("\n");
//            }
//        } catch (IOException e) {
//            System.err.format("IOException: %s%n", e);
//        }
//        System.out.println(sb);


        ////Task 36
        ////Write a computer program to write data to a text file 'WriteToAFile.txt' by
        ////readind the data from 'ReadFromAFile.txt'
//try{
//        List<String> list = Arrays.asList("Line 1", "Line 2");
//        Files.write(Paths.get("C:\\Users\\olura\\workspace\\sampletests\\comexampleapplication\\src\\samplewrite.txt"), list);
//    }catch(IOException e){
//    System.err.format("IOException: " +e);
//}


        ////Task 37
        ////Write a computer program to populate data to the 'Student' table using
        ////'Test' database within SQL Server Management Studio

//    try{
//        String url = "jdbc:sqlserver://LAPTOP-F3F6QJJ4\\SQLEXPRESS2014;databaseName=CourseManagementSystem.Models.SchoolContext;integratedSecurity=true";
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        Connection conn = DriverManager.getConnection(url);
//        if (conn!=null){
//            System.out.println("DB connected successfully");
//        }
//
//        String queryString = "Select * from Person where LastName = 'Rasaq'";
//       Statement sqlstatement = conn.createStatement();
//        ResultSet sqlresult = sqlstatement.executeQuery(queryString);
//       // System.out.print(sqlresult);
//        while(sqlresult.next()){
//            System.out.print(sqlresult.getString(3));
//        }
//    }catch(Exception e){
//    e.printStackTrace();


        ////Task 39
        ////Write a computer program to fetch data from 'Student' table using
        ////'Test' database within SQL Server Management Studio and display it to the console
//        for (Student data : fetchdatafromStudentTable()){
//            System.out.println("FirstName : "+data.firstName + " LastName :" +data.lastName);
//        }
//}

        ////Task 40
        ////Object Oriented Programming (OOP)
        ////Inheritance as part of OOP
        ////One class inherits behaviours (methods/functions) and attributes(variables or
        ////properties) of another class
        ////Class 1 = Person (firstname, lastname, age, address)
        ////Class 2 = Tutor(Instructor) inherits People class
        ////Write a computer program to manage both 'Person' and 'Tutor' classes attributes
        ////and behaviours such that Tutor class inherits Person class
        ////Create instances (Objects) of both classes and display to the console what they have
//        Tutor tutorObj = new Tutor();
//        Person personObj = new Person();
//        ////Give values to all attributes
////        tutorObj.personDetails(); = "Emmanuel";
//        tutorObj.setFirstName("Kum");
//        tutorObj.setLastName("Emmanuel");
//        tutorObj.setAge(52);
//        tutorObj.setCity("Leicester");
//        tutorObj.setInstructor("Teacher");
//        //Reference a method within the tutor class
//        tutorObj.personDetails();
//        tutorObj.tutorRole();


//        ////Task 41
//        ////Polymorphism (Overloading and Overriden)
//        ////Overloading is a concept of having more than one methods with
//        ////the same name but different signatures (parameters). At run time, depends on the
//        ////number of arguments a user supplies will determine a method that get called
//        ////Write a computer program to create a new class (called 'Test') such that
//        ////there are 3 methods (that can be used to add two, three and four numbers respectively)
//        ////in that class having the same name but different signatures
//        ////Create an instance of a 'Test' class so as to use the methods in it for addition
//        int firstNumber = 3;
//        int secondNumber = 4;
//        int thirdNumber = 5;
//        int fourthNumber = 6;
//        //Create an instance (Object) of Test class
//        Test testObj = new Test();
//        testObj.Addition(firstNumber, secondNumber);
//        testObj.Addition(firstNumber, secondNumber, thirdNumber);
//        testObj.Addition(firstNumber, secondNumber, thirdNumber, fourthNumber);


        ////Task 42
        ////Polymorphism (Overriden)
        ////Overriden is a concept of having two classes such that:
        ////One class (a subclass) inherits properties of another class (superclass)
        ////and they both have two methods with the same name.
        ////Superclass method should have a keyword 'virtual'
        ////while the subclass method will have a keyword 'override' for them to work
        ////
        ////This concept has helped us to break an odd which says 'You cannot have 2 classes
        ////with subclass-superclass relatioship having one method in each class with the
        ////the same name.
        ////
        ////Write a computer program to implement 'Amount' and 'Account' classes such that
        ////'Amount' class inherits 'Account' class with the same method 'Bonus'
        ////Then create objects of both classes and call method 'Bonus'
//        Account accountObj = new Account();
//        Amount amountObj = new Amount();
//        //accountObj.Bonus();
//        amountObj.Bonus();
//
//    }
//
//    public static List<Student> fetchdatafromStudentTable() {
//
//        List<Student> stddata = new ArrayList<>();
//
//        try {
//            String url = "jdbc:sqlserver://LAPTOP-F3F6QJJ4\\SQLEXPRESS2014;databaseName=CourseManagementSystem.Models.SchoolContext;integratedSecurity=true";
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            Connection conn = DriverManager.getConnection(url);
//            if (conn != null) {
//                System.out.println("DB connected successfully");
//            }
//
//            String queryString = "Select * from Person where LastName = 'Rasaq'";
//            Statement sqlstatement = conn.createStatement();
//            ResultSet sqlresult = sqlstatement.executeQuery(queryString);
//            // System.out.print(sqlresult);
//            while (sqlresult.next()) {
//                Student studendRecords = new Student();
//                studendRecords.firstName = sqlresult.getString(2);
//                studendRecords.lastName = sqlresult.getString(3);
//                stddata.add(studendRecords);
//            }
//            //  System.out.print(sqlresult.getString(3));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return stddata;


        //Index of practise//
        // understandIndexOf();


        //Convert double to int:

//        double myDouble = 9.78;
//        int myInt =(int) myDouble;
//        System.out.println(myInt);

        //find the square root:
//        int x = 16;
//        System.out.println(Math.sqrt(x));

     //   understandIndexOf();

    }

    public static void understandIndexOf() {

        String dashTab = "CATEGORIES_V2";
        String dashTab2 = "STOCK_V2";
        String dashTab3 = "LIVESTATUS_V2";

        String dashTabTrim = dashTab.substring(0,dashTab.indexOf("_V2"));

        /////Too long
        if (!dashTab.contains("_V2")){

            //do something
        }else if (dashTab.contains("_V")){
            //do something
        }


        // int   indexof1 = dashTab.matches("_V2");

        System.out.println("index of : " +dashTabTrim);

        //  List list = new ArrayList();
        //  list.add("Testing");
        // String sdsd  = (String) list.get(0);


    }
}

