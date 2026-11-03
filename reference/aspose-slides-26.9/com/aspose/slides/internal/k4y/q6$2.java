package com.aspose.slides.internal.k4y;

class q6$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final q6 l6;

   q6$2(q6 var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (q6.a6().n5(this.n5.n3())) {
         case 2:
            v2z var2 = new v2z(this.n5);
            q6.n5(this.l6).addItem(var2);
            break;
         case 3:
            l3m var3 = new l3m(this.n5);
            q6.l6(this.l6).addItem(var3);
            break;
         case 4:
            q6.n5(this.l6, new z4p(this.n5));
            break;
         case 5:
            q6.n5(this.l6, new h6l(this.n5));
            break;
         case 6:
            p3b var4 = new p3b(this.n5);
            q6.k5(this.l6).addItem(var4);
            break;
         case 7:
            q6.n5(this.l6, new l8r(this.n5));
            break;
         default:
            return false;
      }

      return true;
   }
}
