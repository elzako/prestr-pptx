package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;

public class i9 extends j4 {
   public i9(com.aspose.slides.internal.t8.l6 var1, com.aspose.slides.internal.t8.n5 var2, com.aspose.slides.internal.k0.u3 var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2.size() >= 1) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2.get_Item(0), com.aspose.slides.internal.v2.n5.class)) {
            com.aspose.slides.internal.v2.n5 var3 = com.aspose.slides.internal.v6g.k5.n5(var2.get_Item(0), com.aspose.slides.internal.v2.n5.class);

            for (int var4 = 0; var4 < var3.n5(); var4++) {
               com.aspose.slides.internal.v2.s7 var5 = var3.k5(var4);
               if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.v2.t2.class)) {
                  com.aspose.slides.internal.v2.t2 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.v2.t2.class);
                  com.aspose.slides.internal.t8.c8 var7 = this.n5.n5().t2().t2();
                  float var8 = -(var6.u3() / 1000.0F) * var7.l6() * var7.n5();
                  com.aspose.slides.internal.x4g.m1 var9 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, var8, 0.0F);
                  var9.n5(this.l6.l6(), 1);
                  this.l6.n5(var9);
               } else if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.v2.y4.class)) {
                  com.aspose.slides.internal.v2.y4 var10 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.v2.y4.class);
                  this.n5(var10.n5());
               }
            }
         }
      }
   }
}
