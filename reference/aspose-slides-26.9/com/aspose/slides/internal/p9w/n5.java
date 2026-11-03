package com.aspose.slides.internal.p9w;

import com.aspose.slides.internal.o6x.u3;

public abstract class n5 implements com.aspose.slides.internal.o6x.l6 {
   protected final u3 n5;

   protected n5(u3 var1) {
      this.n5 = var1;
   }

   @Override
   public float a6() {
      return this.n5.t2();
   }

   @Override
   public float u9() {
      return this.n5.s7();
   }

   public float t2() {
      return this.n5.x8();
   }

   public float s7() {
      return this.n5.n3();
   }

   protected float x8() {
      return this.n5.n5(this.k5());
   }

   protected float n3() {
      return this.n5.l6(this.k5());
   }

   protected float y4() {
      return this.n5.k5().q0() ? 0.0F : this.n5.a6(this.s7()) - this.s7();
   }
}
