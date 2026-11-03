package com.aspose.slides;

public interface IHyperlink {
   int getActionType();

   String getExternalUrl();

   String getExternalUrlOriginal();

   ISlide getTargetSlide();

   String getTargetFrame();

   void setTargetFrame(String var1);

   String getTooltip();

   void setTooltip(String var1);

   boolean getHistory();

   void setHistory(boolean var1);

   boolean getHighlightClick();

   void setHighlightClick(boolean var1);

   boolean getStopSoundOnClick();

   void setStopSoundOnClick(boolean var1);

   IAudio getSound();

   void setSound(IAudio var1);

   int getColorSource();

   void setColorSource(int var1);

   boolean equals(IHyperlink var1);
}
