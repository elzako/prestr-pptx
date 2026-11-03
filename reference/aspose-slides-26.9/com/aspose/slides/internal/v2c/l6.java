package com.aspose.slides.internal.v2c;

import com.aspose.slides.internal.z0k.t4;
import java.io.InputStream;

public final class l6 extends InputStream {
   t4 n5;

   public l6(t4 var1) {
      this.n5 = var1;
   }

   @Override
   public int read() {
      return this.n5.readByte();
   }

   @Override
   public int read(byte[] b, int off, int len) {
      if (len == 0) {
         return 0;
      }

      int var4 = this.n5.read(b, off, len);
      return var4 == 0 ? -1 : var4;
   }

   @Override
   public long skip(long n) {
      long var3 = this.n5.getPosition();
      long var5 = this.n5.seek(n, 1);
      return var5 - var3;
   }

   @Override
   public int available() {
      return (int)(this.n5.getLength() - this.n5.getPosition());
   }

   @Override
   public void close() {
      this.n5.close();
   }

   public t4 n5() {
      return this.n5;
   }
}
