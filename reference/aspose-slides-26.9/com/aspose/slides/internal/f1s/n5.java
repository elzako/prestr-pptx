package com.aspose.slides.internal.f1s;

import com.aspose.slides.internal.z4.t4;

public class n5 extends u3 {
   private final float[] n5;
   private final float[] k5;
   private final int u3;

   public n5(com.aspose.slides.internal.z4.c8 var1, float[] var2, float[] var3, float[] var4, float[] var5, int var6) {
      super(var1, 1, 1, var2, var3);
      this.n5 = var4;
      this.k5 = var5;
      this.u3 = var6;
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      this.l6(var1);
      var1.t2();
      var1.l6();
   }

   @Override
   public void l6(t4 var1) {
      super.l6(var1);
      var1.n5("/C0", this.n5);
      var1.n5("/C1", this.k5);
      var1.n5("/N", this.u3);
   }

   @Override
   protected int n5() {
      return 2;
   }
}
