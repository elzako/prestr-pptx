package com.aspose.slides;

public final class AxisFormat extends DomObject<Axis> implements IAxisFormat, q1v {
   private final FillFormat n5;
   private final LineFormat l6;
   private final EffectFormat k5;
   private final q2 u3 = new q2();
   private IPresentationComponent a6;

   AxisFormat(Axis parentImmediate) {
      super(parentImmediate);
      this.n5 = new FillFormat(this);
      this.l6 = new LineFormat(this);
      this.l6.getFillFormat().getSolidFillColor().setColorType(0);
      this.k5 = new EffectFormat(this);
   }

   final q2 n5() {
      return this.u3;
   }

   @Override
   public final IFillFormat getFill() {
      return this.n5;
   }

   @Override
   public final ILineFormat getLine() {
      return this.l6;
   }

   @Override
   public final IEffectFormat getEffect() {
      return this.k5;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u9;
   }

   @Override
   public final IPresentationComponent getParent_IPresentationComponent() {
      if (this.a6 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.a6};
         d0u.n5(IPresentationComponent.class, this.u9, var1);
         this.a6 = var1[0];
      }

      return this.a6;
   }

   @Override
   public final long getVersion() {
      return ((this.n5.getVersion() & 4294967295L) + (this.l6.getVersion() & 4294967295L) & 4294967295L) + (this.k5.getVersion() & 4294967295L) & 4294967295L;
   }
}
