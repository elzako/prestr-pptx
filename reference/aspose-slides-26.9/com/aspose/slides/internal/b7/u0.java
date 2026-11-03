package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class u0 implements IGenericCloneable<u0> {
   private final List<d8> n5;
   private final boolean l6;
   private final int k5;
   private final double u3;
   private boolean a6;
   private k0 u9 = new k0();
   private final boolean h0;
   private final double c8;

   public u0(double var1, double var3, int var5, boolean var6, boolean var7) {
      this.c8 = var1;
      this.u3 = var3;
      this.k5 = var5;
      this.l6 = var6;
      this.h0 = var7;
      this.n5 = new List<>();
      this.u9 = new k0();
   }

   public final boolean n5() {
      return this.a6;
   }

   public final boolean l6() {
      return 0 == this.n5.size();
   }

   public final void n5(k0 var1) {
      var1.n5(this.u9);
   }

   public final void n5(double var1, double var3, double var5, double var7) {
      this.n5(new k7(var3, var1, var5, var7));
   }

   final n7 k5() {
      n7 var1 = new n7(0);
      k0 var2 = this.u9.u3();
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            d8 var4 = (d8)var3.next();
            var4.n5(var1, var2.u3()).n5(var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }

   public final u0 u3() {
      u0 var1 = this.u9();
      var1.a6 = this.a6;
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            d8 var3 = (d8)var2.next();
            var1.n5.addItem(var3.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final void n5(k0 var1, k0 var2, k0 var3) {
      this.n5(new a7(var1.u3(), var2.u3(), var3.u3()));
   }

   public final void a6() {
      this.a6 = true;
   }

   public final void n5(double var1, double var3) {
      this.n5(new s6(var1, var3));
   }

   public final void l6(double var1, double var3) {
      this.n5(new k0(var1, var3));
   }

   public final u0 u9() {
      u0 var1 = new u0(this.c8, this.u3, this.k5, this.l6, this.h0);
      this.u9.n5(var1.u9);
      return var1;
   }

   public final void n5(k0 var1, k0 var2) {
      this.n5(new l9(var1.u3(), var2.u3()));
   }

   private void n5(d8 var1) {
      this.n5.addItem(var1);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u0 cloneT() {
      return this.u3();
   }

}
