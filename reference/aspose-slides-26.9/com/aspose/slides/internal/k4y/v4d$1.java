package com.aspose.slides.internal.k4y;

class v4d$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v4d l6;

   v4d$1(v4d var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v4d.n5().n5(this.n5.n3())) {
         case 0:
            e3u var2 = new e3u(this.n5);
            v4d.n5(this.l6).addItem(new g7("filter-or", var2));
            break;
         case 1:
            f3f var3 = new f3f(this.n5);
            v4d.n5(this.l6).addItem(new g7("filter-condition", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
