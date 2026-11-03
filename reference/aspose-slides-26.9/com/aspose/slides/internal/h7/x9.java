package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;

public class x9 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;
   private final Stack<com.aspose.slides.internal.e7.t2> l6;

   public x9(com.aspose.slides.internal.t8.l6 var1, Stack<com.aspose.slides.internal.e7.t2> var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      int var3 = var2.size();
      com.aspose.slides.internal.v2.c8 var4;
      if (var3 == 1) {
         var4 = (com.aspose.slides.internal.v2.c8)var2.get_Item(0);
      } else {
         com.aspose.slides.internal.v2.n5 var5 = new com.aspose.slides.internal.v2.n5();

         for (int var6 = 0; var6 < var3 - 1; var6++) {
            var5.n5((com.aspose.slides.internal.v2.s7)var2.get_Item(var6));
         }

         var4 = (com.aspose.slides.internal.v2.c8)var2.get_Item(var3 - 1);
      }

      com.aspose.slides.internal.e7.t2 var11 = this.l6.peek();
      Dictionary var7 = var11.u3();
      com.aspose.slides.internal.z2.l6 var8 = (com.aspose.slides.internal.z2.l6)var7.get_Item(var4.n5());
      com.aspose.slides.internal.t8.a6 var9 = this.n5.n5();
      com.aspose.slides.internal.g9.h0 var10 = var9.k5();
      var10.n5(var8);
      var9.n5(var10);
      this.n5.n5(var9);
   }
}
