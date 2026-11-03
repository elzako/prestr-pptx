package com.aspose.slides.internal.a2w;

public class u9 extends s7 {
   private byte n5;
   private int l6;
   private byte k5;
   private byte u3;
   private long a6;
   private byte u9;
   private long h0;

   public u9(com.aspose.slides.internal.l4o.n5 var1) {
      this.n5 = var1.l6();
      this.l6 = var1.k5();
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = var1.u9();
      this.h0 = var1.y4();
      this.u9 = var1.c8();
   }

   public u9() {
   }

   @Override
   protected byte[] l6() {
      byte[] var1 = new byte[17];
      com.aspose.slides.internal.y5s.l6.n5(1229472850L, var1, 0);
      com.aspose.slides.internal.y5s.l6.n5(this.h0, var1, 4);
      com.aspose.slides.internal.y5s.l6.n5(this.a6, var1, 8);
      var1[12] = this.n5;
      var1[13] = (byte)this.l6;
      var1[14] = this.k5;
      var1[15] = this.u3;
      var1[16] = this.u9;
      return var1;
   }
}
