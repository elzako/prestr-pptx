package com.aspose.slides.internal.p6w;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.r5t.z8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.e5;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.z7;

public class u9 extends com.aspose.slides.internal.z0k.t4 implements IDisposable {
   private int n5;
   private h0 l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9 = false;

   public u9(h0 var1, boolean var2) {
      this(var1, 3, var2);
   }

   public u9(h0 var1, int var2, boolean var3) {
      if (var1 == null) {
         throw new ArgumentNullException("socket is null");
      }

      if (var1.k5() != 1) {
         throw new ArgumentException("Socket is not of type Stream", "socket");
      }

      if (!var1.l6()) {
         throw new IOException("Not connected");
      }

      if (!var1.n5()) {
         throw new IOException("Operation not allowed on a non-blocking socket.");
      }

      this.l6 = var1;
      this.k5 = var3;
      this.n5 = var2;
      this.u3 = this.canRead();
      this.a6 = this.canWrite();
   }

   @Override
   public boolean canRead() {
      return this.n5 == 3 || this.n5 == 1;
   }

   @Override
   public boolean canSeek() {
      return false;
   }

   @Override
   public boolean canTimeout() {
      return true;
   }

   @Override
   public boolean canWrite() {
      return this.n5 == 3 || this.n5 == 2;
   }

   @Override
   public long getLength() {
      throw new NotSupportedException();
   }

   @Override
   public long getPosition() {
      throw new NotSupportedException();
   }

   @Override
   public void setPosition(long value) {
      throw new NotSupportedException();
   }

   @Override
   public int getReadTimeout() {
      int var1 = this.l6.c8();
      return var1 <= 0 ? z8.n5 : var1;
   }

   @Override
   public void setReadTimeout(int value) {
      if (value <= 0 && value != z8.n5) {
         throw new ArgumentOutOfRangeException("value", "The value specified is less than or equal to zero and is not Infinite.");
      }

      this.l6.n5(value);
   }

   @Override
   public int getWriteTimeout() {
      int var1 = this.l6.t2();
      return var1 <= 0 ? z8.n5 : var1;
   }

   @Override
   public void setWriteTimeout(int value) {
      if (value <= 0 && value != z8.n5) {
         throw new ArgumentOutOfRangeException("value", "The value specified is less than or equal to zero and is not Infinite");
      }

      this.l6.l6(value);
   }

   @Override
   public z7 beginRead(byte[] buffer, int offset, int size, com.aspose.slides.ms.System.h0 callback, Object state) {
      this.n5();
      if (buffer == null) {
         throw new ArgumentNullException("buffer is null");
      }

      int var6 = com.aspose.slides.ms.System.u3.n5((Object)(buffer)).a6();
      if (offset >= 0 && offset <= var6) {
         if (size >= 0 && offset + size <= var6) {
            h0 var7 = this.l6;
            if (var7 == null) {
               throw new IOException("Connection closed");
            }

            try {
               return var7.n5(buffer, offset, size, 0, callback, state);
            } catch (RuntimeException var10) {
               throw new IOException("BeginReceive failure", var10);
            }
         } else {
            throw new ArgumentOutOfRangeException("offset+size exceeds the size of buffer");
         }
      } else {
         throw new ArgumentOutOfRangeException("offset exceeds the size of buffer");
      }
   }

   @Override
   public z7 beginWrite(byte[] buffer, int offset, int size, com.aspose.slides.ms.System.h0 callback, Object state) {
      this.n5();
      if (buffer == null) {
         throw new ArgumentNullException("buffer is null");
      }

      int var6 = com.aspose.slides.ms.System.u3.n5((Object)(buffer)).a6();
      if (offset >= 0 && offset <= var6) {
         if (size >= 0 && offset + size <= var6) {
            h0 var7 = this.l6;
            if (var7 == null) {
               throw new IOException("Connection closed");
            }

            try {
               return var7.l6(buffer, offset, size, 0, callback, state);
            } catch (RuntimeException var10) {
               throw new IOException("BeginWrite failure", var10);
            }
         } else {
            throw new ArgumentOutOfRangeException("offset+size exceeds the size of buffer");
         }
      } else {
         throw new ArgumentOutOfRangeException("offset exceeds the size of buffer");
      }
   }

   @Override
   protected void finalize() {
      this.dispose(false);
   }

   @Override
   protected void dispose(boolean disposing) {
      if (!this.u9) {
         this.u9 = true;
         if (this.k5) {
            h0 var2 = this.l6;
            if (var2 != null) {
               var2.h0();
            }
         }

         this.l6 = null;
         this.n5 = 0;
         if (disposing) {
            e5.n5(this);
         }
      }
   }

   @Override
   public int endRead(z7 ar) {
      this.n5();
      if (ar == null) {
         throw new ArgumentNullException("async result is null");
      }

      h0 var2 = this.l6;
      if (var2 == null) {
         throw new IOException("Connection closed");
      }

      try {
         return var2.n5(ar);
      } catch (RuntimeException var5) {
         throw new IOException("EndRead failure", var5);
      }
   }

   @Override
   public void endWrite(z7 ar) {
      this.n5();
      if (ar == null) {
         throw new ArgumentNullException("async result is null");
      }

      h0 var2 = this.l6;
      if (var2 == null) {
         throw new IOException("Connection closed");
      }

      try {
         var2.l6(ar);
      } catch (RuntimeException var4) {
         throw new IOException("EndWrite failure", var4);
      }
   }

   @Override
   public void flush() {
   }

   @Override
   public int read(byte[] buffer, int offset, int size) {
      this.n5();
      if (buffer == null) {
         throw new ArgumentNullException("buffer is null");
      }

      if (offset >= 0 && offset <= com.aspose.slides.ms.System.u3.n5((Object)(buffer)).a6()) {
         if (size >= 0 && offset + size <= com.aspose.slides.ms.System.u3.n5((Object)(buffer)).a6()) {
            h0 var4 = this.l6;
            if (var4 == null) {
               throw new IOException("Connection closed");
            }

            try {
               return var4.n5(buffer, offset, size, 0);
            } catch (RuntimeException var7) {
               throw new IOException("Read failure", var7);
            }
         } else {
            throw new ArgumentOutOfRangeException("offset+size exceeds the size of buffer");
         }
      } else {
         throw new ArgumentOutOfRangeException("offset exceeds the size of buffer");
      }
   }

   @Override
   public long seek(long offset, int origin) {
      throw new NotSupportedException();
   }

   @Override
   public void setLength(long value) {
      throw new NotSupportedException();
   }

   @Override
   public void write(byte[] buffer, int offset, int size) {
      this.n5();
      if (buffer == null) {
         throw new ArgumentNullException("buffer");
      }

      if (offset >= 0 && offset <= com.aspose.slides.ms.System.u3.n5((Object)(buffer)).a6()) {
         if (size >= 0 && size <= com.aspose.slides.ms.System.u3.n5((Object)(buffer)).a6() - offset) {
            h0 var4 = this.l6;
            if (var4 == null) {
               throw new IOException("Connection closed");
            }

            try {
               int var5 = 0;

               while (size - var5 > 0) {
                  var5 += var4.l6(buffer, offset + var5, size - var5, 0);
               }
            } catch (RuntimeException var6) {
               throw new IOException("Write failure", var6);
            }
         } else {
            throw new ArgumentOutOfRangeException("offset+size exceeds the size of buffer");
         }
      } else {
         throw new ArgumentOutOfRangeException("offset exceeds the size of buffer");
      }
   }

   private void n5() {
      if (this.u9) {
         throw new ObjectDisposedException(j8.n5(this).q0());
      }
   }
}
