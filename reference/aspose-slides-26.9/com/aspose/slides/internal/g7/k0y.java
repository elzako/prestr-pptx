package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.NotImplementedException;

public class k0y extends c4i implements c6, d3, l1, o3 {
   private c4i n5;
   private n0 l6;
   private f1 k5;
   private Object u3 = new Object();
   private boolean a6;

   public k0y(c4i var1) {
      super(var1.x8());
      this.n5(var1);
      this.l6 = new n0();
      this.l6.n5.n5(this);
      this.l6.l6.n5(this);
      this.l6.k5.n5(this);
      this.k5 = new f1();
      this.k5.k5();
   }

   @Override
   public String u9() {
      return this.n5.u9();
   }

   @Override
   public v7 s7() {
      return this.n5.s7();
   }

   @Override
   public final n0 y4() {
      return this.l6;
   }

   public final f1 k5() {
      return this.k5;
   }

   @Override
   public i2 e2() {
      return this.u3();
   }

   @Override
   public k6 n5(r9 var1) {
      return this.y4().l6(var1) ? super.n5(var1) : null;
   }

   private i2 u3() {
      if (!this.a6) {
         synchronized (this.u3) {
            if (!this.a6) {
               throw new NotImplementedException();
            }
         }
      }

      return this.n5;
   }

   public final void n5(c4i var1) {
      this.n5 = var1;
      this.a6 = true;
   }

   @Override
   public final void n5(Object var1) {
      try {
         this.k5.l6();
         this.k5.n5();
      } finally {
         this.k5.k5();
      }
   }

   @Override
   public final void n5(Object var1, c7 var2) {
      try {
         this.k5.l6();
         this.k5.n5(this.l6(var2.n5));
      } finally {
         this.k5.k5();
      }
   }

   public final String l6(r9 var1) {
      k2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, k2.class);
      if (var2 != null) {
         k3 var4 = com.aspose.slides.internal.v6g.k5.n5(this.s7().l6((char)var2.n5()), k3.class);
         return var4 != null ? var4.n5() : null;
      } else {
         k3 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, k3.class);
         return var3 != null ? var3.n5() : k3.n5.n5();
      }
   }
}
