package com.aspose.slides.internal.q8g;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.io.IOException;

public final class h0 extends com.aspose.slides.internal.s2b.u3 {
   short n5;
   short l6;
   Dimension k5;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      short var4 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      short var5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.k5 = new Dimension(var5, var4);
      this.l6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.n5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
   }

   @Override
   public int n5() {
      return 1065;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.d2n.u9 var4 = var1.z1(this.n5);
      double var5;
      double var7;
      float var9;
      if (this.k5.width > this.k5.height) {
         var5 = (float)this.k5.width / this.k5.height;
         var7 = 1.0;
         var9 = this.k5.width;
      } else {
         var5 = 1.0;
         var7 = (float)this.k5.height / this.k5.width;
         var9 = this.k5.height;
      }

      PathIterator var10 = new Area(var4).getPathIterator(AffineTransform.getScaleInstance(var5, var7));
      BasicStroke var11 = new BasicStroke(var9, 0, 0);
      GeneralPath var12 = new GeneralPath(var10.getWindingRule());
      var12.append(var10, false);
      Shape var13 = var11.createStrokedShape(var12);
      var10 = var13.getPathIterator(AffineTransform.getScaleInstance(1.0 / var5, 1.0 / var7));
      var12 = new GeneralPath(var10.getWindingRule());
      var12.append(var10, false);
      var1.a6();
      var1.t4(this.l6);
      var1.u9(var12);
      var1.u9(-1);
      super.n5(var1, var2, var3);
   }
}
