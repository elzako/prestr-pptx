package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;

class e5a {
   public static byte n5(y6e var0, e2n var1) {
      int var2 = var0.n5().l6() + var0.c8();
      byte[] var3 = var1.u9();
      return var2 < var3.length ? var3[var2] : 0;
   }

   public static boolean l6(y6e var0, e2n var1) {
      byte var2 = n5(var0, var1);
      return n5(var2);
   }

   public static boolean n5(byte var0) {
      return (var0 & 255 & 1) != 0;
   }

   public static boolean k5(y6e var0, e2n var1) {
      byte var2 = n5(var0, var1);
      return l6(var2);
   }

   public static boolean l6(byte var0) {
      return (var0 & 255 & 2) != 0;
   }

   public static byte u3(y6e var0, e2n var1) {
      return (byte)((n5(var0, var1) & 255) >> 4 & 3);
   }

   public static String n5(y6e var0, y6e var1) {
      if (var0.l6(var1)) {
         return "";
      }

      List var2 = new List();

      while (var0.n5(var1)) {
         var2.addItem(var0.u3());
         var0 = var0.t2();
      }

      return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.n8e.v4.n5(var2));
   }

   public static b4o n5(e2n var0, y6e[] var1, y6e var2, d4n var3) {
      if (var1[0].l6(var2)) {
         return new b4o("", var3);
      }

      y6e var4 = var1[0];
      y6e var5 = var1[0];

      y6e var6;
      do {
         if (com.aspose.slides.internal.n2d.u9.m1(var5.u3())) {
            var5 = var5.t2();
            var6 = var5;
            var5 = var5.t2();
         } else {
            var6 = var5;
            var5 = var5.t2();
         }
      } while (n5(var0, var6, var5, var1[0], var2, var3));

      var6 = var5.s7();
      byte var7 = u3(var6, var0);
      if ((var7 & 255) != 0 && (var7 & 255 & 1) != 0) {
         do {
            var6 = var6.t2();
            var7 = u3(var6, var0);
         } while ((var7 & 255 & 1) != 0);

         var5 = var6;
         var5 = var5.t2();
      }

      List var8 = new List();

      while (!var1[0].l6(var5)) {
         char var9 = var1[0].u3();
         if (com.aspose.slides.internal.n2d.u9.t2(var1[0].u3())) {
            if (!var1[0].l6(var5.s7())) {
               var1[0] = var1[0].t2();
               continue;
            }

            var9 = '-';
         }

         if (com.aspose.slides.internal.n2d.u9.e2(var9) && !com.aspose.slides.internal.n2d.u9.q0(var9)) {
            var1[0] = var1[0].t2();
            if (var1[0].l6(var5)) {
               break;
            }

            var9 = var1[0].u3();
            if (com.aspose.slides.internal.n2d.u9.e2(var9)) {
               continue;
            }
         }

         var8.addItem(var9);
         var1[0] = var1[0].t2();
      }

      char[] var10 = com.aspose.slides.internal.n8e.v4.n5(var8);
      IGenericList var20 = com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(var0.u9())));
      String var11 = com.aspose.slides.ms.System.d1.n5(var10);
      int var12 = var4.n5().l6() + var4.c8();
      String var13 = com.aspose.slides.internal.n2d.u9.n5(var10, var10.length, var20, var12);
      boolean var14 = ((Byte)var20.get_Item(var12) & 255 & 1) != 0;
      String var15 = com.aspose.slides.internal.n2d.u9.n5(com.aspose.slides.ms.System.d1.c8(var11), var10.length, var14);
      return new b4o(var11, var13, var15, var3);
   }

   public static b4o n5(e2n var0, y6e var1, y6e var2, d4n var3) {
      y6e[] var4 = new y6e[]{var1};
      b4o var5 = n5(var0, var4, var2, var3).k5();
      var1 = var4[0];
      return var5;
   }

   private static boolean n5(e2n var0, y6e var1, y6e var2, y6e var3, y6e var4, d4n var5) {
      if (!var2.n5(var4)) {
         return false;
      }

      if (var2.n5().n5.getSpacing() != var3.n5().n5.getSpacing()) {
         return false;
      }

      boolean var6 = com.aspose.slides.internal.n2d.u9.a6(var2.h0()) == var5.u9()
         || var5.u9() == 4 && (var2.u3() == 8205 || com.aspose.slides.internal.n2d.u9.k5((int)var2.u3()));
      boolean var7;
      if (!var5.l6()) {
         var7 = !var5.l6() || var5.k5() == com.aspose.slides.ms.System.t9.e2(var2.u3());
      } else {
         char var8 = var1.u3();
         var7 = (com.aspose.slides.ms.System.t9.u9(var8) && com.aspose.slides.ms.System.t9.c8(var8))
            == (com.aspose.slides.ms.System.t9.u9(var2.u3()) && com.aspose.slides.ms.System.t9.c8(var2.u3()));
      }

      boolean var9 = l6(var2, var0) == var5.h0();
      return var6 && var7 && var9 && !var5.n5();
   }
}
