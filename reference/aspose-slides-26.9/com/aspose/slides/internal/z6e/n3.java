package com.aspose.slides.internal.z6e;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.io.IOException;

public final class n3 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   int l6;
   Dimension k5;
   com.aspose.slides.internal.d2n.u9 u3;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      var2 += 4;
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.k5 = com.aspose.slides.internal.l1b.k5.s7(var1, var2);
      var2 += 8;
      this.u3 = new com.aspose.slides.internal.d2n.u9();
      var2 += this.u3.n5(var1, var2);
   }

   @Override
   public int n5() {
      return 72;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      double var4;
      double var6;
      float var8;
      if (this.k5.width > this.k5.height) {
         var4 = (float)this.k5.width / this.k5.height;
         var6 = 1.0;
         var8 = this.k5.width;
      } else {
         var4 = 1.0;
         var6 = (float)this.k5.height / this.k5.width;
         var8 = this.k5.height;
      }

      PathIterator var9 = new Area(this.u3).getPathIterator(AffineTransform.getScaleInstance(var4, var6));
      BasicStroke var10 = new BasicStroke(var8, 0, 0);
      GeneralPath var11 = new GeneralPath(var9.getWindingRule());
      var11.append(var9, false);
      Shape var12 = var10.createStrokedShape(var11);
      var9 = var12.getPathIterator(AffineTransform.getScaleInstance(1.0 / var4, 1.0 / var6));
      var11 = new GeneralPath(var9.getWindingRule());
      var11.append(var9, false);
      var1.a6();
      var1.t4(this.l6);
      var1.u9(var11);
      var1.u9(-1);
   }
}
