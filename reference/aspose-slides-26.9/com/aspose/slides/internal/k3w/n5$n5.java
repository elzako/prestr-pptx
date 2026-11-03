package com.aspose.slides.internal.k3w;

public final class n5$n5 {
   private int n5;
   private int l6;
   private float k5;
   private float[] u3;
   private int a6;
   private float[] u9;
   private int h0;

   void n5(float[] var1, int var2, float[] var3, int var4) {
      this.u3 = var1;
      this.a6 = var2;
      this.u9 = var3;
      this.h0 = var4;
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0.0F;
   }

   public boolean n5() {
      return this.n5 <= this.h0;
   }

   public int l6() {
      int var3;
      if (this.n5 < this.h0) {
         float var1 = this.u9[this.n5];
         float var2 = (var1 - this.k5) / (1.0F - this.k5);
         com.aspose.slides.internal.k3w.l6.n5(var2, this.u3, this.l6, this.u3, 0, this.u3, this.a6, this.a6);
         this.k5 = var1;
         var3 = 0;
         this.l6 = this.a6;
      } else {
         var3 = this.l6;
      }

      this.n5++;
      return var3;
   }
}
