public class SalaryWorker extends Worker
{
    public double annualSalary;

    public SalaryWorker(String ID, String FirstName, String LastName, int YOB, double annualSalary)
    {
        super(ID, FirstName, LastName, YOB, annualSalary);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked)
    {
        
    }
}
