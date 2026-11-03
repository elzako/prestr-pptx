package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.q1;

public class v4 extends a5 implements com.aspose.slides.internal.f2.u3 {
   private final Object n5;

   private v4(double var1) {
      if (var1 == q1.k5(var1)) {
         if (var1 < 2.147483647E9) {
            this.n5 = com.aspose.slides.internal.v6g.k5.u3(var1, 14);
         } else {
            this.n5 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
         }
      } else {
         this.n5 = var1;
      }
   }

   private v4(int var1) {
      this.n5 = var1;
   }

   public static v4 n5(double var0) {
      return new v4(var0);
   }

   public static v4 l6(int var0) {
      return new v4(var0);
   }

   @Override
   public final int l6() {
      return 0;
   }

   @Override
   public final double n5() {
      return com.aspose.slides.ms.System.z3.n3(this.n5);
   }

   @Override
   public final double n5(com.aspose.slides.internal.f2.u9 var1) {
      return this.n5();
   }

   @Override
   public final int u3() {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5, int.class);
   }

   @Override
   public final int l6(com.aspose.slides.internal.f2.u9 var1) {
      return this.u3();
   }

   @Override
   public final boolean k5() {
      return true;
   }

   @Override
   public Object h0() {
      return this.n5;
   }

   @Override
   public Object g_() {
      return this.n5;
   }

   @Override
   public com.aspose.slides.internal.f2.u3 u9() {
      return this;
   }

   @Override
   public com.aspose.slides.internal.f2.k5 c8() {
      return j5.n5(this.n5(), "px");
   }

   @Override
   public com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.y1.u3 var1) {
      return com.aspose.slides.internal.o9b.c8.m3();
   }

   @Override
   public final void n5(int var1) {
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      v4 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, v4.class);
      return var2 == null ? false : com.aspose.slides.internal.v3.u3.n5(this.n5, var2.n5);
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }
}
