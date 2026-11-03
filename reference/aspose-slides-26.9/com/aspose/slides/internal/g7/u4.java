package com.aspose.slides.internal.g7;

class u4 {
   private boolean n5 = false;
   private double[][] l6;
   private double[][] k5;
   private int u3;
   private int a6;
   private int u9;

   public u4() {
   }

   public final double[][] n5() {
      return this.k5;
   }

   public final double[][] l6() {
      return this.l6;
   }

   public final void k5() {
      this.n5 = false;
   }

   public final void n5(double var1) {
      double var3 = var1;
      if (this.l6 == null) {
         this.u3 = com.aspose.slides.internal.v6g.k5.u3(var3, 14);
         this.l6 = new double[this.u3][];
      } else if (this.u3 > 0) {
         this.l6[this.l6.length - this.u3][this.u9] = com.aspose.slides.ms.System.q1.n5(var3);
         if (var3 < 0.0) {
            this.u3--;
            this.u9 = 0;
         }
      } else if (this.k5 == null) {
         this.a6 = com.aspose.slides.internal.v6g.k5.u3(var3, 14);
         this.k5 = new double[this.a6][];
      } else if (this.a6 > 0) {
         this.k5[this.k5.length - this.a6][this.u9] = com.aspose.slides.ms.System.q1.n5(var3);
         if (var3 < 0.0) {
            this.a6--;
            this.u9 = 0;
         }
      }
   }
}
