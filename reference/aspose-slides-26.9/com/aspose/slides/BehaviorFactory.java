package com.aspose.slides;

public class BehaviorFactory implements IBehaviorFactory {
   @Override
   public final IColorEffect createColorEffect() {
      return new ColorEffect();
   }

   @Override
   public final ICommandEffect createCommandEffect() {
      return new CommandEffect();
   }

   @Override
   public final IFilterEffect createFilterEffect() {
      return new FilterEffect();
   }

   @Override
   public final IMotionEffect createMotionEffect() {
      return new MotionEffect();
   }

   @Override
   public final IPropertyEffect createPropertyEffect() {
      return new PropertyEffect();
   }

   @Override
   public final IRotationEffect createRotationEffect() {
      return new RotationEffect();
   }

   @Override
   public final IScaleEffect createScaleEffect() {
      return new ScaleEffect();
   }

   @Override
   public final ISetEffect createSetEffect() {
      return new SetEffect();
   }
}
