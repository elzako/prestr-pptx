package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;

abstract class w5 implements i1 {
   protected u8 n3;
   protected boolean y4;
   private int n5;
   private byte[] l6;
   private byte[] k5;
   private byte[] u3;
   private byte[] a6;
   private int u9;
   private int h0;
   private boolean c8 = false;
   private boolean t2;
   private i9 s7;

   public w5(u8 var1, boolean var2, byte[] var3) {
      this.n3 = var1;
      this.y4 = var2;
      this.n5 = this.n3.c8() >> 3;
      if (var3 == null) {
         var3 = com.aspose.slides.internal.x8w.t4.l6(this.n5);
      } else {
         var3 = (byte[])var3.clone();
      }

      if (var3.length < this.n5) {
         String var4 = com.aspose.slides.internal.x8w.z3.n5("IV is too small ({0} bytes), it should be {1} bytes long.", var3.length, this.n5);
         throw new CryptographicException(var4);
      }

      this.l6 = new byte[this.n5];
      com.aspose.slides.ms.System.y4.n5(var3, 0, this.l6, 0, Math.min(this.n5, var3.length));
      this.k5 = new byte[this.n5];
      this.u9 = this.n3.t2() >> 3;
      if (this.u9 != 0) {
         this.h0 = this.n5 / this.u9;
      }

      this.u3 = new byte[this.n5];
      this.a6 = new byte[this.n5];
   }

   @Override
   public void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   protected void n5(boolean var1) {
      if (!this.c8) {
         if (var1) {
            com.aspose.slides.ms.System.u3.n5(this.l6, 0, this.n5);
            this.l6 = null;
            com.aspose.slides.ms.System.u3.n5(this.k5, 0, this.n5);
            this.k5 = null;
         }

         this.c8 = true;
      }
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public boolean as_() {
      return false;
   }

   @Override
   public int at_() {
      return this.n5;
   }

   @Override
   public int au_() {
      return this.n5;
   }

   protected void k5(byte[] var1, byte[] var2) {
      switch (this.n3.n3()) {
         case 1:
            this.u3(var1, var2);
            break;
         case 2:
            this.l6(var1, var2);
            break;
         case 3:
            this.u9(var1, var2);
            break;
         case 4:
            this.a6(var1, var2);
            break;
         case 5:
            this.h0(var1, var2);
            break;
         default:
            throw new NotImplementedException("Unkown CipherMode" + com.aspose.slides.ms.System.d5.getName(x8.class, this.n3.n3()));
      }
   }

   protected abstract void l6(byte[] var1, byte[] var2);

   protected void u3(byte[] var1, byte[] var2) {
      if (this.y4) {
         for (int var3 = 0; var3 < this.n5; var3++) {
            this.l6[var3] = (byte)(this.l6[var3] ^ var1[var3]);
         }

         this.l6(this.l6, var2);
         com.aspose.slides.ms.System.y4.n5(var2, 0, this.l6, 0, this.n5);
      } else {
         com.aspose.slides.ms.System.y4.n5(var1, 0, this.k5, 0, this.n5);
         this.l6(var1, var2);

         for (int var4 = 0; var4 < this.n5; var4++) {
            var2[var4] ^= this.l6[var4];
         }

         com.aspose.slides.ms.System.y4.n5(this.k5, 0, this.l6, 0, this.n5);
      }
   }

   protected void a6(byte[] var1, byte[] var2) {
      if (this.y4) {
         for (int var3 = 0; var3 < this.h0; var3++) {
            this.l6(this.l6, this.k5);

            for (int var4 = 0; var4 < this.u9; var4++) {
               var2[var4 + var3] = (byte)(this.k5[var4] & 0xFF ^ var1[var4 + var3] & 0xFF);
            }

            com.aspose.slides.ms.System.y4.n5(this.l6, this.u9, this.l6, 0, this.n5 - this.u9);
            com.aspose.slides.ms.System.y4.n5(var2, var3, this.l6, this.n5 - this.u9, this.u9);
         }
      } else {
         for (int var5 = 0; var5 < this.h0; var5++) {
            this.y4 = true;
            this.l6(this.l6, this.k5);
            this.y4 = false;
            com.aspose.slides.ms.System.y4.n5(this.l6, this.u9, this.l6, 0, this.n5 - this.u9);
            com.aspose.slides.ms.System.y4.n5(var1, var5, this.l6, this.n5 - this.u9, this.u9);

            for (int var6 = 0; var6 < this.u9; var6++) {
               var2[var6 + var5] = (byte)(this.k5[var6] & 0xFF ^ var1[var6 + var5] & 0xFF);
            }
         }
      }
   }

   protected void u9(byte[] var1, byte[] var2) {
      throw new CryptographicException("OFB isn't supported by the framework");
   }

   protected void h0(byte[] var1, byte[] var2) {
      throw new CryptographicException("CTS isn't supported by the framework");
   }

   private void l6(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("inputBuffer");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("inputOffset", "< 0");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("inputCount", "< 0");
      }

      if (var2 > var1.length - var3) {
         throw new ArgumentException("inputBuffer\r\nParameter name: " + com.aspose.slides.internal.x8w.z3.n5("Overflow"));
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      if (this.c8) {
         throw new ObjectDisposedException("Object is disposed");
      }

      this.l6(var1, var2, var3);
      if (var4 == null) {
         throw new ArgumentNullException("outputBuffer");
      }

      if (var5 < 0) {
         throw new ArgumentOutOfRangeException("outputOffset", "< 0");
      }

      int var6 = var4.length - var3 - var5;
      if (this.y4 || 0 <= var6 || this.n3.y4() != 1 && this.n3.y4() != 3) {
         if (this.a6()) {
            if (0 > var6 + this.n5) {
               throw new CryptographicException("outputBuffer", com.aspose.slides.internal.x8w.z3.n5("Overflow"));
            }
         } else if (0 > var6) {
            if (var1.length - var2 - var4.length != this.n5) {
               throw new CryptographicException("outputBuffer", com.aspose.slides.internal.x8w.z3.n5("Overflow"));
            }

            var3 = var4.length - var5;
         }

         return this.l6(var1, var2, var3, var4, var5);
      } else {
         throw new CryptographicException("outputBuffer", com.aspose.slides.internal.x8w.z3.n5("Overflow"));
      }
   }

   private boolean a6() {
      return !this.y4 && this.n3.y4() != 1 && this.n3.y4() != 3;
   }

   private int l6(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      int var6 = var2;
      int var7;
      if (var3 != this.n5) {
         if (var3 % this.n5 != 0) {
            throw new CryptographicException("Invalid input block size.");
         }

         var7 = var3 / this.n5;
      } else {
         var7 = 1;
      }

      if (this.a6()) {
         var7--;
      }

      int var8 = 0;
      if (this.t2) {
         this.k5(this.u3, this.a6);
         com.aspose.slides.ms.System.y4.n5(this.a6, 0, var4, var5, this.n5);
         var5 += this.n5;
         var8 += this.n5;
         this.t2 = false;
      }

      for (int var9 = 0; var9 < var7; var9++) {
         com.aspose.slides.ms.System.y4.n5(var1, var6, this.u3, 0, this.n5);
         this.k5(this.u3, this.a6);
         com.aspose.slides.ms.System.y4.n5(this.a6, 0, var4, var5, this.n5);
         var6 += this.n5;
         var5 += this.n5;
         var8 += this.n5;
      }

      if (this.a6()) {
         com.aspose.slides.ms.System.y4.n5(var1, var6, this.u3, 0, this.n5);
         this.t2 = true;
      }

      return var8;
   }

   private void k5(byte[] var1, int var2, int var3) {
      if (this.s7 == null) {
         this.s7 = i9.n5();
      }

      byte[] var4 = new byte[var3];
      this.s7.n5(var4);
      com.aspose.slides.ms.System.y4.n5(var4, 0, var1, var2, var3);
   }

   private void n5(int var1, int var2, int var3) {
      String var4 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.x8w.z3.n5("Bad {0} padding."), new Object[]{var1});
      if (var2 >= 0) {
         var4 = com.aspose.slides.ms.System.d1.n5(
            var4, com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.x8w.z3.n5(" Invalid length {0}."), new Object[]{var2})
         );
      }

      if (var3 >= 0) {
         var4 = com.aspose.slides.ms.System.d1.n5(
            var4, com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.x8w.z3.n5(" Error found at position {0}."), new Object[]{var3})
         );
      }

      throw new CryptographicException(var4);
   }

   private byte[] u3(byte[] var1, int var2, int var3) {
      int var4 = var3 / this.n5 * this.n5;
      int var5 = var3 - var4;
      int var6 = var4;
      switch (this.n3.y4()) {
         case 2:
         case 4:
         case 5:
            var6 += this.n5;
            break;
         case 3:
         default:
            if (var3 == 0) {
               return new byte[0];
            }

            if (var5 != 0) {
               if (this.n3.y4() == 1) {
                  throw new CryptographicException("invalid block length");
               }

               byte[] var7 = new byte[var4 + this.n5];
               com.aspose.slides.ms.System.y4.n5(var1, var2, var7, 0, var3);
               var1 = var7;
               var2 = 0;
               var3 = var7.length;
               var6 = var3;
            }
      }

      byte[] var12 = new byte[var6];
      int var8 = 0;

      while (var6 > this.n5) {
         this.l6(var1, var2, this.n5, var12, var8);
         var2 += this.n5;
         var8 += this.n5;
         var6 -= this.n5;
      }

      byte var9 = (byte)(this.n5 - var5);
      switch (this.n3.y4()) {
         case 2:
            int var10 = var12.length;

            while (--var10 >= var12.length - (var9 & 255)) {
               var12[var10] = var9;
            }

            com.aspose.slides.ms.System.y4.n5(var1, var2, var12, var4, var5);
            this.l6(var12, var4, this.n5, var12, var4);
            break;
         case 3:
         default:
            this.l6(var1, var2, this.n5, var12, var8);
            break;
         case 4:
            var12[var12.length - 1] = var9;
            com.aspose.slides.ms.System.y4.n5(var1, var2, var12, var4, var5);
            this.l6(var12, var4, this.n5, var12, var4);
            break;
         case 5:
            this.k5(var12, var12.length - (var9 & 255), (var9 & 255) - 1);
            var12[var12.length - 1] = var9;
            com.aspose.slides.ms.System.y4.n5(var1, var2, var12, var4, var5);
            this.l6(var12, var4, this.n5, var12, var4);
      }

      return var12;
   }

   private byte[] a6(byte[] var1, int var2, int var3) {
      if (var3 % this.n5 > 0) {
         throw new CryptographicException("Invalid input block size.");
      }

      int var4 = var3;
      if (this.t2) {
         var4 += this.n5;
      }

      byte[] var5 = new byte[var4];
      int var6 = 0;

      while (var3 > 0) {
         int var7 = this.l6(var1, var2, this.n5, var5, var6);
         var2 += this.n5;
         var6 += var7;
         var3 -= this.n5;
      }

      if (this.t2) {
         this.k5(this.u3, this.a6);
         com.aspose.slides.ms.System.y4.n5(this.a6, 0, var5, var6, this.n5);
         var6 += this.n5;
         this.t2 = false;
      }

      byte var10 = (byte)(var4 > 0 ? var5[var4 - 1] & 0xFF : 0);
      switch (this.n3.y4()) {
         case 1:
         case 3:
         default:
            break;
         case 2:
            if (var10 == 0 || (var10 & 255) > this.n5) {
               this.n5(this.n3.y4(), var10 & 255, -1);
            }

            for (int var11 = (var10 & 255) - 1; var11 > 0; var11--) {
               if (var5[var4 - 1 - var11] != var10) {
                  this.n5(this.n3.y4(), -1, var11);
               }
            }

            var4 -= var10 & 255;
            break;
         case 4:
            if (var10 == 0 || (var10 & 255) > this.n5) {
               this.n5(this.n3.y4(), var10 & 255, -1);
            }

            for (int var8 = (var10 & 255) - 1; var8 > 0; var8--) {
               if (var5[var4 - 1 - var8] != 0) {
                  this.n5(this.n3.y4(), -1, var8);
               }
            }

            var4 -= var10 & 255;
            break;
         case 5:
            if (var10 == 0 || (var10 & 255) > this.n5) {
               this.n5(this.n3.y4(), var10 & 255, -1);
            }

            var4 -= var10 & 255;
      }

      if (var4 > 0) {
         byte[] var12 = new byte[var4];
         com.aspose.slides.ms.System.y4.n5(var5, 0, var12, 0, var4);
         com.aspose.slides.ms.System.u3.n5(var5, 0, var5.length);
         return var12;
      } else {
         return new byte[0];
      }
   }

   @Override
   public byte[] n5(byte[] var1, int var2, int var3) {
      if (this.c8) {
         throw new ObjectDisposedException("Object is disposed");
      }

      this.l6(var1, var2, var3);
      return this.y4 ? this.u3(var1, var2, var3) : this.a6(var1, var2, var3);
   }
}
