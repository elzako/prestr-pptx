package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class i9 {
   private boolean n5;
   private boolean l6 = false;
   private List<com.aspose.slides.internal.v8.c8> k5 = new List<>();

   public i9(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public final Object clone() {
      i9 var1 = new i9(this.n5);
      var1.l6 = this.l6;
      var1.k5 = new List<>();
      var1.k5 = new List<>(this.k5);
      return var1;
   }

   public final boolean n5() {
      return this.k5.size() != 0;
   }

   public final void n5(com.aspose.slides.internal.v8.c8 var1) {
      if (!this.n5 || !var1.n5() || this.n5()) {
         if (var1.l6()) {
            if (!this.l6) {
               this.k5.clear();
               this.l6 = true;
            }

            this.k5.addItem(var1);
         } else if (!this.l6 && var1.u3().u9()) {
            this.k5.addItem(var1);
         }
      }
   }

   public final com.aspose.slides.internal.v8.u9 n5(boolean var1) {
      int var2 = this.k5.size();
      if (var1) {
         while (var2 > 0) {
            com.aspose.slides.internal.v8.c8 var3 = this.k5.get_Item(var2 - 1);
            if (!var3.n5()) {
               break;
            }

            var2--;
         }
      }

      com.aspose.slides.internal.v8.u9 var9 = com.aspose.slides.internal.v8.u9.n5;
      int var4 = -1;

      for (int var5 = 0; var5 < var2; var5++) {
         com.aspose.slides.internal.v8.c8 var6 = this.k5.get_Item(var5);
         com.aspose.slides.internal.v8.u9 var7 = var6.u3();
         if (this.l6) {
            var9 = var9.n5(var7);
         } else {
            int var8 = var6.k5();
            if (var8 > var4) {
               var4 = var8;
               var9 = var7;
            } else if (var8 == var4) {
               if (var7.l6() > var9.l6()) {
                  var9 = var7;
               } else if (var7.l6() == var9.l6()) {
                  if (var9.n5() < var7.n5()) {
                     var9 = com.aspose.slides.internal.v8.u9.n5(var7.n5(), var9.l6(), var9.k5());
                  }

                  if (var9.k5() > var7.k5()) {
                     var9 = com.aspose.slides.internal.v8.u9.n5(var9.n5(), var9.l6(), var7.k5());
                  }
               }
            }
         }
      }

      return var9;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{"Space Specifier (resolved at begin/end of ref. area:):\n", this.n5(false), "\n"}) + this.n5(true);
   }
}
