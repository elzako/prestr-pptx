package com.aspose.slides.internal.a2w;

public class l6 extends n5 {
   private int n5;

   public int n5() {
      return this.n5;
   }

   public void n5(int var1) {
      this.n5 = var1;
   }

   @Override
   protected byte[] l6() {
      byte[] var1 = new byte[10];
      com.aspose.slides.internal.y5s.l6.n5(1649100612L, var1, 0);
      int var2 = this.n5();
      int var3 = com.aspose.slides.internal.v6g.k5.k5(var2 >> 16 & 0xFF, 9);
      int var4 = com.aspose.slides.internal.v6g.k5.k5(var2 >> 8 & 0xFF, 9);
      int var5 = com.aspose.slides.internal.v6g.k5.k5(var2 & 0xFF, 9);
      var1[5] = com.aspose.slides.internal.v6g.k5.n5((Object)(var3), 8);
      var1[7] = com.aspose.slides.internal.v6g.k5.n5((Object)(var4), 8);
      var1[9] = com.aspose.slides.internal.v6g.k5.n5((Object)(var5), 8);
      return var1;
   }
}
