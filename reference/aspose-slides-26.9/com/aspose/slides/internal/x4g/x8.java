package com.aspose.slides.internal.x4g;

import java.awt.Shape;

public final class x8 {
   int n5;
   int l6;
   Shape k5;
   int u3;
   float a6;
   int u9;
   int h0;
   com.aspose.slides.internal.o9b.j5 c8 = new com.aspose.slides.internal.o9b.j5();
   int t2;
   int s7;
   int x8;
   m1 n3;
   m1 y4;
   private x8 e2 = null;

   public x8 n5() {
      return this.e2;
   }

   public void n5(x8 var1) {
      this.e2 = var1;
   }

   public x8(com.aspose.slides.internal.o9b.z1 var1, m1 var2, boolean var3) {
      this.n5 = var1.c8();
      this.l6 = var1.t2();
      this.k5 = var1.z8().getClip();
      this.u3 = var1.n3();
      this.a6 = var1.y4();
      this.u9 = var1.e2();
      this.h0 = var1.t9();
      this.c8 = var1.z1();
      this.t2 = var1.t4();
      this.n3 = var1.m1();
      this.y4 = var1.k7();
      if (this.y4 == null) {
         this.y4 = m1.n5.u9();
      }

      this.s7 = var1.q0();
      this.x8 = var1.z3();
      if (var3) {
         this.n5(var1, var2);
      }
   }

   public void n5(com.aspose.slides.internal.o9b.z1 var1) {
      var1.n5(this.n5);
      var1.l6(this.l6);
      var1.z8().setClip(this.k5);
      var1.k5(this.u3);
      var1.n5(this.a6);
      var1.u3(this.u9);
      var1.a6(this.h0);
      var1.n5(this.c8);
      var1.u9(this.t2);
      var1.l6(this.n3);
      var1.k5(this.y4);
      var1.h0(this.s7);
      var1.c8(this.x8);
   }

   private void n5(com.aspose.slides.internal.o9b.z1 var1, m1 var2) {
      var1.a6();
      var1.n5(0);
      var1.l6(0);
      var1.u3();
      var1.k5(3);
      var1.n5(1.0F);
      var1.u3(1);
      var1.a6(0);
      var1.u9(3);
      var1.n5(com.aspose.slides.internal.r5w.n5.n5(this.n3.t2(), this.u9, this.a6));
      var1.n5(var2.t2());
      var1.h0(4);
      var1.c8(0);
   }
}
