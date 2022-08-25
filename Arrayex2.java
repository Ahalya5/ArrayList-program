public class Arrayex2 {
    public static void main(String[] args) {
        String[] name= {"ahalya", "amirtha", "priya", "siva", "mani"};
        for (int a = 0; a<name.length; a++) {
            if (name[a].indexOf('p') == 0) {
                System.out.println(name[a]);

                //    for(int i =0; i< names.length;i++){
                //            if(names[i].indexOf('a')==2){
                //                System.out.println(names[i]);
            }
        }
    }
}