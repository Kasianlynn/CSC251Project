public class Demo
{
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

