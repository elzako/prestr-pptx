package com.aspose.slides.internal.g4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m1;

public class t2 {
   private w1 n5 = new w1();
   private w1 l6 = new w1();
   private com.aspose.slides.internal.o9b.c8[] k5;
   private float[] u3;

   public final w1 n5() {
      return this.n5.u3();
   }

   private void n5(w1 var1) {
      this.n5 = var1.u3();
   }

   public final w1 l6() {
      return this.l6.u3();
   }

   private void l6(w1 var1) {
      this.l6 = var1.u3();
   }

   public final com.aspose.slides.internal.o9b.c8[] k5() {
      return this.k5;
   }

   private void n5(com.aspose.slides.internal.o9b.c8[] var1) {
      this.k5 = var1;
   }

   public final float[] u3() {
      return this.u3;
   }

   private void n5(float[] var1) {
      this.u3 = var1;
   }

   public t2(w1 var1, w1 var2, com.aspose.slides.internal.o9b.c8[] var3, float[] var4) {
      this.n5(var1.u3());
      this.l6(var2.u3());
      this.n5(var3);
      this.n5(var4);
   }

   public t2(w1 var1, w1 var2, com.aspose.slides.internal.j0.l6 var3, com.aspose.slides.internal.v2.n5 var4) {
      float var5 = 0.0F;
      float var6 = 1.0F;
      if (var4 != null) {
         float[] var7 = var4.l6();
         var5 = var7[0];
         var6 = var7[1];
      }

      float var10 = (var6 - var5) / 20.0F;
      float[] var8 = new float[21];

      for (int var9 = 0; var9 < 21; var9++) {
         var8[var9] = var9 * var10;
      }

      List var11 = com.aspose.slides.internal.g4.l6.n5(var8, var3);
      this.n5(var1.u3());
      this.l6(var2.u3());
      this.n5((com.aspose.slides.internal.o9b.c8[])var11.toArray(new com.aspose.slides.internal.o9b.c8[0]));
      this.n5(var8);
   }

   public final void n5(m1 var1) {
      w1[] var2 = new w1[]{this.n5(), this.l6()};
      var1.n5(var2);
      this.n5(var2[0].u3());
      this.l6(var2[1].u3());
   }
}
