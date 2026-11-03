package com.aspose.slides.internal.k0r;

import com.aspose.slides.ILinkEmbedController;
import com.aspose.slides.exceptions.InvalidOperationException;

public class f0 implements ILinkEmbedController {
   public static final f0 n5 = new f0();

   @Override
   public int getObjectStoringLocation(int id, byte[] entityData, String semanticName, String contentType, String recomendedExtension) {
      return 1;
   }

   @Override
   public String getUrl(int id, int referrer) {
      return null;
   }

   @Override
   public void saveExternal(int id, byte[] entityData) {
      throw new InvalidOperationException("GetUrl returned null, this method shouldn't be called.");
   }
}
