package com.aspose.slides.internal.g8v;

class f5$n5 implements z7 {
   private v8 n5;
   private f5 l6;
   private boolean k5;
   private com.aspose.slides.ms.System.j5 u3 = new com.aspose.slides.ms.System.j5();

   public v8 u3() {
      return this.n5;
   }

   private void n5(v8 var1) {
      this.n5 = var1;
   }

   @Override
   public f5 n5() {
      return this.l6;
   }

   private void n5(f5 var1) {
      this.l6 = var1;
   }

   public f0 a6() {
      return f5.n5(this.n5());
   }

   public boolean u9() {
      return this.k5;
   }

   public com.aspose.slides.ms.System.j5 h0() {
      return this.u3;
   }

   @Override
   public boolean l6() {
      synchronized (this.a6()) {
         if (this.k5) {
            return false;
         }

         this.k5 = true;
         com.aspose.slides.ms.System.j5.n5(
               com.aspose.slides.ms.System.j5.t2(), com.aspose.slides.ms.System.s4.n5(com.aspose.slides.internal.v6g.k5.t2(3650, 9))
            )
            .u3(this.u3);
         return true;
      }
   }

   @Override
   public void k5() {
      synchronized (this.a6()) {
         this.k5 = false;
         com.aspose.slides.ms.System.j5.t2().u3(this.u3);
      }
   }

   public f5$n5(f5 var1) {
      this.n5(var1);
      com.aspose.slides.ms.System.j5.t2().u3(this.u3);
      this.n5(new v8(this, f5.n5(var1)));
   }
}
