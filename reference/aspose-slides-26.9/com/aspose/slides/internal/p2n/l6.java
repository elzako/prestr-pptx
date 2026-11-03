package com.aspose.slides.internal.p2n;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.k7;
import com.aspose.slides.internal.x4g.s7;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

public class l6 {
   public static List<Shape> n5(s7 var0, w1 var1) {
      k7 var2 = var0.u3();
      w1[] var3 = var2.n5();
      ArrayList var4 = new ArrayList();

      for (int var5 = 0; var5 < var3.length; var5++) {
         int var6 = var5 < var3.length - 1 ? var5 + 1 : 0;
         w1 var7 = var3[var5];
         w1 var8 = var3[var6];
         k5 var9 = new k5(var1, var7, var8);
         var4.add(var9);
      }

      return var4;
   }

   public static List<Shape> l6(s7 var0, w1 var1) {
      k7 var2 = var0.u3();
      w1[] var3 = var2.n5();
      byte[] var4 = var2.l6();
      ArrayList var5 = new ArrayList();
      int var6 = 0;

      while (var6 < var3.length) {
         int var7 = var6 + 1;
         if (var7 > var3.length - 1) {
            var7 = 0;
         }

         if ((var4[var7] & 255 & 3) == 3) {
            var7 += 2;
         }

         n5 var8 = new n5(var1, var3, var6, var7);
         var5.add(var8);
         if (var7 != 0) {
            var6 = var7;
         } else {
            var6++;
         }
      }

      return var5;
   }
}
