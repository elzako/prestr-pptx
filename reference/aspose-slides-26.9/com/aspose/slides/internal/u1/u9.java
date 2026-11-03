package com.aspose.slides.internal.u1;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class u9 extends a6 implements com.aspose.slides.internal.v2.e2 {
   private final com.aspose.slides.internal.v2.k5 n5;
   private float l6;
   private float k5;

   @Override
   public float n5() {
      if (this.k5 == Float.NEGATIVE_INFINITY) {
         float var1 = this.n5.n5(com.aspose.slides.internal.v2.c8.x9, 0.0F);
         this.k5 = q1.n5(var1);
      }

      return this.k5;
   }

   @Override
   public float l6() {
      if (this.l6 == Float.NEGATIVE_INFINITY) {
         float var1 = this.n5.n5(com.aspose.slides.internal.v2.c8.q4d, 0.0F);
         this.l6 = q1.n5(var1);
      }

      return this.l6;
   }

   @Override
   public float k5() {
      return this.n5.n5(com.aspose.slides.internal.v2.c8.q0, 0.0F);
   }

   @Override
   public float u3() {
      return this.n5.n5(com.aspose.slides.internal.v2.c8.s9, 0.0F);
   }

   @Override
   public float a6() {
      return this.n5.n5(com.aspose.slides.internal.v2.c8.z2, 0.0F);
   }

   @Override
   public String u9() {
      String var1 = null;
      com.aspose.slides.internal.v2.y4 var2 = (com.aspose.slides.internal.v2.y4)this.n5.u9(com.aspose.slides.internal.v2.c8.w2);
      if (var2 != null) {
         var1 = var2.l6();
      }

      return var1;
   }

   public u9() {
      this.n5 = new com.aspose.slides.internal.v2.k5();
      this.n5.l6(com.aspose.slides.internal.v2.c8.g2x, com.aspose.slides.internal.v2.c8.n8);
      this.l6 = Float.NEGATIVE_INFINITY;
      this.k5 = Float.NEGATIVE_INFINITY;
   }

   public u9(com.aspose.slides.internal.v2.k5 var1) {
      this.n5 = var1;
      this.l6 = Float.NEGATIVE_INFINITY;
      this.k5 = Float.NEGATIVE_INFINITY;
   }

   @Override
   public com.aspose.slides.internal.e7.c8 h0() {
      com.aspose.slides.internal.v2.n5 var1 = this.n5.c8(com.aspose.slides.internal.v2.c8.w4);
      com.aspose.slides.internal.e7.c8 var2 = null;
      if (var1 != null) {
         var2 = new com.aspose.slides.internal.e7.c8(var1);
      }

      return var2;
   }

   @Override
   public String c8() {
      String var1 = null;
      com.aspose.slides.internal.v2.y4 var2 = (com.aspose.slides.internal.v2.y4)this.n5.u9(com.aspose.slides.internal.v2.c8.n0);
      if (var2 != null) {
         var1 = var2.l6();
      }

      return var1;
   }

   public String n3() {
      String var1 = null;
      com.aspose.slides.internal.v2.c8 var2 = (com.aspose.slides.internal.v2.c8)this.n5.u9(com.aspose.slides.internal.v2.c8.n6);
      if (var2 != null) {
         var1 = var2.n5();
         if (this.n5(var1)) {
            return d1.k5(var1, 7);
         }
      }

      return var1;
   }

   public final String n5(String[] var1) {
      return com.aspose.slides.internal.c8e.n5.n5(this.n3(), var1);
   }

   public final boolean n5(String var1) {
      String[] var2 = d1.n5(var1, '+');
      return var2.length == 2 && var2[0].length() == 6;
   }

   @Override
   public float s7() {
      return this.n5.n5(com.aspose.slides.internal.v2.c8.b7, 0.0F);
   }

   @Override
   public float x8() {
      return this.n5.n5(com.aspose.slides.internal.v2.c8.b0, 0.0F);
   }

   @Override
   public final com.aspose.slides.internal.v2.s7 t2() {
      return this.n5;
   }

   public final com.aspose.slides.internal.e7.s7 y4() {
      com.aspose.slides.internal.e7.s7 var1 = null;
      com.aspose.slides.internal.v2.x8 var2 = (com.aspose.slides.internal.v2.x8)this.n5.u9(com.aspose.slides.internal.v2.c8.k2);
      if (var2 != null) {
         var1 = new com.aspose.slides.internal.e7.s7(var2);
      }

      return var1;
   }

   public final com.aspose.slides.internal.e7.s7 e2() {
      com.aspose.slides.internal.e7.s7 var1 = null;
      com.aspose.slides.internal.v2.x8 var2 = (com.aspose.slides.internal.v2.x8)this.n5.u9(com.aspose.slides.internal.v2.c8.o8);
      if (var2 != null) {
         var1 = new com.aspose.slides.internal.e7.s7(var2);
      }

      return var1;
   }
}
