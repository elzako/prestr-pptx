package com.aspose.slides.internal.o5k;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;

public final class l6 extends com.aspose.slides.internal.s2b.u3 {
   Point n5;
   Rectangle l6;
   com.aspose.slides.internal.c4t.n5 k5;
   int u3;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.u3 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      short var4 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      short var5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      if (var3 == 18) {
         var2 += 2;
      }

      short var6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      short var7 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      short var8 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      short var9 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.l6 = new Rectangle(var5, var4, var7, var6);
      this.n5 = new Point(var9, var8);
      this.k5 = new com.aspose.slides.internal.c4t.n5();
      this.k5.n5(var1, var2, var3 - var2, false);
   }

   @Override
   public int n5() {
      return 2368;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      Rectangle var4 = new Rectangle(this.n5, this.l6.getSize());
      if (var4.height < 0) {
         var4.height = -var4.height;
         var4.y = var4.y - var4.height;
      }

      if (var4.width < 0) {
         var4.width = -var4.width;
         var4.x = var4.x - var4.width;
      }

      var1.n5(this.u3, this.k5.n5(), var4, this.l6);
      super.n5(var1, var2, var3);
   }
}
