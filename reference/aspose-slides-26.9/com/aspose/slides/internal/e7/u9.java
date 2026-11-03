package com.aspose.slides.internal.e7;

import com.aspose.slides.internal.v2.e2;

public class u9 implements e2 {
   private final com.aspose.slides.internal.v2.k5 n5;
   private t2 l6;
   private c8 k5;
   private h0 u3;

   public final h0 n5() {
      if (this.u3 == null) {
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5
            .n5(com.aspose.slides.internal.v2.c8.i0e, com.aspose.slides.internal.v2.c8.f6);
         if (var1 != null) {
            this.u3 = new h0(var1);
         }
      }

      return this.u3;
   }

   public final c8 l6() {
      if (this.k5 == null) {
         com.aspose.slides.internal.v2.n5 var1 = (com.aspose.slides.internal.v2.n5)this.n5.u9(com.aspose.slides.internal.v2.c8.g9);
         if (var1 != null) {
            this.k5 = new c8(var1);
         } else if (this.n5() != null) {
            var1 = (com.aspose.slides.internal.v2.n5)this.n5().k5().u9(com.aspose.slides.internal.v2.c8.g9);
            if (var1 != null) {
               this.k5 = new c8(var1);
            }
         }
      }

      return this.k5;
   }

   public final t2 k5() {
      if (this.l6 == null) {
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.u9(com.aspose.slides.internal.v2.c8.o8m);
         if (var1 != null) {
            this.l6 = new t2(var1);
         }

         if (this.l6 == null && this.n5() != null) {
            this.l6 = this.n5().l6();
         }
      }

      return this.l6;
   }

   public final s7 u3() {
      com.aspose.slides.internal.v2.s7 var1 = this.n5.u9(com.aspose.slides.internal.v2.c8.p6);
      return s7.n5(var1);
   }

   public final float a6() {
      return this.n5.n5(com.aspose.slides.internal.v2.c8.w1n, 0.0F);
   }

   public u9() {
      this(c8.n5());
   }

   public u9(c8 var1) {
      this.n5 = new com.aspose.slides.internal.v2.k5();
      this.n5.l6(com.aspose.slides.internal.v2.c8.g2x, com.aspose.slides.internal.v2.c8.f1s);
      this.n5.n5(com.aspose.slides.internal.v2.c8.g9, var1);
   }

   public u9(com.aspose.slides.internal.v2.k5 var1) {
      this.n5 = var1;
   }

   @Override
   public final com.aspose.slides.internal.v2.s7 t2() {
      return this.n5;
   }
}
