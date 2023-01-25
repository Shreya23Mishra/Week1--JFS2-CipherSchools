import java.util.*;
public class Employee {
    int EmpId;
    int Salary;
    String dept;

    Employee(){
        EmpId = 10;
        Salary = 3000;
        dept = "testing";

    }
    public static void main(String[] args) {
        Employee harsh = new Employee();
        Employee bina = new Employee();

        System.out.println("EmpId"+harsh.EmpId +"Salary"+ harsh.Salary +"dept"+ harsh.dept  );
        System.out.println("EmpId"+bina.EmpId +"Salary"+ bina.Salary +"dept"+ bina.dept  );
    }
}