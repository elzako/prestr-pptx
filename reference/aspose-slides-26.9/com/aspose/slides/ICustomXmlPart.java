package com.aspose.slides;

import java.util.UUID;

public interface ICustomXmlPart {
   String getXmlAsString();

   void setXmlAsString(String var1);

   byte[] getXmlData();

   void setXmlData(byte[] var1);

   UUID getItemId();

   void setItemId(UUID var1);

   String[] getNamespaceSchemas();

   void remove();
}
