package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;

public class f2 extends a5 implements com.aspose.slides.internal.f2.l6 {
   private boolean n5 = false;
   private a5 l6;
   private a5 k5;
   private a5 u3;

   @Override
   public final void n5(int var1, a5 var2, boolean var3) {
      if (!this.n5) {
         if (var1 == 5120) {
            this.n5(var2, var3);
         } else if (var1 == 4608) {
            this.n5(var2);
         } else if (var1 == 5632) {
            this.l6(var2, var3);
         }
      }
   }

   @Override
   public final a5 n5(int var1) {
      if (var1 == 5120) {
         return this.t2();
      } else if (var1 == 4608) {
         return this.s7();
      } else {
         return var1 == 5632 ? this.n3() : null;
      }
   }

   public final void n5(a5 var1, boolean var2) {
      this.l6 = var1;
   }

   protected final void n5(a5 var1) {
      this.k5 = var1;
   }

   public final void l6(a5 var1, boolean var2) {
      this.u3 = var1;
   }

   public final a5 t2() {
      return this.l6;
   }

   public final a5 s7() {
      return this.k5;
   }

   public final a5 n3() {
      return this.u3;
   }

   @Override
   public String toString() {
      return d1.n5(new Object[]{"Keep[", "withinLine:", this.t2().g_(), ", withinColumn:", this.s7().g_(), ", withinPage:", this.n3().g_(), "]"});
   }

   @Override
   public f2 y4() {
      f2 var1 = this;
      var1.n5 = true;
      return var1;
   }

   @Override
   public Object g_() {
      return this;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }

      f2 var2 = com.aspose.slides.internal.v6g.k5.n5(o, f2.class);
      return var2 == null ? false : var2.k5 == this.k5 && var2.l6 == this.l6 && var2.u3 == this.u3;
   }

   @Override
   public int hashCode() {
      int var1 = 17;
      var1 = 37 * var1 + (this.k5 == null ? 0 : this.k5.hashCode());
      var1 = 37 * var1 + (this.l6 == null ? 0 : this.l6.hashCode());
      return 37 * var1 + (this.u3 == null ? 0 : this.u3.hashCode());
   }
}
