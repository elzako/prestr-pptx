package com.aspose.slides.internal.t9p;

import java.io.IOException;
import java.io.OutputStream;

class l6$l6 extends OutputStream {
   private l6$l6() {
   }

   @Override
   public synchronized void write(int b) throws IOException {
      com.aspose.slides.internal.c9q.n5.n5(String.valueOf(b));
   }

   @Override
   public void write(byte[] b) throws IOException {
      com.aspose.slides.internal.c9q.n5.n5(new String(b));
   }

   @Override
   public synchronized void write(byte[] b, int off, int len) throws IOException {
      com.aspose.slides.internal.c9q.n5.n5(new String(b, off, len));
   }

   // $VF: synthetic method
   l6$l6(u3 var1) {
      this();
   }
}
