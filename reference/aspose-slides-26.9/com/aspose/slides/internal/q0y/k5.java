package com.aspose.slides.internal.q0y;

import com.aspose.slides.internal.u7q.y4;

class k5 extends n5 {
   private float[] k5 = new float[9];
   private final com.aspose.slides.internal.u7q.n5[] u3 = new com.aspose.slides.internal.u7q.n5[3];

   @Override
   public void n5() {
      if (this.u3().l6().u9 != 1482250784L) {
         throw new com.aspose.slides.internal.d3l.n5();
      }

      super.n5();
      this.n5(1918392666, (byte)0, (byte)3, (byte)6);
      this.n5(1733843290, (byte)1, (byte)4, (byte)7);
      this.n5(1649957210, (byte)2, (byte)5, (byte)8);
      if (this.a6()) {
         this.u3[0] = this.n5(1918128707);
         this.u3[1] = this.n5(1733579331);
         this.u3[2] = this.n5(1649693251);
      } else {
         this.u3[0] = this.l6(1918128707);
         this.u3[1] = this.l6(1733579331);
         this.u3[2] = this.l6(1649693251);
         if (!com.aspose.slides.internal.g7i.k5.l6(this.k5)) {
            throw new com.aspose.slides.internal.d3l.h0();
         }
      }

      this.u3[0].n5();
      this.u3[1].n5();
      this.u3[2].n5();
   }

   @Override
   public void n5(float[] var1) {
      this.l6(var1);
      if (this.a6()) {
         float var2 = this.u3[0].n5(var1[0]);
         float var3 = this.u3[1].n5(var1[1]);
         float var4 = this.u3[2].n5(var1[2]);
         var1[0] = com.aspose.slides.internal.g7i.l6.n5(this.k5[0] * var2 + this.k5[1] * var3 + this.k5[2] * var4);
         var1[1] = com.aspose.slides.internal.g7i.l6.n5(this.k5[3] * var2 + this.k5[4] * var3 + this.k5[5] * var4);
         var1[2] = com.aspose.slides.internal.g7i.l6.n5(this.k5[6] * var2 + this.k5[7] * var3 + this.k5[8] * var4);
      } else {
         float var5 = com.aspose.slides.internal.g7i.l6.l6(var1[0]);
         float var6 = com.aspose.slides.internal.g7i.l6.l6(var1[1]);
         float var7 = com.aspose.slides.internal.g7i.l6.l6(var1[2]);
         var1[0] = this.u3[0].n5(com.aspose.slides.internal.g7i.k5.k5(this.k5[0] * var5 + this.k5[1] * var6 + this.k5[2] * var7));
         var1[1] = this.u3[1].n5(com.aspose.slides.internal.g7i.k5.k5(this.k5[3] * var5 + this.k5[4] * var6 + this.k5[5] * var7));
         var1[2] = this.u3[2].n5(com.aspose.slides.internal.g7i.k5.k5(this.k5[6] * var5 + this.k5[7] * var6 + this.k5[8] * var7));
      }

      this.k5(var1);
   }

   private void n5(int var1, byte var2, byte var3, byte var4) {
      y4 var5 = (y4)this.u3().n5(var1);
      if (var5 == null) {
         throw new com.aspose.slides.internal.d3l.c8();
      }

      this.k5[var2 & 0xFF] = var5.e2().n5;
      this.k5[var3 & 0xFF] = var5.e2().l6;
      this.k5[var4 & 0xFF] = var5.e2().k5;
   }
}
