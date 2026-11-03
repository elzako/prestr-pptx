package com.aspose.slides.internal.g3y;

import java.io.IOException;
import javax.imageio.stream.ImageInputStream;

class n5$n5 {
   public int[] n5 = new int[4];

   public n5$n5(ImageInputStream var1) throws IOException {
      this.n5[0] = var1.readUnsignedByte();
      this.n5[1] = var1.readUnsignedByte();
      this.n5[2] = var1.readUnsignedByte();
      this.n5[3] = var1.readUnsignedByte();
   }

   public n5$n5(int var1, int var2, int var3, int var4) {
      this.n5[0] = var3;
      this.n5[1] = var2;
      this.n5[2] = var1;
      this.n5[3] = var4;
   }
}
