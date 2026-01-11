package PayrollSystem;
class Contractor extends Employee{
    private double contractSalary;
    private double bonus;
    private double fine;
    
    public Contractor(String name,int id,char gender,double contractSalary,double bonus,double fine){
        super(name,id,gender);
        this.contractSalary=contractSalary;
        this.bonus=bonus;
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
        return contractSalary+bonus-fine;
    }
}