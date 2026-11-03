package com.aspose.slides.internal.e5a;

import com.aspose.slides.exceptions.NotImplementedException;

public class r4 extends com.aspose.slides.internal.z0k.t4 {
   private c4 n5;
   private com.aspose.slides.internal.z0k.t4 l6;
   private int k5;

   public r4(com.aspose.slides.internal.z0k.t4 var1, c4 var2, int var3) {
      this.n5 = var2;
      this.l6 = var1;
      this.k5 = var3;
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (this.k5 == 0) {
         throw new NotImplementedException();
      }

      byte[] var4 = new byte[count];
      int var5 = this.l6.read(var4, 0, count);
      byte[] var6 = this.n5.n5(var4, var5);
      if (var5 >= 0) {
         System.arraycopy(var6, 0, buffer, offset + 0, var5);
      }

      return var5;
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      if (this.k5 == 1) {
         throw new NotImplementedException();
      }

      if (count != 0) {
         byte[] var4;
         if (offset != 0) {
            var4 = new byte[count];
            System.arraycopy(buffer, offset + 0, var4, 0, count);
         } else {
            var4 = buffer;
         }

         byte[] var5 = this.n5.l6(var4, count);
         this.l6.write(var5, 0, var5.length);
      }
   }

   @Override
   public boolean canRead() {
      return this.k5 == 1;
   }

   @Override
   public boolean canSeek() {
      return false;
   }

   @Override
   public boolean canWrite() {
      return this.k5 == 0;
   }

   @Override
   public void flush() {
   }

   @Override
   public long getLength() {
      throw new NotImplementedException();
   }

   @Override
   public long getPosition() {
      throw new NotImplementedException();
   }

   @Override
   public void setPosition(long value) {
      throw new NotImplementedException();
   }

   @Override
   public long seek(long offset, int origin) {
      throw new NotImplementedException();
   }

   @Override
   public void setLength(long value) {
      throw new NotImplementedException();
   }
}
