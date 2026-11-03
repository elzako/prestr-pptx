package com.aspose.slides.internal.u5b;

import com.aspose.slides.internal.r5t.z1;
import com.aspose.slides.ms.System.a0;
import com.aspose.slides.ms.System.z7;

public class n5 {
   private static boolean n5 = true;

   public static z7 n5(l6 var0) {
      com.aspose.slides.internal.k9m.n5 var1 = new com.aspose.slides.internal.k9m.n5(var0);
      if (n5) {
         l6(var0, var1);
      } else {
         n5(var0, var1);
      }

      return var1;
   }

   private static void n5(l6 var0, com.aspose.slides.internal.k9m.n5 var1) {
      try {
         var0.beginInvoke();
      } catch (RuntimeException var6) {
         var0.getDelegate().setException(var6);
      } finally {
         var1.u3();
      }
   }

   private static void l6(l6 var0, com.aspose.slides.internal.k9m.n5 var1) {
      z1.n5(new k5(var0, var1));
   }

   public static void n5(a0 var0, z7 var1) {
      var1.l6().a6();
      var0.throwException();
   }
}
