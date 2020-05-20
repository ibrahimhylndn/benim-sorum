// NOT:
// Hangi insanlarin hangi kitaplari okuduguyla ilgili bir proje yazin.
// NOT:





package proje;

import java.util.Scanner;


public class Proje {

    String b;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Kitaplar kitaplar = new Kitaplar();
        String[][] kitaplar1 = kitaplar.kitaplar1;
        
        
        
        
        System.out.println(
                "1 = tum okunan kitaplar\n" +
                "2 = ozel kisilerin okudugu kitaplar"
                
        );
        int a=scan.nextInt();
        
        if(a==1){
            
            TumOkunanKitaplar();
            
        }
        
        if(a==2){
            
            
            OzelKisilerinOkuduguKitaplar();
                
            }
           
            
            
        
        
    }
    
    private static void TumOkunanKitaplar(){
        Kitaplar kitaplar = new Kitaplar();
        String[][] kitaplar1 = kitaplar.kitaplar1;
        
        for(int sutun = 0;sutun<kitaplar1[0].length;sutun++){
            for(int satir = 0;satir<kitaplar1.length;satir++){
                
                   System.out.println(kitaplar1[satir][sutun]);
                    
                }
                System.out.println();
                
            }
            
        }
        
     private static void OzelKisilerinOkuduguKitaplar(){
        Kitaplar kitaplar = new Kitaplar();
        String[][] kitaplar1 = kitaplar.kitaplar1;
        Scanner scan = new Scanner(System.in);
        
        System.out.println(
                      "Ali "
                    + "Ayse "
                    + "Mehmet "
                    + "Selin");
        
        String b=scan.next();
        
        
            
        for(int sutun = 0;sutun<kitaplar1[0].length;sutun++){
            
             if(b.equalsIgnoreCase(kitaplar1[0][sutun])){  
                      
                for(int satir = 0;satir<kitaplar1.length;satir++){
            
                
                
                   System.out.println(kitaplar1[satir][sutun]);
                }
                    
                
                System.out.println();
                }
            }
        
    }
    
    
}
 
