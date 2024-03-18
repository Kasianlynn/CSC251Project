import java.util.Scanner;

public class Policy
{

      //fields
      private int policyNumber;
      private String providerName;
      private String firstName;
      private String lastName;
      private int age;
      private String smokingStatus;
      private double height;
      private double weight;

      //Construct new Policy object with default values
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

      //@param policyNumber set policy number
       public void setPolicyNumber(int policyNumber)
      {
         this.policyNumber = policyNumber;
      }

      //@param providerName set privder name
      public void setProviderName(String providerName)
      {
         this.providerName = providerName;
      }


      //@param firstName set policy holder's first name
      public void setFirstName(String firstName)
      {
         this.firstName = firstName;
      }

      //@param lastName set polic holder's last name
      public void setLastName(String lastName)
      {
         this.lastName = lastName;
      }

      //@param age set policy holder's age
      public void setAge(int age)
      {
         this.age = age;
      }

      //@param smokingStatus set policy holder's smoking status (smoker or non-smoker)
      public void setSmokingStatus(String smokingStatus)
      {
         this.smokingStatus = smokingStatus;
      }

      //@param height set policy holder's height in inches
      public void setHeight(double height)
      {
         this.height = height;
      }


      //@param weight set policy holder's weight in pounds
      public void setWeight(double weight)
      {
         this.weight = weight;
      }
      
      
      //@return the policy number
      public int getPolicyNumber()
      {
         return policyNumber;
      }

      //@return the Provider name
      public String getProviderName()
      {
         return providerName;
      }

      //@return the first name of the policy holder
      public String getFirstName()
      {
         return firstName;
      }

      //@return the last name of the policy holder
      public String getLastName()
      {
         return lastName;
      }

      //@return the age of the policy holder
      public int getAge()
      {
         return age;
      }


      //@return the smoking status of the policy holder
      public String getSmokingStatus()
      {
         return smokingStatus;
      }


      //@return the height of the policy holder
      public double getHeight()
      {
         return height;
      }


      //@return the weight of the policy holder
      public double getWeight()
      {
         return weight;
      }

      /**
      * Calculates the policy holder's BMI based on the height and weight
      *@param height The height in inches
      *@param weight The weight in pounds
      *@return The calulated BMI
      */
      public double calculateBMI(double weight, double height)
      {
         return (weight * 703) / (height * height);
      }

      /**
      * Calulate the insurance price based on baseFee and additional fees
      *@return The calculated insurance price
      */
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
