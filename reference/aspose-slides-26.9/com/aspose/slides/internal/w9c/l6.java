package com.aspose.slides.internal.w9c;

import com.aspose.slides.internal.o9b.w1;
import java.util.Iterator;

public abstract class l6 implements x8 {
   protected float u9;
   protected com.aspose.slides.internal.e6q.u3 h0;
   protected com.aspose.slides.internal.e6q.t2 c8;
   protected com.aspose.slides.internal.e6q.t2 t2;
   protected w1 s7;
   protected w1 x8;
   protected w1 n3;
   protected w1 y4;

   protected l6(float var1, com.aspose.slides.internal.e6q.u3 var2, w1 var3, w1 var4, w1 var5, w1 var6) {
      this.u9 = var1;
      this.h0 = var2;
      this.c8 = var2.l6().n5();
      this.t2 = var2.k5().n5();
      this.s7 = var3.u3();
      this.x8 = var4.u3();
      this.n3 = var5.u3();
      this.y4 = var6.u3();
   }

   protected l6$n5 n5(w1 var1, w1 var2, Iterator<com.aspose.slides.internal.e6q.u9> var3) {
      w1 var4 = null;
      int var5 = 0;
      w1 var6 = null;

      while (var4 == null && var3.hasNext()) {
         var5++;
         com.aspose.slides.internal.e6q.u9 var7 = (com.aspose.slides.internal.e6q.u9)var3.next();
         w1 var8 = var7.l6();
         if (var8 != null) {
            if (var6 != null) {
               var4 = n5(var1, var2, var6, var8);
            }

            var6 = var8;
         }
      }

      return new l6$n5(var4, var4 == null ? var5 : var5 - 1);
   }

   protected void n5(com.aspose.slides.internal.e6q.h0 var1, int var2) {
      this.n5(var1.l6(), var2);
   }

   protected void l6(com.aspose.slides.internal.e6q.h0 var1, int var2) {
      this.n5(var1.k5(), var2);
   }

   private void n5(Iterator<com.aspose.slides.internal.e6q.u9> var1, int var2) {
      for (int var3 = 0; var1.hasNext() && var3 < var2; var3++) {
         var1.next();
         var1.remove();
      }
   }

   public static w1 n5(w1 var0, float var1) {
      float var2 = var0.l6() * var0.l6() + var0.k5() * var0.k5();
      float var3 = var1 / (float)Math.sqrt(var2);
      return new w1(var0.l6() * var3, var0.k5() * var3);
   }

   public static w1 n5(w1 var0, w1 var1, w1 var2, w1 var3) {
      float var4 = (var0.l6() - var1.l6()) * (var3.k5() - var2.k5()) - (var0.k5() - var1.k5()) * (var3.l6() - var2.l6());
      float var5 = (var0.l6() - var2.l6()) * (var3.k5() - var2.k5()) - (var0.k5() - var2.k5()) * (var3.l6() - var2.l6());
      float var6 = (var0.l6() - var1.l6()) * (var0.k5() - var2.k5()) - (var0.k5() - var1.k5()) * (var0.l6() - var2.l6());
      if (Math.abs(var4) < 1.0E-4) {
         return null;
      }

      float var7 = var5 / var4;
      float var8 = var6 / var4;
      return 0.0F <= var7 && var7 <= 1.0F && 0.0F <= var8 && var8 <= 1.0F
         ? new w1(var0.l6() + var7 * (var1.l6() - var0.l6()), var0.k5() + var7 * (var1.k5() - var0.k5()))
         : null;
   }

   protected void l6(w1 var1, w1 var2) {
      w1 var3 = new w1(var1.l6(), var1.k5());
      var1.n5(var2.l6());
      var1.l6(var2.k5());
      var2.n5(var3.l6());
      var2.l6(var3.k5());
   }
}
