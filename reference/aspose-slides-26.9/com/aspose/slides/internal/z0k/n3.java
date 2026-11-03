package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d5;
import com.aspose.slides.ms.System.z7;
import java.io.File;

public class n3 extends t4 {
   private boolean n5 = false;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private com.aspose.slides.internal.v2c.u3 a6;
   private final String u9;

   public n3(String var1, int var2) {
      this(var1, var2, var2 == 6 ? 2 : 3);
   }

   private n3(int var1, String var2, int var3, int var4) {
      if (var1 != -2 && var1 <= 0) {
         throw new ArgumentOutOfRangeException("bufferSize", "Positive number required.");
      }

      boolean var5 = var1 > 0;
      this.u9 = var2;
      if (var2 == null) {
         throw new ArgumentNullException("path", "Path cannot be null.");
      }

      if (d1.l6(var2).length() == 0) {
         throw new ArgumentException("Empty path name is not legal.");
      }

      if (var3 < 1 || var3 > 6) {
         throw new ArgumentOutOfRangeException("mode", "Enum value was out of legal range.");
      }

      if (var4 >= 1 && var4 <= 3) {
         String var6;
         if (var4 == 1) {
            this.k5 = false;
            this.l6 = true;
            var6 = "r";
         } else if (var4 == 2) {
            this.k5 = true;
            this.l6 = false;
            var6 = "rw";
         } else {
            this.k5 = true;
            this.l6 = true;
            var6 = "rw";
         }

         File var7 = new File(var2);
         if (var3 == 6) {
            if (var4 == 3) {
               throw new ArgumentException("Append access can be requested only in write-only mode.");
            }

            if (var4 == 1) {
               throw new ArgumentException(
                  d1.n5("Combining FileMode: {0} with FileAccess: {1} is invalid.",new Object[]{ d5.getName(s7.class, var3), d5.getName(h0.class, var4)})
               );
            }
         }

         if ((var3 == 2 || var3 == 1 || var3 == 5) && var4 == 1) {
            throw new ArgumentException(
               d1.n5("Combining FileMode: {0} with FileAccess: {1} is invalid.",new Object[]{ d5.getName(s7.class, var3), d5.getName(h0.class, var4)})
            );
         }

         if (var7.exists()) {
            if (var3 == 1) {
               throw new IOException("Can't create new file. File '" + var2 + "' already exist.");
            }

            if (var3 == 2 || var3 == 5) {
               var7.delete();
            }

            if (var5) {
               this.a6 = new com.aspose.slides.internal.v2c.u3(var7, var6, var1);
            } else {
               this.a6 = new com.aspose.slides.internal.v2c.u3(var7, var6);
            }

            if (var3 == 6) {
               this.a6.n5(this.a6.u3());
            }
         } else {
            if (var3 == 3 || var3 == 5) {
               throw new FileNotFoundException("Can't find file: " + var2 + ".", var2);
            }

            if (var5) {
               this.a6 = new com.aspose.slides.internal.v2c.u3(var7, var6, var1);
            } else if (var6.equals("r") && var3 == 4) {
               var6 = "rw";
               this.a6 = new com.aspose.slides.internal.v2c.u3(var7, var6);
               this.a6.n5(true);
            } else {
               this.a6 = new com.aspose.slides.internal.v2c.u3(var7, var6);
            }
         }

         this.u3 = true;
      } else {
         throw new ArgumentOutOfRangeException("access", "Enum value was out of legal range.");
      }
   }

   public n3(String var1, int var2, int var3) {
      this(-2, var1, var2, var3);
   }

   public n3(String var1, int var2, int var3, int var4) {
      this(var1, var2, var3);
   }

   public n3(String var1, int var2, int var3, int var4, int var5) {
      this(var5, var1, var2, var3);
   }

   @Override
   public boolean canRead() {
      return this.l6;
   }

   @Override
   public boolean canSeek() {
      return this.u3;
   }

   @Override
   public boolean canWrite() {
      return this.k5;
   }

   @Override
   public long getLength() {
      if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      } else if (!this.canSeek()) {
         throw new NotSupportedException("Stream does not support seeking.");
      } else {
         return this.a6.u3();
      }
   }

   @Override
   public long getPosition() {
      if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      } else if (!this.canSeek()) {
         throw new NotSupportedException("Stream does not support seeking.");
      } else {
         return this.a6.k5();
      }
   }

   @Override
   public void setPosition(long position) {
      if (position < 0L) {
         throw new ArgumentOutOfRangeException("value", "Non-negative number required.");
      }

      if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      }

      if (!this.canSeek()) {
         throw new NotSupportedException("Stream does not support seeking.");
      }

      this.a6.n5(position);
   }

   @Override
   public void flush() {
      if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      }

      this.a6.a6();
   }

   @Override
   public long seek(long offset, int origin) {
      if (origin < 0 || origin > 2) {
         throw new ArgumentException("Invalid seek origin.");
      }

      if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      }

      if (!this.canSeek()) {
         throw new NotSupportedException("Stream does not support seeking.");
      }

      switch (origin) {
         case 0:
            this.a6.n5(offset);
            break;
         case 1:
            this.a6.n5(this.a6.k5() + offset);
            break;
         case 2:
            this.a6.n5(this.a6.u3() + offset);
      }

      return this.a6.k5();
   }

   @Override
   protected void dispose(boolean disposing) {
      try {
         if (this.a6 != null && !this.a6.l6()) {
            this.a6.n5();
         }
      } finally {
         this.l6 = false;
         this.k5 = false;
         this.u3 = false;
         super.dispose(disposing);
         this.n5 = true;
      }
   }

   @Override
   public void setLength(long length) {
      if (length < 0L) {
         throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
      }

      if (length == Long.MAX_VALUE) {
         throw new ArgumentOutOfRangeException("length", "file length too big");
      }

      if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      }

      if (!this.canSeek()) {
         throw new NotSupportedException("Stream does not support seeking.");
      }

      if (!this.k5) {
         throw new NotSupportedException("Stream does not support writing.");
      }

      this.a6.k5(length);
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (buffer == null) {
         throw new ArgumentNullException("array", "Buffer cannot be null.");
      } else if (offset < 0) {
         throw new ArgumentOutOfRangeException("offset", "Non-negative number required.");
      } else if (count < 0) {
         throw new ArgumentOutOfRangeException("count", "Non-negative number required.");
      } else if (buffer.length - offset < count) {
         throw new ArgumentException(
            "Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection."
         );
      } else if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      } else if (this.l6) {
         int var4 = this.a6.l6(buffer, offset, count);
         return var4 == -1 ? 0 : var4;
      } else {
         throw new NotSupportedException("Stream does not support reading.");
      }
   }

   @Override
   public int readByte() {
      if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      } else if (this.l6) {
         return this.a6.u9();
      } else {
         throw new NotSupportedException("Stream does not support reading.");
      }
   }

   @Override
   public void write(byte[] array, int offset, int count) {
      if (array == null) {
         throw new ArgumentNullException("array", "Buffer cannot be null.");
      }

      if (count < 0) {
         throw new ArgumentOutOfRangeException("count", "Non-negative number required.");
      }

      if (offset < 0) {
         throw new ArgumentOutOfRangeException("offset", "Non-negative number required.");
      }

      if (array.length - offset < count) {
         throw new ArgumentException(
            "Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection."
         );
      }

      if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      }

      if (this.k5) {
         this.a6.write(array, offset, count);
      } else {
         throw new NotSupportedException("Stream does not support writing.");
      }
   }

   @Override
   public void writeByte(byte value) {
      if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      }

      if (this.k5) {
         this.a6.write(value);
      } else {
         throw new NotSupportedException("Stream does not support writing.");
      }
   }

   public String n5() {
      return this.u9;
   }

   @Override
   public z7 beginRead(byte[] buffer, int offset, int count, com.aspose.slides.ms.System.h0 callback, Object state) {
      if (buffer == null) {
         throw new ArgumentNullException("buffer");
      } else if (offset < 0) {
         throw new ArgumentOutOfRangeException("offset", "Non-negative number required.");
      } else if (count < 0) {
         throw new ArgumentOutOfRangeException("numBytes", "Non-negative number required.");
      } else if (buffer.length - offset < count) {
         throw new ArgumentException(
            "Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection."
         );
      } else if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      } else {
         return super.beginRead(buffer, offset, count, callback, state);
      }
   }

   @Override
   public int endRead(z7 asyncResult) {
      if (asyncResult == null) {
         throw new ArgumentNullException("asyncResult");
      } else {
         return super.endRead(asyncResult);
      }
   }

   @Override
   public z7 beginWrite(byte[] array, int offset, int numBytes, com.aspose.slides.ms.System.h0 userCallback, Object stateObject) {
      if (array == null) {
         throw new ArgumentNullException("array");
      } else if (offset < 0) {
         throw new ArgumentOutOfRangeException("offset", "Non-negative number required.");
      } else if (numBytes < 0) {
         throw new ArgumentOutOfRangeException("numBytes", "Non-negative number required.");
      } else if (array.length - offset < numBytes) {
         throw new ArgumentException(
            "Offset and length were out of bounds for the array or count is greater than the number of elements from index to the end of the source collection."
         );
      } else if (this.n5) {
         throw new ObjectDisposedException("Cannot access a closed file.");
      } else {
         return super.beginWrite(array, offset, numBytes, userCallback, stateObject);
      }
   }

   @Override
   public void endWrite(z7 asyncResult) {
      if (asyncResult == null) {
         throw new ArgumentNullException("asyncResult");
      }

      super.endWrite(asyncResult);
   }
}
