package com.aspose.slides.internal.v9e;

import com.aspose.slides.internal.v7y.r8;
import com.aspose.slides.ms.System.Xml.f4;

public class z8 extends t9 {
   private int n5 = -1;

   public void l6(z1 var1) {
      this.u3(var1);
      this.n5(var1, this.n5 != -1, "select");
      this.a6(var1);
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().t3)) {
         this.n5 = var1.e2(var3);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            com.aspose.slides.internal.v7y.j9 var3 = var1.u3(this.n5);
            Object var4 = var3.n5(var2.u9());
            if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.x6s.h0.class)) {
               var1.n5(m3.n5(), new com.aspose.slides.internal.v7y.f5(var3));
               var2.n5(3);
            } else {
               com.aspose.slides.internal.x6s.a6 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, com.aspose.slides.internal.x6s.a6.class);
               if (var5 != null) {
                  var1.n5(m3.n5(), new r8(var5));
                  var2.n5(3);
               } else {
                  String var6 = f4.l6(var4);
                  if (var1.k5(var6)) {
                     var2.s7();
                  } else {
                     var2.n5(var6);
                     var2.n5(2);
                  }
               }
            }
         case 1:
         default:
            break;
         case 2:
            var1.k5(var2.l6());
            var2.s7();
            break;
         case 3:
            var2.s7();
      }
   }
}
