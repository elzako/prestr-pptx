package com.aspose.slides.internal.s1;

import com.aspose.slides.internal.g4.x8;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.l6;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;

public class n5 {
   public static boolean n5(x8 var0, x8 var1) {
      return n5(var0, var1, 0.05F);
   }

   public static boolean n5(x8 var0, x8 var1, float var2) {
      s7 var3 = var0 != null ? var0.n5() : null;
      s7 var4 = var1 != null ? var1.n5() : null;
      if (var3 != null && var4 != null) {
         s7 var5 = (s7)var3.deepClone();
         s7 var6 = (s7)var4.deepClone();
         var5.n5((m1)null, var2);
         var6.n5((m1)null, var2);

         try {
            a0 var7 = new a0(var5);

            try {
               a0 var8 = new a0(var6);

               try {
                  var7.k5(var8);
                  z1 var9 = z1.n5(new l6(1, 1));

                  try {
                     if (var7.l6(var9)) {
                        return false;
                     } else {
                        y1[] var10 = var7.n5(new m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F));
                        if (var10.length == 0) {
                           return false;
                        } else {
                           s7 var11 = new s7();
                           var11.n5(var10);
                           if (var11.h0() == 0) {
                              var11.dispose();
                              return false;
                           } else {
                              var0.n5(var11);
                              return true;
                           }
                        }
                     }
                  } finally {
                     if (var9 != null) {
                        var9.dispose();
                     }
                  }
               } finally {
                  if (var8 != null) {
                     var8.dispose();
                  }
               }
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         } catch (RuntimeException var40) {
            return false;
         } finally {
            var5.dispose();
            var6.dispose();
         }
      } else {
         return false;
      }
   }
}
