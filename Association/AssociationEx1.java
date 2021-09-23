public class Bank{
    private String bankName;

    Bank(String bankName){
        this.bankName = bankName;
    }
    public String getBankName() {
        return bankName;
    }
}
class Employee{
    private String empName;
    Employee(String empName){
        this.empName = empName;
    }
    public String getEmpName() {
        return empName;
    }
}
// Association between both the classes in main method
public class AssociationEx1 {
    public static void main(String[] args) {
        Bank name = new Bank("HDFC");
        Employee name1 = new Employee("sathsh");
        System.out.println(name1.getEmpName()+ " is an employee of " + name.getBankName()+ "Bank");
    }
}
