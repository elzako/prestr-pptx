package com.aspose.slides.internal.e1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class k5 {
   private int n5;
   private double[] l6 = new double[4];

   public final com.aspose.slides.internal.o9b.y1 n5(a6 var1) {
      if (var1 == null) {
         return com.aspose.slides.internal.o9b.y1.n5;
      }

      u3 var2 = var1.n5().u9();
      return this.n5(var2.n5().u3(), var2.l6().u3(), var2.k5().u3(), var2.u3().u3());
   }

   public final com.aspose.slides.internal.o9b.y1 n5(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1 var4
   ) {
      if (com.aspose.slides.internal.o9b.w1.n5(var1, var2)
         && com.aspose.slides.internal.o9b.w1.n5(var1, var3)
         && com.aspose.slides.internal.o9b.w1.n5(var1, var4)) {
         return new com.aspose.slides.internal.o9b.y1(var1.u3(), com.aspose.slides.internal.o9b.f2.n5.a6());
      }

      this.n5 = 0;
      this.l6(var1.u3(), var2.u3(), var3.u3(), var4.u3());
      List var5 = this.k5(var1.u3(), var2.u3(), var3.u3(), var4.u3());
      return n5(var5);
   }

   private static double n5(double var0, double var2, double var4, double var6, double var8) {
      return (var6 - 3.0 * var4 + 3.0 * var2 - var0) * q1.a6(var8, 3.0)
         + (3.0 * var4 - 6.0 * var2 + 3.0 * var0) * q1.a6(var8, 2.0)
         + (3.0 * var2 - 3.0 * var0) * var8
         + var0;
   }

   private static double n5(double var0, double var2, double var4, double var6) {
      return 3.0 * var6 - 9.0 * var4 + 9.0 * var2 - 3.0 * var0;
   }

   private static double n5(double var0, double var2, double var4) {
      return 6.0 * var4 - 12.0 * var2 + 6.0 * var0;
   }

   private static double n5(double var0, double var2) {
      return 3.0 * var2 - 3.0 * var0;
   }

   private static double l6(double var0, double var2, double var4) {
      return q1.a6(var2, 2.0) - 4.0 * var0 * var4;
   }

   private static double n5(double var0, double var2, double var4, boolean var6) {
      double var7 = l6(var0, var2, var4);
      return (-var2 + q1.z3(var7) * (var6 ? 1.0 : -1.0)) / (2.0 * var0);
   }

   private void l6(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1 var4
   ) {
      double var5 = n5(var1.l6(), var2.l6(), var3.l6(), var4.l6());
      double var7 = n5(var1.l6(), var2.l6(), var3.l6());
      double var9 = n5(var1.l6(), var2.l6());
      double var11 = n5(var1.k5(), var2.k5(), var3.k5(), var4.k5());
      double var13 = n5(var1.k5(), var2.k5(), var3.k5());
      double var15 = n5(var1.k5(), var2.k5());
      this.k5(var5, var7, var9);
      this.k5(var11, var13, var15);
   }

   private List<com.aspose.slides.internal.o9b.w1> k5(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1 var4
   ) {
      List var5 = new List();
      var5.addItem(var1.u3());
      var5.addItem(var4.u3());

      for (int var6 = 0; var6 < this.n5; var6++) {
         double var7 = this.l6[var6];
         double var9 = n5(var1.l6(), var2.l6(), var3.l6(), var4.l6(), var7);
         double var11 = n5(var1.k5(), var2.k5(), var3.k5(), var4.k5(), var7);
         com.aspose.slides.internal.o9b.w1 var13 = new com.aspose.slides.internal.o9b.w1((float)var9, (float)var11);
         var5.addItem(var13.u3());
      }

      return var5;
   }

   private static com.aspose.slides.internal.o9b.y1 n5(List<com.aspose.slides.internal.o9b.w1> var0) {
      float var1 = Float.MAX_VALUE;
      float var2 = Float.MAX_VALUE;
      float var3 = -Float.MAX_VALUE;
      float var4 = -Float.MAX_VALUE;
      List$Enumerator var5 = var0.iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.o9b.w1 var6 = (com.aspose.slides.internal.o9b.w1)var5.next();
            var1 = q1.l6(var6.l6(), var1);
            var2 = q1.l6(var6.k5(), var2);
            var3 = q1.n5(var6.l6(), var3);
            var4 = q1.n5(var6.k5(), var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return new com.aspose.slides.internal.o9b.y1(var1, var2, var3 - var1, var4 - var2);
   }

   private void k5(double var1, double var3, double var5) {
      double var7 = l6(var1, var3, var5);
      if (!(var7 < 0.0)) {
         if (var1 == 0.0) {
            if (var3 != 0.0) {
               this.n5(-var5 / var3);
            }
         } else {
            if (var7 == 0.0) {
               this.n5(n5(var1, var3, var5, true));
            } else {
               this.n5(n5(var1, var3, var5, true));
               this.n5(n5(var1, var3, var5, false));
            }
         }
      }
   }

   private void n5(double var1) {
      if (!(var1 < 0.0) && !(1.0 < var1)) {
         this.l6[this.n5] = var1;
         this.n5++;
      }
   }
}
