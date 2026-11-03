package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public final class p8 implements IGenericEnumerable<i1> {
   private int n5;
   private boolean l6;
   private boolean k5;
   private s0 u3 = new s0();
   private s0 a6 = new s0();
   private List<i1> u9 = new List<>();
   private List<p8> h0 = new List<>();
   private f2 c8;

   public p8(f2 var1) {
      this.c8 = var1;
      this.n5(0);
      this.n5(false);
      this.l6(false);
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   private void n5(boolean var1) {
      this.l6 = var1;
   }

   public final boolean k5() {
      return this.k5;
   }

   private void l6(boolean var1) {
      this.k5 = var1;
   }

   public final s0 u3() {
      return this.u3.a6();
   }

   private void k5(s0 var1) {
      this.u3 = var1.a6();
   }

   public final s0 a6() {
      return this.a6.a6();
   }

   private void u3(s0 var1) {
      this.a6 = var1.a6();
   }

   public final int u9() {
      return this.u9.size();
   }

   public final i1 l6(int var1) {
      return this.u9.get_Item(var1);
   }

   public final void n5(i1 var1) {
      this.u9.addItem(var1);
   }

   public final void h0() {
      this.n5(true);
   }

   @Override
   public final IGenericEnumerator<i1> iterator() {
      return this.u9.iterator();
   }

   public final boolean n5(p8 var1) {
      if (!this.l6()) {
         return false;
      }

      if (!(this.u3().n5() > var1.u3().n5()) && !(this.u3().l6() > var1.u3().l6()) && !(this.a6().n5() < var1.a6().n5()) && !(this.a6().l6() < var1.a6().l6())) {
         List$Enumerator var2 = var1.u9.iterator();

         try {
            while (var2.hasNext()) {
               i1 var3 = (i1)var2.next();
               if (!this.n5(var3.n5().a6())) {
                  return false;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public final boolean n5(s0 var1) {
      boolean var2 = false;

      for (int var3 = 0; var3 < this.u9.size() - 1; var3++) {
         if (this.u9.get_Item(var3).a6() > var1.l6() != this.u9.get_Item(var3 + 1).a6() > var1.l6()
            && var1.n5()
               < (this.u9.get_Item(var3 + 1).u3() - this.u9.get_Item(var3).u3())
                     * (var1.l6() - this.u9.get_Item(var3).a6())
                     / (this.u9.get_Item(var3 + 1).a6() - this.u9.get_Item(var3).a6())
                  + this.u9.get_Item(var3).u3()) {
            var2 = !var2;
         }
      }

      return var2;
   }

   public final void c8() {
      float var1 = 0.0F;

      for (int var2 = 0; var2 < this.u9.size() - 1; var2++) {
         s0 var3 = this.u9.get_Item(var2).n5().a6();
         s0 var4 = this.u9.get_Item(var2 + 1).n5().a6();
         var1 += (var4.n5() - var3.n5()) * (var4.l6() + var3.l6());
      }

      if (this.n5() == 1 && var1 > 0.0F) {
         this.u9.reverse();
         this.l6(true);
      } else if (this.n5() == 2 && var1 < 0.0F) {
         this.u9.reverse();
         this.l6(true);
      }
   }

   public final void t2() {
      for (int var1 = 1; var1 < this.u9.size(); var1++) {
         float var2 = s0.l6(this.u9.get_Item(var1).n5(), this.u9.get_Item(var1 - 1).n5()).k5();
         if (var2 < 1.0F) {
            this.u9.removeAt(var1--);
         }
      }

      if (this.l6() && !w2.n5(this.u9.get_Item(0).n5().a6(), this.u9.get_Item(this.u9.size() - 1).n5().a6())) {
         this.u9.addItem(new i1(this.u9.get_Item(0).n5().a6(), 1));
      }

      this.e2();
   }

   public final void s7() {
      int var1 = !w2.n5(this.u9.get_Item(0).n5().a6(), this.u9.get_Item(this.u9.size() - 1).n5().a6()) ? this.u9.size() : this.u9.size() - 1;
      if (var1 >= 4) {
         for (int var2 = 0; var2 < var1; var2++) {
            s0 var3 = new s0();
            int var4 = (var2 + 1) % var1;
            int var5 = (var2 + 2) % var1;
            int var6 = (var2 + 3) % var1;
            s0[] var7 = new s0[]{var3};
            boolean var8 = w2.n5(
               this.u9.get_Item(var2).n5().a6(), this.u9.get_Item(var4).n5().a6(), this.u9.get_Item(var5).n5().a6(), this.u9.get_Item(var6).n5().a6(), var7
            );
            var7[0].n5(var3);
            if (var8) {
               this.u9.get_Item(var4).n5(var3.a6());
               this.u9.removeAt(var5);
               var1--;
            }
         }
      }
   }

   public final void l6(s0 var1) {
      List$Enumerator var2 = this.u9.iterator();

      try {
         while (var2.hasNext()) {
            i1 var3 = (i1)var2.next();
            var3.n5(new s0(var3.n5().n5() - var1.n5(), var1.l6() - var3.n5().l6()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.e2();
   }

   public final void l6(p8 var1) {
      this.h0.addItem(var1);
   }

   public final List<p8> x8() {
      return this.h0;
   }

   public final com.aspose.slides.internal.x4g.s7 n3() {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();
      this.n5(var1);
      return var1;
   }

   private void n5(com.aspose.slides.internal.x4g.s7 var1) {
      for (int var2 = 0; var2 < this.u9.size() - 1; var2++) {
         var1.l6(this.u9.get_Item(var2).u3(), this.u9.get_Item(var2).a6(), this.u9.get_Item(var2 + 1).u3(), this.u9.get_Item(var2 + 1).a6());
      }

      if (this.l6()) {
         var1.n3();
      } else {
         var1.t9();
      }

      List$Enumerator var7 = this.h0.iterator();

      try {
         while (var7.hasNext()) {
            p8 var3 = (p8)var7.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }
   }

   private void e2() {
      this.k5(new s0(Float.POSITIVE_INFINITY));
      this.u3(new s0(Float.NEGATIVE_INFINITY));
      if (this.u9.size() != 0) {
         List$Enumerator var1 = this.u9.iterator();

         try {
            while (var1.hasNext()) {
               i1 var2 = (i1)var1.next();
               this.k5(new s0(q1.l6(this.u3().n5(), var2.u3()), q1.l6(this.u3().l6(), var2.a6())));
               this.u3(new s0(q1.n5(this.a6().n5(), var2.u3()), q1.n5(this.a6().l6(), var2.a6())));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }
   }

   public final f2 y4() {
      return this.c8;
   }
}
