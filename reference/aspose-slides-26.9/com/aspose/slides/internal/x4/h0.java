package com.aspose.slides.internal.x4;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class h0 implements l6 {
   private int n5;
   private int l6;
   private int k5 = 0;
   private int u3 = 0;
   private int a6 = 0;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private int t2;
   private String s7;

   public h0() {
      this.l6 = 0;
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.s7 = "Microsoft Sans Serif";
   }

   public final void n5(z1 var1) {
      this.k5 = var1.k7();
      var1.k7();
      this.u3 = var1.k7();
      var1.k7();
      this.a6 = var1.k7();
      this.u9 = var1.t9();
      this.h0 = var1.t9();
      this.c8 = var1.t9();
      this.t2 = var1.z1() & 255;
      var1.z1();
      var1.z1();
      var1.z1();
      var1.z1();
      this.s7 = com.aspose.slides.internal.c8e.n5.l6(var1.n5(32, this.u3()));
      this.s7();
   }

   public final void n5(t9 var1) {
      this.n5 = var1.m3();
      this.k5 = var1.m3();
      var1.m3();
      this.u3 = var1.m3();
      var1.m3();
      this.a6 = var1.m3();
      this.u9 = var1.t9();
      this.h0 = var1.t9();
      this.c8 = var1.t9();
      this.t2 = var1.z1() & 255;
      var1.z1();
      var1.z1();
      var1.z1();
      var1.z1();
      this.s7 = com.aspose.slides.internal.c8e.n5.l6(var1.k5(32));
      this.s7();
   }

   public final com.aspose.slides.internal.p1s.l6 k5() {
      return com.aspose.slides.internal.e1x.x8.u3().n5(this.s7, this.t2(), this.c8(), "Microsoft Sans Serif");
   }

   private int c8() {
      if (this.l6 != 0) {
         return this.l6;
      }

      if (this.a6 >= 700) {
         this.l6 |= 1;
      }

      if (this.u9) {
         this.l6 |= 2;
      }

      if (this.h0) {
         this.l6 |= 4;
      }

      if (this.c8) {
         this.l6 |= 8;
      }

      return this.l6;
   }

   private float t2() {
      return this.k5 != 0 ? q1.n5(this.k5) : 12.0F;
   }

   @Override
   public final int n5() {
      return 6;
   }

   @Override
   public final int l6() {
      return this.n5;
   }

   @Override
   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final j5 u3() {
      int var1 = com.aspose.slides.internal.b8.a6.n5(this.h0(), 1252);
      return com.aspose.slides.internal.n2d.x8.n5(var1);
   }

   public final float a6() {
      return this.u3 / 10.0F;
   }

   public final String u9() {
      return this.s7;
   }

   public final void n5(String var1) {
      this.s7 = var1;
   }

   public final int h0() {
      return this.t2;
   }

   private void s7() {
      if (d1.l6(this.s7, "@")) {
         this.k5 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(this.k5 * 0.8), 14);
         this.s7 = d1.l6(this.s7, 1, this.s7.length() - 1);
      }
   }
}
