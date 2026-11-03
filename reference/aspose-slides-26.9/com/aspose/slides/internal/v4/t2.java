package com.aspose.slides.internal.v4;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.f0;
import com.aspose.slides.ms.System.d1;

public class t2 extends com.aspose.slides.internal.e5.t9 {
   private com.aspose.slides.internal.h2.t2 u9;
   private com.aspose.slides.internal.h2.s7 h0;
   private com.aspose.slides.internal.h2.x8 c8;
   private com.aspose.slides.internal.f2.k5 t2;
   private int s7;
   private com.aspose.slides.internal.f2.k5 x8;
   private char n3;
   private com.aspose.slides.internal.o9b.c8 y4 = new com.aspose.slides.internal.o9b.c8();
   private int e2;
   private com.aspose.slides.internal.h2.f2 t9;
   private com.aspose.slides.internal.h2.f2 z1;
   private a5 t4;
   private f0 q0;
   private com.aspose.slides.internal.h2.z1 z3;
   private a5 m1;
   private com.aspose.slides.internal.c4.n5 k7;

   public t2(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = var1.u3();
      this.h0 = var1.x8();
      this.c8 = var1.u9();
      this.t2 = var1.u3(3).c8();
      this.s7 = var1.u3(4).a6();
      this.x8 = var1.u3(15).c8();
      this.n3 = var1.u3(69).h_();
      var1.u3(72).n5(this.q_()).n5(this.y4);
      this.e2 = var1.u3(88).a6();
      this.t9 = var1.u3(132).y4();
      this.z1 = var1.u3(133).y4();
      this.t4 = var1.u3(141);
      this.q0 = var1.u3(144).z1();
      this.z3 = var1.n3();
      this.m1 = var1.u3(265);
   }

   @Override
   public void u9() {
      super.u9();
      this.n_().n5(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   public com.aspose.slides.internal.e5.k5 n3() {
      return new t2$n5(this);
   }

   public final com.aspose.slides.internal.h2.t2 i1() {
      return this.u9;
   }

   public final com.aspose.slides.internal.h2.s7 e5() {
      return this.h0;
   }

   public final com.aspose.slides.internal.h2.x8 b3() {
      return this.c8;
   }

   public final char o0() {
      return this.n3;
   }

   public final com.aspose.slides.internal.o9b.c8 z7() {
      return this.y4;
   }

   public final com.aspose.slides.internal.f2.k5 v4() {
      return this.t2;
   }

   public final int u6() {
      return this.s7;
   }

   public final com.aspose.slides.internal.f2.k5 t1() {
      return this.x8;
   }

   public final int a5() {
      return this.e2;
   }

   public final a5 h2() {
      return this.t4;
   }

   public final com.aspose.slides.internal.h2.z1 v0() {
      return this.z3;
   }

   @Override
   public void n5(com.aspose.slides.internal.c4.n5 var1) {
      this.k7 = var1;
   }

   public final com.aspose.slides.internal.c4.n5 f0() {
      return this.k7;
   }

   @Override
   public String z1() {
      return "character";
   }

   @Override
   public int z3() {
      return 10;
   }

   @Override
   public boolean n5(int var1) {
      return false;
   }

   @Override
   protected Stack<com.aspose.slides.internal.d5.u3> n5(Stack<com.aspose.slides.internal.d5.u3> var1, com.aspose.slides.internal.d5.u3 var2) {
      if (var2 != null) {
         var2.n5(this.n3(), this);
      }

      return var1;
   }

   // $VF: synthetic method
   static char n5(t2 var0) {
      return var0.n3;
   }

   // $VF: synthetic method
   static char n5(t2 var0, char var1) {
      return var0.n3 = var1;
   }
}
