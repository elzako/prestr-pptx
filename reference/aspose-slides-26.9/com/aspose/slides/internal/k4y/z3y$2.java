package com.aspose.slides.internal.k4y;

class z3y$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z3y l6;

   z3y$2(z3y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z3y.n5().n5(this.n5.n3())) {
         case 1:
            g7u var2 = new g7u(this.n5);
            z3y.n5(this.l6).addItem(new g7("cell-content-change", var2));
            break;
         case 2:
            r8r var3 = new r8r(this.n5);
            z3y.n5(this.l6).addItem(new g7("insertion", var3));
            break;
         case 3:
            s6y var4 = new s6y(this.n5);
            z3y.n5(this.l6).addItem(new g7("deletion", var4));
            break;
         case 4:
            y2w var5 = new y2w(this.n5);
            z3y.n5(this.l6).addItem(new g7("movement", var5));
            break;
         default:
            return false;
      }

      return true;
   }
}
