package com.aspose.slides.internal.k4y;

class m1j$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m1j l6;

   m1j$1(m1j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m1j.k5().n5(this.n5.n3())) {
         case 0:
            m1j.n5(this.l6, new r2h(this.n5));
            break;
         case 1:
            s0m var2 = new s0m(this.n5);
            m1j.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
