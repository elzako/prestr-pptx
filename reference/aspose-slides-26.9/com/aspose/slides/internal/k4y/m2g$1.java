package com.aspose.slides.internal.k4y;

class m2g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m2g l6;

   m2g$1(m2g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m2g.n5().n5(this.n5.n3())) {
         case 0:
            q8j var2 = new q8j(this.n5);
            m2g.n5(this.l6).addItem(new g7("cell-content-deletion", var2));
            break;
         case 1:
            n2v var3 = new n2v(this.n5);
            m2g.n5(this.l6).addItem(new g7("change-deletion", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
