package com.aspose.slides;

public interface IVideoFrame extends IPictureFrame {
   boolean getRewindVideo();

   void setRewindVideo(boolean var1);

   boolean getPlayLoopMode();

   void setPlayLoopMode(boolean var1);

   boolean getHideAtShowing();

   void setHideAtShowing(boolean var1);

   int getVolume();

   void setVolume(int var1);

   int getPlayMode();

   void setPlayMode(int var1);

   boolean getFullScreenMode();

   void setFullScreenMode(boolean var1);

   String getLinkPathLong();

   void setLinkPathLong(String var1);

   IVideo getEmbeddedVideo();

   void setEmbeddedVideo(IVideo var1);

   float getTrimFromStart();

   void setTrimFromStart(float var1);

   float getTrimFromEnd();

   void setTrimFromEnd(float var1);

   ICaptionsCollection getCaptionTracks();
}
