package com.aspose.slides;

public interface ITiming {
   float getAccelerate();

   void setAccelerate(float var1);

   float getDecelerate();

   void setDecelerate(float var1);

   boolean getAutoReverse();

   void setAutoReverse(boolean var1);

   float getDuration();

   void setDuration(float var1);

   float getRepeatCount();

   void setRepeatCount(float var1);

   boolean getRepeatUntilEndSlide();

   void setRepeatUntilEndSlide(boolean var1);

   boolean getRepeatUntilNextClick();

   void setRepeatUntilNextClick(boolean var1);

   float getRepeatDuration();

   void setRepeatDuration(float var1);

   int getRestart();

   void setRestart(int var1);

   float getSpeed();

   void setSpeed(float var1);

   float getTriggerDelayTime();

   void setTriggerDelayTime(float var1);

   int getTriggerType();

   void setTriggerType(int var1);

   boolean getRewind();

   void setRewind(boolean var1);
}
