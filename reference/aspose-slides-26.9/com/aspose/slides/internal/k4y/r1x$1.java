package com.aspose.slides.internal.k4y;

class r1x$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r1x l6;

   r1x$1(r1x var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r1x.u9().n5(this.n5.n3())) {
         case 0:
            r1x.n5(this.l6, new y4u(this.n5));
            break;
         case 1:
            r6a var2 = new r6a(this.n5);
            r1x.n5(this.l6).addItem(new g7("r", var2));
            break;
         case 2:
            t1h var3 = new t1h(this.n5);
            r1x.n5(this.l6).addItem(new g7("br", var3));
            break;
         case 3:
            a1g var4 = new a1g(this.n5);
            r1x.n5(this.l6).addItem(new g7("fld", var4));
            break;
         case 4:
            j0 var5 = new j0(this.n5);
            r1x.n5(this.l6).addItem(new g7("m", var5));
            break;
         case 5:
            r1x.n5(this.l6, new m0l(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
