package com.aspose.slides.internal.k4y;

class r5w$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r5w l6;

   r5w$2(r5w var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r5w.y4().n5(this.n5.n3())) {
         case 4:
            r5w.n5(this.l6, new g7("noFill", new u4k(this.n5)));
            break;
         case 5:
            r5w.n5(this.l6, new g7("solidFill", new e2l(this.n5)));
            break;
         case 6:
            r5w.n5(this.l6, new g7("gradFill", new j2p(this.n5)));
            break;
         case 7:
            r5w.n5(this.l6, new g7("pattFill", new n9q(this.n5)));
            break;
         case 8:
            r5w.l6(this.l6, new g7("prstDash", new f3l(this.n5)));
            break;
         case 9:
            r5w.l6(this.l6, new g7("custDash", new e5a(this.n5)));
            break;
         case 10:
            r5w.k5(this.l6, new g7("round", new c9b(this.n5)));
            break;
         case 11:
            r5w.k5(this.l6, new g7("bevel", new t9p(this.n5)));
            break;
         case 12:
            r5w.k5(this.l6, new g7("miter", new w4w(this.n5)));
            break;
         case 13:
            r5w.n5(this.l6, new v9e(this.n5));
            break;
         case 14:
            r5w.l6(this.l6, new v9e(this.n5));
            break;
         case 15:
            r5w.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
