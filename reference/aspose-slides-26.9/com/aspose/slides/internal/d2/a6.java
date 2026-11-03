package com.aspose.slides.internal.d2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class a6 extends s7 {
   private int e2;

   public final void t2(int var1) {
      this.e2 = var1;
   }

   public final int m1() {
      return this.e2;
   }

   @Override
   public int e_() {
      int var1 = 0;
      List$Enumerator var2 = this.d_().iterator();

      try {
         while (var2.hasNext()) {
            c8 var3 = (c8)var2.next();
            if (var1 < var3.e_()) {
               var1 = var3.e_();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   @Override
   public List<c8> d_() {
      int var1 = this.l6() / this.e2;
      List var2 = new List();

      for (int var3 = 0; var3 < var1; var3++) {
         var2.addRange(this.x8);
      }

      return var2;
   }

   @Override
   public boolean n5(double var1, int var3, int var4) {
      this.l6(this.l6() + this.s7.n5(var1));
      return false;
   }
}
