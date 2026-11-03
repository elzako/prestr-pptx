package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

@j3
public class e2 extends t4 {
   private boolean a;
   private boolean b;
   private int c;
   private int d;
   private byte[] e;
   private int f;
   private boolean g;
   private boolean h;
   private int i;
   private int j;

   public e2() {
      this(0);
   }

   public e2(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("capacity");
      }

      this.a = true;
      this.c = var1;
      this.e = new byte[var1];
      this.g = true;
      this.b = true;
   }

   public e2(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      this.a(var1, 0, var1.length, true, false);
   }

   public e2(byte[] var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      this.a(var1, 0, var1.length, var2, false);
   }

   public e2(byte[] var1, int var2, int var3) {
      this.a(var1, var2, var3, true, false);
   }

   public e2(byte[] var1, int var2, int var3, boolean var4) {
      this.a(var1, var2, var3, var4, false);
   }

   public e2(byte[] var1, int var2, int var3, boolean var4, boolean var5) {
      this.a(var1, var2, var3, var4, var5);
   }

   private void a(byte[] var1, int var2, int var3, boolean var4, boolean var5) {
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var1.length - var2 < var3) {
            throw new ArgumentException("index+count", "The size of the buffer is less than index + count.");
         }

         this.a = var4;
         this.e = var1;
         this.c = var3 + var2;
         this.d = this.c;
         this.i = var2;
         this.f = var2;
         this.b = var5;
         this.g = false;
      } else {
         throw new ArgumentOutOfRangeException("index or count is less than 0.");
      }
   }

   private void a() {
      if (this.h) {
         throw new ObjectDisposedException("MemoryStream");
      }
   }

   @Override
   public boolean canRead() {
      return !this.h;
   }

   @Override
   public boolean canSeek() {
      return !this.h;
   }

   @Override
   public boolean canWrite() {
      return !this.h && this.a;
   }

   public int getCapacity() {
      this.a();
      return this.c - this.f;
   }

   public void setCapacity(int value) {
      this.a();
      if (!this.g) {
         throw new NotSupportedException("Cannot expand this MemoryStream");
      }

      if (value < 0 || value < this.d) {
         throw new ArgumentOutOfRangeException("value", d1.n5(new Object[]{"New capacity cannot be negative or less than the current capacity ", value, " ", this.c}));
      }

      if (this.e == null || value != this.e.length) {
         byte[] var2 = null;
         if (value != 0) {
            var2 = new byte[value];
            if (this.e != null) {
               System.arraycopy(this.e, 0, var2, 0, this.d);
            }
         }

         this.j = 0;
         this.e = var2;
         this.c = value;
      }
   }

   @Override
   public long getLength() {
      this.a();
      return this.d - this.f;
   }

   @Override
   public long getPosition() {
      this.a();
      return this.i - this.f;
   }

   @Override
   public void setPosition(long value) {
      this.a();
      if (value < 0L) {
         throw new ArgumentOutOfRangeException("value", "Position cannot be negative");
      }

      if (value > 2147483647L) {
         throw new ArgumentOutOfRangeException("value", "Position must be non-negative and less than 2^31 - 1 - origin");
      }

      this.i = this.f + (int)value;
   }

   @Override
   protected void dispose(boolean disposing) {
      this.h = true;
      this.g = false;
   }

   @Override
   public void flush() {
   }

   public byte[] getBuffer() {
      if (!this.b) {
         throw new IOException();
      } else {
         return this.e;
      }
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (buffer == null) {
         throw new ArgumentNullException("buffer");
      }

      if (offset >= 0 && count >= 0) {
         if (buffer.length - offset < count) {
            throw new ArgumentException("offset+count", "The size of the buffer is less than offset + count.");
         }

         this.a();
         if (this.i < this.d && count != 0) {
            if (this.i > this.d - count) {
               count = this.d - this.i;
            }

            System.arraycopy(this.e, this.i, buffer, offset, count);
            this.i += count;
            return count;
         } else {
            return 0;
         }
      } else {
         throw new ArgumentOutOfRangeException("offset or count less than zero.");
      }
   }

   @Override
   public int readByte() {
      this.a();
      return this.i >= this.d ? -1 : this.e[this.i++] & 0xFF;
   }

   @Override
   public long seek(long offset, int loc) {
      this.a();
      if (offset > 2147483647L) {
         throw new ArgumentOutOfRangeException(d1.n5(new Object[]{"Offset out of range. ", offset}));
      }

      int var4;
      switch (loc) {
         case 0:
            if (offset < 0L) {
               throw new IOException("Attempted to seek before start of MemoryStream.");
            }

            var4 = this.f;
            break;
         case 1:
            var4 = this.i;
            break;
         case 2:
            var4 = this.d;
            break;
         default:
            throw new ArgumentException("loc", "Invalid SeekOrigin");
      }

      var4 += (int)offset;
      if (var4 < this.f) {
         throw new IOException("Attempted to seek before start of MemoryStream.");
      }

      this.i = var4;
      return this.i;
   }

   private int a(int var1) {
      if (var1 < 256) {
         var1 = 256;
      }

      if (var1 < this.c * 2) {
         var1 = this.c * 2;
      }

      return var1;
   }

   private void b(int var1) {
      if (var1 > this.c) {
         this.setCapacity(this.a(var1));
      } else if (this.j > 0) {
         com.aspose.slides.ms.System.u3.n5(this.e, this.d, this.j);
         this.j = 0;
      }
   }

   @Override
   public void setLength(long value) {
      if (!this.g && value > this.c) {
         throw new NotSupportedException("Expanding this MemoryStream is not supported");
      }

      this.a();
      if (!this.a) {
         throw new NotSupportedException("Cannot write to this MemoryStream");
      }

      if (value >= 0L && value + this.f <= 2147483647L) {
         int var3 = (int)value + this.f;
         if (var3 > this.d) {
            this.b(var3);
         } else if (var3 < this.d) {
            this.j = this.j + (this.d - var3);
         }

         this.d = var3;
         if (this.i > this.d) {
            this.i = this.d;
         }
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   public byte[] toArray() {
      int var1 = this.d - this.f;
      byte[] var2 = new byte[var1];
      if (this.e != null) {
         System.arraycopy(this.e, this.f, var2, 0, var1);
      }

      return var2;
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      if (!this.a) {
         throw new NotSupportedException("Cannot write to this stream.");
      }

      if (buffer == null) {
         throw new ArgumentNullException("buffer");
      }

      if (offset >= 0 && count >= 0) {
         if (buffer.length - offset < count) {
            throw new ArgumentException("offset+count", "The size of the buffer is less than offset + count.");
         }

         this.a();
         if (this.i > this.d - count) {
            this.b(this.i + count);
         }

         System.arraycopy(buffer, offset, this.e, this.i, count);
         this.i += count;
         if (this.i >= this.d) {
            this.d = this.i;
         }
      } else {
         throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public void writeByte(byte value) {
      this.a();
      if (!this.a) {
         throw new NotSupportedException("Cannot write to this stream.");
      }

      if (this.i >= this.d) {
         this.b(this.i + 1);
         this.d = this.i + 1;
      }

      this.e[this.i++] = value;
   }

   public void writeTo(t4 stream) {
      this.a();
      if (stream == null) {
         throw new ArgumentNullException("stream");
      }

      stream.write(this.e, this.f, this.d - this.f);
   }

   public static e2 fromInputStream(InputStream input) throws java.io.IOException {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[4096];

      int var3;
      while (-1 != (var3 = input.read(var2))) {
         var1.write(var2, 0, var3);
      }

      return new e2(var1.toByteArray());
   }
}
