package com.aspose.slides.internal.e5a;

import com.aspose.slides.exceptions.InvalidOperationException;

public class c8 extends com.aspose.slides.internal.z0k.t4 {
   private com.aspose.slides.internal.z0k.t4 n5;
   private long l6;
   private long k5;

   public c8(com.aspose.slides.internal.z0k.t4 var1) {
      this.n5 = var1;
   }

   public final long n5() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 -= var1;
      if (this.l6 < 0L) {
         throw new InvalidOperationException();
      }

      if (com.aspose.slides.internal.v6g.k5.n5(this.n5, c8.class) != null) {
         ((c8)this.n5).n5(var1);
      }
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      int var4 = this.n5.read(buffer, offset, count);
      this.k5 += var4;
      return var4;
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      this.n5.write(buffer, offset, count);
      this.l6 += count;
   }

   @Override
   public boolean canRead() {
      return this.n5.canRead();
   }

   @Override
   public boolean canSeek() {
      return this.n5.canSeek();
   }

   @Override
   public boolean canWrite() {
      return this.n5.canWrite();
   }

   @Override
   public void flush() {
      this.n5.flush();
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
      this.n5.seek(value, 0);
   }

   @Override
   public long seek(long offset, int origin) {
      return this.n5.seek(offset, origin);
   }

   @Override
   public void setLength(long value) {
      this.n5.setLength(value);
   }
}
