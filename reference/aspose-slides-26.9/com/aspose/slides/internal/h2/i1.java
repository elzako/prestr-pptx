package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;

public class i1 extends a5 implements com.aspose.slides.internal.f2.l6 {
   private a5 n5;
   private a5 l6;

   public i1() {
   }

   public i1(a5 var1, a5 var2) {
      this();
      this.n5 = var1;
      this.l6 = var2;
   }

   public i1(a5 var1) {
      this(var1, var1);
   }

   @Override
   public final void n5(int var1, a5 var2, boolean var3) {
      if (var1 == 512) {
         this.l6 = var2;
      } else if (var1 == 1536) {
         this.n5 = var2;
      }
   }

   @Override
   public final a5 n5(int var1) {
      if (var1 == 512) {
         return this.s7();
      } else {
         return var1 == 1536 ? this.t2() : null;
      }
   }

   public final a5 t2() {
      return this.n5;
   }

   public final a5 s7() {
      return this.l6;
   }

   @Override
   public String toString() {
      return d1.n5(new Object[]{"LengthPair[", "ipd:", this.t2().g_(), ", bpd:", this.s7().g_(), "]"});
   }

   @Override
   public i1 u_() {
      return this;
   }

   @Override
   public Object g_() {
      return this;
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.l6);
      return var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      i1 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, i1.class);
      return var2 == null ? false : com.aspose.slides.internal.v3.u3.n5(this.l6, var2.l6) && com.aspose.slides.internal.v3.u3.n5(this.n5, var2.n5);
   }
}
