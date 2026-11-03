package com.aspose.slides.internal.l4o;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.a2w.a6;
import com.aspose.slides.internal.a2w.c8;
import com.aspose.slides.internal.a2w.h0;
import com.aspose.slides.internal.a2w.t2;
import com.aspose.slides.internal.a2w.u9;
import com.aspose.slides.internal.a2w.x8;
import com.aspose.slides.internal.j3b.u3;
import com.aspose.slides.internal.y5s.k7;
import com.aspose.slides.internal.y5s.m3;
import com.aspose.slides.internal.y5s.q0;
import com.aspose.slides.internal.y5s.r4;
import com.aspose.slides.internal.y5s.z8;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;

public class l6 extends k7 {
   private n5 n5;

   public l6(int var1, int var2) {
      this(var1, var2, 2);
   }

   public l6(int var1, int var2, int var3) {
      this.n5(var1, var2, var3);
   }

   @Override
   public int n3() {
      return com.aspose.slides.internal.v6g.k5.u3(this.k7().u9(), 10);
   }

   @Override
   public int t9() {
      return com.aspose.slides.internal.v6g.k5.u3(this.k7().y4(), 10);
   }

   @Override
   public boolean z3() {
      return this.n5.t9();
   }

   @Override
   public void n5(boolean var1) {
      this.n5.k5(var1);
   }

   @Override
   public boolean z1() {
      return this.n5.a6();
   }

   @Override
   public int t4() {
      return this.n5.n5();
   }

   n5 k7() {
      return this.n5;
   }

   public void n5(n5 var1) {
      this.n5 = var1;
      this.n5(this.n5.t2());
   }

   public static void n5(t4 var0, m3 var1, com.aspose.slides.internal.d7u.n5 var2) {
      var2.c8();
      n5 var3 = new n5(var2);
      var3.k5(var1.z3());
      if (var3.t9()) {
         var3.k5(0);
      }

      var3.n5(var1.z1());
      if (var3.a6()) {
         var3.n5(var1.t4());
      }

      var3.l6(com.aspose.slides.internal.v6g.k5.a6(var1.t9(), 9));
      var3.n5(com.aspose.slides.internal.v6g.k5.a6(var1.n3(), 9));
      k5 var4 = new k5(var0);
      byte[] var5 = com.aspose.slides.internal.o9i.l6.n5();
      var4.l6(var5, 0, var5.length);
      u9 var6 = new u9(var3);
      var6.n5(var4);
      if (var3.k5() == 3) {
         n5(var4, var3);
      }

      if (var3.e2()) {
         t2 var7 = new t2();
         double var8 = 39.3701;
         var7.n5(com.aspose.slides.internal.v6g.k5.u3(var3.h0() * 39.3701, 14));
         var7.l6(com.aspose.slides.internal.v6g.k5.u3(var3.n3() * 39.3701, 14));
         var7.k5(1);
         var7.n5(var4);
      }

      if (var3.t9() && (var3.k5() == 0 || var3.k5() == 2 || var3.k5() == 3)) {
         x8 var18 = new x8();
         byte[] var10 = null;
         int var11 = var3.x8();
         byte var12 = com.aspose.slides.internal.v6g.k5.n5((Object)(var11 >> 16 & 0xFF), 9);
         byte var13 = com.aspose.slides.internal.v6g.k5.n5((Object)(var11 >> 8 & 0xFF), 9);
         byte var14 = com.aspose.slides.internal.v6g.k5.n5((Object)(var11 & 0xFF), 9);
         if (var3.k5() == 0) {
            var10 = new byte[]{
               0,
               com.aspose.slides.internal.v6g.k5.n5(
                  (Object)((
                        com.aspose.slides.internal.v6g.k5.u3(var12, 6)
                           + com.aspose.slides.internal.v6g.k5.u3(var13, 6)
                           + com.aspose.slides.internal.v6g.k5.u3(var14, 6)
                     )
                     / 3),
                  9
               )
            };
         }

         if (var3.k5() == 2) {
            var10 = new byte[]{0, var12, 0, var13, 0, var14};
         }

         if (var3.k5() == 3) {
            if (var3.t2() == null) {
               var10 = new byte[]{(byte)var3.x8()};
            } else {
               u3 var15 = var3.t2();
               int[] var16 = var15.l6();
               var10 = new byte[var16.length];

               for (int var17 = 0; var17 < var16.length; var17++) {
                  var10[var17] = (byte)(var16[var17] >> 24 & 0xFF);
               }
            }
         }

         var18.n5(var10);
         var18.n5(var4);
      }

      if (var3.a6()) {
         com.aspose.slides.internal.a2w.n5 var19 = null;
         switch (var3.k5()) {
            case 0:
            case 4:
               a6 var22 = new a6();
               int var23 = var3.n5();
               var22.n5(com.aspose.slides.internal.v6g.k5.k5((var23 >> 16 & 255 + (var23 >> 8) & 255 + var23 & 0xFF) / 3, 9));
               var19 = var22;
               break;
            case 1:
            case 5:
            default:
               throw new ArgumentOutOfRangeException();
            case 2:
            case 6:
               com.aspose.slides.internal.a2w.l6 var24 = new com.aspose.slides.internal.a2w.l6();
               var24.n5(var3.n5());
               var19 = var24;
               break;
            case 3:
               h0 var25 = new h0();
               u3 var26 = var3.t2();
               if (var26 == null) {
                  throw new com.aspose.slides.internal.d9m.n5(d1.n5, new com.aspose.slides.internal.g9t.l6("You need to specify color palette."));
               }

               var25.n5(var26.n5(var3.n5()));
               var19 = var25;
         }

         var19.n5(var4);
      }

      n5(var4, var1, var3);
      com.aspose.slides.internal.a2w.u3 var21 = new com.aspose.slides.internal.a2w.u3();
      var21.n5(var4);
   }

   @Override
   protected void l6(t4 var1) {
      com.aspose.slides.internal.d7u.n5 var2 = new com.aspose.slides.internal.d7u.n5();
      var2.n5(this.k7().k5());
      if (this.k7().e2()) {
         var2.n5(new r4(this.k7().h0(), this.k7().n3()));
      }

      var2.n5(com.aspose.slides.internal.v6g.k5.u3(this.k7().c8(), 6) == 1);
      n5(var1, this, var2);
   }

   @Override
   protected void n5(int var1, int var2) {
      this.k7().n5(com.aspose.slides.internal.v6g.k5.a6(var2, 9));
      this.k7().l6(com.aspose.slides.internal.v6g.k5.a6(var1, 9));
   }

   private static void n5(k5 var0, n5 var1) {
      u3 var2 = var1.t2();
      if (var2 == null) {
         throw new com.aspose.slides.internal.d9m.n5(d1.n5, new com.aspose.slides.internal.g9t.l6("You need to specify color palette."));
      }

      c8 var3 = new c8(var2);
      var3.n5(var0);
   }

   private static void n5(k5 var0, m3 var1, n5 var2) {
      com.aspose.slides.internal.w3k.u3 var3 = new com.aspose.slides.internal.w3k.u3(var0, var2);
      if (var1.n5()) {
         z8 var4 = new z8();
         switch (var2.k5()) {
            case 0:
               var4.n5(q0.c8());
               break;
            case 1:
            case 5:
            default:
               throw new ArgumentOutOfRangeException();
            case 2:
               var4.n5(q0.s7());
               break;
            case 3:
               var4.n5(q0.k5());
               var4.n5(var2.t2());
               break;
            case 4:
               var4.n5(q0.x8());
               break;
            case 6:
               var4.n5(q0.t2());
         }

         var4.n5(var1.l6().k5());
         var4.n5(var1.l6().l6());
         var4.l6(var1.l6().u3());
         var4.k5(var1.t9() * var4.n5().h0() / 8);
         com.aspose.slides.internal.w3k.l6 var5 = new com.aspose.slides.internal.w3k.l6(var2, var3);
         var1.n5(var1.s7().n3(), var4, var5);
      } else {
         com.aspose.slides.internal.w3k.l6 var7 = new com.aspose.slides.internal.w3k.l6(var2, var3);
         com.aspose.slides.internal.b1r.u3 var6;
         switch (var2.k5()) {
            case 0:
               var6 = new com.aspose.slides.internal.b1r.l6(var7);
               break;
            case 1:
            case 5:
            default:
               throw new ArgumentOutOfRangeException();
            case 2:
               var6 = new com.aspose.slides.internal.b1r.u9(var7);
               break;
            case 3:
               var6 = new com.aspose.slides.internal.b1r.k5(var7, var2.t2());
               break;
            case 4:
               var6 = new com.aspose.slides.internal.b1r.n5(var7);
               break;
            case 6:
               var6 = new com.aspose.slides.internal.b1r.a6(var7);
         }

         var1.n5(var1.s7().n3(), var6);
      }

      var3.n5();
   }

   private void n5(int var1, int var2, int var3) {
      if (var2 <= 0) {
         throw new com.aspose.slides.internal.g9t.l6("The height should be positive.");
      }

      if (var1 <= 0) {
         throw new com.aspose.slides.internal.g9t.l6("The width should be positive.");
      }

      this.n5(new n5());
      this.k7().l6(var3);
      this.k7().n5(com.aspose.slides.internal.v6g.k5.a6(var2, 9));
      this.k7().l6(com.aspose.slides.internal.v6g.k5.a6(var1, 9));
      this.k7().n5((byte)8);
      this.l6(this.k7());
   }

   private void l6(n5 var1) {
      this.n5(var1);
   }
}
