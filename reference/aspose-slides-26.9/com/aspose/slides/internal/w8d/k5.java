package com.aspose.slides.internal.w8d;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.io.IOException;

public final class k5 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   Rectangle l6;
   int k5;
   Point u3;
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
      Point var5 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      Dimension var6 = com.aspose.slides.internal.l1b.k5.s7(var1, var2);
      var2 += 8;
      this.l6 = new Rectangle(var5, var6);
      this.k5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.u3 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
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
   }

   @Override
   public int n5() {
      return 78;
   }
}
