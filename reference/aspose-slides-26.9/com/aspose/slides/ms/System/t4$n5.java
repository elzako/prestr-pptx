package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.NotSupportedException;
import java.io.IOException;
import java.io.InputStream;

class t4$n5 extends com.aspose.slides.internal.z0k.t4 {
   private InputStream n5;

   private t4$n5(InputStream var1) {
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

   // Restored original synthetic constructor delegation: (Ljava/io/InputStream;Lcom/aspose/slides/ms/System/q0;)V -> (Ljava/io/InputStream;)V
   t4$n5(java.io.InputStream recoveredArg0, com.aspose.slides.ms.System.q0 recoveredArg1) {
      this(recoveredArg0);
   }
}
