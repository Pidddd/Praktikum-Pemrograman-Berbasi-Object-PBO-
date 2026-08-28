package Jobsheet1;

public class MainDemo {
    public static void main(String[] args) {
        
        // Objek Kipas
        Kipas kipasKamar = new Kipas();
        kipasKamar.setBrand("Cosmos");
        kipasKamar.tambahSpeed(2);
        kipasKamar.cetakInfo();
        kipasKamar.matikanKipas();

        System.out.println();

        // Objek Controller
        Controller controllerPS = new Controller();
        controllerPS.setBrand("DualSense PS5");
        controllerPS.tekanTombolX();
        controllerPS.cetakInfo();
        controllerPS.lepasTombolX();

        System.out.println();

        // Objek Mainan Rakit
        MainanRakit mainanRakit1 = new MainanRakit();
        mainanRakit1.setNama("Puzzle 3D Kayu");
        mainanRakit1.setHarga(100000);
        mainanRakit1.mulaiRakit();
        mainanRakit1.beriDiskon(10);
        mainanRakit1.cetakInfo();

        System.out.println();

        // Objek Gundam
        Gundam gundamWing = new Gundam();
        gundamWing.setNama("gundam Wing XXG-01W");
        gundamWing.setHarga(700000);
        gundamWing.setTier("Madster Grade (MG)");
        gundamWing.pasangSenjata("Twin Buster Rifle");
        gundamWing.cetakInfo();
        gundamWing.lepasSenjata();

        System.out.println();

        // Objek Bricks
        Bricks brickRusa = new Bricks();
        brickRusa.setNama("Bricks Rusa Mini");
        brickRusa.setHarga(120000);
        brickRusa.setSeri("Animal Series");
        brickRusa.setJumlahPcs(350);
        brickRusa.rakit(300);
        brickRusa.cetakInfo();
        brickRusa.bongkar();
    }
}