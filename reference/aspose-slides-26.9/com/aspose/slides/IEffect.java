package com.aspose.slides;

public interface IEffect {
   ISequence getSequence();

   ITextAnimation getTextAnimation();

   int getPresetClassType();

   void setPresetClassType(int var1);

   int getType();

   void setType(int var1);

   int getSubtype();

   void setSubtype(int var1);

   IBehaviorCollection getBehaviors();

   void setBehaviors(IBehaviorCollection var1);

   ITiming getTiming();

   void setTiming(ITiming var1);

   IShape getTargetShape();

   IAudio getSound();

   void setSound(IAudio var1);

   boolean getStopPreviousSound();

   void setStopPreviousSound(boolean var1);

   int getAfterAnimationType();

   void setAfterAnimationType(int var1);

   IColorFormat getAfterAnimationColor();

   void setAfterAnimationColor(IColorFormat var1);

   int getAnimateTextType();

   void setAnimateTextType(int var1);

   float getDelayBetweenTextParts();

   void setDelayBetweenTextParts(float var1);
}
