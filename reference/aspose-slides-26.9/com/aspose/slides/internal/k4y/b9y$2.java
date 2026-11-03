package com.aspose.slides.internal.k4y;

class b9y$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final b9y l6;

   b9y$2(b9y var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (b9y.e2().n5(this.n5.n3())) {
         case 1:
            b9y.n5(this.l6, new e8b(this.n5));
            break;
         case 2:
            b9y.n5(this.l6, new g7("custGeom", new u1s(this.n5)));
            break;
         case 3:
            b9y.n5(this.l6, new g7("prstGeom", new r7n(this.n5)));
            break;
         case 4:
            b9y.l6(this.l6, new g7("noFill", new u4k(this.n5)));
            break;
         case 5:
            b9y.l6(this.l6, new g7("solidFill", new e2l(this.n5)));
            break;
         case 6:
            b9y.l6(this.l6, new g7("gradFill", new j2p(this.n5)));
            break;
         case 7:
            b9y.l6(this.l6, new g7("blipFill", new e3(this.n5)));
            break;
         case 8:
            b9y.l6(this.l6, new g7("pattFill", new n9q(this.n5)));
            break;
         case 9:
            b9y.l6(this.l6, new g7("grpFill", new r6i(this.n5)));
            break;
         case 10:
            b9y.n5(this.l6, new r5w(this.n5));
            break;
         case 11:
            b9y.k5(this.l6, new g7("effectLst", new o9b(this.n5)));
            break;
         case 12:
            b9y.k5(this.l6, new g7("effectDag", new f8y(this.n5)));
            break;
         case 13:
            b9y.n5(this.l6, new h6l(this.n5));
            break;
         case 14:
            b9y.n5(this.l6, new q9u(this.n5));
            break;
         case 15:
            b9y.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
