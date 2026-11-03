package com.aspose.slides.internal.r1x;

public class i1 extends q0 implements com.aspose.slides.internal.b8u.t9 {
   private final com.aspose.slides.internal.o9b.y2 n5 = new com.aspose.slides.internal.o9b.y2();
   private com.aspose.slides.internal.o9b.j5 l6 = new com.aspose.slides.internal.o9b.j5();
   private boolean k5 = false;
   private int u3 = 0;
   private int a6 = 0;
   private int u9 = -1;
   private com.aspose.slides.internal.b8u.t9 h0;

   public i1(f0 var1, z6 var2, com.aspose.slides.internal.o9b.y2 var3, com.aspose.slides.internal.b8u.t9 var4, boolean var5) {
      com.aspose.slides.internal.o9b.y2 var6 = var1.x8().n3();
      int var7 = var6.s7() - var3.s7();
      int var8 = var6.x8() - var3.x8();
      this.l6 = new com.aspose.slides.internal.o9b.j5(var7, var8);
      var3.u3(this.n5);
      this.k5 = var6.equals(var3.n3()) ? false : var5;
      this.n5(var1, var3.n3(), var4, var2);
   }

   public i1(f0 var1, z6 var2, com.aspose.slides.internal.o9b.y2 var3, com.aspose.slides.internal.b8u.t9 var4) {
      this(var1, var2, var3.n3(), var4, false);
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, byte[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      var1.k5(var1.s7() + this.l6.n5());
      var1.u3(var1.x8() + this.l6.l6());
      if (this.k5) {
         this.u3 = var2.length / (var1.t2() * var1.l6());
         this.n5(var1.n3());
         this.l6(var1.n3(), var2, var3.k5(), var4.k5());
      } else {
         this.h0.n5(var1.n3(), var2, var3.k5(), var4.k5());
      }
   }

   @Override
   protected void a6() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.h0, e5.class)) {
         ((e5)this.h0).n5();
         this.h0 = null;
      }

      super.a6();
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

   private void l6(com.aspose.slides.internal.o9b.y2 var1, byte[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      if (this.a6 != var1.x8()) {
         throw new com.aspose.slides.internal.z3b.k5("Incorrect current bottom.");
      }

      if (var1.t2() < this.n5.t2()) {
         com.aspose.slides.internal.o9b.y2 var5 = new com.aspose.slides.internal.o9b.y2(0, this.a6, this.n5.t2(), var1.l6());
         byte[] var6 = new byte[var5.t2() * var5.l6() * this.u3];
         int var7 = var1.s7() * this.u3;
         int var8 = var1.t2() * this.u3;
         int var9 = (this.n5.u9() - (var1.u9() - this.l6.n5())) * this.u3;
         int var10 = 0;
         int var11 = 0;

         for (int var12 = 0; var12 < var1.l6(); var12++) {
            var10 += var7;
            System.arraycopy(var2, var11, var6, var10, var8);
            var10 += var8 + var9;
            var11 += var8;
         }

         this.h0.n5(var5.n3(), var6, var5.a6().k5(), new com.aspose.slides.internal.o9b.j5(var5.u9(), var5.n5()));
      } else {
         this.h0.n5(var1.n3(), var2, var3.k5(), var4.k5());
      }

      this.a6 = this.a6 + var1.l6();
   }

   private void l6(com.aspose.slides.internal.o9b.y2 var1) {
      byte[] var2 = new byte[var1.t2() * var1.l6() * this.u3];
      this.h0.n5(var1.n3(), var2, var1.a6().k5(), new com.aspose.slides.internal.o9b.j5(var1.u9(), var1.n5()));
      this.a6 = this.a6 + var1.l6();
   }

   private void n5(f0 var1, com.aspose.slides.internal.o9b.y2 var2, com.aspose.slides.internal.b8u.t9 var3, z6 var4) {
      this.h0 = var3;
   }
}
