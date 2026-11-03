package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

final class g7p {
   private List<i2k> n5 = new List<>();
   private boolean l6 = false;
   private int k5;
   private int u3 = -1;

   public final void n5(i2k var1) {
      if (var1 != null) {
         if (this.n5.size() < 1) {
            this.l6 = true;
         }

         if (this.n5.size() > 0 && var1.u9()) {
            boolean var2 = this.n5.get_Item(this.k5).n5 == var1.n5;
            boolean var3 = !var2
               && this.n5.get_Item(this.k5).h0() == var1.h0()
               && com.aspose.slides.ms.System.d1.a6(this.n5.get_Item(this.k5).n5.n5.getLanguageId(), var1.n5.n5.getLanguageId())
               && (this.u3 < 0 || com.aspose.slides.ms.System.d1.a6(this.n5.get_Item(this.u3).n5.n5.getLanguageId(), var1.n5.n5.getLanguageId()));
            if (var2 || var3) {
               this.n5.insertItem(this.k5, var1);
               if (var3) {
                  this.u3 = this.n5.size() - 1;
               }

               return;
            }
         }

         if (this.n5.size() > 0 && this.u3 < 0) {
            this.u3 = this.n5.size() - 1;
         }

         this.n5.addItem(var1);
         this.k5 = this.n5.size() - 1;
      }
   }

   public final void n5(e3 var1, j5u var2, boolean var3, s5u var4) {
      if (var2 != null) {
         if (var1 != null) {
            int var5 = this.n5.size();
            if (var5 >= 1) {
               if (this.u3 < 0) {
                  this.u3 = 0;
               }

               float var6 = this.n5.get_Item(this.u3).l6().x8();
               if (var3) {
                  var6 = this.n5.get_Item(this.u3).l6().x8() + this.n5.get_Item(this.u3).l6().s7();
               }

               if (!var3) {
                  int var7 = this.n5.size();

                  while (var7 > 0) {
                     i2k var8 = this.n5.get_Item(--var7);
                     com.aspose.slides.internal.o9b.y1 var9 = new com.aspose.slides.internal.o9b.y1(
                        new com.aspose.slides.internal.o9b.w1(var6, var8.l6().n3()), var8.l6().c8().a6()
                     );
                     var2.n5(var1, var8.a6().k5(), var9.y4(), var8.k5(), var4);
                     var2.n5(var1, var8, var9.y4(), false, var4);
                     var6 += var8.l6().s7();
                  }
               } else {
                  for (int var10 = 0; var10 < this.n5.size(); var10++) {
                     i2k var11 = this.n5.get_Item(var10);
                     var6 -= var11.l6().s7();
                     com.aspose.slides.internal.o9b.y1 var12 = new com.aspose.slides.internal.o9b.y1(
                        new com.aspose.slides.internal.o9b.w1(var6, var11.l6().n3()), var11.l6().c8().a6()
                     );
                     var2.n5(var1, var11.a6().k5(), var12.y4(), var11.k5(), var4);
                     var2.n5(var1, var11, var12.y4(), false, var4);
                  }
               }

               this.n5.clear();
               this.l6 = false;
               this.k5 = 0;
               this.u3 = -1;
            }
         }
      }
   }

   public final boolean n5() {
      return this.l6;
   }
}
