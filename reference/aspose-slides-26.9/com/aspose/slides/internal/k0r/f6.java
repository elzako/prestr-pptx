package com.aspose.slides.internal.k0r;

public class f6 extends r6a {
   String n5 = null;
   String l6 = null;

   public f6(r5w var1) {
      super(var1);
      this.w1().n5(4117);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5(var1.m3());
      com.aspose.slides.internal.l7h.t1 var2 = new com.aspose.slides.internal.l7h.t1();
      char[] var3 = var2.n5(var1.c8(this.w1().a6() - 4));
      int var4 = 0;

      while (var4 < var3.length && var3[var4 + 1] != 0) {
         var4++;
      }

      this.n5 = com.aspose.slides.ms.System.d1.n5(var3, 0, var4);
      this.l6 = com.aspose.slides.ms.System.d1.n5(this.n5, "'", "");
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.k5());
      com.aspose.slides.internal.l7h.t1 var2 = new com.aspose.slides.internal.l7h.t1();
      byte[] var3 = var2.u3(this.n5);
      int var4 = var3.length < 128 ? var3.length : 128;

      for (int var5 = 0; var5 < var4; var5++) {
         var1.n5(var3[var5]);
      }

      for (int var6 = var4; var6 < 128; var6++) {
         var1.n5((byte)0);
      }
   }

   @Override
   public int n5() {
      return 132;
   }

   public final String l6() {
      return this.l6;
   }
}
