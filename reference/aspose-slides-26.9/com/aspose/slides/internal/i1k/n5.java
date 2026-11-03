package com.aspose.slides.internal.i1k;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b5j.c8;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.t2;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;

public class n5 extends com.aspose.slides.internal.d0e.a6 implements com.aspose.slides.internal.d0e.n5, com.aspose.slides.internal.z9u.n5 {
   public n5() {
      this.u9 = "circle";
   }

   public final com.aspose.slides.internal.b3z.a6 a0() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("cx"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 d2() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("cy"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 d5() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("r"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   @Override
   public final y1 n5(n3 var1, f2 var2) {
      float var3 = var1.n5(this.a0(), "cx", this, var2.a6());
      float var4 = var1.n5(this.d2(), "cy", this, var2.a6());
      float var5 = var1.n5(this.d5(), "xy", this, var2.a6());
      return var5 <= 0.0F ? new y1() : new y1(var3 - var5, var4 - var5, var5 * 2.0F, var5 * 2.0F);
   }

   @Override
   public final List<c8> l6(n3 var1, f2 var2) {
      a5 var3 = new a5();
      var3.n5(com.aspose.slides.internal.x7n.l6.k5(), "M {0} {1} ", this.a0().n5(), this.d2().n5());
      var3.n5(com.aspose.slides.internal.x7n.l6.k5(), "m {0} 0 ", -this.d5().n5());
      var3.n5(com.aspose.slides.internal.x7n.l6.k5(), "a {0} {1} ", this.d5().n5(), this.d5().n5());
      var3.n5(com.aspose.slides.internal.x7n.l6.k5(), "0 1 0 {0} ", 2.0F * this.d5().n5());
      var3.n5(com.aspose.slides.internal.x7n.l6.k5(), " 0 a {0} {1} ", this.d5().n5(), this.d5().n5());
      var3.n5(com.aspose.slides.internal.x7n.l6.k5(), "0 1 0 {0} 0 ", -2.0F * this.d5().n5());
      String var4 = var3.toString();
      return t2.n5(var4, var1);
   }
}
