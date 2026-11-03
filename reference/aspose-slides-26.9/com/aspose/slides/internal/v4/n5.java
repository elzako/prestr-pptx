package com.aspose.slides.internal.v4;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.h2.b3;
import com.aspose.slides.internal.h2.f0;
import com.aspose.slides.ms.System.d1;

public abstract class n5 extends com.aspose.slides.internal.e5.t9 implements com.aspose.slides.internal.e5.z3, com.aspose.slides.internal.h2.d5 {
   private com.aspose.slides.internal.h2.c8 u9;
   private com.aspose.slides.internal.h2.t2 h0;
   private com.aspose.slides.internal.f2.k5 c8;
   private int t2;
   private com.aspose.slides.internal.f2.k5 s7;
   private b3 x8;
   private com.aspose.slides.internal.f2.k5 n3;
   private com.aspose.slides.internal.f2.k5 y4;
   private int e2;
   private int t9;
   private com.aspose.slides.internal.f2.k5 z1;
   private String t4;
   private b3 q0;
   private com.aspose.slides.internal.h2.f2 z3;
   private com.aspose.slides.internal.h2.f2 m1;
   private f0 k7;
   private int m3;
   private int z8;
   private int j5;
   private com.aspose.slides.internal.f2.k5 w1;
   private String r4;
   private com.aspose.slides.internal.c4.n5 c4;

   public n5(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
      this.h0 = var1.u3();
      this.c8 = var1.u3(3).c8();
      this.t2 = var1.u3(4).a6();
      this.s7 = var1.u3(15).c8();
      this.x8 = var1.u3(17).k_();
      this.n3 = var1.u3(78).c8();
      this.y4 = var1.u3(80).c8();
      this.e2 = var1.u3(87).a6();
      this.t9 = var1.u3(88).a6();
      this.z1 = var1.u3(115).c8();
      this.t4 = var1.u3(122).j_();
      this.q0 = var1.u3(127).k_();
      this.z3 = var1.u3(132).y4();
      this.m1 = var1.u3(133).y4();
      this.k7 = var1.u3(144).z1();
      this.m3 = var1.u3(169).a6();
      this.z8 = var1.u3(215).a6();
      this.j5 = var1.u3(245).a6();
      this.w1 = var1.u3(264).c8();
      if (this.q_().m3()) {
         this.r4 = var1.u3(274).j_();
         if (d1.n5(this.r4)) {
            this.y4().u3(this, this.z1(), this.m_());
         }
      }
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.u9;
   }

   @Override
   public String y1() {
      return this.t4;
   }

   public final com.aspose.slides.internal.h2.t2 e5() {
      return this.h0;
   }

   @Override
   public final b3 n5() {
      return this.q0;
   }

   @Override
   public final b3 l6() {
      return this.x8;
   }

   @Override
   public final com.aspose.slides.internal.f2.k5 k5() {
      return this.n3;
   }

   @Override
   public final com.aspose.slides.internal.f2.k5 u3() {
      return this.y4;
   }

   @Override
   public final int a6() {
      return this.z8;
   }

   @Override
   public final int h0() {
      return this.m3;
   }

   @Override
   public final int t2() {
      return this.e2;
   }

   @Override
   public final int s7() {
      return this.j5;
   }

   public final com.aspose.slides.internal.f2.k5 b3() {
      if (this.c8.a6() == 9) {
         com.aspose.slides.internal.f2.k5 var1 = this.v0();
         if (var1 != null) {
            return var1;
         }
      }

      return this.c8;
   }

   public final int o0() {
      return this.t2;
   }

   public final com.aspose.slides.internal.f2.k5 z7() {
      return this.s7;
   }

   public final int v4() {
      return this.t9;
   }

   @Override
   public void n5(com.aspose.slides.internal.c4.n5 var1) {
      this.c4 = var1;
   }

   public final com.aspose.slides.internal.c4.n5 u6() {
      return this.c4;
   }

   public final String t1() {
      return this.r4;
   }

   public abstract int a5();

   public abstract int h2();

   public abstract com.aspose.slides.internal.f2.k5 v0();

   @Override
   public boolean n5(int var1) {
      return false;
   }

   @Override
   protected Stack<com.aspose.slides.internal.d5.u3> n5(Stack<com.aspose.slides.internal.d5.u3> var1, com.aspose.slides.internal.d5.u3 var2) {
      if (var2 != null) {
         var2.n5('￼', this);
      }

      return var1;
   }
}
