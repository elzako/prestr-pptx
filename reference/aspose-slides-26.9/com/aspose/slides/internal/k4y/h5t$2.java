package com.aspose.slides.internal.k4y;

class h5t$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final h5t l6;

   h5t$2(h5t var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (h5t.a6().n5(this.n5.n3())) {
         case 1:
            h5t.n5(this.l6, new g7("noFill", new u4k(this.n5)));
            break;
         case 2:
            h5t.n5(this.l6, new g7("solidFill", new e2l(this.n5)));
            break;
         case 3:
            h5t.n5(this.l6, new g7("gradFill", new j2p(this.n5)));
            break;
         case 4:
            h5t.n5(this.l6, new g7("blipFill", new e3(this.n5)));
            break;
         case 5:
            h5t.n5(this.l6, new g7("pattFill", new n9q(this.n5)));
            break;
         case 6:
            h5t.n5(this.l6, new g7("grpFill", new r6i(this.n5)));
            break;
         case 7:
            h5t.l6(this.l6, new g7("effectLst", new o9b(this.n5)));
            break;
         case 8:
            h5t.l6(this.l6, new g7("effectDag", new f8y(this.n5)));
            break;
         case 9:
            h5t.n5(this.l6, new y1g(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
