package Stack;
public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(0);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println(" ");
        long nilai1=tumpukan.peek();
        System.out.println("nilai atas = "+nilai1);
        System.out.println(" ");
        System.out.println("Nama Saya adalah Della Savina ");
        System.out.println(" ");
        long nilai2=tumpukan.pop();
        System.out.println("nilai yang dihapus = "+nilai2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
        System.out.println(" ");
    }
}
