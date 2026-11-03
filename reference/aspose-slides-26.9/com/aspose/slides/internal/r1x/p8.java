package com.aspose.slides.internal.r1x;

public class p8 extends q0 implements com.aspose.slides.internal.b8u.n3, com.aspose.slides.internal.b8u.x8 {
   private final com.aspose.slides.internal.o9b.y2 n5 = new com.aspose.slides.internal.o9b.y2();
   private com.aspose.slides.internal.o9b.j5 l6 = new com.aspose.slides.internal.o9b.j5();
   private boolean k5 = false;
   private com.aspose.slides.internal.b8u.x8 u3;
   private int a6 = 0;
   private int u9 = -1;

   public p8(f0 var1, com.aspose.slides.internal.o9b.y2 var2, com.aspose.slides.internal.b8u.x8 var3, com.aspose.slides.internal.b8u.a6 var4, boolean var5) {
      com.aspose.slides.internal.o9b.y2 var6 = var1.x8().n3();
      int var7 = var6.s7() - var2.s7();
      int var8 = var6.x8() - var2.x8();
      this.l6 = new com.aspose.slides.internal.o9b.j5(var7, var8);
      var2.u3(this.n5);
      this.k5 = var6.equals(var2.n3()) ? false : var5;
      this.n5(var1, var2.n3(), var3, var4);
   }

   public p8(f0 var1, com.aspose.slides.internal.o9b.y2 var2, com.aspose.slides.internal.b8u.x8 var3, com.aspose.slides.internal.b8u.a6 var4) {
      this(var1, var2.n3(), var3, var4, false);
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, int[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      var1.k5(var1.s7() + this.l6.n5());
      var1.u3(var1.x8() + this.l6.l6());
      if (this.k5) {
         this.n5(var1.n3());
         this.l6(var1.n3(), var2, var3.k5(), var4.k5());
      } else {
         this.u3.n5(var1.n3(), var2, var3.k5(), var4.k5());
      }
   }

   public final void n5() {
      if (this.k5 && this.a6 < this.n5.l6()) {
         com.aspose.slides.internal.o9b.y2 var1 = new com.aspose.slides.internal.o9b.y2(0, this.a6, this.n5.t2(), this.n5.l6() - this.a6);
         this.l6(var1.n3());
      }
   }

   @Override
   public final long n5(long var1) {
      long var3 = 0L;
      com.aspose.slides.internal.b8u.n3 var5 = com.aspose.slides.internal.v6g.k5.n5(this.u3, com.aspose.slides.internal.b8u.n3.class);
      if (var5 != null) {
         var3 += var5.n5(var1);
      }

      return var3;
   }

   @Override
   protected void a6() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.u3, f2.class)) {
         ((f2)this.u3).n5();
         this.u3 = null;
      }

      super.a6();
   }

   private void n5(f0 var1, com.aspose.slides.internal.o9b.y2 var2, com.aspose.slides.internal.b8u.x8 var3, com.aspose.slides.internal.b8u.a6 var4) {
      this.u3 = var3;
   }

   private void n5(com.aspose.slides.internal.o9b.y2 var1) {
      if (this.u9 < 0) {
         this.u9 = var1.t2();
      } else if (this.u9 != var1.t2()) {
         throw new com.aspose.slides.internal.z3b.k5("Support only interlaced processing.");
      }

      if (this.a6 < var1.x8()) {
         com.aspose.slides.internal.o9b.y2 var2 = new com.aspose.slides.internal.o9b.y2(0, 0, this.n5.t2(), var1.x8() - this.a6);
         this.l6(var2.n3());
      }
   }

   private void l6(com.aspose.slides.internal.o9b.y2 var1, int[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      if (this.a6 != var1.x8()) {
         throw new com.aspose.slides.internal.z3b.k5("Incorrect current bottom.");
      }

      if (var1.t2() < this.n5.t2()) {
         com.aspose.slides.internal.o9b.y2 var5 = new com.aspose.slides.internal.o9b.y2(0, this.a6, this.n5.t2(), var1.l6());
         int[] var6 = new int[var5.t2() * var5.l6()];
         int var7 = var1.s7();
         int var8 = var1.t2();
         int var9 = this.n5.u9() - (var1.u9() - this.l6.n5());
         int var10 = 0;
         int var11 = 0;

         for (int var12 = 0; var12 < var1.l6(); var12++) {
            var10 += var7;
            System.arraycopy(var2, var11, var6, var10, var8);
            var10 += var8 + var9;
            var11 += var8;
         }

         this.u3.n5(var5.n3(), var6, var5.a6().k5(), new com.aspose.slides.internal.o9b.j5(var5.u9(), var5.n5()));
      } else {
         this.u3.n5(var1.n3(), var2, var3.k5(), var4.k5());
      }

      this.a6 = this.a6 + var1.l6();
   }

   private void l6(com.aspose.slides.internal.o9b.y2 var1) {
      int[] var2 = new int[var1.t2() * var1.l6()];
      this.u3.n5(var1.n3(), var2, var1.a6().k5(), new com.aspose.slides.internal.o9b.j5(var1.u9(), var1.n5()));
      this.a6 = this.a6 + var1.l6();
   }
}
