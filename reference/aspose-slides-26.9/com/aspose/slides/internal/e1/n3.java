package com.aspose.slides.internal.e1;

import com.aspose.slides.Collections.Generic.List;

public abstract class n3 extends m3 {
   private final List<m3> n5 = new List<>();

   public final int n5(m3 var1) {
      var1.k5(this);
      this.n5.addItem(var1);
      return this.n5.size() - 1;
   }

   public final void l6(m3 var1) {
      int var2 = this.n5.indexOf(var1);
      if (var2 != -1) {
         var1.k5((m3)null);
         this.n5.removeAt(var2);
      }
   }

   public final void c8() {
      for (int var1 = 0; var1 < this.n5.size(); var1++) {
         if (this.n5.get(var1) instanceof k7) {
            ((k7)this.n5.get(var1)).n3();
         }

         if (this.n5.get(var1) instanceof z1) {
            ((z1)this.n5.get(var1)).z8();
         }
      }

      this.n5.clear();
   }

   public final m3 n5(int var1) {
      return this.n5.size() > var1 ? this.n5.get_Item(var1) : null;
   }

   public final int t2() {
      return this.n5.size();
   }

   public final List<m3> s7() {
      return this.n5;
   }
}
