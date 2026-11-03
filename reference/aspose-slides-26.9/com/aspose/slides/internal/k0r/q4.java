package com.aspose.slides.internal.k0r;

public final class q4 {
   private int n5;
   private int l6 = 33554433;
   private int k5;
   private k0 u3;
   private k0 a6;
   private k0 u9;
   private int h0 = -1;
   private com.aspose.slides.ms.System.o0 c8 = new com.aspose.slides.ms.System.o0();
   private String t2;
   private long s7;
   private long x8;
   private long n3;
   private int y4;

   public q4() {
   }

   public q4(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5(var1);
   }

   public final int n5() {
      return this.l6;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3 != null ? this.u3.k5() : 0L;
   }

   public final k0 a6() {
      return this.u3;
   }

   public final long u9() {
      return this.a6 != null ? this.a6.k5() : 0L;
   }

   public final k0 h0() {
      return this.a6;
   }

   public final void n5(k0 var1) {
      this.a6 = var1;
   }

   public final long c8() {
      return this.u9 != null ? this.u9.k5() : 0L;
   }

   public final k0 t2() {
      return this.u9;
   }

   public final void l6(k0 var1) {
      this.u9 = var1;
   }

   public final int s7() {
      return this.h0;
   }

   public final com.aspose.slides.ms.System.o0 x8() {
      return this.c8;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.c8);
   }

   public final String n3() {
      return this.t2;
   }

   public final void n5(String var1) {
      this.t2 = var1;
   }

   public final long y4() {
      return this.s7;
   }

   public final void n5(long var1) {
      this.s7 = var1;
   }

   public final long e2() {
      return this.x8;
   }

   public final void l6(long var1) {
      this.x8 = var1;
   }

   public final long t9() {
      return this.n3;
   }

   public final void k5(long var1) {
      this.n3 = var1;
   }

   public final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      if (var1.m3() != 33554433) {
         throw new d8("Wrong Version field value in OLEStream.");
      }

      this.n5(var1.m3());
      this.l6(var1.m3());
      if (var1.m3() != 0) {
         throw new d8("Wrong Reserved1 field value in OLEStream.");
      }

      long var2 = var1.c4();
      if ((var2 & 4294967295L) != 0L) {
         this.u3 = new k0(var1);
      }

      if (this.l6() != 0) {
         long var4 = var1.c4();
         if ((var4 & 4294967295L) != 0L) {
            this.a6 = new k0(var1);
         }

         long var6 = var1.c4();
         if ((var6 & 4294967295L) != 0L) {
            if (this.n5(var1, var4, var6)) {
               this.u9 = this.l6(var1);
            } else {
               this.u9 = new k0(var1);
            }
         }

         int var8 = var1.m3();
         if (var8 != -1) {
            throw new d8("Wrong ClsidIndicator field value in OLEStream.");
         }

         this.n5(new com.aspose.slides.ms.System.o0(var1.c8(16)));
         int var9 = var1.m3();
         if (var9 != 0) {
            this.n5(com.aspose.slides.internal.l7h.j5.z1().l6(var1.c8(var9 * 2)));
         }

         this.y4 = var1.m3();
         this.n5(var1.y2());
         this.l6(var1.y2());
         this.k5(var1.y2());
      }
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5());
      var1.l6(this.l6());
      var1.l6(this.k5());
      var1.l6(0);
      var1.n5(this.u3());
      if ((this.u3() & 4294967295L) != 0L) {
         this.a6().n5(var1);
      }

      if (this.l6() != 0) {
         var1.n5(this.u9());
         if ((this.u9() & 4294967295L) != 0L) {
            this.h0().n5(var1);
         }

         var1.n5(this.c8());
         this.t2().n5(var1);
         var1.l6(this.s7());
         var1.n5(this.x8().n5());
         if (this.n3() != null) {
            var1.l6(this.n3().length());
            var1.n5(com.aspose.slides.internal.l7h.j5.z1().u3(this.n3()));
         } else {
            var1.l6(0);
         }

         var1.l6(this.y4);
         var1.k5(this.y4());
         var1.k5(this.e2());
         var1.k5(this.t9());
      }
   }

   private boolean n5(com.aspose.slides.internal.z0k.n5 var1, long var2, long var4) {
      if ((var2 & 4294967295L) == 0L) {
         return false;
      } else {
         com.aspose.slides.ms.System.o0 var6 = new com.aspose.slides.ms.System.o0(var1.c8(16));
         var1.x8().seek(-16L, 1);
         if (!e7.n5(var6.k5())) {
            return true;
         } else {
            return (var4 & 4294967295L) < var1.x8().getLength() ? false : this.l6() == 9;
         }
      }
   }

   private k0 l6(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.ms.System.o0 var2 = new com.aspose.slides.ms.System.o0(var1.c8(16));
      byte[] var3 = var1.c8((int)(var1.x8().getLength() - var1.x8().getPosition() - 52L));
      return new k0(new j0(var2.k5(), var3));
   }
}
