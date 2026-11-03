package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.Generic.List;

public abstract class w5 extends k8 {
   protected List<com.aspose.slides.internal.x6s.a6> a6;

   public w5(j9 var1, String var2, String var3, int var4) {
      super(var1, var2, var3, var4);
      this.a6 = new List<>();
      this.k5 = 0;
   }

   protected w5(w5 var1) {
      super(var1);
      this.a6 = new List<>(var1.a6);
      this.k5 = var1.k5;
   }

   @Override
   public void t2() {
      this.k5 = 0;
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      super.n5(var1);
      this.a6.clear();
      return this;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 h0() {
      return this.k5 < this.a6.size() ? this.a6.get_Item(this.k5++) : null;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      return this.k5 == 0 ? null : this.a6.get_Item(this.k5 - 1);
   }

   @Override
   public int u3() {
      return this.k5;
   }

   @Override
   public int a6() {
      return this.a6.size();
   }

   @Override
   public int c8() {
      return 23;
   }
}
