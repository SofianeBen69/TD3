/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry.twoDim;

import geometry.zeroDim.Point2D;

/**
 *
 * @author sofiane
 */
public class Rectangle2D {
   
    public Rectangle2D(Point2D p1,Point2D p2,Point2D p3,Point2D p4)
    {
       
        float a=p1.getX()-p2.getX();
        float b=p1.getY()-p2.getY();
        float longueurP1P2=(float) Math.sqrt(a*a+b*b);
        
         a=p2.getX()-p3.getX();
         b=p2.getY()-p3.getY();
        float longueurP2P3=(float) Math.sqrt(a*a+b*b);
        
        a=p3.getX()-p4.getX();
        b=p3.getY()-p4.getY();
        float longueurP3P4=(float) Math.sqrt(a*a+b*b);
        
        a=p1.getX()-p4.getX();
        b=p1.getY()-p4.getY();
        float longueurP1P4=(float) Math.sqrt(a*a+b*b);
        
        if ((longueurP1P2==longueurP3P4)&&(longueurP2P3==longueurP1P4) )
        {
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
        }
    }
    
    public float perimetre()
    {
        float a=p1.getX()-p2.getX();
        float b=p1.getY()-p2.getY();
        float longueurP1P2=(float) Math.sqrt(a*a+b*b);
        
         a=p2.getX()-p3.getX();
         b=p2.getY()-p3.getY();
        float longueurP2P3=(float) Math.sqrt(a*a+b*b);
        
        a=p3.getX()-p4.getX();
        b=p3.getY()-p4.getY();
        float longueurP3P4=(float) Math.sqrt(a*a+b*b);
        
        a=p1.getX()-p4.getX();
        b=p1.getY()-p4.getY();
        float longueurP1P4=(float) Math.sqrt(a*a+b*b);
        
        return longueurP1P2+longueurP2P3+longueurP3P4+longueurP1P4;
    }
    
    
    public float aire()
    {
        float a=p1.getX()-p2.getX();
        float b=p1.getY()-p2.getY();
        float longueurP1P2=(float) Math.sqrt(a*a+b*b);
        
         a=p2.getX()-p3.getX();
         b=p2.getY()-p3.getY();
        float longueurP2P3=(float) Math.sqrt(a*a+b*b);
        
        return longueurP1P2*longueurP2P3;
    }
    private Point2D p1;
    private Point2D p2;
    private Point2D p3;
    private Point2D p4;
    
    
}
