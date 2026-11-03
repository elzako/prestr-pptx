package com.aspose.slides.internal.n8e;

import java.io.ByteArrayOutputStream;

class d1 {
   private ByteArrayOutputStream n5 = new ByteArrayOutputStream();
   private byte l6 = 0;
   private byte k5 = -1;
   private byte[] u3;
   private int a6 = 0;
   private ByteArrayOutputStream u9 = new ByteArrayOutputStream();
   private p6 h0;
   private p6 c8;

   d1(p6 var1, byte[] var2, boolean var3, boolean var4) throws Exception {
      if (var3 != var4) {
         this.l6 = var2[0];
         this.k5 = var2[1];
      }

      this.n5.write(var2, 0, var2.length);
      if (this.n5(var2)) {
         this.a6 = 10;
      }

      if (!var1.n5()) {
         p6.n5(0);
      }

      this.h0 = var1;
   }

   boolean n5(byte[] var1) {
      this.u3 = new byte[var1.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         this.u3[var2] = (byte)(var1[var2] & 0xFF & 128);
         this.u3[var2] = (byte)(this.u3[var2] | 2);
      }

      return (this.u3[0] & 255 & 8) == 8;
   }

   boolean n5(byte[] var1, String var2) throws Exception {
      var1 = var2.getBytes();
      this.u9.write(var1, 0, var1.length);
      this.k5();
      return this.u9.size() < 16;
   }

   p6 n5(int[] var1, p6 var2) {
      this.c8 = var2;
      return this.h0;
   }

   void n5(boolean var1) throws Exception {
      if (var1) {
         this.l6 = 0;
      }

      if (this.n5.size() > 0) {
         int var2 = this.n5.size() / 2 + 1;
         byte[] var3 = this.n5.toByteArray();
         if (b5.k5() == 255) {
            b5.l6(128);
         }

         int var4 = var3.length - 1;

         for (int var5 = 0; var5 < var2; var5++) {
            if ((var3[var4] & 255) == 255) {
               this.a6++;
            }

            if (var3[var4] != (byte)this.c8.l6()[var4]) {
               b5.n5(128);
            }

            var4--;
         }
      }
   }

   void n5(String var1, boolean var2) throws Exception {
      s4 var3 = new s4(this);
      int[] var4 = var3.n5(5, 5);
      if (var4.length >= 10) {
         this.k5 = (byte)var4[9];
      }
   }

   private void k5() {
      if (this.a6 != 10) {
         this.a6 += 5;
      }

      this.l6--;
   }

   ByteArrayOutputStream n5() {
      return this.n5;
   }

   p6 l6() {
      return this.c8;
   }
}
