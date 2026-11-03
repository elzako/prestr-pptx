package com.aspose.slides;

class s4b extends s3 {
   private int n5 = 0;
   private int l6 = 2;
   private boolean k5 = false;
   private boolean u3 = true;
   private int a6 = 0;
   private boolean u9 = true;
   private int h0 = 2;
   private int c8 = 2;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9("bal", "fixed", "endCnv", "tR", "bL", "bR", "tL");

   public final int k5() {
      return this.n5;
   }

   public final int u3() {
      return this.l6;
   }

   public final boolean a6() {
      return this.k5;
   }

   public final boolean u9() {
      return this.u3;
   }

   public final int h0() {
      return this.a6;
   }

   public final boolean c8() {
      return this.u9;
   }

   public final int t2() {
      return this.h0;
   }

   public final int s7() {
      return this.c8;
   }

   public s4b(com.aspose.slides.internal.k4y.p5i var1) {
      this.n5(2);
      this.l6(2);

      for (com.aspose.slides.internal.k4y.s6m var5 : var1.l6()) {
         if (var5.n5() == 6) {
            this.n5 = this.u3(var5.l6());
         } else if (var5.n5() == 7) {
            this.l6 = com.aspose.slides.ms.System.z3.u3(var5.l6());
         } else if (var5.n5() == 29) {
            this.k5 = "ctr".equals(var5.l6());
         } else if (var5.n5() == 11) {
            this.u3 = "sameDir".equals(var5.l6());
         } else if (var5.n5() == 19) {
            this.a6 = this.a6(var5.l6());
         } else if (var5.n5() == 18) {
            this.u9 = "row".equals(var5.l6());
         } else if (var5.n5() == 27) {
            this.h0 = n5(var5.l6());
         } else if (var5.n5() == 28) {
            this.c8 = l6(var5.l6());
         } else if (var5.n5() == 21) {
            this.n5(n5(var5.l6()));
         } else if (var5.n5() == 54) {
            this.l6(l6(var5.l6()));
         }
      }
   }

   private int u3(String var1) {
      switch (t2.n5(var1)) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
         default:
            return 0;
      }
   }

   private int a6(String var1) {
      switch (t2.n5(var1)) {
         case 3:
            return 1;
         case 4:
            return 2;
         case 5:
            return 3;
         case 6:
         default:
            return 0;
      }
   }
}
