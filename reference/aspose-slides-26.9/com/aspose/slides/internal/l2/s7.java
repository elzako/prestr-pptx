package com.aspose.slides.internal.l2;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class s7 {
   public static void n5(a6 var0, boolean var1) {
      n5(var0, var0.k5(), d1.n5, var1);
      List var2 = new List();
      IGenericEnumerator var3 = var0.l6().iterator();

      try {
         while (var3.hasNext()) {
            u9 var4 = (u9)var3.next();
            if (var4.u9().n5() > 0) {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      List$Enumerator var13 = var2.iterator();

      try {
         while (var13.hasNext()) {
            u9 var5 = (u9)var13.next();
            n5(var0, var5.u9(), var5.n5(), var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }
   }

   private static void n5(a6 var0, t2 var1, String var2, boolean var3) {
      int var4 = d1.k5(var2, '/');
      String var5 = d1.l6(var2, 0, var4 + 1);
      String var6 = d1.k5(var2, var4 + 1);
      String var7 = d1.n5("{0}{1}_rels/{2}.rels",new Object[]{ d1.l6(var5, "/") ? d1.n5 : "/", var5, var6});
      u9 var8 = new u9(var7, "application/vnd.openxmlformats-package.relationships+xml");
      com.aspose.slides.internal.b8.n5 var9 = new com.aspose.slides.internal.b8.n5(var8.u3(), var3);
      var9.n5("Relationships");
      var9.k5("xmlns", "http://schemas.openxmlformats.org/package/2006/relationships");
      IGenericEnumerator var10 = var1.iterator();

      try {
         for (; var10.hasNext(); var9.k5()) {
            c8 var11 = (c8)var10.next();
            var9.l6("Relationship");
            var9.k5("Id", var11.n5());
            var9.k5("Type", var11.l6());
            var9.k5("Target", var11.k5());
            if (var11.u3()) {
               var9.k5("TargetMode", "External");
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
            var10.dispose();
         }
      }

      var9.l6();
      var0.l6().n5(var8);
   }
}
