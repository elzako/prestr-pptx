package com.aspose.slides.internal.l7;

public abstract class l6$n5 {
   private com.aspose.slides.internal.m9.c8 n5;
   private com.aspose.slides.internal.m9.h0 l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;

   protected l6$n5(com.aspose.slides.internal.m9.c8 var1) {
      this.n5 = var1;
   }

   private void n5(com.aspose.slides.internal.m9.c8 var1, boolean var2) {
      this.n5 = var1;
      this.l6 = null;
      if (var2) {
         this.a6 = true;
         this.n3();
      }
   }

   public l6 n5() {
      l6 var1 = null;
      com.aspose.slides.internal.m9.h0 var2 = this.k5();
      if (this.k5) {
         if (!this.s7()) {
            return null;
         }

         int var3 = this.x8();
         com.aspose.slides.internal.m9.c8 var4 = com.aspose.slides.internal.m9.c8.n3(var3);
         this.n5(var4);
         var2 = var4;
      }

      if (var2 != null) {
         var1 = this.n5(var2);
         this.n5(var1);
      }

      this.l6 = null;
      this.n5 = null;
      return var1;
   }

   public final boolean l6() {
      return true;
   }

   protected final com.aspose.slides.internal.m9.h0 k5() {
      return this.l6 != null ? this.l6 : this.n5;
   }

   protected final com.aspose.slides.internal.m9.c8 u3() {
      if (this.n5 == null) {
         com.aspose.slides.internal.m9.c8 var1 = com.aspose.slides.internal.m9.c8.n3(this.l6 == null ? 0 : this.l6.n5());
         if (this.l6 != null) {
            this.l6.n5(var1);
         }

         this.n5(var1, false);
      }

      return this.n5;
   }

   public final boolean a6() {
      return this.u9() || this.h0();
   }

   protected final boolean u9() {
      return this.a6;
   }

   protected final boolean h0() {
      return this.c8() || this.t2();
   }

   protected final boolean c8() {
      return this.k5;
   }

   protected final boolean t2() {
      return this.u3;
   }

   protected final boolean n5(boolean var1) {
      boolean var2 = this.k5;
      this.k5 = var1;
      return var2;
   }

   protected void n5(l6 var1) {
   }

   public abstract int n5(com.aspose.slides.internal.m9.c8 var1);

   public abstract boolean s7();

   public abstract int x8();

   protected abstract void n3();

   protected abstract l6 n5(com.aspose.slides.internal.m9.h0 var1);
}
