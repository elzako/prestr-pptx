package com.aspose.slides.internal.b7;

final class l2p {
   private d4 n5 = new d4();
   private d4 l6 = new d4();
   private r7c k5;

   public double n5() {
      return this.l6.u3() - this.l6.l6();
   }

   public d4 l6() {
      return this.l6;
   }

   public d4 k5() {
      return this.n5;
   }

   public r7c u3() {
      return this.k5;
   }

   public l2p(r7c var1, d4 var2) {
      this.k5 = var1;
      var2.n5(this.l6);
      this.a6();
   }

   void n5(k0 var1, double var2) {
      for (h6 var5 : this.k5.l6()) {
         int var6 = var5.n5();

         for (int var7 = 0; var7 < var6; var7++) {
            v2 var8 = k0.n5(var5.n5(var7), var1).u9();
            var5.n5(var7, v2.n5(var1, v2.n5(var8, var2)).u3());
         }
      }

      this.l6.n5(var1.u3(), var2).n5(this.l6);
      this.a6();
   }

   private void a6() {
      boolean var1 = false;
      if (this.k5.l6().n5() > 0) {
         h6[] var2 = this.k5.l6().l6();
         double var3 = Double.MAX_VALUE;
         double var5 = -Double.MAX_VALUE;
         double var7 = Double.MAX_VALUE;
         double var9 = -Double.MAX_VALUE;
         if (var2.length > 0) {
            for (int var11 = 0; var11 < var2.length; var11++) {
               h6 var12 = var2[var11];
               if (var12.n5() > 0) {
                  if (!var1) {
                     var1 = true;
                  }

                  d4 var13 = var12.u9().s7();
                  if (var13.n5() < var3) {
                     var3 = var13.n5();
                  }

                  if (var13.l6() < var7) {
                     var7 = var13.l6();
                  }

                  if (var13.k5() > var5) {
                     var5 = var13.k5();
                  }

                  if (var13.u3() > var9) {
                     var9 = var13.u3();
                  }
               }
            }
         }

         this.n5 = new d4(var3, var7, var5, var9);
      }

      if (!var1) {
         this.l6.n5(this.n5);
      }
   }
}
