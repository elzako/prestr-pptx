package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;

public abstract class q1 extends u8 {
   protected q1() {
      this.a6 = 192;
      this.k5 = 64;
      this.t2 = 8;
      this.c8 = new e5[1];
      this.c8[0] = new e5(128, 192, 64);
      this.h0 = new e5[1];
      this.h0[0] = new e5(64, 64, 0);
   }

   @Override
   public byte[] u3() {
      if (this.u9 == null) {
         this.n5();

         while (n5(this.u9)) {
            this.n5();
         }
      }

      return (byte[])this.u9.clone();
   }

   @Override
   public void k5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Key");
      }

      if (n5(var1)) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Weak Key"));
      }

      this.u9 = (byte[])var1.clone();
   }

   public static boolean n5(byte[] var0) {
      if (var0 == null) {
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Null Key"));
      }

      if (var0.length == 16) {
         for (int var1 = 0; var1 < 8; var1++) {
            if (var0[var1] != var0[var1 + 8]) {
               return false;
            }
         }
      } else {
         if (var0.length != 24) {
            throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Wrong Key Length"));
         }

         boolean var3 = true;

         for (int var2 = 0; var2 < 8; var2++) {
            if (var0[var2] != var0[var2 + 8]) {
               var3 = false;
               break;
            }
         }

         if (!var3) {
            for (int var4 = 8; var4 < 16; var4++) {
               if (var0[var4] != var0[var4 + 8]) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   public static q1 k5() {
      return n5(u5.class.getName());
   }

   public static q1 n5(String var0) {
      return (q1)y4.n5(var0);
   }
}
