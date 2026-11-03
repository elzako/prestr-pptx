package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public abstract class k5 extends l6 {
   private u3 a6;
   private com.aspose.slides.internal.v8.u9 u9;
   protected j9 u3;
   private l6$n5 h0;
   private l6$n5 c8;

   public k5(u3 var1, com.aspose.slides.internal.v8.u9 var2) {
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

   @Override
   protected y2 k5() {
      return this.a6;
   }

   @Override
   protected t1 x8() {
      t1 var1 = super.x8();
      var1.l6(this.u9.l6());
      return var1;
   }

   @Override
   protected List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      return null;
   }

   @Override
   protected boolean l6() {
      return !this.a6.m3();
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

   public final void n3() {
      if (!this.t2()) {
         this.u3.z1();
         this.l6(this.u3, this.u3.t9().size(), this.h0, this.c8);
      }
   }

   public int y4() {
      return this.u3.y4;
   }
}
