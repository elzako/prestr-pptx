package com.aspose.slides;

import java.io.InputStream;

public interface IPresentationFactory {
   IPresentation createPresentation();

   IPresentation createPresentation(ILoadOptions var1);

   IPresentationInfo getPresentationInfo(String var1);

   IPresentationInfo getPresentationInfo(InputStream var1);

   IPresentation readPresentation(byte[] var1);

   IPresentation readPresentation(byte[] var1, ILoadOptions var2);

   IPresentation readPresentation(InputStream var1);

   IPresentation readPresentation(InputStream var1, ILoadOptions var2);

   IPresentation readPresentation(String var1);

   IPresentation readPresentation(String var1, ILoadOptions var2);

   IPresentationText getPresentationText(String var1, int var2);

   IPresentationText getPresentationText(InputStream var1, int var2);

   IPresentationText getPresentationText(InputStream var1, int var2, ILoadOptions var3);
}
