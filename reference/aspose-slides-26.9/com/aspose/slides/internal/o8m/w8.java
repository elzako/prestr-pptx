package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.CryptographicException;

class w8 extends w5 {
   private q0 n5;
   private q0 l6;
   private q0 k5;
   private q0 u3;
   private q0 a6;
   private q0 u9;

   public w8(q1 var1, boolean var2, byte[] var3, byte[] var4) {
      super(var1, var2, var4);
      if (var3 == null) {
         var3 = a6();
      }

      if (q1.n5(var3)) {
         String var9 = com.aspose.slides.internal.x8w.z3.n5("This is a known weak key.");
         throw new CryptographicException(var9);
      }

      byte[] var5 = new byte[8];
      byte[] var6 = new byte[8];
      byte[] var7 = new byte[8];
      z1 var8 = z1.k5();
      com.aspose.slides.ms.System.y4.n5(var3, 0, var5, 0, 8);
      com.aspose.slides.ms.System.y4.n5(var3, 8, var6, 0, 8);
      if (var3.length == 16) {
         com.aspose.slides.ms.System.y4.n5(var3, 0, var7, 0, 8);
      } else {
         com.aspose.slides.ms.System.y4.n5(var3, 16, var7, 0, 8);
      }

      if (!var2 && var1.n3() != 4) {
         this.u3 = new q0(var8, false, var7, var4);
         this.a6 = new q0(var8, true, var6, var4);
         this.u9 = new q0(var8, false, var5, var4);
      } else {
         this.n5 = new q0(var8, true, var5, var4);
         this.l6 = new q0(var8, false, var6, var4);
         this.k5 = new q0(var8, true, var7, var4);
      }
   }

   @Override
   protected void l6(byte[] var1, byte[] var2) {
      q0.n5(var1, var2, q0.a6, false);
      if (this.y4) {
         this.n5.n5(var2, var2);
         this.l6.n5(var2, var2);
         this.k5.n5(var2, var2);
      } else {
         this.u3.n5(var2, var2);
         this.a6.n5(var2, var2);
         this.u9.n5(var2, var2);
      }

      q0.n5(var2, var2, q0.u9, true);
   }

   static byte[] a6() {
      int var0 = q0.u3 * 3;
      byte[] var1 = com.aspose.slides.internal.x8w.t4.n5(var0);

      while (q1.n5(var1)) {
         var1 = com.aspose.slides.internal.x8w.t4.n5(var0);
      }

      return var1;
   }
}
