package com.aspose.slides.internal.v7y;

public final class h2 extends v3 {
   private int n5;
   private j9 l6;
   private j9 u3;

   public h2(int var1, j9 var2, j9 var3) {
      if (var2.u9() != 0) {
         var2 = new a5(9, var2);
      }

      if (var3.u9() != 0) {
         var3 = new a5(9, var3);
      }

      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var3;
   }

   private h2(h2 var1) {
      super(var1);
      this.n5 = var1.n5;
      this.l6 = n5(var1.l6);
      this.u3 = n5(var1.u3);
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      this.l6.n5(var1);
      this.u3.n5(var1);
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      return n5(this.n5, com.aspose.slides.ms.System.Xml.f4.n5(this.l6.n5(var1)), com.aspose.slides.ms.System.Xml.f4.n5(this.u3.n5(var1)));
   }

   private static double n5(int var0, double var1, double var3) {
      switch (var0) {
         case 9:
            return var1 + var3;
         case 10:
            return var1 - var3;
         case 11:
            return var1 * var3;
         case 12:
            return var1 / var3;
         case 13:
            return var1 % var3;
         default:
            return 0.0;
      }
   }

   @Override
   public int u9() {
      return 0;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new h2(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
