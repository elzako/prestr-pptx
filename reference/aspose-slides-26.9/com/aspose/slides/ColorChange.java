package com.aspose.slides;

public final class ColorChange extends ImageTransformOperation implements IColorChange, i4e {
   private ColorFormat l6;
   private ColorFormat k5;
   private boolean u3 = true;
   private k5w a6;

   ColorChange(r0g parentImmediate) {
      super(parentImmediate);
      this.a6();
   }

   ColorChange(ColorFormat colorFrom, ColorFormat colorTo, boolean useAlpha, r0g parentImmediate) {
      super(parentImmediate);
      this.a6();
      this.l6.n5(colorFrom);
      this.k5.n5(colorTo);
      this.u3 = useAlpha;
      this.h0();
   }

   ColorChange(com.aspose.slides.internal.o9b.c8 colorFrom, com.aspose.slides.internal.o9b.c8 colorTo, boolean useAlpha, r0g parentImmediate) {
      super(parentImmediate);
      this.a6();
      this.l6.n5(colorFrom.o8());
      this.k5.n5(colorTo.o8());
      this.u3 = useAlpha;
      this.h0();
   }

   ColorChange(com.aspose.slides.internal.o9b.c8 colorFrom, int colorTo, boolean useAlpha, r0g parentImmediate) {
      super(parentImmediate);
      this.a6();
      this.l6.n5(colorFrom.o8());
      this.k5.setSchemeColor(colorTo);
      this.u3 = useAlpha;
      this.h0();
   }

   private void a6() {
      this.l6 = new ColorFormat(this);
      this.k5 = new ColorFormat(this);
      this.l6.n5.l6(new ColorChange$1(this));
      this.k5.n5.l6(new ColorChange$2(this));
   }

   @Override
   public final IColorFormat getFromColor() {
      return this.l6;
   }

   @Override
   public final IColorFormat getToColor() {
      return this.k5;
   }

   public final IColorChangeEffectiveData getEffective() {
      return this.l6();
   }

   final k5w l6() {
      if (this.a6 == null) {
         this.a6 = new k5w(this);
      }

      this.a6.n5(k5w.class);
      return this.a6;
   }

   final boolean u3() {
      return this.u3;
   }

   final void n5(boolean var1) {
      this.u3 = var1;
      this.h0();
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      com.aspose.slides.internal.o9b.c8 var3 = this.l6.k5(var2, null).o8();
      com.aspose.slides.internal.o9b.c8 var4 = this.k5.k5(var2, null).o8();
      byte var5 = 1;
      if (com.aspose.slides.ms.System.o0.n5(var1.u3().n5(), com.aspose.slides.internal.j9e.x8.c8().n5())) {
         var5 = 16;
      }

      int var6 = com.aspose.slides.ms.System.q1.n5(0, (var3.x8() & 255) - var5);
      int var7 = com.aspose.slides.ms.System.q1.l6(255, (var3.x8() & 255) + var5);
      int var8 = com.aspose.slides.ms.System.q1.n5(0, (var3.n3() & 255) - var5);
      int var9 = com.aspose.slides.ms.System.q1.l6(255, (var3.n3() & 255) + var5);
      int var10 = com.aspose.slides.ms.System.q1.n5(0, (var3.y4() & 255) - var5);
      int var11 = com.aspose.slides.ms.System.q1.l6(255, (var3.y4() & 255) + var5);
      int var12 = com.aspose.slides.ms.System.q1.n5(0, (var3.s7() & 255) - var5);
      int var13 = com.aspose.slides.ms.System.q1.l6(255, (var3.s7() & 255) + var5);

      for (int var14 = 0; var14 < var1.a6().length; var14 += 4) {
         byte var15 = var1.a6()[var14];
         byte var16 = var1.a6()[var14 + 1];
         byte var17 = var1.a6()[var14 + 2];
         byte var18 = var1.a6()[var14 + 3];
         boolean var19 = !this.u3 || (var18 & 255) >= var12 && (var18 & 255) <= var13;
         boolean var20 = var19
            && (var17 & 255) >= var6
            && (var17 & 255) <= var7
            && (var16 & 255) >= var8
            && (var16 & 255) <= var9
            && (var15 & 255) >= var10
            && (var15 & 255) <= var11;
         if (var20) {
            var1.a6()[var14 + 2] = var4.x8();
            var1.a6()[var14 + 1] = var4.n3();
            var1.a6()[var14] = var4.y4();
            if (this.u3) {
               var1.a6()[var14 + 3] = var4.s7();
            }
         }
      }

      return var1;
   }

   @Override
   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{super.n5(var1, var2), this.l6.k5(var1, var2), " ", this.k5.k5(var1, var2), ' ', this.u3});
   }

   @Override
   public long getVersion() {
      return ((super.getVersion() & 4294967295L) + (this.l6.getVersion() & 4294967295L) & 4294967295L) + (this.k5.getVersion() & 4294967295L) & 4294967295L;
   }

   @Override
   public boolean equals(Object obj) {
      ColorChange var2 = com.aspose.slides.internal.v6g.k5.n5(obj, ColorChange.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6) && com.aspose.slides.internal.n8e.v4.n5(this.k5, var2.k5) && this.u3 == var2.u3;
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
