package com.aspose.slides;

public class AnimationTimeLine extends DomObject<BaseSlide> implements IAnimationTimeLine {
   SequenceCollection n5;
   Sequence l6;
   TextAnimationCollection k5 = new TextAnimationCollection();

   @Override
   public final ISequenceCollection getInteractiveSequences() {
      return this.n5;
   }

   @Override
   public final ISequence getMainSequence() {
      return this.l6;
   }

   @Override
   public final ITextAnimationCollection getTextAnimationCollection() {
      return this.k5;
   }

   AnimationTimeLine(BaseSlide parentImmediate) {
      super(parentImmediate);
      this.n5 = new SequenceCollection(this);
      this.l6 = new Sequence(this);
      this.l6.n5().n5((byte)3);
   }

   final BaseSlide n5() {
      return this.u9;
   }
}
