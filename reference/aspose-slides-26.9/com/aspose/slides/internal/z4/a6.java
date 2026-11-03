package com.aspose.slides.internal.z4;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.a3;

public class a6 {
   private final List<k5> n5 = new List<>();
   private final IGenericDictionary<String, t2> l6 = com.aspose.slides.internal.t6j.l6.n5();
   private final IGenericDictionary<String, t2> k5 = com.aspose.slides.internal.t6j.l6.n5();

   public final void n5(k5 var1) {
      this.n5.addItem(var1);
   }

   public final void n5(String var1, t2 var2) {
      this.l6.set_Item(var1, var2);
   }

   public final void n5(int var1, t2 var2) {
      this.k5.set_Item(a3.n5(var1, com.aspose.slides.internal.x7n.l6.k5()), var2);
   }

   public final void n5(t4 var1) {
      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         k5 var3 = this.n5.get_Item(var2);
         var3.n5(var1, this.l6, this.k5);
      }
   }
}
