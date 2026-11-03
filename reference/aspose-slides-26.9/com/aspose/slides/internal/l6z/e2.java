package com.aspose.slides.internal.l6z;

import com.aspose.slides.exceptions.InvalidOperationException;

public class e2 extends n1 {
   private final int n5;
   private q0 l6;
   private z3 k5;
   private z8 u3;
   private z1 a6;
   private m1 u9 = new m1();
   private t4 h0 = new t4();
   private t9 c8 = new t9();
   private j5 t2 = new j5();
   private m3 s7;
   private k7 x8;
   private int n3;

   public e2(int var1, String var2) {
      this.n5 = var1;
      this.l6 = new q0(this.n5);
      this.l6.n5(var2);
      this.k5 = new z3(this.n5);
      this.k5.n5(var2);
      this.u3 = new z8(this.n5, var2);
      this.u3.n5(var2);
      this.a6 = new z1(this.n5, "");
      this.t2.n5(true);
   }

   public e2(int var1) {
      this.n5 = var1;
      this.l6 = new q0(this.n5);
      this.u3 = new z8(this.n5);
      this.a6 = new z1(this.n5);
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6.n5(var1);
      if ((com.aspose.slides.internal.l6z.n5.n5(var1) & 65535) == 71) {
         this.k5 = new z3(this.n5);
         this.k5.n5(var1);
      }

      this.u3.n5(var1);
      this.a6.n5(var1);
      this.u9.n5(var1);
      this.h0.n5(var1);
      this.c8.n5(var1);
      this.t2.n5(var1);
      if ((com.aspose.slides.internal.l6z.n5.n5(var1) & 65535) == 37) {
         this.s7 = new m3();
         this.s7.n5(var1);
      }

      if ((com.aspose.slides.internal.l6z.n5.n5(var1) & 65535) == 40) {
         this.x8 = new k7();
         this.x8.n5(var1);
      }

      this.n3 = var1.r4();
      if ((this.n3 & 65535) != 43) {
         throw new InvalidOperationException();
      }

      var1.c4();
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.l6.n5(var1);
      if (this.k5 != null) {
         this.k5.n5(var1);
      }

      this.u3.n5(var1);
      this.a6.n5(var1);
      this.u9.n5(var1);
      this.h0.n5(var1);
      this.c8.n5(var1);
      this.t2.n5(var1);
      if (this.s7 != null) {
         this.s7.n5(var1);
      }

      if (this.x8 != null) {
         this.x8.n5(var1);
      }

      var1.n5(43);
      var1.n5(0L);
   }

   final z8 n5() {
      return this.u3;
   }

   final m1 l6() {
      return this.u9;
   }

   public final j5 k5() {
      return this.t2;
   }
}
