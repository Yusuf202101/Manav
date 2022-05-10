import java.util.Scanner;
public class MeyveFiyat {
    public static void main(String[] args) {
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg,total;
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5;

        Scanner inp = new Scanner(System.in);

        System.out.print("Alinan armut miktari : ");
        armutKg = inp.nextDouble();

        System.out.print("Alinan elma miktari : ");
        elmaKg = inp.nextDouble();

        System.out.print("Alinan domates miktari : ");
        domatesKg = inp.nextDouble();

        System.out.print("Alinan muz miktari : ");
        muzKg = inp.nextDouble();

        System.out.print("Alinan patlican miktari : ");
        patlicanKg = inp.nextDouble();

        total = (armutKg*armut)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
        System.out.println("Odenecek tutar : "+total);




    }

}
