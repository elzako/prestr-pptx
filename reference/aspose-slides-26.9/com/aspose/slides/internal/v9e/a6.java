package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;

public class a6 extends t4 {
   private h0 n5;
   private h0 u3;
   private p8 a6;
   private String u9;
   private String h0;
   private f0 c8;

   private static f0 n5(String var0, String var1, p8 var2) {
      if ("xmlns".equals(var0)) {
         return null;
      }

      if ("http://www.w3.org/2000/xmlns/".equals(var1)) {
         throw XsltException.create("Elements and attributes cannot belong to the reserved namespace '{0}'.", var1);
      }

      f0 var3 = new f0();
      var3.n5(var0);
      var3.k5 = var1 != null ? var1 : var2.l6(var3.n5);
      if (com.aspose.slides.ms.System.d1.n5(var3.n5, "xml", (short)4)) {
         if (var3.n5.length() == 3) {
            if (!"http://www.w3.org/XML/1998/namespace".equals(var3.k5) || !"lang".equals(var3.l6) && !"space".equals(var3.l6)) {
               var3.n5();
            }
         } else if ("xmlns".equals(var3.n5)) {
            if ("http://www.w3.org/2000/xmlns/".equals(var3.k5)) {
               throw XsltException.create("Prefix '{0}' is not defined.", var3.n5);
            }

            var3.n5();
         }
      }

      return var3;
   }

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      this.n5(var1, this.n5, "name");
      h0[] var2 = new h0[]{this.n5};
      this.u9 = n5(var2);
      this.n5 = var2[0];
      h0[] var3 = new h0[]{this.u3};
      this.h0 = n5(var3);
      this.u3 = var3[0];
      if (this.n5 != null || this.u3 != null) {
         this.a6 = var1.z3();
      } else if (!"xmlns".equals(this.u9)) {
         this.c8 = n5(this.u9, this.h0, var1.z3());
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
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().j4)) {
         this.n5 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      } else {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().i9)) {
            return false;
         }

         this.u3 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      }

      return true;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            if (this.c8 != null) {
               var2.n5(this.c8);
            } else {
               var2.n5(n5(this.n5 == null ? this.u9 : this.n5.n5(var1, var2), this.u3 == null ? this.h0 : this.u3.n5(var1, var2), this.a6));
               if (var2.n5() == null) {
                  var2.s7();
                  break;
               }
            }

            f0 var4 = var2.n5();
            if (!var1.n5(2, var4.n5, var4.l6, var4.k5, false)) {
               var2.n5(2);
            } else {
               var1.n5(var2);
               var2.n5(1);
            }
            break;
         case 1:
            if (!var1.a6(2)) {
               var2.n5(1);
            } else {
               var2.s7();
            }
            break;
         case 2:
            f0 var3 = var2.n5();
            if (!var1.n5(2, var3.n5, var3.l6, var3.k5, false)) {
               var2.n5(2);
            } else {
               var1.n5(var2);
               var2.n5(1);
            }
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid ElementAction execution state");
      }
   }
}
