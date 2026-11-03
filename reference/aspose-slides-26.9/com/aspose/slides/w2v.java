package com.aspose.slides;

class w2v {
   private final k6a n5;
   private final int l6;
   private double k5 = Double.NaN;
   private double u3 = Double.NaN;
   private double a6 = Double.NaN;

   public final k6a n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public w2v(k6a var1, int var2, double var3, double var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.a6 = var3;
      this.u3 = var5;
   }

   public final double k5() {
      return this.u3;
   }

   public final void n5(double var1) {
      if (this.a6() < var1 && var1 < this.u3()) {
         this.k5 = var1;
         if (com.aspose.slides.ms.System.d2.k5(this.u3) || this.u3 < var1) {
            this.k5(var1);
         }
      }
   }

   public final void l6(double var1) {
      if (this.a6() < var1 && var1 < this.u3()) {
         this.a6 = var1;
         if (com.aspose.slides.ms.System.d2.k5(this.u3) || com.aspose.slides.ms.System.q1.n5(this.u3) > com.aspose.slides.ms.System.q1.n5(var1)) {
            this.k5(var1);
         }
      }
   }

   public final void k5(double var1) {
      if (this.a6() <= var1) {
         if (q3g.n5(this.l6) || this.l6 == 63 || this.l6 == 17) {
            if (com.aspose.slides.ms.System.q1.n5(var1) <= com.aspose.slides.ms.System.q1.n5(this.u3())) {
               this.u3 = var1;
            }
         } else if (var1 <= this.u3()) {
            this.u3 = var1;
         }
      }
   }

   private double u3() {
      return !com.aspose.slides.ms.System.d2.k5(this.a6) ? this.a6 : Double.MAX_VALUE;
   }

   private double a6() {
      return !com.aspose.slides.ms.System.d2.k5(this.k5) ? this.k5 : -Double.MAX_VALUE;
   }
}
