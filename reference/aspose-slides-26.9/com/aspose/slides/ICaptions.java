package com.aspose.slides;

import java.util.UUID;

public interface ICaptions {
   UUID getCaptionId();

   String getLabel();

   void setLabel(String var1);

   byte[] getBinaryData();

   String getDataAsString();
}
