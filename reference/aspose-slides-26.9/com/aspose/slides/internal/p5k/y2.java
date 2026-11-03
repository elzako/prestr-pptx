package com.aspose.slides.internal.p5k;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class y2 extends d2 {
   private short n5 = 1;
   private List<m3> l6 = new List<>();
   private short k5;

   public y2(l6 var1, short var2) {
      super(var1);
      this.k5 = var2;
   }

   public final void n5(short var1, com.aspose.slides.internal.w0.c8 var2, String var3) {
      this.n5(var1, var2, var3, false);
   }

   public final void n5(short var1, com.aspose.slides.internal.w0.c8 var2, String var3, boolean var4) {
      m3 var5 = new m3(var1, var2, this.n5++, var3, var4);
      this.l6.addItem(var5);
   }

   public final void n5() {
      y1 var1 = new y1(this.h0());
      var1.n5();
      this.u9().l6(this.k5);
      this.u9().l6(1);
      z8 var2 = new z8(this.h0());
      List$Enumerator var3 = this.l6.iterator();

      try {
         while (var3.hasNext()) {
            m3 var4 = (m3)var3.next();
            var2.n5(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.u9().n5(1, 0);
      this.u9().n5(0, 0);
      var1.n5(39);
   }

   public final short l6() {
      return this.k5;
   }
}
