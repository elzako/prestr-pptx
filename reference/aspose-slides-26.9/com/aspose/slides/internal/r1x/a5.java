package com.aspose.slides.internal.r1x;

class a5 implements com.aspose.slides.internal.b8u.x8 {
   private final com.aspose.slides.internal.b8u.x8 n5;

   a5(com.aspose.slides.internal.b8u.x8 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, int[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      long var5 = 4278190080L;
      this.n5.n5(var1.n3(), var2, var3.k5(), var4.k5());

      for (int var7 = 0; var7 < var2.length; var7++) {
         if ((var2[var7] & 4278190080L & 4294967295L) != 4278190080L) {
            var2[var7] = n5(var2[var7]);
         }
      }
   }

   public static int n5(int var0) {
      int var1 = (int)((var0 & 4294967295L) >> 24);
      int var2 = (int)((var0 & 4294967295L) >> 16 & 4294967295L & 255L);
      int var3 = (int)((var0 & 4294967295L) >> 8 & 4294967295L & 255L);
      int var4 = var0 & 0xFF;
      if (var1 != 255) {
         var2 = n5(var2, var1);
         var3 = n5(var3, var1);
         var4 = n5(var4, var1);
      }

      return (int)((var1 & 4294967295L) << 24 | (var2 & 4294967295L) << 16 | (var3 & 4294967295L) << 8 | var4 & 4294967295L);
   }

   public static int n5(int var0, int var1) {
      int var2 = var0 * var1 + 128;
      return var2 + (var2 >> 8) >> 8;
   }
}
