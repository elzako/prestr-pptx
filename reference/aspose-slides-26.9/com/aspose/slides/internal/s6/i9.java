package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;

public final class i9 {
   private List<j4> n5 = new List<>();

   public final int n5() {
      return this.n5.size();
   }

   public final int l6() {
      return this.n5.getCapacity();
   }

   public final void n5(int var1) {
      this.n5.setCapacity(var1);
   }

   public final j4 l6(int var1) {
      return this.n5.get_Item(var1);
   }

   public final void n5(j4 var1) {
      this.n5.addItem(var1);
   }

   public final void n5(i9 var1) {
      for (int var2 = 0; var2 < var1.n5(); var2++) {
         this.n5.addItem(var1.l6(var2));
      }
   }

   public final void n5(IGenericEnumerable<j4> var1) {
      this.n5.addRange(var1);
   }

   public final void l6(j4 var1) {
      this.n5.removeItem(var1);
   }

   public final int k5(j4 var1) {
      return this.n5.indexOf(var1);
   }

   public final void k5() {
      this.n5.clear();
   }

   public final void n5(int var1, j4 var2) {
      this.n5.insertItem(var1, var2);
   }
}
