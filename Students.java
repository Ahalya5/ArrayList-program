public class Students{
    public static void main(String[] args) {
        Student student1 = new Student("ahalya","suriyamoorthy","arulmathi","third","2001","londan","thekkur");
        Student student2=new Student("dharshith","sudar","anjali","second","2014","government","orathanadu");
        Student student3 = new Student("reethanya","kamaraj","kemesh","first","2013","government","athanakottai");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student1.dateofbirth);
        System.out.println(student1.address);
        System.out.println(student2.fathername);
        System.out.println(student3.address);
        System.out.println(student3.dateofbirth);
        System.out.println(student1.standard);

    }
    }
    class Student {
        String name;
        String fathername;
        String mothername;
        String standard;
        String dateofbirth;
        String school;
        String address;

        Student(String _name, String _fathername, String _mothername, String _standard, String _dateofbirth, String _school, String _address){

        name =_name;
        fathername = _fathername;
        mothername = _mothername;
        standard = _standard;
        dateofbirth = _dateofbirth;
        school = _school;
        address = _address;


    }
}
