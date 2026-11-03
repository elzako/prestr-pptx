package com.aspose.slides.internal.a8;

import com.aspose.slides.Collections.Generic.List;

public class u3 implements u9 {
   private x8 n5;
   private int l6;
   private List<String> k5 = new List<>();
   private boolean u3;

   public u3(x8 var1) {
      this.n5 = var1;
   }

   public final int n5() {
      return this.l6;
   }

   @Override
   public final void n5(String var1) {
      if ("float".equals(var1)) {
         this.l6++;
      }

      this.k5.addItem(var1);
   }

   @Override
   public final void l6() {
      String var1 = this.k5.get_Item(this.k5.size() - 1);
      this.k5.removeAt(this.k5.size() - 1);
      if ("float".equals(var1)) {
         if (this.l6 >= 3) {
            this.u3 = true;
         }

         this.l6--;
         if (this.u3 && this.l6 == 0) {
            if (this.k5.size() > 2) {
               if (!"inline".equals(this.k5.get_Item(this.k5.size() - 3))) {
                  this.n5.n5("&nbsp;");
               }
            } else {
               this.n5.n5("&nbsp;");
            }

            this.u3 = false;
         }
      }
   }
}
