package com.aspose.slides;

class y4t extends s3 {
   private int n5 = 2;
   private int l6 = 2;
   private int k5 = 2;
   private int u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("1D", "2D");

   public final int k5() {
      return this.n5;
   }

   public final int u3() {
      return this.l6;
   }

   public final int a6() {
      return this.k5;
   }

   public final int u9() {
      return this.u3;
   }

   public y4t(com.aspose.slides.internal.k4y.p5i var1) {
      this.n5(2);
      this.l6(2);
      this.u3 = 0;

      for (com.aspose.slides.internal.k4y.s6m var5 : var1.l6()) {
         if (var5.n5() == 22) {
            this.n5 = k5(var5.l6());
         } else if (var5.n5() == 27) {
            this.l6 = n5(var5.l6());
         } else if (var5.n5() == 28) {
            this.k5 = l6(var5.l6());
         } else if (var5.n5() == 21) {
            this.n5(n5(var5.l6()));
         } else if (var5.n5() == 54) {
            this.l6(l6(var5.l6()));
         } else if (var5.n5() == 17) {
            this.u3 = this.u3(var5.l6());
         }
      }
   }

   private int u3(String var1) {
      switch (a6.n5(var1)) {
         case 0:
            return 0;
         case 1:
            return 1;
         default:
            return 0;
      }
   }
}
