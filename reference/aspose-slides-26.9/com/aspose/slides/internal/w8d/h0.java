package com.aspose.slides.internal.w8d;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;

public final class h0 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   Rectangle l6;
   Rectangle k5;
   int u3;
   int a6;
   com.aspose.slides.internal.c4t.n5 u9;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      int var4 = var2 - 8;
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      Point var5 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      this.k5 = new Rectangle(com.aspose.slides.internal.l1b.k5.c8(var1, var2), com.aspose.slides.internal.l1b.k5.s7(var1, var2 + 8));
      var2 += 16;
      int var6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var7 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var9 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.u3 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.a6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = new Rectangle(var5, com.aspose.slides.internal.l1b.k5.s7(var1, var2));
      var2 += 8;
      var2 = var4 + var6;
      this.u9 = new com.aspose.slides.internal.c4t.n5();
      this.u9.n5(var1, var2, var7, var4 + var8, var9);
   }

   @Override
   public int n5() {
      return 81;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.n5(this.a6, this.u9.n5(), this.l6, this.k5);
   }
}
