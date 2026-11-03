package com.aspose.slides;

import java.io.InputStream;

public interface IImageCollection extends IGenericCollection<IPPImage> {
   IPPImage get_Item(int var1);

   IPPImage addImage(IImage var1);

   IPPImage addImage(InputStream var1);

   IPPImage addImage(InputStream var1, int var2);

   IPPImage addImage(byte[] var1);

   IPPImage addImage(IPPImage var1);

   IPPImage addImage(ISvgImage var1);
}
