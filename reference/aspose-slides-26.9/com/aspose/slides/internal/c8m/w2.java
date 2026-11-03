package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.b8c.k0t;

public abstract class w2 extends e2 {
   private a2 n5;

   protected e9 t2() {
      return (e9)super.h0();
   }

   protected o5 c8() {
      return (o5)super.u9();
   }

   protected final j8 t9() {
      return (j8)super.a6();
   }

   protected w2(j8 var1, e9 var2) {
      super(var1, var2);
   }

   protected w2(j8 var1, o5 var2) {
      super(var1, var2);
   }

   @Override
   protected void n5(String... var1) {
      v7 var2 = (v7)this.t9().y4();
      k0t var3 = ((v7)this.t9().y4()).u3();
      SortedList var4 = var2.a6();
      String var5 = var2.n5();
      boolean var6 = var2.u9();
      boolean var7 = "application/vnd.openxmlformats-officedocument.vmlDrawing".equals(this.t9().y4().n5());
      super.n5(var3, var4, var5, var6, var7);
      this.n5 = this.t2().k7();
      this.t2().n5(this.t9().e2());
   }

   @Override
   protected void n3() {
      super.n3();
      this.t2().n5(this.n5);
   }

   @Override
   protected void y4() {
      super.y4();
      this.n5 = this.c8().u6();
      this.c8().n5(this.t9().e2());
   }

   @Override
   protected void e2() {
      super.e2();
      this.c8().n5(this.n5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   protected j8 a6() {
      return this.t9();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   protected o5 u9() {
      return this.c8();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   protected e9 h0() {
      return this.t2();
   }

}
