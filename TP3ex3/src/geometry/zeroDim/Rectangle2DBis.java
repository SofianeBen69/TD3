/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry.zeroDim;

import geometry.oneDim.Point2D;


public class Rectangle2DBis {
     private Point2D lowerleft;
     private float width,height;
     
     public Rectangle2DBis(Point2D lowerleft,float width,float height)
     {
         this.lowerleft=lowerleft;
         this.width=width;
         this.height=height;
     }
     
     public float perimetre()
     {
         return 2*(height+width);
     }
     
     public float surface()
     {
         return width*height;
     }
}
