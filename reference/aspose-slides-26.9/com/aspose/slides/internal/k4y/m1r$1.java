package com.aspose.slides.internal.k4y;

class m1r$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m1r l6;

   m1r$1(m1r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m1r.u3().n5(this.n5.n3())) {
         case 0:
            m1r.n5(this.l6, new m3o(this.n5));
            break;
         case 1:
            o3d var2 = new o3d(this.n5);
            m1r.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
