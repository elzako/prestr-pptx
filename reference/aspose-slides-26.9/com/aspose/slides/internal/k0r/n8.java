package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class n8 extends m4d {
   private List<t0> n5 = new List<>();

   public n8(r5w var1) {
      super(var1);
      this.w1().n5(4002);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      for (int var2 = this.w1().a6(); var2 > 5; var2 -= 6) {
         this.n5.addItem(new t0(var1));
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            t0 var3 = (t0)var2.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public int n5() {
      return this.n5.size() * 6;
   }

   public final List<t0> l6() {
      return this.n5;
   }

   public final void n5(List<t0> var1) {
      this.n5 = var1;
   }

   public final boolean k5() {
      return this.n5 == null ? true : this.n5.size() < 1;
   }
}
