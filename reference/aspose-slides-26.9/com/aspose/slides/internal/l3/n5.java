package com.aspose.slides.internal.l3;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.z0k.t4;

public class n5 extends t4 {
   protected final t4 n5;

   public n5(t4 var1) {
      this.n5 = var1;
   }

   @Override
   public void flush() {
   }

   @Override
   public void close() {
   }

   @Override
   public long seek(long offset, int origin) {
      throw new InvalidOperationException();
   }

   @Override
   public void setLength(long value) {
      throw new InvalidOperationException();
   }

   @Override
   public int readByte() {
      throw new InvalidOperationException();
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      throw new InvalidOperationException();
   }

   @Override
   public void writeByte(byte value) {
      throw new InvalidOperationException();
   }

   @Override
   public void write(byte[] srcBuffer, int srcOffset, int srcCount) {
      this.n5.write(srcBuffer, srcOffset, srcCount);
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
      return this.n5.getLength();
   }

   @Override
   public long getPosition() {
      return this.n5.getPosition();
   }

   @Override
   public void setPosition(long value) {
      throw new InvalidOperationException();
   }
}
