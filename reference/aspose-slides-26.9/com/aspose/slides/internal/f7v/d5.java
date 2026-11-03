package com.aspose.slides.internal.f7v;

public class d5 extends p3 {
   private double t2;
   private double s7;
   private double x8;
   private double n3;
   private double y4;
   private double e2;
   private double t9;
   private double z1;

   public d5(com.aspose.slides.internal.c5e.l6 var1) {
      super("cHRM", var1);
   }

   @Override
   public void n5(a6 var1) {
      if (var1.n5 != 32) {
         throw new com.aspose.slides.internal.c5e.e2("bad chunk " + var1);
      }

      this.t2 = com.aspose.slides.internal.c5e.h0.n5(com.aspose.slides.internal.c5e.h0.k5(var1.k5, 0));
      this.s7 = com.aspose.slides.internal.c5e.h0.n5(com.aspose.slides.internal.c5e.h0.k5(var1.k5, 4));
      this.x8 = com.aspose.slides.internal.c5e.h0.n5(com.aspose.slides.internal.c5e.h0.k5(var1.k5, 8));
      this.n3 = com.aspose.slides.internal.c5e.h0.n5(com.aspose.slides.internal.c5e.h0.k5(var1.k5, 12));
      this.y4 = com.aspose.slides.internal.c5e.h0.n5(com.aspose.slides.internal.c5e.h0.k5(var1.k5, 16));
      this.e2 = com.aspose.slides.internal.c5e.h0.n5(com.aspose.slides.internal.c5e.h0.k5(var1.k5, 20));
      this.t9 = com.aspose.slides.internal.c5e.h0.n5(com.aspose.slides.internal.c5e.h0.k5(var1.k5, 24));
      this.z1 = com.aspose.slides.internal.c5e.h0.n5(com.aspose.slides.internal.c5e.h0.k5(var1.k5, 28));
   }

   public double l6() {
      return this.t2;
   }

   public double k5() {
      return this.s7;
   }

   public double u3() {
      return this.x8;
   }

   public double a6() {
      return this.n3;
   }

   public double u9() {
      return this.y4;
   }

   public double h0() {
      return this.e2;
   }

   public double c8() {
      return this.t9;
   }

   public double t2() {
      return this.z1;
   }
}
