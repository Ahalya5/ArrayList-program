class MyCalulation {
    int v;
    public void addition(int e,int y){
        v= e+y;
        System.out.println("number is the:"+v);
    }
    public void subtraction(int d,int h){
        v=d-h;
        System.out.println("number is the subtraction:"+v);
    }
    public class MyCalculation extends Calulation1{
        public void multi(int r,int w){
            v=r*w;
            System.out.println("the number multi is:"+v);
        }
    }
    public class Calulation1{
        public void main(String[] args){
            int e=20,d=90,r=10,w=40,h=60,y=70;
            Calulation1 cal =new Calulation1();
            cal.addition(e,y);
            cal.subtraction(d,h);
            cal.multi(r,w);
        }

        private void multi(int r, int w) {
        }

        private void subtraction(int d, int h) {
        }

        private void addition(int y, int i) {
        }
    }

}