package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public final class f2 implements IGenericEnumerable<p8> {
   private s0 n5 = new s0();
   private s0 l6 = new s0();
   private List<p8> k5 = new List<>();
   private List<p8> u3 = new List<>();

   public final void n5(s0 var1) {
      this.k5.addItem(new p8(this));
      this.k5.get_Item(this.k5.size() - 1).n5(new i1(var1.a6(), 0));
   }

   public final void l6(s0 var1) {
      this.k5.get_Item(this.k5.size() - 1).n5(new i1(var1.a6(), 1));
   }

   public final void n5(i1 var1) {
      this.k5.get_Item(this.k5.size() - 1).n5(var1);
   }

   public final void n5() {
      this.k5.get_Item(this.k5.size() - 1).h0();
   }

   public final void n5(boolean var1, com.aspose.slides.ms.System.o5<s0> var2) {
      List$Enumerator var3 = this.k5.iterator();

      try {
         while (var3.hasNext()) {
            p8 var4 = (p8)var3.next();
            if (var1) {
               var4.s7();
            }

            var4.t2();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      s0 var46 = new s0();
      if (com.aspose.slides.ms.System.o5.l6(var2, null)) {
         ((s0)var2.n5()).n5(var46);
      } else {
         this.a6();
         s0.l6(s0.n5(this.l6(), this.k5()), 2.0F).n5(var46);
      }

      List$Enumerator var5 = this.k5.iterator();

      try {
         while (var5.hasNext()) {
            p8 var6 = (p8)var5.next();
            var6.l6(var46.a6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      this.u3.clear();
      List$Enumerator var47 = this.k5.iterator();

      try {
         while (var47.hasNext()) {
            p8 var7 = (p8)var47.next();
            byte var8 = 0;
            p8 var9 = null;
            List$Enumerator var10 = this.k5.iterator();

            try {
               while (var10.hasNext()) {
                  p8 var11 = (p8)var10.next();
                  if (!com.aspose.slides.ms.System.j8.l6(var7, var11)) {
                     boolean var12 = var11.n5(var7);
                     var8 += var12 ? 1 : 0;
                     if (var12 && (var9 == null || var9.n5(var11))) {
                        var9 = var11;
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                  var10.dispose();
               }
            }

            var7.n5(var8 % 2 == 0 ? 1 : 2);
            if (var9 != null) {
               var9.l6(var7);
            } else {
               this.u3.addItem(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var47, IDisposable.class)) {
            var47.dispose();
         }
      }

      List$Enumerator var48 = this.k5.iterator();

      try {
         while (var48.hasNext()) {
            p8 var49 = (p8)var48.next();
            var49.c8();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var48, IDisposable.class)) {
            var48.dispose();
         }
      }

      this.a6();
   }

   private void a6() {
      this.k5(new s0(Float.POSITIVE_INFINITY));
      this.u3(new s0(Float.NEGATIVE_INFINITY));
      List$Enumerator var1 = this.k5.iterator();

      try {
         while (var1.hasNext()) {
            p8 var2 = (p8)var1.next();
            this.k5(new s0(q1.l6(this.l6().n5(), var2.u3().n5()), q1.l6(this.l6().l6(), var2.u3().l6())));
            this.u3(new s0(q1.n5(this.k5().n5(), var2.a6().n5()), q1.n5(this.k5().l6(), var2.a6().l6())));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   public final s0 l6() {
      return this.n5.a6();
   }

   private void k5(s0 var1) {
      this.n5 = var1.a6();
   }

   public final s0 k5() {
      return this.l6.a6();
   }

   private void u3(s0 var1) {
      this.l6 = var1.a6();
   }

   public final List<p8> u3() {
      return this.u3;
   }

   @Override
   public final IGenericEnumerator<p8> iterator() {
      return this.k5.iterator();
   }
}
