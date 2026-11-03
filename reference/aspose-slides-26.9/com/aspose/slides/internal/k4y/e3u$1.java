package com.aspose.slides.internal.k4y;

class e3u$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final e3u l6;

   e3u$1(e3u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (e3u.n5().n5(this.n5.n3())) {
         case 0:
            v4d var2 = new v4d(this.n5);
            e3u.n5(this.l6).addItem(new g7("filter-and", var2));
            break;
         case 1:
            f3f var3 = new f3f(this.n5);
            e3u.n5(this.l6).addItem(new g7("filter-condition", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
