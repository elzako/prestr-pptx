package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class b3d implements j2m {
   private final List<j2m> n5 = new List<>();
   private final List<j2m> l6 = new List<>();
   private double k5 = 0.0;

   public b3d() {
   }

   public b3d(IGenericEnumerable<j2m> var1) {
      this();
      this.n5(var1);
   }

   @Override
   public final void dispose() {
      for (int var1 = this.n5.size() - 1; var1 >= 0; var1--) {
         this.n5.get_Item(var1).dispose();
      }

      this.n5.clear();
      this.l6.clear();
   }

   public final void n5(IGenericEnumerable<j2m> var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            j2m var3 = (j2m)var2.next();
            this.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final void n5(j2m var1) {
      if (var1 == null) {
         throw new ArgumentNullException("player");
      }

      this.n5.addItem(var1);
      this.l6.addItem(var1);
      this.k5 = com.aspose.slides.ms.System.q1.l6(this.k5, var1.k5());
   }

   @Override
   public final double k5() {
      return this.k5;
   }

   @Override
   public final void n5(double var1) {
      if (this.l6.size() != 0) {
         int var3 = 0;

         while (var3 < this.l6.size()) {
            j2m var4 = this.l6.get_Item(var3);
            if (var1 < var4.k5()) {
               var4.n5(var1);
               var3++;
            } else {
               var4.I_();
               this.l6.removeAt(var3);
            }
         }
      }
   }

   @Override
   public final void I_() {
      if (this.l6.size() != 0) {
         List$Enumerator var1 = this.l6.iterator();

         try {
            while (var1.hasNext()) {
               j2m var2 = (j2m)var1.next();
               var2.I_();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }
   }
}
