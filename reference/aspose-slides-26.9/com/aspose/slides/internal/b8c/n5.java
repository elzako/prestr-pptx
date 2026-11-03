package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;

public class n5 {
   private int n5;
   private boolean l6;
   private k5 k5;
   private ArrayList u3;

   public final int n5() {
      return this.n5;
   }

   public final void l6() {
      this.l6 = true;
      this.n5 = -1;
   }

   public n5(k5 var1) {
      this.k5 = var1;
      this.n5 = -1;
      this.u3 = new ArrayList(var1.n5().size());

      for (int var2 = 0; var2 < var1.n5().size(); var2++) {
         u9 var3 = new u9((t3)var1.n5().get_Item(var2), this);
         this.u3.addItem(var3);
      }

      this.l6 = true;
   }

   public final boolean n5(String var1, String var2) {
      if (!this.l6) {
         return false;
      }

      this.n5++;
      boolean var3 = false;

      for (int var4 = 0; var4 < this.u3.size(); var4++) {
         u9 var5 = (u9)this.u3.get_Item(var4);
         if (var5.n5().a6()) {
            if (var5.n5().u3() || this.n5() == 0) {
               var3 = true;
            }
         } else if (this.n5() != 0 && var5.l6(var1, var2, this.n5)) {
            var3 = true;
         }
      }

      return var3;
   }

   public boolean l6(String var1, String var2) {
      if (this.n5 == 0) {
         this.l6 = false;
         this.n5--;
      }

      if (!this.l6) {
         return false;
      }

      for (int var3 = 0; var3 < this.u3.size(); var3++) {
         ((u9)this.u3.get_Item(var3)).n5(var1, var2, this.n5);
      }

      this.n5--;
      return false;
   }

   public final boolean k5(String var1, String var2) {
      if (!this.l6) {
         return false;
      }

      boolean var3 = false;

      for (int var4 = 0; var4 < this.u3.size(); var4++) {
         if (((u9)this.u3.get_Item(var4)).k5(var1, var2, this.n5 + 1)) {
            var3 = true;
         }
      }

      return var3;
   }
}
