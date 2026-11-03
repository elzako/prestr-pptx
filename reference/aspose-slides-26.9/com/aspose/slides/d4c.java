package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class d4c implements l8k, IDisposable {
   private final List<l8k> n5;
   private int l6 = 0;

   public d4c() {
      this.n5 = new List<>();
   }

   @Override
   public final void dispose() {
      if (this.n5.size() != 0) {
         for (int var1 = this.n5.size() - 1; var1 >= 0; var1--) {
            l8k var2 = this.n5.get_Item(var1);
            if (com.aspose.slides.internal.v6g.k5.l6(var2, IDisposable.class)) {
               com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class).dispose();
            }
         }

         this.n5.clear();
         this.l6 = 0;
      }
   }

   public final void n5(l8k var1) {
      if (var1 == null) {
         throw new ArgumentNullException("player");
      }

      this.n5.addItem(var1);
   }

   @Override
   public final void n5(float var1) {
      if (this.n5.size() != 0) {
         if (var1 >= 1.0F) {
            this.n5();
         } else {
            int var2 = -1;
            l8k var3 = null;

            for (int var4 = 0; var4 < this.n5.size(); var4++) {
               l8k var5 = this.n5.get_Item(var4);
               float var6 = (float)var4 / this.n5.size();
               float var7 = (float)(var4 + 1) / this.n5.size();
               if (var1 >= var6 && var1 < var7) {
                  var2 = var4;
                  var3 = var5;
               }
            }

            if (var3 != null) {
               if (var2 > this.l6) {
                  for (int var8 = this.l6; var8 < var2; var8++) {
                     this.l6 = var8;
                     this.n5.get_Item(var8).n5();
                  }
               }

               this.l6 = var2;
               var3.n5(var1 * this.n5.size() - var2);
            }
         }
      }
   }

   @Override
   public final void n5() {
      if (this.n5.size() != 0) {
         for (int var1 = this.l6; var1 < this.n5.size(); var1++) {
            this.l6 = var1;
            this.n5.get_Item(var1).n5();
         }
      }
   }
}
