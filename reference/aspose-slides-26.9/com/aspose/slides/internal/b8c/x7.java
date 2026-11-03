package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;

public class x7 extends n5 {
   private t9 n5;
   private ArrayList l6;
   private int k5 = 0;

   public final int k5() {
      return this.k5 == 0 ? -1 : ((z5)this.l6.get_Item(this.k5 - 1)).n5;
   }

   public x7(k5 var1, t9 var2) {
      super(var1);
      this.l6 = new ArrayList();
      this.n5 = var2;
   }

   @Override
   public boolean l6(String var1, String var2) {
      super.l6(var1, var2);
      return this.k5 > 0 && this.n5() == this.k5();
   }

   public final int n5(int var1, int var2) {
      h5 var3 = new h5(this.n5.n5(), var1, var2);
      z5 var4;
      if (this.k5 < this.l6.size()) {
         var4 = (z5)this.l6.get_Item(this.k5);
         var4.l6 = var3;

         for (int var5 = 0; var5 < this.n5.n5(); var5++) {
            var4.k5[var5].n5(var3);
         }
      } else {
         var4 = new z5(var3, this.n5.n5());

         for (int var6 = 0; var6 < this.n5.n5(); var6++) {
            var4.k5[var6] = new a1(this.n5.n5.k5()[var6], var3, var6);
            this.n5.k5.addItem(var4.k5[var6]);
         }

         this.l6.addItem(var4);
      }

      var4.n5 = this.n5() - 1;
      return this.k5++;
   }

   public final h5 u3() {
      return ((z5)this.l6.get_Item(--this.k5)).l6;
   }
}
