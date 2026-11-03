package com.aspose.slides.internal.e9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.e1.m3;
import com.aspose.slides.internal.e1.n3;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.t2;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.e1.y4;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.IDisposable;

public class h0 extends y4 {
   private t2 n5 = null;
   private List<n3[]> l6 = new List<>();

   @Override
   public void l6(w1 var1) {
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            n3[] var3 = (n3[])var2.next();
            var3[0].l6(var3[1]);
            var3[0].n5(var3[2]);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.l6.clear();
   }

   @Override
   public void n5(t2 var1) {
      this.n5 = var1;
   }

   @Override
   public void l6(t2 var1) {
      this.n5 = null;
   }

   @Override
   public void l6(r4 var1) {
      if (var1.n3() != null) {
         t2 var2 = new t2();
         y1 var3 = com.aspose.slides.internal.e9.l6.n5((m3)var1).y4();
         var2.n5(com.aspose.slides.internal.e9.l6.n5(var1.n3(), var3.y4()));
         this.l6.addItem(new n3[]{this.n5, var1, var2});
      }
   }
}
