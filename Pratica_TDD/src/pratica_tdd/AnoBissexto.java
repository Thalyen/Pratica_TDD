package pratica_tdd;

/**
 *
 * @author Tat
 */
public class AnoBissexto {

   public boolean anoBissexto(int ano){
       if(ano > 0 && (ano%4 == 0 && ano%100 !=0 || ano%400 == 0))
           return true;
       else
           return false;
   }
    
    public static void main(String[] args) {
        int ano = 1500;
        AnoBissexto teste = new AnoBissexto();
        
        System.out.println(teste.anoBissexto(ano));
    }
    
}
