package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;

class i2k {
   private TextParam u9;
   private Hyperlink h0;
   private final b4o c8 = new b4o();
   private boolean t2;
   private boolean s7;
   private r4d x8;
   private a1v n3;
   private byte y4;
   private f3v e2;
   private ILineFormatEffectiveData t9;
   private d2k z1 = new d2k();
   private IFillFormatEffectiveData t4;
   private byte q0;
   private byte z3;
   private c9g m1;
   private float k7;
   private j2n m3;
   private r1f z8;
   private String j5;
   private com.aspose.slides.internal.o9b.y1 w1 = new com.aspose.slides.internal.o9b.y1();
   private float r4;
   private float c4;
   private float y2;
   private final String y1;
   private static com.aspose.slides.internal.t4r.n5<KeyValuePair<TextParam, String>, Float> a0;
   public m4i n5;
   public y6e l6;
   public y6e k5;
   public y6e u3;
   private float d2;
   private float d5;
   public y6e a6;

   public i2k(
      m4i var1,
      com.aspose.slides.internal.o9b.y1 var2,
      Hyperlink var3,
      TextParam var4,
      b4o var5,
      y6e var6,
      y6e var7,
      boolean var8,
      boolean var9,
      y6e var10,
      r4d var11,
      a1v var12,
      byte var13,
      f3v var14,
      ILineFormatEffectiveData var15,
      d2k var16,
      IFillFormatEffectiveData var17,
      byte var18,
      c9g var19,
      y6e var20,
      int var21,
      float var22,
      String var23,
      float var24,
      float var25,
      byte var26,
      float var27,
      String var28
   ) {
      this.n5 = var1;
      var2.a6(this.w1);
      this.u9 = var4;
      this.h0 = var3;
      var5.n5(this.c8);
      this.a6 = var20;
      this.l6 = var6;
      this.k5 = var7;
      this.t2 = var8;
      this.s7 = var9;
      this.u3 = var10;
      this.x8 = var11;
      this.n3 = var12;
      this.y4 = var13;
      this.e2 = var14;
      this.t9 = var15;
      var16.n5(this.z1);
      this.t4 = var17;
      this.z3 = var18;
      this.m1 = var19;
      this.j5 = var23;
      this.c4 = var24;
      this.y2 = var25;
      this.q0 = var26;
      this.k7 = var27;
      this.y1 = var28;
      this.m3 = com.aspose.slides.ms.System.d1.n5(this.y1) ? new j2n(1, var1.n5.h0()) : new j2n(this, var21, var22);
      this.n5(var4.k5());
      this.l6(this.j5().l6() / this.j5().n5());
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("Text: {0}, CurPos: {1}, Rect: {2}", this.y1, this.r4, this.w1.y4());
      if (com.aspose.slides.ms.System.o5.l6(this.k5().w1(), null)
         && com.aspose.slides.ms.System.o5.n5(this.k5().w1(), new com.aspose.slides.ms.System.o5<>(true))) {
         var1.n5(", first");
      }

      if (com.aspose.slides.ms.System.o5.l6(this.k5().j5(), null)
         && com.aspose.slides.ms.System.o5.n5(this.k5().j5(), new com.aspose.slides.ms.System.o5<>(true))) {
         var1.n5(", last");
      }

      return var1.toString();
   }

   public r1f n5() {
      return this.z8;
   }

   public final com.aspose.slides.internal.o9b.y1 l6() {
      return this.w1;
   }

   public final TextParam k5() {
      return this.u9;
   }

   public final Hyperlink u3() {
      return this.h0;
   }

   public final b4o a6() {
      return this.c8;
   }

   public final boolean u9() {
      return this.t2;
   }

   public final boolean h0() {
      return this.s7;
   }

   public final r4d c8() {
      return this.x8;
   }

   public final a1v t2() {
      return this.n3;
   }

   public final byte s7() {
      return this.y4;
   }

   public final f3v x8() {
      return this.e2;
   }

   public final ILineFormatEffectiveData n3() {
      return this.t9;
   }

   public final d2k y4() {
      return this.z1;
   }

   public final IFillFormatEffectiveData e2() {
      return this.t4;
   }

   public final byte t9() {
      return this.z3;
   }

   public final String z1() {
      return this.j5;
   }

   public final void n5(String var1) {
      this.j5 = var1;
   }

   public final float t4() {
      return this.r4;
   }

   public final float q0() {
      return this.c4;
   }

   public final float z3() {
      return this.d2;
   }

   public final void n5(float var1) {
      this.d2 = var1;
   }

   public final float m1() {
      return this.d5;
   }

   public final void l6(float var1) {
      this.d5 = var1;
   }

   public final float k7() {
      return this.y2;
   }

   public final byte m3() {
      return this.q0;
   }

   public final float z8() {
      return this.k7;
   }

   public final j2n j5() {
      return this.m3;
   }

   public final void n5(d2k var1) {
      this.w1.n5(new com.aspose.slides.internal.o9b.w1(var1.n5, var1.l6));
   }

   public final void k5(float var1) {
      this.r4 = var1;
   }

   public final void u3(float var1) {
      this.c4 = var1;
   }

   public final String w1() {
      return this.y1;
   }

   public final boolean r4() {
      return com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.l6(this.y1), com.aspose.slides.ms.System.d1.n5);
   }

   public final boolean c4() {
      return this.y1.length() == 1 && com.aspose.slides.internal.n2d.u9.z1(this.y1.charAt(0));
   }

   public final void a6(float var1) {
      this.r4 *= var1;
      this.w1.l6(this.w1.s7() * var1);
      this.w1.n5(new com.aspose.slides.internal.o9b.w1(this.w1.u9().l6() * var1, this.w1.u9().k5()));
   }

   public final void u9(float var1) {
      this.w1.l6(var1);
   }

   public static void y2() {
      if (a0 != null) {
         a0.k5();
      }
   }

   public final void n5(e7k var1) {
      if (!com.aspose.slides.ms.System.d1.n5(this.w1())) {
         int var2 = this.w1().length();
         if (var2 != 1) {
            float[] var3 = new float[var2];
            float[] var4 = this.l6(var1);
            float[] var5 = new float[]{0.0F};

            for (int var6 = 0; var6 < var4.length; var6++) {
               var5[0] += var4[var6];
            }

            float var10 = this.w1.s7() - var5[0];
            float var7 = var10 / (var2 - 1);
            var7 = (var10 + var7) / var2;
            float var8 = this.r4;

            for (int var9 = 0; var9 < var3.length; var9++) {
               var3[var9] = var8;
               var8 += var7 + var4[var9];
            }

            this.u9.n5(var3);
         }
      }
   }

   private float[] l6(e7k var1) {
      if (com.aspose.slides.ms.System.d1.n5(this.w1())) {
         throw new InvalidOperationException("It's not allowed to call GetCharLengths for an empty string");
      }

      if (a0 == null) {
         a0 = new com.aspose.slides.internal.t4r.n5<>(KeyValuePair.class, Float.class, 1024, new p2b());
      }

      int var2 = this.w1().length();
      float[] var3 = new float[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         char var5 = this.w1().charAt(var4);
         KeyValuePair var6 = new KeyValuePair<>(this.u9, com.aspose.slides.ms.System.t9.q0(var5));
         float var7 = 0.0F;
         Float[] var8 = new Float[]{var7};
         boolean var9 = a0.n5(var6.Clone(), var8);
         var7 = var8[0];
         if (var9) {
            var3[var4] = var7;
         } else {
            com.aspose.slides.internal.o9b.f2 var10 = var1.n5(com.aspose.slides.ms.System.t9.q0(var5), this.u9).a6();
            float var11 = var10.l6();
            var3[var4] = var11;
            a0.n5(var6.Clone(), var11);
            if (a0.n5() == 1024) {
            }
         }
      }

      return var3;
   }
}
