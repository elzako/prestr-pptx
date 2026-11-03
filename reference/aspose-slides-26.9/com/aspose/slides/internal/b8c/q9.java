package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.exceptions.ArgumentNullException;

public class q9 extends q5 {
   public static final e3m n5 = new q9((m9)p1.n5);
   public static final e3m l6 = new q9((m9)p1.l6);

   protected q9(m9 var1) {
      super(var1);
   }

   @Override
   public Object n5(Object var1, com.aspose.slides.ms.System.y8 var2, com.aspose.slides.ms.System.Xml.a3 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (var2 == null) {
         throw new ArgumentNullException("destinationType");
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var1, IEnumerable.class)
         || com.aspose.slides.ms.System.j8.n5(var1) == n3
         || com.aspose.slides.ms.System.j8.n5(var1) == c4) {
         var1 = new Object[]{var1};
      }

      return this.l6(var1, var2, var3);
   }
}
