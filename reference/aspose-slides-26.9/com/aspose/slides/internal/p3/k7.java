package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class k7 {
   private y2 n5;
   private List<com.aspose.slides.internal.x9.t9> l6 = null;
   private com.aspose.slides.internal.y0.k5 k5 = null;
   private com.aspose.slides.internal.j9.c8 u3 = null;
   private z8 a6 = null;
   private z3 u9;
   private boolean h0 = false;
   private int c8 = 0;

   public final y2 n5() {
      return this.n5;
   }

   public final List<com.aspose.slides.internal.x9.t9> l6() {
      return this.l6;
   }

   public final void n5(List<com.aspose.slides.internal.x9.t9> var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.y0.k5 k5() {
      return this.k5;
   }

   public final com.aspose.slides.internal.j9.c8 u3() {
      return this.u3;
   }

   public final z8 a6() {
      return this.a6;
   }

   public final boolean u9() {
      return this.h0;
   }

   public k7(y2 var1) {
      this.n5 = var1;
      this.u3 = this.l6(this.n5);
      this.k5 = n5(this.n5);
      this.a6 = this.k5(this.n5);
      this.u9 = this.a6(this.n5);
      this.h0 = this.u3(this.n5) != null;
   }

   public final int h0() {
      return this.n5.z8().w1().x8().k7();
   }

   private com.aspose.slides.internal.j9.c8 l6(y2 var1) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.j9.c8 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.j9.c8.class);
      return var2 != null ? var2 : this.l6(var1.h0());
   }

   public static com.aspose.slides.internal.y0.k5 n5(y2 var0) {
      if (var0 == null) {
         return null;
      }

      com.aspose.slides.internal.y0.k5 var1 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.y0.k5.class);
      return var1 != null ? var1 : n5(var0.h0());
   }

   private z8 k5(y2 var1) {
      y2 var2 = var1.h0();
      if (var2 == null || com.aspose.slides.internal.v6g.k5.l6(var2, z3.class)) {
         return null;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var2, z8.class) ? com.aspose.slides.internal.v6g.k5.n5(var2, z8.class) : this.k5(var2);
      }
   }

   private com.aspose.slides.internal.x9.m1 u3(y2 var1) {
      y2 var2 = var1.h0();
      if (var2 == null) {
         return null;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.x9.m1.class)
            ? com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.x9.m1.class)
            : this.u3(var2);
      }
   }

   public final List<com.aspose.slides.internal.x9.t9> c8() {
      return this.a6 == null ? null : this.a6.y1();
   }

   public final List<com.aspose.slides.internal.x9.t9> t2() {
      return this.n5(false);
   }

   private z3 a6(y2 var1) {
      y2 var2 = var1.h0();
      if (var2 == null) {
         return null;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var2, z3.class) ? com.aspose.slides.internal.v6g.k5.n5(var2, z3.class) : this.a6(var2);
      }
   }

   public final List<com.aspose.slides.internal.x9.t9> n5(boolean var1) {
      if (this.u9 != null) {
         return !var1 && this.u9.y1() ? null : this.u9.a0();
      } else {
         return null;
      }
   }

   public final List<com.aspose.slides.internal.x9.t9> s7() {
      List var1 = null;
      this.c8 = 0;
      if (this.l6 != null) {
         this.c8 = 1;
         return this.l6;
      }

      if (this.u3 != null && !com.aspose.slides.internal.x9.z1.l6().k5()) {
         var1 = com.aspose.slides.internal.x9.z1.l6().n5(this.u3);
         if (var1 != null) {
            this.c8 = 3;
            return var1;
         }
      }

      var1 = this.c8();
      if (var1 != null) {
         this.c8 = 4;
         return var1;
      }

      var1 = this.t2();
      if (var1 != null) {
         this.c8 = 2;
      }

      return var1;
   }
}
