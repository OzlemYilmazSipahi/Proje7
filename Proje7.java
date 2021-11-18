
import java.util.Scanner;
public class Proje7 {

    public static void main(String[] args) {
        double n1, n2;
        int select;

       Scanner input = new Scanner(System.in);
       System.out.print("İlk sayıyı giriniz: ");
       n1 = input.nextInt();

       System.out.print("İkinci sayıyı giriniz: ");
       n2 = input.nextInt();

       System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
       System.out.println("Seçiminiz: ");
       select = input.nextInt();

       switch(select){
            case 1:
                System.out.print("n1 + n2 = " + (n1 + n2));
                break;
            case 2:
                System.out.print("n1 - n2 = " + (n1 - n2));
                break;
            case 3:
                System.out.print("n1 * n2 = " + (n1 * n2));
                break;
            case 4:
                if(n2 != 0)
            {
                System.out.print("n1 / n2 = " + (n1 / n2));
            }else{
                System.out.print("Sayı sıfıra bölünemez!");
            }
                break;
            default :
                System.out.print("Geçerli bir seçim yapınız.");

        }
    }
}


