package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j3;

@j3
public class l6 implements IDisposable {
   public static l6 n5 = new l6();
   protected t4 l6;
   private com.aspose.slides.internal.l7h.j5 k5;
   private byte[] u3;
   private byte[] a6;
   private int u9;
   private boolean h0;

   protected l6() {
      this(t4.Null, com.aspose.slides.internal.l7h.j5.z3());
   }

   public l6(t4 var1) {
      this(var1, com.aspose.slides.internal.l7h.j5.z3());
   }

   public l6(t4 var1, com.aspose.slides.internal.l7h.j5 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("output");
      }

      if (var2 == null) {
         throw new ArgumentNullException("encoding");
      }

      if (!var1.canWrite()) {
         throw new ArgumentException("Stream does not support writing or already closed.");
      }

      this.l6 = var1;
      this.k5 = var2;
      this.u3 = new byte[16];
   }

   public t4 n5() {
      this.k5();
      return this.l6;
   }

   public void l6() {
      this.n5(true);
   }

   @Override
   public void dispose() {
      this.n5(true);
   }

   protected void n5(boolean var1) {
      if (var1 && this.l6 != null) {
         this.l6.close();
      }

      this.u3 = null;
      this.k5 = null;
      this.h0 = true;
   }

   public void k5() {
      this.l6.flush();
   }

   public long n5(int var1, int var2) {
      if (this.h0) {
         throw new ObjectDisposedException("BinaryWriter", "Cannot seek a closed BinaryWriter");
      } else {
         return this.l6.seek(var1, var2);
      }
   }

   public void l6(boolean var1) {
      if (this.h0) {
         throw new ObjectDisposedException("BinaryWriter", "Cannot write to a closed BinaryWriter");
      }

      this.u3[0] = (byte)(var1 ? 1 : 0);
      this.l6.write(this.u3, 0, 1);
   }

   public void n5(byte var1) {
      this.u3[0] = var1;
      this.l6.write(this.u3, 0, 1);
   }

   public void n5(byte[] var1, int var2, int var3) {
      if (this.h0) {
         throw new ObjectDisposedException("BinaryWriter", "Cannot write to a closed BinaryWriter");
      }

      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      this.l6.write(var1, var2, var3);
   }

   public void n5(byte[] var1) {
      this.l6.write(var1, 0, var1.length);
   }

   public void n5(char var1) {
      if (this.h0) {
         throw new ObjectDisposedException("BinaryWriter", "Cannot write to a closed BinaryWriter");
      }

      char[] var2 = new char[]{var1};
      byte[] var3 = this.k5.l6(var2, 0, 1);
      this.l6.write(var3, 0, var3.length);
   }

   public void n5(char[] var1) {
      if (this.h0) {
         throw new ObjectDisposedException("BinaryWriter", "Cannot write to a closed BinaryWriter");
      }

      if (var1 == null) {
         throw new ArgumentNullException("chars");
      }

      byte[] var2 = this.k5.l6(var1, 0, var1.length);
      this.l6.write(var2, 0, var2.length);
   }

   public void n5(short var1) {
      this.u3[0] = (byte)var1;
      this.u3[1] = (byte)(var1 >> 8);
      this.l6.write(this.u3, 0, 2);
   }

   public void n5(int var1) {
      this.n5((short)var1);
   }

   public void l6(int var1) {
      if (this.h0) {
         throw new ObjectDisposedException("BinaryWriter", "Cannot write to a closed BinaryWriter");
      }

      this.u3[0] = (byte)var1;
      this.u3[1] = (byte)(var1 >> 8);
      this.u3[2] = (byte)(var1 >> 16);
      this.u3[3] = (byte)(var1 >> 24);
      this.l6.write(this.u3, 0, 4);
   }

   public void n5(long var1) {
      this.l6((int)var1);
   }

   public void l6(long var1) {
      this.n5(var1 & 4294967295L);
      this.n5(var1 >> 32);
   }

   public void k5(long var1) {
      this.n5(var1 & 4294967295L);
      this.n5(var1 >>> 32);
   }

   public void n5(float var1) {
      this.l6(Float.floatToIntBits(var1));
   }

   public void n5(double var1) {
      this.l6(Double.doubleToLongBits(var1));
   }

   public void n5(com.aspose.slides.ms.System.c4 var1) {
      int[] var2 = com.aspose.slides.ms.System.c4.n5(var1);
      byte[] var3 = new byte[]{
         (byte)var2[0],
         (byte)(var2[0] >> 8),
         (byte)(var2[0] >> 16),
         (byte)(var2[0] >> 24),
         (byte)var2[1],
         (byte)(var2[1] >> 8),
         (byte)(var2[1] >> 16),
         (byte)(var2[1] >> 24),
         (byte)var2[2],
         (byte)(var2[2] >> 8),
         (byte)(var2[2] >> 16),
         (byte)(var2[2] >> 24),
         (byte)var2[3],
         (byte)(var2[3] >> 8),
         (byte)(var2[3] >> 16),
         (byte)(var2[3] >> 24)
      };
      this.l6.write(var3, 0, 16);
   }

   public void n5(String var1) {
      if (this.h0) {
         throw new ObjectDisposedException("BinaryWriter", "Cannot write to a closed BinaryWriter");
      }

      int var2 = this.k5.n5(var1);
      this.k5(var2);
      if (this.a6 == null) {
         this.a6 = new byte[512];
         this.u9 = 512 / this.k5.n5(1);
      }

      int var3 = 0;
      int var4 = var1.length();

      while (var4 > 0) {
         int var5 = var4 > this.u9 ? this.u9 : var4;
         int var6 = this.k5.n5(var1, var3, var5, this.a6, 0);
         this.l6.write(this.a6, 0, var6);
         var3 += var5;
         var4 -= var5;
      }
   }

   protected void k5(int var1) {
      do {
         int var2 = var1 >> 7 & 33554431;
         byte var3 = (byte)(var1 & 127);
         if (var2 != 0) {
            var3 = (byte)(var3 & 0xFF | 128);
         }

         this.n5(var3);
         var1 = var2;
      } while (var1 != 0);
   }
}
