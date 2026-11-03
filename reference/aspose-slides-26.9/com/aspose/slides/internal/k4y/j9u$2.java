package com.aspose.slides.internal.k4y;

class j9u$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j9u l6;

   j9u$2(j9u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j9u.a6().n5(this.n5.n3())) {
         case 3:
            w1j var2 = new w1j(this.n5);
            j9u.n5(this.l6).addItem(var2);
            break;
         case 4:
            j9u.n5(this.l6, new k8l(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
