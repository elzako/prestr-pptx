package com.aspose.slides.internal.k0r;

public class j7 {
   private final float n5;
   private final short l6;
   private final int k5;

   public j7(long var1) {
      byte[] var3 = com.aspose.slides.ms.System.x8.n5(var1);
      this.k5 = com.aspose.slides.internal.v6g.k5.k5(
         (com.aspose.slides.internal.v6g.k5.u3(var3[1], 6) << 8) + com.aspose.slides.internal.v6g.k5.u3(var3[0], 6), 9
      );
      this.l6 = com.aspose.slides.internal.v6g.k5.l6(
         (com.aspose.slides.internal.v6g.k5.u3(var3[3], 6) << 8) + com.aspose.slides.internal.v6g.k5.u3(var3[2], 6), 9
      );
      this.n5 = this.l6 + com.aspose.slides.internal.v6g.k5.c8(this.k5, 8) / 65536.0F;
   }

   public float n5() {
      return this.n5;
   }
}
