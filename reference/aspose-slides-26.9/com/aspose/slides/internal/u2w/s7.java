package com.aspose.slides.internal.u2w;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a3p.t9;

public class s7 {
   private final List<a6> n5;

   public s7(a6[] var1, a6[] var2, a6[] var3, a6[] var4) {
      this.n5 = new List<>(com.aspose.slides.ms.System.u3.n5(var1));

      for (a6 var8 : var1) {
         if ((var8.l6() & 65535) == 34665 || (var8.l6() & 65535) == 34853 || (var8.l6() & 65535) == 700) {
            this.n5.removeItem(var8);
         }
      }

      if (var2 != null && var2.length > 0) {
         this.n5.addItem(new s7$n5(var2, 34665));
      }

      if (var3 != null && var3.length > 0) {
         this.n5.addItem(new s7$n5(var3, 34853));
      }

      if (var4 != null && var4.length > 0) {
         for (a6 var12 : var4) {
            this.n5.addItem(var12);
         }
      }

      this.n5.sort();
   }

   public final int n5() {
      return com.aspose.slides.internal.g7e.a6.n5(this.n5.toArray(new a6[0]));
   }

   public static void n5(com.aspose.slides.internal.v6s.a6 var0) {
      short var1 = 18761;
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v6s.l6.class)) {
         var1 = 19789;
      }

      var0.n5((short)var1);
      var0.n5((short)42);
      long var2 = var0.l6() + 4L;
      var0.l6(var2 & 4294967295L);
   }

   public final void n5(a6[] var1) {
      for (a6 var5 : var1) {
         for (int var6 = 0; var6 < this.n5.size(); var6++) {
            if (this.n5.get_Item(var6).l6() == var5.l6()) {
               this.n5.set_Item(var6, var5);
               break;
            }
         }
      }
   }

   public final long l6() {
      long var1 = this.n5();
      long var3 = var1 * 12L + 2L;
      return var3 + 4L;
   }

   public final void n5(com.aspose.slides.internal.v6s.a6 var1, long var2, boolean var4) {
      long var5 = 4L - var2 % 4L;
      if (var5 != 4L) {
         var2 += var5;
      }

      int var7 = this.n5();
      var1.l6(var7 & 65535);
      a6[] var8 = this.n5.toArray(new a6[0]);
      long var9 = l6(var1, var8, var2);
      var1.l6(var4 ? 0L : var9 & 4294967295L);
      var1.n5(var2);
      l6(var1, var8);
   }

   private static long l6(com.aspose.slides.internal.v6s.a6 var0, a6[] var1, long var2) {
      for (a6 var7 : var1) {
         if (var7 != null && var7.c8() && !com.aspose.slides.internal.v6g.k5.l6(var7, t9.class)) {
            var7.n5(var0, var2);
            var2 += var7.a6() & 4294967295L;
         }
      }

      return var2;
   }

   private static void l6(com.aspose.slides.internal.v6s.a6 var0, a6[] var1) {
      for (a6 var5 : var1) {
         if (var5 != null && var5.c8() && !com.aspose.slides.internal.v6g.k5.l6(var5, t9.class)) {
            long var6 = var5.n5(var0);
            long var8 = 4L - var6 % 4L;
            if (var8 != 4L) {
               var0.n5(new byte[(int)var8]);
            }
         }
      }
   }

   // $VF: synthetic method
   static long n5(com.aspose.slides.internal.v6s.a6 var0, a6[] var1, long var2) {
      return l6(var0, var1, var2);
   }

   // $VF: synthetic method
   static void n5(com.aspose.slides.internal.v6s.a6 var0, a6[] var1) {
      l6(var0, var1);
   }
}
