class Demo{
    private int EmpId;
    private String empName;
    private int empAge;

    public void setEmpId(int newValue){
        EmpId = newValue;
    }
    public int getEmpId(){
        return EmpId;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpAge(int newValue){
        empAge = newValue;
    }
    public int getEmpAge(){
        return empAge;
    }
}
class Test{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.setEmpName("Amit");
        obj.setEmpAge(330);
        obj.setEmpId(112);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee EmpId: " + obj.getEmpId());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}