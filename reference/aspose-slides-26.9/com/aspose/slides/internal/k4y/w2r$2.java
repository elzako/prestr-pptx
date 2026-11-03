package com.aspose.slides.internal.k4y;

class w2r$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final w2r l6;

   w2r$2(w2r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (w2r.n5().n5(this.n5.n3())) {
         case 3:
            w2r.n5(this.l6, new g7("fldData", new t5l(this.n5)));
            break;
         case 4:
            w2r.n5(this.l6, new g7("ffData", new h6e(this.n5)));
            break;
         case 5:
            w2r.n5(this.l6, new g7("numberingChange", new d6a(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
