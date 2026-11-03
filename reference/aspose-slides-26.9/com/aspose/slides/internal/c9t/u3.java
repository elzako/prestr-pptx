package com.aspose.slides.internal.c9t;

import java.io.IOException;
import javax.imageio.stream.ImageInputStream;

public class u3 {
   public static int n5 = 19778;
   public int l6;
   public long k5;
   public long u3;

   public u3(ImageInputStream var1) throws IOException {
      this.l6 = var1.readUnsignedShort();
      if (this.l6 != n5) {
         throw new IOException("Invalid Bmp header");
      }

      this.k5 = var1.readUnsignedInt();
      var1.skipBytes(4);
      this.u3 = var1.readUnsignedInt();
   }
}
