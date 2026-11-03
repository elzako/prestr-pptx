package com.aspose.slides.internal.w3u;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.s7;

public class n5 {
   public static com.aspose.slides.internal.b8u.a6 n5(int[] var0, y2 var1, int var2) {
      int var3 = u3.n5(var2);
      return n5(var0, var1.n3(), var3, 1, 0);
   }

   static com.aspose.slides.internal.b8u.a6 n5(int[] var0, y2 var1, int var2, int var3, int var4) {
      com.aspose.slides.internal.b8u.a6 var5 = null;
      k5 var6 = k5.l6(var3);

      try {
         var5 = var6.n5(var0, var2);
         if (var5 != null) {
            int[] var7 = var5.l6();
            if (k5.n5(var5)) {
               var0 = var6.n5(var0, var5, var4);
               var5 = new s7(var7);
            }
         }

         return var5;
      } catch (OutOfMemoryError var8) {
         throw new com.aspose.slides.internal.z3b.k5("Not enough memory for color palette adjustment. ", var8);
      }
   }
}
