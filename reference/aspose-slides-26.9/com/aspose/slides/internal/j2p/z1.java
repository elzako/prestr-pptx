package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;

public class z1 {
   public static void n5(l0 var0, com.aspose.slides.internal.l7h.a5 var1, int var2, n5 var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, f2.class)) {
         ((f2)var0).n5(var1, var2, var3);
      } else {
         l6(var0, var1, var2, var3);
      }
   }

   public static void l6(l0 var0, com.aspose.slides.internal.l7h.a5 var1, int var2, n5 var3) {
      if (var0 == null) {
         throw new ArgumentNullException("node");
      }

      i0 var4 = var0.getChildNodes();
      IEnumerator var5 = var4.iterator();

      try {
         while (var5.hasNext()) {
            l0 var6 = (l0)var5.next();
            n5(var6, var1, var2, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }
   }

   public static void n5(l0 var0, com.aspose.slides.internal.o8m.f2 var1, int var2, n5 var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, f2.class)) {
         ((f2)var0).n5(var1, var2, var3);
      } else {
         l6(var0, var1, var2, var3);
      }
   }

   public static void l6(l0 var0, com.aspose.slides.internal.o8m.f2 var1, int var2, n5 var3) {
      if (var0 == null) {
         throw new ArgumentNullException("node");
      }

      i0 var4 = var0.getChildNodes();
      IEnumerator var5 = var4.iterator();

      try {
         while (var5.hasNext()) {
            l0 var6 = (l0)var5.next();
            n5(var6, var1, var2, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }
   }
}
