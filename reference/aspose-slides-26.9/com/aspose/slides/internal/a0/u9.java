package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p3.o5;

public class u9 {
   private List<c4> l6 = null;
   private int k5 = 0;
   protected c4 n5;

   public u9() {
      this.l6 = new List<>();
   }

   public void n5(c4 var1) {
      if (var1 == null) {
         throw new NullReferenceException("pageSequence must not be null");
      }

      if (this.n5 != null) {
         this.k5 = this.k5 + this.n5.n5();
      }

      this.n5 = var1;
      this.l6.addItem(this.n5);
   }

   public void n5(o5 var1) {
      this.n5.n5(var1);
      var1.n5(this.k5 + this.n5.n5() - 1);
      var1.n5(this.n5);
   }

   public void n5(z3 var1) {
   }

   public void n5() {
   }

   public final c4 l6() {
      return this.n5;
   }

   public final int k5() {
      return this.l6.size();
   }

   public final int n5(int var1) {
      return this.l6.get_Item(var1 - 1).n5();
   }

   public final o5 n5(int var1, int var2) {
      return this.l6.get_Item(var1 - 1).n5(var2);
   }

   public void n5(com.aspose.slides.internal.x7n.l6 var1) {
   }
}
