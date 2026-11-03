package com.aspose.slides.internal.g9;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.ms.System.d1;

public class u9 {
   public static a6 n5(com.aspose.slides.internal.v2.s7 var0) {
      return n5(var0, null);
   }

   public static a6 n5(com.aspose.slides.internal.v2.s7 var0, Dictionary<String, a6> var1) {
      return n5(var0, var1, null);
   }

   public static a6 n5(com.aspose.slides.internal.v2.s7 var0, Dictionary<String, a6> var1, com.aspose.slides.internal.e7.t2 var2) {
      a6 var3 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.c8.class)) {
         var3 = n5(((com.aspose.slides.internal.v2.c8)var0).n5(), var1);
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.n5.class)) {
            String var8 = d1.n5("Unknown colorspace type '{0}'", new Object[]{var0});
            throw new IOException(var8);
         }

         com.aspose.slides.internal.v2.n5 var4 = (com.aspose.slides.internal.v2.n5)var0;
         String var5 = ((com.aspose.slides.internal.v2.c8)var4.l6(0)).n5();
         if (d1.a6(var5, l6.l6())) {
            var3 = new l6(var4);
         } else if (d1.a6(var5, n3.n5())) {
            var3 = n3.n5;
         } else if (d1.a6(var5, s7.n5())) {
            var3 = new s7();
         } else if (d1.a6(var5, c8.n5())) {
            var3 = c8.n5;
         } else if (d1.a6(var5, k5.l6())) {
            var3 = new k5(var4);
         } else if (d1.a6(var5, x8.n5())) {
            var3 = new x8(var4);
         } else if (d1.a6(var5, e2.l6()) || d1.a6(var5, e2.u9())) {
            var3 = new e2(var4, var2);
         } else if (d1.a6(var5, t9.n5())) {
            var3 = new t9(var4);
         } else if (d1.a6(var5, t4.n5())) {
            var3 = new t4(var4);
         } else if (d1.a6(var5, y4.l6())) {
            var3 = new y4(var4);
         } else {
            if (!d1.a6(var5, z1.n5())) {
               String var6 = d1.n5("Unknown colorspace array type '{0}'", new Object[]{var5});
               throw new IOException(var6);
            }

            var3 = new z1(var4);
         }
      }

      return var3;
   }

   public static a6 n5(String var0, Dictionary<String, a6> var1) {
      a6 var2 = null;
      if (d1.a6(var0, c8.n5()) || d1.a6(var0, c8.l6())) {
         var2 = c8.n5;
      } else if (d1.a6(var0, n3.n5()) || d1.a6(var0, n3.l6())) {
         var2 = n3.n5;
      } else if (d1.a6(var0, s7.n5()) || d1.a6(var0, s7.l6())) {
         var2 = new s7();
      } else if (var1 != null && var1.containsKey(var0)) {
         var2 = (a6)var1.get_Item(var0);
      } else if (d1.a6(var0, t9.n5())) {
         var2 = new t9();
      } else {
         if (!d1.a6(var0, z1.n5())) {
            String var3 = d1.n5("Unknown colorspace '{0}'", new Object[]{var0});
            throw new IOException(var3);
         }

         var2 = new z1();
      }

      return var2;
   }
}
