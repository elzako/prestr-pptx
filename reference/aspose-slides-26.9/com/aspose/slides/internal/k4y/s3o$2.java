package com.aspose.slides.internal.k4y;

class s3o$2 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final s3o l6;

   s3o$2(s3o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (s3o.k5().n5(this.n5.n3())) {
         case 5:
            s3o.k5(this.l6, this.n5.c4());
            if (!this.n5.m1()) {
               while (this.n5.s7() != 15) {
                  this.n5.u9();
                  s3o.k5(this.l6, com.aspose.slides.ms.System.d1.n5(s3o.n5(this.l6), this.n5.c4()));
               }
            }
            break;
         case 6:
            u1x var2 = new u1x(this.n5);
            s3o.l6(this.l6).addItem(new g7("p", var2));
            break;
         case 7:
            u0y var3 = new u0y(this.n5);
            s3o.l6(this.l6).addItem(new g7("list", var3));
            break;
         default:
            return false;
      }

      return true;
   }
}
