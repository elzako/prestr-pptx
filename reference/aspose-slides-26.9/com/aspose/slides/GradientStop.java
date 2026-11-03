package com.aspose.slides;

public final class GradientStop extends PVIObject implements IGradientStop {
   private ColorFormat n5;

   GradientStop(r0g parentImmediate) {
      super(parentImmediate);
   }

   GradientStop(r0g parentImmediate, float position, com.aspose.slides.internal.o9b.c8 color) {
      super(parentImmediate);
      this.m3();
      this.n5 = new ColorFormat(this, color.o8());
      this.n5(new i9f(position, this.n5));
   }

   GradientStop(r0g parentImmediate, float position, int presetColor) {
      super(parentImmediate);
      this.m3();
      this.n5 = new ColorFormat(this, presetColor);
      this.n5(new i9f(position, this.n5));
   }

   GradientStop(r0g parentImmediate, float position, int schemeColor, boolean cFix) {
      super(parentImmediate);
      this.m3();
      this.n5 = new ColorFormat(this, schemeColor, cFix);
      this.n5(new i9f(position, this.n5));
   }

   @Override
   void N_() {
      this.n5 = new ColorFormat(this);
   }

   @Override
   Object M_() {
      return new i9f(0.0F, this.n5);
   }

   final i9f l6() {
      return (i9f)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().k5();
   }

   @Override
   public final float getPosition() {
      return this.z3() ? this.l6().n5() : 0.0F;
   }

   @Override
   public final void setPosition(float value) {
      this.n5(0.0F, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final IColorFormat getColor() {
      this.m3();
      return this.n5;
   }

   final void n5(IGradientStopEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
   }

   final void n5(GradientStop var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         if (var1.z3()) {
            this.l6().n5(var1.l6());
         } else {
            this.n5((Object)null);
         }
      }
   }
}
