package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class t4y {
   u1 n5;
   private w0l l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private static final Dictionary<Integer, Integer> t2 = new Dictionary<>(128);
   private w0l s7;
   private w0l x8;
   private char[] n3 = new char[128];
   private int y4;
   private static final com.aspose.slides.internal.v6g.u9 e2;

   public t4y(String var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(com.aspose.slides.internal.l7h.j5.z3().u3(var1));
      this.n5 = new u1(var2, false);
      this.l6();
   }

   private void l6() {
      this.u3 = -1;
      this.h0 = 1;
      this.u9 = 0;
      this.a6 = -1;
      this.c8 = 0;
      this.k5();
      if (this.k5 == 239) {
         this.k5();
         int var1 = this.k5;
         this.k5();
         int var2 = this.k5;
         if (var1 != 187 || var2 != 191) {
            throw new i4k(com.aspose.slides.ms.System.d1.n5("illegal byte order mark: EF {0,2:X} {1,2:X}",new Object[]{ var1, var2}));
         }

         this.n5 = new a6f(this.n5);
         this.u9 = 0;
         this.a6 = -1;
         this.k5();
      }

      w0l var3 = new w0l();
      this.s7 = var3;
      this.x8 = var3;
   }

   private void k5() {
      if (this.c8 > 0) {
         this.k5 = 10;
         this.c8--;
      } else {
         this.u3 = this.n5.u3();
         this.k5 = this.n5.l6();
         this.u9++;
         this.a6++;
         if (this.k5 == 13 && this.n5.k5() != 10) {
            this.k5 = 10;
         }

         if (this.k5 == 10) {
            this.h0++;
            this.u9 = 0;
         }
      }
   }

   private void u3() {
      if (this.y4 >= this.n3.length) {
         char[] var1 = new char[2 * this.n3.length];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, this.n3.length);
         this.n3 = var1;
      }

      if (this.k5 != 65536) {
         this.n3[this.y4++] = (char)this.k5;
         this.k5();
      }
   }

   private boolean a6() {
      int var1 = 1;
      int var2 = this.u3;
      int var3 = this.h0;
      int var4 = this.u9;
      int var5 = this.a6;
      this.k5();

      while (true) {
         while (this.k5 != 10) {
            if (this.k5 == 65536) {
               return false;
            }

            this.k5();
         }

         if (--var1 == 0) {
            this.c8 = this.h0 - var3;
            this.k5();
            return true;
         }

         this.k5();
      }
   }

   private w0l u9() {
      while (this.k5 == 32 || this.k5 >= 9 && this.k5 <= 10 || this.k5 == 13) {
         this.k5();
      }

      if (this.k5 == 59 && this.a6()) {
         return this.u9();
      }

      byte var1 = 10;
      int var2 = this.u3;
      this.l6 = new w0l();
      this.l6.l6 = this.u3;
      this.l6.u3 = this.u9;
      this.l6.a6 = this.h0;
      this.l6.k5 = this.a6;
      int var3;
      if (t2.containsKey(this.k5)) {
         var3 = t2.get_Item(this.k5);
      } else {
         var3 = 0;
      }

      this.y4 = 0;
      this.u3();
      switch (var3) {
         case -1:
            this.l6.n5 = 0;
            break;
         case 0:
            this.n5(var1, var2, this.l6);
            break;
         case 1:
            this.l6(var1, var2, this.l6);
            break;
         case 2:
            this.k5(var1, var2, this.l6);
            break;
         case 3:
            this.u3(var1, var2, this.l6);
            break;
         case 4:
            this.a6(var1, var2, this.l6);
            break;
         case 5:
            this.u9(var1, var2, this.l6);
            break;
         case 6:
            this.h0(var1, var2, this.l6);
            break;
         case 7:
            this.c8(var1, var2, this.l6);
            break;
         case 8:
            this.t2(var1, var2, this.l6);
            break;
         case 9:
            this.s7(var1, var2, this.l6);
            break;
         case 10:
            this.x8(var1, var2, this.l6);
            break;
         case 11:
            this.n3(var1, var2, this.l6);
            break;
         case 12:
            this.y4(var1, var2, this.l6);
            break;
         case 13:
            this.e2(var1, var2, this.l6);
            break;
         case 14:
            this.t9(var1, var2, this.l6);
            break;
         case 15:
            this.z1(var1, var2, this.l6);
            break;
         case 16:
            this.t4(var1, var2, this.l6);
            break;
         case 17:
            this.q0(var1, var2, this.l6);
            break;
         case 18:
            this.z3(var1, var2, this.l6);
            break;
         case 19:
            this.m1(var1, var2, this.l6);
            break;
         case 20:
            this.k7(var1, var2, this.l6);
            break;
         case 21:
            this.m3(var1, var2, this.l6);
            break;
         case 22:
            this.z8(var1, var2, this.l6);
            break;
         case 23:
            this.j5(var1, var2, this.l6);
            break;
         case 24:
            this.w1(var1, var2, this.l6);
            break;
         case 25:
            this.r4(var1, var2, this.l6);
            break;
         case 26:
            this.c4(var1, var2, this.l6);
            break;
         case 27:
            this.y2(var1, var2, this.l6);
            break;
         case 28:
            this.y1(var1, var2, this.l6);
            break;
         case 29:
            this.a0(var1, var2, this.l6);
            break;
         case 30:
            this.d2(var1, var2, this.l6);
            break;
         case 31:
            this.d5(var1, var2, this.l6);
            break;
         case 32:
            this.s3(var1, var2, this.l6);
            break;
         case 33:
            this.p8(var1, var2, this.l6);
            break;
         case 34:
            this.f2(var1, var2, this.l6);
      }

      this.l6.u9 = com.aspose.slides.ms.System.d1.n5(this.n3, 0, this.y4);
      return this.l6;
   }

   private void n5(int var1, int var2, w0l var3) {
      if (var1 != 10) {
         this.y4 = var2 - var3.l6;
         this.h0();
      }

      var3.n5 = var1;
   }

   private void l6(int var1, int var2, w0l var3) {
      int var4 = this.u3;
      byte var5 = 1;
      if ((this.k5 < 48 || this.k5 > 57) && (this.k5 < 65 || this.k5 > 90) && (this.k5 < 97 || this.k5 > 122) && this.k5 != 45) {
         var3.n5 = 1;
      } else {
         this.u3();
         this.l6(var5, var4, var3);
      }
   }

   private void k5(int var1, int var2, w0l var3) {
      if (this.k5 >= 48 && this.k5 <= 57) {
         this.u3();
         this.u3(var1, var2, var3);
      } else if (this.k5 == 45) {
         this.u3();
         this.k5(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void u3(int var1, int var2, w0l var3) {
      if (this.k5 >= 48 && this.k5 <= 57) {
         this.u3();
         this.u3(var1, var2, var3);
      } else if (this.k5 == 46) {
         this.u3();
         this.a6(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void a6(int var1, int var2, w0l var3) {
      int var4 = this.u3;
      byte var5 = 1;
      if ((this.k5 < 65 || this.k5 > 90) && (this.k5 < 97 || this.k5 > 122)) {
         if (this.k5 < 48 || this.k5 > 57) {
            var3.n5 = 1;
            return;
         }

         this.u3();
         this.h0(var5, var4, var3);
      } else {
         this.u3();
         this.l6(var5, var4, var3);
      }
   }

   private void u9(int var1, int var2, w0l var3) {
      int var4 = this.u3;
      byte var5 = 1;
      if ((this.k5 < 65 || this.k5 > 90) && (this.k5 < 97 || this.k5 > 122)) {
         if (this.k5 >= 48 && this.k5 <= 57) {
            this.u3();
            this.u9(var5, var4, var3);
         } else {
            if (this.k5 != 46) {
               var3.n5 = 1;
               return;
            }

            this.u3();
            this.a6(var5, var4, var3);
         }
      } else {
         this.u3();
         this.l6(var5, var4, var3);
      }
   }

   private void h0(int var1, int var2, w0l var3) {
      int var4 = this.u3;
      byte var5 = 1;
      if ((this.k5 < 65 || this.k5 > 90) && (this.k5 < 97 || this.k5 > 122)) {
         if (this.k5 < 48 || this.k5 > 57) {
            var3.n5 = 1;
            return;
         }

         this.u3();
         this.h0(var5, var4, var3);
      } else {
         this.u3();
         this.l6(var5, var4, var3);
      }
   }

   private void c8(int var1, int var2, w0l var3) {
      if (this.k5 == 111) {
         this.u3();
         this.t2(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void t2(int var1, int var2, w0l var3) {
      if (this.k5 == 116) {
         this.u3();
         this.s7(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void s7(int var1, int var2, w0l var3) {
      if (this.k5 == 97) {
         this.u3();
         this.x8(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void x8(int var1, int var2, w0l var3) {
      if (this.k5 == 116) {
         this.u3();
         this.n3(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void n3(int var1, int var2, w0l var3) {
      if (this.k5 == 101) {
         this.u3();
         this.y4(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void y4(int var1, int var2, w0l var3) {
      var3.n5 = 2;
   }

   private void e2(int var1, int var2, w0l var3) {
      if (this.k5 == 97) {
         this.u3();
         this.t9(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void t9(int var1, int var2, w0l var3) {
      if (this.k5 == 108) {
         this.u3();
         this.z1(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void z1(int var1, int var2, w0l var3) {
      if (this.k5 == 101) {
         this.u3();
         this.t4(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void t4(int var1, int var2, w0l var3) {
      var3.n5 = 3;
   }

   private void q0(int var1, int var2, w0l var3) {
      var3.n5 = 4;
   }

   private void z3(int var1, int var2, w0l var3) {
      var3.n5 = 5;
   }

   private void m1(int var1, int var2, w0l var3) {
      if (this.k5 == 114) {
         this.u3();
         this.k7(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void k7(int var1, int var2, w0l var3) {
      if (this.k5 == 97) {
         this.u3();
         this.m3(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void m3(int var1, int var2, w0l var3) {
      if (this.k5 == 110) {
         this.u3();
         this.z8(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void z8(int var1, int var2, w0l var3) {
      if (this.k5 == 115) {
         this.u3();
         this.j5(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void j5(int var1, int var2, w0l var3) {
      if (this.k5 == 108) {
         this.u3();
         this.w1(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void w1(int var1, int var2, w0l var3) {
      if (this.k5 == 97) {
         this.u3();
         this.r4(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void r4(int var1, int var2, w0l var3) {
      if (this.k5 == 116) {
         this.u3();
         this.c4(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void c4(int var1, int var2, w0l var3) {
      if (this.k5 == 101) {
         this.u3();
         this.y2(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void y2(int var1, int var2, w0l var3) {
      var3.n5 = 6;
   }

   private void y1(int var1, int var2, w0l var3) {
      var3.n5 = 7;
   }

   private void a0(int var1, int var2, w0l var3) {
      var3.n5 = 8;
   }

   private void d2(int var1, int var2, w0l var3) {
      var3.n5 = 9;
   }

   private void d5(int var1, int var2, w0l var3) {
      if (this.k5 == 99) {
         this.u3();
         this.e2(var1, var2, var3);
      } else if (this.k5 == 107) {
         this.u3();
         this.s3(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void s3(int var1, int var2, w0l var3) {
      if (this.k5 == 101) {
         this.u3();
         this.p8(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void p8(int var1, int var2, w0l var3) {
      if (this.k5 == 119) {
         this.u3();
         this.f2(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void f2(int var1, int var2, w0l var3) {
      if (this.k5 == 88) {
         this.u3();
         this.q0(var1, var2, var3);
      } else if (this.k5 == 89) {
         this.u3();
         this.z3(var1, var2, var3);
      } else {
         this.n5(var1, var2, var3);
      }
   }

   private void h0() {
      this.n5.n5(this.l6.l6);
      this.k5();
      this.h0 = this.l6.a6;
      this.u9 = this.l6.u3;
      this.a6 = this.l6.k5;

      for (int var1 = 0; var1 < this.y4; var1++) {
         this.k5();
      }
   }

   public final w0l n5() {
      if (this.s7.h0 == null) {
         return this.u9();
      }

      w0l var1 = this.s7.h0;
      this.s7 = var1;
      this.x8 = var1;
      return this.s7;
   }

   static {
      for (int var0 = 48; var0 <= 57; var0++) {
         t2.set_Item(var0, 5);
      }

      for (int var1 = 45; var1 <= 45; var1++) {
         t2.set_Item(var1, 2);
      }

      t2.set_Item(114, 7);
      t2.set_Item(115, 31);
      t2.set_Item(116, 19);
      t2.set_Item(40, 28);
      t2.set_Item(41, 29);
      t2.set_Item(44, 30);
      t2.set_Item(65536, -1);
      e2 = new com.aspose.slides.internal.v6g.u9("");
   }
}
