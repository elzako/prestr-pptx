package com.aspose.slides.internal.r1x;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class a0 {
   public static int n5(IEnumerable var0) {
      int var1 = 0;
      if (var0 == null) {
         return var1;
      }

      IEnumerator var2 = var0.iterator();

      while (var2.hasNext()) {
         var1++;
      }

      return var1;
   }

   public static <T> T[] n5(Class<T> var0, IGenericEnumerable<T> var1, z3<T> var2) {
      List var3 = new List();
      IGenericEnumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            Object var5 = var4.next();
            if (var2.n5((T)var5)) {
               var3.addItem(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return (T[])n5(var0, var3);
   }

   public static <T> T[] n5(Class<T> var0, IGenericEnumerable<T> var1) {
      Object[] var2 = (Object[])com.aspose.slides.internal.v6g.k5.n5(var0, new int[]{n5(var1)});
      int var3 = 0;
      IGenericEnumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            Object var5 = var4.next();
            var2[var3++] = var5;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return (T[])var2;
   }
}
