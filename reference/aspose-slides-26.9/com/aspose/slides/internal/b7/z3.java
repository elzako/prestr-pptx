package com.aspose.slides.internal.b7;

public abstract class z3 {
   private z3$n5 n5;

   public final o1 l6() {
      if (null == this.n5) {
         this.n5 = new z3$n5();
         this.n5(this.n5);
      }

      return this.n5;
   }

   protected void n5(z3$l6 var1) {
   }

   protected final void k5() {
      this.n5 = null;
   }

   protected static double n5(double var0, double var2, double var4) {
      if (var2 < var0) {
         return var0;
      } else {
         return var2 > var4 ? var4 : var2;
      }
   }

   protected static double l6(double var0, double var2, double var4) {
      return var0 * var2 / var4;
   }

   protected static double k5(double var0, double var2, double var4) {
      return var0 + var2 - var4;
   }

   protected static double u3(double var0, double var2, double var4) {
      return (var0 + var2) / var4;
   }

   protected static double a6(double var0, double var2, double var4) {
      return var0 > 0.0 ? var2 : var4;
   }

   protected static double n5(double var0, double var2) {
      return com.aspose.slides.ms.System.q1.u3(var2, var0) * 60000.0 * 180.0 / Math.PI;
   }

   protected static double u9(double var0, double var2, double var4) {
      return var0 * com.aspose.slides.ms.System.q1.c8(com.aspose.slides.ms.System.q1.u3(var4, var2));
   }

   protected static double l6(double var0, double var2) {
      return var0 * com.aspose.slides.ms.System.q1.c8(var2 * Math.PI / 1.08E7);
   }

   protected static double h0(double var0, double var2, double var4) {
      return com.aspose.slides.ms.System.q1.z3(var0 * var0 + var2 * var2 + var4 * var4);
   }

   protected static double c8(double var0, double var2, double var4) {
      return var0 * com.aspose.slides.ms.System.q1.h0(com.aspose.slides.ms.System.q1.u3(var4, var2));
   }

   protected static double k5(double var0, double var2) {
      return var0 * com.aspose.slides.ms.System.q1.h0(var2 * Math.PI / 1.08E7);
   }

   protected static double u3(double var0, double var2) {
      return var0 * com.aspose.slides.ms.System.q1.t2(var2 * Math.PI / 1.08E7);
   }
}
