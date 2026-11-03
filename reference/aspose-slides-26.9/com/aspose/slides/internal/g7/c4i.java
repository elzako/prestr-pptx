package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class c4i extends i2 {
   private m0l n5;
   private u0b l6;
   private q5v k5;
   private n2 u3;
   private m1 a6;
   private List<Double> u9;
   private Object h0 = new Object();
   private Object c8 = new Object();
   private Object t2 = new Object();
   private Object s7 = new Object();

   public c4i(n2 var1) {
      this.n5 = new m0l();
      this.a6 = new m1();
      this.u3 = var1;
      this.u9 = new List<>();
   }

   public m0l n5() {
      return this.n5;
   }

   public final List<Double> l6() {
      return this.u9;
   }

   @Override
   public int a6() {
      return 1;
   }

   @Override
   public String u9() {
      return this.n5().k5();
   }

   @Override
   public t7 t2() {
      if (this.k5 == null) {
         synchronized (this.s7) {
            if (this.k5 == null) {
               this.k5 = new q5v(this);
            }
         }
      }

      return this.k5;
   }

   @Override
   public v7 s7() {
      if (this.l6 == null) {
         synchronized (this.t2) {
            if (this.l6 == null) {
               this.l6 = new u0b(this);
            }
         }
      }

      return this.l6;
   }

   public k6 n5(String var1) {
      k6 var2 = null;
      if (this.n5().c8().l6.containsKey(var1)) {
         var2 = this.n5(com.aspose.slides.internal.v6g.k5.u3(this.n5().c8().l6.get_Item(var1), int.class));
      }

      return var2;
   }

   public final k6 n5(int var1) {
      r1 var2 = this.n5().c8().n5[var1];
      k6 var3 = new k6();
      r1x var4 = new r1x(this.n5().h0().n5());
      g5d var5 = new g5d(var4, this, var3);
      var4.n5(var5);

      try {
         this.a6.n5(var2.l6());
         var4.l6(this.a6);
      } finally {
         this.a6.n5();
      }

      return var3;
   }

   @Override
   public k6 n5(r9 var1) {
      k3 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, k3.class);
      if (var2 != null) {
         return this.n5(var2.n5());
      } else {
         k2 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, k2.class);
         if (var3 != null) {
            return this.n5(var3.n5());
         } else {
            throw new z0("Integer Glyph ID is not supported for this font type.");
         }
      }
   }

   @Override
   public n2 x8() {
      return this.u3;
   }

   @Override
   public d3 n3() {
      if (com.aspose.slides.internal.v6g.k5.l6(this, v7o.class)) {
         throw new x5("Requested font type subsetting is not supported.");
      } else {
         return new k0y(this);
      }
   }
}
