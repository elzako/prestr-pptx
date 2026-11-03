package com.aspose.slides.internal.k4y;

class t4g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t4g l6;

   t4g$1(t4g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t4g.n5().n5(this.n5.n3())) {
         case 0:
            q3d var2 = new q3d(this.n5);
            t4g.n5(this.l6).addItem(new g7("insertion-cut-off", var2));
            break;
         case 1:
            j4t var3 = new j4t(this.n5);
            t4g.n5(this.l6).addItem(new g7("movement-cut-off", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
