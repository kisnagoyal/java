import java.util.Scanner;

class TaxCalc {
    // Personal information fields
    private String name;
    private String fatherName;
    private String panNumber;
    private String accountNumber;
    private String companyName;
    private String companyAddress;
    private double salary;

    // Constructor
    public TaxCalc(String name, String fatherName, String panNumber, String accountNumber, 
                         String companyName, String companyAddress, double salary) {
        this.name = name;
        this.fatherName = fatherName;
        this.panNumber = panNumber;
        this.accountNumber = accountNumber;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.salary = salary;
    }

    // Method to calculate tax for new tax regime
    public double calculateNewRegimeTax() {
        double tax = 0;

        if (salary <= 300000) {
            return tax;
        } else if (salary <= 600000) {
            tax += (salary - 300000) * 0.05;
        } else if (salary <= 900000) {
            tax += 300000 * 0.05;
            tax += (salary - 600000) * 0.10;
        } else if (salary <= 1200000) {
            tax += 300000 * 0.05;
            tax += 300000 * 0.10;
            tax += (salary - 900000) * 0.15;
        } else if (salary <= 1500000) {
            tax += 300000 * 0.05;
            tax += 300000 * 0.10;
            tax += 300000 * 0.15;
            tax += (salary - 1200000) * 0.20;
        } else {
            tax += 300000 * 0.05;
            tax += 300000 * 0.10;
            tax += 300000 * 0.15;
            tax += 300000 * 0.20;
            tax += (salary - 1500000) * 0.30;
        }

        return tax;
    }

    // Additional methods for old regime tax calculations can be added here

    // Display personal and tax information
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
        System.out.println("Salary: " + salary);
        System.out.println("Tax under New Regime: " + calculateNewRegimeTax());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input personal information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your father's name: ");
        String fatherName = scanner.nextLine();
        System.out.print("Enter your PAN number: ");
        String panNumber = scanner.nextLine();
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter your company name: ");
        String companyName = scanner.nextLine();
        System.out.print("Enter your company address: ");
        String companyAddress = scanner.nextLine();
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Create TaxCalculator object
        TaxCalc calculator = new TaxCalc(name, fatherName, panNumber, accountNumber, companyName, companyAddress, salary);

        // Display information and calculated tax
        calculator.displayInformation();
    }
}
