package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.exceptions.ObjectDisposedException;

public abstract class f2 implements i1 {
   byte[] l6;
   protected int k5;
   protected int u3;
   private boolean n5 = false;

   protected f2() {
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public boolean as_() {
      return true;
   }

   public void x8() {
      this.n5(true);
   }

   public byte[] l6(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      } else {
         return this.k5(var1, 0, var1.length);
      }
   }

   public byte[] k5(byte[] var1, int var2, int var3) {
      if (this.n5) {
         throw new ObjectDisposedException("HashAlgorithm");
      }

      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("offset", "< 0");
      }

      if (var3 < 0) {
         throw new ArgumentException("count", "< 0");
      }

      if (var2 > var1.length - var3) {
         throw new ArgumentException("offset + count", com.aspose.slides.internal.x8w.z3.n5("Overflow"));
      }

      this.l6(var1, var2, var3);
      this.l6 = this.c8();
      this.t2();
      return this.l6;
   }

   public byte[] n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (this.n5) {
         throw new ObjectDisposedException("HashAlgorithm");
      }

      byte[] var2 = new byte[4096];

      for (int var3 = var1.read(var2, 0, 4096); var3 > 0; var3 = var1.read(var2, 0, 4096)) {
         this.l6(var2, 0, var3);
      }

      this.l6 = this.c8();
      this.t2();
      return this.l6;
   }

   public static f2 k5(String var0) {
      return (f2)y4.n5(var0);
   }

   public byte[] n3() {
      if (this.l6 == null) {
         throw new CryptographicUnexpectedOperationException(com.aspose.slides.internal.x8w.z3.n5("No hash value computed."));
      } else {
         return this.l6;
      }
   }

   protected abstract void l6(byte[] var1, int var2, int var3);

   protected abstract byte[] c8();

   public int y4() {
      return this.k5;
   }

   public abstract void t2();

   protected void n5(boolean var1) {
      this.n5 = true;
   }

   @Override
   public int at_() {
      return 1;
   }

   @Override
   public int au_() {
      return 1;
   }

   @Override
   public void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      if (var1 == null) {
         throw new ArgumentNullException("inputBuffer");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("inputOffset", "< 0");
      }

      if (var3 < 0) {
         throw new ArgumentException("inputCount");
      }

      if (var2 >= 0 && var2 <= var1.length - var3) {
         if (var4 != null) {
            if (var5 < 0) {
               throw new ArgumentOutOfRangeException("outputOffset", "< 0");
            }

            if (var5 > var4.length - var3) {
               throw new ArgumentException("outputOffset + inputCount", com.aspose.slides.internal.x8w.z3.n5("Overflow"));
            }
         }

         this.l6(var1, var2, var3);
         if (var4 != null) {
            com.aspose.slides.ms.System.y4.n5(var1, var2, var4, var5, var3);
         }

         return var3;
      } else {
         throw new ArgumentException("inputBuffer");
      }
   }

   @Override
   public byte[] n5(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("inputBuffer");
      }

      if (var3 < 0) {
         throw new ArgumentException("inputCount");
      }

      if (var2 > var1.length - var3) {
         throw new ArgumentException("inputOffset + inputCount", com.aspose.slides.internal.x8w.z3.n5("Overflow"));
      }

      byte[] var4 = new byte[var3];
      com.aspose.slides.ms.System.y4.n5(var1, var2, var4, 0, var3);
      this.l6(var1, var2, var3);
      this.l6 = this.c8();
      this.t2();
      return var4;
   }

   @Override
   public String toString() {
      String var1 = com.aspose.slides.ms.System.j8.n5(this).s7().substring(com.aspose.slides.ms.System.j8.n5(this).s7().lastIndexOf(46) + 1);
      return "System.Security.Cryptography." + var1;
   }
}
