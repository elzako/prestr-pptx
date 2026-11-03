package com.aspose.slides.internal.t1z;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.ms.System.Xml.f4;

public class n5 {
   private Hashtable n5 = null;

   public final void n5(String var1, String var2) {
      if (var1 != null && var1.length() > 0) {
         f4.k5(var1);
      }

      if (var2 != null && var2.length() > 0) {
         f4.z8(var2);
      }

      this.l6(var1, var2);
   }

   public final void l6(String var1, String var2) {
      this.n5().set_Item(var1, var2);
   }

   public final Hashtable n5() {
      if (this.n5 == null) {
         this.n5 = new Hashtable();
      }

      return this.n5;
   }

   public final void n5(Hashtable var1) {
      this.n5 = var1;
   }
}
