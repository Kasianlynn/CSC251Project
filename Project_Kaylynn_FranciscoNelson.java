import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.*;

public class PolicyDemo
{
   public static void main(String[] args) throws IOException
   {
      String policyNumber, providerName, firstName, lastName, smokingStatus;
      int age;
      double height, weight;

      
      //ArrayList to store Policy objects
      ArrayList<Policy> policyList = new ArrayList<>();
      
      //create and open the file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //process all information in the file
      while(inputFile.hasNext())
      {
      
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         //make sure we haven't hit the end of the file before trying to skip the blank line
         if(inputFile.hasNext())
            inputFile.nextLine();
            inputFile.nextLine();
        
            
         //create a Policy object and add it to our ArrayList
         policyList.add(new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight));
      
      }
      
      inputFile.close();
      
      int numSmokers = 0;
      
      //print out information about each Policy object
      for(Policy policy : policyList)
      { 
        System.out.println(policy);         
         if(policy.getPolicyHolder().isSmoker())
           numSmokers++;
      }
      
      System.out.println("There were " + Policy.getNumberOfPolicies() + " policy objects created.");
      System.out.println();
      //print out the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );
   }
}
