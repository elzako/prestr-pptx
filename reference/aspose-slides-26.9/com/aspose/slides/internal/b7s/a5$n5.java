package com.aspose.slides.internal.b7s;

class a5$n5 implements com.aspose.slides.internal.b8u.e2 {
   private final byte[] n5;
   private final com.aspose.slides.internal.o9b.y2 l6 = new com.aspose.slides.internal.o9b.y2();
   private final int k5;
   private final com.aspose.slides.internal.b8u.t9 u3;

   public a5$n5(byte[] var1, com.aspose.slides.internal.o9b.y2 var2, int var3, com.aspose.slides.internal.b8u.t9 var4) {
      this.n5 = var1;
      var2.u3(this.l6);
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1) {
      if (var1.s7() == this.l6.s7() && var1.x8() == this.l6.x8() && var1.t2() == this.l6.t2() && var1.l6() == this.l6.l6()) {
         this.u3
            .n5(var1.n3(), this.n5, new com.aspose.slides.internal.o9b.j5(var1.s7(), var1.x8()), new com.aspose.slides.internal.o9b.j5(var1.u9(), var1.n5()));
      } else {
         int var2 = var1.x8() - this.l6.x8();
         int var3 = var1.s7() - this.l6.s7();
         int var4 = (var2 * this.l6.t2() + var3) * this.k5;
         int var5 = 0;
         int var6 = this.l6.t2() * this.k5;
         int var7 = var1.t2() * this.k5;
         byte[] var8 = new byte[var1.t2() * var1.l6() * this.k5];

         for (int var9 = 0; var9 < var1.l6(); var9++) {
            System.arraycopy(this.n5, var4, var8, var5, var7);
            var4 += var6;
            var5 += var7;
         }

         this.u3.n5(var1.n3(), var8, new com.aspose.slides.internal.o9b.j5(var1.s7(), var1.x8()), new com.aspose.slides.internal.o9b.j5(var1.u9(), var1.n5()));
      }
   }
}
