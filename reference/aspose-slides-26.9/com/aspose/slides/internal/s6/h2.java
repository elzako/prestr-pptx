package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.List;

public final class h2 {
   private List<a5> n5 = new List<>();

   public final int n5() {
      return this.n5.size();
   }

   public final int l6() {
      return this.n5.getCapacity();
   }

   public final void n5(int var1) {
      this.n5.setCapacity(var1);
   }

   public final a5 l6(int var1) {
      return this.n5.get_Item(var1);
   }

   public final void n5(a5 var1) {
      this.n5.addItem(var1);
   }

   public final void l6(a5 var1) {
      this.n5.removeItem(var1);
   }

   public final int k5(a5 var1) {
      return this.n5.indexOf(var1);
   }

   public final void k5() {
      this.n5.clear();
   }
}
