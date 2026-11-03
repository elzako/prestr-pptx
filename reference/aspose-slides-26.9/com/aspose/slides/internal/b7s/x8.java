package com.aspose.slides.internal.b7s;

public class x8 {
   private final com.aspose.slides.internal.y4u.s7 n5;
   private final int l6;
   private final int k5;

   public x8(com.aspose.slides.internal.y4u.s7 var1, int var2, int var3) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = var3;
   }

   public final byte[] n5(byte[][] var1, com.aspose.slides.internal.o9b.y2 var2) {
      byte[] var3 = new byte[var2.l6() * var2.t2() * this.k5];
      this.n5.n5(var2.n3(), var1, 0, var3, 0, this.l6);
      return var3;
   }
}
