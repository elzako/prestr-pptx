package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.d1;

public class h2 extends com.aspose.slides.internal.z0k.t4 {
   private boolean n5;
   private boolean l6;
   private com.aspose.slides.internal.z0k.e2 k5;
   private byte[] u3;

   public boolean n5() {
      return this.getPosition() >= this.getLength();
   }

   @Override
   public boolean canWrite() {
      return this.l6;
   }

   @Override
   public boolean canRead() {
      return this.n5;
   }

   @Override
   public boolean canSeek() {
      return this.k5.canSeek();
   }

   @Override
   public long getPosition() {
      return this.k5.getPosition();
   }

   @Override
   public void setPosition(long value) {
      this.k5.setPosition(value);
   }

   @Override
   public long getLength() {
      return this.k5.getLength();
   }

   public h2() {
      this.k5 = new com.aspose.slides.internal.z0k.e2(0);
      this.n5 = false;
      this.l6 = true;
   }

   public h2(byte[] var1) {
      if (var1 != null) {
         this.k5 = new com.aspose.slides.internal.z0k.e2(var1);
      } else {
         this.k5 = new com.aspose.slides.internal.z0k.e2();
      }

      this.n5 = true;
      this.l6 = false;
   }

   private byte[] u3(int var1) {
      if (var1 > 4) {
         throw new ArgumentException("8 bytes maximum");
      }

      if (this.u3 == null) {
         this.u3 = new byte[4];
      }

      if (this.read(this.u3, 0, var1) != var1) {
         throw new n5(d1.n5("buffer underrun", new Object[]{}));
      } else {
         return this.u3;
      }
   }

   public byte l6() {
      byte[] var1 = this.u3(1);
      return var1[0];
   }

   public short k5() {
      byte[] var1 = this.u3(2);
      return com.aspose.slides.internal.v6g.k5.l6(com.aspose.slides.internal.v6g.k5.u3(var1[0], 6) << 8 | com.aspose.slides.internal.v6g.k5.u3(var1[1], 6), 9);
   }

   public int u3() {
      byte[] var1 = this.u3(3);
      return com.aspose.slides.internal.v6g.k5.u3(var1[0], 6) << 16
         | com.aspose.slides.internal.v6g.k5.u3(var1[1], 6) << 8
         | com.aspose.slides.internal.v6g.k5.u3(var1[2], 6);
   }

   public byte[] n5(int var1) {
      byte[] var2 = new byte[var1];
      if (this.read(var2, 0, var1) != var1) {
         throw new n5("buffer underrun");
      } else {
         return var2;
      }
   }

   public void n5(byte var1) {
      if (this.u3 == null) {
         this.u3 = new byte[4];
      }

      this.u3[0] = var1;
      this.write(this.u3, 0, 1);
   }

   public void n5(short var1) {
      if (this.u3 == null) {
         this.u3 = new byte[4];
      }

      this.u3[0] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1 >> 8), 9);
      this.u3[1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1), 7);
      this.write(this.u3, 0, 2);
   }

   public void l6(int var1) {
      if (this.u3 == null) {
         this.u3 = new byte[4];
      }

      this.u3[0] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1 >> 16), 9);
      this.u3[1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1 >> 8), 9);
      this.u3[2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1), 9);
      this.write(this.u3, 0, 3);
   }

   public void k5(int var1) {
      if (this.u3 == null) {
         this.u3 = new byte[4];
      }

      this.u3[0] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1 >> 24), 9);
      this.u3[1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1 >> 16), 9);
      this.u3[2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1 >> 8), 9);
      this.u3[3] = com.aspose.slides.internal.v6g.k5.n5((Object)(var1), 9);
      this.write(this.u3, 0, 4);
   }

   public void n5(byte[] var1) {
      this.write(var1, 0, var1.length);
   }

   public void a6() {
      this.k5.setLength(0L);
      this.k5.setPosition(0L);
   }

   public byte[] u9() {
      return this.k5.toArray();
   }

   @Override
   public void flush() {
      this.k5.flush();
   }

   @Override
   public void setLength(long length) {
      this.k5.setLength(length);
   }

   @Override
   public long seek(long offset, int loc) {
      return this.k5.seek(offset, loc);
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (this.n5) {
         return this.k5.read(buffer, offset, count);
      } else {
         throw new InvalidOperationException("Read operations are not allowed by this stream");
      }
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      if (this.l6) {
         this.k5.write(buffer, offset, count);
      } else {
         throw new InvalidOperationException("Write operations are not allowed by this stream");
      }
   }
}
