package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class x9 extends com.aspose.slides.internal.w5.k5 implements com.aspose.slides.internal.k5.w1 {
   private boolean k5 = false;
   private com.aspose.slides.internal.k5.j5 u3;

   public x9(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final boolean j9() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final String z6() {
      return this.t2("media", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("media", var1);
   }

   public final String e9() {
      return this.t2("type", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("type", var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
   }

   @Override
   public final com.aspose.slides.internal.k5.j5 n5() {
      if (this.u3 == null) {
         this.o5();
      }

      return this.u3;
   }

   private void o5() {
      String var1 = this.e5();
      if (!d1.n5(var1) && (d1.n5(this.z6()) || d1.u3(this.z6(), "all", (short)5) || d1.u3(this.z6(), "screen", (short)5))) {
         this.u3 = ((com.aspose.slides.internal.k5.m1)this.y4()).n5().n5((com.aspose.slides.internal.j3.z8)(this));
      }
   }
}
