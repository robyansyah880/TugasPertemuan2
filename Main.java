public class Main {
    public static void main(String[]args) {
        Manusia m= new Manusia();

        m.setRambut("Panjang");
        System.out.println(m.getRambut());

        System.out.println(m.Memasak("Sayur Bayam"));

        Telepon pt= new Telepon();

        pt.setKabel("Spiral");
        System.out.println(pt.getKabel());

        System.out.println(pt.terima_panggilan(true));
    }
}
