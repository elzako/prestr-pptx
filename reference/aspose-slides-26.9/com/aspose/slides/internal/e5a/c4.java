package com.aspose.slides.internal.e5a;

import com.aspose.slides.exceptions.ArgumentException;

public class c4 {
   private long[] n5 = new long[]{305419896L, 591751049L, 878082192L};
   private h0 l6 = new h0();

   private c4() {
   }

   public static c4 n5(String var0) {
      c4 var1 = new c4();
      if (var0 == null) {
         throw new u3("This entry requires a password.");
      }

      var1.l6(var0);
      return var1;
   }

   public static c4 n5(String var0, y2 var1) {
      com.aspose.slides.internal.z0k.t4 var2 = var1.z8;
      var1.m3 = new byte[12];
      byte[] var3 = var1.m3;
      c4 var4 = new c4();
      if (var0 == null) {
         throw new u3("This entry requires a password.");
      }

      var4.l6(var0);
      y2.n5(var2, var3);
      byte[] var5 = var4.n5(var3, var3.length);
      if ((var5[11] & 255) != ((byte)(var1.n3 >> 24 & 0xFF) & 255)) {
         if ((var1.a6 & 8) != 8) {
            throw new u3("The password did not match.");
         }

         if ((var5[11] & 255) != ((byte)(var1.x8 >> 8 & 0xFF) & 255)) {
            throw new u3("The password did not match.");
         }
      }

      return var4;
   }

   private byte n5() {
      int var1 = ((int)(this.n5[2] & 4294967295L & 65535L & 4294967295L & 65535L) & 65535 | 2) & 65535;
      return (byte)((var1 & 65535) * (var1 & 65535 ^ 1) >> 8);
   }

   public final byte[] n5(byte[] var1, int var2) {
      if (var1 == null) {
         throw new a0("Cannot decrypt.", new ArgumentException("Bad length during Decryption: cipherText must be non-null.", "cipherText"));
      }

      if (var2 > var1.length) {
         throw new a0(
            "Cannot decrypt.",
            new ArgumentException(
               "Bad length during Decryption: the length parameter must be smaller than or equal to the size of the destination array.", "length"
            )
         );
      }

      byte[] var3 = new byte[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         byte var5 = (byte)(var1[var4] & 0xFF ^ this.n5() & 0xFF);
         this.n5(var5);
         var3[var4] = var5;
      }

      return var3;
   }

   public final byte[] l6(byte[] var1, int var2) {
      if (var1 == null) {
         throw new a0("Cannot encrypt.", new ArgumentException("Bad length during Encryption: the plainText must be non-null.", "plaintext"));
      }

      if (var2 > var1.length) {
         throw new a0(
            "Cannot encrypt.",
            new ArgumentException(
               "Bad length during Encryption: The length parameter must be smaller than or equal to the size of the destination array.", "length"
            )
         );
      }

      byte[] var3 = new byte[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         byte var5 = var1[var4];
         var3[var4] = (byte)(var1[var4] & 0xFF ^ this.n5() & 0xFF);
         this.n5(var5);
      }

      return var3;
   }

   public final void l6(String var1) {
      byte[] var2 = k7.k5(var1);

      for (int var3 = 0; var3 < var1.length(); var3++) {
         this.n5(var2[var3]);
      }
   }

   private void n5(byte var1) {
      this.n5[0] = this.l6.n5((int)this.n5[0], var1) & 4294967295L;
      this.n5[1] = (this.n5[1] & 4294967295L) + ((byte)this.n5[0] & 0xFF) & 4294967295L;
      this.n5[1] = ((this.n5[1] & 4294967295L) * 134775813L & 4294967295L) + 1L & 4294967295L;
      this.n5[2] = this.l6.n5((int)this.n5[2], (byte)((this.n5[1] & 4294967295L) >> 24 & 4294967295L)) & 4294967295L;
   }
}
