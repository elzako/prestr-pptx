package com.aspose.slides.internal.l5;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.ms.System.j8;

public final class x8 extends l6 {
   private m3 u3;
   private com.aspose.slides.internal.x4g.s7 a6;
   public boolean n5 = false;
   public boolean l6 = false;
   public boolean k5 = false;

   public x8(com.aspose.slides.internal.x4g.s7 var1) {
      this.u3 = new m3(var1);
      this.a6 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();
   }

   private x8() {
   }

   public final com.aspose.slides.internal.x4g.s7 l6() {
      return this.a6;
   }

   public final com.aspose.slides.internal.x4g.u3 k5() {
      return this.u3.c8();
   }

   public final com.aspose.slides.internal.o9b.c8 u3() {
      return this.u3.t2();
   }

   public final w1 a6() {
      return this.u3.s7();
   }

   public final void n5(w1 var1) {
      this.u3.n5(var1.u3());
   }

   public final w1 u9() {
      return this.u3.x8();
   }

   public final com.aspose.slides.internal.x4g.a6 h0() {
      return this.u3.n3();
   }

   public final void n5(com.aspose.slides.internal.x4g.a6 var1) {
      this.u3.n5(var1);
      this.n5 = true;
   }

   public final com.aspose.slides.internal.o9b.c8[] c8() {
      return this.u3.y4();
   }

   public final m1 t2() {
      return this.u3.e2();
   }

   public final int s7() {
      return this.u3.t9();
   }

   @Override
   public com.aspose.slides.internal.o9b.u3 n5() {
      return this.u3;
   }

   @Override
   public Object deepClone() {
      x8 var1 = new x8();
      var1.u3 = (m3)this.u3.deepClone();
      var1.a6 = (com.aspose.slides.internal.x4g.s7)this.a6.deepClone();
      return var1;
   }

   @Override
   public void dispose() {
      this.u3.dispose();
      this.a6.dispose();
   }

   private boolean n5(x8 var1) {
      return j8.n5(this.u3, var1.u3)
         && j8.n5(this.a6, var1.a6)
         && com.aspose.slides.ms.System.n3.l6(this.n5, var1.n5)
         && com.aspose.slides.ms.System.n3.l6(this.l6, var1.l6)
         && com.aspose.slides.ms.System.n3.l6(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else {
         return j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, x8.class) && this.n5((x8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.u3 != null ? this.u3.hashCode() : 0;
      var1 = var1 * 397 ^ (this.a6 != null ? this.a6.hashCode() : 0);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n3.n5(this.n5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n3.n5(this.l6);
      return var1 * 397 ^ com.aspose.slides.ms.System.n3.n5(this.k5);
   }
}
