package com.aspose.slides.internal.k4y;

class v8r$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final v8r l6;

   v8r$2(v8r var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (v8r.u3().n5(this.n5.n3())) {
         case 1:
            v1o var2 = new v1o(this.n5);
            v8r.n5(this.l6).addItem(var2);
            return true;
         default:
            return false;
      }
   }
}
