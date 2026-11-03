package com.aspose.slides.internal.c9t;

import java.io.IOException;
import javax.imageio.stream.ImageInputStream;

class l6$n5 {
   public int[] n5 = new int[4];

   public l6$n5(ImageInputStream var1) throws IOException {
      this.n5[0] = var1.readUnsignedByte();
      this.n5[1] = var1.readUnsignedByte();
      this.n5[2] = var1.readUnsignedByte();
      this.n5[3] = var1.readUnsignedByte();
   }
}
