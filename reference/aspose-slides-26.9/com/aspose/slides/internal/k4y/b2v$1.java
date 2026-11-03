package com.aspose.slides.internal.k4y;

class b2v$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b2v l6;

   b2v$1(b2v var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b2v.n5().n5(this.n5.n3())) {
         case 0:
            b2v.n5(this.l6, new g7("sp3d", new q9u(this.n5)));
            break;
         case 1:
            b2v.n5(this.l6, new g7("flatTx", new p6w(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
