package com.aspose.slides.internal.k4y;

class a8e$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a8e l6;

   a8e$1(a8e var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a8e.h0().n5(this.n5.n3())) {
         case 0:
            a8e.n5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  a8e.n5(this.l6, com.aspose.slides.ms.System.d1.n5(a8e.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 1:
            a8e.n5(this.l6, new b8n(this.n5));
            break;
         case 2:
            o8r var2 = new o8r(this.n5);
            a8e.l6(this.l6).addItem(var2);
            break;
         case 3:
            a8e.n5(this.l6, new a9t(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
