package com.aspose.slides;

import java.io.InputStream;

public interface IVideoCollection extends IGenericCollection<IVideo> {
   IVideo get_Item(int var1);

   IVideo addVideo(IVideo var1);

   IVideo addVideo(InputStream var1, int var2);

   IVideo addVideo(byte[] var1);
}
