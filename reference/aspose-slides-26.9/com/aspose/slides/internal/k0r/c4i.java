package com.aspose.slides.internal.k0r;

import com.aspose.slides.PptReadException;

public class c4i extends e6r {
   private int n5 = 28;
   private long l6 = 256L;
   private long k5;
   private long u3;
   private long a6;
   private long u9;
   private int h0;
   private long c8;

   public c4i() {
      this.w1().n5(4085);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = this.w1().a6();
      this.l6 = var1.c4();
      var1.k7();
      var1.z1();
      var1.z1();
      this.k5 = var1.c4();
      this.u3 = var1.c4();
      this.a6 = var1.c4();
      this.u9 = var1.c4();
      this.h0 = var1.k7();
      if (this.n5 >= 28) {
         var1.r4();
         this.a6(0L);
         switch (this.w1().a6()) {
            case 28:
               break;
            case 29:
            case 31:
            default:
               throw new PptReadException("Wrong size of UserEditAtom.");
            case 30:
               var1.r4();
               break;
            case 32:
               this.a6(var1.c4());
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.l6 & 4294967295L);
      var1.l6(50338212);
      var1.n5(this.k5 & 4294967295L);
      var1.n5(this.u3 & 4294967295L);
      var1.n5(this.a6 & 4294967295L);
      var1.n5(this.u9 & 4294967295L);
      var1.n5((short)this.h0);
      var1.n5((short)12741);
      if (this.n5 > 28) {
         var1.n5(this.c8 & 4294967295L);
      }
   }

   @Override
   public int n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final long l6() {
      return this.k5;
   }

   public final void l6(long var1) {
      this.k5 = var1;
   }

   public final int k5() {
      return (int)this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1 & 4294967295L;
   }

   public final long u3() {
      return this.a6;
   }

   public final void k5(long var1) {
      this.a6 = var1;
   }

   public final void u3(long var1) {
      this.u9 = var1;
   }

   public final int a6() {
      return this.h0;
   }

   public final void l6(int var1) {
      this.h0 = var1;
   }

   public final long u9() {
      return this.c8;
   }

   public final void a6(long var1) {
      if ((var1 & 4294967295L) == 0L) {
         this.n5 = 28;
      } else {
         this.n5 = 32;
      }

      this.c8 = var1;
   }
}
