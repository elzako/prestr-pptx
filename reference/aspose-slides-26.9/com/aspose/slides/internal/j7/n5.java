package com.aspose.slides.internal.j7;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x9;

public class n5 implements IDisposable {
   private boolean c8 = false;
   public static final n5$l6 n5 = new n5$1();
   public static final n5$l6 l6 = new n5$2();
   public static final n5$l6 k5 = new n5$3();
   public static final n5$n5 u3 = new n5$4();
   protected com.aspose.slides.internal.o9b.l6 a6;
   protected int u9;
   protected boolean h0;

   public n5(int var1, int var2) {
      this(var1, var2, 96.0F, 96.0F);
   }

   public n5(int var1, int var2, float var3, float var4) {
      this(var1, var2, var3, var4, 2498570);
   }

   public n5(int var1, int var2, float var3, float var4, int var5) {
      if (l6(var5) == 1) {
         var5 = 2498570;
      }

      if (var1 < 1 || var2 < 1) {
         var2 = 1;
         var1 = 1;
      }

      com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(var1, var2, var5);
      var6.n5(var3, var4);
      this.n5(var6);
   }

   public n5(byte[] var1) {
      this.n5(n5(var1));
      this.h0 = com.aspose.slides.internal.k4d.a6.z3(var1).u3();
   }

   public n5(com.aspose.slides.internal.w0.y4 var1) {
      if (var1.n5() != 2) {
         throw new ArgumentException("Texture brush is expected.");
      }

      u6 var2 = (u6)com.aspose.slides.internal.j7.k5.n5(var1);

      try {
         this.n5((com.aspose.slides.internal.o9b.l6)var2.h0());
         this.h0 = com.aspose.slides.internal.k4d.a6.z3(var1.l6()).u3() || com.aspose.slides.internal.k4d.a6.n5(var1.l6());
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   protected n5() {
   }

   protected final void n5(com.aspose.slides.internal.o9b.l6 var1) {
      this.a6 = var1;
      this.u9 = n5(this.a6.x8());
   }

   @Override
   public final void dispose() {
      this.n5(true);
   }

   protected void n5(boolean var1) {
      if (!this.c8) {
         this.n5();
         this.c8 = true;
      }
   }

   public final void n5() {
      if (this.a6 != null) {
         this.a6.dispose();
         this.a6 = null;
      }
   }

   public final int l6() {
      return this.a6.e2();
   }

   public final int k5() {
      return this.a6.h0();
   }

   public float u3() {
      return this.h0 ? 96.0F : this.a6.c8();
   }

   public float a6() {
      return this.h0 ? 96.0F : this.a6.y4();
   }

   public final int u9() {
      return this.u9;
   }

   public final int h0() {
      return l6(n5(this.a6.s7()));
   }

   public final com.aspose.slides.internal.o9b.l6 c8() {
      return this.a6;
   }

   public final void n5(int var1, int var2, com.aspose.slides.internal.p1s.n5 var3) {
      this.a6.n5(var1, var2, var3.n5().o8());
   }

   public final void n5(y2 var1, n5 var2, y2 var3) {
      com.aspose.slides.internal.o9b.z1 var4 = com.aspose.slides.internal.o9b.z1.n5(var2.a6);

      try {
         var4.k5(7);
         var4.n5(this.a6, var3.n3(), var1.n3(), 2);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   public final n5 n5(y2 var1) {
      n5 var2 = new n5(var1.t2(), var1.l6(), this.u3(), this.a6(), this.a6.s7());
      this.n5(var1.n3(), var2, var2.t2().n3());
      return var2;
   }

   public final y2 t2() {
      return new y2(0, 0, this.a6.e2(), this.a6.h0());
   }

   public final void n5(t4 var1, int var2) {
      switch (var2) {
         case 4:
            this.l6(var1, 80);
            break;
         case 5:
            this.n5(var1);
            break;
         case 6:
            this.l6(var1);
            break;
         case 7:
         default:
            throw new InvalidOperationException("Cannot save in this image format.");
         case 8:
            this.k5(var1, 5);
      }
   }

   public void l6(t4 var1, int var2) {
      this.y4();
      if (this.a6.s7() == 8207) {
         this.e2();
      }

      n5(this.a6, var1, var2);
   }

   public void n5(t4 var1) {
      this.y4();
      n5(this.a6, var1, this.u3(), this.a6());
   }

   public void l6(t4 var1) {
      this.y4();
      l6(this.a6, var1);
   }

   public void k5(t4 var1, int var2) {
      this.y4();
      y4 var3 = new y4();

      try {
         var3.n5(this.a6, var1, var2, false);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   protected static void n5(com.aspose.slides.internal.o9b.t4 var0, t4 var1, int var2) {
      com.aspose.slides.internal.j9e.s7 var3 = com.aspose.slides.internal.s5.h0.n5(com.aspose.slides.internal.j9e.x8.c8());
      com.aspose.slides.internal.j9e.h0 var4 = new com.aspose.slides.internal.j9e.h0();
      var4.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, var2);

      try {
         var0.n5(var1, var3, var4);
      } catch (RuntimeException var11) {
         var1.setPosition(0L);
         com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(var0);

         try {
            var6.n5(var1, var3, var4);
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      }
   }

   protected static void n5(com.aspose.slides.internal.o9b.t4 var0, t4 var1, float var2, float var3) {
      n5(var0, var1);
   }

   protected static void n5(com.aspose.slides.internal.o9b.t4 var0, t4 var1) {
      var0.n5(var1, com.aspose.slides.internal.s5.h0.n5(com.aspose.slides.internal.j9e.x8.s7()), null);
   }

   protected static void l6(com.aspose.slides.internal.o9b.t4 var0, t4 var1) {
      var0.n5(var1, com.aspose.slides.internal.s5.h0.n5(com.aspose.slides.internal.j9e.x8.k5()), null);
   }

   private void y4() {
      if (this.h0) {
         com.aspose.slides.internal.o9b.l6 var1 = this.s7();
         this.a6.dispose();
         this.a6 = var1;
         this.h0 = false;
      }
   }

   protected final com.aspose.slides.internal.o9b.l6 s7() {
      com.aspose.slides.internal.o9b.l6 var1 = k5(this.a6);
      var1.n5(96.0F, 96.0F);
      return var1;
   }

   public static boolean l6(com.aspose.slides.internal.o9b.l6 var0) {
      return com.aspose.slides.internal.o9b.t4.k5(var0.s7()) && n5(var0, false, false).k5();
   }

   public static com.aspose.slides.internal.o9b.l6 n5(byte[] var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(var0);

      try {
         com.aspose.slides.internal.o9b.l6 var2;
         try {
            var2 = new com.aspose.slides.internal.o9b.l6(var1, true);
         } catch (RuntimeException var8) {
            var2 = new com.aspose.slides.internal.o9b.l6(1, 1);
         }

         if (var2.s7() == 8207) {
            com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(var2);
            var2.dispose();
            return var3;
         } else {
            return var2;
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public final com.aspose.slides.internal.p1s.n5[] x8() {
      com.aspose.slides.internal.o9b.c8[] var1 = this.a6.t2().n5();
      com.aspose.slides.internal.p1s.n5[] var2 = new com.aspose.slides.internal.p1s.n5[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = com.aspose.slides.internal.p1s.n5.n5(var1[var3].o8());
      }

      return var2;
   }

   public static com.aspose.slides.internal.w0.x8 n5(com.aspose.slides.internal.o9b.l6 var0, boolean var1, boolean var2) {
      return n5(var0, var1, var2, n5, l6, k5, u3);
   }

   public static int n5(com.aspose.slides.internal.j9e.n5 var0) {
      return var0.l6() * var0.n5() * 3;
   }

   public static int l6(com.aspose.slides.internal.j9e.n5 var0) {
      boolean var1 = (var0.k5() & 262144) != 0;
      return var1 ? var0.l6() * var0.n5() : 0;
   }

   public static int k5(com.aspose.slides.internal.j9e.n5 var0) {
      int var1 = u3(var0);
      int var2 = n5(var0, var1);
      return var2 * var0.n5();
   }

   public static int n5(com.aspose.slides.internal.j9e.n5 var0, boolean var1) {
      return var1 ? var0.l6() * var0.n5() : 0;
   }

   public static com.aspose.slides.internal.w0.x8 n5(
      com.aspose.slides.internal.o9b.l6 var0, boolean var1, boolean var2, n5$l6 var3, n5$l6 var4, n5$l6 var5, n5$n5 var6
   ) {
      if (var1) {
         com.aspose.slides.internal.s5.l6 var15 = new com.aspose.slides.internal.s5.l6();
         byte[] var16 = var15.n5(var0);
         return new com.aspose.slides.internal.w0.x8(var16, null, false, 2, 1);
      }

      com.aspose.slides.internal.j9e.n5 var7 = null;

      try {
         int var8 = n5(var0.s7());
         var7 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, var8);
         switch (l6(var8)) {
            case 0:
               return n5(var7, var2, var3, var4);
            case 1:
               boolean var9 = (var0.t2().l6() & 1) == 1;
               return n5(var7, var9, var5, var6);
            case 2:
               throw new InvalidOperationException("Have not seen any gray scale images yet.");
            default:
               throw new InvalidOperationException("Unknown color space.");
         }
      } finally {
         if (var7 != null) {
            var0.n5(var7);
            Object var14 = null;
         }
      }
   }

   private static int n5(int var0) {
      switch (var0) {
         case 135173:
         case 135174:
         case 1060876:
            return 137224;
         case 137224:
         case 139273:
         case 196865:
         case 197634:
         case 198659:
         case 2498570:
            return var0;
         case 397319:
         case 925707:
         case 1851406:
         case 3424269:
         default:
            return 2498570;
         case 1052676:
            return 137224;
      }
   }

   private static int l6(int var0) {
      switch (var0) {
         case 135173:
         case 135174:
         case 137224:
         case 139273:
         case 397319:
         case 925707:
         case 1060876:
         case 1851406:
         case 2498570:
         case 3424269:
            return 0;
         case 196865:
         case 197634:
         case 198659:
            return 1;
         case 1052676:
            return 2;
         default:
            throw new InvalidOperationException("Unknown pixel format.");
      }
   }

   private static com.aspose.slides.internal.w0.x8 n5(com.aspose.slides.internal.j9e.n5 var0, boolean var1, n5$l6 var2, n5$l6 var3) {
      switch (var0.k5()) {
         case 137224:
         case 139273:
         case 925707:
         case 2498570:
            if (var0.a6() < 0) {
               throw new InvalidOperationException("A bitmap has a negative stride and this is not yet supported.");
            }

            byte[] var4 = var2.n5(var0);
            byte[] var5 = var3.n5(var0);
            boolean var6 = false;
            boolean var7 = false;
            byte var8 = 0;
            int var9 = 0;
            byte[] var10 = new byte[var0.a6()];
            byte[] var11 = new byte[var0.a6()];
            byte[] var12 = new byte[var0.a6()];
            long var13 = var0.u3().l6();
            long var15 = var0.a6();
            int var17 = var0.k5() == 137224 ? 3 : 4;
            boolean var18 = (var0.k5() & 262144) != 0;

            for (int var19 = 0; var19 < var0.n5(); var19++) {
               com.aspose.slides.internal.e3m.n5.n5(new x9(var13), var11, 0, var11.length);
               if (var19 > 0) {
                  com.aspose.slides.internal.e3m.n5.n5(new x9(var13 - var15), var10, 0, var10.length);
               }

               if (var19 < var0.n5() - 1) {
                  com.aspose.slides.internal.e3m.n5.n5(new x9(var13 + var15), var12, 0, var12.length);
               } else {
                  var12 = null;
               }

               int var20 = 0;

               for (int var21 = 0; var21 < var0.l6(); var21++) {
                  byte var22 = var11[var20];
                  byte var23 = var11[var20 + 1];
                  byte var24 = var11[var20 + 2];
                  if ((var22 & 255) > 0 || (var23 & 255) > 0 || (var24 & 255) > 0) {
                     var7 = true;
                  }

                  if (var18) {
                     byte var25 = var11[var20 + 3];
                     if ((var25 & 255) < 255) {
                        var6 = true;
                     }

                     var5[var9++] = var25;
                     boolean var26 = var11[var20] == 0 && var11[var20 + 1] == 0 && var11[var20 + 2] == 0 && var11[var20 + 3] == 0;
                     if (var26) {
                        boolean var27 = false;
                        if (var21 > 0) {
                           int var28 = var20 - 4;
                           boolean var29 = var11[var28] == 0 && var11[var28 + 1] == 0 && var11[var28 + 2] == 0 && var11[var28 + 3] == 0;
                           if (!var29) {
                              var22 = var11[var28];
                              var23 = var11[var28 + 1];
                              var24 = var11[var28 + 2];
                              var27 = true;
                           }
                        }

                        if (!var27 && var21 < var0.l6() - 1) {
                           int var32 = var20 + 4;
                           boolean var35 = var11[var32] == 0 && var11[var32 + 1] == 0 && var11[var32 + 2] == 0 && var11[var32 + 3] == 0;
                           if (!var35) {
                              var22 = var11[var32];
                              var23 = var11[var32 + 1];
                              var24 = var11[var32 + 2];
                              var27 = true;
                           }
                        }

                        if (!var27 && var19 > 0) {
                           boolean var33 = var10[var20] == 0 && var10[var20 + 1] == 0 && var10[var20 + 2] == 0 && var10[var20 + 3] == 0;
                           if (!var33) {
                              var22 = var10[var20];
                              var23 = var10[var20 + 1];
                              var24 = var10[var20 + 2];
                              var27 = true;
                           }
                        }

                        if (var12 != null && !var27 && var19 < var0.n5() - 1) {
                           boolean var34 = var12[var20] == 0 && var12[var20 + 1] == 0 && var12[var20 + 2] == 0 && var12[var20 + 3] == 0;
                           if (!var34) {
                              var22 = var12[var20];
                              var23 = var12[var20 + 1];
                              var24 = var12[var20 + 2];
                              var27 = true;
                           }
                        }

                        if (!var27) {
                           var24 = -1;
                           var23 = -1;
                           var22 = -1;
                        }
                     }
                  }

                  var4[var8 + 2] = var22;
                  var4[var8 + 1] = var23;
                  var4[var8 + 0] = var24;
                  var8 += 3;
                  var20 += var17;
               }

               var13 += var0.a6();
            }

            if (var1 && var6 && !var7) {
               for (int var30 = 0; var30 < var5.length; var30++) {
                  byte var31 = (byte)(var5[var30] & 0xFF ^ 255);
                  var4[var30 * 3] = var31;
                  var4[var30 * 3 + 1] = var31;
                  var4[var30 * 3 + 2] = var31;
               }

               var5 = com.aspose.slides.internal.n2d.t4.n5;
               com.aspose.slides.internal.k0t.n5.n5(var4.length, var5.length).n5(0);
               var6 = false;
            }

            return new com.aspose.slides.internal.w0.x8(var4, var5, var6, 0, 8);
         default:
            throw new InvalidOperationException("Cannot parse this pixel format.");
      }
   }

   private static int u3(com.aspose.slides.internal.j9e.n5 var0) {
      byte var1;
      switch (var0.k5()) {
         case 196865:
            var1 = 1;
            break;
         case 197634:
            var1 = 4;
            break;
         case 198659:
            var1 = 8;
            break;
         default:
            throw new InvalidOperationException("Cannot parse this pixel format.");
      }

      return var1;
   }

   private static int n5(com.aspose.slides.internal.j9e.n5 var0, int var1) {
      if (var0.a6() < 0) {
         throw new InvalidOperationException("A bitmap has a negative stride and this is not yet supported.");
      } else {
         return com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)((float)var0.l6() * var1 / 8.0F)), 14);
      }
   }

   private static com.aspose.slides.internal.w0.x8 n5(com.aspose.slides.internal.j9e.n5 var0, boolean var1, n5$l6 var2, n5$n5 var3) {
      int var4 = u3(var0);
      int var5 = n5(var0, var4);
      byte[] var6 = var2.n5(var0);
      byte[] var7 = var3.n5(var0, var1);
      int var8 = 0;
      long var9 = var0.u3().l6();

      for (int var11 = 0; var11 < var0.n5(); var11++) {
         com.aspose.slides.internal.e3m.n5.n5(new x9(var9), var6, var8, var5);
         var8 += var5;
         var9 += var0.a6();
      }

      return new com.aspose.slides.internal.w0.x8(var6, var7, false, 1, var4);
   }

   private void e2() {
      com.aspose.slides.internal.o9b.l6 var1 = this.n3();
      this.a6.dispose();
      this.a6 = var1;
   }

   protected final com.aspose.slides.internal.o9b.l6 n3() {
      n5 var1 = new n5(this.l6(), this.k5(), this.u3(), this.a6(), 137224);
      y2 var2 = this.t2().n3();
      this.n5(var2.n3(), var1, var2.n3());
      com.aspose.slides.internal.o9b.l6 var3 = var1.a6;
      var1.a6 = null;
      return var3;
   }

   public final void n5(com.aspose.slides.internal.s5.a6 var1) {
      com.aspose.slides.internal.o9b.c8 var2 = com.aspose.slides.internal.o9b.c8.n5(0, 0, 0, 0).o8();
      com.aspose.slides.internal.o9b.c8 var3 = com.aspose.slides.internal.o9b.c8.m3().o8();
      n5 var4 = new n5(this.l6(), this.k5(), this.u3(), this.a6(), 2498570);

      for (int var5 = 0; var5 < this.a6.e2(); var5++) {
         for (int var6 = 0; var6 < this.a6.h0(); var6++) {
            com.aspose.slides.internal.p1s.n5 var7 = com.aspose.slides.internal.p1s.n5.n5(this.a6.l6(var5, var6).o8());
            var4.a6.n5(var5, var6, (var1.n5(var7) ? var2 : var3).o8());
         }
      }

      this.a6.dispose();
      this.a6 = var4.a6;
      var4.a6 = null;
   }

   private static int n5(com.aspose.slides.internal.j9e.x8 var0) {
      if (var0.equals(com.aspose.slides.internal.j9e.x8.c8())) {
         return 4;
      } else if (var0.equals(com.aspose.slides.internal.j9e.x8.s7())) {
         return 5;
      } else if (var0.equals(com.aspose.slides.internal.j9e.x8.u3())) {
         return 1;
      } else if (var0.equals(com.aspose.slides.internal.j9e.x8.n3())) {
         return 2;
      } else if (var0.equals(com.aspose.slides.internal.j9e.x8.k5()) || var0.equals(com.aspose.slides.internal.j9e.x8.t2())) {
         return 6;
      } else if (var0.equals(com.aspose.slides.internal.j9e.x8.u9())) {
         return 7;
      } else {
         return var0.equals(com.aspose.slides.internal.j9e.x8.x8()) ? 8 : 0;
      }
   }

   public final void n5(com.aspose.slides.internal.p1s.n5 var1) {
      if (l6(this.a6.s7()) == 0 && l6(this.c8())) {
         byte var2 = (byte)var1.k5();
         byte var3 = (byte)var1.u3();
         byte var4 = (byte)var1.a6();
         com.aspose.slides.internal.j9e.n5 var5 = null;

         try {
            var5 = this.a6.n5(new y2(0, 0, this.a6.e2(), this.a6.h0()), 3, this.a6.s7());
            byte[] var6 = new byte[var5.a6()];
            long var7 = var5.u3().l6();

            for (int var9 = 0; var9 < var5.n5(); var9++) {
               com.aspose.slides.internal.e3m.n5.n5(new x9(var7), var6, 0, var6.length);
               int var10 = 0;

               for (int var11 = 0; var11 < var5.l6(); var11++) {
                  byte var12 = var6[var10++];
                  byte var13 = var6[var10++];
                  byte var14 = var6[var10++];
                  byte var15 = var6[var10++];
                  if ((var15 & 255) == 0) {
                     if ((var14 & 255) != (var2 & 255)) {
                        var6[var10 - 2] = var2;
                     }

                     if ((var13 & 255) != (var3 & 255)) {
                        var6[var10 - 3] = var3;
                     }

                     if ((var12 & 255) != (var4 & 255)) {
                        var6[var10 - 4] = var4;
                     }
                  }
               }

               com.aspose.slides.internal.e3m.n5.n5(var6, 0, new x9(var7), var6.length);
               var7 += var5.a6();
            }
         } finally {
            if (var5 != null) {
               this.a6.n5(var5);
            }
         }
      }
   }

   private static com.aspose.slides.internal.o9b.l6 k5(com.aspose.slides.internal.o9b.l6 var0) {
      if (l6(var0.s7()) != 0) {
         return new com.aspose.slides.internal.o9b.l6(var0);
      }

      com.aspose.slides.internal.o9b.l6 var1 = new com.aspose.slides.internal.o9b.l6(var0.e2(), var0.h0(), var0.s7());
      y2 var2 = new y2(0, 0, var0.e2(), var0.h0());
      com.aspose.slides.internal.j9e.n5 var3 = null;
      com.aspose.slides.internal.j9e.n5 var4 = null;
      byte[] var5 = null;

      try {
         var3 = var0.n5(var2.n3(), 1, var0.s7());
         var4 = var1.n5(var2.n3(), 2, var1.s7());
         int var6 = var3.n5();
         int var7 = var3.a6();
         int var8 = var4.a6();
         int var9 = q1.l6(q1.n5(var7), q1.n5(var8));
         var5 = new byte[var9];
         x9 var10 = var3.u3();
         x9 var11 = var4.u3();

         for (int var12 = 0; var12 < var6; var12++) {
            x9 var13 = new x9(var10.l6() + (long)var12 * var7);
            x9 var14 = new x9(var11.l6() + (long)var12 * var8);
            com.aspose.slides.internal.e3m.n5.n5(var13, var5, 0, var9);
            com.aspose.slides.internal.e3m.n5.n5(var5, 0, var14, var9);
         }
      } finally {
         if (var3 != null) {
            var0.n5(var3);
         }

         if (var4 != null) {
            var1.n5(var4);
         }
      }

      return var1;
   }
}
