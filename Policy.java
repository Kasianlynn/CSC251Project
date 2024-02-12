import java.util.Scanner;

public class Policy
{

      private int policyNumber;
      private String providerName;
      private String firstName;
      private String lastName;
      private int age;
      private String smokingStatus;
      private double height;
      private double weight;

      public Policy()
      {
         policyNumber = 0;
         providerName = "";
         firstName = "";
         lastName = "";
         age = 0;
         smokingStatus = "";
         height = 0;
         weight = 0;
      }
      
       public void setPolicyNumber(int policyNumber)
      {
         this.policyNumber = policyNumber;
      }
      
      public void setProviderName(String providerName)
      {
         this.providerName = providerName;
      }
      
      public void setFirstName(String firstName)
      {
         this.firstName = firstName;
      }
      
      public void setLastName(String lastName)
      {
         this.lastName = lastName;
      }
      
      public void setAge(int age)
      {
         this.age = age;
      }
      
      public void setSmokingStatus(String smokingStatus)
      {
         this.smokingStatus = smokingStatus;
      }
      
      public void setHeight(double height)
      {
         this.height = height;
      }
      
      public void setWeight(double weight)
      {
         this.weight = weight;
      }
      
      
      
      public int getPolicyNumber()
      {
         return policyNumber;
      }
      
      public String getProviderName()
      {
         return providerName;
      }
      
      public String getFirstName()
      {
         return firstName;
      }
      
      public String getLastName()
      {
         return lastName;
      }
      
      public int getAge()
      {
         return age;
      }
      
      public String getSmokingStatus()
      {
         return smokingStatus;
      }
      
      public double getHeight()
      {
         return height;
      }
      
      public double getWeight()
      {
         return weight;
      }
      
      public double calculateBMI(double weight, double height)
      {
         return (weight * 703) / (height * height);
      }
      
      public double calculateInsurancePrice()
      {
         double baseFee = 600.0;
         double additionalFee = 0.0;
         
         if (age > 50)
         {
            additionalFee += 75.0;
         }
         
         if (smokingStatus.equalsIgnoreCase("smoker"))
         {
            additionalFee += 100.0;
         }
         
         double bmi = calculateBMI(weight, height);
         
         if (bmi > 35)
         {
            additionalFee += (bmi - 35) * 20;
         }
         
         return baseFee + additionalFee;
      } 
      
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
       Policy project = new  Policy();
      
      
      System.out.println("Please enter the Policy Number: ");
      int policyNumber = keyboard.nextInt();
      keyboard.nextLine();
      project.setPolicyNumber(policyNumber);
      
      System.out.println("Please enter the Provider Name: ");
      String providerName = keyboard.nextLine();
      project.setProviderName(providerName);
      
      System.out.println("Please enter the Policyholder's First Name: ");
      String firstName = keyboard.nextLine();
      project.setFirstName(firstName);
      
      System.out.println("Please enter the Policyholder's Last Name: ");
      String lastName = keyboard.nextLine(); 
      project.setLastName(lastName);
      
      System.out.println("Please enter the Policyholder's Age: ");
      int age = keyboard.nextInt();
      keyboard.nextLine();
      project.setAge(age);
      
      System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = keyboard.nextLine();
      project.setSmokingStatus(smokingStatus);
     
      System.out.println("Please enter the Policyholder's Height (in inches): ");
      double height = keyboard.nextDouble();
      project.setHeight(height);
      
      System.out.println("Please enter the Policyholder's Weight (in pounds): ");
      double weight = keyboard.nextDouble();
      project.setWeight(weight);
      
            
      System.out.println("Policy Number: " + project.getPolicyNumber());
      System.out.println("Provider Name: " + project.getProviderName());
      System.out.println("Policyholder's First Name: " + project.getFirstName());
      System.out.println("Policyholder's Last Name: " + project.getLastName());
      System.out.println("Policyholder's Age: " + project.getAge());
      System.out.println("Policyholder's Smoking Status: " + project.getSmokingStatus());
      System.out.println("Policyholder's Height: " + project.getHeight());
      System.out.println("Policyholder's Weight: " + project.getWeight());
      
      double bmi = project.calculateBMI(project.getWeight(), project.getHeight());
      System.out.printf("Policyholder's BMI %.2f\n", bmi);
      
      double policyPrice = project.calculateInsurancePrice();
      System.out.printf("Policy Price: $%.2f\n", policyPrice);
      
   }
   


}      

      

