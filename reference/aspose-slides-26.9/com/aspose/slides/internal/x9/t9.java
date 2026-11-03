package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.t1;

public class t9 extends com.aspose.slides.internal.p3.u3 implements j5 {
   private com.aspose.slides.internal.v4.x8 x8;
   private com.aspose.slides.internal.p3.z3 n3 = null;
   private boolean y4 = false;
   private boolean e2 = false;
   public com.aspose.slides.internal.p3.i1 t2;
   private com.aspose.slides.internal.a0.l6 t9;
   private d2 z1 = null;
   public com.aspose.slides.internal.p3.y2 s7 = null;
   private boolean t4 = false;
   private boolean q0 = false;

   public final boolean y1() {
      return this.e2;
   }

   public final void u3(boolean var1) {
      this.e2 = var1;
   }

   public final boolean a0() {
      return this.y4;
   }

   public final void a6(boolean var1) {
      this.y4 = var1;
   }

   public final com.aspose.slides.internal.p3.z3 d2() {
      return this.n3;
   }

   public final com.aspose.slides.internal.a0.l6 d5() {
      return this.t9;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      if (this.q0) {
         this.h0().l6(var1);
      }

      this.t9 = var1;
   }

   public t9(com.aspose.slides.internal.v4.x8 var1) {
      super(var1);
      this.x8 = var1;
   }

   @Override
   public void t4() {
      if (this.n3 == null) {
         this.n3 = new com.aspose.slides.internal.p3.z3(this.x8);
      }
   }

   public final void u9(boolean var1) {
      this.q0 = var1;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      this.t4();
      this.n3.n5(this);
      this.n3.t4();
      if (this.q0) {
         try {
            return this.n3.n5(var1, var2);
         } finally {
            this.k5(true);
         }
      } else {
         if (!this.t4) {
            com.aspose.slides.internal.p3.k7 var3 = new com.aspose.slides.internal.p3.k7(this);
            List var4 = var3.c8();
            if (var4 != null) {
               var4.addItem(this);
            }
         }

         List var7 = new List();
         com.aspose.slides.internal.p3.d5 var8 = new com.aspose.slides.internal.p3.d5();
         this.t2 = new c4(0, null, null, true);
         ((c4)this.t2).n5(this.n3);
         var8.addItem(this.t2);
         var7.addItem(var8);
         this.k5(true);
         return var7;
      }
   }

   @Override
   public final List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1) {
      return var1;
   }

   @Override
   public final List<com.aspose.slides.internal.r4.u9> l6(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      return var1;
   }

   @Override
   public final String a6(j8 var1) {
      return null;
   }

   @Override
   public final void n5(j8 var1, q0 var2) {
   }

   @Override
   public final boolean l6(List<com.aspose.slides.internal.r4.u9> var1) {
      return false;
   }

   @Override
   public final boolean k5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      return false;
   }

   @Override
   public final List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2, int var3) {
      return null;
   }
}
