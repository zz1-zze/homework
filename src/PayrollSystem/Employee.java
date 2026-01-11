package PayrollSystem;
abstract class Employee {
    protected String name;
    protected int id;
    protected char gender;
    
    public Employee(String name,int id,char gender){
        this.name=name;
        setID(id);
        setGender(gender);
    }
    
    public void setID(int id){
        if(id<0){
            throw new IllegalArgumentException("Invalid id");
        }
        this.id=id;
    }
    public void setGender(char gender){
        if(gender=='F'){
            this.gender=gender;
        }else{
            this.gender='M';
        }
    }
    
    public abstract int getID();
    public abstract String getName();
    public abstract char getGender();
    public abstract double calculateSalary();
    
    public void displayInfo() {
        System.out.printf("ID    : %d\nName  : %s\nGender: %c,Salary: RM%4.2f\n\n",getID(),getName(),getGender(),calculateSalary());
    }
}
