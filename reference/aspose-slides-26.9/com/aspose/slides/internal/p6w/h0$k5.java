package com.aspose.slides.internal.p6w;

final class h0$k5 {
   h0$l6 n5;
   private int l6;

   public h0$k5(h0$l6 var1) {
      this.n5 = var1;
   }

   public void n5() {
      int var1 = 0;

      try {
         var1 = h0.n5(this.n5.n5, this.n5.u3, this.n5.a6, this.n5.u9, this.n5.h0);
      } catch (RuntimeException var3) {
         this.n5.n5(var3);
         return;
      }

      this.n5.n5(var1);
   }

   public void l6() {
      int var1 = 0;

      try {
         com.aspose.slides.internal.g8v.q0[] var2 = new com.aspose.slides.internal.g8v.q0[]{this.n5.k5};
         var1 = h0.n5(this.n5.n5, this.n5.u3, this.n5.a6, this.n5.u9, this.n5.h0, var2);
         this.n5.k5 = var2[0];
      } catch (RuntimeException var3) {
         this.n5.n5(var3);
         return;
      }

      this.n5.n5(var1);
   }

   private void n5(int var1) {
      if (this.n5.t2 == 0) {
         this.l6 += var1;
         this.n5.a6 += var1;
         this.n5.u9 -= var1;
      }
   }

   public void k5() {
      int var1 = 0;

      try {
         var1 = h0.l6(this.n5.n5, this.n5.u3, this.n5.a6, this.n5.u9, this.n5.h0);
         this.n5(var1);
         if (this.n5.u9 > 0) {
            z1 var2 = new z1(this);
            var2.n5(null, this.n5);
            return;
         }

         this.n5.l6(this.l6);
      } catch (RuntimeException var3) {
         this.n5.n5(var3);
         return;
      }

      this.n5.a6();
   }

   public void u3() {
      int var1 = 0;

      try {
         var1 = h0.n5(this.n5.n5, this.n5.u3, this.n5.a6, this.n5.u9, this.n5.h0, this.n5.k5);
         this.n5(var1);
         if (this.n5.u9 > 0) {
            t4 var2 = new t4(this);
            var2.n5(null, this.n5);
            return;
         }

         this.n5.l6(this.l6);
      } catch (RuntimeException var3) {
         this.n5.n5(var3);
         return;
      }

      this.n5.a6();
   }
}
