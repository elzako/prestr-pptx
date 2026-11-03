package com.aspose.slides.internal.x8w;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.o8m.i9;

public class w1$n5 {
   private String n5;
   private byte[] l6;
   private int k5;
   private byte[] u3;

   public w1$n5() {
   }

   public w1$n5(byte[] var1) {
      this();
      this.n5(var1);
   }

   public String n5() {
      return this.n5;
   }

   public byte[] l6() {
      return this.u3 == null ? null : (byte[])this.u3.clone();
   }

   public byte[] k5() {
      if (this.l6 == null) {
         i9 var1 = i9.n5();
         this.l6 = new byte[8];
         var1.n5(this.l6);
      }

      return (byte[])this.l6.clone();
   }

   public int u3() {
      return this.k5;
   }

   private void n5(byte[] var1) {
      l6 var2 = new l6(var1);
      if (var2.l6() != 48) {
         throw new CryptographicException("invalid EncryptedPrivateKeyInfo");
      }

      l6 var3 = var2.n5(0);
      if (var3.l6() != 48) {
         throw new CryptographicException("invalid encryptionAlgorithm");
      }

      l6 var4 = var3.n5(0);
      if (var4.l6() != 6) {
         throw new CryptographicException("invalid algorithm");
      }

      this.n5 = com.aspose.slides.internal.x8w.k5.l6(var4);
      if (var3.n5() > 1) {
         l6 var5 = var3.n5(1);
         if (var5.l6() != 48) {
            throw new CryptographicException("invalid parameters");
         }

         l6 var6 = var5.n5(0);
         if (var6.l6() != 4) {
            throw new CryptographicException("invalid salt");
         }

         this.l6 = var6.u3();
         l6 var7 = var5.n5(1);
         if (var7.l6() != 2) {
            throw new CryptographicException("invalid iterationCount");
         }

         this.k5 = com.aspose.slides.internal.x8w.k5.n5(var7);
      }

      l6 var8 = var2.n5(1);
      if (var8.l6() != 4) {
         throw new CryptographicException("invalid EncryptedData");
      }

      this.u3 = var8.u3();
   }
}
