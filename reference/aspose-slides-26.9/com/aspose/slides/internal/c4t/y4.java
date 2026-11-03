package com.aspose.slides.internal.c4t;

import java.awt.Point;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class y4 extends n3 {
   public y4() {
   }

   public y4(String var1, Charset var2, Point var3) {
      ByteBuffer var4 = var2.encode(var1);
      this.k5 = new byte[var4.remaining()];
      var4.get(this.k5);
      this.n5 = var3;
      this.l6 = var1;
   }

   public y4(String var1, Charset var2, Rectangle var3) {
      this(var1, var2, var3, null);
   }

   public y4(String var1, Charset var2, Rectangle var3, int[] var4) {
      ByteBuffer var5 = var2.encode(var1);
      this.k5 = new byte[var5.remaining()];
      var5.get(this.k5);
      this.n5 = var3.getLocation();
      this.a6 = var3;
      this.u3 = com.aspose.slides.internal.k2p.n5.l6;
      this.l6 = var1;
      if (var4 != null && var1.toCharArray().length == var4.length) {
         this.u9 = (int[])var4.clone();
      }
   }

   public int l6(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      int var4 = var2;
      this.n5 = new Point(com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 2), com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      var2 += 4;
      short var5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.u3 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      if ((this.u3 & (com.aspose.slides.internal.k2p.n5.l6 | com.aspose.slides.internal.k2p.n5.n5)) != 0) {
         this.a6 = com.aspose.slides.internal.l1b.k5.h0(var1, var2);
         var2 += 8;
      }

      this.k5 = n5(var1, var2, var5);
      var2 += (var5 + 1) / 2 * 2;
      if (var2 < var3 - 1) {
         this.u9 = new int[Math.min(var5, (var3 - var2) / 2)];

         for (int var6 = 0; var6 < this.u9.length; var2 += 2) {
            this.u9[var6] = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
            var6++;
         }
      }

      return var2 - var4;
   }
}
