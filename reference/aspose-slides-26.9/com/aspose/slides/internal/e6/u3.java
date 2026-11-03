package com.aspose.slides.internal.e6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.z0k.t4;

public class u3 extends t4 {
   private IGenericEnumerator<t4> n5;
   private t4 l6;

   public u3(IGenericEnumerable<t4> var1) {
      this.n5 = var1.iterator();
      this.l6();
   }

   private void n5() {
      if (this.l6 != null) {
         this.l6.dispose();
      }

      this.l6();
   }

   private void l6() {
      if (this.n5.hasNext()) {
         this.l6 = this.n5.next();
         if (this.l6 == null) {
            String var1 = "The next stream in the collection has null pointer";
            throw new NullReferenceException(var1);
         }

         this.l6.seek(0L, 0);
      } else {
         this.l6 = null;
      }
   }

   @Override
   public boolean canRead() {
      return this.l6 == null ? false : this.l6.canRead();
   }

   @Override
   public boolean canSeek() {
      return this.l6 == null ? false : this.l6.canSeek();
   }

   @Override
   public boolean canWrite() {
      return false;
   }

   @Override
   public long getLength() {
      return this.l6 == null ? 0L : this.l6.getLength();
   }

   @Override
   public long getPosition() {
      return this.l6 == null ? 0L : this.l6.getPosition();
   }

   @Override
   public void setPosition(long value) {
      if (this.l6 != null) {
         this.l6.setPosition(value);
      }
   }

   @Override
   public void close() {
      while (this.l6 != null) {
         this.l6.close();
         this.l6();
      }
   }

   @Override
   public void flush() {
      throw new NotImplementedException();
   }

   @Override
   public int readByte() {
      while (this.l6 != null) {
         int var1 = this.l6.readByte();
         if (var1 != -1) {
            return var1;
         }

         this.n5();
      }

      return -1;
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (this.l6 == null) {
         return -1;
      }

      if (buffer == null) {
         throw new NullReferenceException();
      }

      if (offset < 0 || count < 0 || count > buffer.length - offset) {
         throw new IndexOutOfRangeException();
      }

      if (count == 0) {
         return 0;
      }

      do {
         int var4 = this.l6.read(buffer, offset, count);
         if (var4 > 0) {
            return var4;
         }

         this.n5();
      } while (this.l6 != null);

      return -1;
   }

   @Override
   public long seek(long offset, int origin) {
      return this.l6 == null ? 0L : this.l6.seek(offset, origin);
   }

   @Override
   public void setLength(long value) {
      throw new NotImplementedException();
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      throw new NotImplementedException();
   }
}
