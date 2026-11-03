package com.aspose.slides.internal.y5s;

import com.aspose.slides.ms.System.q1;

final class a6$n5 extends com.aspose.slides.internal.z0k.t4 {
   private int n5;
   private long l6;
   private com.aspose.slides.internal.z0k.t4 k5;

   public a6$n5(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      this.k5 = var1;
      this.n5 = var2;
      this.l6 = this.k5.getLength();
   }

   public int n5() {
      return this.n5;
   }

   public long l6() {
      return this.l6;
   }

   @Override
   public long getLength() {
      return this.k5.getLength();
   }

   @Override
   public boolean canRead() {
      return this.k5.canRead();
   }

   @Override
   public boolean canSeek() {
      return this.k5.canSeek();
   }

   @Override
   public boolean canWrite() {
      return this.k5.canWrite();
   }

   @Override
   public long getPosition() {
      return this.k5.getPosition();
   }

   @Override
   public void setPosition(long value) {
      this.k5.setPosition(value);
   }

   public void n5(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      this.k5();
      this.k5 = var1;
      this.n5 = var2;
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      int var4 = 0;
      if (buffer != null && offset >= 0 && count >= 0 && offset + count <= buffer.length) {
         var4 = count;
      }

      long var5 = q1.n5(this.getPosition() + var4, this.getLength());
      a6.n5(this, var5);
      this.k5.write(buffer, offset, count);
      this.l6 = var5;
   }

   @Override
   public void writeByte(byte value) {
      long var2 = q1.n5(this.getPosition() + 1L, this.getLength());
      a6.n5(this, var2);
      this.k5.writeByte(value);
      this.l6 = var2;
   }

   @Override
   public void flush() {
      this.k5.flush();
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      return this.k5.read(buffer, offset, count);
   }

   @Override
   public long seek(long offset, int origin) {
      return this.k5.seek(offset, origin);
   }

   @Override
   public void setLength(long value) {
      if (value != this.k5.getLength()) {
         a6.n5(this, value);
         this.k5.setLength(value);
         this.l6 = value;
      }
   }

   @Override
   protected void dispose(boolean disposing) {
      if (disposing) {
         try {
            this.k5();
         } finally {
            a6.n5(this);
         }
      }

      super.dispose(disposing);
   }

   private void k5() {
      this.k5.dispose();
   }
}
