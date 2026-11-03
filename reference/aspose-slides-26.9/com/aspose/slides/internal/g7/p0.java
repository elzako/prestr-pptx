package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p0 {
   private Dictionary<Integer, String> n5 = new Dictionary<>();
   private Dictionary<String, String> l6 = new Dictionary<>();

   public p0() {
   }

   public p0(String var1) {
      this.n5(var1, 1033);
   }

   public final void n5(String var1, int var2) {
      if (!this.l6.containsKey(var1)) {
         this.l6.addItem(var1, var1);
      }

      if (!this.n5.containsKey(var2)) {
         this.n5.addItem(var2, var1);
      }
   }

   public final boolean n5(String var1) {
      return this.l6.containsKey(var1);
   }

   public final String n5() {
      String var1 = com.aspose.slides.ms.System.d1.n5;
      Dictionary$KeyCollection$Enumerator var2 = this.n5.getKeys().iterator();

      try {
         while (var2.hasNext()) {
            int var3 = com.aspose.slides.internal.v6g.k5.u3(var2.next(), int.class);
            if (com.aspose.slides.ms.System.d1.n5(var1)) {
               var1 = this.n5.get_Item(var3);
            }

            if (var3 == 1033 || var3 == 3081 || var3 == 2057 || var3 == 4105 || var3 == 5129) {
               return this.n5.get_Item(var3);
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
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public boolean equals(Object objToCompare) {
      String var2 = com.aspose.slides.internal.v6g.k5.n5(objToCompare, String.class);
      return var2 != null ? this.n5(var2) : com.aspose.slides.ms.System.j8.l6(this, objToCompare);
   }
}
