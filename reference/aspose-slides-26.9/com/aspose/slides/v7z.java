package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

class v7z {
   public static void n5(
      com.aspose.slides.internal.x4g.s7 var0,
      String var1,
      com.aspose.slides.internal.o9b.y4 var2,
      int var3,
      float var4,
      TextParam var5,
      com.aspose.slides.internal.o9b.w1 var6,
      float[] var7,
      com.aspose.slides.internal.o9b.e5 var8
   ) {
      if (var7 == null) {
         var0.n5(var1, var2, var3, var4, var6.u3(), var8);
      } else {
         if (var1.length() != var7.length) {
            throw new InvalidOperationException();
         }

         for (int var9 = 0; var9 < var7.length; var9++) {
            String var10 = com.aspose.slides.ms.System.t9.q0(var1.charAt(var9));
            com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(var7[var9], var6.k5());
            var0.n5(var10, var2, var3, var4, var11.u3(), var8);
         }
      }
   }
}
