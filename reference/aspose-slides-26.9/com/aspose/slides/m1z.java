package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class m1z {
   static void n5(q2u var0, com.aspose.slides.internal.k4y.v4b var1, t5w var2) {
      if (var0 == null) {
         throw new ArgumentNullException("formatOverrides");
      }

      if (var1 != null) {
         if (var1.n5() != null) {
            for (com.aspose.slides.internal.k4y.j7d var6 : var1.n5()) {
               if (var6 != null) {
                  d4w var7 = new d4w(var0);
                  h6q.n5(var7, var6, var2);
                  var0.n5(var7);
               }
            }
         }
      }
   }

   static void n5(q2u var0, com.aspose.slides.internal.k4y.w2p var1, g6c var2) {
      if (var0 == null) {
         throw new ArgumentNullException("formatOverrides");
      }

      com.aspose.slides.Collections.Generic.IGenericCollection var3 = var0.n5();
      if (var3 != null) {
         com.aspose.slides.internal.k4y.v4b var4 = new com.aspose.slides.internal.k4y.v4b();
         IGenericEnumerator var5 = var3.iterator();

         try {
            while (var5.hasNext()) {
               d4w var6 = (d4w)var5.next();
               com.aspose.slides.internal.k4y.j7d var7 = new com.aspose.slides.internal.k4y.j7d();
               h6q.n5(var6, var7, var2);
               var4.n5(var7);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         var1.n5(var4);
      }
   }
}
