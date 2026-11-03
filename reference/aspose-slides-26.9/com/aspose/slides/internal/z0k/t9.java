package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.NotSupportedException;

class t9 extends t4 {
   public t9() {
   }

   @Override
   public boolean canRead() {
      return true;
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
      return 0L;
   }

   @Override
   public void setPosition(long value) {
      throw new NotSupportedException("The NullStream does not support setPosition operation.");
   }

   @Override
   public void flush() {
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      return 0;
   }

   @Override
   public int readByte() {
      return -1;
   }

   @Override
   public long seek(long offset, int origin) {
      return 0L;
   }

   @Override
   public void setLength(long value) {
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
   }

   @Override
   public void writeByte(byte value) {
   }
}
