package com.aspose.slides.internal.z6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class k7 {
   private String n5;
   private a6 l6;
   private com.aspose.slides.internal.y1.u3 k5;
   private Dictionary<String, Object> u3 = new Dictionary<>();

   public k7(a6 var1, String var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   public final void n5(com.aspose.slides.internal.y1.u3 var1) {
      this.k5 = var1;
   }

   public final void n5(String var1, Object var2) {
      this.u3.addItem(var1, var2);
   }

   @Override
   public String toString() {
      a5 var1 = new a5("RendererContext{\n");
      Dictionary$KeyCollection$Enumerator var2 = this.u3.getKeys().iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            Object var4 = this.u3.get_Item(var3);
            var1.n5(d1.n5(new Object[]{"\t", var3, "=", var4, "\n"}));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      var1.n5("}");
      return var1.toString();
   }
}
