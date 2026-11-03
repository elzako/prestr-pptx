package com.aspose.slides.internal.q8;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.u3;
import com.aspose.slides.ms.System.y4;

public class l6 extends t4 {
   private final t4 n5;
   private final byte[] l6;
   private int k5;
   private long u3;

   public l6(t4 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("sourceStream");
      }

      this.n5 = var1;
      this.l6 = this.n5(var1, var2);
      this.u3 = 0L;
   }

   @Override
   public void flush() {
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

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (this.u3 >= this.n5().length) {
         return this.n5.read(buffer, offset, count);
      } else {
         long var4 = this.n5().length - this.u3;
         if (var4 >= count) {
            y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5())), (int)this.u3, com.aspose.slides.ms.System.u3.n5((Object)(buffer)), 0, count);
            this.u3 += count;
            return count;
         } else {
            long var6 = this.n5().length - this.u3;
            long var8 = count - var6;
            byte[] var10 = new byte[(int)var6];
            y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5())), (int)this.u3, com.aspose.slides.ms.System.u3.n5((Object)(var10)), 0, (int)var6);
            byte[] var11 = new byte[(int)var8];
            int var12 = this.n5.read(var11, 0, (int)var8);
            y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var10)), 0, com.aspose.slides.ms.System.u3.n5((Object)(buffer)), offset, var10.length);
            y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var11)), 0, com.aspose.slides.ms.System.u3.n5((Object)(buffer)), offset + var10.length, var12);
            this.u3 = this.n5().length;
            return (int)(var6 + var12);
         }
      }
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      throw new NotImplementedException();
   }

   @Override
   public boolean canRead() {
      throw new NotImplementedException();
   }

   @Override
   public boolean canSeek() {
      return false;
   }

   @Override
   public boolean canWrite() {
      throw new NotImplementedException();
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

   public final byte[] n5() {
      return this.l6;
   }

   private byte[] n5(t4 var1, int var2) {
      byte[] var3 = new byte[var2];
      this.k5 = var1.read(var3, 0, var2);
      byte[] var4 = new byte[this.k5];
      y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, this.k5);
      return var4;
   }
}
