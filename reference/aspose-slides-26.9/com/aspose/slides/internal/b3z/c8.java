package com.aspose.slides.internal.b3z;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class c8 {
   public static float n5(String var0) {
      return n5(var0, 0.0F);
   }

   public static float n5(String var0, float var1) {
      try {
         return d1.n5(var0) ? var1 : n1.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
      } catch (RuntimeException var3) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var3;
         } else {
            return var1;
         }
      }
   }

   public static String n5(float var0) {
      return n1.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
   }
}
