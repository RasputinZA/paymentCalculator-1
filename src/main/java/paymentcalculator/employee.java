package paymentcalculator;

public class employee {

    double rate;
    String name, empNum;
    int hours;

    public employee()
    {

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmpNum(String empNum)
    {
        this.empNum = empNum;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }

    public String getName()
    {
        return name;
    }

    public String getEmpNum()
    {
        return empNum;
    }

    public double getRate()
    {
        return rate;
    }

    public int getHours()
    {
        return hours;
    }

    public void calculateSalary()
    {
        double sal = getRate() * 20;

        System.out.println("Name: " + getName() + "\nEmployee Number: " + getEmpNum() + " \nYour salary is R" + sal);
    }

    public void calculateWage()
    {
        double wag = getRate() * getHours();
        System.out.println("Name: " + getName() + "\n Employee Number: " + getEmpNum() + " \n Your wage is R" + wag);
    }

}
