package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.p3.s3;
import com.aspose.slides.ms.System.q1;

public class y4 extends c8 {
   private com.aspose.slides.internal.j9.c8 h0;
   private List<com.aspose.slides.internal.r4.u9> c8;
   private int t2;
   private int s7;
   private List<c8[]> x8;
   private int n3 = -1;
   private boolean y4;
   private int e2;
   private s3 t9 = s3.n5;
   private s3 z1 = s3.n5;
   private int t4 = 9;
   private int q0 = 9;

   public y4(m1 var1, int var2) {
      super(var1, 0, 0);
      this.s7 = var2;
      this.y4 = var1.e5().s0();
      this.e2 = var1.e5().v8().s7().c8().u3() / 2;
   }

   public final y2 y4() {
      com.aspose.slides.internal.e5.t2 var1 = this.n5.s_();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, y1.class)) {
         var1 = var1.s_();
      }

      return (y2)var1;
   }

   public final com.aspose.slides.internal.j9.c8 e2() {
      return this.h0;
   }

   @Override
   public y4 l6() {
      return this;
   }

   @Override
   public boolean k5() {
      return true;
   }

   public final void n5(List<com.aspose.slides.internal.r4.u9> var1) {
      this.c8 = var1;
   }

   public final List<com.aspose.slides.internal.r4.u9> t9() {
      return this.c8;
   }

   public final int z1() {
      return this.n5(0, 0) + this.a6(0);
   }

   public final int n5(int var1, int var2) {
      if (this.y4) {
         if (this.u9() == null) {
            return 0;
         }

         com.aspose.slides.internal.h2.t2 var6 = this.u9().x9();
         switch (var2) {
            case 0:
            case 1:
               return var6.k5(false) + this.e2;
            case 2:
               if (var6.n5(0).k5().s7()) {
                  return 0;
               }

               return var6.k5(true) + this.e2;
            default:
               return 0;
         }
      } else {
         int var3 = 0;
         c8[] var4 = this.x8.get_Item(var1);

         for (int var5 = 0; var5 < var4.length; var5++) {
            var3 = q1.n5(var3, var4[var5].n5(var2).u3());
         }

         return var3 / 2;
      }
   }

   public final int l6(int var1, int var2) {
      if (this.y4) {
         if (this.u9() == null) {
            return 0;
         }

         com.aspose.slides.internal.h2.t2 var6 = this.u9().x9();
         switch (var2) {
            case 0:
            case 1:
               return var6.u3(false) + this.e2;
            case 2:
               if (var6.n5(1).k5().s7()) {
                  return 0;
               }

               return var6.u3(true) + this.e2;
            default:
               return 0;
         }
      } else {
         int var3 = 0;
         c8[] var4 = this.x8.get_Item(var1);

         for (int var5 = 0; var5 < var4.length; var5++) {
            var3 = q1.n5(var3, var4[var5].l6(var2).u3());
         }

         return var3 / 2;
      }
   }

   public final int a6(int var1) {
      return this.l6(this.u9().v4() - 1, var1);
   }

   public final int t4() {
      this.n3 = com.aspose.slides.internal.p3.q0.n5(this.c8);
      return this.n3;
   }

   public final List<c8[]> q0() {
      return this.x8;
   }

   public final void n5(c8[] var1) {
      if (this.x8 == null) {
         this.x8 = new List<>();
      }

      this.x8.addItem(var1);
   }

   public final void u9(int var1) {
      this.t2 = var1;
   }

   public final int z3() {
      return this.t2;
   }

   public final int m1() {
      return this.s7;
   }

   public final int[] k7() {
      int[] var1 = new int[2];
      if (this.u9() == null) {
         return var1;
      }

      if (this.u9().e5().s0()) {
         var1[0] = this.u9().x9().n5(false);
         var1[1] = this.u9().x9().l6(false);
      } else {
         for (int var2 = 0; var2 < this.x8.size(); var2++) {
            c8[] var3 = this.x8.get_Item(var2);
            var1[0] = q1.n5(var1[0], var3[0].u3.l6().u3());
            var1[1] = q1.n5(var1[1], var3[var3.length - 1].a6.l6().u3());
         }
      }

      return var1;
   }

   @Override
   public String toString() {
      a5 var1 = new a5(super.toString());
      var1.n5(" rowIndex=").k5(this.t2);
      var1.n5(" colIndex=").k5(this.s7);
      return var1.toString();
   }

   public final boolean m3() {
      return this.u9().z7() > 1 || this.u9().v4() > 1;
   }

   public final void z8() {
      this.h0 = new com.aspose.slides.internal.j9.c8(this.n5, this);
   }

   public final s3 j5() {
      return this.t9;
   }

   public final void n5(s3 var1) {
      this.t9 = var1;
   }

   public final s3 w1() {
      return this.z1;
   }

   public final void l6(s3 var1) {
      this.z1 = var1;
   }

   public final int r4() {
      return this.t4;
   }

   public final void h0(int var1) {
      this.t4 = var1;
   }

   public final int c4() {
      return this.q0;
   }

   public final void c8(int var1) {
      this.q0 = var1;
   }
}
