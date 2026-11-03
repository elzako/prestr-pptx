package com.aspose.slides.internal.w8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class m1 extends com.aspose.slides.internal.w5.k5 {
   public m1(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final String j9() {
      return this.t2("cols", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("cols", var1);
   }

   public final String z6() {
      return this.t2("rows", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("rows", var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      var1.n5(this);
      this.l6(var1);
      var1.l6(this);
   }

   public final IGenericList<z3> e9() {
      List var1 = new List();
      IGenericEnumerator var2 = this.h0("FRAME").iterator();

      try {
         while (var2.hasNext()) {
            z3 var3 = (z3)var2.next();
            var1.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }
}
