package com.aspose.slides;

import java.io.InputStream;

public interface ICustomXmlPartCollection extends IGenericCollection<ICustomXmlPart> {
   ICustomXmlPart get_Item(int var1);

   ICustomXmlPart add(byte[] var1);

   ICustomXmlPart add(String var1);

   ICustomXmlPart add(InputStream var1);

   void removeAt(int var1);

   boolean remove(ICustomXmlPart var1);

   void clear();
}
