package com.aspose.slides.internal.k4y;

class g1l$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final g1l l6;

   g1l$1(g1l var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (g1l.l6().n5(this.n5.n3())) {
         case 0:
            String var2 = this.n5.c4();
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  var2 = com.aspose.slides.ms.System.d1.n5(var2, this.n5.c4());
               }

               g1l.n5(this.l6).addItem(var2);
            }

            return true;
         default:
            return false;
      }
   }
}
