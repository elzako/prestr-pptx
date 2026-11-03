package com.aspose.slides.internal.x8w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.o8m.e5;
import com.aspose.slides.internal.o8m.i9;
import com.aspose.slides.internal.o8m.s4;
import java.math.BigInteger;

public class y4 extends com.aspose.slides.internal.o8m.z3 {
   private boolean u3 = false;
   private boolean a6 = false;
   private BigInteger u9;
   private BigInteger h0;
   private BigInteger c8;
   private BigInteger t2;
   private BigInteger s7;
   private BigInteger x8;
   private BigInteger n3;
   private int y4;
   private boolean e2;
   private i9 t9;
   private y4$n5 z1;
   public final com.aspose.slides.internal.v6g.n5<y4$n5> k5 = new e2(this);

   public y4() {
      this(1024);
   }

   public y4(int var1) {
      this.n5 = var1;
      this.l6 = new e5[1];
      this.l6[0] = new e5(512, 1024, 64);
   }

   private void a6() {
      this.l6(super.n5());
      this.u9();
      this.u3 = true;
      if (this.k5 != null) {
         this.z1.n5(this, null);
      }
   }

   private void u9() {
      this.t2 = com.aspose.slides.internal.x8w.s7.n5(160);

      while (com.aspose.slides.internal.x8w.s7.n5(this.t2, 0) || com.aspose.slides.internal.x8w.s7.h0(this.t2, this.h0)) {
         this.t2 = com.aspose.slides.internal.x8w.s7.n5(160);
      }

      this.s7 = this.c8.modPow(this.t2, this.u9);
   }

   private void n5(byte[] var1, byte[] var2, int var3) {
      long var4 = (var2[var2.length - 1] & 255 & 0xFF) + var3;
      var1[var2.length - 1] = (byte)(var4 & 4294967295L);
      var4 = (var4 & 4294967295L) >> 8;

      for (int var6 = var2.length - 2; var6 >= 0; var6--) {
         var4 = (var4 & 4294967295L) + (var2[var6] & 0xFF & 0xFF & 4294967295L);
         var1[var6] = (byte)(var4 & 4294967295L);
         var4 = (var4 & 4294967295L) >> 8;
      }
   }

   private void l6(int var1) {
      byte[] var2 = new byte[20];
      byte[] var3 = new byte[20];
      byte[] var4 = new byte[20];
      byte[] var5 = new byte[20];
      s4 var6 = s4.a6();
      int var7 = (var1 - 1) / 160;
      byte[] var8 = new byte[var1 / 8];
      boolean var9 = false;

      while (!var9) {
         do {
            this.h0().n5(var2);
            var3 = var6.l6(var2);
            com.aspose.slides.ms.System.u3.n5(var2, 0, var4, 0, var2.length);
            this.n5(var4, var2, 1);
            var4 = var6.l6(var4);

            for (int var10 = 0; var10 != var5.length; var10++) {
               var5[var10] = (byte)(var3[var10] & 0xFF ^ var4[var10] & 0xFF);
            }

            var5[0] = (byte)(var5[0] | -128);
            var5[19] = (byte)(var5[19] | 1);
            this.h0 = com.aspose.slides.internal.x8w.s7.n5(var5);
         } while (!this.h0.isProbablePrime(100));

         this.y4 = 0;

         for (int var14 = 2; this.y4 < 4096; var14 += var7 + 1) {
            for (int var11 = 0; var11 < var7; var11++) {
               this.n5(var3, var2, var14 + var11);
               var3 = var6.l6(var3);
               com.aspose.slides.ms.System.u3.n5(var3, 0, var8, var8.length - (var11 + 1) * var3.length, var3.length);
            }

            this.n5(var3, var2, var14 + var7);
            var3 = var6.l6(var3);
            com.aspose.slides.ms.System.u3.n5(var3, var3.length - (var8.length - var7 * var3.length), var8, 0, var8.length - var7 * var3.length);
            var8[0] = (byte)(var8[0] | -128);
            BigInteger var16 = com.aspose.slides.internal.x8w.s7.n5(var8);
            BigInteger var12 = com.aspose.slides.internal.x8w.s7.a6(var16, com.aspose.slides.internal.x8w.s7.n5(this.h0, 2L));
            this.u9 = com.aspose.slides.internal.x8w.s7.l6(var16, com.aspose.slides.internal.x8w.s7.l6(var12, com.aspose.slides.internal.x8w.s7.n5(1L)));
            if (this.u9.testBit(var1 - 1) && this.u9.isProbablePrime(100)) {
               var9 = true;
               break;
            }

            this.y4++;
         }
      }

      BigInteger var15 = com.aspose.slides.internal.x8w.s7.u3(com.aspose.slides.internal.x8w.s7.l6(this.u9, com.aspose.slides.internal.x8w.s7.n5(1L)), this.h0);

      while (true) {
         BigInteger var17 = com.aspose.slides.internal.x8w.s7.n5(var1);
         if (!com.aspose.slides.internal.x8w.s7.t2(var17, com.aspose.slides.internal.x8w.s7.n5(1L))
            && !com.aspose.slides.internal.x8w.s7.h0(var17, com.aspose.slides.internal.x8w.s7.l6(this.u9, com.aspose.slides.internal.x8w.s7.n5(1L)))) {
            this.c8 = var17.modPow(var15, this.u9);
            if (!com.aspose.slides.internal.x8w.s7.t2(this.c8, com.aspose.slides.internal.x8w.s7.n5(1L))) {
               this.n3 = com.aspose.slides.internal.x8w.s7.n5(var2);
               this.x8 = com.aspose.slides.internal.x8w.s7.u3(com.aspose.slides.internal.x8w.s7.l6(this.u9, com.aspose.slides.internal.x8w.s7.n5(1L)), this.h0);
               return;
            }
         }
      }
   }

   private i9 h0() {
      if (this.t9 == null) {
         this.t9 = i9.n5();
      }

      return this.t9;
   }

   @Override
   public int n5() {
      return this.u3 ? this.u9.bitLength() : super.n5();
   }

   public boolean u3() {
      return this.u3 && this.t2 == null;
   }

   private byte[] l6(byte[] var1) {
      int var2 = var1.length % 4;
      if (var2 > 0) {
         byte[] var3 = new byte[var1.length + 4 - var2];
         com.aspose.slides.ms.System.u3.n5(var1, 0, var3, 4 - var2, var1.length);
         return var3;
      } else {
         return var1;
      }
   }

   @Override
   public com.aspose.slides.internal.o8m.m3 l6(boolean var1) {
      if (this.a6) {
         throw new ObjectDisposedException(z3.n5("Keypair was disposed"));
      }

      if (!this.u3) {
         this.a6();
      }

      if (var1 && this.t2 == null) {
         throw new CryptographicException("no private key to export");
      }

      com.aspose.slides.internal.o8m.m3 var2 = new com.aspose.slides.internal.o8m.m3();
      var2.u3 = this.l6(com.aspose.slides.internal.x8w.s7.n5(this.u9));
      var2.a6 = this.l6(com.aspose.slides.internal.x8w.s7.n5(this.h0));
      var2.l6 = this.l6(com.aspose.slides.internal.x8w.s7.n5(this.c8));
      var2.c8 = this.l6(com.aspose.slides.internal.x8w.s7.n5(this.s7));
      if (!this.e2) {
         var2.k5 = this.l6(com.aspose.slides.internal.x8w.s7.n5(this.x8));
      }

      if (!com.aspose.slides.internal.x8w.s7.n5(this.n3, 0)) {
         var2.u9 = this.l6(com.aspose.slides.internal.x8w.s7.n5(this.n3));
         var2.n5 = this.y4;
      }

      if (var1) {
         byte[] var3 = com.aspose.slides.internal.x8w.s7.n5(this.t2);
         if (var3.length == 20) {
            var2.h0 = this.l6(var3);
         }
      }

      return var2;
   }

   @Override
   public void l6(com.aspose.slides.internal.o8m.m3 var1) {
      if (this.a6) {
         throw new ObjectDisposedException(z3.n5("Keypair was disposed"));
      }

      if (var1.u3 == null || var1.a6 == null || var1.l6 == null) {
         throw new CryptographicException(z3.n5("Missing mandatory DSA parameters (P, Q or G)."));
      }

      if (var1.h0 == null && var1.c8 == null) {
         throw new CryptographicException(z3.n5("Missing both public (Y) and private (X) keys."));
      }

      this.u9 = com.aspose.slides.internal.x8w.s7.n5(var1.u3);
      this.h0 = com.aspose.slides.internal.x8w.s7.n5(var1.a6);
      this.c8 = com.aspose.slides.internal.x8w.s7.n5(var1.l6);
      if (var1.h0 != null) {
         this.t2 = com.aspose.slides.internal.x8w.s7.n5(var1.h0);
      } else {
         this.t2 = null;
      }

      if (var1.c8 != null) {
         this.s7 = com.aspose.slides.internal.x8w.s7.n5(var1.c8);
      } else {
         this.s7 = this.c8.modPow(this.t2, this.u9);
      }

      if (var1.k5 != null) {
         this.x8 = com.aspose.slides.internal.x8w.s7.n5(var1.k5);
      } else {
         this.x8 = com.aspose.slides.internal.x8w.s7.u3(com.aspose.slides.internal.x8w.s7.l6(this.u9, com.aspose.slides.internal.x8w.s7.n5(1L)), this.h0);
         this.e2 = true;
      }

      if (var1.u9 != null) {
         this.n3 = com.aspose.slides.internal.x8w.s7.n5(var1.u9);
         this.y4 = var1.n5;
      } else {
         this.n3 = com.aspose.slides.internal.x8w.s7.n5(0L);
      }

      this.u3 = true;
   }

   @Override
   public byte[] n5(byte[] var1) {
      if (this.a6) {
         throw new ObjectDisposedException(z3.n5("Keypair was disposed"));
      }

      if (var1 == null) {
         throw new ArgumentNullException("rgbHash");
      }

      if (var1.length != 20) {
         throw new CryptographicException("invalid hash length");
      }

      if (!this.u3) {
         this.a6();
      }

      if (this.t2 == null) {
         throw new CryptographicException("no private key available for signature");
      }

      BigInteger var2 = com.aspose.slides.internal.x8w.s7.n5(var1);
      BigInteger var3 = com.aspose.slides.internal.x8w.s7.n5(160);

      while (com.aspose.slides.internal.x8w.s7.h0(var3, this.h0)) {
         var3 = com.aspose.slides.internal.x8w.s7.n5(160);
      }

      BigInteger var4 = com.aspose.slides.internal.x8w.s7.a6(this.c8.modPow(var3, this.u9), this.h0);
      BigInteger var5 = com.aspose.slides.internal.x8w.s7.a6(
         com.aspose.slides.internal.x8w.s7.k5(
            var3.modInverse(this.h0), com.aspose.slides.internal.x8w.s7.n5(var2, com.aspose.slides.internal.x8w.s7.k5(this.t2, var4))
         ),
         this.h0
      );
      byte[] var6 = new byte[40];
      byte[] var7 = com.aspose.slides.internal.x8w.s7.n5(var4);
      byte[] var8 = com.aspose.slides.internal.x8w.s7.n5(var5);
      int var9 = 20 - var7.length;
      com.aspose.slides.ms.System.u3.n5(var7, 0, var6, var9, var7.length);
      var9 = 40 - var8.length;
      com.aspose.slides.ms.System.u3.n5(var8, 0, var6, var9, var8.length);
      return var6;
   }

   @Override
   public boolean n5(byte[] var1, byte[] var2) {
      if (this.a6) {
         throw new ObjectDisposedException(z3.n5("Keypair was disposed"));
      }

      if (var1 == null) {
         throw new ArgumentNullException("rgbHash");
      }

      if (var2 == null) {
         throw new ArgumentNullException("rgbSignature");
      }

      if (var1.length != 20) {
         throw new CryptographicException("invalid hash length");
      }

      if (var2.length != 40) {
         throw new CryptographicException("invalid signature length");
      }

      if (!this.u3) {
         return false;
      }

      try {
         BigInteger var3 = com.aspose.slides.internal.x8w.s7.n5(var1);
         byte[] var4 = new byte[20];
         com.aspose.slides.ms.System.u3.n5(var2, 0, var4, 0, 20);
         BigInteger var5 = com.aspose.slides.internal.x8w.s7.n5(var4);
         com.aspose.slides.ms.System.u3.n5(var2, 20, var4, 0, 20);
         BigInteger var6 = com.aspose.slides.internal.x8w.s7.n5(var4);
         if (com.aspose.slides.internal.x8w.s7.c8(var5, com.aspose.slides.internal.x8w.s7.n5(0L)) || com.aspose.slides.internal.x8w.s7.t2(this.h0, var5)) {
            return false;
         } else if (!com.aspose.slides.internal.x8w.s7.c8(var6, com.aspose.slides.internal.x8w.s7.n5(0L))
            && !com.aspose.slides.internal.x8w.s7.t2(this.h0, var6)) {
            BigInteger var7 = var6.modInverse(this.h0);
            BigInteger var8 = com.aspose.slides.internal.x8w.s7.a6(com.aspose.slides.internal.x8w.s7.k5(var3, var7), this.h0);
            BigInteger var9 = com.aspose.slides.internal.x8w.s7.a6(com.aspose.slides.internal.x8w.s7.k5(var5, var7), this.h0);
            var8 = this.c8.modPow(var8, this.u9);
            var9 = this.s7.modPow(var9, this.u9);
            BigInteger var10 = com.aspose.slides.internal.x8w.s7.a6(
               com.aspose.slides.internal.x8w.s7.a6(com.aspose.slides.internal.x8w.s7.k5(var8, var9), this.u9), this.h0
            );
            return com.aspose.slides.internal.x8w.s7.s7(var10, var5);
         } else {
            return false;
         }
      } catch (RuntimeException var11) {
         throw new CryptographicException("couldn't compute signature verification");
      }
   }

   @Override
   protected void n5(boolean var1) {
      if (!this.a6) {
         if (this.t2 != null) {
            this.t2 = BigInteger.ZERO;
            this.t2 = null;
         }

         if (var1) {
            if (this.u9 != null) {
               this.u9 = BigInteger.ZERO;
               this.u9 = null;
            }

            if (this.h0 != null) {
               this.h0 = BigInteger.ZERO;
               this.h0 = null;
            }

            if (this.c8 != null) {
               this.c8 = BigInteger.ZERO;
               this.c8 = null;
            }

            if (this.x8 != null) {
               this.x8 = BigInteger.ZERO;
               this.x8 = null;
            }

            if (this.n3 != null) {
               this.n3 = BigInteger.ZERO;
               this.n3 = null;
            }

            if (this.s7 != null) {
               this.s7 = BigInteger.ZERO;
               this.s7 = null;
            }
         }
      }

      this.a6 = true;
   }

   // $VF: synthetic method
   static y4$n5 n5(y4 var0, y4$n5 var1) {
      return var0.z1 = var1;
   }
}
