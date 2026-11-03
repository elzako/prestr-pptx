package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class n0 {
   public o7 n5;
   public p5 l6;
   public o8 k5;
   private List<r9> u3 = new List<>();

   public n0() {
      this.n5 = new o7();
      this.l6 = new p5();
      this.k5 = new o8();
   }

   public final void n5(r9 var1) {
      this.u3.addItem(var1);
      this.k5(var1);
   }

   public final void n5() {
      this.u3.clear();
      this.u3();
   }

   public final int l6() {
      return this.u3.size();
   }

   public final boolean l6(r9 var1) {
      List$Enumerator var2 = this.u3.iterator();

      try {
         while (var2.hasNext()) {
            r9 var3 = (r9)var2.next();
            if (var3.equals(var1)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   public final IGenericEnumerator<r9> k5() {
      return this.u3.iterator();
   }

   private void k5(r9 var1) {
      if (this.n5 != null) {
         for (int var2 = 0; var2 < this.n5.n5(); var2++) {
            this.n5.n5(var2).n5(this, new c7(var1));
         }
      }
   }

   private void u3() {
      if (this.k5 != null) {
         for (int var1 = 0; var1 < this.k5.n5(); var1++) {
            this.k5.n5(var1).n5(this);
         }
      }
   }
}
