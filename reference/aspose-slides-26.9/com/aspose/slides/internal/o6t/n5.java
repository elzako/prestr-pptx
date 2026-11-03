package com.aspose.slides.internal.o6t;

import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;

class n5 {
   private AffineTransform n5;
   private Shape l6;
   private Stroke k5;
   private Paint u3;
   private Font a6;
   private Composite u9;
   private RenderingHints h0;

   public n5(Graphics2D var1, AffineTransform var2) {
      this.n5 = var1.getTransform();

      try {
         var1.setTransform(var2);
         this.l6 = var1.getClip();
         this.k5 = var1.getStroke();
         this.u3 = var1.getPaint();
         this.a6 = var1.getFont();
         this.u9 = var1.getComposite();
         this.h0 = var1.getRenderingHints();
      } finally {
         var1.setTransform(this.n5);
      }
   }

   public void n5(Graphics2D var1) {
      var1.setTransform(this.n5);
      var1.setClip(this.l6);
      var1.setStroke(this.k5);
      var1.setPaint(this.u3);
      var1.setFont(this.a6);
      var1.setComposite(this.u9);
      var1.setRenderingHints(this.h0);
   }

   public Shape n5() {
      return this.l6;
   }
}
