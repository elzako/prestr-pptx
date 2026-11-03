package com.aspose.slides.internal.v4;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.ms.System.d1;

public class t9 extends t4 {
   private com.aspose.slides.internal.f2.k5 c8;
   private int t2;
   private com.aspose.slides.internal.f2.k5 s7;
   private int x8;
   private com.aspose.slides.internal.f2.k5 n3;
   private int y4;
   private boolean e2 = false;
   private boolean t9 = true;
   private a5 z1;
   private com.aspose.slides.internal.f2.k5 t4;
   private com.aspose.slides.internal.f2.k5 q0;
   private a5 z3;
   private a5 m1;
   private int k7;
   private com.aspose.slides.internal.f2.k5 m3;
   private com.aspose.slides.internal.f2.k5 z8;

   public final com.aspose.slides.internal.f2.k5 o0() {
      return this.m3;
   }

   public final com.aspose.slides.internal.f2.k5 z7() {
      return this.z8;
   }

   public final a5 v4() {
      return this.z1;
   }

   public final int n5(com.aspose.slides.internal.f2.u9 var1) {
      return this.t4.l6(var1);
   }

   public final int l6(com.aspose.slides.internal.f2.u9 var1) {
      return this.q0.l6(var1);
   }

   public final a5 u6() {
      return this.m1;
   }

   public final a5 t1() {
      return this.z3;
   }

   public t9(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   public final com.aspose.slides.internal.f2.k5 a5() {
      return this.n3;
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.c8 = var1.u3(3).c8();
      this.t2 = var1.u3(4).a6();
      this.s7 = var1.u3(15).c8();
      this.x8 = var1.u3(88).a6();
      this.y4 = var1.u3(257).a6();
      this.n3 = var1.u3(264).c8();
      this.k7 = var1.u3(266).a6();
      this.z1 = var1.u3(281);
      this.t4 = var1.u3(283).c8();
      this.q0 = var1.u3(284).c8();
      this.m1 = var1.u3(286);
      this.z3 = var1.u3(287);
      this.m3 = var1.u3(151).c8();
      this.z8 = var1.u3(149).c8();
   }

   public final int h2() {
      return this.k7;
   }

   @Override
   public void u9() {
      super.u9();
      int var1 = this.k5(39);
      int var2 = this.k5(24);
      int var3 = this.k5(36);
      if (var1 > 0) {
         if (var3 < 0 || var3 > 0 && var3 > var1) {
            this.t9 = false;
         }
      } else if (var2 > 0 && (var3 < 0 || var3 > var2)) {
         this.t9 = false;
      }

      this.n_().n5(this);
   }

   @Override
   public void c8() {
      super.c8();
      this.n_().l6(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.e2) {
               this.l6(var1, "fo:marker", "(#PCDATA|%inline;|%block;)");
            }
         } else if (!this.u3(var2, var3)) {
            this.k5(var1, var2, var3);
         } else if (!this.t9 && this.l6(var2, var3) && !this.a6(var2, var3)) {
            this.n5(var1, this.t9(), var2, var3, "rule.inlineContent");
         } else {
            this.e2 = true;
         }
      }
   }

   public final com.aspose.slides.internal.f2.k5 v0() {
      return this.c8;
   }

   public final int f0() {
      return this.t2;
   }

   public final com.aspose.slides.internal.f2.k5 a3() {
      return this.s7;
   }

   public final int p3() {
      return this.x8;
   }

   public final int x9() {
      return this.y4;
   }

   @Override
   public String z1() {
      return "inline";
   }

   @Override
   public int z3() {
      return 35;
   }
}
