package com.aspose.slides.internal.k4y;

class z4a$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final z4a l6;

   z4a$2(z4a var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (z4a.n5().n5(this.n5.n3())) {
         case 12:
            this.n5.u9();
            String var2 = this.n5.z1();
            z4a.n5(this.l6).addItem(new g7("note-continuation-notice-forward", var2));
            break;
         case 13:
            this.n5.u9();
            String var3 = this.n5.z1();
            z4a.n5(this.l6).addItem(new g7("note-continuation-notice-backward", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
