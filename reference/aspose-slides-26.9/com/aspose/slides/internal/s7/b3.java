package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k5.l6$n5;

public class b3 extends com.aspose.slides.internal.n3.x8 {
   @Override
   public String n5() {
      return "border-spacing";
   }

   @Override
   public int l6() {
      return 56;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      com.aspose.slides.internal.k5.h0 var1 = new com.aspose.slides.internal.k5.h0();
      var1.l6(l6$n5.l6);
      return var1;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      List var3 = new List();

      do {
         com.aspose.slides.internal.k5.u9 var4 = super.n5(var1, var2);
         com.aspose.slides.internal.y4.n5 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, com.aspose.slides.internal.y4.n5.class);
         if (var5 != null
            && (
               com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.y4.n3.class)
                  || com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.y4.c8.class)
            )
            && var5.n5(var5.n5()) < 0.0F) {
            throw com.aspose.slides.internal.z8.u9.k5(var5.u9());
         }

         var3.addItem(var4);
         var1 = var1.k5();
      } while (var1 != null);

      if (var3.size() == 1) {
         var3.addItem(var3.get_Item(0));
      }

      if (var3.size() > 2) {
         throw this.l6(((com.aspose.slides.internal.k5.u9)var3.get_Item(2)).toString());
      } else {
         return new com.aspose.slides.internal.k5.h0(var3);
      }
   }
}
