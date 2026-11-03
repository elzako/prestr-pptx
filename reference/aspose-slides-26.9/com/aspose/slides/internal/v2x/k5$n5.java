package com.aspose.slides.internal.v2x;

import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.internal.j3b.h0;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.internal.y5s.c4;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.m3;
import com.aspose.slides.internal.y5s.s7;
import com.aspose.slides.internal.y5s.z3;
import com.aspose.slides.ms.System.q1;

class k5$n5 extends s7 implements c8, h0, com.aspose.slides.internal.j3b.n5, com.aspose.slides.internal.j3b.u9 {
   private final a0 n5;
   private final com.aspose.slides.internal.j3b.u3 l6;
   private final c4 k5;
   private final com.aspose.slides.internal.b9y.l6 u3;
   private final int a6;
   private byte[] u9 = null;
   private final m3 h0;
   private int c8;
   private int t2;

   public k5$n5(m3 var1, a0 var2, com.aspose.slides.internal.j3b.u3 var3, int var4, int var5, int var6) {
      this.h0 = var1;
      this.l6 = var3;
      this.k5 = new c4(var3);
      this.n5 = new a0(var2.l6());
      this.n5.a6();
      this.u3 = new com.aspose.slides.internal.b9y.l6(this, var4);
      this.u3.k5();
      this.a6 = var6;
      this.t2 = var5 * var6;
      if (!this.n5()) {
         this.u9 = com.aspose.slides.internal.y5s.n5.n5(this.t2);
      }
   }

   @Override
   public void n5(j5 var1, int[] var2, z3 var3, z3 var4) {
      int var5 = q1.l6(this.u9.length - this.c8, var2.length);
      int var6 = 0;

      do {
         for (int var7 = 0; var7 < var5; var7++) {
            int var8 = var2[var6++];
            this.u9[this.c8++] = (byte)this.k5.n5(var8);
         }

         if (this.u9.length - this.c8 == 0) {
            this.u3.n5(this.u9, this.c8);
            this.c8 = 0;
         }

         var5 = q1.l6(this.u9.length - this.c8, var2.length - var6);
      } while (var5 > 0);

      this.t2 -= var2.length;
      if (this.t2 == 0) {
         this.u3.n5(this.u9, this.c8);
         this.u3.n5(this.a6);
      }
   }

   @Override
   public void n5(j5 var1, byte[] var2, z3 var3, z3 var4) {
      this.u3.n5(var2, var2.length);
      this.t2 -= var2.length;
      if (this.t2 == 0) {
         this.u3.n5(this.a6);
      }
   }

   @Override
   public void n5(byte[] var1, int var2) {
      this.n5.l6(var1, 0, var2);
   }

   @Override
   public void n5(int var1) {
   }

   @Override
   public void n5(j5 var1) {
      if (this.n5()) {
         com.aspose.slides.internal.e2l.k5 var2 = (com.aspose.slides.internal.e2l.k5)((k5)this.h0).m1();
         var2.n5((com.aspose.slides.internal.y5s.j5)(var1.n3()), (com.aspose.slides.internal.j3b.c8)(this));
      } else {
         this.h0.n5(var1.n3(), this);
      }
   }

   @Override
   protected void u9() {
      this.n5.dispose();
      super.u9();
   }

   private boolean n5() {
      return com.aspose.slides.internal.v6g.k5.l6(this.h0, k5.class)
         && com.aspose.slides.internal.v6g.k5.l6(com.aspose.slides.internal.v6g.k5.n5(this.h0, k5.class).m1(), com.aspose.slides.internal.e2l.k5.class);
   }
}
