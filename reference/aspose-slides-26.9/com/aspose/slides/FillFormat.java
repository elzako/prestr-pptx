package com.aspose.slides;

public final class FillFormat extends PVIObject implements IFillFormat {
   private j5s l6;
   final com.aspose.slides.internal.v6g.n5<j5s> n5 = new FillFormat$1(this);
   private PictureFillFormat k5;
   private GradientFormat u3;
   private PatternFormat a6;
   private ColorFormat u9;
   private f6a h0;

   FillFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.u9 = new ColorFormat(this, 7);
      this.k5 = new PictureFillFormat(this);
      this.u3 = new GradientFormat(this);
      this.a6 = new PatternFormat(this);
      this.u9.n5.l6(new FillFormat$2(this));
      this.k5.n5.l6(new FillFormat$3(this));
      this.u3.l6.l6(new FillFormat$4(this));
      this.a6.n5.l6(new FillFormat$5(this));
   }

   @Override
   Object M_() {
      return new r2r(this.u9, this.k5, this.u3, this.a6);
   }

   final r2r l6() {
      return (r2r)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().u9();
   }

   @Override
   public final byte getFillType() {
      return this.z3() ? this.l6().n5() : -1;
   }

   @Override
   public final void setFillType(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.s7();
      }
   }

   @Override
   public final IColorFormat getSolidFillColor() {
      this.m3();
      return this.u9;
   }

   @Override
   public final IGradientFormat getGradientFormat() {
      this.m3();
      return this.u3;
   }

   @Override
   public final IPatternFormat getPatternFormat() {
      this.m3();
      return this.a6;
   }

   @Override
   public final IPictureFillFormat getPictureFillFormat() {
      this.m3();
      return this.k5;
   }

   @Override
   public final byte getRotateWithShape() {
      return this.z3() ? this.l6().k5() : -1;
   }

   @Override
   public final void setRotateWithShape(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().l6(value);
         this.s7();
      }
   }

   @Override
   public final IFillFormatEffectiveData getEffective() {
      return this.c8();
   }

   final boolean u3() {
      return this.z3() ? this.l6().u3() : false;
   }

   final void n5(IFillFormat var1) {
      if (this.z3() || !com.aspose.slides.internal.v6g.k5.l6(var1, PVIObject.class) || ((PVIObject)var1).z3()) {
         this.k7();
         this.l6().n5((FillFormat)var1);
         this.s7();
      }
   }

   final void n5(IFillFormatEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
      this.s7();
   }

   final FillFormat a6() {
      FillFormat var1 = new FillFormat(this.getParent_Immediate());
      var1.n5((IFillFormat)this);
      return var1;
   }

   final void u9() {
      if (this.z3()) {
         this.k7();
         this.l6().a6();
         this.s7();
         this.s7();
      }
   }

   final void h0() {
      if (this.z3()) {
         this.k7();
         this.l6().a6();
         this.s7();
      }
   }

   final f6a c8() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.getParent_Immediate(), TableFormat.class)) {
         return (f6a)((TableFormat)this.getParent_Immediate()).getEffective().getFillFormat();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.getParent_Immediate(), PortionFormat.class)) {
         return (f6a)((PortionFormat)this.getParent_Immediate()).getEffective().getFillFormat();
      }

      AutoShape var1 = com.aspose.slides.internal.v6g.k5.n5(this.getParent_Immediate(), AutoShape.class);
      if (var1 != null && var1.getUseBackgroundFill() && var1.getFillFormat().getFillType() == -1) {
         return (f6a)var1.j9().getBackground().getEffective().getFillFormat();
      }

      if (this.h0 == null) {
         f6a var2 = f6a.a6(this);
         if (var2 != null) {
            return var2;
         }

         this.h0 = new f6a(this);
      }

      this.h0.n5(f6a.class);
      return this.h0;
   }

   final boolean t2() {
      return this.z3() ? this.l6().h0() : true;
   }

   private void s7() {
      j5s var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static j5s n5(FillFormat var0, j5s var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void n5(FillFormat var0) {
      var0.s7();
   }
}
