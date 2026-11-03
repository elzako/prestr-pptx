package com.aspose.slides.internal.k4y;

class q0h$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final q0h l6;

   q0h$1(q0h var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (q0h.c8().n5(this.n5.n3())) {
         case 0:
            q0h.n5(this.l6, new i8n(this.n5));
            break;
         case 1:
            q0h.l6(this.l6, new i8n(this.n5));
            break;
         case 2:
            q0h.k5(this.l6, new i8n(this.n5));
            break;
         case 3:
            q0h.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
