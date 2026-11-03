package com.aspose.slides.internal.e7;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.v2.e2;
import com.aspose.slides.ms.System.q1;

public class c8 implements e2 {
   private final com.aspose.slides.internal.v2.n5 n5;

   public static c8 n5() {
      return new c8(612.0F, 792.0F);
   }

   public final float l6() {
      return this.u9();
   }

   public final float k5() {
      return this.h0();
   }

   public final float u3() {
      return this.c8() - this.u9();
   }

   public final float a6() {
      return this.s7() - this.h0();
   }

   public final float u9() {
      com.aspose.slides.internal.v2.t2 var1 = (com.aspose.slides.internal.v2.t2)this.n5.k5(0);
      return var1.u3();
   }

   public final float h0() {
      com.aspose.slides.internal.v2.t2 var1 = (com.aspose.slides.internal.v2.t2)this.n5.k5(1);
      return var1.u3();
   }

   public final float c8() {
      com.aspose.slides.internal.v2.t2 var1 = (com.aspose.slides.internal.v2.t2)this.n5.k5(2);
      return var1.u3();
   }

   public final float s7() {
      com.aspose.slides.internal.v2.t2 var1 = (com.aspose.slides.internal.v2.t2)this.n5.k5(3);
      return var1.u3();
   }

   public c8(float var1, float var2) {
      this(0.0F, 0.0F, var1, var2);
   }

   public c8(float var1, float var2, float var3, float var4) {
      this.n5 = new com.aspose.slides.internal.v2.n5();
      com.aspose.slides.internal.v2.a6 var5 = new com.aspose.slides.internal.v2.a6(var1);
      this.n5.n5(var5);
      com.aspose.slides.internal.v2.a6 var6 = new com.aspose.slides.internal.v2.a6(var2);
      this.n5.n5(var6);
      com.aspose.slides.internal.v2.a6 var7 = new com.aspose.slides.internal.v2.a6(var1 + var3);
      this.n5.n5(var7);
      com.aspose.slides.internal.v2.a6 var8 = new com.aspose.slides.internal.v2.a6(var2 + var4);
      this.n5.n5(var8);
   }

   public c8(com.aspose.slides.internal.v2.n5 var1) {
      if (var1.n5() != 4) {
         throw new ArgumentException("Array size is not valid.");
      }

      float[] var2 = var1.l6();
      this.n5 = new com.aspose.slides.internal.v2.n5();
      float var3 = q1.l6(var2[0], var2[2]);
      com.aspose.slides.internal.v2.t2 var4 = new com.aspose.slides.internal.v2.t2(var3);
      this.n5.n5(var4);
      float var5 = q1.l6(var2[1], var2[3]);
      com.aspose.slides.internal.v2.t2 var6 = new com.aspose.slides.internal.v2.t2(var5);
      this.n5.n5(var6);
      float var7 = q1.n5(var2[0], var2[2]);
      com.aspose.slides.internal.v2.t2 var8 = new com.aspose.slides.internal.v2.t2(var7);
      this.n5.n5(var8);
      float var9 = q1.n5(var2[1], var2[3]);
      com.aspose.slides.internal.v2.t2 var10 = new com.aspose.slides.internal.v2.t2(var9);
      this.n5.n5(var10);
   }

   @Override
   public final com.aspose.slides.internal.v2.s7 t2() {
      return this.n5;
   }
}
