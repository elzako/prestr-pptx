package com.aspose.slides.internal.k4y;

class u4i$1 extends b3$n5 {
   // $VF: synthetic field
   final u4i n5;

   u4i$1(u4i var1) {
      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, String var2) {
      switch (u4i.z1().n5(var1)) {
         case 0:
            u4i.n5(this.n5, new com.aspose.slides.ms.System.o0(var2));
            return true;
         case 1:
            u4i.l6(this.n5, new com.aspose.slides.ms.System.o0(var2));
            return true;
         case 2:
            u4i.n5(this.n5, b3o.n5(var2));
            return true;
         case 3:
            com.aspose.slides.ms.System.j5.n5(var2, com.aspose.slides.internal.x7n.l6.u3(), 16).u3(u4i.n5(this.n5));
            return true;
         case 4:
            com.aspose.slides.ms.System.j5.n5(var2, com.aspose.slides.internal.x7n.l6.u3(), 16).u3(u4i.l6(this.n5));
            return true;
         case 5:
            u4i.n5(this.n5, var2);
            return true;
         case 6:
            u4i.n5(
               this.n5,
               var2.charAt(var2.length() - 1) == '%'
                  ? (float)com.aspose.slides.ms.System.Xml.f4.k7(com.aspose.slides.ms.System.d1.l6(var2, 0, var2.length() - 1))
                  : (float)com.aspose.slides.ms.System.Xml.f4.t9(var2) / 1000.0F
            );
            return true;
         default:
            return false;
      }
   }
}
