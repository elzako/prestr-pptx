package com.aspose.slides.internal.k4y;

class o9q$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o9q l6;

   o9q$2(o9q var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o9q.n5().n5(this.n5.n3())) {
         case 17:
            p4d var2 = new p4d(this.n5);
            o9q.n5(this.l6).addItem(var2);
            break;
         case 18:
            o9q.n5(this.l6, new l0k(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
