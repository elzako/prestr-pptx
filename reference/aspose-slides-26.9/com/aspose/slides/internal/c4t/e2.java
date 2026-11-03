package com.aspose.slides.internal.c4t;

import java.io.UnsupportedEncodingException;

public final class e2 extends n3 {
   public int n5(byte[] var1, int var2, int var3, boolean var4) throws com.aspose.slides.internal.p7x.l6 {
      int var5 = var2;
      this.n5 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      int var6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var7 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.u3 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.a6 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      int var8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      var2 = var3 + var7;
      if (var4) {
         try {
            this.k5 = n5(var1, var2, var6 * 2);
            this.l6 = new String(var1, var2, var6 * 2, "UTF-16LE");
            var2 += var6 * 2;
         } catch (UnsupportedEncodingException var12) {
            char[] var10 = new char[var6];

            for (int var11 = 0; var11 < var6; var2 += 2) {
               var10[var11] = com.aspose.slides.internal.l1b.k5.y4(var1, var2);
               var11++;
            }

            this.l6 = new String(var10);
         }
      } else {
         this.k5 = n5(var1, var2, var6);
      }

      if (var8 > 0) {
         var2 = var3 + var8;
         this.u9 = new int[(this.u3 & 8192) != 0 ? 2 * var6 : var6];

         for (int var9 = 0; var9 < this.u9.length; var2 += 4) {
            this.u9[var9] = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
            var9++;
         }
      }

      return var2 - var5;
   }
}
