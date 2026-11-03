package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

abstract class g2l extends v6g {
   protected byte n5 = 2;
   private double k5;
   protected double l6;
   private String u3;

   protected abstract f6d[] k5();

   public final double h0() {
      return this.k5;
   }

   protected final void n5(double var1) {
      this.k5 = var1;
   }

   public final void l6(double var1) {
      this.n5(var1, this.k5());
   }

   public final void n5(String var1) {
      this.u3 = var1;
      this.l6(this.u3);
   }

   public final boolean c8() {
      return this.k5().length == 0;
   }

   public static double n5(IGenericEnumerable<t9z> var0) {
      double var1 = 0.0;
      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            t9z var4 = (t9z)var3.next();
            var1 += com.aspose.slides.ms.System.q1.n5(var4.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }

   protected static boolean n5(g4j var0, t9z var1) {
      if (var0 == null) {
         throw new ArgumentNullException("sector");
      } else if (var1 == null) {
         throw new ArgumentNullException("dataPoint");
      } else if (!var1.c8()) {
         return true;
      } else if (var0.t2() != 0.0) {
         return true;
      } else {
         return var1.t2() && !var1.y4().t2().n3().l6().e2() ? false : var1.y4().t2().n3().getDisplayBlanksAs() != 0;
      }
   }

   protected final void n5(IGenericEnumerable<t9z> var1, double[] var2, double[] var3) {
      double var4 = 0.001;
      double var6 = 360.0;
      int var8 = l6(var1);
      var2[0] = var8 > 0 ? 0.001 : 0.0;
      var3[0] = var8 > 0 ? 360.0 - var8 * 0.001 : 360.0;
   }

   protected void n5(double var1, f6d[] var3) {
      this.l6 = var1;
      double var4 = 0.0;
      this.k5 = 0.0;

      for (int var6 = 0; var6 < var3.length; var6++) {
         f6d var7 = var3[var6];
         double var8 = com.aspose.slides.ms.System.q1.n5(var7.s7());
         this.k5 += var8;
         var7.n5(var8 / var1);
         double var10 = com.aspose.slides.ms.System.q1.n5(var7.t2(), this.n5 & 255, (short)1);
         var4 += var10;
      }

      if (var4 > 1.0) {
         int var16 = com.aspose.slides.internal.v6g.k5.u3((var4 - 1.0) * 100.0, 14);
         f6d[] var18 = this.n5(var16, var3, false);

         for (f6d var15 : var18) {
            var15.n5(com.aspose.slides.ms.System.q1.n5(var15.t2(), this.n5 & 255, (short)1));
            var15.n5(com.aspose.slides.ms.System.q1.n5(var15.t2() - com.aspose.slides.ms.System.q1.a6(0.1, this.n5 & 0xFF), this.n5 & 255));
         }
      }

      if (var4 < 1.0 && (this.n5 & 255) < 3) {
         int var17 = com.aspose.slides.internal.v6g.k5.u3((1.0 - var4) * 100.0, 14);
         f6d[] var19 = this.n5(var17, var3, true);

         for (f6d var23 : var19) {
            var23.n5(com.aspose.slides.ms.System.q1.n5(var23.t2(), this.n5 & 255, (short)1));
            var23.n5(com.aspose.slides.ms.System.q1.n5(var23.t2() + com.aspose.slides.ms.System.q1.a6(0.1, this.n5 & 0xFF), this.n5 & 255));
         }
      }
   }

   private f6d[] n5(int var1, f6d[] var2, boolean var3) {
      f6d[] var4 = new f6d[var1];

      for (f6d var8 : var2) {
         if (!(var8.t2() < 0.01) || var3) {
            for (int var9 = 0; var9 < var1; var9++) {
               if (var4[var9] == null) {
                  var4[var9] = var8;
                  break;
               }

               double var10 = this.k5(var8.t2());
               double var12 = this.k5(var4[var9].t2());
               if (var3 && var10 > var12 || !var3 && var10 < var12) {
                  f6d var14 = var8;

                  for (int var15 = var9; var15 < var1; var15++) {
                     if (var4[var15] == null) {
                        var4[var15] = var8;
                        break;
                     }

                     f6d var16 = var4[var15];
                     var4[var15] = var14;
                     var14 = var16;
                  }
                  break;
               }
            }
         }
      }

      return var4;
   }

   private double k5(double var1) {
      double var3 = com.aspose.slides.ms.System.q1.n5(var1, this.n5 & 255, (short)1);
      return var1 - var3;
   }

   private void l6(String var1) {
      if (var1 != null && com.aspose.slides.ms.System.d1.t2(var1, "%") && com.aspose.slides.ms.System.d1.t2(var1, ".")) {
         this.n5 = (byte)(1 + (com.aspose.slides.ms.System.d1.c8(var1, "%") - com.aspose.slides.ms.System.d1.c8(var1, ".")));
      }
   }

   private static int l6(IGenericEnumerable<t9z> var0) {
      int var1 = 0;
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            t9z var3 = (t9z)var2.next();
            if (var3.n5() == 0.0 && !var3.c8()) {
               var1++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }
}
