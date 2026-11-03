package com.aspose.slides.internal.l3e;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.p3;
import com.aspose.slides.internal.b7s.t4;
import com.aspose.slides.internal.b7s.v0;
import com.aspose.slides.internal.b7s.y0;
import com.aspose.slides.internal.b7s.z1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.g7;
import com.aspose.slides.internal.r1x.q0;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.t7p.e2;

public class a6 extends q0 {
   private short[][] n5;
   private y2 l6 = new y2();
   private z1 k5;
   private List<com.aspose.slides.internal.j8o.a6> u3 = new List<>();
   private List<y0> a6 = new List<>();
   private List<v3> u9 = new List<>();
   private List<v0> h0 = new List<>();

   public a6(y2 var1, com.aspose.slides.internal.g7e.n5 var2, y0 var3) {
      var1.u3(this.l6);
      this.n5(var2);
      this.t4();
      this.k5.n5(new v0(var3));
   }

   public final z1 n5() {
      return this.k5;
   }

   public final short[][] l6() {
      return this.n5;
   }

   public final void n5(y0 var1) {
      this.k5.n5 = 0;
      p3 var2 = this.k5.s7().get_Item(this.k5.n5);
      boolean var3 = var2.l6.length > 1;
      if (var3) {
         this.n5(new e2(this.k5));
      }

      short[][] var4 = this.t9();
      this.n5(var4);
      com.aspose.slides.internal.b7s.u3[] var5 = this.l6(var4);

      for (com.aspose.slides.internal.b7s.u3 var9 : var5) {
         this.k5.k5().set_Item(var9.n5, var9);
      }

      v0 var14 = this.h0.get_Item(this.k5.n5);
      if (this.k5.u9().a0() == 0 || this.k5.u9().a0() == 2) {
         for (com.aspose.slides.internal.b7s.u3 var10 : var5) {
            com.aspose.slides.internal.b7s.u3.n5(var14.n5(), new com.aspose.slides.internal.b7s.u3[]{var10});
         }
      }

      if (this.k5.u9().a0() == 0 || this.k5.u9().a0() == 1) {
         com.aspose.slides.internal.j8o.a6 var16 = this.u3.get_Item(this.k5.n5);
         var16.k5();
         y0 var18 = this.a6.get_Item(this.k5.n5);
         p3.n5(var18, this.n5().a6(), var2);
         if (!var3) {
            short[] var21 = var4[0];

            for (int var23 = 0; var23 < var21.length; var23++) {
               var16.l6(var21[var23]);
            }
         } else {
            int var20 = com.aspose.slides.internal.n5p.h0.n5(this.k5.a6().t2() & 65535, this.k5.a6().h0());
            int var22 = com.aspose.slides.internal.n5p.h0.n5(this.k5.a6().c8() & 65535, this.k5.a6().u3());

            for (int var11 = 0; var11 < var20; var11++) {
               for (int var12 = 0; var12 < var22; var12++) {
                  short[] var13 = this.n5(var12, var11, var4);
                  var16.l6(var13);
               }
            }
         }

         var16.u3();
      }

      this.z1();
   }

   final void n5(com.aspose.slides.internal.g7e.n5 var1) {
      new List();
      com.aspose.slides.internal.g7e.l6 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.g7e.l6.class);
      int var4 = var1.z1() == 4 && var1.n3() != null ? 1 : var1.z1();
      List var2;
      t4 var5;
      switch (var4) {
         case 0:
            var5 = new t4((byte)-61, x8());
            var2 = k5();
            break;
         case 1:
            if (var3 != null && var3.y1() != null) {
               var5 = new t4((byte)-61, var3.y1());
            } else {
               var5 = new t4((byte)-61, n3());
            }

            var2 = u3();
            break;
         case 2:
         case 3:
            var5 = new t4((byte)-61, e2());
            var2 = h0();
            break;
         case 4:
            var5 = new t4((byte)-61, y4());
            var2 = u9();
            break;
         default:
            throw new ArgumentOutOfRangeException("ColorType");
      }

      this.n5(var1, var5, var2);
   }

   final void n5(com.aspose.slides.internal.g7e.n5 var1, t4 var2, List<p3> var3) {
      this.k5 = new z1();
      this.k5
         .n5(
            com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.g7e.l6.class) != null
               ? com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.g7e.l6.class)
               : new com.aspose.slides.internal.g7e.l6(var1)
         );
      this.k5.n5(var2);
      this.k5.n5(var3);
      if (this.k5.s7().size() > 1) {
         throw new NotSupportedException("Only one scan is supported at the moment.");
      }

      this.q0();
      this.n5(this.k5.s7().size());

      for (int var4 = 0; var4 < this.k5.s7().size(); var4++) {
         v0 var5 = this.h0.get_Item(var4);
         this.u3.addItem(new com.aspose.slides.internal.j8o.a6(this.k5, var5));
      }

      this.k5.a6().n5(this.k5.u9().t4());
      this.k5.a6().u3(this.l6.t2() & 65535);
      this.k5.a6().a6(this.l6.l6() & 65535);

      for (n3 var7 : this.k5.a6().l6()) {
         if (this.k5.a6().u3() < (var7.u3() & 255)) {
            this.k5.a6().n5(var7.u3() & 255);
         }

         if (this.k5.a6().h0() < (var7.n3() & 255)) {
            this.k5.a6().k5(var7.n3() & 255);
         }
      }

      if (this.k5.a6().l6().length > 1) {
         this.k5.u3(com.aspose.slides.internal.n5p.h0.k5(this.k5.a6().c8() & 65535, this.k5.a6().u3()));
         this.k5.l6(com.aspose.slides.internal.n5p.h0.k5(this.k5.a6().t2() & 65535, this.k5.a6().h0()));
      } else {
         this.k5.u3(this.k5.a6().c8() & 65535);
         this.k5.l6(this.k5.a6().t2() & 65535);
      }
   }

   @Override
   protected void a6() {
      for (int var1 = 0; var1 < this.k5.s7().size(); var1++) {
         y0 var2 = this.a6.get_Item(var1);
         if (var2 != null && !var2.c8()) {
            var2.dispose();
            Object var5 = null;
         }

         v3 var3 = this.u9.get_Item(var1);
         if (var3 != null && !var3.c8()) {
            var3.dispose();
            Object var7 = null;
         }
      }

      int var4 = com.aspose.slides.ms.System.u3.n5(this.n5, 1, true).a6(0);

      for (int var6 = 0; var6 < var4; var6++) {
         this.n5[var6] = null;
      }

      this.h0.clear();
      this.a6.clear();
      this.u9.clear();
      this.u3.clear();
      this.h0 = null;
      this.u9 = null;
      this.a6 = null;
      this.n5 = (short[][])null;
      this.k5 = null;
      this.u3 = null;
      super.a6();
   }

   private static List<p3> k5() {
      p3 var0 = new p3();
      var0.l6 = new int[]{0};
      var0.u3 = 7;
      var0.k5 = 0;
      List var1 = new List();
      var1.addItem(var0);
      return var1;
   }

   private static List<p3> u3() {
      p3 var0 = new p3();
      var0.l6 = new int[]{0, 1, 2};
      var0.u3 = 7;
      var0.k5 = 0;
      List var1 = new List();
      var1.addItem(var0);
      return var1;
   }

   private static List<p3> u9() {
      p3 var0 = new p3();
      var0.l6 = new int[]{0, 1, 2};
      var0.u3 = 7;
      var0.k5 = 0;
      List var1 = new List();
      var1.addItem(var0);
      return var1;
   }

   private static List<p3> h0() {
      p3 var0 = new p3();
      var0.l6 = new int[]{0, 1, 2, 3};
      var0.u3 = 7;
      var0.k5 = 0;
      List var1 = new List();
      var1.addItem(var0);
      return var1;
   }

   private static n3[] x8() {
      return new n3[]{new n3((byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0)};
   }

   private static n3[] n3() {
      return new n3[]{
         new n3((byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0),
         new n3((byte)2, (byte)1, (byte)1, (byte)0, (byte)1, (byte)0),
         new n3((byte)3, (byte)1, (byte)1, (byte)0, (byte)2, (byte)0)
      };
   }

   private static n3[] y4() {
      return new n3[]{
         new n3((byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0),
         new n3((byte)2, (byte)1, (byte)1, (byte)0, (byte)1, (byte)0),
         new n3((byte)3, (byte)1, (byte)1, (byte)0, (byte)2, (byte)0)
      };
   }

   private static n3[] e2() {
      return new n3[]{
         new n3((byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0),
         new n3((byte)2, (byte)1, (byte)1, (byte)0, (byte)1, (byte)0),
         new n3((byte)3, (byte)1, (byte)1, (byte)0, (byte)2, (byte)0),
         new n3((byte)4, (byte)1, (byte)1, (byte)0, (byte)3, (byte)0)
      };
   }

   private short[][] t9() {
      p3 var1 = this.k5.s7().get_Item(this.k5.n5);
      int var2 = this.k5.x8();
      int var3 = this.k5.u3();
      short[][] var4 = new short[var1.l6.length][];

      for (int var5 = 0; var5 < var1.l6.length; var5++) {
         int var6 = var1.l6[var5];
         n3 var7 = this.k5.a6().l6()[var6];
         int var8 = this.k5.a6().u3() / (var7.u3() & 255);
         int var9 = this.k5.a6().h0() / (var7.n3() & 255);
         short[] var10 = new short[var2 / var8 * (var3 / var9)];
         short[] var11 = this.n5[var6];
         var4[var6] = var10;
         int var12 = 0;

         for (int var13 = 0; var12 < var3; var13++) {
            int var14 = var13 * (var2 / var8);
            int var15 = var12 * var2;
            int var16 = var15 - var9 * var2;
            int var17 = 0;

            for (int var18 = 0; var17 < var2; var18++) {
               short var19 = var11[var15 + var17];
               if (var17 == 0 && var12 == 0) {
                  short var25 = (short)(1 << (this.k5.a6().n5() & 255) - 1);
                  var10[0] = (short)(var19 - var25);
               } else {
                  int var21;
                  if (var17 > 0 && var12 == 0) {
                     var21 = 1;
                  } else if (var17 == 0 && var12 > 0) {
                     var21 = 2;
                  } else {
                     var21 = var1.u3 & 255;
                  }

                  short var20;
                  switch (var21) {
                     case 1:
                        short var29 = var11[var15 + (var17 - var8)];
                        var20 = var29;
                        break;
                     case 2:
                        short var33 = var11[var16 + var17];
                        var20 = var33;
                        break;
                     case 3:
                        short var36 = var11[var16 + (var17 - var8)];
                        var20 = var36;
                        break;
                     case 4:
                        short var28 = var11[var15 + (var17 - var8)];
                        short var32 = var11[var16 + var17];
                        short var35 = var11[var16 + (var17 - var8)];
                        var20 = (short)(var28 + var32 - var35);
                        break;
                     case 5:
                        short var27 = var11[var15 + (var17 - var8)];
                        short var31 = var11[var16 + var17];
                        short var34 = var11[var16 + (var17 - var8)];
                        var20 = (short)(var27 + (var31 - var34) / 2);
                        break;
                     case 6:
                        short var26 = var11[var15 + (var17 - var8)];
                        short var30 = var11[var16 + var17];
                        short var24 = var11[var16 + (var17 - var8)];
                        var20 = (short)(var30 + (var26 - var24) / 2);
                        break;
                     case 7:
                        short var22 = var11[var15 + (var17 - var8)];
                        short var23 = var11[var16 + var17];
                        var20 = (short)((var22 + var23) / 2);
                        break;
                     default:
                        throw new NotSupportedException("predictor");
                  }

                  var10[var14 + var18] = (short)(var19 - var20);
               }

               var17 += var8;
            }

            var12 += var9;
         }
      }

      return var4;
   }

   private void z1() {
      y0 var1 = this.k5.c8().n5();

      for (int var2 = 0; var2 < this.k5.s7().size(); var2++) {
         com.aspose.slides.internal.z0k.t4 var3 = this.a6.get_Item(var2).k5();
         var3.setPosition(0L);
         g7.n5(var3, var1);
      }
   }

   private short[] n5(int var1, int var2, short[][] var3) {
      short[] var4 = new short[this.k5.n5()];
      p3 var5 = this.k5.s7().get_Item(this.k5.n5);
      int var6 = this.k5.x8();
      int var7 = 0;

      for (int var8 = 0; var8 < var5.l6.length; var8++) {
         int var9 = var5.l6[var8];
         n3 var10 = this.k5.a6().l6()[var9];
         int var11 = var1 * var10.s7();
         int var12 = var2 * var10.t2();
         int var13 = var12 * (var6 * (var10.u3() & 255) / this.k5.a6().u3()) + var11;

         for (int var14 = 0; var14 < var10.t2(); var14++) {
            for (int var15 = 0; var15 < var10.s7(); var15++) {
               var4[var7++] = var3[var9][var13 + var15];
            }

            var13 += var6;
         }
      }

      return var4;
   }

   private void n5(e2 var1) {
      p3 var2 = this.k5.s7().get_Item(this.k5.n5);

      for (int var3 = 0; var3 < var2.l6.length; var3++) {
         int var4 = var2.l6[var3];
         n3 var5 = this.k5.a6().l6()[var4];
         short[] var6 = this.n5[var4];
         com.aspose.slides.internal.t7p.t2 var7 = var1.n5(var5.u9() & 255);

         for (int var8 = 0; var8 < this.k5.u3(); var8 += this.k5.a6().h0()) {
            for (int var9 = 0; var9 < this.k5.x8(); var9 += this.k5.a6().u3()) {
               var7.n5(var6, var9, var8);
            }
         }
      }
   }

   private void n5(short[][] var1) {
      p3 var2 = this.k5.s7().get_Item(this.k5.n5);
      if (var2.l6.length == 1) {
         this.k5.a6().l6(this.k5.a6().c8() & 65535);
         this.k5.k5(this.k5.a6().l6()[var2.l6[0]].n3() & 255);
         this.k5.a6().l6()[var2.l6[0]].h0(1);
         this.k5.a6().l6()[var2.l6[0]].u9(1);
         var2.n5(new int[1]);
         var2.k5()[0] = var2.l6[0];
         this.k5.n5(1);
      } else {
         this.k5.a6().l6(com.aspose.slides.internal.n5p.h0.n5(this.k5.a6().c8() & 65535, this.k5.a6().u3()));
         this.k5.k5(com.aspose.slides.internal.n5p.h0.n5(this.k5.a6().t2() & 65535, this.k5.a6().h0()));
         this.k5.n5(0);

         for (int var3 = 0; var3 < var2.l6.length; var3++) {
            n3 var4 = this.k5.a6().l6()[var2.l6[var3]];
            var4.h0(var4.u3() & 255);
            var4.u9(var4.n3() & 255);
            var4.a6(var4.t2() * var4.s7());
            int var5 = var4.c8();

            while (var5-- > 0) {
               int var6 = this.k5.n5();
               this.k5.n5(var6 + 1);
               var2.k5()[var6] = var2.l6[var3];
            }
         }
      }
   }

   private com.aspose.slides.internal.b7s.u3[] l6(short[][] var1) {
      com.aspose.slides.internal.j8o.a6 var2 = this.u3.get_Item(this.k5.n5);
      var2.n5();
      p3 var3 = this.k5.s7().get_Item(this.k5.n5);
      boolean var4 = this.k5.l6().l6.length > 1;
      if (var4) {
         int var5 = com.aspose.slides.internal.n5p.h0.n5(this.k5.a6().t2() & 65535, this.k5.a6().h0());
         int var6 = com.aspose.slides.internal.n5p.h0.n5(this.k5.a6().c8() & 65535, this.k5.a6().u3());

         for (int var7 = 0; var7 < var5; var7++) {
            for (int var8 = 0; var8 < var6; var8++) {
               short[] var9 = this.n5(var8, var7, var1);
               var2.n5(var9);
            }
         }
      } else {
         short[] var10 = var1[0];

         for (int var11 = 0; var11 < var10.length; var11++) {
            var2.n5(var10[var11]);
         }
      }

      return var2.l6();
   }

   private void t4() {
      int var1 = this.k5.a6().l6().length;
      this.n5 = new short[var1][];
      int var2 = this.k5.x8() * this.k5.u3();

      for (int var3 = 0; var3 < var1; var3++) {
         this.n5[var3] = new short[var2];
      }
   }

   private void q0() {
      this.k5.n5(new Dictionary<>());
      this.k5.k5().set_Item((byte)0, null);
      this.k5.k5().set_Item((byte)1, null);
      this.k5.k5().set_Item((byte)2, null);
      this.k5.k5().set_Item((byte)3, null);
   }

   private void n5(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         v3 var3 = com.aspose.slides.internal.r1x.c8.n5(0L);
         this.u9.addItem(var3);
         y0 var4 = new y0(var3.k5());
         this.a6.addItem(var4);
         v0 var5 = new v0(var4);
         this.h0.addItem(var5);
      }
   }
}
