
package geometry.zeroDim; 

import static java.lang.Math.atan2;
// l

public class Point2D {
    
    public Point2D() // exo 4
    {
         this(0,0);
    }
    
    public Point2D(float abs)// exo 4
    {
        this(abs,0);
    }
    public Point2D(float x, float y)
    {
        this.x=x;
        this.y=y;
    }
    
    public float getX()
    {
        return x;
    }
    
    public float getY()
    {
        return y;
    }
    
    public void deplace (float dx,float dy)
    {
        x+=dx;
        y+=dy;
    }
    
    public void affiche()
    {
        System.out.println("Coord = ("+x+" "+y+")");
    }
    public float distance(Point2D p2) // exo 4
    {
        float a=this.x-p2.x;
        float b =this.y-p2.y;
        return (float) Math.sqrt(a*a+b*b);
        
    }
    
    
    public void rotation(double angleEnRadians)
    {
        double r=Math.sqrt(this.x*this.x+this.y*this.y);
        double t= atan2(this.y,this.x);
        t=t+angleEnRadians;
        this.x=(float) (r*Math.cos(t));
       this.y=(float)(r*Math.sin(t));
        
    }
    private float x,y;
}
