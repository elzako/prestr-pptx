package com.aspose.slides.internal.f5;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class n3 {
   private x8 n5 = new x8();
   private k5 l6;

   public n3(k5 var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.j3.x8 n5(String var1) {
      IGenericEnumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.j3.x8 var3 = (com.aspose.slides.internal.j3.x8)var2.next();
            if (var3.l6(var1, d1.n5)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   public final com.aspose.slides.internal.j3.n3 l6(String var1) {
      x8 var2 = new x8();
      IGenericEnumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.j3.x8 var4 = (com.aspose.slides.internal.j3.x8)var3.next();
            if (var4.l6(var1, d1.n5)) {
               var2.n5(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   public final void n5(s7 var1) {
      this.n5.n5(var1);
   }
}
