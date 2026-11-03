package com.aspose.slides.internal.r1x;

import com.aspose.slides.ms.System.IDisposable;

public abstract class v0 extends f0 {
   protected v0() {
   }

   @Override
   public final boolean l6() {
      return com.aspose.slides.internal.v6g.k5.l6(this.p8(), com.aspose.slides.internal.b8u.t4.class);
   }

   @Override
   public final void u3() {
      synchronized (this.t2) {
         try {
            this.n5(true);
            this.e5();
         } finally {
            this.l6(true);
         }
      }
   }

   protected abstract void n5(int var1, int var2);

   protected void k7() {
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, int[] var2) {
      com.aspose.slides.internal.b8u.q0 var3 = this.p8();
      if (!com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.b8u.t4.class)) {
         if (com.aspose.slides.internal.o9b.y2.k5(var1, this.x8()) && this.m1()) {
            byte var4 = 8;
            this.n5(com.aspose.slides.internal.w3u.n5.n5(var2, var1.n3(), 8));
         }

         this.k5(var1.n3(), var2);
      } else if (var2 != null) {
         ((com.aspose.slides.internal.b8u.t4)this.p8()).l6(var1.n3(), var2);
      }
   }

   private void k5(com.aspose.slides.internal.o9b.y2 var1, int[] var2) {
      com.aspose.slides.internal.b8u.u9 var3 = null;

      try {
         var3 = new com.aspose.slides.internal.t7q.n5(this.e2());
         var3 = ((com.aspose.slides.internal.t7q.n5)var3).n5(this);
         if (com.aspose.slides.internal.o9b.y2.k5(var1, this.x8())) {
            var3.l6(var1.n3(), var2);
         } else {
            this.n5(var3, var1.n3(), var2);
         }

         this.n5(var3, this.z1(), this.y4());
      } catch (RuntimeException var5) {
         if (com.aspose.slides.internal.v6g.k5.l6(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }

         throw var5;
      }
   }

   private void n5(com.aspose.slides.internal.b8u.t4 var1, com.aspose.slides.internal.o9b.y2 var2, int[] var3) {
      var1.l6(var2.n3(), var3);
   }

   @Override
   protected void n5(com.aspose.slides.internal.b8u.a6 var1, com.aspose.slides.internal.b8u.a6 var2) {
      com.aspose.slides.internal.b8u.s7 var3 = com.aspose.slides.internal.v6g.k5.n5(this.p8(), com.aspose.slides.internal.b8u.s7.class);
      if (var3 != null) {
         var3.n5(var2);
      }

      super.n5(var1, var2);
   }

   private void e5() {
   }

   private void n5(com.aspose.slides.internal.b8u.q0 var1, int var2, int var3) {
      try {
         this.l6(var1);
         if (var1 != null) {
            this.n5(var2, var3);
         }

         this.k7();
      } finally {
         this.k5(true);
      }
   }
}
