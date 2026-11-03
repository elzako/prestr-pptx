package com.aspose.slides.internal.k2s;

import com.aspose.slides.internal.f7k.c8;
import com.aspose.slides.ms.System.t9;

public abstract class k5 implements n5 {
   private final l6 n5;
   private final a6 l6;

   protected k5(l6 var1, a6 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   protected final float n5() {
      return this.l6.a6 / this.n5.n5().i1();
   }

   @Override
   public final float n5(char var1, char var2) {
      c8 var3 = this.n5.n5(this.l6(var1), this.l6(var2));
      return var3 == null ? 0.0F : var3.d5() * this.n5();
   }

   @Override
   public final float n5(char var1) {
      com.aspose.slides.internal.f7k.u9 var2 = this.l6(var1);
      return var2.p8() ? var2.s3() * this.n5() : this.l6.a6;
   }

   @Override
   public final float n5(String var1) {
      float var2 = 0.0F;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         var2 += this.n5(var4);
         if (var3 > 0) {
            var2 -= this.n5(var1.charAt(var3 - 1), var4);
         }
      }

      return var2;
   }

   protected final com.aspose.slides.internal.f7k.u9 l6(char var1) {
      com.aspose.slides.internal.f7k.u9 var2 = this.n5.n5(t9.q0(var1));
      if (var2 == null) {
         var2 = this.n5.l6();
      }

      return var2;
   }
}
