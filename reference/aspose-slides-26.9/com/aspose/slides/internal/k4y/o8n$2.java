package com.aspose.slides.internal.k4y;

class o8n$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final o8n l6;

   o8n$2(o8n var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (o8n.u9().n5(this.n5.n3())) {
         case 1:
            o8n.n5(this.l6, new f2z(this.n5));
            break;
         case 2:
            o8n.l6(this.l6, new f2z(this.n5));
            break;
         case 3:
            w0r var2 = new w0r(this.n5);
            o8n.n5(this.l6).addItem(var2);
            break;
         default:
            return false;
      }

      return true;
   }
}
