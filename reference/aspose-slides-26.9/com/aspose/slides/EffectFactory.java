package com.aspose.slides;

public class EffectFactory implements IEffectFactory {
   private static final ImageTransformOperationFactory n5 = new ImageTransformOperationFactory();

   @Override
   public final IGlow createGlow() {
      return new Glow(null);
   }

   @Override
   public final IInnerShadow createInnerShadow() {
      return new InnerShadow(null);
   }

   @Override
   public final IOuterShadow createOuterShadow() {
      return new OuterShadow(null);
   }

   @Override
   public final IPresetShadow createPresetShadow() {
      return new PresetShadow(null);
   }

   @Override
   public final IReflection createReflection() {
      return new Reflection(null);
   }

   @Override
   public final ISoftEdge createSoftEdge() {
      return new SoftEdge(null);
   }

   @Override
   public final IImageTransformOperationFactory getImageTransformOperationFactory() {
      return n5;
   }

   static ImageTransformOperationFactory n5() {
      return n5;
   }
}
