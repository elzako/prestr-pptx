package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.e1x.u6;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.ms.System.d1;

public abstract class a6 extends com.aspose.slides.internal.r5.a6 {
   protected a6(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   protected final void n5(long var1, com.aspose.slides.internal.t5.m3 var3, com.aspose.slides.internal.r6.u9 var4) {
      com.aspose.slides.internal.t5.x8 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.t4().n5(var4.h0()), com.aspose.slides.internal.t5.x8.class);
      com.aspose.slides.internal.o9b.n3 var6 = var4.s7();
      if (var3.s7() != 1200) {
         var3.n5(this.n5(var5.s7()));
      }

      com.aspose.slides.internal.o9b.i1 var7 = new com.aspose.slides.internal.o9b.i1(var4.z3().o8());
      float var8 = var3.n5().n5();
      float var9 = var3.n5().l6();
      if ((var4.j5() & 4294967295L & 1L & 4294967295L) == 1L) {
         var8 = var4.m1().n5();
         var9 = var4.m1().l6();
      }

      com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1(var8, var9);
      com.aspose.slides.internal.k1.k7 var11 = var3.u9();
      String var12 = var3.t2();
      long var13 = var3.u3();
      com.aspose.slides.internal.x4g.x8 var15 = this.n5(var4);
      if ((var13 & 4L) == 4L) {
         this.n5(var11.c8().n3(), 1, var4);
      }

      if ((var13 & 2L) == 2L) {
         this.n5(new com.aspose.slides.internal.o9b.i1(var4.q0().o8()), com.aspose.slides.internal.o9b.y1.n5(var11.c8()).y4(), var4);
      }

      if ((var13 & 16L) == 16L) {
         com.aspose.slides.internal.e1x.i1 var16 = com.aspose.slides.internal.e1x.x8.u3().n5(var6.l6().a6(), var4.s7().x8(), null);
         int[] var17 = new int[var3.c8().length / 2];
         char[] var18 = new char[var17.length];

         for (int var19 = 0; var19 < var17.length; var19++) {
            var17[var19] = (var3.c8()[var19 * 2 + 1] & 255 & 0xFF) << 8 | var3.c8()[var19 * 2] & 255 & 0xFF;
            u6 var20 = var16.h0().k5(var17[var19]);
            var18[var19] = (char)var20.n5();
         }

         var12 = d1.n5(var18);
      }

      if ((var13 & 512L) == 512L) {
         byte[] var39 = com.aspose.slides.internal.l7h.j5.z1().u3(var12);
         byte[] var41 = new byte[var39.length / 2];

         for (int var43 = 0; var43 < var41.length; var43++) {
            var41[var43] = var39[var43 << 1];
         }

         var12 = com.aspose.slides.internal.l7h.j5.e2().l6(var41);
      }

      long[] var40 = var3.n3();
      if ((var13 & 128L) == 128L) {
         var12 = n5(var12);
         if (var40 != null && var40.length > 0) {
            var40 = n5(var40);
         }
      }

      e5 var42 = new e5(e5.t2());
      if ((var13 & 1024L) == 1024L) {
         var42.n5(com.aspose.slides.internal.x7n.l6.k5().t2(), 1);
      }

      if ((var13 & 2048L) == 2048L) {
         var42.n5(com.aspose.slides.internal.x7n.l6.k5().t2(), 2);
      }

      com.aspose.slides.internal.o9b.w1 var44 = this.n5(var10.u3(), var12, var6, (int)(var4.j5() & 65535L), 1.0F, var4).u3();
      boolean var45 = var1 == 1L && var4.l6().n5()[3] < 0.0F && var4.l6().n5()[0] > 0.0F;
      if (var5 != null && var5.u3() != 0) {
         com.aspose.slides.internal.x4g.m1 var47 = new com.aspose.slides.internal.x4g.m1();
         var47.n5(-var5.u3() / 10.0F, var10.u3());
         this.n5(var47, var4);
      } else if (var5 != null && var5.k5() != 0) {
         com.aspose.slides.internal.x4g.m1 var46 = new com.aspose.slides.internal.x4g.m1();
         var46.n5(-var5.k5() / 10.0F, var10.u3());
         this.n5(var46, var4);
      }

      if (var45) {
         var44.l6(var44.k5() - var10.k5() - var10.k5());
      }

      byte var48 = var5 != null ? var5.y4() : 4;
      switch (var48) {
         case 0:
         default:
            break;
         case 1:
            this.n5(5, var4);
            break;
         case 2:
            this.n5(5, var4);
            break;
         case 3:
            this.n5(1, var4);
            this.l6(0, var4);
            break;
         case 4:
            this.n5(3, var4);
            break;
         case 5:
            this.n5(5, var4);
      }

      long var21 = 0L;
      if (var40 != null && var40.length > 0) {
         if (var4.c4() == 2L && (var13 & 2L) != 2L) {
            float var49 = 0.0F;
            float var24 = 0.0F;
            int var25 = 0;
            com.aspose.slides.internal.o9b.f2 var26 = this.n5(var12, var6, var44.u3(), var42, var4).a6();
            com.aspose.slides.internal.o9b.f2 var27 = this.n5(
                  com.aspose.slides.ms.System.t9.q0(var12.charAt(var12.length() - 1)), var6, var44.u3(), var42, var4
               )
               .a6();

            for (int var28 = 0; var28 < var12.length() - 1; var28++) {
               var49 += (float)(var40[var25++] & 4294967295L);
               if ((var13 & 8192L) == 8192L) {
                  var24 += (float)(var40[var25++] & 4294967295L);
               }
            }

            var49 += var27.l6();
            var24 += var26.k5();
            this.n5(
               new com.aspose.slides.internal.o9b.i1(var4.q0().o8()),
               new com.aspose.slides.internal.o9b.y1(var44.u3(), new com.aspose.slides.internal.o9b.f2(var49, var24)),
               var4
            );
         }

         long var29 = 0L;
         int var52 = 0;
         boolean var53 = var40.length > var12.length();

         for (int var54 = 0; var54 < var12.length(); var54++) {
            com.aspose.slides.internal.o9b.w1 var55 = new com.aspose.slides.internal.o9b.w1(
               var44.l6() + (float)(var21 & 4294967295L), var44.k5() + (float)(var29 & 4294967295L)
            );
            String var31 = com.aspose.slides.ms.System.t9.q0(var12.charAt(var54));
            int var32 = var12.charAt(var54);
            if (com.aspose.slides.ms.System.t9.a6(var12.charAt(var54))) {
               var32 = com.aspose.slides.ms.System.t9.n5(var12.charAt(var54), var12.charAt(var54 + 1));
               var31 = com.aspose.slides.ms.System.t9.n5(var32);
               var21 = (var21 & 4294967295L) + (var40[var52++] & 4294967295L) & 4294967295L;
               var54++;
            }

            if (var53) {
               var52 += var3.x8().n5(var31) - 1;
            }

            boolean var33 = var1 == 2L && var5.k5() != var5.u3();
            if (var1 == 1L && var5.k5() == 2700 && com.aspose.slides.internal.n2d.u9.h0((char)var32) && !com.aspose.slides.internal.n2d.u9.m3((char)var32)) {
               var33 = true;
               var5.u3(0);
            }

            if (var33) {
               com.aspose.slides.internal.o9b.f2 var34 = this.n5(var31, var6, var44.u3(), var42, var4).a6();
               com.aspose.slides.internal.x4g.x8 var35 = this.n5(var4);
               float var36 = var5.k5() / 10.0F;
               float var37 = var5.u3() / 10.0F;
               com.aspose.slides.internal.x4g.m1 var38 = new com.aspose.slides.internal.x4g.m1();
               var38.n5(var36 - var37, new com.aspose.slides.internal.o9b.w1(var55.l6() + var34.l6() / 2.0F, var55.k5() + var34.k5() / 2.0F));
               this.n5(var38, var4);
               this.n5(var31, var6, var7, var55.u3(), var42, var48, var1, var4, var45);
               this.n5(var35, var4);
            } else {
               this.n5(var31, var6, var7, var55.u3(), var42, var48, var1, var4, var45);
            }

            var21 = (var21 & 4294967295L) + (var40[var52++] & 4294967295L) & 4294967295L;
            if ((var13 & 8192L) == 8192L) {
               var29 = (var29 & 4294967295L) + (var40[var52++] & 4294967295L) & 4294967295L;
            }
         }
      } else {
         if (var4.c4() == 2L && (var13 & 2L) != 2L) {
            com.aspose.slides.internal.o9b.f2 var23 = this.n5(var12, var6, var44.u3(), var42, var4).a6();
            this.n5(new com.aspose.slides.internal.o9b.i1(var4.q0().o8()), new com.aspose.slides.internal.o9b.y1(var44.u3(), var23.a6()), var4);
         }

         if ((var13 & 256L) == 256L) {
            this.n5(var12, var6, var7, var44.u3(), var42, var48, var1, var4, var45);
         } else {
            this.n5(var12, var6, var7, com.aspose.slides.internal.o9b.y1.n5(var11.c8()).y4(), var42, var48, var1, var4, var45);
         }
      }

      if ((var4.j5() & 4294967295L & 1L & 4294967295L) == 1L) {
         var4.n5(new com.aspose.slides.internal.o9b.j5((int)(var4.m1().n5() + (var21 & 4294967295L) & 4294967295L), var4.m1().l6()));
      }

      this.n5(var15, var4);
   }

   protected abstract void n5(com.aspose.slides.internal.o9b.y2 var1, int var2, com.aspose.slides.internal.r6.u9 var3);

   protected abstract com.aspose.slides.internal.o9b.w1 n5(
      com.aspose.slides.internal.o9b.w1 var1, String var2, com.aspose.slides.internal.o9b.n3 var3, int var4, float var5, com.aspose.slides.internal.r6.u9 var6
   );

   protected abstract void n5(com.aspose.slides.internal.o9b.i1 var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.r6.u9 var3);

   protected abstract void n5(com.aspose.slides.internal.x4g.m1 var1, com.aspose.slides.internal.r6.u9 var2);

   protected abstract com.aspose.slides.internal.x4g.x8 n5(com.aspose.slides.internal.r6.u9 var1);

   protected abstract void n5(com.aspose.slides.internal.x4g.x8 var1, com.aspose.slides.internal.r6.u9 var2);

   protected abstract void n5(int var1, com.aspose.slides.internal.r6.u9 var2);

   protected abstract void l6(int var1, com.aspose.slides.internal.r6.u9 var2);

   protected abstract com.aspose.slides.internal.o9b.f2 n5(
      String var1, com.aspose.slides.internal.o9b.n3 var2, com.aspose.slides.internal.o9b.w1 var3, e5 var4, com.aspose.slides.internal.r6.u9 var5
   );

   protected abstract void n5(
      String var1,
      com.aspose.slides.internal.o9b.n3 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.y1 var4,
      e5 var5,
      byte var6,
      long var7,
      com.aspose.slides.internal.r6.u9 var9,
      boolean var10
   );

   protected abstract void n5(
      String var1,
      com.aspose.slides.internal.o9b.n3 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.w1 var4,
      e5 var5,
      byte var6,
      long var7,
      com.aspose.slides.internal.r6.u9 var9,
      boolean var10
   );

   public static String n5(String var0) {
      char[] var1 = d1.c8(var0);
      char[] var2 = new char[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         char var4 = var1[var3];
         switch (var4) {
            case '(':
               var4 = ')';
               break;
            case ')':
               var4 = '(';
               break;
            case '[':
               var4 = ']';
               break;
            case ']':
               var4 = '[';
               break;
            case '{':
               var4 = '}';
               break;
            case '}':
               var4 = '{';
         }

         var2[var1.length - 1 - var3] = var4;
      }

      return d1.n5(var2);
   }

   public static long[] n5(long[] var0) {
      long[] var1 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(var0)).deepClone(), long[].class);
      com.aspose.slides.ms.System.u3.u3(com.aspose.slides.ms.System.u3.n5((Object)(var1)));
      return var1;
   }

   private int n5(byte var1) {
      switch (var1) {
         case -128:
            return 932;
         case -127:
            return 1200;
         case -126:
            return 1361;
         case -122:
            return 936;
         case -120:
            return 950;
         case -95:
            return 737;
         case -94:
            return 857;
         case -93:
            return 1258;
         case -79:
            return 862;
         case -78:
            return 864;
         case -70:
            return 775;
         case -52:
            return 866;
         case -34:
            return 874;
         case -18:
            return 852;
         case -1:
            return 1;
         case 0:
            return 0;
         case 1:
            return 1200;
         case 2:
            return 858;
         case 77:
            return 2;
         default:
            return com.aspose.slides.internal.l7h.j5.z1().t9();
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return false;
   }
}
