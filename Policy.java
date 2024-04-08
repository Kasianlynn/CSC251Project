public class Policy
{  //fields
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   private double policyPrice;
   private static int numberOfPolicies = 0;


   /**
   No-arg constructor that explicitly initializes all fields
   */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      policyHolder = new PolicyHolder("", "", 0, "", 0, 0);//Empty policy holder
      policyPrice = 0.0;

   }
   
   /**
   Constructor that accepts arguments for each field
   @param pNumber The Policy number
   @param pName The Policy Provider's Name
   @param fName The Policyhodler's first name
   @param lName The Policyholder's last name
   @param a The Policyholder's age
   @param sStatus The Policyholder's smoking status
   @param h The Policyholder's height
   @param w The Policytholder's weight
   */
   public Policy(String pNumber, String pName, String fName, String lName,int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      policyHolder = new PolicyHolder(fName, lName, a, sStatus, h, w);
      policyPrice = calculatePrice();
      numberOfPolicies++;
   }
   
   public static int getNumberOfPolicies()
   {
      return numberOfPolicies;
   }
   
   public PolicyHolder getPolicyHolder()
   {
      return policyHolder;
   }
   
   
   //Implement price calculation
   public double calculatePrice()
   {
     double baseFee = 600.0; //Base fee for the policy
     double additionalFee = 0.0; //Additional fee based on age, smoking status, and BMI
     
     //Check age
     if (policyHolder.getAge() > 50)
     {
         additionalFee += 75.0;
     }
     
     //Check smoking status
     if(policyHolder.isSmoker())
     {
      additionalFee += 100.0;
     }
     
     //Check BMI
     double bmi = policyHolder.calculateBMI();
     if (bmi > 35)
     {
         additionalFee += (bmi - 35) * 20;
     }
     
     return baseFee + additionalFee;
   }
   
   public String toString()
   {
      String str = "Policy Number: " + policyNumber + "\n" + "Provider Name: " + providerName + "\n" + policyHolder.toString() + "\n" + "Policy Price: $" + String.format ("%.2f\n", policyPrice);
      return str;
   }

}
