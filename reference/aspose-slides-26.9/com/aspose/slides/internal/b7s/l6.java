package com.aspose.slides.internal.b7s;

import com.aspose.slides.exceptions.ArgumentException;

class l6 implements com.aspose.slides.internal.b8u.t9 {
   private final com.aspose.slides.internal.b8u.x8 n5;

   public l6(com.aspose.slides.internal.b8u.x8 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, byte[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      if (var2.length % 3 != 0) {
         throw new ArgumentException("Data must contain 3 bytes for each pixel.");
      }

      int[] var5 = new int[var2.length / 3];
      int var6 = 0;

      for (int var7 = 0; var7 < var2.length; var7 += 3) {
         var5[var6++] = 0xFF000000 | (var2[var7 + 2] & 255) << 16 | (var2[var7 + 1] & 255) << 8 | var2[var7] & 255;
      }

      this.n5.n5(var1.n3(), var5, var3.k5(), var4.k5());
   }
}
