import duadimensi.Jajargenjang;
import tigadimensi.Kerucut;
import tigadimensi.Balok;
public class App {
    public static void main(String[] args) throws Exception {
        Jajargenjang dimensi3 = new Jajargenjang(6.0, 6.0);
        System.out.println("Luas Jajargenjang = " + dimensi3.luas());

        Kerucut dimensi6 = new Kerucut(4.0, 5.0);
        System.out.println("Volume Kerucut = " + dimensi6.volume());

        Balok dimensi2 = new Balok(6.0, 6.0, 6.0);
        System.out.println("Volume Balok = " + dimensi2.volume());
    }
}
