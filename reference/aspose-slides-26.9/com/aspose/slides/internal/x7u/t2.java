package com.aspose.slides.internal.x7u;

public class t2 extends u3 {
   private final float u3;
   private final float a6;

   public t2(float var1, float var2, float var3, float var4, float var5) {
      super(var1, var2, var3);
      this.u3 = var4;
      this.a6 = var5;
   }

   @Override
   public com.aspose.slides.internal.z3o.a6 l6(float var1, float var2) {
      com.aspose.slides.internal.z3o.a6 var3 = super.l6(var1, var2);
      this.n5(var3);
      return var3;
   }

   @Override
   public com.aspose.slides.internal.z3o.a6 n5(float var1, float var2) {
      com.aspose.slides.internal.z3o.a6 var3 = super.n5(var1, var2);
      this.n5(var3);
      return var3;
   }

   private void n5(com.aspose.slides.internal.z3o.a6 var1) {
      var1.n5 = var1.n5 * this.u3;
      var1.l6 = var1.l6 * this.a6;
      var1.k5 = var1.k5 * this.u3;
      var1.u3 = var1.u3 * this.a6;
   }
}
