package com.aspose.slides.internal.b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.ms.System.d1;

public class t2 extends s7 {
   @Override
   public int n5() {
      return 1;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public a5 n5(a5[] var1, j5 var2) {
      com.aspose.slides.internal.e5.t9 var3 = var2.u3().n5();
      int var4 = 0;
      if (var1.length == 0) {
         var4 = var2.a6().l6();
      } else {
         String var5 = var1[0].j_();
         var4 = com.aspose.slides.internal.e5.s7.n5(var5);
      }

      if (var4 == -1) {
         throw new z8("Incorrect parameter to from-table-column() function");
      }

      int var11 = -1;
      int var6 = 0;
      if (var3.z3() == 75) {
         var11 = var2.u3().a6(76).u9().u3();
         var6 = var2.u3().a6(165).u9().u3();
      } else {
         do {
            var3 = (com.aspose.slides.internal.e5.t9)var3.s_();
         } while (var3.z3() != 75 && var3.z3() != 53);

         if (var3.z3() != 75) {
            throw new z8(d1.n5(new String[]{"from-table-column() may only be used on ", "fo:table-cell or its descendants."}));
         }

         var11 = ((com.aspose.slides.internal.u6.m1)var3).b3();
         var6 = ((com.aspose.slides.internal.u6.m1)var3).z7();
      }

      com.aspose.slides.internal.u6.z1 var7 = ((com.aspose.slides.internal.u6.w1)var3).e5();
      List var8 = var7.z7();
      com.aspose.slides.internal.u6.k5 var9 = var7.n5();
      if (var8 == null) {
         return var2.u3().n5(var4, false, true);
      }

      if (var9.n5(var11)) {
         return ((com.aspose.slides.internal.u6.m3)var8.get_Item(var11 - 1)).u9(var4);
      }

      while (--var6 > 0) {
         if (var9.n5(++var11)) {
            break;
         }
      }

      return var9.n5(var11) ? ((com.aspose.slides.internal.u6.m3)var8.get_Item(var11 - 1)).u9(var4) : var2.u3().n5(var4, false, true);
   }
}
