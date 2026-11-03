package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.List;
import java.util.Comparator;

public final class t9 {
   private List<e2> n5;

   public final int n5() {
      return this.n5.size();
   }

   public final int l6() {
      return this.n5.getCapacity();
   }

   public final void n5(int var1) {
      this.n5.setCapacity(var1);
   }

   public final e2 l6(int var1) {
      return this.n5.get_Item(var1);
   }

   public final void n5(int var1, e2 var2) {
      this.n5.set_Item(var1, var2);
   }

   public t9() {
      this.n5 = new List<>();
   }

   public t9(int var1) {
      this.n5 = new List<>(var1);
   }

   public final void n5(e2 var1) {
      this.n5.addItem(var1);
   }

   public final void n5(t9 var1) {
      for (int var2 = 0; var2 < var1.n5(); var2++) {
         this.n5.addItem(var1.l6(var2));
      }
   }

   public final void l6(e2 var1) {
      this.n5.removeItem(var1);
   }

   public final void n5(Comparator<e2> var1) {
      this.n5.sort(var1);
   }

   public final int k5(e2 var1) {
      return this.n5.binarySearch(var1);
   }

   public final void n5(e2[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         this.n5.addItem(var1[var2]);
      }
   }

   public final void l6(int var1, e2 var2) {
      this.n5.insertItem(var1, var2);
   }

   public final void u3(e2 var1) {
      int var2 = this.k5(var1);
      if (var2 < 0) {
         this.l6(~var2, var1);
      } else {
         this.l6(var2 + 1, var1);
      }
   }

   public final void k5() {
      this.n5.clear();
   }
}
