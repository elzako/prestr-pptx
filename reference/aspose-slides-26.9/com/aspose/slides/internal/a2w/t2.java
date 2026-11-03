package com.aspose.slides.internal.a2w;

public class t2 extends s7 {
   private int n5;
   private int l6;
   private int k5;

   public void n5(int var1) {
      this.n5 = var1;
   }

   public void l6(int var1) {
      this.l6 = var1;
   }

   public void k5(int var1) {
      this.k5 = var1;
   }

   @Override
   protected byte[] l6() {
      byte[] var1 = new byte[13];
      com.aspose.slides.internal.y5s.l6.n5(1883789683L, var1, 0);
      com.aspose.slides.internal.y5s.l6.n5(com.aspose.slides.internal.v6g.k5.a6(this.n5, 9), var1, 4);
      com.aspose.slides.internal.y5s.l6.n5(com.aspose.slides.internal.v6g.k5.a6(this.l6, 9), var1, 8);
      var1[12] = com.aspose.slides.internal.v6g.k5.n5((Object)(this.k5), 9);
      return var1;
   }
}
