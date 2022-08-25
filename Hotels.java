import java.util.*;
public class Hotels{
    public static void main(String[] args) {
    Hotel hotel1= new Hotel("sagam ","eb colony",456,"orathanadu","india",614907);
    Hotel hotel2= new Hotel("star","neru colony",789,"thanjavur","india",614568);
    Hotel hotel3 = new Hotel("marin","arasu colony",490,"pattukottai","india",614902);
    System.out.println(hotel1);
    System.out.println(hotel2);
    System.out.println(hotel3);
    System.out.println(hotel1.country);
    System.out.println(hotel2.pincode);
    System.out.println(hotel2.noOfRooms);
    System.out.println(hotel3.city);
    System.out.println(hotel3.name);

    }
}
 class Hotel {
     String name;
     String address;
     int noOfRooms;
     String city;
     String country;
     int pincode;
     Hotel(String _name, String _address, int _noOfRooms, String _city, String _country, int _pincode) {
         name = _name;
         address = _address;
         noOfRooms = _noOfRooms;
         city = _city;
         country = _country;
         pincode = _pincode;
     }
 }