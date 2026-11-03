package com.aspose.slides.internal.m4d;

class u3$n5 {
   private byte n5;
   private com.aspose.slides.internal.j3b.u3 l6;

   public u3$n5(byte var1, com.aspose.slides.internal.j3b.u3 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public byte n5() {
      return this.n5;
   }

   public com.aspose.slides.internal.j3b.u3 l6() {
      return this.l6;
   }

   public u3$n5 k5() {
      if (this.l6 != null) {
         this.n5 = 1;

         short var1;
         for (var1 = 2; var1 < this.l6.n5(); this.n5++) {
            var1 <<= 1;
         }

         if ((this.n5 & 255) > 8) {
            this.n5 = 8;
            var1 = 256;
         }

         if (var1 != this.l6.n5()) {
            int[] var2 = this.l6.l6();
            int[] var3 = com.aspose.slides.internal.q9u.n5.n5(var1);
            int var4 = Math.min(var3.length, var2.length);
            System.arraycopy(var2, 0, var3, 0, var4);
            this.l6 = new com.aspose.slides.internal.y5s.h0(var3);
         }

         if ((this.n5 & 255) < 2) {
            this.n5 = 2;
         }
      }

      return this;
   }
}
