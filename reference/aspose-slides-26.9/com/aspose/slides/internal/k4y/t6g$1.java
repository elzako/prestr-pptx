package com.aspose.slides.internal.k4y;

class t6g$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final t6g l6;

   t6g$1(t6g var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (t6g.k5().n5(this.n5.n3())) {
         case 0:
            t6g.n5(this.l6, new c3d(this.n5));
            break;
         case 1:
            t6g.n5(this.l6, new p6k(this.n5));
            break;
         case 2:
            t6g.n5(this.l6, new g7("spMk", new o9n(this.n5)));
            break;
         case 3:
            t6g.n5(this.l6, new g7("grpSpMk", new o9n(this.n5)));
            break;
         case 4:
            t6g.n5(this.l6, new g7("graphicFrameMk", new o9n(this.n5)));
            break;
         case 5:
            t6g.n5(this.l6, new g7("cxnSpMk", new o9n(this.n5)));
            break;
         case 6:
            t6g.n5(this.l6, new g7("picMk", new o9n(this.n5)));
            break;
         case 7:
            t6g.n5(this.l6, new g7("inkMk", new o9n(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
