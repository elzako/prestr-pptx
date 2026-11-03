package com.aspose.slides.internal.t8;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.x4g.m1;

public class u9 implements l6 {
   private Stack<a6> n5 = new Stack<>();
   private a6 l6;
   private a6 k5;

   @Override
   public final a6 n5() {
      return this.l6;
   }

   @Override
   public final void n5(a6 var1) {
      this.l6 = var1;
   }

   @Override
   public final a6 l6() {
      return this.k5;
   }

   @Override
   public final void l6(a6 var1) {
      this.k5 = var1;
   }

   public u9() {
      this.u9();
   }

   @Override
   public final void k5() {
      this.l6(this.n5());
      this.n5.push(this.n5());
      this.n5(this.n5().f2());
   }

   @Override
   public final void u3() {
      if (this.n5.size() > 0) {
         this.l6(this.n5());
         this.n5(this.n5.pop());
      }
   }

   @Override
   public final void a6() {
      this.n5.clear();
      this.u9();
   }

   private void u9() {
      c8 var1 = new c8();
      var1.l6(1.0F);
      this.n5(new a6());
      this.n5().n5(new m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F));
      this.n5().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      this.n5().l6(com.aspose.slides.internal.o9b.c8.m3().o8());
      this.n5().n5(var1);
   }
}
