package com.aspose.slides;

public final class Background extends PVIObject implements IBackground, r0g {
   private BaseSlide n5;
   private FillFormat l6;
   private EffectFormat k5;
   private ColorFormat u3;
   private r7 a6 = new r7();
   private r5 u9 = new r5();
   private m8 h0;

   Background(r0g parentImmediate) {
      super(parentImmediate);
      this.n5 = (BaseSlide)parentImmediate;
      this.a6().n5(new CustomData(this));
   }

   @Override
   public final byte getType() {
      return this.z3() ? this.l6().n5() : -1;
   }

   @Override
   public final void setType(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final IFillFormat getFillFormat() {
      this.m3();
      return this.l6;
   }

   @Override
   public final IEffectFormat getEffectFormat() {
      this.m3();
      return this.k5;
   }

   @Override
   public final IColorFormat getStyleColor() {
      this.m3();
      return this.u3;
   }

   @Override
   public final int getStyleIndex() {
      return this.z3() ? this.l6().a6() : 0;
   }

   @Override
   public final void setStyleIndex(int value) {
      this.n5(0, value);
      if (this.z3()) {
         this.l6().n5(value);
      }
   }

   @Override
   public final IBackgroundEffectiveData getEffective() {
      return this.h0();
   }

   final b9 l6() {
      return (b9)this.m1();
   }

   @Override
   void N_() {
      this.l6 = new FillFormat(this);
      this.k5 = new EffectFormat(this);
      this.u3 = new ColorFormat(this);
   }

   @Override
   Object M_() {
      return new b9(this.getParent_Immediate(), this.l6, this.k5, this.u3, this.u9, this.a6);
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().c8();
   }

   final r7 u3() {
      this.m3();
      return this.a6;
   }

   final r5 a6() {
      this.m3();
      return this.u9;
   }

   final BaseSlide u9() {
      return this.n5;
   }

   final m8 h0() {
      if (this.h0 == null) {
         this.h0 = new m8(this);
      }

      this.h0.n5(m8.class);
      return this.h0;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   @Override
   public final BaseSlide getSlide() {
      return this.u9();
   }

   @Override
   public final Presentation getPresentation() {
      return this.n5 != null ? (Presentation)this.n5.getPresentation() : null;
   }
}
