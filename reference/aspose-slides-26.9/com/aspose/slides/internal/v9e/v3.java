package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.ms.System.Xml.k6;

public class v3 {
   private k6 l6;
   public ArrayList n5;
   private j8 k5;
   private static v3$n5 u3 = new v3$n5(null);

   public v3(j8 var1, k6 var2) {
      this.l6 = var2;
      this.k5 = var1;
   }

   public final void n5(w2 var1) {
      if (this.n5 == null) {
         this.n5 = new ArrayList();
      }

      this.n5.addItem(var1);
   }

   public final void n5() {
      if (this.n5 != null) {
         this.n5.sort(u3);
      }
   }

   public final w2 n5(p3 var1, com.aspose.slides.internal.x6s.a6 var2) {
      if (this.n5 == null) {
         return null;
      }

      for (int var3 = this.n5.size() - 1; var3 >= 0; var3--) {
         w2 var4 = (w2)this.n5.get_Item(var3);
         int var5 = var4.n5();
         if (var5 != -1 && var1.n5(var2, var5)) {
            return var4;
         }
      }

      return null;
   }
}
