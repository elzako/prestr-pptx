package com.aspose.slides.internal.g7;

class v9$a6 extends v9$k5 {
   public int[] n5;
   public short[] t2;
   public short[] s7;

   private v9$a6() {
   }

   @Override
   public int n5() {
      return this.l6 > 0 ? 10 + this.n5.length * 2 + 2 + this.c8.length + this.h0.length + this.t2.length * 2 + this.s7.length * 2 : 0;
   }

   @Override
   public void n5(q0 var1) {
      if (this.l6 > 0) {
         var1.n5(this.l6);
         var1.n5(this.k5);
         var1.n5(this.u3);
         var1.n5(this.a6);
         var1.n5(this.u9);

         for (int var2 = 0; var2 < this.n5.length; var2++) {
            var1.k5(this.n5[var2]);
         }

         var1.k5(this.c8.length & 65535);

         for (int var3 = 0; var3 < this.c8.length; var3++) {
            var1.n5(this.c8[var3]);
         }

         for (int var4 = 0; var4 < this.h0.length; var4++) {
            var1.n5(this.h0[var4]);
         }

         for (int var5 = 0; var5 < this.t2.length; var5++) {
            var1.n5(this.t2[var5]);
         }

         for (int var6 = 0; var6 < this.s7.length; var6++) {
            var1.n5(this.s7[var6]);
         }
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/g7/v9$1;)V -> ()V
   v9$a6(com.aspose.slides.internal.g7.v9$1 recoveredArg0) {
      this();
   }
}
