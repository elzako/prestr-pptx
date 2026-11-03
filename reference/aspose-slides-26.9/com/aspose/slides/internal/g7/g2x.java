package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class g2x {
   private boolean n5;
   private int l6;
   private int k5;
   private u6p u3;
   private final List<s2b> a6 = new List<>();
   private final String u9;
   private final boolean h0;
   private boolean c8;
   private u0a t2;

   public g2x(m5 var1, u0a var2, boolean var3) {
      this.u9 = var1.l6();
      this.h0 = var3;

      for (int var4 = 0; var4 < var1.l6().length(); var4++) {
         this.a6.addItem(new s2b(var2.s7().l6(var1.l6().charAt(var4)), var1.n5().get_Item(var4)));
      }

      this.n5(var2);
   }

   private void n5(u0a var1) {
      this.t2 = var1;
      this.c8 = false;
      this.n5(false);
      this.l6(0);
      this.k5(0);
      if (this.t2()) {
         this.a6.reverse();
      }
   }

   public final List<s2b> n5() {
      return this.a6;
   }

   public final s2b n5(int var1) {
      return this.a6.get_Item(var1);
   }

   public final int l6() {
      return this.a6.size();
   }

   public final boolean k5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final int u3() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int a6() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   public final u0a u9() {
      return this.t2;
   }

   public final u6p h0() {
      return this.u3;
   }

   public final void n5(u6p var1) {
      this.u3 = var1;
   }

   public final void n5(int[] var1) {
      if (this.t2()) {
         var1[0]--;
      } else {
         var1[0]++;
      }
   }

   public final int c8() {
      return this.t2() ? this.l6() - 1 : 0;
   }

   public final boolean u3(int var1) {
      return this.t2() ? var1 >= 0 : var1 < this.l6();
   }

   public final boolean t2() {
      return this.h0;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      List$Enumerator var2 = this.a6.iterator();

      try {
         while (var2.hasNext()) {
            s2b var3 = (s2b)var2.next();
            var1.n5(var3.n5()).n5(" ");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }
}
