package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

public class a6 extends r4 {
   a6() {
      this.w1().n5((byte)15);
      this.w1().n5((short)1);
   }

   public final a2w l6() {
      return (a2w)this.k5(61735);
   }

   public final y2o u3() {
      return (y2o)this.k5(61757);
   }

   public final b9y a6() {
      return (b9y)this.k5(61740);
   }

   public final k5w u9() {
      return (k5w)this.k5(61745);
   }

   public final g9t h0() {
      return (g9t)this.k5(61746);
   }

   public final z3 c8() {
      return (z3)this.k5(61756);
   }

   public final x5h[] t2() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         x5h var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), x5h.class);
         if (var3 != null) {
            var1.addItem(var3);
         }
      }

      return var1.size() > 0 ? (x5h[])var1.toArray(new x5h[0]) : null;
   }

   public final v2x[] s7() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         v2x var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), v2x.class);
         if (var3 != null && n5(var3, this.l6())) {
            var1.addItem(var3);
         }
      }

      return var1.size() > 0 ? (v2x[])var1.toArray(new v2x[0]) : null;
   }

   public final v2x[] x8() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         v2x var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), v2x.class);
         if (var3 != null && this.l6(var3, this.l6())) {
            var1.addItem(var3);
         }
      }

      return var1.size() > 0 ? (v2x[])var1.toArray(new v2x[0]) : null;
   }

   static boolean n5(v2x var0, a2w var1) {
      if (var0 == null) {
         throw new ArgumentNullException("timeCondition");
      } else if (var1 == null) {
         throw new ArgumentNullException("timeNodeAtom");
      } else {
         return var0.w1().k5() == 1 ? true : var0.w1().k5() == 3 && var1.k5() == 1;
      }
   }

   private boolean l6(v2x var1, a2w var2) {
      if (var1 == null) {
         throw new ArgumentNullException("timeCondition");
      } else if (var2 == null) {
         throw new ArgumentNullException("timeNodeAtom");
      } else {
         return var1.w1().k5() == 2 ? true : var1.w1().k5() == 4 && var2.k5() == 1;
      }
   }
}
