package com.aspose.slides.internal.a2w;

public class c8 extends s7 {
   private com.aspose.slides.internal.j3b.u3 n5;

   public c8(com.aspose.slides.internal.j3b.u3 var1) {
      this.n5 = var1;
   }

   @Override
   protected byte[] l6() {
      byte[] var1 = new byte[4 + this.n5.n5() * 3];
      com.aspose.slides.internal.y5s.l6.n5(1347179589L, var1, 0);
      int var2 = 4;

      for (int var3 = 0; var3 < this.n5.n5(); var3++) {
         int var4 = this.n5.l6()[var3];
         byte var5 = com.aspose.slides.internal.v6g.k5.n5((Object)(var4 >> 16 & 0xFF), 9);
         byte var6 = com.aspose.slides.internal.v6g.k5.n5((Object)(var4 >> 8 & 0xFF), 9);
         byte var7 = com.aspose.slides.internal.v6g.k5.n5((Object)(var4 & 0xFF), 9);
         var1[var2++] = var5;
         var1[var2++] = var6;
         var1[var2++] = var7;
      }

      return var1;
   }
}
