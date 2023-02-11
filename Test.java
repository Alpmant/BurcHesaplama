import java.io.Console;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay:");
        int month = input.nextInt();
        System.out.print("Doğduğunuz Gün:");
        int day = input.nextInt();

        if(month ==1)
            if(day>0 && day<=31){
                if(day>=22)
                    System.out.println("Kova Burcu");

                else if(day<=22)
                    System.out.println("Oğlak burcu");

            } else System.out.println("Doğru Gün Giriniz");
        if(month ==2)
            if(day>0 && day<=28){
                if(day>=20)
                    System.out.println("Balık Burcu");

                else if(day<20)
                    System.out.println("Kova burcu");

            } else System.out.println("Doğru Gün Giriniz");
        if(month ==3)
            if(day>0 && day<=31){
                if(day>=21)
                    System.out.println("Koç Burcu");

                else if(day<21)
                    System.out.println("Balık burcu");

            } else System.out.println("Doğru Gün Giriniz");
        if(month ==4)
            if(day>0 && day<=30){
                if(day>=21)
                    System.out.println("Boğa Burcu");

                else if(day<21)
                    System.out.println("Koç burcu");

            } else System.out.println("Doğru Gün Giriniz");
        if(month ==5)
            if(day>0 && day<=31){
                if(day>=22)
                    System.out.println("İkizler Burcu");

                else if(day<22)
                    System.out.println("Boğa burcu");

            } else System.out.println("Doğru Gün Giriniz");
        if(month ==6)
            if(day>0 && day<=30){
                if(day>=23)
                    System.out.println("Yengeç Burcu");

                else if(day<23)
                    System.out.println("İkizler burcu");

            } else System.out.println("Doğru Gün Giriniz");
        if(month ==7)
            if(day>0 && day<=31){
                if(day>=23)
                    System.out.println("Aslan Burcu");

                else if(day<23)
                    System.out.println("Yengeç burcu");

            } else System.out.println("Doğru Gün Giriniz");
        if(month ==8)
            if(day>0 && day<=31){
                if(day>=23)
                    System.out.println("Başak Burcu");

                else if(day<23)
                    System.out.println("Aslan burcu");

            } else System.out.println("Doğru Gün Giriniz");
        if(month ==9)
            if(day>0 && day<=30){
                if(day>=23)
                    System.out.println("Terazi Burcu");

                else if(day<=22)
                    System.out.println("Başak burcu");

            } else System.out.println("Doğru Gün Giriniz");
        if(month ==10)
            if(day>0 && day<=31){
                if(day>=23)
                    System.out.println("Akrep Burcu");

                else if(day<=22)
                    System.out.println("Terazi burcu");

            } else System.out.println("Doğru Gün Giriniz");
        if(month ==11)
            if(day>0 && day<=30){
                if(day>=22)
                    System.out.println("Yay Burcu");

                else if(day<=21)
                    System.out.println("Akrep burcu");

            } else System.out.println("Doğru Gün Giriniz");
        if(month ==12)
            if(day>0 && day<=31){
                if(day>=22)
                    System.out.println("Oğlak Burcu");

                else if(day<=21)
                    System.out.println("Yay burcu");

            } else System.out.println("Doğru Gün Giriniz");



    }

}



