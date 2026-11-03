package com.aspose.slides.internal.h0y;

import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;

public class k5 {
   private final AffineTransform n5;
   private final Paint l6;
   private final Shape k5;
   private final Stroke u3;
   private final RenderingHints a6;
   private final m1 u9;
   private final m1 h0;

   public k5(z1 var1, Graphics2D var2, com.aspose.slides.internal.o9b.u3 var3) {
      this.n5 = var2.getTransform();
      this.l6 = var2.getPaint();
      this.k5 = var2.getClip();
      this.u3 = var2.getStroke();
      this.a6 = (RenderingHints)var2.getRenderingHints().clone();
      this.u9 = var1.m1();
      this.h0 = var3.k5();
   }

   public void n5(z1 var1, Graphics2D var2, com.aspose.slides.internal.o9b.u3 var3) {
      var2.setTransform(this.n5);
      var2.setPaint(this.l6);
      var2.setClip(this.k5);
      var2.setStroke(this.u3);
      var2.setRenderingHints(this.a6);
      if (this.u9.k5()) {
         var1.l6(this.u9);
      }

      if (this.h0.k5()) {
         var3.n5(this.h0);
      }
   }
}
