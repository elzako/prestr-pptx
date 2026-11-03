package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class v6g implements Comparable<v6g> {
   private final List<v6g> n5;
   private v6g l6;
   private boolean k5;
   private boolean u3;
   private float a6;
   private float u9;
   private d2k h0 = new d2k();
   private boolean c8 = true;
   private int t2;

   public final k2p y2() {
      return this.n5(k2p.class);
   }

   public final v6g y1() {
      return this.l6;
   }

   public final v6g[] a0() {
      return this.n5.toArray(new v6g[0]);
   }

   public final float d2() {
      return this.h0.n5;
   }

   public final void k5(float var1) {
      this.h0.n5 = var1;
   }

   public final float d5() {
      return this.h0.l6;
   }

   public final void u3(float var1) {
      this.h0.l6 = var1;
   }

   public final d2k s3() {
      return this.h0;
   }

   public final void n5(d2k var1) {
      var1.n5(this.h0);
   }

   public final float p8() {
      return this.l6 != null ? this.l6.p8() + this.a6 : this.a6;
   }

   public final float f2() {
      return this.l6 != null ? this.l6.f2() + this.u9 : this.u9;
   }

   public final com.aspose.slides.internal.o9b.w1 i1() {
      return new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2() / 2.0F, this.f2() + this.d5() / 2.0F);
   }

   public final com.aspose.slides.internal.o9b.y1 e5() {
      return new com.aspose.slides.internal.o9b.y1(this.p8(), this.f2(), this.d2(), this.d5());
   }

   public final float b3() {
      return this.a6;
   }

   public final void a6(float var1) {
      this.a6 = var1;
      if (this.a6 < -50000.0F) {
         this.a6 = -50000.0F;
      }

      if (this.a6 > 50000.0F) {
         this.a6 = 50000.0F;
      }
   }

   public final float o0() {
      return this.u9;
   }

   public final void u9(float var1) {
      this.u9 = var1;
      if (this.u9 < -50000.0F) {
         this.u9 = -50000.0F;
      }

      if (this.u9 > 50000.0F) {
         this.u9 = 50000.0F;
      }
   }

   public int O_() {
      return 0;
   }

   public boolean T_() {
      return this.c8;
   }

   public void l6(boolean var1) {
      this.c8 = var1;
   }

   protected v6g() {
      this.n5 = new List<>();
   }

   protected void l6() {
   }

   void U_() {
   }

   public final void z7() {
      List$Enumerator var1 = this.h0().iterator();

      try {
         while (var1.hasNext()) {
            v6g var2 = (v6g)var1.next();
            if (var2.c8()) {
               var2.l6();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   public final void v4() {
      List$Enumerator var1 = this.h0().iterator();

      try {
         while (var1.hasNext()) {
            v6g var2 = (v6g)var1.next();
            var2.V_();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   public final void n5(v6g var1) {
      var1.l6 = this;
      this.n5.addItem(var1);
   }

   public final void l6(v6g var1) {
      var1.l6 = null;
      this.n5.removeItem(var1);
   }

   public final void u6() {
      this.n5.clear();
   }

   public final void n3(z5 var1) {
      this.k5(var1);
      this.a6(var1);
      this.u9(var1);
      this.u3();
   }

   protected void V_() {
   }

   public final void t1() {
      this.u3 = true;
   }

   private void u3() {
      this.k5 = true;
      this.u3 = false;
   }

   protected void n5(z5 var1) {
   }

   protected void l6(z5 var1) {
   }

   protected void u3(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
   }

   protected final <T extends v6g> T n5(Class<T> var1) {
      v6g var2 = null;

      for (v6g var3 = this.l6; var3 != null && var2 == null; var3 = var3.l6) {
         var2 = com.aspose.slides.internal.v6g.k5.n5(var3, var1);
      }

      return (T)var2;
   }

   private void k5(z5 var1) {
      this.u3 = false;
      this.k5 = false;
      this.n5(var1);
   }

   private void a6(z5 var1) {
      this.l6(var1);
   }

   private void u9(z5 var1) {
      this.u3(var1);
   }

   private List<v6g> h0() {
      List var1 = new List();
      var1.addItem(this);
      this.n5(var1);
      int var2 = 0;

      while (var2 < var1.size()) {
         ((v6g)var1.get_Item(var2)).t2 = var2++;
      }

      var1.sort();
      return var1;
   }

   private void n5(List<v6g> var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            v6g var3 = (v6g)var2.next();
            var1.addItem(var3);
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final int k5(v6g var1) {
      int var2 = this.t2();
      int var3 = var1.t2();
      if (var2 == var3) {
         if (this.t2 == var1.t2) {
            return 0;
         } else {
            return this.t2 > var1.t2 ? 1 : -1;
         }
      } else {
         return var2 > var3 ? 1 : -1;
      }
   }

   private boolean c8() {
      boolean var1 = this.T_();

      for (v6g var2 = this.y1(); var1 && var2 != null; var2 = var2.y1()) {
         var1 = var2.T_();
      }

      return var1;
   }

   private int t2() {
      int var1 = this.O_();

      for (v6g var2 = this.y1(); var2 != null; var2 = var2.y1()) {
         if (var2.O_() > var1 && var1 == 0) {
            var1 = var2.O_();
         }
      }

      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(v6g bridgeArg0) {
      return this.k5(bridgeArg0);
   }

}
