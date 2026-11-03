package com.aspose.slides.internal.k4y;

class h1u$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h1u l6;

   h1u$1(h1u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h1u.a6().n5(this.n5.n3())) {
         case 0:
            r0a var2 = new r0a(this.n5);
            h1u.n5(this.l6).addItem(new g7("cxnSp", var2));
            return true;
         default:
            return false;
      }
   }
}
