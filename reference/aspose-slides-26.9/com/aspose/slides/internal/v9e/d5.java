package com.aspose.slides.internal.v9e;

public class d5 extends t4 {
   private int n5;
   private int u3 = -1;

   public d5(int var1) {
      this.n5 = var1;
   }

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      if (this.n5 != 2) {
         this.n5(var1, this.u3 != -1, "test");
      }

      if (var1.u9()) {
         this.n3(var1);
         var1.h0();
      }
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().i4)) {
         if (this.n5 == 2) {
            return false;
         }

         this.u3 = var1.z1(var3);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            if (this.n5 == 0 || this.n5 == 1) {
               boolean var3 = var1.a6(var2, this.u3);
               if (!var3) {
                  var2.s7();
                  break;
               }
            }

            var1.n5(var2);
            var2.n5(1);
            break;
         case 1:
            if (this.n5 == 1 || this.n5 == 2) {
               var2.x8();
            }

            var2.s7();
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid IfAction execution state");
      }
   }
}
