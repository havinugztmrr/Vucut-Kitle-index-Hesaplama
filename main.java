
import java.util.Scanner;
public class vucutKitle {
    public static void main (String[] args)
    {
        //Kullanıcıdan boy ve kilo değerlerinin alınması 
        float bki;
        Scanner oku=new Scanner(System.in);
        // Kullanıcıdan boy alınması 
        System.out.print("Boyunuzu giriniz örn(1,65 gibi): ");
        float boy=oku.nextFloat();
        // Kullanıcıdan kilo değerini alınması 
        System.out.print("Kilonuzu giriniz: ");
        float kilo =oku.nextFloat();
        //bki değerini hesaplanması 
        bki= kilo/(boy*boy);
        //Değerinin ekrana yazdırılması 
        System.out.println("Vucut kitle index değeriniz: " +bki);
        
        //Şimdi hesaplanan bu değerde sınıflandırma yapıcaz
        if(bki<18.5)
        {
            System.out.println("Zayıfsınız");
        }
        else if(bki>18.5 && bki<24.9)
        {
            System.out.println("Sağlıklsınız.");
        }
        else if(bki>25 && bki<29.9)
        {
            System.out.println("Şişmansınız");
        }
        else if(bki>30 && bki<39.9)
        {
            System.out.println("Obezsiniz");
        }
        else {
            System.out.println("Aşırı obezsiniz.");
        }
      
    }
    
    
}
