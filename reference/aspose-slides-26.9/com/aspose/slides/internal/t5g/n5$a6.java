package com.aspose.slides.internal.t5g;

import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.spi.ImageReaderWriterSpi;

class n5$a6 extends n5$n5 {
   private n5$a6() {
   }

   @Override
   protected Iterator n5(String var1) {
      return ImageIO.getImageWritersByMIMEType(var1);
   }

   @Override
   protected ImageReaderWriterSpi n5(Iterator var1) {
      ImageWriter var2 = (ImageWriter)var1.next();
      return var2.getOriginatingProvider();
   }

   // $VF: synthetic method
   n5$a6(l6 var1) {
      this();
   }
}
