package com.aspose.slides.internal.z3o;

import com.aspose.slides.internal.e3j.a6$n5;
import com.aspose.slides.internal.o9b.w1;

public class a6 {
   public float n5;
   public float l6;
   public float k5;
   public float u3;

   public void n5(a6 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public void n5() {
      this.n5 = 0.0F;
      this.l6 = 0.0F;
      this.k5 = 0.0F;
      this.u3 = 0.0F;
   }

   public void l6() {
      float var1 = this.n5;
      this.n5 = this.k5;
      this.k5 = var1;
      var1 = this.l6;
      this.l6 = this.u3;
      this.u3 = var1;
   }

   public a6$n5 n5(float var1, float var2, float var3, float var4) {
      float var5 = var1 + this.n5;
      float var6 = var2 + this.l6;
      float var7 = var1 + this.k5;
      float var8 = var2 + this.u3;
      float var9 = var1 + var3 + this.n5;
      float var10 = var2 + var4 + this.l6;
      float var11 = var1 + var3 + this.k5;
      float var12 = var2 + var4 + this.u3;
      w1 var13 = new w1((var5 + var7) / 2.0F, (var6 + var8) / 2.0F);
      w1 var14 = new w1((var9 + var11) / 2.0F, (var10 + var12) / 2.0F);
      w1 var15 = new w1(var5, var6);
      return com.aspose.slides.internal.e3j.a6.n5(var13, var14, var15);
   }
}
