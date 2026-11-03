package com.aspose.slides;

class z8m extends p7m {
   z8m(g3y[] var1, w3 var2, w3 var3) {
      super(var2, var3);

      for (g3y var7 : var1) {
         o7b var8 = new o7b(this, var7);
         this.n5.addItem(var8);
         this.n5(var8);
      }

      this.h0();
   }

   @Override
   public int O_() {
      return 2;
   }

   @Override
   protected void l6() {
      for (v6g var4 : this.a0()) {
         var4.U_();
      }
   }
}
