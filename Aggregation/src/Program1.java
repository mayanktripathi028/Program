class address{
    int streetNum;
    String city;
    String state;
    String country;
    address(int street,String c, String st, String coun){
        this.streetNum=street;
        this.city=c;
        this.state=st;
        this.country=coun;
    }
}
class studentClass{
    int rollNum;
    String StudentName;
    // creating HAS-A relationship with address class
    address studentAddr;
    studentClass(int roll, String name, address addr){
        this.rollNum=roll;
        this.StudentName=name;
        this.studentAddr=addr;
    }
    public static void main(String[]args){
        address ad=new address(55,"noida", "UP", "India");
        studentClass obj= new studentClass(123, "Shyam", ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.StudentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
    }
}