package PayrollSystem;
import java.util.ArrayList;
public class PayrollSystem{
    public static void main(String[] args){
        
        ArrayList<Employee>Employ= new ArrayList<>();
        
        Employ.add(new FullTimeEmployee("Ali",101,'M',3000,5,0));
        Employ.add(new PartTimeEmployee("Abu",102,'M',8,100,0));
        Employ.add(new Contractor("Siti",103,'F',2000,500,0));
        
        for (Employee e : Employ){
            e.displayInfo();
        }
    }
}