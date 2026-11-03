package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

abstract class p6x {
   private final p6x n5;
   private final w4c l6;

   public p6x n3() {
      return this.n5;
   }

   public final w4c y4() {
      return this.l6;
   }

   public final int e2() {
      return this.l6.a6();
   }

   public final String t9() {
      return this.l6.u3();
   }

   public final int z1() {
      if (this.n5 == null) {
         return 0;
      }

      p6x var1 = this.n5;

      int var2;
      for (var2 = 1; var1.n5 != null; var2++) {
         var1 = var1.n3();
      }

      return var2;
   }

   public final int t4() {
      if (this.n5 == null) {
         return 1;
      }

      List var1 = this.n5.x8();

      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (var1.get_Item(var2) == this) {
            return var2 + 1;
         }
      }

      throw new InvalidOperationException("Invalid state of node. Node are not attached to parent");
   }

   public final p6x q0() {
      if (this.n3() != null) {
         List var1 = this.n5.x8();

         for (int var2 = 0; var2 < var1.size(); var2++) {
            if (var2 != 0 && var1.get_Item(var2) == this) {
               return (p6x)var1.get_Item(var2 - 1);
            }
         }
      }

      return null;
   }

   public final p6x z3() {
      if (this.n3() != null) {
         List var1 = this.n5.x8();

         for (int var2 = 0; var2 < var1.size(); var2++) {
            if (var2 != var1.size() - 1 && var1.get_Item(var2) == this) {
               return (p6x)var1.get_Item(var2 + 1);
            }
         }
      }

      return null;
   }

   protected abstract List<p6x> x8();

   protected p6x(p6x var1, w4c var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5(t6w var1) {
      List var2 = this.x8();

      for (int var3 = 0; var3 < var2.size(); var3++) {
         p6x var4 = (p6x)var2.get_Item(var3);
         if (var4.e2() == 1 || var4.e2() == 2) {
            p6x var5 = (p6x)var2.get_Item(var3 - 1);
            p6x var6 = (p6x)var2.get_Item(var3 + 1);
            q9r var7 = new q9r(1);
            var7.n5(this.l6, var1);
            var7.l6(var4.l6, var1);
            var7.n5(var5.l6);
            var7.l6(var6.l6);
            var1.n5(var7);
            if (var4.x8().size() > 0) {
               var4.n5(var1);
            }
         }
      }
   }

   public final void n5(o1o var1) {
      var1.n5(this.l6);
      List$Enumerator var2 = this.x8().iterator();

      try {
         while (var2.hasNext()) {
            p6x var3 = (p6x)var2.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
