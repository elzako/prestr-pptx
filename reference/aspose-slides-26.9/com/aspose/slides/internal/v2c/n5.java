package com.aspose.slides.internal.v2c;

import com.aspose.slides.internal.z0k.e2;
import java.io.IOException;
import java.io.InputStream;

public class n5 extends e2 {
   InputStream n5;

   public n5(InputStream var1) {
      this.n5 = var1;
      com.aspose.slides.internal.l6o.l6.n5(var1, this);
   }

   @Override
   public void close() {
      try {
         this.n5.close();
      } catch (IOException var5) {
         throw new com.aspose.slides.exceptions.IOException("An I/O error occurs on closing stream", var5);
      } finally {
         super.close();
      }
   }

   public InputStream n5() {
      return this.n5;
   }
}
