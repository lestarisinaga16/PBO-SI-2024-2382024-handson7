package Polimorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;
        bangunDatar = new Persegi(4);
        System.out.println("Luas persegi : " + bangunDatar.luas());
        System.out.println("Keliling persegi : " + bangunDatar.keliling());

        //Lingkaran
        bangunDatar = new Lingkaran(6);
        System.out.println("Luas lingkaran : " + bangunDatar.luas());
        System.out.println("Keliling lingkaran : " + bangunDatar.keliling());

        //Segitiga sama sisi
        bangunDatar = new SegitigaSamaSisi(5);
        System.out.println("Luas segitiga sama Sisi : " + bangunDatar);
        System.out.println("Keliling segitiga sama sisi : " + bangunDatar);
    }
}
