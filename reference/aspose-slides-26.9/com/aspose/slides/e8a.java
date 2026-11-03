package com.aspose.slides;

class e8a extends s3 {
   private int n5;
   private int l6;

   public final int k5() {
      return this.n5;
   }

   public final int u3() {
      return this.l6;
   }

   public e8a(com.aspose.slides.internal.k4y.p5i var1) {
      this.l6(2);
      this.n5(2);
      this.n5 = 1;
      this.l6 = 4;

      for (com.aspose.slides.internal.k4y.s6m var5 : var1.l6()) {
         if (var5.n5() == 21) {
            this.n5(n5(var5.l6()));
         } else if (var5.n5() == 54) {
            this.l6(l6(var5.l6()));
         } else if (var5.n5() == 20) {
            this.u3(var5.l6());
         }
      }
   }

   private void u3(String var1) {
      if (var1.length() > 1) {
         char var2 = var1.charAt(0);
         if (var2 == 't') {
            this.n5 = 1;
         } else if (var2 == 'l') {
            this.n5 = 3;
         } else if (var2 == 'b') {
            this.n5 = 2;
         } else if (var2 == 'r') {
            this.n5 = 4;
         }

         String var3 = com.aspose.slides.ms.System.d1.k5(var1, 1);
         if ("L".equals(var3)) {
            this.l6 = 2;
         } else if ("R".equals(var3)) {
            this.l6 = 3;
         } else if ("T".equals(var3)) {
            this.l6 = 0;
         } else if ("B".equals(var3)) {
            this.l6 = 1;
         } else if ("CtrCh".equals(var3)) {
            this.l6 = 4;
         } else if ("CtrDes".equals(var3)) {
            this.l6 = 5;
         }
      }
   }
}
