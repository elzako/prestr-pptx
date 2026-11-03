package com.aspose.slides.internal.g7;

public class q2 extends t9 {
   private double a6;
   private com.aspose.slides.internal.l7h.a5 u9;

   public q2(t9 var1, byte[] var2) {
      super(var1, var2);
      super.l6 = new byte[0][];
      super.n5 = new byte[0][];
      this.u9 = new com.aspose.slides.internal.l7h.a5();
   }

   public final double n5() {
      return this.a6;
   }

   @Override
   public void k5() {
      this.a6 = -Double.MAX_VALUE;
      this.u9 = new com.aspose.slides.internal.l7h.a5();
      super.k5();
   }

   @Override
   protected boolean n5(int var1, byte[][] var2, int[] var3) {
      var3[0] = -1;
      var2[0] = null;
      if (g9.n5(this.u3, var1)) {
         var3[0] = var1;
         var2[0] = new byte[0];
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected byte[] n5(int var1, int[] var2) {
      var2[0] = -1;
      if (!g9.n5(this.u3, var1)) {
         var2[0] = var1 - 1;
         return new byte[0];
      } else {
         return null;
      }
   }

   @Override
   protected void n5(int var1) {
      this.u9.n5(com.aspose.slides.internal.l7h.j5.e2().l6(new byte[]{this.u3[var1]}));
      super.n5(var1);
   }

   @Override
   protected void z_() {
      this.a6 = g9.l6(this.u9.toString());
      super.z_();
   }
}
