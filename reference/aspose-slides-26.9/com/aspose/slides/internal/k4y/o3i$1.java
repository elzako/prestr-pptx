package com.aspose.slides.internal.k4y;

class o3i$1 extends b3$n5 {
   // $VF: synthetic field
   final o3i n5;

   o3i$1(o3i var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (o3i.x8().n5(var1)) {
         case 0:
            o3i.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.k7(var2) / 12700.0);
            return true;
         case 1:
            o3i.l6(this.n5, com.aspose.slides.ms.System.Xml.f4.k7(var2) / 12700.0);
            return true;
         case 2:
            o3i.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 3:
            o3i.l6(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 4:
            o3i.k5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         case 5:
            o3i.u3(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 6:
            o3i.a6(this.n5, com.aspose.slides.ms.System.Xml.f4.e2(var2) / 60000.0F);
            return true;
         case 7:
            o3i.n5(this.n5, j6.n5(var2));
            return true;
         case 8:
            o3i.n5(this.n5, com.aspose.slides.ms.System.Xml.f4.t2(var2));
            return true;
         default:
            return false;
      }
   }
}
