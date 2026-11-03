package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class q0 {
   public static boolean n5(List<com.aspose.slides.internal.r4.u9> var0, int var1) {
      return n5(var0, var1, false);
   }

   public static boolean l6(List<com.aspose.slides.internal.r4.u9> var0, int var1) {
      return n5(var0, var1, true);
   }

   private static boolean n5(List<com.aspose.slides.internal.r4.u9> var0, int var1, boolean var2) {
      int var3 = 0;
      com.aspose.slides.internal.r4.u3 var4 = new com.aspose.slides.internal.r4.u3(var0, var2 ? var0.size() : 0);

      while (var2 ? var4.u3() : var4.l6()) {
         v0 var5;
         if (var2) {
            var5 = ((com.aspose.slides.internal.r4.u9)var4.a6()).n5();
         } else {
            var5 = ((com.aspose.slides.internal.r4.u9)var4.k5()).n5();
         }

         if (var5.y_()) {
            o0 var6 = (o0)var5;
            if (var6.t4() < 1000) {
               var4.n5(new o0(var6.z1(), 1000, var6.h0(), var6.k7(), var6.t9()));
            }
         } else if (var5.x_()) {
            e5 var8 = (e5)var5;
            var3 += var8.z1();
            if (!var2) {
               var4.a6();
            }

            var5 = (v0)var4.a6();
            var4.k5();
            if (var5.e2()) {
               var4.l6(new o0(0, 1000, false, null, false));
            }

            if (!var2) {
               var4.k5();
            }
         } else if (var5.m1()) {
            if (com.aspose.slides.internal.v6g.k5.l6(var5, z1.class)) {
               z1 var9 = (z1)var5;
               if (var9.h0() < 1000) {
                  var9.n5(1000);
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, s4.class)) {
               s4 var10 = (s4)var5;
               var3 += var10.s7().l6();
            }
         } else {
            i1 var11 = (i1)var5;
            var3 += var11.z1();
         }

         if (var3 >= var1) {
            return false;
         }
      }

      return true;
   }

   public static int n5(List<com.aspose.slides.internal.r4.u9> var0, int var1, int var2) {
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3(var0);
      int var4 = var2 - var1 + 1;
      int var5 = 0;

      while (var3.l6()) {
         v0 var6 = ((com.aspose.slides.internal.r4.u9)var3.k5()).n5();
         if (var6.e2()) {
            var5 += ((i1)var6).z1();
         } else if (var6.x_()) {
            var5 += ((i1)var6).z1();
         }

         if (--var4 == 0) {
            break;
         }
      }

      return var5;
   }

   public static int n5(List<com.aspose.slides.internal.r4.u9> var0) {
      return n5(var0, 0, var0.size() - 1);
   }

   public static boolean l6(List<com.aspose.slides.internal.r4.u9> var0) {
      com.aspose.slides.internal.r4.u9 var1 = com.aspose.slides.internal.v3.t2.n5(var0);
      return var1.k5() ? var1.n5().c8() : var1.l6().get_Item(0).n5().c8();
   }

   public static boolean k5(List<com.aspose.slides.internal.r4.u9> var0) {
      if (var0.size() == 0) {
         return false;
      }

      com.aspose.slides.internal.r4.u9 var1 = (com.aspose.slides.internal.r4.u9)var0.get_Item(0);
      return var1.k5() ? var1.n5().c8() : var1.l6().get_Item(0).n5().c8();
   }

   public static boolean u3(List<com.aspose.slides.internal.r4.u9> var0) {
      v0 var1 = (v0)com.aspose.slides.internal.v3.t2.n5(var0);
      return var1.y_() && ((o0)var1).t4() < 1000 ? true : com.aspose.slides.internal.v6g.k5.l6(var1, z1.class) && ((z1)var1).h0() < 1000;
   }

   public static int k5(List<com.aspose.slides.internal.r4.u9> var0, int var1) {
      int var2;
      for (var2 = var1 - 1; var2 >= 0; var2--) {
         i1 var3 = (i1)var0.get_Item(var2);
         if (var3.y_() && var3.t4() < 1000) {
            break;
         }
      }

      return var2;
   }
}
