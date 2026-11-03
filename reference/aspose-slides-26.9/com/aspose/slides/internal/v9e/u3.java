package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.Xml.k6;

public class u3 extends t4 {
   private int n5 = -1;
   private k6 u3;
   private static u3 a6 = new u3();

   public static u3 n5() {
      return a6;
   }

   public static u3 n5(k6 var0) {
      return var0 != null && !var0.k5() ? new u3(var0) : n5();
   }

   public u3() {
   }

   private u3(k6 var1) {
      this.u3 = var1;
   }

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      this.e2(var1);
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().t3)) {
         this.n5 = var1.e2(var3);
      } else {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().g7)) {
            return false;
         }

         if (var1.u3 && "*".equals(var3)) {
            this.u3 = z1.a6;
         } else {
            this.u3 = var1.s7(var3);
         }
      }

      return true;
   }

   private void e2(z1 var1) {
      z7 var2 = var1.u3();
      if (var1.u9()) {
         do {
            switch (var2.n3()) {
               case 1:
                  var1.t4();
                  String var3 = var2.t9();
                  String var4 = var2.e2();
                  if (!com.aspose.slides.ms.System.Xml.v8.n5(var3, var2.k5().y6)) {
                     throw var1.x9();
                  }

                  if (com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().p7)) {
                     this.n5(var1.v4());
                  } else {
                     if (!com.aspose.slides.ms.System.Xml.v8.n5(var4, var2.k5().r6)) {
                        throw var1.x9();
                     }

                     s4 var5 = var1.f0();
                     this.l6(var5.k5());
                     this.n5(var5);
                  }

                  var1.q0();
                  break;
               case 2:
               case 3:
               case 4:
               default:
                  throw XsltException.create("The contents of '{0}' are invalid.", "apply-templates");
               case 5:
               case 6:
               case 7:
               case 8:
            }
         } while (var1.a6());

         var1.h0();
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            var1.z1();
            var1.u9();
            if (this.l6 != null && this.l6.size() > 0) {
               var1.n5(var2);
               var2.n5(2);
            } else {
               if (this.n5 == -1) {
                  if (!var2.a6().m1()) {
                     var2.s7();
                     break;
                  }

                  var2.l6(var2.a6().u9(9));
               } else {
                  var2.l6(var1.n5(var2.u9(), this.n5));
               }

               if (var1.u3().size() != 0) {
                  var2.n5(var1, var1.u3());
               }

               var2.n5(3);
               if (var2.k5(var1)) {
                  var2.n5(4);
                  var1.n5(var2.h0(), this.u3, null);
                  var2.n5(5);
               } else {
                  var2.s7();
               }
            }
            break;
         case 1:
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid ApplyTemplatesAction execution state");
            break;
         case 2:
            if (this.n5 == -1) {
               if (!var2.a6().m1()) {
                  var2.s7();
                  break;
               }

               var2.l6(var2.a6().u9(9));
            } else {
               var2.l6(var1.n5(var2.u9(), this.n5));
            }

            if (var1.u3().size() != 0) {
               var2.n5(var1, var1.u3());
            }

            var2.n5(3);
            if (var2.k5(var1)) {
               var2.n5(4);
               var1.n5(var2.h0(), this.u3, null);
               var2.n5(5);
            } else {
               var2.s7();
            }
            break;
         case 3:
            if (var2.k5(var1)) {
               var2.n5(4);
               var1.n5(var2.h0(), this.u3, null);
               var2.n5(5);
            } else {
               var2.s7();
            }
            break;
         case 4:
            var1.n5(var2.h0(), this.u3, null);
            var2.n5(5);
            break;
         case 5:
            var2.n5(3);
            if (var2.k5(var1)) {
               var2.n5(4);
               var1.n5(var2.h0(), this.u3, null);
               var2.n5(5);
            } else {
               var2.s7();
            }
      }
   }
}
