package com.aspose.slides.internal.l9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e7.s7;
import com.aspose.slides.internal.v2.e2;
import com.aspose.slides.internal.v2.x8;
import com.aspose.slides.ms.System.d1;

public abstract class h0 implements e2 {
   private final s7 n5;

   public h0(x8 var1) {
      this.n5 = new s7(var1);
      x8 var2 = this.e2();
      var2.l6(com.aspose.slides.internal.v2.c8.g2x, com.aspose.slides.internal.v2.c8.q9u);
   }

   public h0(s7 var1) {
      this.n5 = var1;
      x8 var2 = this.e2();
      var2.l6(com.aspose.slides.internal.v2.c8.g2x, com.aspose.slides.internal.v2.c8.q9u);
   }

   @Override
   public final com.aspose.slides.internal.v2.s7 t2() {
      return this.n5.t2();
   }

   public final x8 e2() {
      return this.n5.l6();
   }

   public final s7 t9() {
      return this.n5;
   }

   public static h0 n5(com.aspose.slides.internal.v2.s7 var0, com.aspose.slides.internal.e7.t2 var1) {
      return n5(var0, false, var1);
   }

   public static h0 n5(com.aspose.slides.internal.v2.s7 var0, boolean var1, com.aspose.slides.internal.e7.t2 var2) {
      u3 var3 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var0, x8.class)) {
         x8 var4 = com.aspose.slides.internal.v6g.k5.n5(var0, x8.class);
         String var5 = var4.u3(com.aspose.slides.internal.v2.c8.u7f);
         if (d1.a6(u3.l6(), var5) || var5 == null && var1) {
            s7 var8 = new s7(var4);
            List var7 = var8.k5();
            if (var7 != null && var7.containsItem(com.aspose.slides.internal.v2.c8.u5)) {
               var3 = new a6(var8);
            } else if (var7 != null && var7.containsItem(com.aspose.slides.internal.v2.c8.y0)) {
               var3 = new l6(var8);
            } else if (var7 != null && var7.containsItem(com.aspose.slides.internal.v2.c8.q8)) {
               var3 = new u9(var8);
            } else {
               var3 = new c8(var8, var2);
            }
         } else if (d1.a6(k5.n5(), var5)) {
            com.aspose.slides.internal.v2.k5 var6 = var4.h0(com.aspose.slides.internal.v2.c8.g2);
            if (var6 != null && com.aspose.slides.internal.v2.c8.c1x.equals(var6.a6(com.aspose.slides.internal.v2.c8.r5t))) {
               return new n5(var4, null);
            }

            return new k5(var4);
         }
      }

      return var3;
   }
}
