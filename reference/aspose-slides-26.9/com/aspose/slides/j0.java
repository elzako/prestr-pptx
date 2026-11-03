package com.aspose.slides;

class j0 extends p7m {
   j0(g3y[] var1, w3 var2, w3 var3) {
      super(var2, var3);

      for (g3y var7 : var1) {
         e6 var8 = new e6(this, var7);
         this.n5.addItem(var8);
         this.n5(var8);
      }

      this.h0();
   }

   final double u3() {
      double var1 = 0.0;

      for (int var3 = 0; var3 < this.n5.size(); var3++) {
         f7c var4 = this.n5.get_Item(var3);
         boolean var5 = var4.e2().u9().z1();

         for (int var6 = 0; var6 < var4.l6.size(); var6++) {
            if (!var4.l6.get_Item(var6).e2().c8()) {
               double var7 = var4.l6.get_Item(var6).e2().k5();
               if (var5) {
                  var7 = com.aspose.slides.ms.System.q1.n5(var7);
               }

               if (var1 < var7) {
                  var1 = var7;
               }
            }
         }
      }

      return var1;
   }
}
