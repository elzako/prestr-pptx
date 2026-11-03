package com.aspose.slides.internal.x4;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.e1x.a5;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class y4 extends n3 {
   private int k5;
   private t9 u3;

   @Override
   protected void n5() {
      com.aspose.slides.internal.z0k.t4 var1 = this.u3().n5();
      var1.setPosition(this.u3().k5());
      this.u3 = new t9(var1);

      while (var1.getPosition() < var1.getLength()) {
         byte var2 = 8;
         if (var1.getPosition() + 8L > var1.getLength()) {
            break;
         }

         int var3 = (int)var1.getPosition();
         int var4 = this.u3.m3();
         int var5 = this.u3.m3();
         if (!this.c8(var4)) {
            break;
         }

         int var6 = var3 + var5;
         if (var1.getPosition() != var6) {
            var1.setPosition(var6);
         }
      }
   }

   private boolean c8(int var1) {
      switch (var1) {
         case 0:
            return false;
         case 1:
         case 13:
         case 16:
         case 23:
         case 41:
         case 48:
         case 50:
         case 51:
         case 52:
         case 53:
         case 57:
         case 58:
         case 65:
         case 66:
         case 68:
         case 69:
         case 70:
         case 78:
         case 79:
         case 80:
         case 99:
         case 100:
         case 101:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
         case 116:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 122:
         default:
            break;
         case 2:
            this.s7(0);
            break;
         case 3:
            this.n3(0);
            break;
         case 4:
            this.t2(0);
            break;
         case 5:
            this.s7(2);
            break;
         case 6:
            this.t2(2);
            break;
         case 7:
            this.x8(0);
            break;
         case 8:
            this.y4(0);
            break;
         case 9:
            this.k5(this.u3.k5().a6());
            break;
         case 10:
            this.l6(this.u3.l6().u3());
            break;
         case 11:
            this.a6(this.u3.k5().a6());
            break;
         case 12:
            this.k5(this.u3.l6().u3());
            break;
         case 14:
            return false;
         case 15:
            this.o0();
            break;
         case 17:
            this.l6(this.u3.m3());
            break;
         case 18:
            this.a6(this.u3.m3());
            break;
         case 19:
            this.d5();
            break;
         case 20:
            this.s3();
            break;
         case 21:
            this.e2();
            break;
         case 22:
            this.u9(this.u3.m3());
            break;
         case 24:
            this.l6(this.u3.a6());
            break;
         case 25:
            this.n5(this.u3.a6());
            break;
         case 26:
            this.l6(this.u3.k5().a6());
            break;
         case 27:
            this.u3(this.u3.l6().u3());
            break;
         case 28:
            this.d2();
            break;
         case 29:
            this.l6(this.u3.u3().y4());
            break;
         case 30:
            this.n5(this.u3.u3().y4());
            break;
         case 31:
            this.u3(this.u9(this.u9().c8().a6()).a6());
            break;
         case 32:
            this.k5(this.u9(this.a6().u9().c8().a6()).a6());
            break;
         case 33:
            this.l6();
            this.k5++;
            break;
         case 34:
            this.k5--;
            this.k5();
            break;
         case 35:
            this.z1();
            break;
         case 36:
            this.t9();
            break;
         case 37:
            this.k5(this.u3.m3());
            break;
         case 38:
            this.f0();
            break;
         case 39:
            this.t1();
            break;
         case 40:
            this.u3(this.u3.m3());
            break;
         case 42:
            this.z7();
            break;
         case 43:
            this.k5(this.u3.u3().y4());
            break;
         case 44:
            this.b3();
            break;
         case 45:
            this.t9(0);
            break;
         case 46:
            this.v4();
            break;
         case 47:
            this.u6();
            break;
         case 49:
            this.p3();
            break;
         case 54:
            this.a6(this.u3.l6().u3());
            break;
         case 55:
            this.t9(2);
            break;
         case 56:
            this.e2(0);
            break;
         case 59:
            this.t4();
            break;
         case 60:
            this.q0();
            break;
         case 61:
            this.z3();
            break;
         case 62:
            this.m1();
            break;
         case 63:
            this.m3();
            break;
         case 64:
            this.k7();
            break;
         case 67:
            this.a0();
            break;
         case 71:
            this.j5();
            break;
         case 72:
            this.w1();
            break;
         case 73:
            this.r4();
            break;
         case 74:
            this.c4();
            break;
         case 75:
            this.y1();
            break;
         case 76:
            this.y4();
            break;
         case 77:
            this.n3();
            break;
         case 81:
            this.x8();
            break;
         case 82:
            this.v0();
            break;
         case 83:
            this.p8();
            break;
         case 84:
            this.f2();
            break;
         case 85:
            this.s7(1);
            break;
         case 86:
            this.n3(1);
            break;
         case 87:
            this.t2(1);
            break;
         case 88:
            this.s7(3);
            break;
         case 89:
            this.t2(3);
            break;
         case 90:
            this.x8(1);
            break;
         case 91:
            this.y4(1);
            break;
         case 92:
            this.e2(1);
            break;
         case 93:
            this.h2();
            break;
         case 94:
            this.a5();
            break;
         case 95:
            this.a3();
            break;
         case 96:
            this.e5();
            break;
         case 97:
            this.i1();
            break;
         case 98:
            this.z8();
      }

      return true;
   }

   private void x8() {
      this.u3.u3();
      int var1 = this.u3.m3();
      int var2 = this.u3.m3();
      int var3 = this.u3.m3();
      int var4 = this.u3.m3();
      int var5 = this.u3.m3();
      int var6 = this.u3.m3();
      this.u3.m3();
      int var7 = this.u3.m3();
      this.u3.m3();
      int var8 = this.u3.m3();
      this.u3.m3();
      this.u3.m3();
      int var9 = this.u3.m3();
      int var10 = this.u3.m3();
      y1 var11 = new y1(var1, var2, var9, var10);
      if (var8 == 0) {
         this.n5.l6(var11.y4());
      } else {
         byte[] var12 = com.aspose.slides.internal.k4d.a6.n5(this.u3, var7, var8);
         y1 var13 = new y1(var3, var4, var5, var6);
         this.n5.n5(var13.y4(), var11.y4(), var12);
      }
   }

   private void n3() {
      this.u3.u3();
      int var1 = this.u3.m3();
      int var2 = this.u3.m3();
      int var3 = this.u3.m3();
      int var4 = this.u3.m3();
      int var5 = this.u3.m3();
      int var6 = this.u3.m3();
      int var7 = this.u3.m3();
      com.aspose.slides.internal.w0.c8 var8 = this.u3.s7();
      com.aspose.slides.internal.p1s.n5 var9 = this.u3.a6();
      this.u3.m3();
      this.u3.m3();
      int var10 = this.u3.m3();
      this.u3.m3();
      int var11 = this.u3.m3();
      y1 var12 = new y1(var1, var2, var3, var4);
      if (var11 == 0) {
         switch (var5) {
            case 5898313:
               this.l6 = true;
               break;
            case 13369376:
            case 15728673:
               this.n5.l6(var12.y4());
         }
      } else {
         int var13 = this.u3.m3();
         int var14 = this.u3.m3();
         byte[] var15 = com.aspose.slides.internal.k4d.a6.n5(this.u3, var10, var11);
         if (var15.length != 0) {
            y1 var16 = new y1(var6, var7, var13, var14);
            this.n5.n5(var16.y4(), var12.y4(), var8, var9, var5, var15);
         }
      }
   }

   private void y4() {
      this.n3();
   }

   private void e2() {
      this.a6().t2(this.u3.m3());
   }

   private void t9() {
      com.aspose.slides.internal.w0.c8 var1 = this.u3.s7();
      int var2 = this.u3.m3();
      this.a6().n5(var1, var2);
      this.n5.u9();
   }

   private void z1() {
      com.aspose.slides.internal.w0.c8 var1 = this.u3.s7();
      this.a6().n5(var1);
      this.n5.u9();
   }

   private void t4() {
      this.n5.u3();
   }

   private void q0() {
      this.n5.a6();
   }

   private void z3() {
      this.n5.k5();
   }

   private void m1() {
      this.n5.h0();
   }

   private void k7() {
      this.n5.c8();
   }

   private void m3() {
      this.n5.t2();
   }

   private void z8() {
      this.a6().h0(this.u3.m3());
   }

   private void j5() {
      this.u3.u3();
      this.u3.m3();
      int var1 = this.u3.m3();
      t4 var2 = this.y2();
      this.n5.n5(var2, null, this.a6().l6(var1));
   }

   private void w1() {
      this.u3.u3();
      this.u3.m3();
      int var1 = this.u3.m3();
      int var2 = this.u3.m3();
      this.u3.m3();
      com.aspose.slides.internal.w0.s7 var3 = new com.aspose.slides.internal.w0.s7(this.a6().l6(var1), var2);
      t4 var4 = this.y2();
      this.n5.n5(var4, var3, null);
   }

   private void r4() {
      this.u3.u3();
      this.u3.m3();
      t4 var1 = this.y2();
      this.n5.n5(var1, new com.aspose.slides.internal.w0.s7(com.aspose.slides.internal.p1s.n5.c8), null);
   }

   private void c4() {
      this.u3.u3();
      this.u3.m3();
      t4 var1 = this.y2();
      this.n5.n5(var1, null, this.a6().k5());
   }

   private t4 y2() {
      t4 var1 = new t4();
      var1.n5(this.u3);
      return var1;
   }

   private void y1() {
      this.n5.x8();
      int var1 = this.u3.m3();
      int var2 = this.u3.m3();
      if (var2 != 5) {
         a0 var3 = com.aspose.slides.internal.j7.x8.n5(this.u3);

         try {
            switch (var2) {
               case 1:
                  this.a6().t4().k5(var3);
                  break;
               case 2:
                  this.a6().t4().u3(var3);
                  break;
               case 3:
                  this.a6().t4().a6(var3);
                  break;
               case 4:
                  this.a6().t4().n5(var3);
                  break;
               case 5:
                  this.a6().n5(var3);
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } else if (var1 == 0) {
         this.a6().n5((a0)null);
      } else {
         this.a6().n5(com.aspose.slides.internal.j7.x8.n5(this.u3));
      }
   }

   private void a0() {
      int var1 = this.u3.m3();
      this.n5.l6(var1);
   }

   private void d2() {
      this.a6().n5((a0)null);
   }

   private void d5() {
      this.a6().u9(this.u3.m3());
      this.n5.n5(this.a6().x8());
   }

   private void s3() {
      this.a6().c8((int)this.u3.c4());
      this.n5.k5(this.a6().n3());
   }

   private f2 u9(f2 var1) {
      int var2 = this.u3.m3();
      int var3 = this.u3.m3();
      int var4 = this.u3.m3();
      int var5 = this.u3.m3();
      if (var2 != 0 && var4 != 0) {
         return new f2(var1.l6() * var5 / var4, var1.k5() * var3 / var2);
      } else {
         throw new InvalidOperationException("Invalid scale values.");
      }
   }

   private void p8() {
      this.f2();
   }

   private void u3(y1 var1) {
      w1 var2 = this.u3.l6().u3();
      int var3 = this.u3.m3();
      if (var3 != 0) {
         this.u3.m3();
         int var4 = this.u3.m3();
         this.u3.u3();
         this.u3.m3();
         String var6;
         if ((var4 & 16) != 0) {
            int[] var5 = this.u3.l6(var3);
            var6 = this.n5(var5);
         } else {
            var6 = this.u3.k5(var3);
         }

         if ((var4 & 128) != 0) {
            var6 = n5(var6);
            f2 var7 = this.a6().n5(var6).a6();
            var2.n5(var2.l6() - (var7.l6() - var1.s7()));
         }

         this.n5.n5(var2.u3(), var6, null);
      }
   }

   private String n5(int[] var1) {
      if (this.a6().a6() != null && this.a6().a6().n5() != null && this.a6().a6().n5().h0() != null) {
         a5 var2 = this.a6().a6().n5().h0();
         com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5(var1.length);

         for (int var7 : var1) {
            var3.n5((char)var2.k5(var7).n5());
         }

         return var3.toString();
      } else {
         return d1.n5;
      }
   }

   private void f2() {
      y1 var1 = this.u3.u3().y4();
      this.u3.m3();
      this.u3.w1();
      this.u3.w1();
      this.u3(var1.y4());
   }

   private void i1() {
      this.e5();
   }

   private void e5() {
      y1 var1 = this.u3.u3().y4();
      this.u3.m3();
      this.u3.w1();
      this.u3.w1();
      int var2 = this.u3.m3();

      for (int var3 = 0; var3 < var2; var3++) {
         this.u3(var1.y4());
      }
   }

   private void b3() {
      y1 var1 = this.u3.u3().y4();
      f2 var2 = this.u3.k5().a6();
      this.n5.n5(var1.y4(), var2.a6());
   }

   private void o0() {
      w1 var1 = this.u3.l6().u3();
      com.aspose.slides.internal.p1s.n5 var2 = this.u3.a6();
      this.n5.n5(var1.u3(), var2);
   }

   private w1[] n5(w1[] var1) {
      w1[] var2 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), var1.length + 1));
      this.h0().n5(var2[0]);
      com.aspose.slides.ms.System.u3.n5((Object)(var1)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 1);
      return var2;
   }

   private void t2(int var1) {
      this.u3.u3();
      w1[] var2;
      if (z1(var1)) {
         var2 = this.u3.h0();
      } else {
         var2 = this.u3.u9();
      }

      if (var2.length >= 1) {
         if (t4(var1)) {
            var2 = this.n5(var2);
            this.n5.n5(var2);
            this.u9(var2[var2.length - 1].u3());
         } else {
            this.n5.n5(var2);
         }
      }
   }

   private void s7(int var1) {
      this.u3.u3();
      w1[] var2;
      if (z1(var1)) {
         var2 = this.u3.h0();
      } else {
         var2 = this.u3.u9();
      }

      if (var2.length >= 1) {
         if (t4(var1)) {
            var2 = this.n5(var2);
            this.n5.l6(var2);
            this.u9(var2[var2.length - 1].u3());
         } else {
            this.n5.l6(var2);
         }
      }
   }

   private void x8(int var1) {
      this.u3.u3();
      w1[][] var2 = z1(var1) ? this.u3.t2() : this.u3.c8();
      this.n5.n5(var2);
   }

   private void n3(int var1) {
      this.u3.u3();
      w1[] var2 = z1(var1) ? this.u3.h0() : this.u3.u9();
      this.n5.k5(var2);
   }

   private void y4(int var1) {
      this.u3.u3();
      if (z1(var1)) {
         this.n5.l6(this.u3.t2());
      } else {
         this.n5.l6(this.u3.c8());
      }
   }

   private void e2(int var1) {
      this.u3.u3();
      int var2 = this.u3.m3();
      w1[] var3;
      if (z1(var1)) {
         var3 = this.u3.a6(var2);
      } else {
         var3 = this.u3.u3(var2);
      }

      int[] var4 = this.u3.u9(var2);
      int var5 = 0;

      do {
         if ((var4[var5] & 6) == 6) {
            this.u9(var3[var5].u3());
            var5++;
         }

         if ((var4[var5] & 2) == 2) {
            this.n5.n5(var3[var5].u3());
            this.u9(var3[var5].u3());
            if ((var4[var5] & 1) == 1) {
               break;
            }

            var5++;
         }

         if ((var4[var5] & 4) == 4) {
            w1[] var6 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 4));
            this.h0().n5(var6[0]);
            var3[++var5].n5(var6[1]);
            var3[++var5].n5(var6[2]);
            var3[++var5].n5(var6[3]);
            this.n5.l6(var6);
            this.u9(var3[var5].u3());
            if ((var4[var5] & 1) == 1) {
               break;
            }
         }
      } while (var5 < var2);
   }

   private void t9(int var1) {
      y1 var2 = this.u3.u3().y4();
      w1 var3 = this.u3.l6().u3();
      w1 var4 = this.u3.l6().u3();
      this.n5.n5(var2.y4(), var3.u3(), var4.u3());
      if ((var1 & 2) == 2) {
         this.u9(var4.u3());
      }
   }

   private void z7() {
      y1 var1 = this.u3.u3().y4();
      var1 = new y1(var1.x8(), var1.n3(), q1.n5(var1.s7()), q1.n5(var1.k5()));
      this.n5.u3(var1.y4());
   }

   private void v4() {
      y1 var1 = this.u3.u3().y4();
      w1 var2 = this.u3.l6().u3();
      w1 var3 = this.u3.l6().u3();
      this.n5.k5(var1.y4(), var2.u3(), var3.u3());
   }

   private void u6() {
      y1 var1 = this.u3.u3().y4();
      w1 var2 = this.u3.l6().u3();
      w1 var3 = this.u3.l6().u3();
      this.n5.l6(var1.y4(), var2.u3(), var3.u3());
   }

   private void t1() {
      a6 var1 = new a6();
      var1.n5(this.u3);
      this.n5(var1);
   }

   private void a5() {
      a6 var1 = new a6();
      var1.l6(this.u3);
      this.n5(var1);
   }

   private void h2() {
      this.a5();
   }

   private void v0() {
      h0 var1 = new h0();
      var1.n5(this.u3);
      this.n5(var1);
   }

   private void f0() {
      t2 var1 = new t2();
      var1.n5(this.u3);
      this.n5(var1);
   }

   private void a3() {
      t2 var1 = new t2();
      var1.l6(this.u3);
      this.n5(var1);
   }

   private void p3() {
      c8 var1 = new c8();
      var1.n5(this.u3);
      this.n5(var1);
   }

   private static boolean z1(int var0) {
      return (var0 & 1) == 1;
   }

   private static boolean t4(int var0) {
      return (var0 & 2) == 2;
   }
}
