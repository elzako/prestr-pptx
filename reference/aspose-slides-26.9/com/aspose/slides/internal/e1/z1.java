package com.aspose.slides.internal.e1;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.e5;

public class z1 extends m3 implements p8 {
   private boolean n5;
   private Object l6;
   private final com.aspose.slides.internal.p1s.l6 k5;
   private com.aspose.slides.internal.p1s.n5 u3;
   private com.aspose.slides.internal.w0.l6 a6;
   private com.aspose.slides.internal.p1s.n5 u9;
   private com.aspose.slides.internal.w0.s7 h0;
   private float c8;
   private com.aspose.slides.internal.o9b.w1 t2 = com.aspose.slides.internal.o9b.w1.n5.u3();
   private com.aspose.slides.internal.o9b.f2 s7 = com.aspose.slides.internal.o9b.f2.n5.a6();
   private String x8;
   private int n3;
   private String y4;
   private com.aspose.slides.internal.w0.c8 e2;
   private r4 t9;
   private m1 z1;
   private final float t4;
   private t4 q0;
   private float[] z3;
   private int m1;

   public z1(
      com.aspose.slides.internal.p1s.l6 var1,
      com.aspose.slides.internal.p1s.n5 var2,
      com.aspose.slides.internal.p1s.n5 var3,
      com.aspose.slides.internal.o9b.w1 var4,
      String var5,
      com.aspose.slides.internal.o9b.f2 var6,
      float var7
   ) {
      this(var1, var2, var3, 0.5F, var4.u3(), var5, var6.a6(), var7);
   }

   public z1(
      com.aspose.slides.internal.p1s.l6 var1,
      com.aspose.slides.internal.w0.l6 var2,
      com.aspose.slides.internal.w0.s7 var3,
      com.aspose.slides.internal.o9b.w1 var4,
      String var5,
      com.aspose.slides.internal.o9b.f2 var6,
      float var7
   ) {
      this(var1, var2, var3, 0.5F, var4.u3(), var5, var6.a6(), var7);
   }

   public z1(
      com.aspose.slides.internal.p1s.l6 var1,
      com.aspose.slides.internal.w0.l6 var2,
      com.aspose.slides.internal.w0.s7 var3,
      float var4,
      com.aspose.slides.internal.o9b.w1 var5,
      String var6,
      com.aspose.slides.internal.o9b.f2 var7,
      float var8
   ) {
      this(var1, var2, var3, var4, var5.u3(), var6, var7.a6(), var8, null);
   }

   public z1(
      com.aspose.slides.internal.p1s.l6 var1,
      com.aspose.slides.internal.w0.l6 var2,
      com.aspose.slides.internal.w0.s7 var3,
      float var4,
      com.aspose.slides.internal.o9b.w1 var5,
      String var6,
      com.aspose.slides.internal.o9b.f2 var7,
      float var8,
      float[] var9
   ) {
      if (var1 == null) {
         throw new ArgumentNullException("font");
      }

      if (var6 == null) {
         throw new ArgumentNullException("text");
      }

      this.k5 = var1;
      this.n5(var2);
      this.n5(var3);
      this.c8 = var4;
      var5.n5(this.t2);
      this.x8 = var6;
      var7.l6(this.s7);
      this.t4 = var8;
      this.z3 = var9;
   }

   public z1(
      com.aspose.slides.internal.p1s.l6 var1,
      com.aspose.slides.internal.p1s.n5 var2,
      com.aspose.slides.internal.p1s.n5 var3,
      float var4,
      com.aspose.slides.internal.o9b.w1 var5,
      String var6,
      com.aspose.slides.internal.o9b.f2 var7,
      float var8
   ) {
      this(var1, var2, var3, var4, var5.u3(), var6, var7.a6(), var8, null);
   }

   public z1(
      com.aspose.slides.internal.p1s.l6 var1,
      com.aspose.slides.internal.p1s.n5 var2,
      com.aspose.slides.internal.p1s.n5 var3,
      float var4,
      com.aspose.slides.internal.o9b.w1 var5,
      String var6,
      com.aspose.slides.internal.o9b.f2 var7,
      float var8,
      float[] var9
   ) {
      this(var1, new com.aspose.slides.internal.w0.n3(var2), new com.aspose.slides.internal.w0.s7(var3), var4, var5.u3(), var6, var7.a6(), var8, var9);
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.p1s.l6 l6() {
      return this.k5;
   }

   public final com.aspose.slides.internal.p1s.n5 k5() {
      return this.u3;
   }

   public final com.aspose.slides.internal.w0.l6 u9() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.w0.l6 var1) {
      this.a6 = var1;
      if (this.a6 != null) {
         this.u3 = this.a6.n5() == 0 ? ((com.aspose.slides.internal.w0.n3)this.a6).l6() : com.aspose.slides.internal.p1s.n5.b2;
      } else {
         this.u3 = com.aspose.slides.internal.p1s.n5.b2;
      }
   }

   public final com.aspose.slides.internal.p1s.n5 h0() {
      return this.u9;
   }

   public final com.aspose.slides.internal.w0.s7 c8() {
      return this.h0;
   }

   public final void n5(com.aspose.slides.internal.w0.s7 var1) {
      this.h0 = var1;
      if (this.h0 == null) {
         this.u9 = com.aspose.slides.internal.p1s.n5.b2;
      } else {
         if (this.h0.u9() != null) {
            this.u9 = this.h0.u9().n5() == 0 ? ((com.aspose.slides.internal.w0.n3)this.h0.u9()).l6() : com.aspose.slides.internal.p1s.n5.b2;
         }
      }
   }

   public final float t2() {
      return this.c8;
   }

   public final com.aspose.slides.internal.o9b.w1 s7() {
      return this.t2;
   }

   public final void n5(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.t2);
   }

   public String x8() {
      return this.x8;
   }

   @Override
   public final com.aspose.slides.internal.w0.c8 u3() {
      return this.e2;
   }

   public final void n5(com.aspose.slides.internal.w0.c8 var1) {
      this.e2 = var1;
   }

   @Override
   public final r4 a6() {
      return this.t9;
   }

   public final com.aspose.slides.internal.o9b.w1 n3() {
      return new com.aspose.slides.internal.o9b.w1(this.t9(), this.e2());
   }

   public final com.aspose.slides.internal.o9b.f2 y4() {
      return this.s7;
   }

   public final void n5(com.aspose.slides.internal.o9b.f2 var1) {
      var1.l6(this.s7);
   }

   public final float e2() {
      return this.t2.k5() - this.k5.t2();
   }

   public final float t9() {
      return this.t2.l6();
   }

   public final m1 z1() {
      return this.z1;
   }

   public final void n5(m1 var1) {
      this.z1 = var1;
   }

   public final float t4() {
      return this.t4;
   }

   public final com.aspose.slides.internal.o9b.y1 q0() {
      return new com.aspose.slides.internal.o9b.y1(this.t9(), this.e2(), this.y4().l6(), this.y4().k5());
   }

   public final Object z3() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.n3 = var1;
   }

   public final String m1() {
      return this.y4;
   }

   public final void n5(String var1) {
      this.y4 = var1;
   }

   public final t4 k7() {
      return this.q0;
   }

   public final void n5(t4 var1) {
      this.q0 = var1;
   }

   public final float[] m3() {
      return this.z3;
   }

   public final void n5(float[] var1) {
      this.z3 = var1;
   }

   public final void l6(int var1) {
      this.m1 = var1;
   }

   public static com.aspose.slides.internal.o9b.w1 n5(
      String var0, com.aspose.slides.internal.p1s.l6 var1, com.aspose.slides.internal.o9b.y1 var2, e5 var3, int var4, int var5
   ) {
      float var6 = var1.n5(var0);
      float var7 = n5(var2.x8(), var2.s7(), var6, var3);
      float var8 = n5(var2.n3(), var2.k5(), var1, var3, var4, var5);
      return new com.aspose.slides.internal.o9b.w1(var7, var8);
   }

   public void z8() {
      this.l6 = null;
      this.u3 = null;
      this.a6 = null;
      this.u9 = null;
      this.h0 = null;
      this.t2 = null;
      this.s7 = null;
      this.x8 = null;
      this.y4 = null;
      this.e2 = null;
      this.t9 = null;
      this.z1 = null;
      this.q0 = null;
      this.z3 = null;
   }

   private static float n5(float var0, float var1, float var2, e5 var3) {
      float var4 = var0;
      boolean var5 = (var3.k5() & 1) != 0;
      switch (var3.n5()) {
         case 0:
            if (var5) {
               var4 += var1 - var2;
            }
            break;
         case 1:
            var4 += (var1 - var2) / 2.0F;
            break;
         case 2:
            if (!var5) {
               var4 += var1 - var2;
            }
      }

      return var4;
   }

   private static float n5(float var0, float var1, com.aspose.slides.internal.p1s.l6 var2, e5 var3, int var4, int var5) {
      float var6 = var0 + var2.t2();
      float var7 = var2.c8();
      float var8 = var2.t2() + var2.s7();
      switch (var3.l6()) {
         case 0:
            var6 += var4 * var8;
            break;
         case 1:
            if (var5 % 2 == 0) {
               float var9 = (var1 - var5 * var7) / (var5 + 1);
               var6 += var9 * (var4 + 1) + var7 * var4;
            } else {
               int var11 = var5 / 2;
               float var10 = var4 < var11 ? -(var8 * (var11 - var4)) : (var4 > var11 ? var8 * (var4 - var11) : 0.0F);
               var6 += (var1 - var7) / 2.0F + var10;
            }
            break;
         case 2:
            var6 += var1 - var7 - var8 * (var5 - var4 - 1);
      }

      return var6;
   }
}
