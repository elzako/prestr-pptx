package com.aspose.slides.internal.k0r;

public class y8m extends m4d {
   private int n5;

   public y8m(r5w var1) {
      super(var1);
      this.w1().n5(3999);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = var1.m3();
      if (var2 < 0 || var2 > 8 || var2 == 3) {
         var2 = this.k5();
      }

      this.n5 = var2;
   }

   private int k5() {
      r4 var1 = com.aspose.slides.internal.v6g.k5.n5(this.d5(), r4.class);
      if (var1 == null) {
         com.aspose.slides.ms.System.t4.l6("!!! No parent record!");
         return 4;
      }

      q5 var2 = null;

      while (var1 != null) {
         var2 = com.aspose.slides.internal.v6g.k5.n5(var1, q5.class);
         if (var2 != null) {
            break;
         }

         var1 = com.aspose.slides.internal.v6g.k5.n5(var1.d5(), r4.class);
      }

      if (var2 == null) {
         return 4;
      }

      m7 var3 = null;
      if (var2.s7() != null) {
         var3 = var2.s7().t2();
      }

      return var3 == null ? 4 : y3.n5(var3.k5(), var3.u3());
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
   }

   @Override
   public int n5() {
      return 4;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }
}
