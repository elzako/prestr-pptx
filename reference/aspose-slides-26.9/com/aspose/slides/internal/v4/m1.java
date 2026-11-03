package com.aspose.slides.internal.v4;

import com.aspose.slides.ms.System.d1;

public class m1 extends com.aspose.slides.internal.e5.t9 implements com.aspose.slides.internal.h2.d2, com.aspose.slides.internal.h2.d5 {
   private com.aspose.slides.internal.h2.c8 u9;
   private com.aspose.slides.internal.h2.t2 h0;
   private com.aspose.slides.internal.h2.n3 c8;
   private int t2;
   private int s7;
   private com.aspose.slides.internal.h2.f2 x8;
   private com.aspose.slides.internal.h2.f2 n3;
   private com.aspose.slides.internal.h2.f2 y4;
   private com.aspose.slides.internal.f2.k5 e2;
   private com.aspose.slides.internal.f2.k5 t9;
   private boolean z1 = false;

   public m1(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
      this.h0 = var1.u3();
      this.c8 = var1.h0();
      this.t2 = var1.a6(58).a6();
      this.s7 = var1.a6(59).a6();
      this.x8 = var1.a6(131).y4();
      this.n3 = var1.a6(132).y4();
      this.y4 = var1.a6(133).y4();
      this.e2 = var1.a6(271).c8();
      this.t9 = var1.a6(272).c8();
   }

   @Override
   public void u9() {
      super.u9();
      this.n_().n5(this);
   }

   @Override
   public void c8() {
      if (!this.z1) {
         this.l6("marker* (list-item)+");
      }

      this.n_().l6(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.z1) {
               this.l6(var1, "fo:marker", "fo:list-item");
            }
         } else if (d1.a6(var3, "list-item")) {
            this.z1 = true;
         } else {
            this.k5(var1, var2, var3);
         }
      }
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.u9;
   }

   public final com.aspose.slides.internal.h2.n3 e5() {
      return this.c8;
   }

   public final com.aspose.slides.internal.h2.t2 b3() {
      return this.h0;
   }

   @Override
   public final int u6() {
      return this.t2;
   }

   @Override
   public final int t1() {
      return this.s7;
   }

   public final com.aspose.slides.internal.h2.f2 o0() {
      return this.n3;
   }

   public final com.aspose.slides.internal.h2.f2 z7() {
      return this.y4;
   }

   public final com.aspose.slides.internal.h2.f2 v4() {
      return this.x8;
   }

   public final com.aspose.slides.internal.f2.k5 a5() {
      return this.e2;
   }

   public final com.aspose.slides.internal.f2.k5 h2() {
      return this.t9;
   }

   @Override
   public String z1() {
      return "list-block";
   }

   @Override
   public int z3() {
      return 40;
   }
}
