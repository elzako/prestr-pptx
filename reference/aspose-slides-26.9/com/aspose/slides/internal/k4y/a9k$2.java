package com.aspose.slides.internal.k4y;

class a9k$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final a9k l6;

   a9k$2(a9k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (a9k.u9().n5(this.n5.n3())) {
         case 1:
            a9k.n5(this.l6, new f2z(this.n5));
            break;
         case 2:
            a9k.l6(this.l6, new f2z(this.n5));
            break;
         case 3:
            p4u var2 = new p4u(this.n5);
            a9k.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
