package com.aspose.slides;

import java.awt.Color;

public final class ColorFormat extends PVIObject implements IColorFormat {
   private static final q4x<Byte, g5d> l6 = new q4x<>((byte)0, new ColorFormat$1(), new ColorFormat$12());
   private static final q4x<Byte, g5d> k5 = new q4x<>((byte)0, new ColorFormat$23(), new ColorFormat$30());
   private static final q4x<Byte, g5d> u3 = new q4x<>((byte)0, new ColorFormat$31(), new ColorFormat$32());
   private static final q4x<Float, g5d> a6 = new q4x<>(0.0F, new ColorFormat$33(), new ColorFormat$34());
   private static final q4x<Float, g5d> u9 = new q4x<>(0.0F, new ColorFormat$35(), new ColorFormat$2());
   private static final q4x<Float, g5d> h0 = new q4x<>(0.0F, new ColorFormat$3(), new ColorFormat$4());
   private static final q4x<Integer, g5d> c8 = new q4x<>(-1, new ColorFormat$5(), new ColorFormat$6());
   private static final q4x<Integer, g5d> t2 = new q4x<>(-1, new ColorFormat$7(), new ColorFormat$8());
   private static final q4x<Integer, g5d> s7 = new q4x<>(-1, new ColorFormat$9(), new ColorFormat$10());
   private static final q4x<Integer, g5d> x8 = new q4x<>(-1, new ColorFormat$11(), new ColorFormat$13());
   private static final q4x<Float, g5d> n3 = new q4x<>(Float.NaN, new ColorFormat$14(), new ColorFormat$15());
   private static final q4x<Float, g5d> y4 = new q4x<>(Float.NaN, new ColorFormat$16(), new ColorFormat$17());
   private static final q4x<Float, g5d> e2 = new q4x<>(Float.NaN, new ColorFormat$18(), new ColorFormat$19());
   private static final q4x<com.aspose.slides.internal.o9b.c8, g5d> t9 = new q4x<>(
      com.aspose.slides.internal.o9b.c8.u3.o8(), new ColorFormat$20(), new ColorFormat$21()
   );
   private f4l z1;
   final com.aspose.slides.internal.v6g.n5<f4l> n5 = new ColorFormat$22(this);
   private ISlideComponent t4;
   private q7p q0;
   private IPresentationComponent z3;
   private m2n m1;

   ColorFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   ColorFormat(r0g parentImmediate, int preset) {
      super(parentImmediate);
      this.m3();
      this.n5(new g5d(parentImmediate, preset, this.m1));
      ((ColorOperationCollection)this.l6().t9()).n5.l6(new ColorFormat$24(this));
   }

   ColorFormat(r0g parentImmediate, int schemeColor, boolean colorFormatFix) {
      super(parentImmediate);
      this.m3();
      this.n5(new g5d(parentImmediate, schemeColor, this.m1, colorFormatFix));
      ((ColorOperationCollection)this.l6().t9()).n5.l6(new ColorFormat$25(this));
   }

   ColorFormat(r0g parentImmediate, com.aspose.slides.internal.o9b.c8 color) {
      super(parentImmediate);
      this.m3();
      this.n5(new g5d(parentImmediate, color.o8(), this.m1));
      ((ColorOperationCollection)this.l6().t9()).n5.l6(new ColorFormat$26(this));
   }

   @Override
   void N_() {
      this.m1 = new m2n(this);
   }

   @Override
   Object M_() {
      return new g5d(this.getParent_Immediate(), this.m1);
   }

   final g5d l6() {
      return (g5d)this.m1();
   }

   @Override
   public final int getColorType() {
      return this.n5(c8);
   }

   @Override
   public final void setColorType(int value) {
      this.l6(c8, value);
   }

   @Override
   public final Color getColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.u3());
   }

   com.aspose.slides.internal.o9b.c8 u3() {
      return this.n5(t9);
   }

   @Override
   public final void setColor(Color value) {
      this.n5(com.aspose.slides.internal.o9b.c8.n5(value));
   }

   void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.l6(t9, var1.o8());
   }

   @Override
   public final int getPresetColor() {
      return this.n5(x8);
   }

   @Override
   public final void setPresetColor(int value) {
      this.l6(x8, value);
   }

   @Override
   public final int getSystemColor() {
      return this.n5(s7);
   }

   @Override
   public final void setSystemColor(int value) {
      this.l6(s7, value);
   }

   @Override
   public final int getSchemeColor() {
      return this.n5(t2);
   }

   @Override
   public final void setSchemeColor(int value) {
      this.l6(t2, value);
   }

   @Override
   public final byte getR() {
      return this.n5(l6);
   }

   @Override
   public final void setR(byte value) {
      this.l6(l6, value);
   }

   @Override
   public final byte getG() {
      return this.n5(k5);
   }

   @Override
   public final void setG(byte value) {
      this.l6(k5, value);
   }

   @Override
   public final byte getB() {
      return this.n5(u3);
   }

   @Override
   public final void setB(byte value) {
      this.l6(u3, value);
   }

   @Override
   public final float getFloatR() {
      return this.n5(a6);
   }

   @Override
   public final void setFloatR(float value) {
      this.l6(a6, value);
   }

   @Override
   public final float getFloatG() {
      return this.n5(u9);
   }

   @Override
   public final void setFloatG(float value) {
      this.l6(u9, value);
   }

   @Override
   public final float getFloatB() {
      return this.n5(h0);
   }

   @Override
   public final void setFloatB(float value) {
      this.l6(h0, value);
   }

   @Override
   public final float getHue() {
      return this.n5(n3);
   }

   @Override
   public final void setHue(float value) {
      this.l6(n3, value);
   }

   @Override
   public final float getSaturation() {
      return this.n5(y4);
   }

   @Override
   public final void setSaturation(float value) {
      this.l6(y4, value);
   }

   @Override
   public final float getLuminance() {
      return this.n5(e2);
   }

   @Override
   public final void setLuminance(float value) {
      this.l6(e2, value);
   }

   @Override
   public final IColorOperationCollection getColorTransform() {
      this.k7();
      return this.l6().t9();
   }

   @Override
   public final String toString(int format) {
      return this.z3() ? this.l6().a6(format) : "Undefined color";
   }

   @Override
   public final void copyFrom(IColorFormat color) {
      this.n5((ColorFormat)color);
   }

   @Override
   public boolean equals(Object obj) {
      ColorFormat var2 = com.aspose.slides.internal.v6g.k5.n5(obj, ColorFormat.class);
      if (var2 == null) {
         return false;
      } else if (this.z3()) {
         return this.l6().equals(var2.l6());
      } else {
         return var2.z3() ? var2.l6().equals(this.l6()) : true;
      }
   }

   @Override
   public int hashCode() {
      return this.z3() ? this.m1().hashCode() : 0;
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().z8();
   }

   final m2n a6() {
      this.m3();
      return this.m1;
   }

   final void n5(r0g var1) {
      this.l6(var1);
      if (this.z3()) {
         this.l6().n5(var1);
         this.s7();
      }
   }

   final void u9() {
      if (this.z3()) {
         this.k7();
         this.n5((Object)null);
         this.s7();
      }
   }

   final void h0() {
      if (this.z3()) {
         this.k7();
         ((ColorOperationCollection)this.l6().t9()).n5.n5(new ColorFormat$27(this));
         this.n5((Object)null);
      }
   }

   final void n5(ColorFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         if (var1 != null) {
            if (var1.z3()) {
               this.l6().n5(var1.l6());
            } else {
               this.n5((Object)null);
            }
         }

         this.s7();
      }
   }

   final void l6(ColorFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         ((ColorOperationCollection)this.l6().t9()).n5.n5(new ColorFormat$28(this));

         try {
            if (var1 != null) {
               if (var1.z3()) {
                  this.l6().l6(var1.l6());
               } else {
                  this.n5((Object)null);
               }
            }
         } finally {
            if (this.l6() != null) {
               ((ColorOperationCollection)this.l6().t9()).n5.l6(new ColorFormat$29(this));
            }
         }
      }
   }

   final void l6(com.aspose.slides.internal.o9b.c8 var1) {
      this.k7();
      this.l6().l6(var1.o8());
      this.s7();
   }

   final void c8() {
      if (this.z3()) {
         this.k7();
         this.l6().m3();
         this.s7();
      }
   }

   final r0s t2() {
      this.k7();
      return this.l6().k7();
   }

   final r0s n5(IBaseSlide var1, r0s var2) {
      this.k7();
      return this.l6().n5(var1, var2);
   }

   final r0s n5(IBaseSlide var1) {
      this.k7();
      return this.l6().n5(var1);
   }

   final r0s l6(IBaseSlide var1, r0s var2) {
      this.k7();
      return this.l6().l6(var1, var2);
   }

   final r0s l6(IBaseSlide var1) {
      this.k7();
      return this.l6().l6(var1, null);
   }

   final com.aspose.slides.internal.o9b.c8 k5(IBaseSlide var1, r0s var2) {
      this.k7();
      return this.l6().k5(var1, var2);
   }

   final void n5(int var1, com.aspose.slides.internal.o9b.c8 var2) {
      this.k7();
      this.l6().n5(var1, var2.o8());
      this.s7();
   }

   final void n5(float var1, float var2, float var3, int var4) {
      this.k7();
      this.l6().n5(var1, var2, var3, var4);
      this.s7();
   }

   final void s7() {
      f4l var1 = this.z1;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   @Override
   public final ISlideComponent getParent_ISlideComponent() {
      if (this.t4 == null) {
         ISlideComponent[] var1 = new ISlideComponent[]{this.t4};
         q7p[] var2 = new q7p[]{this.q0};
         d0u.n5(this.getParent_Immediate(), var1, var2);
         this.t4 = var1[0];
         this.q0 = var2[0];
      }

      return this.t4;
   }

   final q7p x8() {
      if (this.q0 == null) {
         ISlideComponent[] var1 = new ISlideComponent[]{this.t4};
         q7p[] var2 = new q7p[]{this.q0};
         d0u.n5(this.getParent_Immediate(), var1, var2);
         this.t4 = var1[0];
         this.q0 = var2[0];
      }

      return this.q0;
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.z3 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.z3};
         d0u.n5(IPresentationComponent.class, this.getParent_Immediate(), var1);
         this.z3 = var1[0];
      }

      return this.z3;
   }

   static float n5(float var0, float var1, float var2) {
      float var3 = var0;
      float var4 = var0;
      if (var1 < var3) {
         var3 = var1;
      }

      if (var1 > var4) {
         var4 = var1;
      }

      if (var2 < var3) {
         var3 = var2;
      }

      if (var2 > var4) {
         var4 = var2;
      }

      if (var3 == var4) {
         return 0.0F;
      } else if (var4 == var0) {
         return var1 < var2 ? 60.0F * (var1 - var2) / (var4 - var3) + 360.0F : 60.0F * (var1 - var2) / (var4 - var3);
      } else {
         return var4 == var1 ? 60.0F * (var2 - var0) / (var4 - var3) + 360.0F : 60.0F * (var0 - var1) / (var4 - var3) + 360.0F;
      }
   }

   static float l6(float var0, float var1, float var2) {
      float var3 = var0;
      float var4 = var0;
      if (var1 < var3) {
         var3 = var1;
      }

      if (var1 > var4) {
         var4 = var1;
      }

      if (var2 < var3) {
         var3 = var2;
      }

      if (var2 > var4) {
         var4 = var2;
      }

      if (var3 == var4) {
         return 0.0F;
      } else {
         float var5 = var3 + var4;
         if (var4 == var3 || var5 == 0.0F) {
            return 0.0F;
         } else {
            return var5 > 1.0F ? (var4 - var3) / (2.0F - var5) : (var4 - var3) / var5;
         }
      }
   }

   static float k5(float var0, float var1, float var2) {
      float var3 = var0;
      float var4 = var0;
      if (var1 < var3) {
         var3 = var1;
      }

      if (var1 > var4) {
         var4 = var1;
      }

      if (var2 < var3) {
         var3 = var2;
      }

      if (var2 > var4) {
         var4 = var2;
      }

      return (var3 + var4) / 2.0F;
   }

   static r0s u3(float var0, float var1, float var2) {
      return r0s.l6(var0, var1, var2);
   }

   static void n5(float var0, float var1, float var2, float[] var3, float[] var4, float[] var5) {
      float var6 = var0;
      float var7 = var0;
      if (var1 < var6) {
         var6 = var1;
      }

      if (var1 > var7) {
         var7 = var1;
      }

      if (var2 < var6) {
         var6 = var2;
      }

      if (var2 > var7) {
         var7 = var2;
      }

      if (var6 == var7) {
         var3[0] = 0.0F;
      } else if (var7 == var0) {
         if (var1 < var2) {
            var3[0] = 60.0F * (var1 - var2) / (var7 - var6) + 360.0F;
         } else {
            var3[0] = 60.0F * (var1 - var2) / (var7 - var6);
         }
      } else if (var7 == var1) {
         var3[0] = 60.0F * (var2 - var0) / (var7 - var6) + 120.0F;
      } else {
         var3[0] = 60.0F * (var0 - var1) / (var7 - var6) + 240.0F;
      }

      var3[0] %= 360.0F;
      if (var3[0] < 0.0F) {
         var3[0] += 360.0F;
      }

      var5[0] = r0s.k5((var6 + var7) / 2.0F, 0.0F, 1.0F);
      if (var7 == var6 || var5[0] == 0.0F) {
         var4[0] = 0.0F;
      } else if (var5[0] > 0.5F) {
         var4[0] = (var7 - var6) / (1.0F - var5[0]) / 2.0F;
      } else {
         var4[0] = (var7 - var6) / var5[0] / 2.0F;
      }
   }

   private <T, TRealObject> void l6(q4x<T, TRealObject> var1, T var2) {
      if (this.n5(var1, var2)) {
         this.s7();
      }
   }

   final boolean n3() {
      return this.z3() ? this.l6().j5() : true;
   }

   // $VF: synthetic method
   static f4l n5(ColorFormat var0, f4l var1) {
      return var0.z1 = var1;
   }
}
