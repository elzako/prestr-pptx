package com.aspose.slides.internal.v4;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.h2.f0;
import com.aspose.slides.ms.System.d1;

public abstract class k5 extends com.aspose.slides.internal.e5.t9 implements com.aspose.slides.internal.h2.d5 {
   private com.aspose.slides.internal.h2.c8 u9;
   private com.aspose.slides.internal.h2.t2 h0;
   private com.aspose.slides.internal.h2.s7 c8;
   private com.aspose.slides.internal.f2.k5 t2;
   private int s7;
   private com.aspose.slides.internal.f2.k5 x8;
   private int n3;
   private com.aspose.slides.internal.c4.n5 y4;
   private f0 e2;
   private String t9;
   private com.aspose.slides.internal.h2.z1 z1;
   private com.aspose.slides.internal.o9b.c8 t4 = new com.aspose.slides.internal.o9b.c8();

   public k5(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
      this.h0 = var1.u3();
      this.c8 = var1.x8();
      this.t2 = var1.u3(3).c8();
      this.s7 = var1.u3(4).a6();
      this.x8 = var1.u3(15).c8();
      this.n3 = var1.u3(88).a6();
      this.e2 = var1.u3(144).z1();
      this.t9 = var1.u3(198).j_();
      this.z1 = var1.n3();
      var1.u3(72).n5(this.q_()).n5(this.t4);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.w2.u9 var2, com.aspose.slides.internal.w2.k5 var3, com.aspose.slides.internal.e5.w1 var4) {
      super.n5(var1, var2, var3, var4);
      if (!this.p_() && d1.n5(this.t9)) {
         this.k5("ref-id");
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.u9;
   }

   public final com.aspose.slides.internal.h2.s7 e5() {
      return this.c8;
   }

   public final com.aspose.slides.internal.o9b.c8 b3() {
      return this.t4;
   }

   public final com.aspose.slides.internal.h2.z1 o0() {
      return this.z1;
   }

   @Override
   public void n5(com.aspose.slides.internal.c4.n5 var1) {
      this.y4 = var1;
   }

   public final com.aspose.slides.internal.c4.n5 z7() {
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
      return this.n3;
   }

   public final com.aspose.slides.internal.h2.t2 h2() {
      return this.h0;
   }

   public final f0 v0() {
      return this.e2;
   }

   public final String f0() {
      return this.t9;
   }

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
