package com.aspose.slides.internal.s7k;

import com.aspose.slides.Collections.ArrayList;

public class q0 {
   private m1 n5;
   private x8 l6 = new x8();
   private ArrayList k5;

   public q0() {
      this.n5 = null;
      this.l6 = new x8();
      this.k5 = new ArrayList();
   }

   public void n5(com.aspose.slides.internal.z0k.t4 var1) {
      this.n5 = new m1(var1);
      this.k5();
   }

   public void n5() {
      this.n5 = null;
   }

   private void k5() {
      this.l6.n5 = this.n5.k5();
      this.l6.l6 = this.n5.k5();
      this.l6.k5 = this.n5.k5();
      this.l6.u3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), 10);
      this.l6.a6 = com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), 10);
      this.l6.u9 = com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), 10);
      this.l6.h0.n5 = this.n5.l6();
      this.l6.h0.l6 = this.n5.l6();
      this.l6.h0.k5 = this.n5.l6();
      this.l6.h0.u3 = this.n5.l6();
      this.l6.h0.a6 = this.n5.l6();
      this.l6.h0.u9 = this.n5.l6();
      this.l6.c8 = this.n5.k5();
      this.l6.t2 = com.aspose.slides.internal.v6g.k5.a6(this.n5.k5(), 10);
      this.l6.s7 = com.aspose.slides.internal.v6g.k5.a6(this.n5.k5(), 10);
      this.l6.x8 = this.n5.k5();
      this.l6.n3 = this.n5.k5();
      this.l6.y4 = this.n5.u3();
      this.l6.e2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), 10);
      this.l6.t9.n5 = com.aspose.slides.internal.v6g.k5.c8(this.n5.k5(), 10) / 65536.0F;
      this.l6.t9.l6 = com.aspose.slides.internal.v6g.k5.c8(this.n5.k5(), 10) / 65536.0F;
      this.l6.t9.k5 = com.aspose.slides.internal.v6g.k5.c8(this.n5.k5(), 10) / 65536.0F;
      this.l6.z1 = this.n5.k5();
      this.l6.t4 = this.n5.n5(16);
      this.l6.q0 = this.n5.n5(28);
      if (com.aspose.slides.internal.v6g.k5.a6(this.l6.c8, 10) != com.aspose.slides.internal.v6g.k5.a6(1633907568L, 10)) {
         throw new e2();
      }

      this.k5.clear();
      e5 var1 = new e5();
      long var2 = this.n5.k5();

      for (int var4 = 0; var4 < com.aspose.slides.internal.v6g.k5.a6(var2, 10); var4++) {
         var1.n5 = com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), 10);
         var1.l6 = this.n5.k5();
         var1.k5 = this.n5.k5();
         this.k5.addItem(new j5(var1.n5()));
      }
   }

   public k7 n5(int var1) {
      j5 var2 = null;

      for (Object recoveredElement$var4$2324 : this.k5) {
         j5 var4 = (j5)recoveredElement$var4$2324;
         if (var4.n5().n5 == var1) {
            var2 = var4;
            break;
         }
      }

      if (var2 == null) {
         return null;
      }

      if (var2.l6() == null) {
         this.n5(var2);
      }

      return var2.l6();
   }

   private void n5(j5 var1) {
      this.n5.n5(com.aspose.slides.internal.v6g.k5.u9(var1.n5().l6, 10));
      k7 var2 = k7.n5(com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(), 10));
      this.n5.n5(com.aspose.slides.internal.v6g.k5.u9(var1.n5().l6, 10));
      var2.n5(this.n5);
      switch (var1.n5().n5) {
         case 1093812784:
         case 1093812785:
         case 1093812786:
            if (com.aspose.slides.internal.v6g.k5.l6(var2, z1.class)) {
               ((z1)var2).n5(this.l6().a6, this.l6().u9);
            }
            break;
         case 1110589744:
         case 1110589745:
         case 1110589746:
            if (com.aspose.slides.internal.v6g.k5.l6(var2, z1.class)) {
               ((z1)var2).n5(this.l6().u9, this.l6().a6);
            }
      }

      var1.n5(var2);
   }

   public x8 l6() {
      return this.l6;
   }
}
