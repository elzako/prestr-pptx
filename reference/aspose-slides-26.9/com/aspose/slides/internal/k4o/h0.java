package com.aspose.slides.internal.k4o;

import java.util.List;

public class h0 extends a6 {
   private com.aspose.slides.internal.n1g.a6 l6 = null;
   private com.aspose.slides.internal.n1g.u9 k5 = null;
   private com.aspose.slides.internal.n1g.k5 u3 = null;
   private com.aspose.slides.internal.m5l.n5 a6;

   public h0(com.aspose.slides.internal.n1g.a6 var1, com.aspose.slides.internal.n1g.u9 var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public void n5() {
      List var1 = com.aspose.slides.internal.z1n.n5.n5(this.a6());
      if (!var1.isEmpty()) {
         this.a6 = (com.aspose.slides.internal.m5l.n5)var1.get(0);
      }
   }

   public com.aspose.slides.internal.n1g.a6 l6() {
      return this.l6;
   }

   public com.aspose.slides.internal.n1g.u9 k5() {
      return this.k5;
   }

   public com.aspose.slides.internal.n1g.k5 u3() {
      return this.u3;
   }

   public com.aspose.slides.internal.m5l.n5 u9() {
      return this.a6;
   }

   public void l6(com.aspose.slides.internal.m5l.l6 var1) {
      this.n5.add(this.n5.size() - 1, var1);
   }

   public u9 h0() {
      return new c8(this);
   }
}
