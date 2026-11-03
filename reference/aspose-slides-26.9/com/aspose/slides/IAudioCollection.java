package com.aspose.slides;

import java.io.InputStream;

public interface IAudioCollection extends IGenericCollection<IAudio> {
   IAudio get_Item(int var1);

   IAudio addAudio(IAudio var1);

   @Deprecated
   IAudio addAudio(InputStream var1);

   IAudio addAudio(InputStream var1, int var2);

   IAudio addAudio(byte[] var1);
}
