package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;

public class r4 extends t4 {
   private h0 n5;
   private h0 u3;
   private boolean a6;
   private p8 u9;
   private String h0;
   private String c8;
   private f0 t2;

   private static f0 n5(String var0, String var1, p8 var2) {
      if ("http://www.w3.org/2000/xmlns/".equals(var1)) {
         throw XsltException.create("Elements and attributes cannot belong to the reserved namespace '{0}'.", var1);
      }

      f0 var3 = new f0();
      var3.n5(var0);
      if (var1 == null) {
         var3.k5 = var2.n5(var3.n5);
      } else {
         var3.k5 = var1;
      }

      return var3;
   }

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      this.n5(var1, this.n5, "name");
      h0[] var2 = new h0[]{this.n5};
      this.h0 = n5(var2);
      this.n5 = var2[0];
      h0[] var3 = new h0[]{this.u3};
      this.c8 = n5(var3);
      this.u3 = var3[0];
      if (this.n5 != null || this.u3 != null) {
         this.u9 = var1.z3();
      } else if (!"xmlns".equals(this.h0)) {
         this.t2 = n5(this.h0, this.c8, var1.z3());
      }

      if (var1.u9()) {
         this.n3(var1);
         var1.h0();
      }

      this.a6 = this.l6 == null;
   }

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().j4)) {
         this.n5 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().i9)) {
         this.u3 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      } else {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().u2)) {
            return false;
         }

         this.n5(var1.h2());
      }

      return true;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            if (this.t2 != null) {
               var2.n5(this.t2);
            } else {
               var2.n5(n5(this.n5 == null ? this.h0 : this.n5.n5(var1, var2), this.u3 == null ? this.c8 : this.u3.n5(var1, var2), this.u9));
            }

            f0 var4 = var2.n5();
            if (!var1.n5(1, var4.n5, var4.l6, var4.k5, this.a6)) {
               var2.n5(2);
            } else if (!this.a6) {
               var1.n5(var2);
               var2.n5(1);
            } else if (!var1.a6(1)) {
               var2.n5(1);
            } else {
               var2.s7();
            }
            break;
         case 1:
            if (!var1.a6(1)) {
               var2.n5(1);
            } else {
               var2.s7();
            }
            break;
         case 2:
            f0 var3 = var2.n5();
            if (!var1.n5(1, var3.n5, var3.l6, var3.k5, this.a6)) {
               var2.n5(2);
            } else if (!this.a6) {
               var1.n5(var2);
               var2.n5(1);
            } else if (!var1.a6(1)) {
               var2.n5(1);
            } else {
               var2.s7();
            }
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid ElementAction execution state");
      }
   }
}
