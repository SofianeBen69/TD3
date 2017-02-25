
package tp3ex2;


public class TestCompteur {
   public static void main(String[] args)
   {
    Compteur c1=new Compteur();
   Compteur c2=new Compteur();
   System.out.println(" l'ID de c1 est :" + c1.getID());
  System.out.println(" l'ID de c2 est :" + c2.getID());
  
  System.out.println("le numero du dernier objet crée est " + Compteur.getIDMax());
   }
   
}
