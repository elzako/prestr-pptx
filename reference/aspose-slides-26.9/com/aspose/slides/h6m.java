package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.IDisposable;

class h6m implements IDisposable {
   private byte[] n5 = new byte[20];
   private long l6 = 24L;
   private long k5 = 32772L;
   private long u3 = 26126L;
   private byte[] a6;
   private byte[] u9;
   private byte[] h0;
   private byte[] c8;
   private byte[] t2;
   private com.aspose.slides.internal.o8m.s4 s7;
   private com.aspose.slides.internal.o8m.u8 x8;
   private com.aspose.slides.internal.o8m.i1 n3;
   private com.aspose.slides.internal.o8m.i1 y4;
   private boolean e2;

   public h6m(byte[] var1, String var2) {
      int var3 = 8;
      int var4 = com.aspose.slides.ms.System.x8.a6(var1, var3);
      long var5 = com.aspose.slides.ms.System.x8.l6(var1, var3 + 12);
      long var7 = com.aspose.slides.ms.System.x8.l6(var1, var3 + 16);
      long var9 = com.aspose.slides.ms.System.x8.l6(var1, var3 + 20);
      long var11 = com.aspose.slides.ms.System.x8.l6(var1, var3 + 24);
      String var13 = com.aspose.slides.internal.l7h.j5.z1().l6(var1, var3 + 36, var4 - 34);
      var3 = 12 + var4;
      var4 = com.aspose.slides.ms.System.x8.a6(var1, var3);
      var3 += 4;
      byte[] var14 = new byte[var4];
      byte[] var15 = new byte[var4];
      System.arraycopy(var1, var3, var14, 0, var4);
      var3 += var4;
      System.arraycopy(var1, var3, var15, 0, var4);
      var3 += var4;
      var3 += 4;
      byte[] var16 = new byte[var1.length - var3];
      System.arraycopy(var1, var3, var16, 0, var16.length);
      var3 += var4;
      this.h0 = com.aspose.slides.internal.l7h.j5.z1().u3(var2);
      if (this.h0.length >= 1 && this.h0 != null) {
         switch ((int)var5) {
            case 26126:
            case 26127:
            case 26128:
               this.u3 = var5;
               this.l6 = var11;
               this.k5 = var7;
               this.a6 = var15;
               this.u9 = var16;
               this.c8 = var14;
               this.s7 = new com.aspose.slides.internal.o8m.h6();
               this.n5 = this.n5(this.h0, this.c8);
               return;
            default:
               throw new PptxReadException("Do not support such  keyAlgId ");
         }
      } else {
         throw new InvalidPasswordException("The password could not be null or empty ");
      }
   }

   public h6m(String var1, int var2) {
      this.h0 = com.aspose.slides.internal.l7h.j5.z1().u3(var1);
      switch (var2) {
         case 128:
            this.u3 = 26126L;
            break;
         case 192:
            this.u3 = 26127L;
            break;
         case 256:
            this.u3 = 26128L;
            break;
         default:
            throw new PptxReadException("Do not support such  key length ");
      }

      if (this.h0.length >= 1 && this.h0 != null) {
         this.c8 = com.aspose.slides.ms.System.o0.l6().n5();
         this.s7 = new com.aspose.slides.internal.o8m.h6();
         this.n5 = this.n5(this.h0, this.c8);
      } else {
         throw new InvalidPasswordException("The password could not be null or empty ");
      }
   }

   private void n5(byte[] var1) {
      byte[] var2 = new byte[4];
      byte[] var3 = new byte[20];
      byte[] var4 = new byte[24];
      System.arraycopy(var1, 0, var4, 0, var1.length);
      com.aspose.slides.internal.o8m.h6 var5 = new com.aspose.slides.internal.o8m.h6();

      try {
         var3 = var5.l6(var4);
         byte[] var6 = new byte[64];

         for (int var7 = 0; var7 < 64; var7++) {
            var6[var7] = 54;
         }

         for (int var14 = 0; var14 < 20; var14++) {
            var6[var14] = (byte)(var6[var14] & 0xFF ^ var3[var14] & 0xFF);
         }

         byte[] var15 = new byte[64];

         for (int var8 = 0; var8 < 64; var8++) {
            var15[var8] = 92;
         }

         for (int var16 = 0; var16 < 20; var16++) {
            var15[var16] = (byte)(var15[var16] & 0xFF ^ var3[var16] & 0xFF);
         }

         byte[] var17 = new byte[40];
         System.arraycopy(var5.l6(var6), 0, var17, 0, 20);
         System.arraycopy(var5.l6(var15), 0, var17, 20, 20);
         int var9 = (this.u3 & 4294967295L) == 26126L ? 16 : ((this.u3 & 4294967295L) == 26127L ? 24 : ((this.u3 & 4294967295L) == 26128L ? 32 : 0));
         if (var9 == 0) {
            throw new InvalidDataException("Key length id value is invalid.");
         }

         this.t2 = new byte[var9];
         System.arraycopy(var17, 0, this.t2, 0, var9);
         this.x8 = new com.aspose.slides.internal.h3k.n5();
         this.x8.n5(var9 * 8);
         this.x8.k5(2);
         this.x8.u3(1);
         this.n3 = this.x8.n5(this.t2, null);
         this.y4 = this.x8.l6(this.t2, null);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   public final boolean n5() {
      if (this.e2) {
         throw new ObjectDisposedException(null);
      }

      this.n5(this.n5);
      byte[] var1 = new byte[16];
      this.k5(this.a6, var1);
      byte[] var2 = this.s7.l6(var1);
      this.k5(this.u9, this.u9);

      for (int var3 = 0; var3 < 14; var3++) {
         if ((this.u9[var3] & 255) != (var2[var3] & 255)) {
            return false;
         }
      }

      return true;
   }

   private byte[] n5(byte[] var1, byte[] var2) {
      if (this.e2) {
         throw new ObjectDisposedException(null);
      }

      byte[] var3 = new byte[20];
      byte[] var4 = new byte[var1.length + var2.length];
      System.arraycopy(var2, 0, var4, 0, var2.length);
      System.arraycopy(var1, 0, var4, var2.length, var1.length);
      var3 = this.s7.l6(var4);
      var4 = new byte[24];
      byte[] var5 = new byte[4];

      for (long var6 = 0L; (var6 & 4294967295L) < 50000L; var6++) {
         var5 = com.aspose.slides.ms.System.x8.n5(var6);
         System.arraycopy(var5, 0, var4, 0, 4);
         System.arraycopy(var3, 0, var4, 4, 20);
         var3 = this.s7.l6(var4);
      }

      return var3;
   }

   public final com.aspose.slides.internal.z0k.e2 n5(com.aspose.slides.internal.z0k.e2 var1) {
      if (this.e2) {
         throw new ObjectDisposedException(null);
      }

      this.n5(this.n5);
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
      byte[] var3 = new byte[8];
      var1.read(var3, 0, 8);
      long var4 = com.aspose.slides.ms.System.x8.u9(var3, 0);
      com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2((int)((var1.getLength() + 15L) / 16L) * 16);
      com.aspose.slides.internal.z0k.l6 var7 = new com.aspose.slides.internal.z0k.l6(var6);
      var2.x8().seek(8L, 0);
      byte[] var8 = new byte[16];

      for (int var9 = 0; var9 < (var1.getLength() + 15L) / 16L; var9++) {
         var2.n5(var8, 0, 16);
         this.k5(var8, var8);
         var7.n5(var8);
      }

      var2.n3();
      var6.seek(0L, 0);
      if (var6.getLength() > var4) {
         var6.setLength(var4);
      }

      return var6;
   }

   public final com.aspose.slides.internal.z0k.e2 l6() {
      if (this.e2) {
         throw new ObjectDisposedException(null);
      }

      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(248);
      com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1);
      byte[] var3 = new byte[16];
      var3[0] = 3;
      var3[2] = 2;
      var3[4] = 36;
      var3[8] = -92;
      var3[12] = 36;
      var2.n5(var3);
      var3 = new byte[16];
      var3[4] = (byte)(this.u3 & 4294967295L & 255L & 4294967295L);
      var3[5] = (byte)((this.u3 & 4294967295L & 65280L & 4294967295L) >> 8 & 4294967295L);
      var3[8] = 4;
      var3[9] = -128;
      var3[12] = -128;
      var2.n5(var3);
      var3 = new byte[16];
      var3[0] = (byte)(this.l6 & 4294967295L & 255L & 4294967295L);
      var2.n5(var3, 0, 12);
      var3 = new byte[16];
      var2.n5(com.aspose.slides.internal.l7h.j5.z1().u3("Microsoft Enhanced RSA and AES Cryptographic Provider (Prototype)\u0000"));
      this.n5(this.h0, this.c8);
      byte[] var4 = new byte[]{0, 17, 17, 34, 34, 50, 51, 67, 68, 84, 85, 69, 36, 60, 68, 4};
      var3 = new byte[4];
      var3[0] = 16;
      var2.n5(var3, 0, 4);
      var2.n5(this.c8);
      this.u9 = new byte[32];
      System.arraycopy(this.s7.l6(var4), 0, this.u9, 0, 20);
      this.n5(this.n5);
      this.l6(var4, var4);
      var2.n5(var4);
      var3 = new byte[4];
      var3[0] = 20;
      var2.n5(var3, 0, 4);
      byte[] var5 = new byte[16];
      System.arraycopy(this.u9, 0, var5, 0, 16);
      this.l6(var5, var5);
      System.arraycopy(var5, 0, this.u9, 0, 16);
      System.arraycopy(this.u9, 16, var5, 0, 16);
      this.l6(var5, var5);
      System.arraycopy(var5, 0, this.u9, 16, 16);
      var2.n5(this.u9);
      var2.n5(0, 0);
      return var1;
   }

   public final com.aspose.slides.internal.z0k.e2 n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (this.e2) {
         throw new ObjectDisposedException(null);
      }

      this.n5(this.n5);
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2((int)(var1.getLength() / 16L) * 16 + 8);
      com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var3);
      byte[] var5 = new byte[8];
      var5[0] = (byte)(var1.getLength() & 255L);
      var5[1] = (byte)((var1.getLength() & 65280L) >> 8);
      var5[2] = (byte)((var1.getLength() & 16711680L) >> 16);
      var5[3] = (byte)((var1.getLength() & 4278190080L) >> 24);
      var4.n5(var5);

      for (int var6 = 0; var6 < (var1.getLength() + 15L) / 16L; var6++) {
         var5 = new byte[16];
         var2.n5(var5, 0, 16);
         this.l6(var5, var5);
         var4.n5(var5);
      }

      var3.seek(0L, 0);
      return var3;
   }

   @Override
   public final void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   protected void n5(boolean var1) {
      if (!this.e2) {
         if (var1) {
            com.aspose.slides.internal.v6g.k5.n5(this.x8, IDisposable.class).dispose();
            this.n3.dispose();
            this.y4.dispose();
            com.aspose.slides.internal.v6g.k5.n5(this.s7, IDisposable.class).dispose();
         }

         this.e2 = true;
      }
   }

   private void l6(byte[] var1, byte[] var2) {
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var2);

      try {
         com.aspose.slides.internal.o8m.e2 var4 = new com.aspose.slides.internal.o8m.e2(var3, this.n3, 1);

         try {
            var4.write(var1, 0, var1.length);
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private void k5(byte[] var1, byte[] var2) {
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var1);

      try {
         com.aspose.slides.internal.o8m.e2 var4 = new com.aspose.slides.internal.o8m.e2(var3, this.y4, 0);

         try {
            var4.read(var2, 0, var1.length);
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }
}
