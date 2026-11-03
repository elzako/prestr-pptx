package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public abstract class o0 {
   protected k7 n5;
   protected b3 l6;
   protected List<w1> k5;
   protected int u3;

   public o0(k7 var1, b3 var2, w1 var3, int var4) {
      this.n5 = var1;
      this.l6 = (b3)var2.deepClone();
      this.k5 = new List<>();
      this.k5.addItem(((w1)var3.deepClone()).u9());
      this.u3 = var4;
   }

   public o0(k7 var1, b3 var2, List<w1> var3, int var4) {
      this.n5 = var1;
      this.l6 = (b3)var2.deepClone();
      this.k5 = new List<>();
      List$Enumerator var5 = var3.iterator();

      try {
         while (var5.hasNext()) {
            w1 var6 = (w1)var5.next();
            this.k5.addItem(((w1)var6.deepClone()).u9());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      this.u3 = var4;
   }

   public final void l6() {
      this.n5.beginRender();
      this.n5();
   }

   public final void k5() {
      this.n5.endRender();
      this.h0();
   }

   public final b3 u3() {
      return this.l6;
   }

   public final k7 a6() {
      return this.n5;
   }

   public final int u9() {
      return this.u3;
   }

   protected void n5() {
   }

   protected void h0() {
   }

   public abstract o0$k5 n5(o0$l6 var1);

   public abstract g7 n5(o0$k5 var1);
}
