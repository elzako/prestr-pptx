package com.aspose.slides.internal.h2;

import com.aspose.slides.Collections.Generic.List;

public class z6 extends z7$n5 {
   public z6(int var1) {
      super(var1);
   }

   @Override
   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      z7 var4 = (z7)super.l6(var1, var2, var3);
      List var5 = var4.t_();
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      int var11 = -1;
      int var12 = var5.size();

      while (--var12 >= 0) {
         a5 var13 = (a5)var5.get_Item(var12);
         if (com.aspose.slides.internal.v6g.k5.l6(var13, com.aspose.slides.internal.b3.t4.class)) {
            var13 = this.n5(var13.j_());
            var5.set_Item(var12, var13);
         }

         if (var13 != null) {
            var11 = var13.a6();
         }

         switch (var11) {
            case 17:
            case 77:
            case 86:
            case 90:
            case 91:
            case 92:
            case 103:
            case 153:
               if (var6) {
                  throw new com.aspose.slides.internal.b3.z8("'none' specified, no additional values allowed");
               }

               switch (var11) {
                  case 17:
                  case 86:
                     if (!var10) {
                        var10 = true;
                     }
                     continue;
                  case 77:
                  case 90:
                     if (!var9) {
                        var9 = true;
                     }
                     continue;
                  case 91:
                  case 103:
                     if (!var8) {
                        var8 = true;
                     }
                     continue;
                  case 92:
                  case 153:
                     if (!var7) {
                        var7 = true;
                     }
                     continue;
                  default:
                     throw new com.aspose.slides.internal.b3.z8("Invalid combination of values");
               }
            case 95:
               if (var7 | var8 | var9 | var10) {
                  throw new com.aspose.slides.internal.b3.z8("Invalid combination of values");
               }

               var6 = true;
               break;
            default:
               throw new com.aspose.slides.internal.b3.z8("Invalid value specified: " + var1);
         }
      }

      return var4;
   }
}
