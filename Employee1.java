import java.util.Arrays;
import java.util.List;

class Employee1 {
    private int empId;
    private String empName;
    private String empDesignation;
    private long empSalary;
    private String empLocation;

    Employee1(int empId, String empName,String empDesignation,long empSalary,String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }
}

class EmployeeMain{
    public static void main(String[] args) {
        List<Employee1> list1 = Arrays.asList(
           new Employee1(1,"Vijay","DevOps",100000,"Bangalore"),
           new Employee1(2,"Abhi","Data Science",20000,"Guntur"),
           new Employee1(3,"Kaushik","Data Analyst",25000,"Ongole"),
           new Employee1(4,"Praveen","Software",50000,"Omgole"),
           new Employee1(5,"Mahesh","Electric Engineer",100000,"Mangalore"),
           new Employee1(6,"Ganesh","Electronic Engineer",115000,"Hyderabad"),
           new Employee1(7,"Dinesh","Business",200000,"Kurnool"),
           new Employee1(8,"Naveen","DevOps",40000,"Jalandhar"),
           new Employee1(9,"Ashok","Software",50000,"Kurnool"),
           new Employee1(10,"vimay","Civil Engineer",100000,"Dubai")
        );
        //Print the name of all the employees
        list1.stream().forEach(v -> System.out.println(v.getEmpName()));
        //Print all the salaries which are greater than 50,000/-
        list1.stream().filter(v ->v.getEmpSalary() > 50000).forEach(v -> System.out.println(v.getEmpSalary()));
        //. Print all the locations starting with the letter ‘M’
        list1.stream().filter(v ->v.getEmpLocation().startsWith("M")).forEach(v-> System.out.println(v.getEmpLocation()));
        //Print all the designations ending with ‘E’
        list1.stream().filter(v->v.getEmpDesignation().endsWith("e")).forEach(v-> System.out.println(v.getEmpDesignation()));
    }
}

