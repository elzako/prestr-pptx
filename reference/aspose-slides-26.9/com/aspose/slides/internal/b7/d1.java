package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class d1 implements IGenericCloneable<d1> {
   private double n5;
   private double l6;
   private u0 k5;
   private final boolean u3;
   private final int a6;
   private final double u9;
   private final List<u0> h0 = new List<>();
   private final boolean c8;
   private final double t2;

   public d1(double var1, double var3, int var5, boolean var6, boolean var7) {
      this.t2 = var1;
      this.u9 = var3;
      this.a6 = var5;
      this.u3 = var6;
      this.c8 = var7;
      this.n5(1.0);
      this.l6(1.0);
   }

   public final void n5(double var1, double var3, double var5, double var7) {
      this.h0().n5(var1, var3, var5, var7);
   }

   final List<n7> n5() {
      List var1 = new List();
      List$Enumerator var2 = this.h0.iterator();

      try {
         while (var2.hasNext()) {
            u0 var3 = (u0)var2.next();
            n7 var4 = var3.k5();
            if (com.aspose.slides.ms.System.q1.n5(1.0 - this.a6()) > 0.01 || com.aspose.slides.ms.System.q1.n5(1.0 - this.u9()) > 0.01) {
               var4.l6(this.a6(), this.u9(), true);
               var4.a6();
            }

            var1.addItem(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final d1 l6() {
      d1 var1 = new d1(this.t2, this.u9, this.a6, this.u3, this.c8);
      List$Enumerator var2 = this.h0.iterator();

      try {
         while (var2.hasNext()) {
            u0 var3 = (u0)var2.next();
            var1.n5(var3.u3());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final void n5(k0 var1, k0 var2, k0 var3) {
      this.h0().n5(var1.u3(), var2.u3(), var3.u3());
   }

   public final void k5() {
      this.k5 = new u0(this.t2, this.u9, this.a6, this.u3, this.c8);
      this.n5(this.k5);
   }

   public final void u3() {
      this.h0().a6();
   }

   public final void n5(double var1, double var3) {
      this.h0().n5(var1, var3);
   }

   public final void l6(double var1, double var3) {
      u0 var5 = this.h0();
      if (!var5.l6()) {
         this.k5 = null;
      }

      this.h0().l6(var1, var3);
   }

   public final void n5(k0 var1, k0 var2) {
      this.h0().n5(var1.u3(), var2.u3());
   }

   final double a6() {
      return this.n5;
   }

   final void n5(double var1) {
      this.n5 = var1;
   }

   final double u9() {
      return this.l6;
   }

   final void l6(double var1) {
      this.l6 = var1;
   }

   private void n5(u0 var1) {
      this.h0.addItem(var1);
   }

   private u0 h0() {
      if (this.k5 == null || this.k5.n5()) {
         this.k5 = new u0(this.t2, this.u9, this.a6, this.u3, this.c8);
         this.n5(this.k5);
      }

      return this.k5;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d1 cloneT() {
      return this.l6();
   }

}
