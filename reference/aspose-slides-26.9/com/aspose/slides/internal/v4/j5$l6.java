package com.aspose.slides.internal.v4;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.ms.System.d1;

public class j5$l6 extends com.aspose.slides.internal.e5.w1 implements com.aspose.slides.internal.w2.k5 {
   private j5$n5[] l6;

   public j5$l6(com.aspose.slides.internal.e5.t9 var1, com.aspose.slides.internal.e5.w1 var2) {
      super(var1, null);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.k5 var1) {
      this.l6 = new j5$n5[var1.e2()];
      int var2 = var1.e2();

      while (--var2 >= 0) {
         String var3 = var1.c8(var2);
         String var4 = var1.s7(var2);
         String var5 = var1.t2(var2);
         String var6 = var1.x8(var2);
         this.l6[var2] = j5$n5.n5(var3, var4, var5, var6);
      }
   }

   @Override
   public void n5(int var1, a5 var2) {
   }

   @Override
   public a5 l6(int var1) {
      return null;
   }

   @Override
   public final int e2() {
      return this.l6 == null ? 0 : this.l6.length;
   }

   @Override
   public final String c8(int var1) {
      return this.l6 != null && var1 < this.l6.length && var1 >= 0 && this.l6[var1] != null ? this.l6[var1].n5 : null;
   }

   @Override
   public final String t2(int var1) {
      return this.l6 != null && var1 < this.l6.length && var1 >= 0 && this.l6[var1] != null ? this.l6[var1].k5 : null;
   }

   @Override
   public final String s7(int var1) {
      return this.l6 != null && var1 < this.l6.length && var1 >= 0 && this.l6[var1] != null ? this.l6[var1].l6 : null;
   }

   @Override
   public final String x8(int var1) {
      return this.l6 != null && var1 < this.l6.length && var1 >= 0 && this.l6[var1] != null ? this.l6[var1].u3 : null;
   }

   public final int k5(String var1) {
      byte var2 = -1;
      if (this.l6 != null && var1 != null) {
         int var3 = this.l6.length;

         do {
            var3--;
         } while (var3 >= 0 && (this.l6[var3] == null || !d1.a6(var1, this.l6[var3].l6)));
      }

      return var2;
   }

   @Override
   public final String u3(String var1) {
      int var2 = this.k5(var1);
      return var2 > 0 ? this.x8(var2) : null;
   }
}
