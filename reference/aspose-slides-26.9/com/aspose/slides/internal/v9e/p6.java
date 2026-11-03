package com.aspose.slides.internal.v9e;

public class p6 extends t9 {
   private int n5 = -1;
   private boolean l6;
   private static n5 k5 = new x8();

   public static n5 n5() {
      return k5;
   }

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
      } else {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().j5)) {
            return false;
         }

         this.l6 = var1.c8(var3);
      }

      return true;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            String var3 = var1.n5(var2, this.n5);
            if (var1.n5(var3, this.l6)) {
               var2.s7();
            } else {
               var2.n5(var3);
               var2.n5(2);
            }
            break;
         case 2:
            var1.k5(var2.l6());
            var2.s7();
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid ValueOfAction execution state");
      }
   }
}
