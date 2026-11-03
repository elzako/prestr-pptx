package com.aspose.slides.internal.n8e;

import java.io.ByteArrayOutputStream;

class p6 {
   private boolean n5 = false;
   private byte[] l6;
   private int[] k5;

   p6(byte[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if ((var1[var2] & 255) > 128 && (var1[var2] & 255) < 192) {
            this.n5 = true;
            break;
         }
      }

      this.l6 = var1;
   }

   void n5(int var1, int var2, boolean var3) {
      if (this.l6.length >= 16) {
         if ((this.l6[3] & 255) == var1) {
            this.l6[15] = (byte)n5(var2);
         }

         for (int var4 = 0; var4 < 10; var4++) {
            this.l6[var4] = (byte)(var3 ? 3 : 54);
         }
      }
   }

   static int n5(int var0) {
      return var0 * var0 + 10;
   }

   boolean n5(ByteArrayOutputStream var1, byte[] var2, int var3) throws Exception {
      if (var3 > 100) {
         this.n5 = !this.n5;
      }

      if (var1 != null) {
         var1.write(var2, 0, var2.length);
      }

      this.k5 = new int[var2.length];

      for (int var4 = 0; var4 < var2.length; var4++) {
         this.k5[var4] = var2[var4] & 255;
      }

      if (b5.k5() == 48) {
         b5.l6(255);
      }

      return var2.length == 65535;
   }

   boolean n5() {
      return this.n5;
   }

   void n5(boolean var1) {
      this.n5 = var1;
   }

   int[] l6() {
      return this.k5;
   }
}
