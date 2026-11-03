package com.aspose.slides.internal.k4y;

class j0$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final j0 l6;

   j0$1(j0 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (j0.l6().n5(this.n5.n3())) {
         case 0:
            j0.n5(this.l6, new g7("oMathPara", new m1r(this.n5)));
            break;
         case 1:
            j0.n5(this.l6, new g7("oMath", new o3d(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
