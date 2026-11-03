package com.aspose.slides.internal.v4;

import com.aspose.slides.ms.System.d1;

public class a6 extends t4 {
   private com.aspose.slides.internal.f2.k5 c8;
   private int t2;
   private com.aspose.slides.internal.f2.k5 s7;
   private int x8;
   private com.aspose.slides.internal.c4.n5 n3;
   private String y4;
   private String e2;
   private int t9;
   private int z1;
   private boolean t4 = false;

   public a6(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.c8 = var1.a6(3).c8();
      this.t2 = var1.a6(4).a6();
      this.s7 = var1.a6(15).c8();
      this.x8 = var1.a6(88).a6();
      this.y4 = var1.a6(94).j_();
      this.e2 = var1.a6(128).j_();
      this.t9 = var1.a6(219).a6();
      this.z1 = var1.u3(266).a6();
      if (this.e2.length() > 0) {
         this.y4 = null;
      } else if (this.y4.length() == 0) {
         this.y4().n5(this, this.t9(), this.k5);
      }
   }

   public final int e5() {
      return this.z1;
   }

   @Override
   public void u9() {
      super.u9();
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
            if (this.t4) {
               this.l6(var1, "fo:marker", "(#PCDATA|%inline;|%block;)");
            }
         } else if (!this.u3(var2, var3)) {
            this.k5(var1, var2, var3);
         } else {
            this.t4 = true;
         }
      }
   }

   public final com.aspose.slides.internal.f2.k5 b3() {
      return this.c8;
   }

   public final int o0() {
      return this.t2;
   }

   public final com.aspose.slides.internal.f2.k5 z7() {
      return this.s7;
   }

   public final int v4() {
      return this.x8;
   }

   @Override
   public void n5(com.aspose.slides.internal.c4.n5 var1) {
      this.n3 = var1;
   }

   public final com.aspose.slides.internal.c4.n5 u6() {
      return this.n3;
   }

   public final String t1() {
      return this.e2;
   }

   public final String a5() {
      return this.y4;
   }

   public final boolean h2() {
      return this.e2 != null && this.e2.length() > 0;
   }

   public final boolean v0() {
      return this.y4 != null && this.y4.length() > 0;
   }

   public final int f0() {
      return this.t9;
   }

   @Override
   public String z1() {
      return "basic-link";
   }

   @Override
   public int z3() {
      return 1;
   }
}
