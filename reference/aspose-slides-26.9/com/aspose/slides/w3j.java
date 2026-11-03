package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;

class w3j {
   private d5f n5;
   private t5w l6;
   private final SortedList<String, ISlideComponent> k5;

   public w3j(d5f var1, SortedList<String, ISlideComponent> var2) {
      this.k5 = var2;
      this.n5 = var1;
   }

   public w3j(t5w var1, SortedList<String, ISlideComponent> var2) {
      this.k5 = var2;
      this.l6 = var1;
   }

   public w3j(SortedList<String, ISlideComponent> var1) {
      this.k5 = var1;
   }

   public final SortedList<String, ISlideComponent> n5() {
      return this.k5;
   }

   public final t5w l6() {
      return this.l6;
   }

   public final d5f k5() {
      return this.n5;
   }

   final IAudio n5(String var1) {
      if (this.l6 != null) {
         return com.aspose.slides.ms.System.d1.a6("NULL", this.l6.k7().n5(var1).n5()) ? null : this.l6.l6(this.l6.k7().n5(var1).l6());
      }

      if (this.n5 != null) {
         int var2 = 0;
         int[] var3 = new int[]{0};
         boolean var4 = !com.aspose.slides.ms.System.a3.n5(var1, var3);
         var2 = var3[0];
         if (var4) {
            return null;
         }

         com.aspose.slides.internal.k0r.d0p var5 = this.n5.h0().s7();
         com.aspose.slides.internal.k0r.x6s var6 = var5.n5(var2);
         return var6.u9() == null ? null : this.n5.n5(var6);
      } else {
         throw new InvalidOperationException();
      }
   }
}
