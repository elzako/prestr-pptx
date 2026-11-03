package com.aspose.slides;

public interface ISlideShowTransition {
   IAudio getSound();

   void setSound(IAudio var1);

   int getSoundMode();

   void setSoundMode(int var1);

   boolean getSoundLoop();

   void setSoundLoop(boolean var1);

   boolean getAdvanceOnClick();

   void setAdvanceOnClick(boolean var1);

   boolean getAdvanceAfter();

   void setAdvanceAfter(boolean var1);

   long getAdvanceAfterTime();

   void setAdvanceAfterTime(long var1);

   int getSpeed();

   void setSpeed(int var1);

   ITransitionValueBase getValue();

   int getType();

   void setType(int var1);

   boolean getSoundIsBuiltIn();

   void setSoundIsBuiltIn(boolean var1);

   String getSoundName();

   void setSoundName(String var1);

   int getDuration();

   void setDuration(int var1);
}
