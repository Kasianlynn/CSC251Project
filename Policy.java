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
      
   
