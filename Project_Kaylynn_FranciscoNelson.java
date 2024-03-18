
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.File;

public class Demo
{
/**
*   Asks user for input and reads input
*   plugs input into Policy class
*   Displays poolicy details
*/
   public static void main(String[] args) throws IOException
   {
      //List to store Policy objects
      List<Policy> policies = new ArrayList<>();

      //Read policy information from file
      File file = new File("CSC251Project/PolicyInformation.txt");
      Scanner keyboard = new Scanner(File);

      while(scanner.hasNextLine())
         {
            int policyNumber = keyboard.nextInt();
            keyboard.nextLine(); //consume newline character
            String providerName = keyboard.nextLine();
            String firstName = keyboard.nextline();
            String lastName = keyboard.nextLine();
            int age = keyboard.nextInt();
            keyboard.nextLine(); //consume newline character
            String smokingStatus = keyboard.nextLine();
            double height = keyboard.nextDouble();
            keyboard.nextLine(); //consume new line character
            double weight = keyboard.nextDouble();
            keyboard.nextLine(); //consume new line character

            //Create Policy object and set parameters
             Policy policy = new  Policy();

            policy.setPolicyNumber(policyNumber);
            policy.setProviderName(providerName);
            policy.setFirstName(firstName);
            policy.setLastName(lastName);
            policy.setAge(age);
            policy.setHeight(height);
            policy.setWeight(weight);

            //add policy to object list
            
            policies.add(policy);
         }
      
      //Display information from policy information file
      for (Policy policy : policies)
         {
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policy Holder's First Name: " + policy.getFirstName());
            System.out.println("Policy Holder's Last Name: " + policy.getLastName());
            System.out.println("Policy Holder's Age: " + policy.getAge());
            System.out.println("Policy Holder's Height: " + policy.getHeight());
            System.out.println("Policy Holder's Weight: " + policy.getWeight()); 
         }

      //count number of smokers and non-smokers
      int smokerCount = 0;
      int nonSmokerCount = 0;

      for (Policy policy : policies)
         {
            for ("smoker".equalsIgnoreCase(policy.getSmokingStatus()))
            {
                 smokerCount++;
            }
            
            else
            {
               nonSmokerCount++;
            }
         }

      //Display smoker and non-smoker numbers
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

   }
}
