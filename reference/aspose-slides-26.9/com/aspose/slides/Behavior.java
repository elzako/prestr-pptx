package com.aspose.slides;

public abstract class Behavior implements IBehavior, r0g {
   byte n5 = -1;
   int l6 = -1;
   BehaviorPropertyCollection k5 = new BehaviorPropertyCollection();
   ITiming u3 = new Timing(this);
   private k1 a6;

   protected Behavior() {
      this.a6 = new k1();
   }

   Behavior(k1 pptxUnsupportedProps) {
      this.a6 = pptxUnsupportedProps;
   }

   k1 n5() {
      return this.a6;
   }

   @Override
   public final r0g getParent_Immediate() {
      return null;
   }

   @Override
   public final byte getAccumulate() {
      return this.n5;
   }

   @Override
   public final void setAccumulate(byte value) {
      this.n5 = value;
   }

   @Override
   public final int getAdditive() {
      return this.l6;
   }

   @Override
   public final void setAdditive(int value) {
      this.l6 = value;
   }

   @Override
   public final IBehaviorPropertyCollection getProperties() {
      return this.k5;
   }

   @Override
   public final ITiming getTiming() {
      return this.u3;
   }

   @Override
   public final void setTiming(ITiming value) {
      this.u3 = value;
   }
}
