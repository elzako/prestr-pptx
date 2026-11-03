package com.aspose.slides.internal.x4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;

public class e2 extends n3 {
   private z1 k5;

   @Override
   protected void n5() {
      com.aspose.slides.internal.z0k.t4 var1 = this.u3().n5();
      var1.setPosition(this.u3().k5());
      this.k5 = new z1(var1);

      while (var1.getPosition() < var1.getLength()) {
         int var2 = this.k5.m3();
         int var3 = this.k5.r4() & 65535;
         int var4 = (int)var1.getPosition();
         int var5 = var2 * 2 - 6;
         if (!this.n5(var3, var5)) {
            break;
         }

         int var6 = var4 + var5;
         if (var1.getPosition() != var6) {
            var1.setPosition(var6);
         }
      }
   }

   protected boolean n5(int var1, int var2) {
      switch (var1) {
         case 0:
            return false;
         case 30:
            this.l6();
         case 53:
         case 55:
         case 261:
         case 313:
         case 329:
         case 522:
         case 561:
         case 564:
         case 1049:
         case 1078:
         case 1352:
         case 3379:
         default:
            break;
         case 247:
            this.q0();
            break;
         case 258:
            this.a6(this.k5.k7());
            break;
         case 259:
            this.l6(this.k5.k7());
            break;
         case 260:
            this.r4();
            break;
         case 262:
            this.w1();
            break;
         case 263:
            this.x8();
            break;
         case 264:
            this.c4();
            break;
         case 295:
            this.k5();
            break;
         case 298:
            this.e2();
            break;
         case 299:
            this.t9();
            break;
         case 300:
            this.z7();
            break;
         case 301:
            this.k5(this.k5.r4() & 65535);
            break;
         case 302:
            this.u9(this.k5.r4() & 65535);
            break;
         case 322:
            this.j5();
            break;
         case 496:
            this.u3(this.k5.r4() & 65535);
            break;
         case 505:
            this.z8();
            break;
         case 513:
            this.n5(this.k5.u9());
            break;
         case 521:
            this.l6(this.k5.u9());
            break;
         case 523:
            this.l6(this.k5.n5().u3());
            break;
         case 524:
            this.k5(this.k5.l6().a6());
            break;
         case 525:
            this.k5(this.k5.n5().u3());
            break;
         case 526:
            this.a6(this.k5.l6().a6());
            break;
         case 527:
            this.z1();
            break;
         case 529:
            this.t4();
            break;
         case 531:
            this.a6(this.k5.n5().u3());
            break;
         case 532:
            w1 var3 = this.k5.n5().u3();
            this.u3(var3.u3());
            break;
         case 544:
            this.l6(this.k5.l6().a6());
            break;
         case 552:
            this.n3();
            break;
         case 762:
            this.m1();
            break;
         case 763:
            this.m3();
            break;
         case 764:
            this.k7();
            break;
         case 804:
            this.d2();
            break;
         case 805:
            this.a0();
            break;
         case 1040:
            this.k5(this.u9(this.a6().u9().c8().a6()).a6());
            break;
         case 1042:
            this.u3(this.u9(this.u9().c8().a6()).a6());
            break;
         case 1045:
            this.l6(this.k5.u3().y4());
            break;
         case 1046:
            this.n5(this.k5.u3().y4());
            break;
         case 1048:
            this.p8();
            break;
         case 1051:
            this.k5(this.k5.u3().y4());
            break;
         case 1055:
            this.y1();
            break;
         case 1065:
            this.y4();
            break;
         case 1313:
            this.y2();
            break;
         case 1336:
            this.d5();
            break;
         case 1564:
            this.e5();
            break;
         case 1565:
            this.o0();
            break;
         case 1574:
            this.b3();
            break;
         case 1791:
            this.z3();
            break;
         case 2071:
            this.s3();
            break;
         case 2074:
            this.f2();
            break;
         case 2096:
            this.i1();
            break;
         case 2368:
            this.y4(var2);
            break;
         case 2610:
            this.c8(var2);
            break;
         case 2881:
            this.x8(var2);
            break;
         case 3907:
            this.s7(var2);
      }

      return true;
   }

   private void x8() {
      int var1 = this.k5.r4() & 65535;
   }

   private void n3() {
      int var1 = this.k5.r4() & 65535;
      int var2 = this.k5.r4() & 65535;
      t4 var3 = (t4)this.c8().n5(var1);
      this.n5.n5(var3, null, this.a6().l6(var2));
   }

   private void y4() {
      int var1 = this.k5.r4() & 65535;
      int var2 = this.k5.r4() & 65535;
      this.k5.k7();
      short var3 = this.k5.k7();
      com.aspose.slides.internal.w0.s7 var4 = new com.aspose.slides.internal.w0.s7(this.a6().l6(var2), var3);
      t4 var5 = (t4)this.c8().n5(var1);
      this.n5.n5(var5, var4, null);
   }

   private void e2() {
      int var1 = this.k5.r4() & 65535;
      t4 var2 = (t4)this.c8().n5(var1);
      this.n5.n5(var2, new com.aspose.slides.internal.w0.s7(com.aspose.slides.internal.p1s.n5.c8), null);
   }

   private void t9() {
      int var1 = this.k5.r4() & 65535;
      t4 var2 = (t4)this.c8().n5(var1);
      this.n5.n5(var2, null, this.a6().k5());
   }

   private void z1() {
      w1 var1 = this.a6().u9().u9().u3();
      w1 var2 = this.k5.n5().u3();
      this.a6().n5(new w1(var1.l6() + var2.l6(), var1.k5() + var2.k5()));
      this.a6().t9();
   }

   private void t4() {
      w1 var1 = this.u9().u9().u3();
      w1 var2 = this.k5.n5().u3();
      this.n5(new w1(var1.l6() + var2.l6(), var1.k5() + var2.k5()));
      this.a6().t9();
   }

   private f2 u9(f2 var1) {
      short var2 = this.k5.k7();
      short var3 = this.k5.k7();
      short var4 = this.k5.k7();
      short var5 = this.k5.k7();
      if (var2 != 0 && var4 != 0) {
         return new f2(var1.l6() * var5 / var4, var1.k5() * var3 / var2);
      } else {
         throw new InvalidOperationException("Invalid scale values.");
      }
   }

   private void q0() {
      t2 var1 = new t2();
      this.n5(var1);
   }

   private void z3() {
      t4 var1 = new t4();
      var1.n5(this.k5);
      this.n5(var1);
   }

   private void m1() {
      t2 var1 = new t2();
      if (this.u3().u3()) {
         int var2 = com.aspose.slides.internal.v6g.k5.u3(this.u3().y4().l6().s7() / (this.s7().l6().l6() * 2.0F), 13);
         var1.n5(this.k5, var2);
      } else {
         var1.n5(this.k5, 1);
      }

      this.n5(var1);
   }

   private void k7() {
      a6 var1 = new a6();
      var1.n5(this.k5);
      this.n5(var1);
   }

   private void m3() {
      h0 var1 = new h0();
      var1.n5(this.k5);
      this.n5(var1);
   }

   private void z8() {
      a6 var1 = new a6();
      var1.l6(this.k5);
      this.n5(var1);
   }

   private void j5() {
      this.k5.m3();
      a6 var1 = new a6();
      var1.k5(this.k5);
      this.n5(var1);
   }

   private void w1() {
      this.a6().u9(this.k5.r4() & 65535);
   }

   private void r4() {
      this.a6().c8(this.k5.r4() & 65535);
      if (this.a6().n3() == 7) {
         this.l6 = true;
      }
   }

   private void c4() {
      short var1 = this.k5.k7();
      this.a6().s7(var1);
   }

   private void y2() {
      int var1 = this.k5.r4() & 65535;
      String var2 = this.t2(var1);
      if (com.aspose.slides.internal.n2d.t4.n5(this.k5.x8().getPosition())) {
         this.k5.x8().setPosition(this.k5.x8().getPosition() + 1L);
      }

      w1 var3 = this.k5.n5().u3();
      this.n5.n5(var3.u3(), var2);
   }

   private void c8(int var1) {
      w1 var2 = this.k5.n5().u3();
      int var3 = this.k5.r4() & 65535;
      int var4 = this.k5.r4() & 65535;
      y1 var5 = y1.n5.y4();
      if (var4 != 0) {
         this.k5.k5().a6(var5);
      }

      String var6 = "";
      if (var3 != 0) {
         var6 = this.t2(var3);
      } else if ((var4 & 2) != 0) {
         this.n5.k5(var5.y4());
      }

      int var7 = 8 + (var4 != 0 && y1.u3(var5, y1.n5) ? 8 : 0) + var3;
      if (var7 % 2 != 0) {
         this.k5.z1();
         var7++;
      }

      short[] var8 = null;
      if (var7 < var1) {
         if (var6.length() == var3) {
            var8 = new short[var3];

            for (int var9 = 0; var9 < var3; var9++) {
               var8[var9] = this.k5.k7();
            }
         } else if (var6.length() > var3 / 2) {
            var8 = new short[var6.length()];

            for (int var13 = 0; var13 < var8.length; var13++) {
               int var10 = com.aspose.slides.internal.r0.l6.n5((byte)this.a6().u3().h0(), this.a6().u3().k5().n5())
                  .n5(com.aspose.slides.ms.System.t9.q0(var6.charAt(var13)));
               short var11 = 0;

               for (int var12 = 0; var12 < var10; var12++) {
                  var11 += this.k5.k7();
               }

               var8[var13] = var11;
            }
         } else {
            var8 = new short[var3 / 2];

            for (int var14 = 0; var14 < var8.length; var14++) {
               var8[var14] = this.k5.k7();
               this.k5.k7();
            }
         }
      }

      if ((var4 & 128) != 0) {
         var6 = n5(var6);
         f2 var15 = this.a6().n5(var6).a6();
         var2.n5(var2.l6() - (var15.l6() - var5.s7()));
      }

      this.n5.n5(var2.u3(), var6, var8);
   }

   private String t2(int var1) {
      byte[] var2 = this.k5.c8(var1);
      if (this.a6().u3().h0() != 2 && !com.aspose.slides.internal.c8e.n5.n5(this.a6().u3().u9())) {
         j5 var9 = this.a6().u3().u3();
         return var9.l6(var2);
      }

      a5 var3 = new a5();

      for (byte var7 : var2) {
         char var8 = (char)(var7 & 0xFF & 0xFF);
         var3.n5(com.aspose.slides.internal.c8e.n5.k5(var8));
      }

      return var3.toString();
   }

   private void y1() {
      com.aspose.slides.internal.p1s.n5 var1 = this.k5.u9();
      w1 var2 = this.k5.n5().u3();
      this.n5.n5(var2.u3(), var1);
   }

   private void a0() {
      this.n5.n5(this.k5.h0());
   }

   private void d2() {
      this.n5.k5(this.k5.h0());
   }

   private void d5() {
      this.n5.l6(this.k5.c8());
   }

   private void s3() {
      w1 var1 = this.k5.n5().u3();
      w1 var2 = this.k5.n5().u3();
      y1 var3 = this.k5.u3().y4();
      this.n5.n5(var3.y4(), var1.u3(), var2.u3());
   }

   private void p8() {
      this.n5.u3(this.k5.u3().y4());
   }

   private void f2() {
      w1 var1 = this.k5.n5().u3();
      w1 var2 = this.k5.n5().u3();
      y1 var3 = this.k5.u3().y4();
      this.n5.l6(var3.y4(), var2.u3(), var1.u3());
   }

   private void i1() {
      w1 var1 = this.k5.n5().u3();
      w1 var2 = this.k5.n5().u3();
      y1 var3 = this.k5.u3().y4();
      this.n5.k5(var3.y4(), var2.u3(), var1.u3());
   }

   private void e5() {
      f2 var1 = this.k5.l6().a6();
      y1 var2 = this.k5.u3().y4();
      this.n5.n5(var2.y4(), var1.a6());
   }

   private void s7(int var1) {
      this.k5.r4();
      this.k5.r4();
      this.k5.r4();
      byte var2 = 22;
      this.n3(var1 - 22);
   }

   private void x8(int var1) {
      this.k5.r4();
      this.k5.r4();
      byte var2 = 20;
      this.n3(var1 - 20);
   }

   private void n3(int var1) {
      y1 var2 = this.k5.a6().y4();
      y1 var3 = this.k5.a6().y4();
      this.n5(var1, var2.y4(), var3.y4());
   }

   private void n5(int var1, y1 var2, y1 var3) {
      if (var1 > 0) {
         byte[] var4 = com.aspose.slides.internal.k4d.a6.n5(this.k5, var1);
         this.n5.n5(var2.y4(), var3.y4(), var4);
      }
   }

   private void y4(int var1) {
      byte var2 = 16;
      if (l6(var1, 2368)) {
         this.k5.m3();
         float var3 = this.k5.r4() & 65535;
         float var4 = this.k5.r4() & 65535;
         y1 var5 = this.k5.a6().y4();
         y1 var6 = new y1(var4, var3, var5.s7(), var5.k5());
         this.n5(var1 - 16, var6.y4(), var5.y4());
      } else {
         int var7 = this.k5.m3();
         this.k5.r4();
         this.k5.r4();
         this.k5.r4();
         y1 var8 = this.k5.a6().y4();
         switch (var7) {
            case 11141161:
            default:
               break;
            case 15728673:
               this.n5.l6(var8.y4());
         }
      }
   }

   private void b3() {
      this.k5.k7();
      this.k5.r4();
   }

   private void o0() {
      this.k5.m3();
      y1 var1 = this.k5.a6().y4();
      this.n5.l6(var1.y4());
   }

   private void z7() {
      int var1 = this.k5.r4() & 65535;
      l6 var2 = this.c8().n5(var1);
      t4 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, t4.class);
      if (var3 == null) {
         this.a6().n5(new a0(this.u9().y4()));
      } else {
         List var4 = var3.u3();
         if (var4.size() > 0) {
            this.a6().n5(new a0(((y1)var4.get_Item(0)).y4()));

            for (int var5 = 1; var5 < var4.size(); var5++) {
               this.a6().t4().k5(((y1)var4.get_Item(var5)).y4());
            }
         }
      }
   }

   private static boolean l6(int var0, int var1) {
      return (var0 + 6) / 2 != (var1 >> 8) + 3;
   }
}
