package com.aspose.slides.internal.s7k;

class r4 extends z1 {
   private byte t2;
   private float[] s7;

   @Override
   public void n5(m1 var1) {
      this.h0 = com.aspose.slides.internal.v6g.k5.u3(var1.k5(), 10);
      this.n3();
      this.c8 = var1.k5();
      this.l6 = var1.n5();
      this.k5 = var1.n5();
      byte var2 = var1.n5();
      this.t2 = var1.n5();
      this.s7 = var1.u3(9);
      int var3 = this.l6(var1);
      int var4 = this.l6(var1);
      this.n5(this.k5(), var1, var3);
      u9 var5 = this.n5(var2, this.y4());
      var5.l6(var1);
      this.n5(this.n5(), var1, var4);
   }

   @Override
   protected void n3() {
      if (this.h0 != 1835430961) {
         throw new e2();
      }
   }

   private void n5(s7[] var1, m1 var2, int var3) {
      for (byte var4 = 0; com.aspose.slides.internal.v6g.k5.u3(var4, 6) < var1.length; var4++) {
         var1[com.aspose.slides.internal.v6g.k5.u3(var4, 6)] = (s7)k7.n5(1668641398);
         var1[com.aspose.slides.internal.v6g.k5.u3(var4, 6)].n5(this.n5(var2, var3));
      }
   }

   @Override
   public void n5(int var1, int var2) {
      if (var1 == 1482250784) {
         if (this.a6 == null && this.s7() == null) {
            this.a6 = this.u9;
            this.u9 = null;
            this.n5(this.s7);
         }
      } else {
         float var3 = 1.5258789E-5F;
         this.s7[8] = var3;
         this.s7[4] = var3;
         this.s7[0] = var3;
         this.s7[7] = 0.0F;
         this.s7[6] = 0.0F;
         this.s7[5] = 0.0F;
         this.s7[3] = 0.0F;
         this.s7[2] = 0.0F;
         this.s7[1] = 0.0F;
      }

      super.n5(var1, var2);
   }

   protected int l6(m1 var1) {
      return 256;
   }

   protected float[] n5(m1 var1, int var2) {
      return var1.l6(com.aspose.slides.internal.v6g.k5.u3(var2, 8));
   }

   protected byte y4() {
      return 1;
   }
}
