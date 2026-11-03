package com.aspose.slides.internal.t5g;

import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.spi.ImageReaderWriterSpi;

class n5$u3 extends n5$n5 {
   private n5$u3() {
   }

   @Override
   protected Iterator n5(String var1) {
      return ImageIO.getImageReadersByMIMEType(var1);
   }

   @Override
   protected ImageReaderWriterSpi n5(Iterator var1) {
      ImageReader var2 = (ImageReader)var1.next();
      return var2.getOriginatingProvider();
   }

   // $VF: synthetic method
   n5$u3(l6 var1) {
      this();
   }
}
