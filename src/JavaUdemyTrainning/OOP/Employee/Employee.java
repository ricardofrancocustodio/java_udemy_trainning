package JavaUdemyTrainning.OOP.Employee;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;
    private double increaseSal;

    public Employee(){

    }

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        increaseSal = (grossSalary / 100) * percentage;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getGrossSalary(){
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }

    public  double getTax(){
        return tax;
    }

    public void setTax(double tax){
        this.tax =  tax;
    }

    @Override
    public String toString(){
        return "Employee: " + name + ", $" + (netSalary() + increaseSal);
    }

    public String updatedSalary(){
        return "Updated Employee: " + name + ", $" + (increaseSal + netSalary());
    }

}
