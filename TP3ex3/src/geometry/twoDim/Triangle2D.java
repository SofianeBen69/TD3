/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry.twoDim;

import geometry.zeroDim.Point2D;


public class Triangle2D {
     
   public Triangle2D(Point2D p1,Point2D p2,Point2D p3)
   {
       this.p1=p1;
       this.p2=p2;
       this.p3=p3;
   }
    
    public float perimetre()
    {
        float a=p1.getX()-p2.getX();
        float b=p1.getY()-p2.getY();
        float longueur1=(float) Math.sqrt(a*a+b*b);
        
         a=p2.getX()-p3.getX();
         b=p2.getY()-p3.getY();
        float longueur2=(float) Math.sqrt(a*a+b*b);
        
        a=p1.getX()-p3.getX();
        b=p1.getY()-p3.getY();
        float longueur3=(float) Math.sqrt(a*a+b*b);
        
        return longueur1+longueur2+longueur3;
        
    }
    
    public float aire()
    {
        
        
        float aire = (float) (Math.abs((p1.getX()-p3.getX())*(p2.getY()-p1.getY())-
         (p1.getX()-p2.getX())*(p3.getY()-p1.getY()))*0.5);
        return aire;
    }
    
    private Point2D p1;
    private Point2D p2;
    private Point2D p3;
}
