package com.aspose.slides.internal.v4;

import com.aspose.slides.internal.h2.b3;
import com.aspose.slides.internal.h2.f0;
import com.aspose.slides.ms.System.d1;

public class z1 extends com.aspose.slides.internal.e5.t9 {
   private com.aspose.slides.internal.f2.k5 u9;
   private int h0;
   private com.aspose.slides.internal.f2.k5 c8;
   private b3 t2;
   private com.aspose.slides.internal.h2.t2 s7;
   private com.aspose.slides.internal.h2.y4 x8;
   private int n3;
   private int y4;
   private int e2;
   private b3 t9;
   private com.aspose.slides.internal.h2.f2 z1;
   private f0 t4;
   private int q0;
   private com.aspose.slides.internal.f2.u3 z3;
   private com.aspose.slides.internal.v8.y4 m1;
   private boolean k7 = false;

   public z1(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = var1.a6(3).c8();
      this.h0 = var1.a6(4).a6();
      this.c8 = var1.a6(15).c8();
      this.t2 = var1.a6(17).k_();
      this.s7 = var1.u3();
      this.x8 = var1.c8();
      this.n3 = var1.a6(71).a6();
      this.y4 = var1.a6(87).a6();
      this.e2 = var1.a6(88).a6();
      this.t9 = var1.a6(127).k_();
      this.z1 = var1.a6(131).y4();
      this.t4 = var1.a6(144).z1();
      this.q0 = var1.a6(169).a6();
      this.z3 = var1.a6(197).u9();
      this.m1 = new com.aspose.slides.internal.v8.y4(com.aspose.slides.internal.v8.n3.n5(var1.a6(267).a6()));
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.k7) {
               this.l6(var1, "fo:marker", "(%block;)");
            }
         } else if (!this.l6(var2, var3)) {
            this.k5(var1, var2, var3);
         } else {
            this.k7 = true;
         }
      }
   }

   @Override
   public void c8() {
      if (!this.k7) {
         this.l6("marker* (%block;)+");
      }
   }

   public final com.aspose.slides.internal.f2.k5 i1() {
      return this.u9;
   }

   public final int e5() {
      return this.h0;
   }

   public final com.aspose.slides.internal.f2.k5 b3() {
      return this.c8;
   }

   public final b3 o0() {
      return this.t2;
   }

   public final com.aspose.slides.internal.h2.t2 z7() {
      return this.s7;
   }

   public final com.aspose.slides.internal.h2.y4 v4() {
      return this.x8;
   }

   public final int u6() {
      return this.y4;
   }

   public final int t1() {
      return this.e2;
   }

   public final b3 a5() {
      return this.t9;
   }

   public final int h2() {
      return this.q0;
   }

   public final int v0() {
      return this.z3.u3();
   }

   public final com.aspose.slides.internal.v8.n3 f0() {
      return this.m1.n5();
   }

   @Override
   public String z1() {
      return "inline-container";
   }

   @Override
   public int z3() {
      return 36;
   }

   @Override
   public boolean n5(int var1) {
      return false;
   }
}
