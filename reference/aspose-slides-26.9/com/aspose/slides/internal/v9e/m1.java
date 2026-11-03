package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;

public class m1 extends n5 {
   private ArrayList n5 = new ArrayList();

   public final void n5(y2 var1) {
      this.n5.addItem(var1);
   }

   public final void n5(ArrayList var1) {
      this.n5.addRange(var1);
   }

   @Override
   public void n5(z1 var1) {
      int var2 = this.n5.size();

      for (int var3 = 0; var3 < var2; var3++) {
         ((y2)this.n5.get_Item(var3)).n5(var1);
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            var2.l6(0);
            var2.n5(2);

            while (var1.e2()) {
               y2 var4 = (y2)this.n5.get_Item(var2.u3());
               if (!var4.n5(var1, var2)) {
                  return;
               }

               if (var2.c8() >= this.n5.size()) {
                  var2.s7();
                  return;
               }
            }
            break;
         case 2:
            while (var1.e2()) {
               y2 var3 = (y2)this.n5.get_Item(var2.u3());
               if (!var3.n5(var1, var2)) {
                  break;
               }

               if (var2.c8() >= this.n5.size()) {
                  var2.s7();
                  break;
               }
            }
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid CopyCodeAction execution state");
      }
   }
}
