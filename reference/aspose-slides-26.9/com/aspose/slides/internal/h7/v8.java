package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.ms.System.d1;

public class v8 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;
   private final Stack<com.aspose.slides.internal.e7.t2> l6;
   private final com.aspose.slides.internal.k0.k5 k5;
   private final com.aspose.slides.internal.t8.n5 u3;

   public v8(
      com.aspose.slides.internal.t8.l6 var1,
      Stack<com.aspose.slides.internal.e7.t2> var2,
      com.aspose.slides.internal.k0.k5 var3,
      com.aspose.slides.internal.t8.n5 var4
   ) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      com.aspose.slides.internal.t8.a6 var3 = this.n5.n5();
      if (this.l6.size() != 0 && this.l6.peek() != null) {
         com.aspose.slides.internal.e7.t2 var4 = this.l6.peek();
         com.aspose.slides.internal.m5.h0 var5 = null;
         if (var2 != null && var2.size() > 0) {
            if (com.aspose.slides.internal.v6g.k5.l6(var2.get_Item(0), com.aspose.slides.internal.v2.c8.class)) {
               String var6 = ((com.aspose.slides.internal.v2.c8)var2.get_Item(0)).n5();
               if (var4.u9() != null) {
                  com.aspose.slides.internal.m5.h0[] var7 = new com.aspose.slides.internal.m5.h0[]{var5};
                  var4.u9().tryGetValue(var6, var7);
                  var5 = var7[0];
               }
            }
         } else {
            var5 = var3.k7();
         }

         if (var5 != null) {
            int var13 = var5.n5();
            if (var13 == 2 || var13 == 3) {
               com.aspose.slides.internal.j0.l6 var14 = var5.a6();
               if (var14 == null || !d1.t2(com.aspose.slides.ms.System.j8.n5(var14).s7(), "PostScript")) {
                  String var8 = com.aspose.slides.internal.m5.s7.n5(var5);
                  com.aspose.slides.internal.x4g.m1 var9 = var3.n5().u9();
                  com.aspose.slides.internal.x4g.m1 var10 = com.aspose.slides.internal.t8.u3.n5(this.u3.n5());
                  if (var10 != null) {
                     var9.n5(var10, 1);
                  }

                  com.aspose.slides.internal.g4.t2 var11 = null;
                  com.aspose.slides.internal.g4.n3 var12 = null;
                  if (var13 == 2) {
                     var11 = com.aspose.slides.internal.m5.s7.n5((com.aspose.slides.internal.m5.n5)var5, var9, var8);
                  } else {
                     var12 = com.aspose.slides.internal.m5.s7.n5((com.aspose.slides.internal.m5.t2)var5, var9, var8);
                  }

                  if (var11 != null || var12 != null) {
                     this.k5.n5(var5, var11, var12, var9, var3, this.u3.n5());
                  }
               }
            }
         }
      }
   }
}
