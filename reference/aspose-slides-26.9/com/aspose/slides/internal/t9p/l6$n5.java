package com.aspose.slides.internal.t9p;

import com.aspose.slides.ms.System.p8;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class l6$n5 extends BufferedOutputStream {
   private char[] n5 = p8.n5.toCharArray();
   private int l6 = this.n5.length - 1;
   private int k5 = -1;
   private boolean u3 = false;

   public l6$n5(OutputStream var1) {
      super(var1);
   }

   @Override
   public synchronized void write(int b) throws IOException {
      this.n5(b);
      if (this.k5 == this.l6) {
         this.k5 = -1;
         this.u3 = true;
         this.flush();
      } else {
         super.write(b);
      }
   }

   private void n5(int var1) {
      this.k5 = var1 == this.n5[this.k5 + 1] ? this.k5 + 1 : -1;
   }

   @Override
   public synchronized void write(byte[] b, int off, int len) throws IOException {
      while (--len >= 0) {
         this.write(b[off++]);
      }
   }

   @Override
   public synchronized void flush() throws IOException {
      if (this.u3) {
         this.u3 = false;
         super.flush();
      }
   }

   @Override
   public void close() throws IOException {
      this.u3 = true;
      super.close();
   }
}
