import java.io.*;
public class Bowling {
    public static void main (String[] args) {
        System.out.println("Bowling始めます。");


        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        try {
            String knockedDownPins = reader.readLine();
            Lane lane = new Lane();
            lane.setKnockedDownPins(knockedDownPins);
            System.out.println("倒したピンは" + lane.getKnockedDownPins() + "です。");
        } catch (IOException e) {
            System.out.println (e);
        }                                                 




    }
}

// http://www.ie.u-ryukyu.ac.jp/~e075769/study/study/java/javalanguage1/ch3/3_3.php