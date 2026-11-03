package com.aspose.slides.internal.k4y;

class k7v$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final k7v l6;

   k7v$1(k7v var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (k7v.l6().n5(this.n5.n3())) {
         case 0:
            k7v.n5(this.l6, new g7("boolVal", new w5w(this.n5)));
            break;
         case 1:
            k7v.n5(this.l6, new g7("intVal", new f1f(this.n5)));
            break;
         case 2:
            k7v.n5(this.l6, new g7("fltVal", new k1k(this.n5)));
            break;
         case 3:
            k7v.n5(this.l6, new g7("strVal", new w8j(this.n5)));
            break;
         case 4:
            k7v.n5(this.l6, new g7("clrVal", new z4(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
