package com.aspose.slides.internal.v9e;

import com.aspose.slides.ms.System.Xml.u4;
import com.aspose.slides.ms.System.Xml.y5;

public class a3 extends t4 {
   private h0 n5;
   private String u3;

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      this.n5(var1, this.n5, "name");
      if (this.n5.n5()) {
         this.u3 = this.n5.n5((p3)null, (l6)null);
         this.n5 = null;
         if (!n5(this.u3)) {
            this.u3 = null;
         }
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
         this.n5 = h0.n5(var1, var3);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            if (this.n5 == null) {
               var2.n5(this.u3);
               if (this.u3 == null) {
                  var2.s7();
                  break;
               }
            } else {
               var2.n5(this.n5.n5(var1, var2));
               if (!n5(var2.l6())) {
                  var2.s7();
                  break;
               }
            }

            if (!var1.n5(7, com.aspose.slides.ms.System.d1.n5, var2.l6(), com.aspose.slides.ms.System.d1.n5, false)) {
               var2.n5(3);
            } else {
               var1.n5(var2);
               var2.n5(1);
            }
            break;
         case 1:
            if (!var1.a6(7)) {
               var2.n5(1);
            } else {
               var2.s7();
            }
            break;
         case 2:
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid ElementAction execution state");
            var2.s7();
            break;
         case 3:
            if (!var1.n5(7, com.aspose.slides.ms.System.d1.n5, var2.l6(), com.aspose.slides.ms.System.d1.n5, false)) {
               var2.n5(3);
            } else {
               var1.n5(var2);
               var2.n5(1);
            }
      }
   }

   public static boolean n5(String var0) {
      if (var0 == null) {
         return false;
      }

      int var1 = var0.length();
      int var2 = 0;
      u4 var3 = u4.n5().l6();

      while (var2 < var1 && var3.n5(var0.charAt(var2))) {
         var2++;
      }

      if (var2 >= var1) {
         return false;
      }

      int var4 = y5.u3(var0, var2);
      if (var4 == 0) {
         return false;
      }

      var2 += var4;

      while (var2 < var1 && var3.n5(var0.charAt(var2))) {
         var2++;
      }

      return var2 < var1
         ? false
         : var1 != 3
            || var0.charAt(0) != 'X' && var0.charAt(0) != 'x'
            || var0.charAt(1) != 'M' && var0.charAt(1) != 'm'
            || var0.charAt(2) != 'L' && var0.charAt(2) != 'l';
   }
}
