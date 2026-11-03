package com.aspose.slides.internal.v2c;

import com.aspose.slides.internal.z0k.t4;
import java.io.OutputStream;

public final class k5 extends OutputStream {
   t4 n5;

   public k5(t4 var1) {
      this.n5 = var1;
   }

   @Override
   public void write(int b) {
      this.n5.writeByte((byte)b);
   }

   @Override
   public void write(byte[] b, int off, int len) {
      this.n5.write(b, off, len);
   }

   @Override
   public void close() {
      this.n5.close();
   }
}
