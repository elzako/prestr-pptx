package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;

public class n5 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;
   private final com.aspose.slides.internal.k0.k5 l6;
   private final com.aspose.slides.internal.t8.n5 k5;

   public n5(com.aspose.slides.internal.t8.l6 var1, com.aspose.slides.internal.k0.k5 var2, com.aspose.slides.internal.t8.n5 var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() >= 6) {
         com.aspose.slides.internal.v2.t2 var3 = (com.aspose.slides.internal.v2.t2)var2.get_Item(0);
         com.aspose.slides.internal.v2.t2 var4 = (com.aspose.slides.internal.v2.t2)var2.get_Item(1);
         com.aspose.slides.internal.v2.t2 var5 = (com.aspose.slides.internal.v2.t2)var2.get_Item(2);
         com.aspose.slides.internal.v2.t2 var6 = (com.aspose.slides.internal.v2.t2)var2.get_Item(3);
         com.aspose.slides.internal.v2.t2 var7 = (com.aspose.slides.internal.v2.t2)var2.get_Item(4);
         com.aspose.slides.internal.v2.t2 var8 = (com.aspose.slides.internal.v2.t2)var2.get_Item(5);
         com.aspose.slides.internal.o9b.w1 var9 = com.aspose.slides.internal.t8.u3.n5(var3.u3(), var4.u3(), this.n5.n5().n5()).u3();
         var9.l6(this.k5.n5() - var9.k5());
         com.aspose.slides.internal.o9b.w1 var10 = com.aspose.slides.internal.t8.u3.n5(var5.u3(), var6.u3(), this.n5.n5().n5()).u3();
         var10.l6(this.k5.n5() - var10.k5());
         com.aspose.slides.internal.o9b.w1 var11 = com.aspose.slides.internal.t8.u3.n5(var7.u3(), var8.u3(), this.n5.n5().n5()).u3();
         var11.l6(this.k5.n5() - var11.k5());
         this.l6.n5(var9.u3(), var10.u3(), var11.u3());
      }
   }
}
