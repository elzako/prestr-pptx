package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

class d3u {
   private final Dictionary<Integer, t1k> n5;
   private final h5p l6 = new h5p();
   private final z3h k5;

   public d3u(z3h var1, int var2) {
      this.k5 = var1;
      this.n5 = new Dictionary<>(var2);

      for (int var3 = 1; var3 <= var2; var3++) {
         this.n5.addItem(var3, new t1k());
      }
   }

   public final h5p n5() {
      return this.l6;
   }

   public final void n5(int var1, List<z6n> var2) {
      this.n5.get_Item(var1).n5(var2);
   }

   public final void n5(int var1, byte var2, h2d var3) {
      this.n5.get_Item(var1).n5(var2, var3);
   }

   public final PresentationText n5(int var1) {
      int var2 = this.k5.l6() ? 2 : this.n5.size();
      ISlideText[] var3 = new ISlideText[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         if (!this.n5.containsKey(var4 + 1)) {
            this.n5.set_Item(var4 + 1, new t1k());
         }

         var3[var4] = this.n5.get_Item(var4 + 1).n5(var4, this.n5(), var1);
      }

      return new PresentationText(var3);
   }
}
