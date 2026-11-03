package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;

public class y1 extends z8$n5 {
   public y1(int var1) {
      super(var1);
   }

   @Override
   public a5 n5(com.aspose.slides.internal.e5.w1 var1, String var2, com.aspose.slides.internal.e5.t9 var3) {
      if (d1.a6(var2, "inherit")) {
         return super.n5(var1, var2, var3);
      }

      String var4 = this.k5(var2);
      a5 var5 = this.n5(var4);
      int var6 = var5 != null ? var5.a6() : -1;
      if (var6 == 167 || var6 == 168) {
         a5 var7 = var1.k5(108);
         if (var6 == 167) {
            var6 = var7.a6();
            switch (var6) {
               case 169:
                  var5 = z8.n5(170, "200");
                  break;
               case 170:
                  var5 = z8.n5(171, "300");
                  break;
               case 171:
                  var5 = z8.n5(172, "400");
                  break;
               case 172:
                  var5 = z8.n5(173, "500");
                  break;
               case 173:
                  var5 = z8.n5(174, "600");
                  break;
               case 174:
                  var5 = z8.n5(175, "700");
                  break;
               case 175:
                  var5 = z8.n5(176, "800");
                  break;
               case 176:
               case 177:
                  var5 = z8.n5(177, "900");
            }
         } else {
            var6 = var7.a6();
            switch (var6) {
               case 169:
               case 170:
                  var5 = z8.n5(169, "100");
                  break;
               case 171:
                  var5 = z8.n5(170, "200");
                  break;
               case 172:
                  var5 = z8.n5(171, "300");
                  break;
               case 173:
                  var5 = z8.n5(172, "400");
                  break;
               case 174:
                  var5 = z8.n5(173, "500");
                  break;
               case 175:
                  var5 = z8.n5(174, "600");
                  break;
               case 176:
                  var5 = z8.n5(175, "700");
                  break;
               case 177:
                  var5 = z8.n5(176, "800");
            }
         }
      } else if (var6 == -1) {
         var5 = com.aspose.slides.internal.b3.w1.n5(var2, new com.aspose.slides.internal.b3.j5(this, var1));
      }

      if (var5 != null) {
         var5 = this.l6(var5, var1, var3);
      }

      return var5;
   }
}
