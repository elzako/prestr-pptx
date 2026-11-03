package com.aspose.slides;

class y4g extends s3 {
   private boolean n5;
   private double l6;
   private double k5 = 360.0;
   private boolean u3;
   private boolean a6;

   public boolean k5() {
      return this.n5;
   }

   public double u3() {
      return this.l6;
   }

   public double a6() {
      return this.k5;
   }

   public boolean u9() {
      return this.a6;
   }

   public y4g(com.aspose.slides.internal.k4y.p5i var1) {
      this.n5(2);
      this.l6(2);

      for (com.aspose.slides.internal.k4y.s6m var5 : var1.l6()) {
         if (var5.n5() == 37) {
            this.n5 = "alongPath".equals(var5.l6());
         }

         if (var5.n5() == 45) {
            this.l6 = n5(var5.l6(), 0.0) % 360.0;
         }

         if (var5.n5() == 43) {
            this.k5 = n5(var5.l6(), 0.0) % 360.0;
         }

         if (var5.n5() == 47) {
            this.u3 = "trans".equals(var5.l6());
         }

         if (var5.n5() == 12) {
            this.a6 = "fNode".equals(var5.l6());
         }

         if (var5.n5() == 54) {
            this.l6(l6(var5.l6()));
         }

         if (var5.n5() == 21) {
            this.n5(n5(var5.l6()));
         }
      }
   }
}
