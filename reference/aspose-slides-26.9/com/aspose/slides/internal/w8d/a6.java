package com.aspose.slides.internal.w8d;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.io.IOException;

public final class a6 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   Point l6;
   Rectangle k5;
   AffineTransform u3;
   int a6;
   int u9;
   int h0;
   com.aspose.slides.internal.c4t.n5 c8;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      int var4 = var2 - 8;
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      this.l6 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      Point var5 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      Dimension var6 = com.aspose.slides.internal.l1b.k5.s7(var1, var2);
      var2 += 8;
      this.k5 = new Rectangle(var5, var6);
      this.u3 = com.aspose.slides.internal.l1b.k5.x8(var1, var2);
      var2 += 24;
      int var7 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var9 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var10 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.a6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.u9 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.h0 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      var2 = var4 + var7;
      this.c8 = new com.aspose.slides.internal.c4t.n5();
      this.c8.n5(var1, var2, var8, var4 + var9, var10);
   }

   @Override
   public int n5() {
      return 80;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.n5(13369376, this.c8.n5(), new Rectangle(this.l6, this.k5.getSize()), null);
   }
}
