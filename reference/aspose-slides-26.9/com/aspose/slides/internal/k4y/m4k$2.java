package com.aspose.slides.internal.k4y;

class m4k$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m4k l6;

   m4k$2(m4k var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m4k.t2().n5(this.n5.n3())) {
         case 6:
            a4l var2 = new a4l(this.n5);
            m4k.n5(this.l6).addItem(var2);
            break;
         case 7:
            m4k.n5(this.l6, new y2h(this.n5));
            break;
         case 8:
            m4k.n5(this.l6, new c2u(this.n5));
            break;
         case 9:
            m4k.n5(this.l6, new z4s(this.n5));
            break;
         case 10:
            x6b var3 = new x6b(this.n5);
            m4k.l6(this.l6).addItem(var3);
            break;
         default:
            return false;
      }

      return true;
   }
}
