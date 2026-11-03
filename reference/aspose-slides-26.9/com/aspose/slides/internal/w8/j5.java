package com.aspose.slides.internal.w8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class j5 extends com.aspose.slides.internal.w5.k5 {
   public j5(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final String j9() {
      return this.t2("version", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("version", var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      var1.n5(this);
      t9 var2 = (t9)this.y4();
      IGenericEnumerator var3 = this.k7("BASE").iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.j3.z8 var4 = (com.aspose.slides.internal.j3.z8)var3.next();
            u9 var5 = (u9)var4;
            var5.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (var2.p3() != null) {
         var2.p3().n5(var1);
      } else if (var2.x9() != null) {
         var2.x9().n5(var1);
      }

      var1.l6(this);
   }
}
