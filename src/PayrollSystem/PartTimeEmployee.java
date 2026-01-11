package PayrollSystem;
class PartTimeEmployee extends Employee{
    private double hourSalary;
    private int hours;
    private double fine;
    
    public PartTimeEmployee(String name,int id,char gender,double hourSalary,int hours,double fine){
        super(name,id,gender);
        this.hourSalary=hourSalary;
        this.hours=hours;
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
        return hourSalary*hours-fine;
    }
}