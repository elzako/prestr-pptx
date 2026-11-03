package com.aspose.slides;

class o9d extends s3 {
   private int n5 = 2;
   private int l6 = 3;
   private int k5 = 0;
   private int u3 = 0;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("t", "b", "r", "l");

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

   public o9d(com.aspose.slides.internal.k4y.p5i var1) {
      this.l6(2);
      this.n5(2);

      for (com.aspose.slides.internal.k4y.s6m var5 : var1.l6()) {
         if (var5.n5() == 22) {
            this.n5 = k5(var5.l6());
         } else if (var5.n5() == 8) {
            this.l6 = this.u3(var5.l6());
         } else if (var5.n5() == 40) {
            this.k5 = k5(var5.l6());
         } else if (var5.n5() == 39) {
            this.u3 = this.u3(var5.l6());
         } else if (var5.n5() == 21) {
            this.n5(n5(var5.l6()));
         } else if (var5.n5() == 54) {
            this.l6(l6(var5.l6()));
         }
      }
   }

   private int u3(String var1) {
      switch (a6.n5(var1)) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 4;
         case 3:
            return 3;
         default:
            return 0;
      }
   }
}
