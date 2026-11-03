package com.aspose.slides.internal.k4y;

class w1x$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w1x l6;

   w1x$2(w1x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w1x.u3().n5(this.n5.n3())) {
         case 4:
            p6d var2 = new p6d(this.n5);
            w1x.n5(this.l6).addItem(new g7("table-cell", var2));
            break;
         case 5:
            s6g var3 = new s6g(this.n5);
            w1x.n5(this.l6).addItem(new g7("covered-table-cell", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
