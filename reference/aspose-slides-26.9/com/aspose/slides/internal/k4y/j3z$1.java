package com.aspose.slides.internal.k4y;

class j3z$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j3z l6;

   j3z$1(j3z var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j3z.u9().n5(this.n5.n3())) {
         case 0:
            j3z.n5(this.l6, new f4l(this.n5));
            break;
         case 1:
            j3z.n5(this.l6, new i8n(this.n5));
            break;
         case 2:
            r1x var2 = new r1x(this.n5);
            j3z.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
