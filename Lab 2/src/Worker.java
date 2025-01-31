public class Worker extends Person
{
    private double hourlyPayRate;

    public Worker(String ID, String FirstName, String LastName, int YOB, double hourlyPayRate)
    {
        super(ID, FirstName, LastName, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        if (hoursWorked <= 40)
        {
            return hoursWorked * hourlyPayRate;
        }
        else
        {
            return 40 * hourlyPayRate + (hoursWorked - 40) * hourlyPayRate * 1.5;
        }
    }

    public void displayWeeklyPay(double hoursWorked)
    {
        System.out.println(getFirstName() + "worked a total of " + hoursWorked + " hours and earned $" + calculateWeeklyPay(hoursWorked));
        if (hoursWorked > 40)
        {
            System.out.println(getFirstName() + "worked overtime for " + (hoursWorked - 40) + " hours and earned $" + (hoursWorked - 40) * hourlyPayRate * 1.5);
        }
    }


}
