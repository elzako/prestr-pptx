package com.aspose.slides.internal.k4y;

class u6g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final u6g l6;

   u6g$1(u6g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (u6g.n5().n5(this.n5.n3())) {
         case 0:
            r3d var2 = new r3d(this.n5);
            u6g.n5(this.l6).addItem(new g7("named-range", var2));
            break;
         case 1:
            e3e var3 = new e3e(this.n5);
            u6g.n5(this.l6).addItem(new g7("named-expression", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
