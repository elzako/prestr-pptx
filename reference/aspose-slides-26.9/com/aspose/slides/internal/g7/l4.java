package com.aspose.slides.internal.g7;

class l4 {
   private a5 n5;
   private d1 l6;
   private s0 k5;

   public l4(d1 var1, a5 var2) {
      this.n5 = var2;
      this.l6 = var1;
      this.k5 = new s0(var2);
   }

   final void n5(y8 var1, byte[] var2, int var3, int var4) {
      p8 var5 = new p8();
      s3 var6 = new s3(var5, var1.n5(), false);
      var5.n5(var6);
      var5.l6(new m1(var2, var3, var4));
      if (var1.n5().j5 > 0L && var1.n5().z8 > 0L) {
         this.n5.n5(var1.n5().j5);
         int var7 = (int)var1.n5().z8;
         byte[] var8 = new byte[var7];

         for (int var9 = 0; var9 < var8.length; var9++) {
            var8[var9] = this.n5.k5();
         }

         f5 var11 = new f5();
         i9 var10 = new i9(var11, var1.l6());
         var11.n5(var10);
         var11.l6(new m1(var8));
         if (var1.l6().k5 != Long.MIN_VALUE) {
            this.n5.n5(var1.n5().j5 + var1.l6().k5);
            this.k5.n5(var1.u3());
         }
      }

      var1.k5().n5(this.l6.n5(com.aspose.slides.internal.v6g.k5.k5(var1.u3().k5(), 9)));
   }
}
