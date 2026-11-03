package com.aspose.slides.internal.c8m;

class a8 {
   private h5[] n5 = new h5[0];

   public final h5 n5(int var1) {
      return this.n5[var1];
   }

   final int n5(z5 var1) {
      String var2 = com.aspose.slides.internal.z0k.z1.u9(var1.l6());

      for (int var3 = 0; var3 < this.n5.length; var3++) {
         if (com.aspose.slides.ms.System.d1.a6(this.n5[var3].n5(), var2)) {
            return var3;
         }
      }

      h5[] var4 = new h5[this.n5.length + 1];
      System.arraycopy(this.n5, 0, var4, 0, this.n5.length);
      var4[var4.length - 1] = new h5(var2, var1.l6());
      this.n5 = var4;
      return this.n5.length - 1;
   }
}
