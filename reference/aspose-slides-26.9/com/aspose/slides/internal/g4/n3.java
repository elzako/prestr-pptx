package com.aspose.slides.internal.g4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m1;

public class n3 {
   private w1 n5 = new w1();
   private float l6;
   private w1 k5 = new w1();
   private float u3;
   private com.aspose.slides.internal.o9b.c8[] a6;
   private float[] u9;

   public final w1 n5() {
      return this.n5.u3();
   }

   private void n5(w1 var1) {
      this.n5 = var1.u3();
   }

   public final float l6() {
      return this.l6;
   }

   private void n5(float var1) {
      this.l6 = var1;
   }

   public final w1 k5() {
      return this.k5.u3();
   }

   private void l6(w1 var1) {
      this.k5 = var1.u3();
   }

   public final float u3() {
      return this.u3;
   }

   private void l6(float var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.o9b.c8[] a6() {
      return this.a6;
   }

   private void n5(com.aspose.slides.internal.o9b.c8[] var1) {
      this.a6 = var1;
   }

   public final float[] u9() {
      return this.u9;
   }

   private void n5(float[] var1) {
      this.u9 = var1;
   }

   public n3(w1 var1, float var2, w1 var3, float var4, com.aspose.slides.internal.j0.l6 var5, com.aspose.slides.internal.v2.n5 var6) {
      float var7 = 0.0F;
      float var8 = 1.0F;
      if (var6 != null) {
         float[] var9 = var6.l6();
         var7 = var9[0];
         var8 = var9[1];
      }

      float var12 = (var8 - var7) / 20.0F;
      float[] var10 = new float[21];

      for (int var11 = 0; var11 < 21; var11++) {
         var10[var11] = var11 * var12;
      }

      List var13 = com.aspose.slides.internal.g4.l6.n5(var10, var5);
      this.n5(var1.u3());
      this.n5(var2);
      this.l6(var3.u3());
      this.l6(var4);
      this.n5((com.aspose.slides.internal.o9b.c8[])var13.toArray(new com.aspose.slides.internal.o9b.c8[0]));
      this.n5(var10);
   }

   public n3(w1 var1, float var2, w1 var3, float var4, com.aspose.slides.internal.o9b.c8[] var5, float[] var6) {
      this.n5(var1.u3());
      this.n5(var2);
      this.l6(var3.u3());
      this.l6(var4);
      this.n5(var5);
      this.n5(var6);
   }

   public final void n5(m1 var1) {
      w1[] var2 = new w1[]{this.n5(), this.k5()};
      var1.n5(var2);
      this.n5(var2[0].u3());
      this.l6(var2[1].u3());
   }
}
