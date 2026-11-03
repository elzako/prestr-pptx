package com.aspose.slides.internal.s7k;

class p8 extends d5 {
   private float[] n5 = new float[9];
   private s7[] l6 = new s7[3];

   @Override
   public void n5() {
      if (this.u3().l6().u9 != 1482250784) {
         throw new u3();
      }

      super.n5();
      this.n5(1918392666, (byte)0, (byte)3, (byte)6);
      this.n5(1733843290, (byte)1, (byte)4, (byte)7);
      this.n5(1649957210, (byte)2, (byte)5, (byte)8);
      if (this.a6()) {
         this.l6[0] = this.n5(1918128707);
         this.l6[1] = this.n5(1733579331);
         this.l6[2] = this.n5(1649693251);
      } else {
         this.l6[0] = this.l6(1918128707);
         this.l6[1] = this.l6(1733579331);
         this.l6[2] = this.l6(1649693251);
         if (!d2.l6(this.n5)) {
            throw new e2();
         }
      }

      this.l6[0].n5();
      this.l6[1].n5();
      this.l6[2].n5();
   }

   private void n5(int var1, byte var2, byte var3, byte var4) {
      a0 var5 = (a0)this.u3().n5(var1);
      if (var5 == null) {
         throw new z3();
      }

      this.n5[com.aspose.slides.internal.v6g.k5.u3(var2, 6)] = var5.y4().n5;
      this.n5[com.aspose.slides.internal.v6g.k5.u3(var3, 6)] = var5.y4().l6;
      this.n5[com.aspose.slides.internal.v6g.k5.u3(var4, 6)] = var5.y4().k5;
   }

   @Override
   public void n5(float[] var1) {
      this.l6(var1);
      if (this.a6()) {
         float var2 = this.l6[0].n5(var1[0]);
         float var3 = this.l6[1].n5(var1[1]);
         float var4 = this.l6[2].n5(var1[2]);
         var1[0] = t4.n5(this.n5[0] * var2 + this.n5[1] * var3 + this.n5[2] * var4);
         var1[1] = t4.n5(this.n5[3] * var2 + this.n5[4] * var3 + this.n5[5] * var4);
         var1[2] = t4.n5(this.n5[6] * var2 + this.n5[7] * var3 + this.n5[8] * var4);
      } else {
         float var5 = t4.l6(var1[0]);
         float var6 = t4.l6(var1[1]);
         float var7 = t4.l6(var1[2]);
         var1[0] = this.l6[0].n5(d2.k5(this.n5[0] * var5 + this.n5[1] * var6 + this.n5[2] * var7));
         var1[1] = this.l6[1].n5(d2.k5(this.n5[3] * var5 + this.n5[4] * var6 + this.n5[5] * var7));
         var1[2] = this.l6[2].n5(d2.k5(this.n5[6] * var5 + this.n5[7] * var6 + this.n5[8] * var7));
      }

      this.k5(var1);
   }
}
