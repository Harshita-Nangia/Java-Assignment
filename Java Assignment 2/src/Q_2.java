class Encapsulate{
    private String empName;
    private String empGender;

    public String getEmpName(){
        return empName;
    }

    public String getEmpGender(){
        return empGender;
    }

    public void setEmpGender(String newValue){
    	empGender = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

}
public class Q_2{
    public static void main(String args[]){
        Encapsulate obj = new Encapsulate();
         obj.setEmpName("Harshita Nangia");
         obj.setEmpGender("F");
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee Age: " + obj.getEmpGender());
    } 
}