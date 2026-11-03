package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.BadImageFormatException;

class y8g {
   private j1 n5;
   private com.aspose.slides.internal.k0r.l8 l6;
   private PPImage k5;
   private int u3;
   private int a6 = -1;
   private long u9 = 0L;
   private byte[] h0 = null;

   y8g(com.aspose.slides.internal.k0r.l8 var1, int var2, int var3, j1 var4) {
      this.n5 = var4;
      this.a6 = var3;
      this.l6 = var1;
      this.k5 = this.t2();
      this.u3 = var2;
      this.c8();
   }

   y8g(PPImage var1, int var2, j1 var3) {
      this.n5 = var3;
      this.k5 = var1;
      this.l6 = null;
      this.u3 = var2;
      this.c8();
   }

   protected y8g(j1 var1) {
      this.n5 = var1;
      this.l6 = null;
      this.u3 = 2;
      this.c8();
   }

   final void n5(com.aspose.slides.internal.k0r.z5 var1) {
      var1.n5(this.u3() & 4294967295L);
      this.u9++;
   }

   final com.aspose.slides.internal.k0r.c6 n5(long var1) {
      com.aspose.slides.internal.k0r.c6 var3 = new com.aspose.slides.internal.k0r.c6();
      com.aspose.slides.internal.k0r.l8 var4 = this.l6();
      var3.w1().n5((byte)2);
      var3.w1().n5((short)var4.t2());
      var3.n5((byte)var4.t2());
      var3.l6((byte)var4.t2());
      var3.k5(var1);
      var3.n5((var4.n5() & 4294967295L) + 8L & 4294967295L);
      var3.n5(this.h0() & 255);
      var3.n5(var4.h0().n5());
      var3.l6(this.u9);
      this.n5.l6().k5().n5(var4);
      return var3;
   }

   final void n5(com.aspose.slides.internal.k0r.t2 var1) {
      var1.k5((short)this.u3());
      com.aspose.slides.internal.k0r.l8 var2 = this.l6();
      var1.n5(var2);
      var1.n5(var2.t2());
   }

   private void c8() {
      if (this.k5() != null && !this.n5.x8().containsKey(this.k5())) {
         this.n5.x8().addItem(this.k5(), this);
      }

      switch (this.u3) {
         case 0:
         case 2:
            if (this.a6 < 0) {
               this.a6 = this.n5.t2().size() + 1;
            }

            this.n5.t2().addItem(this.a6, this);
            break;
         case 1:
            if (this.a6 < 0) {
               this.a6 = this.n5.s7().size();
            }

            this.n5.s7().addItem(this.a6, this);
            break;
         default:
            throw new ArgumentOutOfRangeException("Illegal typeIndex for Image context.");
      }
   }

   private PPImage t2() {
      Presentation var1 = this.n5.n5();
      int var2 = 0;
      int var3 = 0;
      byte[] var4;
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6, com.aspose.slides.internal.k0r.s8.class)
         || com.aspose.slides.internal.v6g.k5.l6(this.l6, com.aspose.slides.internal.k0r.g1.class)) {
         var4 = this.l6.k5();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.l6, com.aspose.slides.internal.k0r.j8.class)) {
         var4 = this.l6.c8();
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(this.l6, com.aspose.slides.internal.k0r.s0.class)) {
            throw new ArgumentException();
         }

         com.aspose.slides.internal.k0r.s0 var5 = (com.aspose.slides.internal.k0r.s0)this.l6;
         if (this.l6.t2() == 3) {
            var4 = var5.u3();
         } else {
            var4 = this.l6.k5();
         }

         var2 = var5.a6();
         var3 = var5.u9();
      }

      if (!com.aspose.slides.internal.n8e.k7.k5(var4) && !com.aspose.slides.internal.n8e.k7.l6(var4)) {
         com.aspose.slides.internal.z0k.e2 var12 = new com.aspose.slides.internal.z0k.e2(var4);

         try {
            com.aspose.slides.internal.n8e.m1 var6 = new com.aspose.slides.internal.n8e.m1(var12);
            if (!var6.l6()) {
               com.aspose.slides.internal.o9b.t4 var7 = com.aspose.slides.internal.o9b.t4.n5(var12);
               if (var7 != null) {
                  var7.dispose();
               }
            }
         } finally {
            if (var12 != null) {
               var12.dispose();
            }
         }
      } else {
         com.aspose.slides.internal.o9b.y2 var11 = com.aspose.slides.internal.n8e.k7.s7(var4).n3();
         if (var11.t2() < 0 || var11.l6() < 0) {
            throw new BadImageFormatException();
         }
      }

      PPImage var13 = (PPImage)var1.getImages().addImage(var4);
      var13.u3().l6(var2);
      var13.u3().k5(var3);
      return var13;
   }

   com.aspose.slides.internal.k0r.l8 n5() {
      if (this.k5 == null) {
         return null;
      }

      com.aspose.slides.internal.k0r.l8 var1 = null;
      byte[] var2 = this.k5.getBinaryData();
      int var3 = com.aspose.slides.internal.k4d.a6.l6(var2);
      com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2(var2);

      try {
         Object var5 = null;
         com.aspose.slides.internal.y6.l6 var6 = null;
         switch (var3) {
            case 0:
               var1 = com.aspose.slides.internal.k0r.j8.n5(var4);
               break;
            case 1:
            case 2:
               var6 = com.aspose.slides.internal.y6.l6.n5(var4);
               var4.setPosition(0L);
               if (var6 != null) {
                  if (this.k5.u3().n5() != 0 && this.k5.u3().l6() != 0) {
                     var1 = com.aspose.slides.internal.k0r.s0.n5(var6, this.k5.u3().n5(), this.k5.u3().l6(), var4);
                  } else {
                     var1 = com.aspose.slides.internal.k0r.s0.n5(var6, var4);
                  }
               } else if (this.k5.u3().n5() != 0 && this.k5.u3().l6() != 0) {
                  var1 = com.aspose.slides.internal.k0r.s0.n5((com.aspose.slides.internal.j9e.y4)var5, this.k5.u3().n5(), this.k5.u3().l6(), var4);
               } else {
                  var1 = com.aspose.slides.internal.k0r.s0.n5((com.aspose.slides.internal.j9e.y4)var5, var4);
               }
               break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
               var1 = com.aspose.slides.internal.k0r.j8.n5(var4);
               break;
            case 8:
               var1 = com.aspose.slides.internal.k0r.j8.n5(var4, 17);
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      return var1;
   }

   final void n5(com.aspose.slides.internal.k0r.c6 var1) {
      this.h0 = var1.l6();
      c6q var2 = this.k5.u3();
      var2.n5(var1.l6());
      var2.n5(var1.k5());
   }

   final com.aspose.slides.internal.k0r.l8 l6() {
      if (this.l6 == null) {
         this.l6 = this.n5();
      }

      return this.l6;
   }

   final PPImage k5() {
      return this.k5;
   }

   final int u3() {
      return this.a6;
   }

   final byte[] a6() {
      if (this.h0 == null) {
         this.h0 = this.l6().h0().n5();
      }

      return this.h0;
   }

   final int u9() {
      return this.u3;
   }

   final byte h0() {
      com.aspose.slides.internal.k0r.j8 var1 = com.aspose.slides.internal.v6g.k5.n5(this.l6(), com.aspose.slides.internal.k0r.j8.class);
      return var1 != null ? var1.l6() : -1;
   }
}
