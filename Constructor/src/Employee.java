public class Employee {
    int empID;
    String empName;
    Employee(int Id, String name){
        this.empID=Id;
        this.empName= name;
    }
    void info(){
        System.out.println("Id:"+empID+"Name:"+empName);
    }
    public static void main(String[]args){
        Employee obj1 = new Employee(12, "Superman");
        Employee obj2 = new Employee(14, "Batman");
        obj1.info();
        obj2.info();
    }
}
//parameterized constructor with two parameters 'id' and 'name'
