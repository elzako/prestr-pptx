package com.aspose.slides.internal.f8y;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.z0k.t4;
import java.io.IOException;
import java.io.OutputStream;

class a6$k5 extends t4 {
   private OutputStream n5;

   private a6$k5(OutputStream var1) {
      this.n5 = var1;
   }

   @Override
   public boolean canRead() {
      return false;
   }

   @Override
   public boolean canSeek() {
      return false;
   }

   @Override
   public boolean canWrite() {
      return true;
   }

   @Override
   public long getLength() {
      return 0L;
   }

   @Override
   public long getPosition() {
      return 0L;
   }

   @Override
   public void setPosition(long value) {
      throw new NotSupportedException();
   }

   @Override
   public void flush() {
      try {
         this.n5.flush();
      } catch (IOException var2) {
         throw new com.aspose.slides.exceptions.IOException("", var2);
      }
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      throw new NotSupportedException();
   }

   @Override
   public long seek(long offset, int origin) {
      throw new NotSupportedException();
   }

   @Override
   public void setLength(long value) {
      throw new NotSupportedException();
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      try {
         this.n5.write(buffer, offset, count);
      } catch (IOException var5) {
         throw new com.aspose.slides.exceptions.IOException("", var5);
      }
   }

   // $VF: synthetic method
   a6$k5(OutputStream var1, u9 var2) {
      this(var1);
   }
}
