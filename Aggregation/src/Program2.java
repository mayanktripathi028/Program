/*class address{
    int streetNum;
    String city;
    String state;
    String country;
    address(int street,String c, String st, String con){
        this.streetNum=street;
        this.city=c;
        this.state=st;
        this.country=con;
    }
}
class studentClass{
    int rollNum;
    String studentName;
    address studentAddr;
    studentClass(int Num, String Name, address Addr){
        this.rollNum=Num;
        this.studentName=Name;
        this.studentAddr=Addr;
    }
}*/
class college{
    String collegeName;
    address collegeAddr;
    college(String name,address Addr){
        this.collegeName=name;
        this.collegeAddr=Addr;
    }
}
class staff{
    String staffName;
    address staffAddr;
    staff(String name, address Addr){
        this.staffName=name;
        this.staffAddr=Addr;
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
