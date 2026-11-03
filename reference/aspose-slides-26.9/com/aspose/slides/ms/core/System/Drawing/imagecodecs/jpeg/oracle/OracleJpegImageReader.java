package com.aspose.slides.ms.core.System.Drawing.imagecodecs.jpeg.oracle;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.sun.imageio.plugins.jpeg.JPEGImageReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.spi.ImageReaderSpi;

public class OracleJpegImageReader extends JPEGImageReader {
   public OracleJpegImageReader(ImageReaderSpi originator) {
      super(originator);
   }

   @Override
   public Iterator<ImageTypeSpecifier> getImageTypes(int imageIndex) throws IOException {
      ArrayList var2 = new ArrayList(1);
      var2.add(ImageTypeSpecifier.createFromBufferedImageType(5));
      return var2.iterator();
   }

   public boolean isTheSameColorType(int msColorType) {
      int var2 = this.n5();
      switch (msColorType) {
         case 0:
            return var2 == 1;
         case 1:
            return var2 == 3;
         case 2:
            return var2 == 4;
         case 3:
            return var2 == 11;
         case 4:
            return var2 == 2;
         default:
            throw new ArgumentOutOfRangeException("msColorType");
      }
   }

   private int n5() {
      try {
         Field var1 = JPEGImageReader.class.getDeclaredField("colorSpaceCode");
         var1.setAccessible(true);
         Object var2 = var1.get(this);
         var1.setAccessible(false);
         if (var2 instanceof Integer) {
            return (Integer)var2;
         }
      } catch (Throwable var3) {
      }

      return -1;
   }
}
