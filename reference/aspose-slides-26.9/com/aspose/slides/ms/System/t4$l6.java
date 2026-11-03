package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.NotSupportedException;
import java.io.PrintStream;

class t4$l6 extends com.aspose.slides.internal.z0k.t4 {
   private PrintStream n5;

   private t4$l6(PrintStream var1) {
      this.n5 = var1;
   }

   @Override
   public boolean canRead() {
      return false;
   }

   @Override
   public boolean canSeek() {
      return true;
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
      return 1L;
   }

   @Override
   public void setPosition(long value) {
      throw new NotSupportedException();
   }

   @Override
   public void flush() {
      this.n5.flush();
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
      this.n5.write(buffer, offset, count);
   }

   // Restored original synthetic constructor delegation: (Ljava/io/PrintStream;Lcom/aspose/slides/ms/System/q0;)V -> (Ljava/io/PrintStream;)V
   t4$l6(java.io.PrintStream recoveredArg0, com.aspose.slides.ms.System.q0 recoveredArg1) {
      this(recoveredArg0);
   }
}
