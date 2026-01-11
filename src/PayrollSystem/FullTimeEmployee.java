package PayrollSystem;
class FullTimeEmployee extends Employee{
    private double monthlySalary;
    private int years;
    private double fine;
    
    public FullTimeEmployee(String name,int id,char gender,double monthlySalary,int years,double fine){
        super(name,id,gender);
        this.monthlySalary=monthlySalary;
        this.years=years;
        this.fine=fine;
    }
    
    @Override
    public int getID(){
        return id;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public char getGender(){
        return gender;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary+years*100-fine;
    }
}