package com.aspose.slides.internal.s6;

import com.aspose.slides.ms.System.q1;

public class r4 extends com.aspose.slides.internal.v6g.h0<r4> {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;
   private float u9;
   private float h0;
   private float c8;
   private float t2;
   private float s7;
   private float x8;
   private float n3;
   private float y4;
   private float e2;
   private float t9;
   private float z1;
   private static final r4 t4 = new r4(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);

   public r4() {
   }

   public r4(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = var6;
      this.h0 = var7;
      this.c8 = var8;
      this.t2 = var9;
      this.s7 = var10;
      this.x8 = var11;
      this.n3 = var12;
      this.y4 = var13;
      this.e2 = var14;
      this.t9 = var15;
      this.z1 = var16;
   }

   public static r4 n5() {
      return t4;
   }

   public final v3 l6() {
      return new v3(this.y4, this.e2, this.t9);
   }

   public final float k5() {
      return this.n5 * this.u9 * this.x8 * this.z1
         + this.n5 * this.h0 * this.n3 * this.e2
         + this.n5 * this.c8 * this.s7 * this.t9
         + this.l6 * this.a6 * this.n3 * this.t9
         + this.l6 * this.h0 * this.t2 * this.z1
         + this.l6 * this.c8 * this.x8 * this.y4
         + this.k5 * this.a6 * this.s7 * this.z1
         + this.k5 * this.u9 * this.n3 * this.y4
         + this.k5 * this.c8 * this.t2 * this.e2
         + this.u3 * this.a6 * this.x8 * this.e2
         + this.u3 * this.u9 * this.t2 * this.t9
         + this.u3 * this.h0 * this.s7 * this.y4
         - (
            this.n5 * this.u9 * this.n3 * this.z1
               + this.n5 * this.h0 * this.s7 * this.z1
               + this.n5 * this.c8 * this.x8 * this.e2
               + this.l6 * this.a6 * this.x8 * this.z1
               + this.l6 * this.h0 * this.n3 * this.y4
               + this.l6 * this.c8 * this.s7 * this.y4
               + this.k5 * this.a6 * this.n3 * this.e2
               + this.k5 * this.u9 * this.t2 * this.z1
               + this.k5 * this.c8 * this.s7 * this.y4
               + this.u3 * this.a6 * this.s7 * this.t9
               + this.u3 * this.u9 * this.x8 * this.y4
               + this.u3 * this.h0 * this.t2 * this.e2
         );
   }

   public final r4 u3() {
      float var1 = this.x8 * this.z1 - this.n3 * this.t9;
      float var2 = this.s7 * this.z1 - this.n3 * this.e2;
      float var3 = this.s7 * this.t9 - this.x8 * this.e2;
      float var4 = this.t2 * this.z1 - this.n3 * this.y4;
      float var5 = this.t2 * this.t9 - this.x8 * this.y4;
      float var6 = this.t2 * this.e2 - this.s7 * this.y4;
      float var7 = this.h0 * this.z1 - this.c8 * this.t9;
      float var8 = this.u9 * this.z1 - this.c8 * this.e2;
      float var9 = this.u9 * this.t9 - this.h0 * this.e2;
      float var10 = this.h0 * this.n3 - this.c8 * this.x8;
      float var11 = this.u9 * this.n3 - this.c8 * this.s7;
      float var12 = this.u9 * this.x8 - this.h0 * this.s7;
      float var13 = this.a6 * this.z1 - this.c8 * this.y4;
      float var14 = this.a6 * this.t9 - this.h0 * this.y4;
      float var15 = this.a6 * this.n3 - this.c8 * this.t2;
      float var16 = this.a6 * this.x8 - this.h0 * this.t2;
      float var17 = this.a6 * this.e2 - this.u9 * this.y4;
      float var18 = this.a6 * this.s7 - this.u9 * this.t2;
      float var19 = this.n5 * (this.u9 * var1 - this.h0 * var2 + this.c8 * var3)
         - this.l6 * (this.a6 * var1 - this.h0 * var4 + this.c8 * var5)
         + this.k5 * (this.a6 * var2 - this.u9 * var4 + this.c8 * var6)
         - this.u3 * (this.a6 * var3 - this.u9 * var5 + this.h0 * var6);
      if (q1.n5(var19) < Float.MIN_VALUE) {
         return new r4(
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN,
            Float.NaN
         );
      }

      float var20 = 1.0F / var19;
      return new r4(
         var20 * (this.u9 * var1 - this.h0 * var2 + this.c8 * var3),
         var20 * -(this.l6 * var1 - this.k5 * var2 + this.u3 * var3),
         var20 * (this.l6 * var7 - this.k5 * var8 + this.u3 * var9),
         var20 * -(this.l6 * var10 - this.k5 * var11 + this.u3 * var12),
         var20 * -(this.a6 * var1 - this.h0 * var4 + this.c8 * var5),
         var20 * (this.n5 * var1 - this.k5 * var4 + this.u3 * var5),
         var20 * -(this.n5 * var7 - this.k5 * var13 + this.u3 * var14),
         var20 * (this.n5 * var10 - this.k5 * var15 + this.u3 * var16),
         var20 * (this.a6 * var2 - this.u9 * var4 + this.c8 * var6),
         var20 * -(this.n5 * var2 - this.l6 * var4 + this.u3 * var6),
         var20 * (this.n5 * var8 - this.l6 * var13 + this.u3 * var17),
         var20 * -(this.n5 * var11 - this.l6 * var15 + this.u3 * var18),
         var20 * -(this.a6 * var3 - this.u9 * var5 + this.h0 * var6),
         var20 * (this.n5 * var3 - this.l6 * var5 + this.k5 * var6),
         var20 * -(this.n5 * var9 - this.l6 * var14 + this.k5 * var17),
         var20 * (this.n5 * var12 - this.l6 * var16 + this.k5 * var18)
      );
   }

   public static r4 n5(float var0, float var1, float var2) {
      return new r4(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, var0, var1, var2, 1.0F);
   }

   public static r4 l6(float var0, float var1, float var2) {
      return new r4(var0, 0.0F, 0.0F, 0.0F, 0.0F, var1, 0.0F, 0.0F, 0.0F, 0.0F, var2, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
   }

   public static r4 n5(float var0) {
      float var1 = (float)q1.c8(var0);
      float var2 = (float)q1.h0(var0);
      return new r4(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, var1, var2, 0.0F, 0.0F, -var2, var1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
   }

   public static r4 l6(float var0) {
      float var1 = (float)q1.c8(var0);
      float var2 = (float)q1.h0(var0);
      return new r4(var1, 0.0F, -var2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, var2, 0.0F, var1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
   }

   public static r4 k5(float var0) {
      float var1 = (float)q1.c8(var0);
      float var2 = (float)q1.h0(var0);
      return new r4(var1, var2, 0.0F, 0.0F, -var2, var1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
   }

   public static r4 n5(float var0, float var1, float var2, float var3) {
      r4 var4 = n5().c8();
      float var5 = 1.0F / (float)q1.t2(var0 * 0.5F);
      float var6 = var2 - var3;
      var4.n5 = var5 / var1;
      var4.u9 = var5;
      var4.x8 = var3 / var6;
      var4.z1 = 0.0F;
      var4.t9 = var2 * var3 / var6;
      var4.n3 = -1.0F;
      return var4;
   }

   public static r4 l6(float var0, float var1, float var2, float var3) {
      r4 var4 = n5().c8();
      float var5 = var2 - var3;
      var4.n5 = 2.0F / var0;
      var4.u9 = 2.0F / var1;
      var4.x8 = 1.0F / var5;
      var4.t9 = var2 / var5;
      return var4;
   }

   public static r4 n5(v3 var0, v3 var1, v3 var2) {
      v3 var3 = v3.l6(var0, var1).u9().h0();
      v3 var4 = v3.u3(var2.h0(), var3.h0()).u9().h0();
      v3 var5 = v3.u3(var3.h0(), var4.h0()).h0();
      return new r4(
         var4.n5(),
         var5.n5(),
         var3.n5(),
         0.0F,
         var4.l6(),
         var5.l6(),
         var3.l6(),
         0.0F,
         var4.k5(),
         var5.k5(),
         var3.k5(),
         0.0F,
         -v3.k5(var4.h0(), var0.h0()),
         -v3.k5(var5.h0(), var0.h0()),
         -v3.k5(var3.h0(), var0.h0()),
         1.0F
      );
   }

   public final v3 n5(v3 var1) {
      float var2 = var1.n5() * this.u3 + var1.l6() * this.c8 + var1.k5() * this.n3 + this.z1;
      return new v3(
         (var1.n5() * this.n5 + var1.l6() * this.a6 + var1.k5() * this.t2 + this.y4) / var2,
         (var1.n5() * this.l6 + var1.l6() * this.u9 + var1.k5() * this.s7 + this.e2) / var2,
         (var1.n5() * this.k5 + var1.l6() * this.h0 + var1.k5() * this.x8 + this.t9) / var2
      );
   }

   public final v3 l6(v3 var1) {
      return new v3(
         var1.n5() * this.n5 + var1.l6() * this.a6 + var1.k5() * this.t2,
         var1.n5() * this.l6 + var1.l6() * this.u9 + var1.k5() * this.s7,
         var1.n5() * this.k5 + var1.l6() * this.h0 + var1.k5() * this.x8
      );
   }

   public final g7 k5(v3 var1) {
      return new g7(
         var1.n5() * this.n5 + var1.l6() * this.a6 + var1.k5() * this.t2 + this.y4,
         var1.n5() * this.l6 + var1.l6() * this.u9 + var1.k5() * this.s7 + this.e2,
         var1.n5() * this.k5 + var1.l6() * this.h0 + var1.k5() * this.x8 + this.t9,
         var1.n5() * this.u3 + var1.l6() * this.c8 + var1.k5() * this.n3 + this.z1
      );
   }

   public static r4 n5(r4 var0, r4 var1) {
      return new r4(
         var0.n5 * var1.n5 + var0.l6 * var1.a6 + var0.k5 * var1.t2 + var0.u3 * var1.y4,
         var0.n5 * var1.l6 + var0.l6 * var1.u9 + var0.k5 * var1.s7 + var0.u3 * var1.e2,
         var0.n5 * var1.k5 + var0.l6 * var1.h0 + var0.k5 * var1.x8 + var0.u3 * var1.t9,
         var0.n5 * var1.u3 + var0.l6 * var1.c8 + var0.k5 * var1.n3 + var0.u3 * var1.z1,
         var0.a6 * var1.n5 + var0.u9 * var1.a6 + var0.h0 * var1.t2 + var0.c8 * var1.y4,
         var0.a6 * var1.l6 + var0.u9 * var1.u9 + var0.h0 * var1.s7 + var0.c8 * var1.e2,
         var0.a6 * var1.k5 + var0.u9 * var1.h0 + var0.h0 * var1.x8 + var0.c8 * var1.t9,
         var0.a6 * var1.u3 + var0.u9 * var1.c8 + var0.h0 * var1.n3 + var0.c8 * var1.z1,
         var0.t2 * var1.n5 + var0.s7 * var1.a6 + var0.x8 * var1.t2 + var0.n3 * var1.y4,
         var0.t2 * var1.l6 + var0.s7 * var1.u9 + var0.x8 * var1.s7 + var0.n3 * var1.e2,
         var0.t2 * var1.k5 + var0.s7 * var1.h0 + var0.x8 * var1.x8 + var0.n3 * var1.t9,
         var0.t2 * var1.u3 + var0.s7 * var1.c8 + var0.x8 * var1.n3 + var0.n3 * var1.z1,
         var0.y4 * var1.n5 + var0.e2 * var1.a6 + var0.t9 * var1.t2 + var0.z1 * var1.y4,
         var0.y4 * var1.l6 + var0.e2 * var1.u9 + var0.t9 * var1.s7 + var0.z1 * var1.e2,
         var0.y4 * var1.k5 + var0.e2 * var1.h0 + var0.t9 * var1.x8 + var0.z1 * var1.t9,
         var0.y4 * var1.u3 + var0.e2 * var1.c8 + var0.t9 * var1.n3 + var0.z1 * var1.z1
      );
   }

   public final float a6() {
      return this.t2;
   }

   public final float u9() {
      return this.s7;
   }

   public final float h0() {
      return this.n3;
   }

   public void n5(r4 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.c8 = this.c8;
      var1.t2 = this.t2;
      var1.s7 = this.s7;
      var1.x8 = this.x8;
      var1.n3 = this.n3;
      var1.y4 = this.y4;
      var1.e2 = this.e2;
      var1.t9 = this.t9;
      var1.z1 = this.z1;
   }

   public r4 c8() {
      r4 var1 = new r4();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.c8();
   }

   private boolean l6(r4 var1) {
      return var1.n5 == this.n5
         && var1.l6 == this.l6
         && var1.k5 == this.k5
         && var1.u3 == this.u3
         && var1.a6 == this.a6
         && var1.u9 == this.u9
         && var1.h0 == this.h0
         && var1.c8 == this.c8
         && var1.t2 == this.t2
         && var1.s7 == this.s7
         && var1.x8 == this.x8
         && var1.n3 == this.n3
         && var1.y4 == this.y4
         && var1.e2 == this.e2
         && var1.t9 == this.t9
         && var1.z1 == this.z1;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(
         this.n5, this.l6, this.k5, this.u3, this.a6, this.u9, this.h0, this.c8, this.t2, this.s7, this.x8, this.n3, this.y4, this.e2, this.t9, this.z1
      );
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof r4) ? false : this.l6((r4)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r4 Clone() {
      return this.c8();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(r4 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
