package com.aspose.slides.internal.k4y;

class n7n$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final n7n l6;

   n7n$1(n7n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (n7n.u9().n5(this.n5.n3())) {
         case 0:
            n7n.n5(this.l6, new f1t(this.n5));
            break;
         case 1:
            n7n.n5(this.l6, new e3(this.n5));
            break;
         case 2:
            n7n.n5(this.l6, new b9y(this.n5));
            break;
         case 3:
            n7n.n5(this.l6, new d9m(this.n5));
            break;
         case 4:
            n7n.n5(this.l6, new j9y(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
