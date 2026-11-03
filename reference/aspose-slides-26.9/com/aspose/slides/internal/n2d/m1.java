package com.aspose.slides.internal.n2d;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.y8;

public class m1 {
   public static final boolean n5 = z3.n5() == 0;
   public static final boolean l6 = z3.n5() == 1;
   public static final boolean k5 = z3.n5() == 2;
   public static final boolean u3 = y8.k5("Mono.Runtime") != null;

   public static float n5(com.aspose.slides.internal.o9b.t4 var0) {
      float var1 = var0.c8();
      if (var1 < 0.01) {
         var1 = 96.0F;
      }

      return var1;
   }

   public static float l6(com.aspose.slides.internal.o9b.t4 var0) {
      float var1 = var0.y4();
      if (var1 < 0.01) {
         var1 = 96.0F;
      }

      return var1;
   }

   private static IGenericEnumerable<String> l6(String var0) {
      String[] var1 = new String[]{d1.n5};
      List var2 = new List();
      String var3 = com.aspose.slides.internal.z0k.z1.a6(var0);

      for (String var7 : var1) {
         for (String var8 = var7; !d1.n5(var8); var8 = com.aspose.slides.internal.z0k.z1.l6(var8)) {
            var2.addItem(com.aspose.slides.internal.z0k.z1.n5(var0, d1.n5(new String[]{var8, var3})));
         }
      }

      var2.addItem(var0);
      return var2;
   }

   public static String n5(String var0) {
      if (l6) {
         var0 = d1.n5(var0, '\\', '/');
      }

      IGenericEnumerator var1 = l6(var0).iterator();

      try {
         while (var1.hasNext()) {
            String var2 = (String)var1.next();
            if (com.aspose.slides.internal.z0k.u9.k5(var2)) {
               return var2;
            }

            String var3 = null;
            String[] var4 = new String[]{var3};
            boolean var5 = l6 && n5(var2, var4);
            var3 = var4[0];
            if (var5) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return var0;
   }

   private static boolean n5(String var0, String[] var1) {
      if (!d1.n5(var0) && !com.aspose.slides.internal.z0k.u9.k5(var0)) {
         String var2 = com.aspose.slides.internal.z0k.z1.u9(var0);
         if (com.aspose.slides.internal.z0k.u3.k5(var2)) {
            String[] var3 = com.aspose.slides.internal.z0k.u3.a6(var2);

            for (String var7 : var3) {
               if (d1.u3(var7, var0, (short)5)) {
                  var1[0] = var7;
                  return true;
               }
            }
         }
      }

      var1[0] = var0;
      return false;
   }
}
