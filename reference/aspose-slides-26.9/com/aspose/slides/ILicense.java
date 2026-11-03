package com.aspose.slides;

import java.io.InputStream;

public interface ILicense {
   void setLicense(String var1);

   void setLicense(InputStream var1);

   void resetLicense();

   /** @deprecated */
   boolean isLicensed();
}
