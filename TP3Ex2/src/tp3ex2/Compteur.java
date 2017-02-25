    
package tp3ex2;


public class Compteur {
   public Compteur()
   {
       idMax++;
       id=idMax;
   }
    
   public int getID()
   {
       return id;
   }
   
   public static int getIDMax()
   {
       return idMax;
   }
    
    
    private int id; 
    private static int idMax;
    static {
        
        do
        {
          System.out.println("entrez le numéro initial des objets(positif):");
          idMax=Clavier.lireInt();
        }
        while (idMax<0);
        idMax--;
    }
}
