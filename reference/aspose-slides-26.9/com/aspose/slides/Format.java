package com.aspose.slides;

public final class Format extends PVIObject implements IFormat {
   private FillFormat n5;
   private LineFormat l6;
   private EffectFormat k5;
   private ThreeDFormat u3;
   private z4p a6;

   Format(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.n5 = new FillFormat(this);
      this.l6 = new LineFormat(this);
      this.k5 = new EffectFormat(this);
      this.u3 = new ThreeDFormat(this);
      this.a6 = new z4p(this);
   }

   @Override
   Object M_() {
      return new s6m(this.n5, this.l6, this.k5, this.u3, this.a6);
   }

   final s6m l6() {
      return (s6m)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().n5();
   }

   @Override
   public final IFillFormat getFill() {
      this.m3();
      return this.n5;
   }

   @Override
   public final ILineFormat getLine() {
      this.m3();
      return this.l6;
   }

   @Override
   public final IEffectFormat getEffect() {
      this.m3();
      return this.k5;
   }

   @Override
   public final IThreeDFormat getEffect3D() {
      this.m3();
      return this.u3;
   }

   final z4p u3() {
      this.m3();
      return this.a6;
   }

   final void n5(IFormat var1) {
      if (this.z3() || ((PVIObject)var1).z3()) {
         this.k7();
         this.l6().n5((Format)var1);
      }
   }
}
