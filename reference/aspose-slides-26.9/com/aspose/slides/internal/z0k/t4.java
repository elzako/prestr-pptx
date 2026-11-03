package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.e5;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.z7;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;

@j3
public abstract class t4 implements IDisposable {
   private AtomicInteger a = new AtomicInteger(0);
   private com.aspose.slides.internal.r5t.n5 b;
   private t4$n5 c;
   private t4$l6 d;
   public static t4 Null = new t9();

   protected t4() {
   }

   public abstract boolean canRead();

   public abstract boolean canSeek();

   public abstract boolean canWrite();

   public boolean canTimeout() {
      return false;
   }

   public abstract long getLength();

   public abstract long getPosition();

   public abstract void setPosition(long var1);

   @Override
   public void dispose() {
      this.close();
   }

   protected void dispose(boolean disposing) {
      if (disposing && this.b != null) {
         this.a(this.a.decrementAndGet());
      }
   }

   public void close() {
      this.dispose(true);
      e5.n5(this);
   }

   public int getReadTimeout() {
      throw new InvalidOperationException("Timeouts are not supported on this stream.");
   }

   public void setReadTimeout(int value) {
      throw new InvalidOperationException("Timeouts are not supported on this stream.");
   }

   public int getWriteTimeout() {
      throw new InvalidOperationException("Timeouts are not supported on this stream.");
   }

   public void setWriteTimeout(int value) {
      throw new InvalidOperationException("Timeouts are not supported on this stream.");
   }

   public static t4 _synchronized(t4 stream) {
      return new c4(stream);
   }

   public abstract void flush();

   public abstract int read(byte[] var1, int var2, int var3);

   public z7 beginRead(byte[] buffer, int offset, int count, com.aspose.slides.ms.System.h0 callback, Object state) {
      if (!this.canRead()) {
         throw new NotSupportedException("Stream does not support reading.");
      }

      this.a.incrementAndGet();
      q0 var6 = new q0(this);
      if (this.b == null) {
         synchronized (this) {
            if (this.b == null) {
               this.b = new com.aspose.slides.internal.r5t.n5(true);
            }
         }
      }

      this.b.a6();
      this.c = var6;
      return var6.n5(buffer, offset, count, callback, state);
   }

   public int endRead(z7 asyncResult) {
      if (asyncResult == null) {
         throw new ArgumentNullException("asyncResult");
      }

      if (this.c == null) {
         throw new ArgumentException(
            "Either the IAsyncResult object did not come from the corresponding async method on this type, or EndRead was called multiple times with the same IAsyncResult."
         );
      }

      int var2 = -1;

      try {
         var2 = this.c.n5(asyncResult);
      } finally {
         this.c = null;
         this.b.l6();
         this.a(this.a.decrementAndGet());
      }

      return var2;
   }

   public int readByte() {
      byte[] var1 = new byte[1];
      return this.read(var1, 0, 1) == 1 ? var1[0] & 0xFF : -1;
   }

   public abstract long seek(long var1, int var3);

   public abstract void setLength(long var1);

   public abstract void write(byte[] var1, int var2, int var3);

   public void writeByte(byte value) {
      byte[] var2 = new byte[]{value};
      this.write(var2, 0, 1);
   }

   public z7 beginWrite(byte[] buffer, int offset, int count, com.aspose.slides.ms.System.h0 callback, Object state) {
      if (!this.canWrite()) {
         throw new NotSupportedException("Stream does not support writing.");
      }

      this.a.incrementAndGet();
      z3 var6 = new z3(this);
      if (this.b == null) {
         synchronized (this) {
            if (this.b == null) {
               this.b = new com.aspose.slides.internal.r5t.n5(true);
            }
         }
      }

      this.b.a6();
      this.d = var6;
      return var6.n5(buffer, offset, count, callback, state);
   }

   public void endWrite(z7 asyncResult) {
      if (asyncResult == null) {
         throw new ArgumentNullException("asyncResult");
      }

      if (this.d == null) {
         throw new ArgumentException(
            "Either the IAsyncResult object did not come from the corresponding async method on this type, or EndWrite was called multiple times with the same IAsyncResult."
         );
      }

      try {
         this.d.n5(asyncResult);
      } finally {
         this.d = null;
         this.b.l6();
         this.a(this.a.decrementAndGet());
      }
   }

   private void a(int var1) {
      if (this.b != null && var1 == 0) {
         this.b.u3();
         this.b = null;
      }
   }

   public OutputStream toOutputStream() {
      return new com.aspose.slides.internal.v2c.k5(this);
   }

   public InputStream toInputStream() {
      return new com.aspose.slides.internal.v2c.l6(this);
   }

   public static t4 fromJava(InputStream stream) {
      if (stream == null) {
         return null;
      } else {
         return stream instanceof com.aspose.slides.internal.v2c.l6
            ? ((com.aspose.slides.internal.v2c.l6)stream).n5()
            : new com.aspose.slides.internal.v2c.n5(stream);
      }
   }

   public static InputStream toJava(t4 stream) {
      if (stream == null) {
         return null;
      } else {
         return stream instanceof com.aspose.slides.internal.v2c.n5 ? ((com.aspose.slides.internal.v2c.n5)stream).n5() : stream.toInputStream();
      }
   }
}
