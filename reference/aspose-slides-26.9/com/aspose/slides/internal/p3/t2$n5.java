package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.q1;

class t2$n5 extends l6 {
   private t2 a6;
   private com.aspose.slides.internal.v8.u9 u9;
   public j9 u3;
   private l6$n5 h0;
   private l6$n5 c8;

   public t2$n5(t2 var1, com.aspose.slides.internal.v8.u9 var2) {
      this.a6 = var1;
      this.u9 = var2;
   }

   @Override
   protected boolean a6() {
      return false;
   }

   @Override
   protected boolean u9() {
      return true;
   }

   public final boolean n3() {
      return !this.t2() && (this.u3.t9().size() > 1 || this.u3.y4 - this.u3.t9 > this.u3.x8());
   }

   public final int y4() {
      return this.u3.y4 - this.u3.t9 - this.u3.x8();
   }

   @Override
   protected y2 k5() {
      return this.a6;
   }

   @Override
   protected t1 x8() {
      t1 var1 = super.x8();
      var1.l6(this.u9.l6());
      var1.n5(this.a6.i1().o5());
      return var1;
   }

   @Override
   protected List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      List var3 = new List();

      y2 var4;
      while ((var4 = this.a6.q0()) != null) {
         t1 var5 = this.a6.n5(var1);
         List var6 = null;
         if (!var4.m3()) {
            var6 = var4.n5(var5, var2);
            com.aspose.slides.internal.v8.u9 var7 = var5.f2().l6(this.a6.p3());
            t2.n5(this.a6, q1.n5(var7.l6(), t2.n5(this.a6)));
         }

         if (var6 != null) {
            this.a6.n5(var6, var3);
         }
      }

      j4.n5(var3);
      this.a6.k5(true);
      return var3;
   }

   @Override
   protected int n5() {
      return this.a6.i1().v4();
   }

   @Override
   protected boolean l6() {
      return !this.a6.m3();
   }

   @Override
   protected void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      com.aspose.slides.internal.p3.h0.n5(this.a6, var1, var2);
   }

   @Override
   protected void n5(j9 var1, int var2, l6$n5 var3, l6$n5 var4) {
      this.u3 = var1;
      this.h0 = var3;
      this.c8 = var4;
   }

   @Override
   protected void n5(j9 var1, l6$l6 var2) {
   }

   @Override
   protected y2 u3() {
      return this.a6.h0;
   }

   public final void e2() {
      if (!this.t2()) {
         this.u3.z1();
         this.l6(this.u3, this.u3.t9().size(), this.h0, this.c8);
      }
   }
}
