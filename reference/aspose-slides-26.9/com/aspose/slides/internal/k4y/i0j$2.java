package com.aspose.slides.internal.k4y;

class i0j$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final i0j l6;

   i0j$2(i0j var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (i0j.n5().n5(this.n5.n3())) {
         case 3:
            i0j.n5(this.l6, new f6d(this.n5));
            break;
         case 4:
            a8s var2 = new a8s(this.n5);
            i0j.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
