package com.aspose.slides.internal.k4y;

class r2h$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r2h l6;

   r2h$1(r2h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r2h.c8().n5(this.n5.n3())) {
         case 0:
            r2h.n5(this.l6, new r3n(this.n5));
            break;
         case 1:
            r2h.n5(this.l6, new g3p(this.n5));
            break;
         case 2:
            r2h.l6(this.l6, new g3p(this.n5));
            break;
         case 3:
            r2h.n5(this.l6, new q6z(this.n5));
            break;
         case 4:
            r2h.n5(this.l6, new i6m(this.n5));
            break;
         case 5:
            r2h.n5(this.l6, new r6c(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
