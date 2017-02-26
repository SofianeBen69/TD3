
 
package tests;

import geometry.oneDim.Segment2D;
import geometry.twoDim.Rectangle2D;
import geometry.twoDim.Triangle2D;
import geometry.zeroDim.Point2D;



public class TestExo {
    
    public static void main(String args[])
    {
        Point2D point1 = new Point2D(4.f,6.f);
        Point2D point2 = new Point2D(10.f,12.f);
        
        Segment2D segment1=new Segment2D(point1,point2);
        segment1.affiche();
        segment1.deplaceP1(12,8);
        segment1.affiche();

       Segment2D segment2=new Segment2D(new Point2D(4,8),new Point2D(15,3));
       segment2.affiche();
       
       Triangle2D triangle1=new Triangle2D(new Point2D(4,8),new Point2D(15,3),new Point2D(24,25));
       System.out.println(" le perimetre du triangle1 est "+ triangle1.perimetre()+" et sa surface est "+ triangle1.aire());
       
       Rectangle2D rectangle1=new Rectangle2D(new Point2D(0,0),new Point2D(8,0),new Point2D(8,4),new Point2D(0,4));
       System.out.println(" le perimetre du rectangle1 est "+ rectangle1.perimetre()+ " et sa surface est "+ rectangle1.aire());

    }
    
    
    
}
