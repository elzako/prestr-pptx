package com.aspose.slides.internal.f8y;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.z0k.t4;
import java.io.IOException;
import java.io.InputStream;

class a6$l6 extends t4 {
   private InputStream n5;

   private a6$l6(InputStream var1) {
      this.n5 = var1;
   }

   @Override
   public boolean canRead() {
      return true;
   }

   @Override
   public boolean canSeek() {
      return false;
   }

   @Override
   public boolean canWrite() {
      return false;
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
      throw new NotSupportedException();
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      try {
         return this.n5.read(buffer, offset, count);
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }
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
      throw new NotSupportedException();
   }

   // $VF: synthetic method
   a6$l6(InputStream var1, u9 var2) {
      this(var1);
   }
}
