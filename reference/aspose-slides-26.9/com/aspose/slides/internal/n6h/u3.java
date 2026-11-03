package com.aspose.slides.internal.n6h;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.b8u.q0;
import com.aspose.slides.internal.r1x.f0;
import com.aspose.slides.internal.r1x.y1;
import com.aspose.slides.internal.r1x.y2;
import com.aspose.slides.ms.System.IDisposable;

public class u3 {
   private static final Dictionary<Object, Object> n5 = new Dictionary<>();
   private static final Dictionary<Object, List<Object>> l6 = new Dictionary<>();
   private static final Object k5 = new Object();

   public static void n5(y2 var0, Object var1) {
      List var2 = new List();
      synchronized (k5) {
         if (var1 == null) {
            if (l6.containsKey(var0)) {
               List var4 = l6.get_Item(var0);
               var2.addItem(var4);
               l6.removeItemByKey(var0);
            }

            n5.removeItemByKey(var0);
            var0.n5(null);
            var0.n5().dispose();
         } else {
            l6(var0, var1);
         }
      }

      List$Enumerator var18 = var2.iterator();

      try {
         while (var18.hasNext()) {
            List var19 = (List)var18.next();
            List$Enumerator var5 = var19.iterator();

            try {
               while (var5.hasNext()) {
                  IDisposable var6 = (IDisposable)var5.next();
                  var6.dispose();
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }
   }

   private static void l6(y2 var0, Object var1) {
      f0 var2 = var0.n5();
      y1 var3 = new y1(var2, (q0)var1);
      n5.set_Item(var0, var0);
      var0.n5(var3);
      IDisposable var4 = com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class);
      if (var4 != null) {
         List var5;
         if (l6.containsKey(var0)) {
            var5 = l6.get_Item(var0);
         } else {
            var5 = new List();
            l6.set_Item(var0, var5);
         }

         if (!var5.containsItem(var4)) {
            var5.addItem(var4);
         }
      }
   }
}
