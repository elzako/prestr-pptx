package com.aspose.slides.internal.l6z;

import com.aspose.slides.ms.System.q1;

class c8 extends j4 {
   private int n5;
   private int l6;
   private int k5;

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      byte var2 = var1.z1();
      byte var3 = var1.z1();
      this.n5 = ((var3 & 255) << 8) + (var2 & 255) & 65535;
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 65535);
   }

   @Override
   public void l6(com.aspose.slides.internal.z0k.l6 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), com.aspose.slides.internal.z0k.e2.class);
      int var3 = this.n5(var1.n5().getPosition());
      int var4 = 16 - var3;
      int var5 = this.n5(var4);
      this.l6 = ((this.n5 & 65535 & var5) >> var4) + 1;
      int var6 = this.l6(var3);
      this.k5 = (this.n5 & 65535 & var6) + 3;

      for (int var7 = 0; var7 < this.k5; var7++) {
         byte[] var8 = var2.getBuffer();
         byte var9 = var8[(int)(var1.n5().getPosition() - this.l6)];
         var1.n5(var9);
      }
   }

   public final int n5(int var1, int var2, int var3) {
      this.l6 = var2 - 1;
      int var4 = this.n5((long)var3);
      int var5 = 16 - var4;
      int var6 = 65535 >> var4;
      this.k5 = q1.l6(var1 - 3, var6);
      this.n5 = this.k5 & 65535;
      this.n5 = (this.n5 & 65535 | this.l6 << var5 & 65535) & 65535;
      return this.k5 + 3;
   }

   private int n5(long var1) {
      int var3 = com.aspose.slides.ms.System.z3.h0(q1.l6(q1.n5(var1, 2.0)));
      if (var3 < 4) {
         var3 = 4;
      }

      return var3;
   }

   private int n5(int var1) {
      return com.aspose.slides.ms.System.z3.h0(q1.a6(2.0, 16.0 - var1)) - 1 << var1;
   }

   private int l6(int var1) {
      return com.aspose.slides.ms.System.z3.h0(q1.a6(2.0, 16.0 - var1)) - 1;
   }
}
