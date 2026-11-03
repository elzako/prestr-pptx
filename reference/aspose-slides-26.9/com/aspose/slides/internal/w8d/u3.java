package com.aspose.slides.internal.w8d;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.io.IOException;

public final class u3 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   Point[] l6 = new Point[3];
   Rectangle k5;
   Point2D[] u3;
   AffineTransform a6;
   Color u9;
   int h0;
   com.aspose.slides.internal.c4t.n5 c8;
   Point t2;
   int s7;
   com.aspose.slides.internal.c4t.n5 x8;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      int var4 = var2 - 8;
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;

      for (int var5 = 0; var5 < 3; var2 += 8) {
         this.l6[var5] = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
         var5++;
      }

      Point var33 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      Dimension var6 = com.aspose.slides.internal.l1b.k5.s7(var1, var2);
      var2 += 8;
      this.k5 = new Rectangle(var33, var6);
      this.a6 = com.aspose.slides.internal.l1b.k5.x8(var1, var2);
      var2 += 24;
      this.u9 = com.aspose.slides.internal.l1b.k5.n3(var1, var2);
      var2 += 4;
      this.h0 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var7 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var9 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var10 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.t2 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      this.s7 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var11 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var12 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var13 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var14 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      var2 = var4 + var7;
      this.c8 = new com.aspose.slides.internal.c4t.n5();
      this.c8.n5(var1, var2, var8, var4 + var9, var10);
      var2 = var4 + var11;
      this.x8 = new com.aspose.slides.internal.c4t.n5();
      this.x8.n5(var1, var2, var12, var4 + var13, var14);
      this.u3 = new Point2D[]{
         new Float(this.k5.x, this.k5.y), new Float(this.k5.x + this.k5.width, this.k5.y), new Float(this.k5.x, this.k5.y + this.k5.height)
      };
      this.a6.transform(this.u3, 0, this.u3, 0, 3);
   }

   @Override
   public int n5() {
      return 79;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.n5(this.c8.n5(), this.l6, this.u3);
   }
}
