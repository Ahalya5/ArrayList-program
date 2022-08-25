public class Schoolex {
    public static void main(String[] args) {
        Schoolsex1 shol1 = new Schoolsex1("london school", "orathanadu", "mannargudi road", 10000);
        System.out.println(shol1.name);
        shol1.setName("st annis");
        System.out.println(shol1.getName());
        Schoolsex1 shol2 = new Schoolsex1("srm school", "thanjavur", "vallam road", 123457);
        System.out.println(shol2.no_of_Students);
        shol2.setNoOfStudents(555);
        System.out.println(shol2.no_of_Students);
        Schoolsex1 shol3 = new Schoolsex1("periyar school", "pattukottai", "main bus stand", 6780);
        System.out.println(shol3.city);
        shol3.setCity("orathanad");
        System.out.println(shol3.getCity());

    }
}
class Schoolsex1{
   String name;
    String city;
    String address;
    int no_of_Students;

 Schoolsex1(String _name,String _city,String _address,int _noOfStudents) {
     name = _name;
     city = _city;
     address = _address;
     no_of_Students=_noOfStudents;
 }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoOfStudents() {
        return no_of_Students;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.no_of_Students = noOfStudents;
    }
}
