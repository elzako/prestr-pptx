package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentNullException;

public abstract class e2 extends q0 {
   protected int n5 = 5000;
   long l6;
   private v3 n3;
   private boolean y4 = false;
   static Object k5 = new Object();
   final com.aspose.slides.internal.r5t.k5 u3 = new com.aspose.slides.internal.r5t.k5(true);
   final com.aspose.slides.internal.r5t.k5 a6 = new com.aspose.slides.internal.r5t.k5(true);
   boolean u9 = false;
   int h0 = 0;
   Object c8 = new Object();
   protected Object t2 = new Object();
   boolean s7 = false;
   private static e2$n5 e2;
   static final com.aspose.slides.internal.v6g.n5<e2$n5> x8 = new t9();

   protected e2() {
   }

   public final v3 n5() {
      return this.n3;
   }

   public final void n5(v3 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      try {
         this.l6(var1);
         i9 var2 = (i9)i9.n5();
         var2.n5(this.n3);
      } finally {
         this.n3 = var1;
      }
   }

   public abstract boolean l6();

   final boolean k5() {
      return this.y4;
   }

   public abstract void u3();

   public final void n5(com.aspose.slides.internal.z0k.t4 var1) {
      this.s7();
      j4 var2 = null;

      try {
         j4[] var3 = new j4[]{var2};
         boolean var4 = j4.n5((Object)(var1), var3);
         var2 = var3[0];
         if (var4) {
            var2.a6();
         } else {
            var2 = i9.n5().n5(var1);
         }

         synchronized (var2.n5()) {
            if (this.n3 != null && var2 == this.n3.k5() && !this.l6()) {
               long var6 = var2.getPosition();
               this.u3();
               var2.setPosition(var6);
            }

            this.l6(var2);
            this.k5(var2);
         }
      } finally {
         i9.n5().n5(var2);
      }
   }

   protected abstract void l6(com.aspose.slides.internal.z0k.t4 var1);

   protected void k5(com.aspose.slides.internal.z0k.t4 var1) {
      if (!this.k5() && e2 != null) {
         long[] var2 = new long[]{this.l6};
         e2.n5(var2, var1);
         this.l6 = var2[0];
      }
   }

   @Override
   protected void a6() {
      i9 var1 = (i9)i9.n5();
      var1.n5(this.n3);
      super.a6();
   }

   protected void l6(v3 var1) {
   }

   public final void u9() {
      this.n5(false);
   }

   protected final void h0() {
      this.l6(false);
   }

   final void n5(boolean var1) {
      if (!this.s7 && !this.a6.n5(this.n5, false)) {
         com.aspose.slides.ms.System.t4.l6("Timeout is reached for NonMutuallyExclusiveOperationIsNotRunningEvent");
      }

      if (!this.u9) {
         this.u9 = true;
         this.u3.n5();
      } else {
         if (!this.s7 && !this.u3.n5(this.n5, false)) {
            com.aspose.slides.ms.System.t4.l6("Timeout is reached for MutuallyExclusiveOperationIsNotRunningEvent");
         }

         this.u9 = true;
      }

      if (var1 && !this.s7) {
         this.s7 = true;
      }
   }

   final void l6(boolean var1) {
      if (var1) {
         this.s7 = false;
      }

      this.u9 = false;
      this.u3.l6();
   }

   // $VF: synthetic method
   static e2$n5 n5(e2$n5 var0) {
      e2 = var0;
      return var0;
   }
}
