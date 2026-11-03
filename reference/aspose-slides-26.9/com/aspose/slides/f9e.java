package com.aspose.slides;

class f9e extends p7m {
   f9e(g3y[] var1, w3 var2, w3 var3) {
      super(var2, var3);

      for (g3y var7 : var1) {
         n7e var8 = new n7e(this, var7);
         this.n5.addItem(var8);
         this.n5(var8);
      }

      this.h0();
      this.n5(var1[0].u9());
   }

   @Override
   protected void l6() {
      for (v6g var4 : this.a0()) {
         var4.U_();
      }
   }
}
