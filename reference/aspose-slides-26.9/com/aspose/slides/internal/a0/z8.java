package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z8 extends l6 {
   private n3 c8;
   private List<d5> t2 = new List<>();
   private boolean s7 = true;

   public z8(n3 var1) {
      this.c8 = var1;
      this.n5(31, true);
   }

   public final d5 l6(boolean var1) {
      if (this.t2.size() > 0 && this.k7().y2()) {
         this.t2.removeAt(this.t2.size() - 1);
      }

      y1 var2 = this.c8.y2();
      int var3 = this.c8.l6() - var2.n3() - var2.y4();
      d5 var4 = new d5(var1 ? 1 : this.z8(), this.j5(), var3);
      this.t2.addItem(var4);
      return this.k7();
   }

   public final List<d5> m1() {
      return this.t2;
   }

   public final void l6(List<d5> var1) {
      this.t2 = new List<>(var1);
   }

   public final d5 k7() {
      return this.t2.get_Item(this.t2.size() - 1);
   }

   public final boolean m3() {
      if (this.s7 && this.t2 != null) {
         List$Enumerator var1 = this.t2.iterator();

         try {
            while (var1.hasNext()) {
               d5 var2 = (d5)var1.next();
               if (!var2.y2()) {
                  this.s7 = false;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }

      return this.s7;
   }

   public final int z8() {
      return this.c8.k7();
   }

   public final int j5() {
      return this.c8.m3();
   }

   @Override
   public void n5(com.aspose.slides.internal.v8.u3 var1) {
      List$Enumerator var2 = this.m1().iterator();

      try {
         while (var2.hasNext()) {
            d5 var3 = (d5)var2.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
