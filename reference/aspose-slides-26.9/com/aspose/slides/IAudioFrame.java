package com.aspose.slides;

public interface IAudioFrame extends IPictureFrame {
   int getAudioCdStartTrack();

   void setAudioCdStartTrack(int var1);

   int getAudioCdStartTrackTime();

   void setAudioCdStartTrackTime(int var1);

   int getAudioCdEndTrack();

   void setAudioCdEndTrack(int var1);

   int getAudioCdEndTrackTime();

   void setAudioCdEndTrackTime(int var1);

   int getVolume();

   void setVolume(int var1);

   int getPlayMode();

   void setPlayMode(int var1);

   boolean getHideAtShowing();

   void setHideAtShowing(boolean var1);

   boolean getPlayLoopMode();

   void setPlayLoopMode(boolean var1);

   boolean getPlayAcrossSlides();

   void setPlayAcrossSlides(boolean var1);

   boolean getRewindAudio();

   void setRewindAudio(boolean var1);

   boolean getEmbedded();

   String getLinkPathLong();

   void setLinkPathLong(String var1);

   IAudio getEmbeddedAudio();

   void setEmbeddedAudio(IAudio var1);

   float getFadeInDuration();

   void setFadeInDuration(float var1);

   float getFadeOutDuration();

   void setFadeOutDuration(float var1);

   float getVolumeValue();

   void setVolumeValue(float var1);

   float getTrimFromStart();

   void setTrimFromStart(float var1);

   float getTrimFromEnd();

   void setTrimFromEnd(float var1);

   ICaptionsCollection getCaptionTracks();
}
