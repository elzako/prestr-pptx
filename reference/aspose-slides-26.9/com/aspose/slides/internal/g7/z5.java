package com.aspose.slides.internal.g7;

public class z5 implements q9 {
   private double n5;
   private double l6;
   private double k5;
   private double u3;
   private double a6;
   private double u9;
   private o6 h0;

   public z5(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.n5 = var1;
      this.u3 = var3;
      this.l6 = var5;
      this.a6 = var7;
      this.k5 = var9;
      this.u9 = var11;
   }

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final double l6() {
      return this.u3;
   }

   public final void l6(double var1) {
      this.u3 = var1;
   }

   public final double u3() {
      return this.l6;
   }

   public final void k5(double var1) {
      this.l6 = var1;
   }

   public final double a6() {
      return this.a6;
   }

   public final void u3(double var1) {
      this.a6 = var1;
   }

   public final double u9() {
      return this.k5;
   }

   public final void a6(double var1) {
      this.k5 = var1;
   }

   public final double h0() {
      return this.u9;
   }

   public final void u9(double var1) {
      this.u9 = var1;
   }

   @Override
   public final q9 k5() {
      return new z5(this.n5, this.u3, this.l6, this.a6, this.k5, this.u9);
   }

   @Override
   public final void n5(double var1, double var3) {
      this.n5 += var1;
      this.u3 += var3;
      this.l6 += var1;
      this.a6 += var3;
      this.k5 += var1;
      this.u9 += var3;
   }

   final void n5(o6 var1) {
      this.h0 = var1;
   }

   @Override
   public final Object deepClone() {
      return new z5(this.n5, this.u3, this.l6, this.a6, this.k5, this.u9);
   }
}
