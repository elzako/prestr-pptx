package com.aspose.slides.internal.v4;

import com.aspose.slides.internal.e5.i1;
import com.aspose.slides.ms.System.d1;

public abstract class u3 extends com.aspose.slides.internal.e5.z1 {
   private com.aspose.slides.internal.e5.w1 c8;
   private String t2;

   public u3(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.t2 = var1.a6(207).j_();
      if (d1.n5(this.t2)) {
         this.k5("retrieve-class-name");
      }

      this.c8 = var1.k5();
   }

   private com.aspose.slides.internal.e5.w1 n5(com.aspose.slides.internal.e5.t9 var1, com.aspose.slides.internal.e5.w1 var2) {
      return this.o_().l6().n5(var1, var2);
   }

   private void n5(com.aspose.slides.internal.e5.t2 var1, com.aspose.slides.internal.e5.t2 var2, j5 var3, com.aspose.slides.internal.e5.w1 var4) {
      if (var1 != null) {
         com.aspose.slides.internal.e5.t2 var5 = var1.n5(var2, true);
         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.e5.t9.class)) {
            com.aspose.slides.internal.e5.w1 var6 = this.n5((com.aspose.slides.internal.e5.t9)var5, var4);
            j5$l6 var7 = var3.u3(var1);
            var5.n5(var1.z1(), this.m_(), var7, var6);
            l6(var5, var2);
            switch (var5.z3()) {
               case 41:
                  k7 var9 = (k7)var1;
                  this.n5(var9.a5(), var5, var3, var6);
                  this.n5(var9.h2(), var5, var3, var6);
                  break;
               case 71:
                  com.aspose.slides.internal.u6.z1 var8 = (com.aspose.slides.internal.u6.z1)var1;
                  this.n5(new com.aspose.slides.internal.r4.u3<>(var8.z7()), var5, var3, var6);
                  this.n5(var8.a5(), var5, var3, var6);
                  this.n5(var8.h2(), var5, var3, var6);
                  this.n5(var1.x8(), var5, var3, var6);
                  break;
               default:
                  this.n5(var1.x8(), var5, var3, var6);
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.e5.x8.class)) {
            com.aspose.slides.internal.e5.x8 var10 = (com.aspose.slides.internal.e5.x8)var5;
            var10.n5(var4);
            l6(var5, var2);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, i1.class)) {
            l6(var5, var2);
         }

         var5.r_();
      }
   }

   private <T> void n5(com.aspose.slides.internal.r4.h0<T> var1, com.aspose.slides.internal.e5.t2 var2, j5 var3, com.aspose.slides.internal.e5.w1 var4) {
      if (var1 != null) {
         while (var1.l6()) {
            com.aspose.slides.internal.e5.t2 var5 = com.aspose.slides.internal.v6g.k5.n5(var1.k5(), com.aspose.slides.internal.e5.t2.class);
            this.n5(var5, var2, var3, var4);
         }
      }
   }

   private void k5(j5 var1) {
      this.n5(var1.x8(), this, var1, this.c8);
      n5(this, (com.aspose.slides.internal.e5.t2)null);
   }

   public final void l6(j5 var1) {
      if (this.u3 != null) {
         this.u9 = null;
         this.u3 = null;
      }

      if (var1.x8() != null) {
         try {
            this.k5(var1);
         } catch (com.aspose.slides.internal.y1.l6 var3) {
            this.y4().n5(this, var1.i1(), var3, this.m_());
         }
      }
   }

   public final String i1() {
      return this.t2;
   }
}
