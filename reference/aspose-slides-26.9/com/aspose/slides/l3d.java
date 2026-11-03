package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class l3d extends g3c implements Comparable<l3d> {
   public final int k5() {
      return this.m1().n5();
   }

   public final int u3() {
      return this.m1().l6();
   }

   public final String a6() {
      return this.m1().k5();
   }

   public final int u9() {
      return this.m1().u3();
   }

   public final int h0() {
      return this.m1().u9();
   }

   public final int c8() {
      return this.m1().a6();
   }

   public final String t2() {
      return this.m1().h0();
   }

   public final int s7() {
      return this.m1().c8();
   }

   public final double x8() {
      double var1 = this.m1().s7();
      if (this.k5() != 23 && this.k5() != 0) {
         var1 = q3g.n5(var1);
      }

      return var1;
   }

   public final double n3() {
      return this.m1().x8();
   }

   public final int y4() {
      return this.m1().t2();
   }

   public l3d(com.aspose.slides.internal.k4y.d0d var1) {
   }

   public final List<k6a> n5(k6a var1) {
      return var1.n5(this.m1().l6(), this.m1().k5(), this.m1().u3());
   }

   public final k6a l6(k6a var1) {
      List var2 = this.k5(var1);
      return var2.size() > 0 ? (k6a)var2.get_Item(0) : null;
   }

   public final List<k6a> k5(k6a var1) {
      return var1.n5(this.m1().u9(), this.m1().h0(), this.m1().c8());
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "type='{0}' for='{1}'{2}{3}{4}{5}{6}{7}{8}{9}",new Object[]{
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.d5.class, this.k5()),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.z3t.class, this.u3()),
         !"".equals(this.a6()) ? com.aspose.slides.ms.System.d1.n5(" forName='{0}'", new Object[]{this.a6()}) : "",
         this.u9() != 1
            ? com.aspose.slides.ms.System.d1.n5(
               " ptType='{0}'", new Object[]{com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.l5f.class, this.u9())}
            )
            : "",
         this.c8() != 21
            ? com.aspose.slides.ms.System.d1.n5(
               " refType='{0}'", new Object[]{com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.d5.class, this.c8())}
            )
            : "",
         this.h0() != 1
            ? com.aspose.slides.ms.System.d1.n5(
               " refFor='{0}'", new Object[]{com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.z3t.class, this.h0())}
            )
            : "",
         !"".equals(this.t2()) ? com.aspose.slides.ms.System.d1.n5(" refForName='{0}'", new Object[]{this.t2()}) : "",
         this.s7() != 1
            ? com.aspose.slides.ms.System.d1.n5(
               " refPtType='{0}'", new Object[]{com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.l5f.class, this.s7())}
            )
            : "",
         this.x8() != 0.0 ? com.aspose.slides.ms.System.d1.n5(" val='{0}'", new Object[]{this.x8()}) : "",
         this.y4() != 0
            ? com.aspose.slides.ms.System.d1.n5(
               " op='{0}'", new Object[]{com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.k4y.i5i.class, this.y4())}
            )
            : ""
      });
   }

   public final int n5(l3d var1) {
      int var2 = l6(this);
      int var3 = l6(var1);
      if (var2 == var3) {
         var2 = this.z3();
         var3 = var1.z3();
      }

      if (var2 < var3) {
         return -1;
      } else {
         return var2 == var3 ? 0 : 1;
      }
   }

   private static int l6(l3d var0) {
      if (q3g.k5(var0.k5())) {
         return 5;
      }

      switch (var0.y4()) {
         case 0:
         case 1:
         default:
            return 0;
         case 2:
            return 1;
         case 3:
            return 3;
         case 4:
            return 2;
      }
   }

   private int z3() {
      return this.e2() != null ? this.e2().t9().l6(this) : 0;
   }

   private com.aspose.slides.internal.k4y.d0d m1() {
      return (com.aspose.slides.internal.k4y.d0d)this.q0();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(l3d bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
