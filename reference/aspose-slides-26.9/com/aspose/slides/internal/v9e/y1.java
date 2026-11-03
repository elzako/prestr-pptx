package com.aspose.slides.internal.v9e;

public class y1 extends t4 {
   private int n5 = -1;
   private t4 u3;

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      this.n5(var1, this.n5 != -1, "select");
      var1.l6(false);
      if (var1.u9()) {
         this.e2(var1);
         this.n3(var1);
         var1.h0();
      }
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
            if (this.u3 != null) {
               var1.u9();
               var1.n5(this.u3, var2.u9());
               var2.n5(2);
            } else {
               var2.l6(var1.n5(var2.u9(), this.n5));
               if (this.u3 != null) {
                  var2.n5(var1, var1.u3());
               }

               var2.n5(3);
               if (var2.k5(var1)) {
                  var2.n5(4);
                  var1.n5(var2, var2.h0());
                  var2.n5(5);
               } else {
                  var2.s7();
               }
            }
         case 1:
         default:
            break;
         case 2:
            var2.l6(var1.n5(var2.u9(), this.n5));
            if (this.u3 != null) {
               var2.n5(var1, var1.u3());
            }

            var2.n5(3);
            if (var2.k5(var1)) {
               var2.n5(4);
               var1.n5(var2, var2.h0());
               var2.n5(5);
            } else {
               var2.s7();
            }
            break;
         case 3:
            if (var2.k5(var1)) {
               var2.n5(4);
               var1.n5(var2, var2.h0());
               var2.n5(5);
            } else {
               var2.s7();
            }
            break;
         case 4:
            var1.n5(var2, var2.h0());
            var2.n5(5);
            break;
         case 5:
            var2.n5(3);
            if (var2.k5(var1)) {
               var2.n5(4);
               var1.n5(var2, var2.h0());
               var2.n5(5);
            } else {
               var2.s7();
            }
      }
   }

   protected final void e2(z1 var1) {
      z7 var2 = var1.u3();

      do {
         switch (var2.n3()) {
            case 1:
               if (!com.aspose.slides.ms.System.Xml.v8.n5(var2.t9(), var2.k5().y6) || !com.aspose.slides.ms.System.Xml.v8.n5(var2.e2(), var2.k5().p7)) {
                  return;
               }

               if (this.u3 == null) {
                  this.u3 = new t4();
               }

               this.u3.n5(var1.v4());
            case 2:
            case 3:
            default:
               break;
            case 4:
               return;
            case 5:
               this.n5(var1.p3());
         }
      } while (var2.u9());
   }
}
