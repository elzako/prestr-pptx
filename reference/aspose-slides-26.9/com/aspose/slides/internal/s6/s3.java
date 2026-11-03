package com.aspose.slides.internal.s6;

import com.aspose.slides.ms.System.q1;

public abstract class s3 {
   protected byte[] n5;
   protected v8 l6 = new v8();
   protected int k5;

   public final void l6(e5 var1) {
      this.n5 = var1.n5();
      var1.l6().l6(this.l6);
      this.k5 = this.l6.n5() * 4;
      this.n5(var1);
   }

   protected abstract void n5(e5 var1);

   protected final g7 n5(int var1, int var2) {
      var1 = q1.l6(q1.n5(var1, 0), this.l6.n5() - 1);
      var2 = q1.l6(q1.n5(var2, 0), this.l6.l6() - 1);
      int var3 = var1 * 4 + var2 * this.k5;
      return new g7(
         (this.n5[var3] & 0xFF) / 255.0F, (this.n5[var3 + 1] & 0xFF) / 255.0F, (this.n5[var3 + 2] & 0xFF) / 255.0F, (this.n5[var3 + 3] & 0xFF) / 255.0F
      );
   }

   protected final g7 n5(s0 var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1.n5()), 14);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1.l6()), 14);
      var2 = q1.l6(q1.n5(var2, 0), this.l6.n5() - 1);
      var3 = q1.l6(q1.n5(var3, 0), this.l6.l6() - 1);
      int var4 = var2 * 4 + var3 * this.k5;
      return new g7(
         (this.n5[var4] & 0xFF) / 255.0F, (this.n5[var4 + 1] & 0xFF) / 255.0F, (this.n5[var4 + 2] & 0xFF) / 255.0F, (this.n5[var4 + 3] & 0xFF) / 255.0F
      );
   }

   protected final byte l6(int var1, int var2) {
      var1 = q1.l6(q1.n5(var1, 0), this.l6.n5() - 1);
      var2 = q1.l6(q1.n5(var2, 0), this.l6.l6() - 1);
      return this.n5[var1 * 4 + var2 * this.k5 + 3];
   }

   protected final float l6(s0 var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1.n5()), 14);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1.l6()), 14);
      var2 = q1.l6(q1.n5(var2, 0), this.l6.n5() - 1);
      var3 = q1.l6(q1.n5(var3, 0), this.l6.l6() - 1);
      return (this.n5[var2 * 4 + var3 * this.k5 + 3] & 0xFF) / 255.0F;
   }
}
