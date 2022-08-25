import java.util.List;

public class Miss1 {
    String name;
    String degree;
    int age;
    int standard;
    String location;

    Miss1(String _name, String _degree, int _age, int _standard, String _location) {
        this.name = _name;
        this.degree = _degree;
        this.age = _age;
        this.standard = _standard;
        this.location = _location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static int method1(List<Miss1> t1List, String location) {
        int count = 0;
        for (Miss1 m : t1List) {
            if (m.getLocation() == location) {
                count++;

            }
        }
        return count;
    }

    public static int method2(List<Miss1> t1List, String location, int standard) {
        int count = 0;
        for (Miss1 m1 : t1List) {
            if (m1.getLocation() == location && m1.getStandard() == standard) {
                count++;
            }

        }
        return count;
    }

    public static int method3(List<Miss1> t1List, String location){
        int count = 0;
        int sum = 0;
        for (Miss1 m2 : t1List) {
            if (m2.getLocation() == location) {
                count++;
                sum += m2.getAge();

            }
        }
        return count;
    }

    public static int method4(List<Miss1> t1List, String degree,int age) {
        int count = 0;
        for (Miss1 m2 : t1List) {
            if (m2.getAge()>20 && m2.getAge()<40) {
                count++;
            }
        }
        return count;

    }

    public static int method5(List<Miss1> t1List, int age) {
        int count = 0;

        for (Miss1 m2 : t1List) {
            if (m2.getAge()<age) {
                count++;

            }
        }
        return count;
    }

}
