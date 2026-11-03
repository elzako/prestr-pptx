package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;

public class i1 extends t4 {
   private boolean n5;

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      if (var1.u9()) {
         this.n3(var1);
         var1.h0();
      }
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().w3)) {
         this.n5 = var1.c8(var3);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            f5 var3 = new f5(var1, new com.aspose.slides.internal.z0k.r4(com.aspose.slides.internal.x7n.l6.k5()));
            var1.n5(var3);
            var1.n5(var2);
            var2.n5(1);
            break;
         case 1:
            f5 var4 = com.aspose.slides.internal.v6g.k5.n5(var1.t9(), f5.class);
            com.aspose.slides.ms.System.t4.l6(var4.n5().toString());
            if (this.n5) {
               throw XsltException.create("Transform terminated: '{0}'.", var4.n5().toString());
            }

            var2.s7();
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid MessageAction execution state");
      }
   }
}
