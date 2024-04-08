import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   public PolicyHolder(String fName, String lName, int a, String sStatus, double h, double w)
   {
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   public String toString()
   {
      String str = "Policyholder's First Name: " + firstName + "\n" +
                   "Policyholder's Last Name: " + lastName + "\n" +
                   "Policyholder's Age: " + age + "\n" +
                   "Policyholder's Smoking Status (Y/N): " + smokingStatus + "\n" +
                   "Policyholder's Height: " + height + " in inches\n" + 
                   "Policyholder's Weight: " + weight + " in pounds\n" +
                   "Policyholder's BMI: " + String.format("%.2f", calculateBMI());
      return str;
   }
   
   public double calculateBMI()
   {
      final double CONV_FACTOR = 703;
      return (weight * CONV_FACTOR) / (height * height);
   }
   
   public boolean isSmoker()
   {
      return smokingStatus.equalsIgnoreCase("smoker");
   }
   
   public int getAge()
   {
      return age;
   }
}
