package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class n5 implements IDisposable {
   private t4 l6;
   private com.aspose.slides.internal.l7h.j5 k5;
   private byte[] u3;
   private com.aspose.slides.internal.l7h.u9 a6;
   private char[] u9;
   private byte[] h0;
   private boolean c8;
   // $VF: synthetic field
   static final boolean n5 = !n5.class.desiredAssertionStatus();

   public n5(t4 var1) {
      this(var1, com.aspose.slides.internal.l7h.j5.z3());
   }

   public n5(t4 var1, com.aspose.slides.internal.l7h.j5 var2) {
      if (var1 == null || var2 == null) {
         throw new ArgumentNullException("Input or Encoding is a null reference.");
      }

      if (!var1.canRead()) {
         throw new ArgumentException("The stream doesn't support reading.");
      }

      this.l6 = var1;
      this.k5 = var2;
      this.a6 = var2.l6();
      this.u3 = new byte[Math.max(16, var2.n5(1))];
   }

   public t4 x8() {
      return this.l6;
   }

   public void n3() {
      this.n5(true);
      this.c8 = true;
   }

   protected void n5(boolean var1) {
      if (var1 && this.l6 != null) {
         this.l6.close();
      }

      this.c8 = true;
      this.u3 = null;
      this.k5 = null;
      this.l6 = null;
      this.u9 = null;
   }

   @Override
   public void dispose() {
      this.n5(true);
   }

   protected void h0(int var1) {
      if (var1 > this.u3.length) {
         throw new ArgumentOutOfRangeException("numBytes");
      }

      if (this.c8) {
         throw new ObjectDisposedException("BinaryReader", "Cannot read from a closed BinaryReader.");
      }

      if (this.l6 == null) {
         throw new IOException("Stream is invalid");
      }

      int var2 = 0;

      while (var2 < var1) {
         int var3 = this.l6.read(this.u3, var2, var1 - var2);
         if (var3 == 0) {
            throw new EndOfStreamException();
         }

         var2 += var3;
      }
   }

   public int y4() {
      if (this.u9 == null) {
         this.u9 = new char[128];
      }

      int var1 = this.n5(this.u9, 0, 1);
      return var1 == 0 ? -1 : this.u9[0];
   }

   public int n5(byte[] var1, int var2, int var3) {
      if (this.l6 == null) {
         if (this.c8) {
            throw new ObjectDisposedException("BinaryReader", "Cannot read from a closed BinaryReader.");
         } else {
            throw new IOException("Stream is invalid");
         }
      } else if (var1 == null) {
         throw new ArgumentNullException("buffer is null");
      } else if (var2 < 0) {
         throw new ArgumentOutOfRangeException("index is less than 0");
      } else if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count is less than 0");
      } else if (var1.length - var2 < var3) {
         throw new ArgumentException("buffer is too small");
      } else {
         return this.l6.read(var1, var2, var3);
      }
   }

   public int n5(char[] var1, int var2, int var3) {
      if (this.l6 == null) {
         if (this.c8) {
            throw new ObjectDisposedException("BinaryReader", "Cannot read from a closed BinaryReader.");
         } else {
            throw new IOException("Stream is invalid");
         }
      } else {
         if (var1 == null) {
            throw new ArgumentNullException("buffer is null");
         }

         if (var2 < 0) {
            throw new ArgumentOutOfRangeException("index is less than 0");
         }

         if (var3 < 0) {
            throw new ArgumentOutOfRangeException("count is less than 0");
         }

         if (var1.length - var2 < var3) {
            throw new ArgumentException("buffer is too small");
         }

         int var4 = 0;
         int[] var5 = new int[]{0};
         int var6 = this.n5(var1, var2, var3, var5);
         var4 = var5[0];
         return var6;
      }
   }

   private int n5(char[] var1, int var2, int var3, int[] var4) {
      int var5 = 0;

      for (var4[0] = 0; var5 < var3; var5++) {
         int var6 = 0;

         int var8;
         do {
            this.n5(var6 + 1);
            int var7 = this.l6.readByte();
            if (var7 == -1) {
               return var5;
            }

            this.u3[var6++] = (byte)var7;
            var4[0]++;
            var8 = this.k5.n5(this.u3, 0, var6, var1, var2 + var5);
         } while (var8 == 1 && var1[var2 + var5] == '�' || var8 <= 0);
      }

      return var5;
   }

   protected int e2() {
      int var1 = 0;
      byte var2 = 0;

      int var3;
      for (var3 = 0; var3 < 5; var3++) {
         byte var4 = this.z1();
         var1 |= (var4 & 255 & 127) << var2;
         var2 += 7;
         if ((var4 & 255 & 128) == 0) {
            break;
         }
      }

      if (var3 < 5) {
         return var1;
      } else {
         throw new FormatException("Too many bytes in what should have been a 7 bit encoded Int32.");
      }
   }

   public boolean t9() {
      return this.z1() != 0;
   }

   public byte z1() {
      this.h0(1);
      return this.u3[0];
   }

   public byte t4() {
      this.h0(1);
      return this.u3[0];
   }

   public byte[] c8(int var1) {
      if (this.l6 == null) {
         if (this.c8) {
            throw new ObjectDisposedException("BinaryReader", "Cannot read from a closed BinaryReader.");
         } else {
            throw new IOException("Stream is invalid");
         }
      } else {
         if (var1 < 0) {
            throw new ArgumentOutOfRangeException("count is less than 0");
         }

         byte[] var2 = new byte[var1];
         int var3 = 0;

         while (var3 < var1) {
            int var4 = this.l6.read(var2, var3, var1 - var3);
            if (var4 == 0) {
               break;
            }

            var3 += var4;
         }

         if (var3 != var1) {
            byte[] var5 = new byte[var3];
            com.aspose.slides.ms.System.y4.n5(var2, 0, var5, 0, var3);
            return var5;
         } else {
            return var2;
         }
      }
   }

   public char q0() {
      char[] var1 = this.t2(1);
      assert var1.length == 1;
      return var1[0];
   }

   public char[] t2(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("count is less than 0");
      } else if (var1 == 0) {
         return new char[0];
      } else {
         char[] var2 = new char[var1];
         int var3 = this.n5(var2, 0, var1);
         if (var3 == 0) {
            throw new EndOfStreamException();
         } else if (var3 != var2.length) {
            char[] var4 = new char[var3];
            com.aspose.slides.ms.System.u3.n5(var2, 0, var4, 0, var3);
            return var4;
         } else {
            return var2;
         }
      }
   }

   public com.aspose.slides.ms.System.c4 z3() {
      this.h0(16);
      int var1 = this.u3[0] & 255 | (this.u3[1] & 255) << 8 | (this.u3[2] & 255) << 16 | (this.u3[3] & 255) << 24;
      int var2 = this.u3[4] & 255 | (this.u3[5] & 255) << 8 | (this.u3[6] & 255) << 16 | (this.u3[7] & 255) << 24;
      int var3 = this.u3[8] & 255 | (this.u3[9] & 255) << 8 | (this.u3[10] & 255) << 16 | (this.u3[11] & 255) << 24;
      int var4 = this.u3[12] & 255 | (this.u3[13] & 255) << 8 | (this.u3[14] & 255) << 16 | (this.u3[15] & 255) << 24;
      int[] var5 = new int[]{var1, var2, var3, var4};
      return new com.aspose.slides.ms.System.c4(var5);
   }

   public double m1() {
      return Double.longBitsToDouble(this.z8());
   }

   public short k7() {
      this.h0(2);
      return (short)(this.u3[0] & 0xFF | (this.u3[1] & 255) << 8);
   }

   public int m3() {
      this.h0(4);
      return this.u3[0] & 0xFF | (this.u3[1] & 0xFF) << 8 | (this.u3[2] & 0xFF) << 16 | (this.u3[3] & 0xFF) << 24;
   }

   public long z8() {
      long var1 = this.c4();
      long var3 = this.c4();
      return var3 << 32 | var1;
   }

   public String j5() {
      int var1 = this.e2();
      if (var1 < 0) {
         throw new IOException("Invalid binary file (string len < 0)");
      }

      if (var1 == 0) {
         return d1.n5;
      }

      if (this.h0 == null) {
         this.u9 = new char[this.k5.n5(128)];
         this.h0 = new byte[128];
      }

      a5 var2 = null;

      do {
         int var3 = Math.min(128, var1);
         int var4 = this.l6.read(this.h0, 0, var3);
         if (var4 == 0) {
            throw new EndOfStreamException();
         }

         int var5 = this.a6.n5(this.h0, 0, var4, this.u9, 0);
         if (var2 == null && var3 == var1) {
            return d1.n5(this.u9, 0, var5);
         }

         if (var2 == null) {
            var2 = new a5(var1);
         }

         var2.n5(this.u9, 0, var5);
         var1 -= var3;
      } while (var1 > 0);

      return var2.toString();
   }

   public float w1() {
      return Float.intBitsToFloat(this.m3());
   }

   public int r4() {
      this.h0(2);
      return this.u3[0] & 0xFF | (this.u3[1] & 0xFF) << 8;
   }

   public long c4() {
      return this.m3() & 4294967295L;
   }

   public long y2() {
      this.h0(8);
      long var1 = this.u3[0] & 0xFF | (this.u3[1] & 255) << 8 | (this.u3[2] & 255) << 16 | (this.u3[3] & 255) << 24;
      long var3 = this.u3[4] & 0xFF | (this.u3[5] & 255) << 8 | (this.u3[6] & 255) << 16 | (this.u3[7] & 255) << 24;
      return (var3 & 4294967295L) << 32 | var1 & 4294967295L;
   }

   private void n5(int var1) {
      if (this.u3.length <= var1) {
         byte[] var2 = new byte[var1];
         com.aspose.slides.ms.System.y4.n5(this.u3, 0, var2, 0, this.u3.length);
         this.u3 = var2;
      }
   }
}
