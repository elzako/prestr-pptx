package com.aspose.slides.internal.e1;

import com.aspose.slides.ms.System.d1;

public abstract class t9 extends m3 {
   private String n5;
   private com.aspose.slides.internal.o9b.w1 l6 = com.aspose.slides.internal.o9b.w1.n5.u3();
   private boolean k5 = true;
   private String u3;
   private t2 a6;
   private boolean u9;

   protected t9(com.aspose.slides.internal.o9b.w1 var1, String var2) {
      this.u3 = d1.n5;
      this.a6 = null;
      this.u9 = false;
      var1.n5(this.l6);
      this.n5 = var2;
   }

   protected t9() {
      this.u3 = d1.n5;
      this.a6 = null;
      this.u9 = false;
   }

   public final com.aspose.slides.internal.o9b.w1 u9() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.l6);
   }

   public abstract com.aspose.slides.internal.o9b.y1 u3();

   public final String h0() {
      return this.n5;
   }

   public final boolean c8() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.u3 = var1;
   }

   public final t2 t2() {
      return this.a6;
   }

   public final void n5(t2 var1) {
      this.a6 = var1;
      this.u9 = this.a6 != null;
   }
}
