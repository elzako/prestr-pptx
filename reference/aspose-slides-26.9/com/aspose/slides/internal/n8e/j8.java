package com.aspose.slides.internal.n8e;

import java.math.BigInteger;

class j8 {
   BigInteger n5;
   BigInteger l6;

   public j8(byte[] var1, byte[] var2) {
      this.n5 = new BigInteger(1, var1);
      this.l6 = new BigInteger(1, var2);
   }

   public byte[] n5(byte[] var1) {
      if (var1 != null && var1.length >= 1) {
         BigInteger var2 = new BigInteger(1, var1);
         BigInteger var3 = var2.modPow(this.l6, this.n5);
         return var3.toByteArray();
      } else {
         return new byte[0];
      }
   }

   public BigInteger n5() {
      return this.n5;
   }
}
