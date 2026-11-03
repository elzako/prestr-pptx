package com.aspose.slides.internal.l2;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.j7.z1;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class u3 extends a6 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "Default", "Override", "Extension", "ContentType", "PartName"
   );

   @Override
   public void n5(t4 var1) {
      z1 var2 = new z1(var1);
      IGenericEnumerator var3 = this.l6().iterator();

      try {
         while (var3.hasNext()) {
            u9 var4 = (u9)var3.next();
            var4.u3().setPosition(0L);
            var2.n5(k5(var4.n5()), var4.u3());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var2.n5();
   }

   private static String k5(String var0) {
      return d1.u3(var0,new char[]{ '/'});
   }
}
