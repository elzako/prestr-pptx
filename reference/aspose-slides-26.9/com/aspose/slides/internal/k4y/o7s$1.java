package com.aspose.slides.internal.k4y;

class o7s$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o7s l6;

   o7s$1(o7s var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o7s.n5().n5(this.n5.n3())) {
         case 0:
            f7p var2 = new f7p(this.n5);
            o7s.n5(this.l6).addItem(new g7("area-rectangle", var2));
            break;
         case 1:
            z2d var3 = new z2d(this.n5);
            o7s.n5(this.l6).addItem(new g7("area-circle", var3));
            break;
         case 2:
            w6g var4 = new w6g(this.n5);
            o7s.n5(this.l6).addItem(new g7("area-polygon", var4));
            break;
         default:
            return false;
      }

      return true;
   }
}
