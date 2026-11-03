package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

class u3k extends x3 {
   public static final String[] n5 = new String[]{"0", "?r1 - ?l1", "?b1 - ?t1", "0", "0", "0", "0", "left", "top", "right", "bottom"};
   public static final String[] l6 = new String[]{"0", "w1", "h1", "0", "0", "0", "0", "l1", "t1", "r1", "b1"};
   private int k5 = -1;
   private u3k u3;
   private y2[] a6 = new y2[0];
   private i4w[] u9;
   private c4[] h0;
   private r8e[] c8;
   private q7g[] t2;
   private y1[] s7;
   private y1[] x8;

   public final y2[] n5() {
      return this.a6;
   }

   public final void n5(y2[] var1) {
      this.a6 = var1;
   }

   public final i4w[] l6() {
      return this.u9;
   }

   public final void n5(i4w[] var1) {
      this.u9 = var1;
   }

   public final c4[] k5() {
      return this.h0;
   }

   public final void n5(c4[] var1) {
      this.h0 = var1;
   }

   public final r8e[] u3() {
      return this.c8;
   }

   public final void n5(r8e[] var1) {
      this.c8 = var1;
   }

   public final q7g[] a6() {
      return this.t2;
   }

   public final void n5(q7g[] var1) {
      this.t2 = var1;
   }

   public final y1[] u9() {
      return this.s7;
   }

   public final void n5(y1[] var1) {
      this.s7 = var1;
   }

   public final y1[] h0() {
      return this.x8;
   }

   public final void l6(y1[] var1) {
      this.x8 = var1;
   }

   public final int c8() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final u3k t2() {
      return this.u3;
   }

   public final void n5(u3k var1) {
      this.u3 = var1;
   }

   public u3k() {
   }

   public u3k(y2[] var1, r8e[] var2, i4w[] var3, c4[] var4, q7g[] var5, y1 var6, y1 var7) {
      this.k5 = 0;
      this.a6 = var1;
      this.u9 = var3;
      this.h0 = var4;
      this.c8 = var2;
      this.t2 = var5;
      if (var6 != null) {
         this.s7 = new y1[1];
         this.s7[0] = var6;
         this.x8 = new y1[1];
         this.x8[0] = var7;
      }
   }

   public static long n5(String var0, Dictionary<String, Integer> var1, List<r8e> var2) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return Long.MAX_VALUE;
      }

      int var3 = 0;
      int var4 = var0.length();

      while (var3 < var4 && var0.charAt(var3) == ' ') {
         var3++;
      }

      byte var5 = 1;
      if (var0.charAt(var3) == '-') {
         var3++;
         var5 = -1;

         while (var3 < var4 && var0.charAt(var3) == ' ') {
            var3++;
         }
      } else if (var0.charAt(var3) == '+') {
         var3++;

         while (var3 < var4 && var0.charAt(var3) == ' ') {
            var3++;
         }
      }

      long var6 = 0L;
      boolean var8 = true;

      while (var3 < var4) {
         char var9 = var0.charAt(var3);
         if (var9 < '0' || var9 > '9') {
            var8 = false;
            break;
         }

         var6 = var6 * 10L + (var9 - '0');
         var3++;
      }

      if (var8) {
         return var5 * var6;
      }

      int var19 = 0;
      Integer[] var10 = new Integer[]{var19};
      boolean var11 = !var1.tryGetValue(var0, var10);
      var19 = var10[0];
      if (var11) {
         if (var6 == 0L) {
            var6 = 1L;
         }

         var4--;
         long var12 = 1L;
         long var14 = 0L;

         while (var3 < var4 && var0.charAt(var4) >= '0' && var0.charAt(var4) <= '9') {
            var14 += (var0.charAt(var4--) - '0') * var12;
            var12 *= 10L;
         }

         if (var14 == 0L) {
            var4++;
            var14 = 1L;
         } else if (var4 == var3 || var0.charAt(var4) != 'd') {
            throw new PptxReadException(com.aspose.slides.ms.System.d1.n5("Invalid adjustable \"{0}\"", new Object[]{var0}));
         }

         String var16 = com.aspose.slides.ms.System.d1.l6(var0, var3, var4 - var3);
         if (com.aspose.slides.ms.System.d1.a6(var0, var16)) {
            throw new PptxReadException(com.aspose.slides.ms.System.d1.n5("Invalid adjustable \"{0}\"", new Object[]{var0}));
         }

         var2.addItem(null);
         var19 = -var2.size() - 11;
         var1.set_Item(var0, var19);
         var2.set_Item(var2.size() - 1, new r8e(var0, (byte)0, n5(var16, var1, var2), var5 * var6, var14, true));
      }

      int var17 = var19;
      return var17 < 0 ? -27273042329600L + var17 : 27273042316900L + var17;
   }

   public final float n5(double[] var1, byte[] var2, long var3) {
      byte var5 = 0;
      byte[] var6 = new byte[]{0};
      float var7 = this.n5(var1, var2, var3, var6);
      var5 = var6[0];
      return var7;
   }

   public final float l6(double[] var1, byte[] var2, long var3) {
      byte var5 = 0;
      byte[] var6 = new byte[]{0};
      float var7 = this.n5(var1, var2, var3, var6) / 60000.0F;
      var5 = var6[0];
      return var7;
   }

   public final float n5(double[] var1, byte[] var2, long var3, byte[] var5) {
      var5[0] = 0;
      if (var3 < -27273042329600L) {
         var5[0] = var2[(int)(-27273042329600L - var3 - 1L)];
         return (float)var1[(int)(-27273042329600L - var3 - 1L)];
      } else {
         return var3 <= 27273042316900L ? (float)var3 : (float)this.a6[(int)(var3 - 27273042316900L - 1L)].n5();
      }
   }

   public static String n5(long var0, r8e[] var2, y2[] var3, String[] var4) {
      if (var0 < -27273042329600L) {
         return var0 <= -27273042329612L
            ? com.aspose.slides.ms.System.d1.n5(new String[]{"?", var2[(int)(-27273042329612L - var0)].n5()})
            : com.aspose.slides.ms.System.d1.n5(new String[]{"?", l6[(int)(-27273042329601L - var0)]});
      }

      if (var0 <= 27273042316900L) {
         return com.aspose.slides.ms.System.Xml.f4.n5(var0);
      }

      if (var0 == Long.MAX_VALUE) {
         return "";
      }

      int var5 = com.aspose.slides.ms.System.u3.n5(var4, var3[(int)(var0 - 27273042316900L - 1L)].k5());
      return var5 > -1
         ? com.aspose.slides.ms.System.d1.n5(new String[]{"$", com.aspose.slides.ms.System.a3.l6(var5)})
         : com.aspose.slides.ms.System.d1.n5(new String[]{"$", var3[(int)(var0 - 27273042316900L - 1L)].k5()});
   }

   public static long n5(List<r8e> var0, byte var1, long var2, long var4, long var6) {
      if (var2 >= -27273042329600L
         && var2 <= 27273042316900L
         && var4 >= -27273042329600L
         && var4 <= 27273042316900L
         && var6 >= -27273042329600L
         && var6 <= 27273042316900L) {
         double var8 = 0.0;
         switch (var1) {
            case 0:
               var8 = (double)var2 * var4 / var6;
               break;
            case 1:
               var8 = (double)var2 + var4 - var6;
               break;
            case 2:
               var8 = ((double)var2 + var4) / var6;
               break;
            case 3:
               return var2 > 0L ? var4 : var6;
            case 4:
               return com.aspose.slides.ms.System.q1.n5(var2);
            case 5:
               var8 = com.aspose.slides.ms.System.q1.u3((double)var4, (double)var2) / 2.9088820866572157E-7;
               break;
            case 6:
               var8 = var2 * com.aspose.slides.ms.System.q1.c8(com.aspose.slides.ms.System.q1.u3((double)var6, (double)var4));
               break;
            case 7:
               var8 = var2 * com.aspose.slides.ms.System.q1.c8(var4 * 2.9088820866572157E-7);
               break;
            case 8:
               return com.aspose.slides.ms.System.q1.n5(var2, var4);
            case 9:
               return com.aspose.slides.ms.System.q1.k5(var2, var4);
            case 10:
               var8 = com.aspose.slides.ms.System.q1.z3((double)var2 * var2 + (double)var4 * var4 + (double)var6 * var6);
               break;
            case 11:
               var8 = var2 > var4 ? var2 : (var4 > var6 ? var6 : var4);
               break;
            case 12:
               var8 = var2 * com.aspose.slides.ms.System.q1.h0(com.aspose.slides.ms.System.q1.u3((double)var6, (double)var4));
               break;
            case 13:
               var8 = var2 * com.aspose.slides.ms.System.q1.h0(var4 * 2.9088820866572157E-7);
               break;
            case 14:
               var8 = com.aspose.slides.ms.System.q1.z3(var2);
               break;
            case 15:
               var8 = var2 * com.aspose.slides.ms.System.q1.t2(var4 * 2.9088820866572157E-7);
               break;
            case 16:
               var8 = var2;
         }

         if (var8 != 0.0) {
            double var10 = com.aspose.slides.ms.System.q1.u3(var8);
            if (com.aspose.slides.ms.System.q1.n5((var10 - var8) / (var10 + var8)) < 0.01) {
               return com.aspose.slides.internal.v6g.k5.u9(var10, 14);
            }
         }

         return 0L;
      } else {
         if (var1 != 1 && var1 != 0) {
            if (var1 == 2 && var6 == 1L) {
               if (var2 == 0L) {
                  return var4;
               }

               if (var4 == 0L) {
                  return var2;
               }
            } else if (var1 == 3 && var2 >= -27273042329600L && var2 <= 27273042316900L) {
               return var2 > 0L ? var4 : var6;
            }
         } else {
            if (var2 == var6) {
               return var4;
            }

            if (var4 == var6) {
               return var2;
            }

            if (var1 == 0 && (var2 == 0L || var4 == 0L)) {
               return 0L;
            }
         }

         for (int var12 = 0; var12 < var0.size(); var12++) {
            r8e var13 = (r8e)var0.get_Item(var12);
            if (var13 != null && var13.u9() == var1 && var13.k5() == var2 && var13.u3() == var4 && var13.a6() == var6) {
               return l6(var12);
            }
         }

         var0.addItem(new r8e(com.aspose.slides.ms.System.d1.n5(new String[]{"GT", com.aspose.slides.ms.System.a3.l6(var0.size())}), var1, var2, var4, var6));
         return l6(var0.size() - 1);
      }
   }

   public final com.aspose.slides.internal.o9b.f2 n5(com.aspose.slides.internal.o9b.f2 var1) {
      if (this.k5 != 5 && this.k5 != -1 && this.k5 != 0) {
         com.aspose.slides.internal.b7.x2 var2 = com.aspose.slides.internal.b7.x2.n5(this.k5, new com.aspose.slides.internal.b7.z6e());

         for (y2 var6 : this.a6) {
            var2.l6().n5(var6.k5(), var6.n5());
         }

         com.aspose.slides.internal.b7.j6 var7 = var2.n5(var1.l6(), var1.k5());
         return new com.aspose.slides.internal.o9b.f2((float)var7.n5(), (float)var7.l6());
      } else {
         return var1;
      }
   }

   private static long l6(int var0) {
      return -27273042329600L - var0 - 11L - 1L;
   }
}
