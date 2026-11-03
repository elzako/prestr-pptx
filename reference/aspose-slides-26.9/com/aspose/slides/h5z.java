package com.aspose.slides;

class h5z extends s3 {
   private String n5;
   private String l6;
   private String k5;
   private int u3 = 4;
   private int a6 = 4;
   private int u9 = 0;
   private int h0 = 0;

   public final String k5() {
      return this.n5;
   }

   public final String u3() {
      return this.l6;
   }

   public final String a6() {
      return this.k5;
   }

   public final int u9() {
      return this.u3;
   }

   public final int h0() {
      return this.u9;
   }

   public final int c8() {
      return this.h0;
   }

   public h5z(com.aspose.slides.internal.k4y.p5i var1) {
      for (com.aspose.slides.internal.k4y.s6m var5 : var1.l6()) {
         if (var5.n5() == 22) {
            this.u3 = k5(var5.l6());
         } else if (var5.n5() == 53) {
            this.a6 = k5(var5.l6());
         } else if (var5.n5() == 33) {
            this.u9 = "aft".equals(var5.l6()) ? 1 : 0;
         } else if (var5.n5() == 34) {
            this.h0 = "step".equals(var5.l6()) ? 0 : 1;
         } else if (var5.n5() == 36) {
            this.n5 = var5.l6();
         } else if (var5.n5() == 32) {
            this.k5 = var5.l6();
         } else if (var5.n5() == 35) {
            this.l6 = var5.l6();
         }
      }
   }
}
