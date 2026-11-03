package com.aspose.slides.internal.d0e;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class s7 {
   public static float n5 = -1.0F;
   public static float l6 = -1.0F;
   public String k5 = d1.n5;
   public String u3 = d1.n5;
   public String a6 = d1.n5;
   public t2 u9;

   public final com.aspose.slides.internal.d8v.a6 n5() {
      IGenericEnumerator var1 = this.u9.j5().iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var2.getValue(), com.aspose.slides.internal.d8v.a6.class)) {
               return (com.aspose.slides.internal.d8v.a6)var2.getValue();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }
}
