package com.aspose.slides.internal.y9w;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.e2;

public class k5 {
   private final List<l6> n5 = new List<>();

   public final l6 n5(long var1) {
      return this.n5.get_Item((int)var1);
   }

   public final int n5() {
      return this.n5.size();
   }

   public final void n5(l6 var1) {
      this.n5.addItem(var1);
   }

   public final l6 n5(l6 var1, long var2) {
      return (var2 & 4294967295L) != 4294967295L && (var2 & 4294967295L) >= 0L && (var2 & 4294967295L) < this.n5.size() && var1 != this.n5(var2)
         ? this.n5(var2)
         : null;
   }

   public final e2 l6() {
      e2 var1 = new e2();
      com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1, j5.z1());

      for (long var3 = 0L; (var3 & 4294967295L) < this.n5.size(); var3++) {
         this.n5(var3).n5(var2);
      }

      l6 var5 = new l6();

      while (var1.getLength() % 512L != 0L) {
         var5.n5(var2);
      }

      return var1;
   }
}
