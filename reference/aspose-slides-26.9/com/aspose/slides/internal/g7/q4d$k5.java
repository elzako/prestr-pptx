package com.aspose.slides.internal.g7;

import java.util.Comparator;

class q4d$k5 implements Comparator<Object> {
   private q4d$k5() {
   }

   @Override
   public final int compare(Object x, Object y) {
      q4d$l6 var3 = (q4d$l6)x;
      q4d$l6 var4 = (q4d$l6)y;
      int var5 = com.aspose.slides.ms.System.c3.n5(var3.n5, var4.n5);
      if (var5 == 0) {
         var5 = com.aspose.slides.ms.System.c3.n5(var3.l6, var4.l6);
         if (var5 == 0) {
            var5 = com.aspose.slides.ms.System.c3.n5(var3.k5, var4.k5);
            if (var5 == 0) {
               var5 = com.aspose.slides.ms.System.c3.n5(var3.u3, var4.u3);
            }
         }
      }

      return var5;
   }

   // $VF: synthetic method
   q4d$k5(q4d$1 var1) {
      this();
   }
}
