
package geometry.oneDim;

import geometry.zeroDim.Point2D;


public class Segment2D {
    
    public Segment2D(Point2D p1,Point2D p2)
    {
        this.p1=p1;
        this.p2=p2;
    }
    
    public float longueur()
    {
        float a=p1.getX()-p2.getX();
        float b=p1.getY()-p2.getY();
        float longueur=(float) Math.sqrt(a*a+b*b);
        return longueur;
    }
    
    public void affiche()
    {
        System.out.println("Ce segment a pour longueur "+ this.longueur()+ " et ces points à l'extremité sont: ");  p1.affiche();  p2.affiche();
    }
    
    public void deplaceP1(float dxP1,float dyP1)
    {
      p1.deplace(dxP1,dyP1);  
    }
    public void deplaceP2(float dxP2,float dyP2)
    {
        p2.deplace(dxP2, dyP2);
    }
    
    private Point2D p1,p2;
    
}
