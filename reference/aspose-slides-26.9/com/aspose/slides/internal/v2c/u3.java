package com.aspose.slides.internal.v2c;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class u3 implements DataInput, DataOutput {
   protected String n5;
   protected RandomAccessFile l6;
   protected long k5;
   protected byte[] u3;
   protected long a6;
   protected long u9;
   protected int h0;
   protected boolean c8;
   protected boolean t2;
   protected boolean s7;
   boolean x8 = false;
   private long y4 = 0L;
   boolean n3 = false;

   public u3(String var1, String var2) {
      this(var1, var2, 8092);
      this.n5 = var1;
   }

   public u3(String var1, String var2, int var3) {
      this.n5 = var1;

      try {
         this.l6 = new RandomAccessFile(var1, var2);
      } catch (FileNotFoundException var5) {
         throw new com.aspose.slides.exceptions.FileNotFoundException("File not found File: " + var1, var1, var5);
      }

      this.t2 = var2.equals("r");
      this.n5(var3);
   }

   public u3(File var1, String var2) {
      this(var1.getPath(), var2);
   }

   public u3(File var1, String var2, int var3) {
      this(var1.getPath(), var2, var3);
   }

   public void n5(boolean var1) {
      this.t2 = var1;
   }

   private void n5(int var1) {
      this.a6 = 0L;
      this.u9 = 0L;
      this.h0 = 0;
      this.k5 = 0L;
      this.u3 = new byte[var1];
      this.c8 = false;
   }

   public void n5() {
      if (this.l6 != null) {
         this.a6();
         long var1 = 0L;

         try {
            var1 = this.l6.length();
            if (!this.t2 && this.y4 != 0L && this.y4 != var1) {
               this.l6.setLength(this.y4);
            }

            this.l6.close();
            this.l6 = null;
         } catch (IOException var4) {
            throw new com.aspose.slides.exceptions.IOException("exception", var4);
         }
      }
   }

   public boolean l6() {
      return this.l6 == null;
   }

   public void n5(long var1) {
      this.c8 = false;
      if (var1 >= this.a6 && var1 < this.u9) {
         this.k5 = var1;
      } else {
         this.l6(var1);
      }
   }

   protected void l6(long var1) {
      if (this.x8) {
         this.a6();
      }

      this.a6 = var1;
      this.k5 = var1;
      this.h0 = this.n5(var1, this.u3, 0, this.u3.length);
      if (this.h0 <= 0) {
         this.h0 = 0;
         this.c8 = true;
      } else {
         this.c8 = false;
      }

      this.u9 = this.a6 + this.h0;
   }

   public long k5() {
      return this.k5;
   }

   public long u3() {
      long var1 = 0L;

      try {
         var1 = this.l6.length();
      } catch (IOException var4) {
         throw new com.aspose.slides.exceptions.IOException("exception", var4);
      }

      return var1 < this.u9 ? this.u9 : var1;
   }

   public void a6() {
      if (this.x8) {
         try {
            this.l6.seek(this.a6);
            this.l6.write(this.u3, 0, this.h0);
         } catch (IOException var2) {
            throw new com.aspose.slides.exceptions.IOException("exception", var2);
         }

         this.x8 = false;
      }
   }

   public int u9() {
      if (this.k5 < this.u9) {
         int var1 = (int)(this.k5 - this.a6);
         this.k5++;
         return this.u3[var1] & 0xFF;
      }

      if (this.c8) {
         return -1;
      }

      this.n5(this.k5);
      return this.u9();
   }

   protected int n5(byte[] var1, int var2, int var3) {
      if (this.c8) {
         return -1;
      }

      int var4 = (int)(this.u9 - this.k5);
      if (var4 < 1) {
         this.n5(this.k5);
         return this.n5(var1, var2, var3);
      }

      int var5 = var4 >= var3 ? var3 : var4;
      System.arraycopy(this.u3, (int)(this.k5 - this.a6), var1, var2, var5);
      this.k5 += var5;
      if (var5 < var3) {
         int var6 = var3 - var5;
         if (var6 > this.u3.length) {
            var6 = this.n5(this.k5, var1, var2 + var5, var3 - var5);
         } else {
            this.n5(this.k5);
            if (!this.c8) {
               var6 = var6 > this.h0 ? this.h0 : var6;
               System.arraycopy(this.u3, 0, var1, var2 + var5, var6);
            } else {
               var6 = -1;
            }
         }

         if (var6 > 0) {
            this.k5 += var6;
            return var5 + var6;
         }
      }

      return var5;
   }

   protected int n5(long var1, byte[] var3, int var4, int var5) {
      int var6 = 0;

      try {
         this.l6.seek(var1);
         var6 = this.l6.read(var3, var4, var5);
      } catch (IOException var8) {
         throw new com.aspose.slides.exceptions.IOException("exception", var8);
      }

      if (this.n3 && var6 < var5) {
         var6 = var5;
      }

      return var6;
   }

   public int l6(byte[] var1, int var2, int var3) {
      return this.n5(var1, var2, var3);
   }

   @Override
   public final void readFully(byte[] b) {
      this.readFully(b, 0, b.length);
   }

   @Override
   public final void readFully(byte[] b, int off, int len) {
      int var4 = 0;

      while (var4 < len) {
         int var5 = this.l6(b, off + var4, len - var4);
         if (var5 < 0) {
            throw new RuntimeException();
         }

         var4 += var5;
      }
   }

   @Override
   public int skipBytes(int n) {
      this.n5(this.k5() + n);
      return n;
   }

   @Override
   public void write(int b) {
      if (this.k5 < this.u9) {
         int var2 = (int)(this.k5 - this.a6);
         this.u3[var2] = (byte)b;
         this.x8 = true;
         this.k5++;
      } else if (this.h0 != this.u3.length) {
         int var3 = (int)(this.k5 - this.a6);
         this.u3[var3] = (byte)b;
         this.x8 = true;
         this.k5++;
         this.h0++;
         this.u9++;
      } else {
         this.n5(this.k5);
         this.write(b);
      }
   }

   public void k5(byte[] var1, int var2, int var3) {
      if (var3 < this.u3.length) {
         int var4 = 0;
         int var5 = 0;
         if (this.k5 >= this.a6) {
            var4 = (int)(this.a6 + this.u3.length - this.k5);
         }

         if (var4 > 0) {
            var5 = var4 > var3 ? var3 : var4;
            System.arraycopy(var1, var2, this.u3, (int)(this.k5 - this.a6), var5);
            this.x8 = true;
            long var6 = this.k5 + var5;
            this.u9 = var6 > this.u9 ? var6 : this.u9;
            this.h0 = (int)(this.u9 - this.a6);
            this.k5 += var5;
         }

         if (var5 < var3) {
            this.n5(this.k5);
            System.arraycopy(var1, var2 + var5, this.u3, (int)(this.k5 - this.a6), var3 - var5);
            this.x8 = true;
            long var9 = this.k5 + (var3 - var5);
            this.u9 = var9 > this.u9 ? var9 : this.u9;
            this.h0 = (int)(this.u9 - this.a6);
            this.k5 += var3 - var5;
         }
      } else {
         if (this.x8) {
            this.a6();
         }

         try {
            this.l6.seek(this.k5);
            this.l6.write(var1, var2, var3);
            this.k5 += var3;
            this.a6 = this.k5;
            this.h0 = 0;
            this.u9 = this.a6 + this.h0;
         } catch (IOException var8) {
            throw new com.aspose.slides.exceptions.IOException("exception", var8);
         }
      }
   }

   @Override
   public void write(byte[] b) {
      this.k5(b, 0, b.length);
   }

   @Override
   public void write(byte[] b, int off, int len) {
      this.k5(b, off, len);
   }

   @Override
   public final boolean readBoolean() {
      int var1 = this.u9();
      if (var1 < 0) {
         throw new RuntimeException();
      } else {
         return var1 != 0;
      }
   }

   @Override
   public final byte readByte() {
      int var1 = this.u9();
      if (var1 < 0) {
         throw new RuntimeException();
      } else {
         return (byte)var1;
      }
   }

   @Override
   public final int readUnsignedByte() {
      int var1 = this.u9();
      if (var1 < 0) {
         throw new RuntimeException();
      } else {
         return var1;
      }
   }

   @Override
   public final short readShort() {
      int var1 = this.u9();
      int var2 = this.u9();
      if ((var1 | var2) < 0) {
         throw new RuntimeException();
      } else {
         return this.s7 ? (short)((var1 << 8) + var2) : (short)((var2 << 8) + var1);
      }
   }

   @Override
   public final int readUnsignedShort() {
      int var1 = this.u9();
      int var2 = this.u9();
      if ((var1 | var2) < 0) {
         throw new RuntimeException();
      } else {
         return this.s7 ? (var1 << 8) + var2 : (var2 << 8) + var1;
      }
   }

   @Override
   public final char readChar() {
      int var1 = this.u9();
      int var2 = this.u9();
      if ((var1 | var2) < 0) {
         throw new RuntimeException();
      } else {
         return this.s7 ? (char)((var1 << 8) + var2) : (char)((var2 << 8) + var1);
      }
   }

   @Override
   public final int readInt() {
      int var1 = this.u9();
      int var2 = this.u9();
      int var3 = this.u9();
      int var4 = this.u9();
      if ((var1 | var2 | var3 | var4) < 0) {
         throw new RuntimeException();
      } else {
         return this.s7 ? (var1 << 24) + (var2 << 16) + (var3 << 8) + var4 : (var4 << 24) + (var3 << 16) + (var2 << 8) + var1;
      }
   }

   @Override
   public final long readLong() {
      return this.s7 ? ((long)this.readInt() << 32) + (this.readInt() & 4294967295L) : (this.readInt() & 4294967295L) + ((long)this.readInt() << 32);
   }

   @Override
   public final float readFloat() {
      return Float.intBitsToFloat(this.readInt());
   }

   @Override
   public final double readDouble() {
      return Double.longBitsToDouble(this.readLong());
   }

   @Override
   public final String readLine() {
      StringBuffer var1 = new StringBuffer();
      int var2 = -1;
      boolean var3 = false;

      while (!var3) {
         switch (var2 = this.u9()) {
            case -1:
            case 10:
               var3 = true;
               break;
            case 13:
               var3 = true;
               long var4 = this.k5();
               if (this.u9() != 10) {
                  this.n5(var4);
               }
               break;
            default:
               var1.append((char)var2);
         }
      }

      return var2 == -1 && var1.length() == 0 ? null : var1.toString();
   }

   @Override
   public final String readUTF() {
      try {
         return DataInputStream.readUTF(this);
      } catch (IOException var2) {
         throw new com.aspose.slides.exceptions.IOException("exception", var2);
      }
   }

   @Override
   public final void writeBoolean(boolean v) {
      this.write(v ? 1 : 0);
   }

   @Override
   public final void writeByte(int v) {
      this.write(v);
   }

   @Override
   public final void writeShort(int v) {
      this.write(v >>> 8 & 0xFF);
      this.write(v & 0xFF);
   }

   @Override
   public final void writeChar(int v) {
      this.write(v >>> 8 & 0xFF);
      this.write(v & 0xFF);
   }

   @Override
   public final void writeInt(int v) {
      this.write(v >>> 24 & 0xFF);
      this.write(v >>> 16 & 0xFF);
      this.write(v >>> 8 & 0xFF);
      this.write(v & 0xFF);
   }

   @Override
   public final void writeLong(long v) {
      this.write((int)(v >>> 56) & 0xFF);
      this.write((int)(v >>> 48) & 0xFF);
      this.write((int)(v >>> 40) & 0xFF);
      this.write((int)(v >>> 32) & 0xFF);
      this.write((int)(v >>> 24) & 0xFF);
      this.write((int)(v >>> 16) & 0xFF);
      this.write((int)(v >>> 8) & 0xFF);
      this.write((int)v & 0xFF);
   }

   @Override
   public final void writeFloat(float v) {
      this.writeInt(Float.floatToIntBits(v));
   }

   @Override
   public final void writeDouble(double v) {
      this.writeLong(Double.doubleToLongBits(v));
   }

   @Override
   public final void writeBytes(String s) {
      int var2 = s.length();

      for (int var3 = 0; var3 < var2; var3++) {
         this.write((byte)s.charAt(var3));
      }
   }

   @Override
   public final void writeChars(String s) {
      int var2 = s.length();

      for (int var3 = 0; var3 < var2; var3++) {
         char var4 = s.charAt(var3);
         this.write(var4 >>> '\b' & 0xFF);
         this.write(var4 & 255);
      }
   }

   @Override
   public final void writeUTF(String str) {
      int var2 = str.length();
      int var3 = 0;

      for (int var4 = 0; var4 < var2; var4++) {
         char var5 = str.charAt(var4);
         if (var5 >= 1 && var5 <= 127) {
            var3++;
         } else if (var5 > 2047) {
            var3 += 3;
         } else {
            var3 += 2;
         }
      }

      if (var3 > 65535) {
         throw new RuntimeException();
      }

      this.write(var3 >>> 8 & 0xFF);
      this.write(var3 & 0xFF);

      for (int var6 = 0; var6 < var2; var6++) {
         char var7 = str.charAt(var6);
         if (var7 >= 1 && var7 <= 127) {
            this.write(var7);
         } else if (var7 > 2047) {
            this.write(224 | var7 >> '\f' & 15);
            this.write(128 | var7 >> 6 & 63);
            this.write(128 | var7 & 63);
         } else {
            this.write(192 | var7 >> 6 & 31);
            this.write(128 | var7 & 63);
         }
      }
   }

   @Override
   public String toString() {
      return "fp="
         + this.k5
         + ", bs="
         + this.a6
         + ", de="
         + this.u9
         + ", ds="
         + this.h0
         + ", bl="
         + this.u3.length
         + ", readonly="
         + this.t2
         + ", bm="
         + this.x8;
   }

   public void k5(long var1) {
      if (this.x8) {
         this.a6();
      }

      try {
         this.l6.setLength(var1);
      } catch (IOException var4) {
         throw new com.aspose.slides.exceptions.IOException("exception", var4);
      }

      if (this.k5 > var1) {
         this.n5(var1);
      }
   }
}
