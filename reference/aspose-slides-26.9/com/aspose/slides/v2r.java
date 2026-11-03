package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class v2r {
   public static void n5(IControlCollection var0, com.aspose.slides.internal.k4y.f3b var1, i1x var2) {
      if (var1 != null) {
         for (com.aspose.slides.internal.k4y.k5 var6 : var1.l6()) {
            IControl var7 = ((ControlCollection)var0).n5();
            c5i.n5(var7, var6, var2);
            if (com.aspose.slides.ms.System.o0.n5(((Control)var7).k5(), com.aspose.slides.ms.System.o0.n5) && var7.getFrame() == null) {
               var0.remove(var7);
            }
         }
      }
   }

   public static void n5(IControlCollection var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.f3b> var1, n4i var2) {
      if (var0.size() != 0) {
         com.aspose.slides.internal.k4y.f3b var3 = (com.aspose.slides.internal.k4y.f3b)var1.invoke();
         IGenericEnumerator var4 = var0.iterator();

         try {
            while (var4.hasNext()) {
               IControl var5 = (IControl)var4.next();
               if (!((Control)var5).u3()) {
                  c5i.n5(var5, var3.n5(), var2);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }
}
