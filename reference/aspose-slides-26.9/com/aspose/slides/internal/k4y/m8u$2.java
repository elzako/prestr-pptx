package com.aspose.slides.internal.k4y;

class m8u$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final m8u l6;

   m8u$2(m8u var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (m8u.n5().n5(this.n5.n3())) {
         case 1:
            this.n5.u9();
            break;
         case 2:
            this.n5.u9();
            m8u.n5(this.l6, new g7("posOffset", com.aspose.slides.ms.System.a3.n5(this.n5.z1())));
            break;
         default:
            return false;
      }

      return true;
   }
}
