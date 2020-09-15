class Employee{
    private int EmpId;

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public int getEmpId() {
        return EmpId;
    }
}
class company{
    public static void main(String[]args){
        Employee E= new Employee();
        E.setEmpId(112);
       System.out.println(E.getEmpId());
    }
}