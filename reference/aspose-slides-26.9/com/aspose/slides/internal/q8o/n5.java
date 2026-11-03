package com.aspose.slides.internal.q8o;

import com.aspose.slides.internal.y4g.h2;
import com.aspose.slides.internal.y4g.v8;
import com.aspose.slides.internal.y4g.z6;
import com.aspose.slides.ms.System.d1;

public class n5 extends com.aspose.slides.internal.n4m.n5 {
   private boolean n5;
   private com.aspose.slides.internal.f3c.u9 l6;

   public n5(v8 var1) {
      super(var1, (byte)11);
   }

   public com.aspose.slides.internal.f3c.u9 h0() {
      if (!this.n5) {
         this.z1();
         this.n5 = true;
      }

      return this.l6;
   }

   @Override
   public void c8() {
      super.c8();
      this.a6();
   }

   private void z1() {
      z6 var1 = (z6)this.x8();
      if (var1.n3().l6() != null && var1.n3().l6().size() > 0) {
         this.l6 = var1.n5().l6(this.x8().n3().l6(), new com.aspose.slides.internal.f3c.u9(this.x8().x8().l6().n5(0).t2()), this.x8().n3().n5(), null);
      }

      var1.n3().n5(this.l6);
   }

   private void t4() {
      h2 var1 = new h2();

      for (com.aspose.slides.internal.f3c.u9 var2 = this.h0(); var2 != null; var2 = this.n5(var2)) {
         byte[] var3 = var2.x8();
         var1.l6(var3.length);
         var1.n5(var3);
      }

      this.l6(com.aspose.slides.internal.v6g.k5.u3(var1.getLength(), 11));
      this.n5(var1.u9());
   }

   @Override
   protected void t2() {
      if (this.h0() != null) {
         this.t4();
      }
   }

   @Override
   protected void s7() {
      if (this.h0() != null) {
         this.t4();
      } else {
         this.l6(0);
      }
   }

   private com.aspose.slides.internal.f3c.u9 n5(com.aspose.slides.internal.f3c.u9 var1) {
      if (d1.a6(var1.t2(), var1.c8())) {
         return null;
      }

      for (Object recoveredElement$var3$1711 : this.x8().n3().l6()) {
         com.aspose.slides.internal.f3c.u9 var3 = (com.aspose.slides.internal.f3c.u9)recoveredElement$var3$1711;
         if (d1.a6(var1.t2(), var1.c8())) {
            return var3;
         }
      }

      return null;
   }
}
