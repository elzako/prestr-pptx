package com.aspose.slides;

import java.io.InputStream;

public interface IAudio {
   String getContentType();

   byte[] getBinaryData();

   InputStream getStream();
}
