package com.aspose.slides;

import java.io.InputStream;

public interface IVideo {
   String getContentType();

   byte[] getBinaryData();

   InputStream getStream();
}
