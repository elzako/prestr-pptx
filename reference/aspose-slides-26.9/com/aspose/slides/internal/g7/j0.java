package com.aspose.slides.internal.g7;

public class j0 implements q9 {
   private double n5;
   private double l6;
   private o6 k5;

   public j0(double var1, double var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final double l6() {
      return this.l6;
   }

   public final void l6(double var1) {
      this.l6 = var1;
   }

   final void n5(o6 var1) {
      this.k5 = var1;
   }

   @Override
   public final q9 k5() {
      return new j0(this.n5, this.l6);
   }

   @Override
   public final void n5(double var1, double var3) {
      this.n5 += var1;
      this.l6 += var3;
   }

   @Override
   public final Object deepClone() {
      return new j0(this.n5, this.l6);
   }
}
