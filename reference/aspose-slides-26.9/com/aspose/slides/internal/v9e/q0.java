package com.aspose.slides.internal.v9e;

public class q0 extends t4 {
   private String n5;
   private boolean u3;

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      if (var1.u9()) {
         this.n3(var1);
         var1.h0();
      }

      if (this.l6 == null) {
         this.u3 = true;
      }
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().u2)) {
         this.n5 = var3;
         this.n5(var1.h2());
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      while (var1.e2()) {
         switch (var2.k5()) {
            case 0:
               if (p3.u3(var2.a6())) {
                  var1.n5(var2);
                  var2.n5(8);
               } else if (var1.n5(var2.a6(), this.u3)) {
                  var2.n5(5);
                  break;
               }

               return;
            case 1:
            case 2:
            case 3:
            case 4:
            default:
               com.aspose.slides.internal.f8y.n5.n5("Invalid CopyAction execution state");
               return;
            case 5:
               var2.n5(6);
               if (var2.a6().k5() != 1) {
                  break;
               }

               var1.n5(k7.n5(), var2.u9());
               return;
            case 6:
               if (var2.a6().k5() == 1 && !this.u3) {
                  var1.n5(var2);
                  var2.n5(7);
               } else if (var1.l6(var2.a6())) {
                  var2.n5(7);
                  break;
               }

               return;
            case 7:
               if (var1.k5(var2.a6())) {
                  var2.s7();
               }

               return;
            case 8:
               var2.s7();
               return;
         }
      }
   }
}
