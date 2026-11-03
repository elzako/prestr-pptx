package com.aspose.slides;

import java.io.OutputStream;

public interface ISvgImage {
   String getSvgContent();

   byte[] getSvgData();

   IExternalResourceResolver getExternalResourceResolver();

   String getBaseUri();

   void writeAsEmf(OutputStream var1);
}
