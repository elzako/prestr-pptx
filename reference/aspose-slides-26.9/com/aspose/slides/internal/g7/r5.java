package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentNullException;

public class r5 {
   private h9 n5;
   private byte[] l6;
   private byte[] k5;

   public final h9 n5() {
      return this.n5;
   }

   private void n5(h9 var1) {
      this.n5 = var1;
   }

   private void n5(byte[] var1) {
      this.l6 = var1;
   }

   public final byte[] l6() {
      return this.k5;
   }

   private void l6(byte[] var1) {
      this.k5 = var1;
   }

   public r5(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Input stream can not be null", "input");
      }

      this.n5(new h9());
      this.l6(var1);
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Output stream can not be null", "output");
      }

      byte[] var2 = new byte[this.l6().length];
      System.arraycopy(this.l6(), 0, var2, 0, this.l6().length);
      if ((this.n5().k5() & 268435456) == 268435456) {
         k5(var2);
      }

      if ((this.n5().k5() & 4) == 4) {
         var2 = u3(var2);
      }

      var1.write(var2, 0, var2.length);
   }

   private void l6(com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
      this.n5().n5(var2);
      if ((this.n5().l6().n5() & 65535) == 2 && (this.n5().l6().l6() & 65535) == 2) {
         this.n5(var2.c8((int)this.n5().c8()));
      }

      this.l6(var2.c8((int)this.n5().n5()));
   }

   private static void k5(byte[] var0) {
      byte var1 = 80;

      for (int var2 = 0; var2 < var0.length; var2++) {
         var0[var2] = (byte)(var0[var2] & 0xFF ^ 80);
      }
   }

   private static byte[] u3(byte[] var0) {
      p7 var1 = new p7(new u1(var0));
      return var1.n5();
   }
}
