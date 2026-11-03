package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.Generic.List;

public abstract class u5 extends j9 {
   public j9 n5;
   protected List<com.aspose.slides.internal.x6s.a6> l6;

   public u5(j9 var1) {
      this.n5 = var1;
      this.l6 = new List<>();
      this.k5 = 0;
   }

   protected u5(u5 var1) {
      super(var1);
      this.n5 = n5(var1.n5);
      this.l6 = new List<>(var1.l6);
      this.k5 = var1.k5;
   }

   @Override
   public void t2() {
      this.k5 = 0;
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      this.n5.n5(var1);
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      this.l6.clear();
      this.k5 = 0;
      return this.n5.n5(var1);
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      return this.k5 < this.l6.size() ? this.l6.get_Item(this.k5++) : null;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      return this.k5 == 0 ? null : this.l6.get_Item(this.k5 - 1);
   }

   @Override
   public int u9() {
      return 3;
   }

   @Override
   public int u3() {
      return this.k5;
   }

   @Override
   public int a6() {
      return this.l6.size();
   }

   @Override
   public int c8() {
      return 23;
   }
}
