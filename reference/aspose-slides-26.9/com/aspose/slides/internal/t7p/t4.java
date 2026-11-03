package com.aspose.slides.internal.t7p;

import com.aspose.slides.Collections.Generic.Dictionary;

public class t4 {
   private final Dictionary<Integer, x8> n5 = new Dictionary<>();

   public t4(com.aspose.slides.internal.b7s.n3[] var1, int var2, int var3) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         com.aspose.slides.internal.b7s.n3 var5 = var1[var4];
         if ((var5.u3() & 255) == var2 && (var5.n3() & 255) == var3) {
            this.n5.addItem(var5.u9() & 255, new l6());
         } else if ((var5.u3() & 255) * 2 == var2 && (var5.n3() & 255) == var3) {
            if (var5.y4() < 2) {
               this.n5.addItem(var5.u9() & 255, new a6(var5, var4));
            } else {
               this.n5.addItem(var5.u9() & 255, new k5(var5, var4, var3));
            }
         } else if ((var5.u3() & 255) * 2 == var2 && (var5.n3() & 255) * 2 == var3) {
            if (var5.y4() < 2) {
               this.n5.addItem(var5.u9() & 255, new h0(var5, var4));
            } else {
               this.n5.addItem(var5.u9() & 255, new u9(var5, var4, var3));
            }
         } else if (var2 % (var5.u3() & 255) == 0 && var3 % (var5.n3() & 255) == 0) {
            this.n5.addItem(var5.u9() & 255, new y4(var5, var4, var2, var3));
         }
      }
   }

   public final x8 n5(com.aspose.slides.internal.b7s.n3 var1) {
      return this.n5.get_Item(var1.u9() & 255);
   }
}
