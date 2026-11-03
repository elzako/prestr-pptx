package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.h6;
import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.internal.f5.c8$l6;
import com.aspose.slides.internal.f5.d2;
import com.aspose.slides.internal.y8.n5$n5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class c8 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      switch (var1.u9()) {
         case 0:
            h6 var4 = var1.e2();
            String var5 = var4.n5();
            if (com.aspose.slides.internal.w3.u9.l6(var5, n5$n5.d2) || c8$l6.c8.n5(var4.u3()) && var4.k5().n5("color", "face", "size")) {
               var2.l6(this);
               if (var2.w1()) {
                  return this.k5(var1, var2);
               }

               var2.k5();
               return var2.n5(var1);
            }

            return this.k5(var1, var2);
         case 1:
            var2.l6(this);
            com.aspose.slides.internal.c3.s7 var6 = var1.t9();
            if (c8$l6.l6.n5(var6.u3()) && c8$l6.l6.n5(var2.u3()) && j8.l6("http://www.w3.org/2000/svg", var2.u3().s7())) {
               return this.a6(var1, var2);
            }

            return this.u3(var1, var2);
         case 2:
            com.aspose.slides.internal.c3.u3 var3 = var1.t4();
            if (var3.n5('\u0000')) {
               var2.l6(this);
               var2.n5(new com.aspose.slides.internal.c3.u3('�'));
            } else if (var3.l6()) {
               var2.n5(var3);
            } else {
               var2.n5(var3);
               var2.n5(false);
            }
            break;
         case 3:
            var2.n5(var1.z1());
            break;
         case 4:
            var2.l6(this);
            break;
         case 5:
            var2.p8();
      }

      return true;
   }

   @Override
   public boolean k5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      com.aspose.slides.internal.f5.z3 var3 = var2.a6();
      if (j8.l6(var3.s7(), "http://www.w3.org/1998/Math/MathML")) {
         var1 = var2.k5(var1);
      }

      if (j8.l6(var3.s7(), "http://www.w3.org/2000/svg")) {
         var1 = var2.u3(var1);
         var1 = var2.l6(var1);
      }

      var1 = var2.a6(var1);
      var2.l6(var1.e2(), var3.s7());
      String var4 = var1.e2().n5();
      if (var1.y4().l6()) {
         if (d1.a6(var4, "script")) {
            var2.k7();
            return this.a6(var1, var2);
         }

         var2.n5();
         var2.k7();
      }

      return true;
   }

   private boolean a6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      var2.n5();
      return true;
   }

   @Override
   public boolean u3(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      com.aspose.slides.internal.f5.z3 var3 = var2.u3();
      d2 var4 = var1.y4().u3();
      if (!var3.u3().n5(var4)) {
         var2.l6(this);
      }

      while (var2.l6().u3() != var3) {
         if (var3.u3().n5(var4)) {
            var2.n5((com.aspose.slides.internal.j3.z3)var3);
            return true;
         }

         var3 = var2.l6().u3(var3);
         if (j8.l6("http://www.w3.org/1999/xhtml", var3.s7())) {
            return var2.y4().n5(var1, var2);
         }
      }

      return true;
   }
}
