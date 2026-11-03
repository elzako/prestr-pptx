package com.aspose.slides.internal.s5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;

public class t2 {
   private static final Dictionary<Integer, Integer> n5 = new Dictionary<>();

   public static void n5(t4 var0, com.aspose.slides.internal.z0k.t4 var1, int var2) {
      com.aspose.slides.internal.j9e.s7 var3 = n5(x8.c8());
      com.aspose.slides.internal.j9e.h0 var4 = new com.aspose.slides.internal.j9e.h0();
      var4.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, var2);

      try {
         var0.n5(var1, var3, var4);
      } catch (RuntimeException var11) {
         var1.setPosition(0L);
         com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(var0);

         try {
            var6.n5(var1, var3, var4);
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      }
   }

   private static com.aspose.slides.internal.j9e.s7 n5(x8 var0) {
      com.aspose.slides.internal.j9e.s7[] var1 = com.aspose.slides.internal.j9e.s7.n5();

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (o0.n5(var1[var2].u9(), var0.n5())) {
            return var1[var2];
         }
      }

      throw new ArgumentException(d1.n5(new Object[]{"Cannot find a codec for ", var0, "."}));
   }

   static {
      n5.addItem(1, 6);
      n5.addItem(2, 5);
      n5.addItem(5, 2);
      n5.addItem(3, 3);
      n5.addItem(4, 4);
   }
}
