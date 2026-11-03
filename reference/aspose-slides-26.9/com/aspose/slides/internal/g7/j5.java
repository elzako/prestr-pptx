package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.NotSupportedException;

public class j5 {
   public c4 n5;
   private w1 l6;
   private int k5 = 0;
   private k6 u3;
   private d0 a6 = new d0();
   private g9t u9;

   public j5(byte[] var1, g9t var2) {
      this(new w1(var1), var2);
   }

   public j5(w1 var1, g9t var2) {
      this(var1, var2, new c4());
   }

   public j5(w1 var1, g9t var2, c4 var3) {
      this.l6 = var1;
      this.u9 = var2;
      this.n5 = var3;
   }

   public j5(k6 var1, g9t var2, c4 var3) {
      this(new w1(((v2x)var1.k5()).t2), var2, var3);
      this.u3 = var1;
   }

   public final d0 n5() {
      return this.a6;
   }

   public final void l6() {
      try {
         this.k5 = this.l6.l6();

         while (this.k5 <= this.l6.k5()) {
            byte var1 = this.l6.n5(this.k5++);
            switch (var1) {
               case -123:
                  this.k7();
                  break;
               case -122:
               case -121:
               case -120:
               case -119:
               case -117:
               case -116:
               case -114:
               case -113:
               case -112:
               case -111:
               case -110:
               case -109:
               case -108:
               case -107:
               case -106:
               case -105:
               case -104:
               case -103:
               case -102:
               case -101:
               case -100:
               case -99:
               case -98:
               case -97:
               case -96:
               case -95:
               case -94:
               case -93:
               case -92:
               case -91:
               case -90:
               case -89:
               case -88:
               case -87:
               case -86:
               case -85:
               case -84:
               case -83:
               case -82:
               case -81:
               case 2:
               case 3:
               case 4:
               case 5:
               case 8:
               case 9:
               case 11:
               case 13:
               case 15:
               case 19:
               case 20:
               case 21:
               case 22:
               case 23:
               case 25:
               case 26:
               case 28:
               case 30:
               case 31:
               case 34:
               case 36:
               case 38:
               case 39:
               case 40:
               case 41:
               case 42:
               case 50:
               case 51:
               case 52:
               case 53:
               case 54:
               case 55:
               case 56:
               case 61:
               case 70:
               case 71:
               case 76:
               case 77:
               case 78:
               case 79:
               case 90:
               case 91:
               case 92:
               case 93:
               case 94:
               case 95:
               case 102:
               case 103:
               case 108:
               case 109:
               case 110:
               case 111:
               default:
                  String var2 = com.aspose.slides.ms.System.d1.n5(
                     "operаtion 0x{0:x} is not supported", new Object[]{com.aspose.slides.ms.System.s3.n5(j5$n5.class, var1)}
                  );
                  throw new NotSupportedException(var2);
               case -118:
                  this.f2();
                  break;
               case -115:
                  this.m1();
                  break;
               case -80:
                  this.n5(0);
                  break;
               case -79:
                  this.n5(1);
                  break;
               case -78:
                  this.n5(2);
                  break;
               case -77:
                  this.n5(3);
                  break;
               case -76:
                  this.n5(4);
                  break;
               case -75:
                  this.n5(5);
                  break;
               case -74:
                  this.n5(6);
                  break;
               case -73:
                  this.n5(7);
                  break;
               case -72:
                  this.l6(0);
                  break;
               case -71:
                  this.l6(1);
                  break;
               case -70:
                  this.l6(2);
                  break;
               case -69:
                  this.l6(3);
                  break;
               case -68:
                  this.l6(4);
                  break;
               case -67:
                  this.l6(5);
                  break;
               case -66:
                  this.l6(6);
                  break;
               case -65:
                  this.l6(7);
                  break;
               case -64:
                  this.t2(0);
                  break;
               case -63:
                  this.t2(1);
                  break;
               case -62:
                  this.t2(2);
                  break;
               case -61:
                  this.t2(3);
                  break;
               case -60:
                  this.t2(4);
                  break;
               case -59:
                  this.t2(5);
                  break;
               case -58:
                  this.t2(6);
                  break;
               case -57:
                  this.t2(7);
                  break;
               case -56:
                  this.t2(8);
                  break;
               case -55:
                  this.t2(9);
                  break;
               case -54:
                  this.t2(10);
                  break;
               case -53:
                  this.t2(11);
                  break;
               case -52:
                  this.t2(12);
                  break;
               case -51:
                  this.t2(13);
                  break;
               case -50:
                  this.t2(14);
                  break;
               case -49:
                  this.t2(15);
                  break;
               case -48:
                  this.t2(16);
                  break;
               case -47:
                  this.t2(17);
                  break;
               case -46:
                  this.t2(18);
                  break;
               case -45:
                  this.t2(19);
                  break;
               case -44:
                  this.t2(20);
                  break;
               case -43:
                  this.t2(21);
                  break;
               case -42:
                  this.t2(22);
                  break;
               case -41:
                  this.t2(23);
                  break;
               case -40:
                  this.t2(24);
                  break;
               case -39:
                  this.t2(25);
                  break;
               case -38:
                  this.t2(26);
                  break;
               case -37:
                  this.t2(27);
                  break;
               case -36:
                  this.t2(28);
                  break;
               case -35:
                  this.t2(29);
                  break;
               case -34:
                  this.t2(30);
                  break;
               case -33:
                  this.t2(31);
                  break;
               case -32:
                  this.c8(0);
                  break;
               case -31:
                  this.c8(1);
                  break;
               case -30:
                  this.c8(2);
                  break;
               case -29:
                  this.c8(3);
                  break;
               case -28:
                  this.c8(4);
                  break;
               case -27:
                  this.c8(5);
                  break;
               case -26:
                  this.c8(6);
                  break;
               case -25:
                  this.c8(7);
                  break;
               case -24:
                  this.c8(8);
                  break;
               case -23:
                  this.c8(9);
                  break;
               case -22:
                  this.c8(10);
                  break;
               case -21:
                  this.c8(11);
                  break;
               case -20:
                  this.c8(12);
                  break;
               case -19:
                  this.c8(13);
                  break;
               case -18:
                  this.c8(14);
                  break;
               case -17:
                  this.c8(15);
                  break;
               case -16:
                  this.c8(16);
                  break;
               case -15:
                  this.c8(17);
                  break;
               case -14:
                  this.c8(18);
                  break;
               case -13:
                  this.c8(19);
                  break;
               case -12:
                  this.c8(20);
                  break;
               case -11:
                  this.c8(21);
                  break;
               case -10:
                  this.c8(22);
                  break;
               case -9:
                  this.c8(23);
                  break;
               case -8:
                  this.c8(24);
                  break;
               case -7:
                  this.c8(25);
                  break;
               case -6:
                  this.c8(26);
                  break;
               case -5:
                  this.c8(27);
                  break;
               case -4:
                  this.c8(28);
                  break;
               case -3:
                  this.c8(29);
                  break;
               case -2:
                  this.c8(30);
                  break;
               case -1:
                  this.c8(31);
                  break;
               case 0:
                  this.u3(0);
                  break;
               case 1:
                  this.u3(1);
                  break;
               case 6:
                  this.a6(0);
                  break;
               case 7:
                  this.a6(1);
                  break;
               case 10:
                  this.a3();
                  break;
               case 12:
                  this.f0();
                  break;
               case 14:
                  this.p8();
                  break;
               case 16:
                  this.e5();
                  break;
               case 17:
                  this.b3();
                  break;
               case 18:
                  this.o0();
                  break;
               case 24:
                  this.t1();
                  break;
               case 27:
                  this.e2();
                  break;
               case 29:
                  this.w1();
                  break;
               case 32:
                  this.c4();
                  break;
               case 33:
                  this.a0();
                  break;
               case 35:
                  this.s3();
                  break;
               case 37:
                  this.u6();
                  break;
               case 43:
                  this.k5();
                  break;
               case 44:
                  this.z1();
                  break;
               case 45:
                  this.t4();
                  return;
               case 46:
                  this.h0(0);
                  break;
               case 47:
                  this.h0(1);
                  break;
               case 48:
                  this.u9(0);
                  break;
               case 49:
                  this.u9(1);
                  break;
               case 57:
                  this.v4();
                  break;
               case 58:
                  this.x8(0);
                  break;
               case 59:
                  this.x8(1);
                  break;
               case 60:
                  this.i1();
                  break;
               case 62:
                  this.s7(0);
                  break;
               case 63:
                  this.s7(1);
                  break;
               case 64:
                  this.q0();
                  break;
               case 65:
                  this.z3();
                  break;
               case 66:
                  this.u3();
                  break;
               case 67:
                  this.a6();
                  break;
               case 68:
                  this.d5();
                  break;
               case 69:
                  this.r4();
                  break;
               case 72:
                  this.z7();
                  break;
               case 73:
                  this.n3(0);
                  break;
               case 74:
                  this.n3(1);
                  break;
               case 75:
                  this.u9();
                  break;
               case 80:
                  this.h0();
                  break;
               case 81:
                  this.c8();
                  break;
               case 82:
                  this.t2();
                  break;
               case 83:
                  this.s7();
                  break;
               case 84:
                  this.x8();
                  break;
               case 85:
                  this.n3();
                  break;
               case 86:
                  this.y2();
                  break;
               case 87:
                  this.y1();
                  break;
               case 88:
                  this.y4();
                  break;
               case 89:
                  this.t9();
                  break;
               case 96:
                  this.a5();
                  break;
               case 97:
                  this.h2();
                  break;
               case 98:
                  this.m3();
                  break;
               case 99:
                  this.z8();
                  break;
               case 100:
                  this.v0();
                  break;
               case 101:
                  this.j5();
                  break;
               case 104:
                  this.k5(1);
                  break;
               case 105:
                  this.k5(2);
                  break;
               case 106:
                  this.k5(3);
                  break;
               case 107:
                  this.k5(4);
                  break;
               case 112:
                  this.d2();
            }
         }
      } catch (r4 var3) {
      }
   }

   private void k5() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      w1 var2 = this.u9.l6().t9().k5().n5(var1);
      if (var2 != null) {
         j5 var3 = new j5(var2, this.u9, this.n5);
         var3.l6();
      }
   }

   private void u3() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      this.n5.c8.set_Item(var2, var1);
   }

   private void a6() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      this.n5.h0.n5((double)((Integer)this.n5.c8.get_Item(var1)).intValue());
   }

   private void u9() {
      this.n5.h0.n5((double)((int)this.u9.l6().k5().l6() * 64));
   }

   private void h0() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      if (var2 < var1) {
         this.n5.h0.n5(1.0);
      } else {
         this.n5.h0.n5(0.0);
      }
   }

   private void c8() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      if (var2 <= var1) {
         this.n5.h0.n5(1.0);
      } else {
         this.n5.h0.n5(0.0);
      }
   }

   private void t2() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      if (var2 > var1) {
         this.n5.h0.n5(1.0);
      } else {
         this.n5.h0.n5(0.0);
      }
   }

   private void s7() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      if (var2 >= var1) {
         this.n5.h0.n5(1.0);
      } else {
         this.n5.h0.n5(0.0);
      }
   }

   private void x8() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      if (var2 == var1) {
         this.n5.h0.n5(1.0);
      } else {
         this.n5.h0.n5(0.0);
      }
   }

   private void n3() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      if (var2 != var1) {
         this.n5.h0.n5(1.0);
      } else {
         this.n5.h0.n5(0.0);
      }
   }

   private void y4() {
      int var1 = 0;
      byte var2 = 0;
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      if (var3 == 0) {
         var1++;
         boolean var4 = false;

         while (this.k5 <= this.l6.k5() && !var4) {
            byte[] var5 = new byte[]{var2};
            this.n5(this.l6, var5);
            var2 = var5[0];
            switch (var2) {
               case 27:
                  if (var1 == 1) {
                     var4 = true;
                  }
                  break;
               case 88:
                  var1++;
                  break;
               case 89:
                  if (--var1 == 0) {
                     var4 = true;
                  }
            }
         }
      }
   }

   private void e2() {
      int var1 = 0;
      byte var2 = 0;
      var1++;
      boolean var3 = false;

      while (this.k5 <= this.l6.k5() && !var3) {
         byte[] var4 = new byte[]{var2};
         this.n5(this.l6, var4);
         var2 = var4[0];
         switch (var2) {
            case 88:
               var1++;
               break;
            case 89:
               if (--var1 == 0) {
                  var3 = true;
               }
         }
      }
   }

   private void t9() {
   }

   private void z1() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var2 = this.k5;
      int var3 = var2;

      for (boolean var4 = false; this.k5 <= this.l6.k5() && !var4; var3 = this.k5) {
         byte var5 = 0;
         byte[] var6 = new byte[]{0};
         this.n5(this.l6, var6);
         var5 = var6[0];
         switch (var5) {
            case -119:
            case 44:
               throw new r4();
            case 45:
               this.n5().n5(var1, new w1(this.l6.n5(), var2, var3));
               var4 = true;
               break;
         }
      }
   }

   private void n5(w1 var1, byte[] var2) {
      var2[0] = var1.n5(this.k5++);
      switch (var2[0]) {
         case -80:
            this.k5++;
            return;
         case -79:
            this.k5 += 2;
            return;
         case -78:
            this.k5 += 3;
            return;
         case -77:
            this.k5 += 4;
            return;
         case -76:
            this.k5 += 5;
            return;
         case -75:
            this.k5 += 6;
            return;
         case -74:
            this.k5 += 7;
            return;
         case -73:
            this.k5 += 8;
            return;
         case -72:
            this.k5 += 2;
            return;
         case -71:
            this.k5 += 4;
            return;
         case -70:
            this.k5 += 6;
            return;
         case -69:
            this.k5 += 8;
            return;
         case -68:
            this.k5 += 10;
            return;
         case -67:
            this.k5 += 12;
            return;
         case -66:
            this.k5 += 14;
            return;
         case -65:
            this.k5 += 16;
            return;
         case 64:
            byte var4 = this.l6.n5(this.k5++);
            this.k5 += var4 & 255;
            return;
         case 65:
            byte var3 = this.l6.n5(this.k5++);
            this.k5 += (var3 & 255) * 2;
            return;
      }
   }

   private void t4() {
   }

   private void q0() {
      for (byte var1 = this.l6.n5(this.k5++); (var1 & 255) > 0 && this.k5 <= this.l6.k5(); var1--) {
         this.n5.h0.n5((double)(this.l6.n5(this.k5++) & 0xFF));
      }
   }

   private void z3() {
      for (byte var1 = this.l6.n5(this.k5++); (var1 & 255) > 0 && this.k5 <= this.l6.k5() - 2; var1 = (byte)((var1 & 255) - 1)) {
         this.n5.h0.n5((double)(((this.l6.n5(this.k5++) & 255) << 8) + (this.l6.n5(this.k5++) & 255)));
      }
   }

   private void n5(int var1) {
      for (int var2 = var1 + 1; var2 > 0 && this.k5 <= this.l6.k5(); var2--) {
         this.n5.h0.n5((double)(this.l6.n5(this.k5++) & 0xFF));
      }
   }

   private void l6(int var1) {
      for (int var2 = (var1 + 1) * 2; var2 > 0 && this.k5 <= this.l6.k5(); var2 -= 2) {
         this.n5.h0.n5((double)(((this.l6.n5(this.k5++) & 255) << 8) + (this.l6.n5(this.k5++) & 255)));
      }
   }

   private void m1() {
      this.n5.l6 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
   }

   private void k7() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var2 = var1 & 0xFF;
      if (var2 == 255) {
         this.n5.u3 = true;
      } else if (var2 == 0) {
         this.n5.u3 = false;
      }
   }

   private void m3() {
      double var1 = this.n5.h0.u3();
      double var3 = this.n5.h0.u3();
      this.n5.h0.n5(var3 / var1 * 64.0);
   }

   private void z8() {
      double var1 = this.n5.h0.u3();
      double var3 = this.n5.h0.u3();
      this.n5.h0.n5(var3 * var1 / 64.0);
   }

   private void j5() {
      double var1 = this.n5.h0.u3();
      this.n5.h0.n5(-var1);
   }

   private void w1() {
      this.n5.a6 = this.n5.h0.u3();
   }

   private void r4() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      this.n5.h0.n5(this.u9.l6().e2().n5(var1) * 64.0);
   }

   private void c4() {
      double var1 = this.n5.h0.u3();
      this.n5.h0.n5(var1);
      this.n5.h0.n5(var1);
   }

   private void y2() {
      double var1 = this.n5.h0.u3();
      int var3 = this.n5(var1 / 64.0, 0.0);
      if (var3 % 2 == 0) {
         this.n5.h0.n5(0.0);
      } else {
         this.n5.h0.n5(1.0);
      }
   }

   private void y1() {
      double var1 = this.n5.h0.u3();
      int var3 = this.n5(var1 / 64.0, 0.0);
      if (var3 % 2 == 0) {
         this.n5.h0.n5(1.0);
      } else {
         this.n5.h0.n5(0.0);
      }
   }

   private void a0() {
      this.n5.h0.u3();
   }

   private void d2() {
      double var1 = this.n5.h0.u3();
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      this.u9.l6().e2().n5(var3, com.aspose.slides.internal.v6g.k5.l6(var1, 14));
   }

   private void k5(int var1) {
      double var2 = this.n5.h0.u3();
      int var4 = this.n5(var2, this.n5.u9[var1]);
      this.n5.h0.n5((double)var4);
   }

   private void d5() {
      double var1 = this.n5.h0.u3();
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      this.u9.l6().e2().n5(var3, com.aspose.slides.internal.v6g.k5.l6(var1 / 64.0, 14));
   }

   private void s3() {
      double var1 = this.n5.h0.u3();
      double var3 = this.n5.h0.u3();
      this.n5.h0.n5(var1);
      this.n5.h0.n5(var3);
   }

   private void u3(int var1) {
      switch (var1) {
         case 0:
            this.n5.t2.n5(0.0, 1.0);
            this.n5.s7.n5(0.0, 1.0);
            this.n5.y4.n5(0.0, 1.0);
            this.n5.x8 = new l3e();
            this.n5.n3 = new l3e();
            break;
         case 1:
            this.n5.t2.n5(1.0, 0.0);
            this.n5.s7.n5(1.0, 0.0);
            this.n5.y4.n5(1.0, 0.0);
            this.n5.x8 = new a2p();
            this.n5.n3 = new a2p();
      }
   }

   private void a6(int var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      double var4 = this.n5.w1.l6().a6[var3] - this.n5.j5.l6().a6[var2];
      double var6 = this.n5.w1.l6().u9[var3] - this.n5.j5.l6().u9[var2];
      switch (var1) {
         case 0:
            this.n5.s7.n5(var4, var6);
            this.n5.y4.n5(var4, var6);
            this.n5.x8 = new l4w(this.n5.s7);
            break;
         case 1:
            var6 = -var4;
            var4 = var6;
            this.n5.s7.n5(var4, var6);
            this.n5.y4.n5(var4, var6);
            this.n5.x8 = new l4w(this.n5.s7);
      }
   }

   private void p8() {
      this.n5.t2.n5(this.n5.s7.n5(), this.n5.s7.l6());
      if (this.n5.t2.n5() != 0.0 && this.n5.t2.l6() != 0.0) {
         this.n5.n3 = new l4w(this.n5.t2);
      } else if (this.n5.t2.l6() != 0.0) {
         this.n5.n3 = new l3e();
      } else {
         this.n5.n3 = new a2p();
      }
   }

   private void f2() {
      double var1 = this.n5.h0.u3();
      double var3 = this.n5.h0.u3();
      double var5 = this.n5.h0.u3();
      this.n5.h0.n5(var3);
      this.n5.h0.n5(var1);
      this.n5.h0.n5(var5);
   }

   private void i1() {
      while (this.n5.k5 > 0) {
         int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
         double var2 = this.n5.x8.n5(this.n5.j5.l6().a6[var1] - this.n5.z8.l6().a6[this.n5.q0], this.n5.j5.l6().u9[var1] - this.n5.z8.l6().u9[this.n5.q0]);
         this.n5.n3.n5(this.n5.j5.l6(), var1, -var2);
         this.n5.k5--;
      }

      this.n5.k5 = 1;
   }

   private void e5() {
      this.n5.q0 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
   }

   private void b3() {
      this.n5.z3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
   }

   private void o0() {
      this.n5.m1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
   }

   private void z7() {
      double var1 = this.n5.h0.u3();
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      double var4 = this.n5.x8.n5(this.n5.w1.n5().a6[var3], this.n5.w1.n5().u9[var3]);
      this.n5.n3.n5(this.n5.w1.l6(), var3, var1 / 64.0 - var4);
   }

   private void v4() {
      while (this.n5.k5 > 0) {
         int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
         double var2 = this.n5.x8.n5(this.n5.w1.n5().a6[var1], this.n5.w1.n5().u9[var1]);
         double var4 = this.n5.x8.n5(this.n5.z8.n5().a6[this.n5.z3], this.n5.z8.n5().u9[this.n5.z3]);
         double var6 = this.n5.x8.n5(this.n5.j5.n5().a6[this.n5.m1], this.n5.j5.n5().u9[this.n5.m1]);
         double var8 = this.n5.x8.n5(this.n5.w1.l6().a6[var1], this.n5.w1.l6().u9[var1]);
         double var10 = this.n5.x8.n5(this.n5.z8.l6().a6[this.n5.z3], this.n5.z8.l6().u9[this.n5.z3]);
         double var12 = this.n5.x8.n5(this.n5.j5.l6().a6[this.n5.m1], this.n5.j5.l6().u9[this.n5.m1]);
         if (var4 != var6) {
            boolean var14 = com.aspose.slides.internal.v6g.k5.l6(this.n5.x8, a2p.class);
            double var15 = var6 - var4;
            double var17 = var12 - var10;
            double var19 = (var2 - var4) / var15;
            double var21 = (var6 - var2) / var15;
            double var23 = var10 + (var12 - var10) * var19;
            this.n5.n3.n5(this.n5.w1.l6(), var1, var23 - var8);
         }

         this.n5.k5--;
      }

      this.n5.k5 = 1;
   }

   private void u9(int var1) {
      v2x var2 = this.n5.w1.l6();
      v2x var3 = this.n5.w1.n5();
      boolean[] var4 = var1 == 1 ? var2.c8 : var2.h0;
      int var5 = 0;

      for (int var6 = 0; var6 < this.n5.w1.l6().n5; var6++) {
         int var7 = var2.l6[var6] & 65535;
         int var8 = 0;
         int var9 = -1;
         int var10 = var5;
         int var11 = -1;
         int var12 = -1;
         boolean var13 = true;

         do {
            int[] var14 = new int[]{var8};
            var13 = n5(var10, var7, var4, var14);
            var8 = var14[0];
            if (var13) {
               if (var11 == -1) {
                  var11 = var8;
               }

               var12 = var8;
               if (var9 != -1 && var8 - var9 - 1 > 0) {
                  n5(var1, var3, var2, var9, var8, var9 + 1, var8 - 1);
               }

               var9 = var8;
               var10 = var9 + 1;
            }
         } while (var13);

         if (var11 != -1 && var12 != -1) {
            if (var11 != var12) {
               if (var5 != var11) {
                  n5(var1, var3, var2, var11, var12, var5, var11 - 1);
               }

               if (var7 != var12) {
                  n5(var1, var3, var2, var11, var12, var12 + 1, var7);
               }
            } else {
               double var15 = var1 == 1 ? var3.a6[var9] : var3.u9[var9];
               double var17 = var1 == 1 ? var2.a6[var9] : var2.u9[var9];
               double var19 = var17 - var15;

               for (int var21 = var5; var21 <= var7; var21++) {
                  if (var21 != var9) {
                     switch (var1) {
                        case 0:
                           var2.u9[var21] = var2.u9[var21] + var19;
                           break;
                        case 1:
                           var2.a6[var21] = var2.a6[var21] + var19;
                     }
                  }
               }
            }
         }

         var5 = var7 + 1;
      }
   }

   private void h0(int var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      double var3 = 0.0;
      switch (var1) {
         case 1:
            var3 = this.n5.x8.n5(this.n5.z8.l6().a6[var2], this.n5.z8.l6().u9[var2]);
            var3 = this.n5(var3, this.n5.u9[0]) - var3;
         case 0:
         default:
            this.n5.n3.n5(this.n5.z8.l6(), var2, var3);
            this.n5.q0 = var2;
            this.n5.z3 = var2;
      }
   }

   private void c8(int var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      double var4 = this.u9.l6().e2().n5(var2);
      if (this.n5(var4)) {
         if (var4 >= 0.0) {
            var4 = this.n5.e2;
         } else {
            var4 = -this.n5.e2;
         }
      }

      double var6 = this.n5.x8.n5(this.n5.j5.l6().a6[var3] - this.n5.z8.l6().a6[this.n5.q0], this.n5.j5.l6().u9[var3] - this.n5.z8.l6().u9[this.n5.q0]);
      double var8 = this.n5.x8.n5(this.n5.j5.n5().a6[var3] - this.n5.z8.n5().a6[this.n5.q0], this.n5.j5.n5().u9[var3] - this.n5.z8.n5().u9[this.n5.q0]);
      if (this.n5.z1 && var8 != 0.0 && (var8 < 0.0 && var4 > 0.0 || var8 > 0.0 && var4 < 0.0)) {
         var4 = -var4;
      }

      double var10;
      if ((var1 & 4) != 0) {
         var10 = this.n5(var4, this.n5.u9[var1 & 3]);
      } else {
         var10 = l6(var4, this.n5.u9[var1 & 3]);
      }

      if ((var1 & 8) != 0) {
         if (var8 >= 0.0) {
            if (var10 < this.n5.t4) {
               var10 = this.n5.t4;
            }
         } else if (var10 > -this.n5.t4) {
            var10 = -this.n5.t4;
         }
      }

      this.n5.n3.n5(this.n5.j5.l6(), var3, var10 - var6);
      this.n5.z3 = this.n5.q0;
      if ((var1 & 16) != 0) {
         this.n5.q0 = var3;
      }

      this.n5.m1 = var3;
   }

   private void t2(int var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      double var3 = this.n5.x8.n5(this.n5.j5.n5().a6[var2] - this.n5.z8.n5().a6[this.n5.q0], this.n5.j5.n5().u9[var2] - this.n5.z8.n5().u9[this.n5.q0]);
      double[] var5 = new double[]{var3};
      this.n5(var5);
      var3 = var5[0];
      double var6;
      if ((var1 & 4) != 0) {
         var6 = this.n5(var3, this.n5.u9[var1 & 3]);
      } else {
         var6 = l6(var3, this.n5.u9[var1 & 3]);
      }

      if ((var1 & 8) != 0) {
         if (var3 >= 0.0) {
            if (var6 < this.n5.t4) {
               var6 = this.n5.t4;
            }
         } else if (var6 > -this.n5.t4) {
            var6 = -this.n5.t4;
         }
      }

      double var8 = this.n5.x8.n5(this.n5.j5.l6().a6[var2] - this.n5.z8.l6().a6[this.n5.q0], this.n5.j5.l6().u9[var2] - this.n5.z8.l6().u9[this.n5.q0]);
      this.n5.n3.n5(this.n5.j5.l6(), var2, var6 - var8);
      this.n5.z3 = this.n5.q0;
      this.n5.m1 = var2;
      if ((var1 & 16) != 0) {
         this.n5.q0 = var2;
      }
   }

   private void s7(int var1) {
      double var2 = this.n5.a6;
      int var4 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var5 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var6 = this.u9.l6().e2().n5(var4);
      double var7 = this.n5.x8.n5(this.n5.z8.l6().a6[var5], this.n5.z8.l6().u9[var5]);
      if (var1 == 1) {
         var6 = this.n5(var6, this.n5.u9[0]);
      }

      this.n5.n3.n5(this.n5.z8.l6(), var5, var6 - var7);
      this.n5.q0 = var5;
      this.n5.z3 = var5;
   }

   private void x8(int var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      double var4 = this.n5.x8.n5(this.n5.j5.l6().a6[var3] - this.n5.z8.l6().a6[this.n5.q0], this.n5.j5.l6().u9[var3] - this.n5.z8.l6().u9[this.n5.q0]);
      this.n5.n3.n5(this.n5.j5.l6(), var3, var2 / 64 - var4);
      this.n5.z3 = this.n5.q0;
      this.n5.m1 = var3;
      if ((var1 & 1) != 0) {
         this.n5.q0 = var3;
      }
   }

   private void u6() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      this.n5.h0.n5(this.n5.h0.n5(var1 - 1));
   }

   private void t1() {
      this.n5.n5 = 1;
   }

   private void a5() {
      double var1 = this.n5.h0.u3();
      double var3 = this.n5.h0.u3();
      this.n5.h0.n5(var3 + var1);
   }

   private void h2() {
      double var1 = this.n5.h0.u3();
      double var3 = this.n5.h0.u3();
      this.n5.h0.n5(var3 - var1);
   }

   private void v0() {
      double var1 = this.n5.h0.u3();
      this.n5.h0.n5(com.aspose.slides.ms.System.q1.n5(var1));
   }

   private void n3(int var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.h0.u3(), 14);
      double var4;
      switch (var1) {
         case 0:
            var4 = this.n5.x8.n5(this.n5.j5.l6().a6[var3] - this.n5.z8.l6().a6[var2], this.n5.j5.l6().u9[var3] - this.n5.z8.l6().u9[var2]);
            break;
         case 1:
         default:
            var4 = this.n5.x8.n5(this.n5.j5.n5().a6[var3] - this.n5.z8.n5().a6[var2], this.n5.j5.n5().u9[var3] - this.n5.z8.n5().u9[var2]);
      }

      this.n5.h0.n5(var4 * 64.0);
   }

   private void f0() {
      this.n5.h0.n5(this.n5.s7.n5());
      this.n5.h0.n5(this.n5.s7.l6());
   }

   private void a3() {
      double var1 = this.n5.h0.u3();
      double var3 = this.n5.h0.u3();
      this.n5.s7.n5(var3, var1);
      this.n5.y4.n5(var3, var1);
   }

   private static void n5(int var0, v2x var1, v2x var2, int var3, int var4, int var5, int var6) {
      double var7 = var0 == 1 ? var1.a6[var3] : var1.u9[var3];
      double var9 = var0 == 1 ? var1.a6[var4] : var1.u9[var4];
      double var11 = var0 == 1 ? var2.a6[var3] : var2.u9[var3];
      double var13 = var0 == 1 ? var2.a6[var4] : var2.u9[var4];

      for (int var15 = var5; var15 <= var6; var15++) {
         double var16 = var0 == 1 ? var1.a6[var15] : var1.u9[var15];
         double var18 = 0.0;
         if ((!(var9 > var7) || !(var16 > var7) || !(var16 < var9)) && (!(var9 < var7) || !(var16 > var9) || !(var16 < var7))) {
            double var27 = com.aspose.slides.ms.System.q1.n5(var16 - var7);
            double var28 = com.aspose.slides.ms.System.q1.n5(var9 - var16);
            double var29 = var27 < var28 ? var11 - var7 : var13 - var9;
            var18 = var16 + var29;
         } else {
            double var20 = var9 - var7;
            double var22 = (var16 - var7) / var20;
            double var24 = (var9 - var16) / var20;
            var18 = var11 + (var13 - var11) * var22;
         }

         switch (var0) {
            case 0:
               var2.u9[var15] = var18;
               break;
            case 1:
               var2.a6[var15] = var18;
         }
      }
   }

   private static boolean n5(int var0, int var1, boolean[] var2, int[] var3) {
      for (int var4 = var0; var4 <= var1; var4++) {
         if (var2[var4]) {
            var3[0] = var4;
            return true;
         }
      }

      var3[0] = -1;
      return false;
   }

   private void n5(double[] var1) {
      if (this.n5(var1[0])) {
         if (var1[0] >= 0.0) {
            var1[0] = this.n5.e2;
         } else {
            var1[0] = -this.n5.e2;
         }
      }
   }

   private boolean n5(double var1) {
      return com.aspose.slides.ms.System.q1.n5(var1 - this.n5.e2) < this.n5.t9;
   }

   private int n5(double var1, double var3) {
      switch (this.n5.n5) {
         case 1:
            return com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1 + var3), 14);
         default:
            return com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1), 14);
      }
   }

   private static double l6(double var0, double var2) {
      return com.aspose.slides.internal.v6g.k5.u3(var0, 14);
   }
}
