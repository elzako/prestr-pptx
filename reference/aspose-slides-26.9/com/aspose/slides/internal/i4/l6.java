package com.aspose.slides.internal.i4;

public class l6 extends j4 {
   private int u3;
   private j9 a6;
   protected u2 n5;

   @Override
   public boolean n5() {
      return false;
   }

   @Override
   public double l6() {
      return this.k5();
   }

   @Override
   public int k5() {
      return this.u3;
   }

   @Override
   public void n5(int var1) {
      this.u3 = var1;
   }

   @Override
   public String u3() {
      return "Arguments";
   }

   public l6(j9 var1, u6 var2, g7[] var3) {
      super(var1.n3().s7());
      this.a6 = var1;

      for (int var4 = 0; var4 < var3.length; var4++) {
         u2 var5 = new u2(this, com.aspose.slides.ms.System.a3.l6(var4), var3[var4]);
         var5.n5(false);
         this.n5(var5);
      }

      this.u3 = var3.length;
      this.n5 = new u2(this, "callee", var2);
      this.n5.n5(false);
      this.n5(this.n5);
      k5 var6 = new k5(var1, this, "length");
      var6.n5(false);
      this.n5(var6);
   }
}
