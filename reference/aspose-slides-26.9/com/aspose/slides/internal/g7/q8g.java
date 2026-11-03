package com.aspose.slides.internal.g7;

public class q8g extends s7k {
   private float n5;
   private int l6;
   private int k5;
   private short u3;
   private short a6;
   private short u9;
   private short h0;
   private short c8;
   private short t2;
   private short s7;
   private short x8;
   private short n3;
   private short y4;

   public q8g(d7u var1, u0a var2) {
      super(var1, var2);
      this.n5 = 1.0F;
   }

   public q8g(g9t var1, long var2, long var4, long var6) {
      super(var1, var2, var4, var6);
   }

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final int l6() {
      return this.k5;
   }

   public final short k5() {
      return this.a6;
   }

   public final void n5(short var1) {
      this.a6 = var1;
   }

   public final short u3() {
      return this.u9;
   }

   public final void l6(short var1) {
      this.u9 = var1;
   }

   public final short a6() {
      return this.h0;
   }

   public final void k5(short var1) {
      this.h0 = var1;
   }

   public final short u9() {
      return this.x8;
   }

   public final void u3(short var1) {
      this.x8 = var1;
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.d2() & 4294967295L);
      this.n5 = var1.u3();
      this.a6 = var1.u9();
      this.u9 = var1.u9();
      this.h0 = var1.u9();
      this.k5 = var1.a6();
      this.u3 = var1.u9();
      this.t2 = var1.u9();
      this.s7 = var1.u9();
      this.x8 = var1.t2();
      this.n3 = var1.t2();
      this.y4 = var1.t2();
      var1.t2();
      var1.t2();
      var1.t2();
      var1.t2();
      this.c8 = var1.t2();
      this.l6 = var1.n3();
      super.n5(var1);
   }

   @Override
   public void n5(byte[][] var1, long[] var2, long[] var3) {
      if (this.a0()) {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            j2p var5 = new j2p(var4, true);

            try {
               this.h0();
               var5.n5(this.n5);
               var5.l6(this.a6);
               var5.l6(this.u9);
               var5.l6(this.h0);
               var5.k5(this.k5);
               var5.l6(this.u3);
               var5.l6(this.t2);
               var5.l6(this.s7);
               var5.n5(this.x8);
               var5.n5(this.n3);
               var5.n5(this.y4);
               var5.n5((short)0);
               var5.n5((short)0);
               var5.n5((short)0);
               var5.n5((short)0);
               var5.n5(this.c8);
               var5.n5(this.l6);
               this.n5(var5, var4, var1, var2, var3);
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } else {
         super.n5(var1, var2, var3);
      }
   }

   private void h0() {
      this.k5 = 0;
      this.s7 = 0;
      this.u3 = 32767;
      this.t2 = 32767;

      try {
         if (this.y2().s7() != null) {
            if (this.y2().s7().n5().n5() == 1) {
               this.k5 = this.y2().s7().n5().n5(0).n5();
               if (this.y2().s7().l6().length > 0) {
                  if (this.y2().s7().l6()[0] < this.u3) {
                     this.u3 = this.y2().s7().l6()[0];
                  }

                  this.t2 = (short)((this.k5 & 65535) - this.u3);
               }
            } else {
               for (int var1 = 0; var1 < (this.y2().a6().n5() & 65535); var1++) {
                  k6 var2 = this.y1().k5().n5(var1);
                  if (var1 <= this.y2().s7().n5().n5() - 1) {
                     int var3 = this.y2().s7().n5().n5(var1).n5();
                     short var4 = this.y2().s7().n5().n5(var1).l6();
                     if ((this.y2().s7().n5().n5(var1).n5() & 65535) > (this.k5 & 65535)) {
                        this.k5 = var3;
                     }

                     if (var4 < this.u3) {
                        this.u3 = var4;
                     }

                     double var5 = (var3 & 65535) - var4 - (var2.n3().k5() - var2.n3().n5());
                     if (var5 < this.t2) {
                        this.t2 = com.aspose.slides.internal.v6g.k5.l6(var5, 14);
                     }

                     double var7 = var4 + (var2.n3().k5() - var2.n3().n5());
                     if (var7 > this.s7) {
                        this.s7 = com.aspose.slides.internal.v6g.k5.l6(var7, 14);
                     }
                  } else {
                     int var12 = var1 - this.y2().s7().n5().n5();
                     if (var12 >= 0 && var12 < this.y2().s7().l6().length && this.y2().s7().l6()[var12] < this.u3) {
                        this.u3 = this.y2().s7().l6()[var12];
                     }
                  }
               }
            }
         }
      } finally {
         if (this.u3 == 32767) {
            this.u3 = 0;
         }

         if (this.t2 == 32767) {
            this.t2 = 0;
         }
      }
   }
}
