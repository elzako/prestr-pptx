package com.aspose.slides;

import java.io.InputStream;

public interface IExternalResourceResolver {
   String resolveUri(String var1, String var2);

   InputStream getEntity(String var1);
}
