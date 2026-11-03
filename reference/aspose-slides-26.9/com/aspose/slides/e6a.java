package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class e6a {
   public static void n5(com.aspose.slides.internal.k4y.h1f var0, List<IEffect> var1, Effect var2, Chart var3) {
      if (n5(var1, var2, var3)) {
         n5(var0);
      } else {
         com.aspose.slides.internal.k4y.f3 var4 = (com.aspose.slides.internal.k4y.f3)var0.n5("graphicEl").l6();
         com.aspose.slides.internal.k4y.h7 var5 = (com.aspose.slides.internal.k4y.h7)var4.n5("chart").l6();
         z9u var6 = var2.k5();
         if (var6.z3() != -1) {
            switch (var6.m3()) {
               case 0:
                  var5.n5(var2.k5().z3());
                  break;
               case 1:
                  var5.l6(var2.k5().z3());
                  break;
               default:
                  throw new ArgumentOutOfRangeException();
            }
         } else {
            var5.n5(var2.k5().m1());
            var5.l6(var2.k5().k7());
         }

         var5.n5(n5(var6));
      }
   }

   private static byte n5(z9u var0) {
      if (var0.z3() != -1) {
         switch (var0.m3()) {
            case 0:
               return 1;
            case 1:
               return 2;
            default:
               throw new ArgumentOutOfRangeException();
         }
      } else {
         switch (var0.z8()) {
            case 0:
               return 3;
            case 1:
               return 4;
            default:
               throw new ArgumentOutOfRangeException();
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.h1f var0) {
      com.aspose.slides.internal.k4y.f3 var1 = (com.aspose.slides.internal.k4y.f3)var0.n5("graphicEl").l6();
      com.aspose.slides.internal.k4y.h7 var2 = (com.aspose.slides.internal.k4y.h7)var1.n5("chart").l6();
      var2.n5((byte)0);
   }

   private static boolean n5(List<IEffect> var0, Effect var1, Chart var2) {
      return n5(var1) && n5(var0, var2);
   }

   public static boolean n5(Effect var0) {
      boolean var1 = var0.k5().z3() == -1;
      boolean var2 = var0.k5().k7() == -1 && var0.k5().m1() == -1;
      return var1 && var2;
   }

   private static boolean n5(List<IEffect> var0, Chart var1) {
      List$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            Effect var3 = (Effect)var2.next();
            if (var3.k5().u3() == var1 && var3.k5().z3() != -1) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }
}
