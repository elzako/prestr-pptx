package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;

class d4 {
   private static final float n5 = 72.0F * w5k.n5();

   public static com.aspose.slides.internal.w0.l6 n5(a1v var0) {
      return n5(var0, 96.0F);
   }

   public static com.aspose.slides.internal.w0.n3 l6(a1v var0) {
      return new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.p1s.n5.n5(var0.n5().o8()));
   }

   public static com.aspose.slides.internal.w0.u3 n5(u4z var0, float var1) {
      float var2 = var0.w1();
      com.aspose.slides.internal.x4g.a6 var3 = a1v.n5(var0.l6(true));
      if (var0.e2() == 1) {
         com.aspose.slides.internal.o9b.y1 var28 = var0.o0().y4();
         if (com.aspose.slides.ms.System.q1.n5(var0.i1()) > 0.1 || var0.e5() || var0.b3()) {
            double var5 = var2 / 180.0 * Math.PI;
            double var7 = com.aspose.slides.ms.System.q1.c8(var5);
            double var9 = com.aspose.slides.ms.System.q1.h0(var5);
            if (var0.e5()) {
               var7 = -var7;
            }

            if (var0.b3()) {
               var9 = -var9;
            }

            var2 = (float)(com.aspose.slides.ms.System.q1.u3(var9, var7) * 180.0 / Math.PI);
            if (var0.m3() != null) {
               com.aspose.slides.internal.x4g.s7 var29 = (com.aspose.slides.internal.x4g.s7)var0.m3().deepClone();
               var29.y4();
               n5(var29, var0.o0().y4(), -var0.i1(), var0.f2().l6(), var0.f2().k5()).a6(var28);
               n5(null, var28.y4(), -var2, var0.f2().l6(), var0.f2().k5()).a6(var28);
               var29.dispose();
            } else {
               n5(null, var0.o0().y4(), -var0.i1(), var0.f2().l6(), var0.f2().k5()).a6(var28);
               n5(null, var28.y4(), -var2, var0.f2().l6(), var0.f2().k5()).a6(var28);
            }

            n5(null, new com.aspose.slides.internal.o9b.y1(var28.x8(), var0.f2().k5(), var28.s7(), 0.0F), var2 + var0.i1(), var0.f2().l6(), var0.f2().k5())
               .a6(var28);
            if (var28.s7() < 1.0F) {
               var28.l6(1.0F);
            }

            if (var28.k5() < 1.0F) {
               var28.n5(1.0F);
            }

            var2 += var0.i1();
         }

         float var30 = var1 / 72.0F;
         if (var30 > 1.0F) {
            var28.l6(var28.s7() + var30);
            var28.n5(var28.k5() + var30);
         }

         com.aspose.slides.internal.w0.h0 var33;
         if (var3 != null) {
            com.aspose.slides.internal.o9b.y1 var31 = a1v.n5(var0.k7().n5(var28.y4()).y4()).y4();
            if (var2 == 180.0F) {
               var31.n5(var31.s7() + 45.0F);
            }

            var33 = new com.aspose.slides.internal.w0.h0(
               var31.y4(), com.aspose.slides.internal.p1s.n5.n5(var3.n5()[0].o8()), com.aspose.slides.internal.p1s.n5.n5(var3.n5()[var3.n5().length - 1].o8())
            );
         } else {
            var33 = new com.aspose.slides.internal.w0.h0(
               a1v.n5(var0.k7().n5(var28.y4()).y4()).y4(),
               com.aspose.slides.internal.p1s.n5.n5(var0.t4().getValues().get_Item(0).o8()),
               com.aspose.slides.internal.p1s.n5.n5(var0.t4().getValues().get_Item(0).o8())
            );
         }

         var33.n5(var2);
         if (var3 != null) {
            com.aspose.slides.internal.w0.u9[] var32 = new com.aspose.slides.internal.w0.u9[var3.n5().length];

            for (int var34 = 0; var34 < var3.n5().length; var34++) {
               var32[var34] = new com.aspose.slides.internal.w0.u9(com.aspose.slides.internal.p1s.n5.n5(var3.n5()[var34].o8()), var3.l6()[var34]);
            }

            var33.n5(var32);
         }

         return var33;
      } else {
         com.aspose.slides.internal.o9b.y1 var4 = l6(var0).y4();
         com.aspose.slides.internal.o9b.w1[] var12 = new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(var4.a6(), var4.t2()),
            new com.aspose.slides.internal.o9b.w1(var4.h0(), var4.t2()),
            new com.aspose.slides.internal.o9b.w1(var4.h0(), var4.l6()),
            new com.aspose.slides.internal.o9b.w1(var4.a6(), var4.l6())
         };
         float var14 = var0.i1();
         com.aspose.slides.internal.x4g.s7 var15 = var0.m3();
         com.aspose.slides.internal.o9b.y1 var16 = var0.k7().n5(var4.y4()).y4();
         s4s var17 = var0.m1().l6();
         d2k var11 = d2k.n5(var17.n5, d2k.n5(var17.l6, 2)).u3();
         s4s var18 = var0.k7().u3().l6();
         float var19 = com.aspose.slides.ms.System.q1.n5(var11.n5 - var18.n5.n5, var18.n5.n5 + var18.l6.n5 - var11.n5) * 2.0F;
         float var20 = com.aspose.slides.ms.System.q1.n5(var11.l6 - var18.n5.l6, var18.n5.l6 + var18.l6.l6 - var11.l6) * 2.0F;
         float var21 = com.aspose.slides.ms.System.q1.n5(var19, var20);
         var11.n5 = var4.x8() + var11.n5 * var4.s7();
         var11.l6 = var4.n3() + var11.l6 * var4.k5();
         switch (var0.t9()) {
            case 1:
               var15 = new com.aspose.slides.internal.x4g.s7();
               var15.l6(var16.y4());
               break;
            case 2:
               float var22 = com.aspose.slides.ms.System.q1.n5(var16.s7(), var16.k5());
               var15 = new com.aspose.slides.internal.x4g.s7();
               float var23 = (float)com.aspose.slides.ms.System.q1.z3(var16.s7() * var16.s7() + var16.k5() * var16.k5()) / var22 * var21;
               var15.n5(var11.n5 - var22 * var23 / 2.0F, var11.l6 - var22 * var23 / 2.0F, var22 * var23, var22 * var23);
               if (var3 != null) {
                  float var24 = 1.0F / var21;
                  float[] var25 = var3.l6();

                  for (int var26 = 1; var26 < var25.length; var26++) {
                     var25[var26] = 1.0F - (1.0F - var25[var26]) * var24;
                  }

                  var3.n5(var25);
               }
               break;
            case 3:
               var14 = 0.0F;
         }

         com.aspose.slides.internal.w0.t2 var13;
         if (var15 != null && var15.h0() > 0 && var15.s7().k5() > 0.0F) {
            com.aspose.slides.internal.e1.r4 var36 = com.aspose.slides.internal.e1.r4.n5(var15.a6(), true);
            var13 = new com.aspose.slides.internal.w0.t2(var36, new com.aspose.slides.internal.o9b.w1());
         } else {
            com.aspose.slides.internal.e1.r4 var35 = com.aspose.slides.internal.e1.r4.n5(var12, true);
            var13 = new com.aspose.slides.internal.w0.t2(var35, new com.aspose.slides.internal.o9b.w1());
         }

         switch (var0.e2()) {
            case 2:
               var13.n5(new com.aspose.slides.internal.o9b.w1(var4.a6(), var4.t2()));
               break;
            case 3:
               var13.n5(new com.aspose.slides.internal.o9b.w1(var4.h0(), var4.t2()));
               break;
            case 4:
               var13.n5(new com.aspose.slides.internal.o9b.w1(var4.a6(), var4.l6()));
               break;
            case 5:
               var13.n5(new com.aspose.slides.internal.o9b.w1(var4.h0(), var4.l6()));
               break;
            case 6:
            default:
               var13.n5(new com.aspose.slides.internal.o9b.w1(var11.n5, var11.l6));
               var13.l6(new com.aspose.slides.internal.o9b.w1(var17.l6.n5, var17.l6.l6));
         }

         if (var4.k5() > 0.999F && var4.s7() > 0.999F) {
            var13.n5(var4.y4());
         }

         if (var3 != null) {
            com.aspose.slides.internal.w0.u9[] var37 = new com.aspose.slides.internal.w0.u9[var3.n5().length];

            for (int var39 = 0; var39 < var3.n5().length; var39++) {
               var37[var39] = new com.aspose.slides.internal.w0.u9(com.aspose.slides.internal.p1s.n5.n5(var3.n5()[var39].o8()), var3.l6()[var39]);
            }

            var13.n5(var37);
         }

         if (com.aspose.slides.ms.System.q1.n5(var14) > 0.1) {
            float var38 = var0.f2().l6();
            float var40 = var0.f2().k5();
            var13.n3().l6(var38, var40, 0);
            var13.n3().n5(var14, 0);
            var13.n3().l6(-var38, -var40, 0);
         }

         if (var0.e5() || var0.b3()) {
            var13.n3().n5(com.aspose.slides.internal.n8e.n1.l6(var0.e5() ? -1.0F : 1.0F, var0.b3() ? -1.0F : 1.0F, var0.f2().l6(), var0.f2().k5()), 0);
         }

         return var13;
      }
   }

   public static com.aspose.slides.internal.w0.l6 n5(a1v var0, float var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, y4f.class)) {
         com.aspose.slides.internal.v6g.k5.n5(var0, y4f.class).z7();
      }

      switch (var0.u3()) {
         case 1:
            return l6(var0);
         case 2:
            return n5((u4z)var0, var1);
         case 3:
            m2a var8 = (m2a)var0;

            try {
               return n5(var8);
            } catch (RuntimeException var7) {
               com.aspose.slides.internal.n8e.v4.n5(var7);
               return l6(var0);
            }
         case 4:
            q3d var2 = (q3d)var0;

            try {
               if (var2.z1() == 1) {
                  com.aspose.slides.internal.o9b.y1 var3 = var2.q0().y4();
                  com.aspose.slides.internal.o9b.y1[] var4 = new com.aspose.slides.internal.o9b.y1[]{var3};
                  com.aspose.slides.internal.w0.y4 var5 = n5(var2, var1, var4);
                  var4[0].a6(var3);
                  var2.l6(var3.y4());
                  return var5;
               }

               return n5(var2, var1);
            } catch (RuntimeException var6) {
               com.aspose.slides.internal.n8e.v4.n5(var6);
               return l6(var0);
            }
         default:
            return new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.p1s.n5.n5(com.aspose.slides.internal.o9b.c8.e2().o8()));
      }
   }

   public static com.aspose.slides.internal.w0.y4 n5(m2a var0) {
      com.aspose.slides.internal.o9b.l6 var1 = (com.aspose.slides.internal.o9b.l6)var0.e2();

      byte[] var2;
      try {
         var2 = com.aspose.slides.internal.n8e.k7.n5((com.aspose.slides.internal.o9b.t4)var1);
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }

      com.aspose.slides.internal.w0.y4 var3 = new com.aspose.slides.internal.w0.y4(var2);
      var3.n5(new com.aspose.slides.internal.w0.c8());
      if (com.aspose.slides.ms.System.q1.n5(var0.i1()) > 0.1) {
         var3.n3().l6(var0.f2().l6(), var0.f2().k5(), 0);
         var3.n3().n5(var0.i1(), 0);
         var3.n3().l6(-var0.f2().l6(), -var0.f2().k5(), 0);
      }

      if (var0.e5() || var0.b3()) {
         var3.n3().n5(com.aspose.slides.internal.n8e.n1.l6(var0.e5() ? -1.0F : 1.0F, var0.b3() ? -1.0F : 1.0F, var0.f2().l6(), var0.f2().k5()), 0);
      }

      return var3;
   }

   private static com.aspose.slides.internal.w0.y4 n5(q3d var0, float var1, com.aspose.slides.internal.o9b.y1[] var2) {
      com.aspose.slides.internal.o9b.y1 var3 = (var0.i1() == 0.0F ? var0.o0() : n5(var0.e2(), var0.o0().y4(), -var0.i1(), var0.f2().l6(), var0.f2().k5())).y4();
      com.aspose.slides.internal.o9b.t4 var4 = var0.y1();
      byte[] var5 = null;
      com.aspose.slides.internal.w0.y4 var6 = null;
      com.aspose.slides.internal.k9.u9 var7 = var0.c4();
      if ((var7 == null || !var7.u3() || !com.aspose.slides.internal.n8e.k7.h0(var7.a6()))
         && !com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.j9e.y4.class)) {
         if (var7 != null) {
            var5 = var7.u3() ? var7.a6() : com.aspose.slides.internal.n8e.k7.n5(var4);
            if (var7.l6() && var0.h0() != null && var0.h0().u9 != null) {
               com.aspose.slides.internal.k9.h0 var10 = com.aspose.slides.internal.k9.h0.n5(var5);
               if (!var0.h0().u9.t4().n5(var10)) {
                  var0.h0().u9.t4().n5(var10, var7);
               }

               com.aspose.slides.internal.o9b.t4 var12 = com.aspose.slides.internal.v6g.k5.n5(var7.k5().deepClone(), com.aspose.slides.internal.o9b.t4.class);
               var6 = new com.aspose.slides.internal.w0.e2(var12, var5, 4);
            } else {
               var6 = new com.aspose.slides.internal.w0.y4(var5, 4);
            }
         }
      } else {
         float var8 = var1 / 72.0F;
         com.aspose.slides.internal.o9b.f2 var9 = new com.aspose.slides.internal.o9b.f2(var0.o0().s7() * var8, var0.o0().k5() * var8);
         var5 = com.aspose.slides.internal.n8e.k7.n5(var7.a6(), var9.a6(), var0.t9());
         var2[0] = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var9.l6(), var9.k5());
         var6 = new com.aspose.slides.internal.w0.y4(var5, 4);
      }

      if (var5 != null) {
      }

      if (com.aspose.slides.ms.System.q1.n5(var0.i1()) > 0.1) {
         float var11 = var0.f2().l6();
         float var13 = var0.f2().k5();
         var6.n3().l6(var11, var13, 0);
         var6.n3().n5(var0.i1(), 0);
         var6.n3().l6(-var11, -var13, 0);
      }

      if (var6.n3() == null) {
         var6.n5(new com.aspose.slides.internal.w0.c8());
      }

      if (var0.e5() || var0.b3()) {
         var6.n3().n5(com.aspose.slides.internal.n8e.n1.l6(var0.e5() ? -1.0F : 1.0F, var0.b3() ? -1.0F : 1.0F, var0.f2().l6(), var0.f2().k5()), 0);
      }

      var6.n3().l6(var3.x8(), var3.n3(), 0);
      var6.n3().n5(var3.s7() / var2[0].s7(), var3.k5() / var2[0].k5(), 0);
      var6.n3().l6(-var2[0].x8(), -var2[0].n3(), 0);
      return var6;
   }

   private static com.aspose.slides.internal.w0.y4 n5(q3d var0, float var1) {
      com.aspose.slides.internal.o9b.y1 var2 = (var0.i1() == 0.0F ? var0.o0() : n5(var0.e2(), var0.o0().y4(), -var0.i1(), var0.f2().l6(), var0.f2().k5())).y4();
      com.aspose.slides.internal.k9.u9 var3 = var0.c4();
      com.aspose.slides.internal.o9b.t4 var4 = var0.y1();
      byte[] var5 = var3.u3() ? var3.a6() : com.aspose.slides.internal.n8e.k7.n5(var4);
      com.aspose.slides.internal.w0.y4 var6 = new com.aspose.slides.internal.w0.y4(var5);
      float var7 = var2.x8();
      float var8 = var2.n3();
      float var9 = com.aspose.slides.internal.n2d.m1.n5(var4);
      float var10 = com.aspose.slides.internal.n2d.m1.l6(var4);
      if (var3 != null && var3.u3() && com.aspose.slides.internal.n8e.k7.h0(var3.a6())
         || com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.j9e.y4.class)) {
         var10 = 96.0F;
         var9 = 96.0F;
      }

      float var11 = var4.e2() * n5 / var9 * var0.z8().n5;
      float var12 = var4.h0() * n5 / var10 * var0.z8().l6;
      switch (var0.k7()) {
         case 0:
         default:
            break;
         case 1:
            var7 = var2.a6() + (var2.s7() - var11) / 2.0F;
            break;
         case 2:
            var7 = var2.h0() - var11;
            break;
         case 3:
            var8 = var2.t2() + (var2.k5() - var12) / 2.0F;
            break;
         case 4:
            var7 = var2.a6() + (var2.s7() - var11) / 2.0F;
            var8 = var2.t2() + (var2.k5() - var12) / 2.0F;
            break;
         case 5:
            var7 = var2.h0() - var11;
            var8 = var2.t2() + (var2.k5() - var12) / 2.0F;
            break;
         case 6:
            var8 = var2.l6() - var12;
            break;
         case 7:
            var7 = var2.a6() + (var2.s7() - var11) / 2.0F;
            var8 = var2.l6() - var12;
            break;
         case 8:
            var7 = var2.h0() - var11;
            var8 = var2.l6() - var12;
      }

      var6.n5(var0.z3());
      if (com.aspose.slides.ms.System.q1.n5(var0.i1()) > 0.1) {
         var6.n3().l6(var0.f2().l6(), var0.f2().k5(), 0);
         var6.n3().n5(var0.i1(), 0);
         var6.n3().l6(-var0.f2().l6(), -var0.f2().k5(), 0);
      }

      if (var0.e5() || var0.b3()) {
         var6.n3().n5(com.aspose.slides.internal.n8e.n1.l6(var0.e5() ? -1.0F : 1.0F, var0.b3() ? -1.0F : 1.0F, var0.f2().l6(), var0.f2().k5()), 0);
      }

      var6.n3().l6(var7 + var0.m3().n5, var8 + var0.m3().l6, 0);
      var6.n3().n5(n5 / var9 * var0.z8().n5, n5 / var10 * var0.z8().l6);
      return var6;
   }

   public static com.aspose.slides.internal.o9b.u3 n5(u4z var0) {
      int var1 = var0.y4();
      com.aspose.slides.internal.o9b.c8 var2 = var0.n5().o8();
      com.aspose.slides.internal.o9b.c8 var3 = var0.l6().o8();
      int var4 = var0.z1();
      float var5 = var0.w1();
      SortedList var6 = var0.l6(true);
      var0.z7();
      com.aspose.slides.internal.o9b.c8 var7 = var2.o8();
      com.aspose.slides.internal.o9b.c8 var8 = var3.o8();
      float var9 = var5;
      float var10 = var0.z3() / 100.0F;
      switch (var1) {
         case 1:
            var2.n5(var7);
            int var11 = var4;
            int var12;
            int var13;
            int var14;
            if (var11 < 10) {
               var12 = (var7.x8() & 255) * var11 / 9;
               var13 = (var7.n3() & 255) * var11 / 9;
               var14 = (var7.y4() & 255) * var11 / 9;
            } else {
               var12 = (255 - (var7.x8() & 255)) * (var11 - 9) / 10 + (var7.x8() & 255);
               var13 = (255 - (var7.n3() & 255)) * (var11 - 9) / 10 + (var7.n3() & 255);
               var14 = (255 - (var7.y4() & 255)) * (var11 - 9) / 10 + (var7.y4() & 255);
            }

            com.aspose.slides.internal.o9b.c8.n5(var3.s7() & 255, var12, var13, var14).n5(var8);
         default:
            if (var10 < 0.0F) {
               com.aspose.slides.internal.o9b.c8 var30 = var7.o8();
               var8.n5(var7);
               var30.n5(var8);
            }

            com.aspose.slides.internal.x4g.a6 var31 = a1v.n5(var6);
            if (var0.e2() == 1) {
               com.aspose.slides.internal.o9b.y1 var33 = var0.o0().y4();
               if (com.aspose.slides.ms.System.q1.n5(var0.i1()) > 0.1 || var0.e5() || var0.b3()) {
                  double var15 = var9 / 180.0 * Math.PI;
                  double var17 = com.aspose.slides.ms.System.q1.c8(var15);
                  double var19 = com.aspose.slides.ms.System.q1.h0(var15);
                  if (var0.e5()) {
                     var17 = -var17;
                  }

                  if (var0.b3()) {
                     var19 = -var19;
                  }

                  var9 = (float)(com.aspose.slides.ms.System.q1.u3(var19, var17) * 180.0 / Math.PI);
                  if (var0.m3() != null) {
                     com.aspose.slides.internal.x4g.s7 var38 = (com.aspose.slides.internal.x4g.s7)var0.m3().deepClone();
                     var38.y4();
                     n5(var38, var0.o0().y4(), -var0.i1(), var0.f2().l6(), var0.f2().k5()).a6(var33);
                     n5(null, var33.y4(), -var9, var0.f2().l6(), var0.f2().k5()).a6(var33);
                     var38.dispose();
                  } else {
                     n5(null, var0.o0().y4(), -var0.i1(), var0.f2().l6(), var0.f2().k5()).a6(var33);
                     n5(null, var33.y4(), -var9, var0.f2().l6(), var0.f2().k5()).a6(var33);
                  }

                  n5(
                        null,
                        new com.aspose.slides.internal.o9b.y1(var33.x8(), var0.f2().k5(), var33.s7(), 0.0F),
                        var9 + var0.i1(),
                        var0.f2().l6(),
                        var0.f2().k5()
                     )
                     .a6(var33);
                  if (var33.s7() < 1.0F) {
                     var33.l6(1.0F);
                  }

                  if (var33.k5() < 1.0F) {
                     var33.n5(1.0F);
                  }

                  var9 += var0.i1();
               }

               com.aspose.slides.internal.o9b.y1 var35 = a1v.n5(var0.k7().n5(var33.y4()).y4()).y4();
               if (var9 == 180.0F) {
                  var35.n5(var35.s7() + 45.0F);
               }

               com.aspose.slides.internal.x4g.z3 var37 = new com.aspose.slides.internal.x4g.z3(var35.y4(), var7.o8(), var8.o8(), var9);
               var37.n5(3);
               if (var31 != null) {
                  var37.n5(var31);
               } else {
                  var37.u3(com.aspose.slides.ms.System.q1.n5(var10), 1.0F);
               }

               var37.l6(var0.z8(), 1);
               return var37;
            } else {
               com.aspose.slides.internal.o9b.y1 var32 = l6(var0).y4();
               com.aspose.slides.internal.o9b.w1[] var34 = new com.aspose.slides.internal.o9b.w1[]{
                  new com.aspose.slides.internal.o9b.w1(var32.a6(), var32.t2()),
                  new com.aspose.slides.internal.o9b.w1(var32.h0(), var32.t2()),
                  new com.aspose.slides.internal.o9b.w1(var32.h0(), var32.l6()),
                  new com.aspose.slides.internal.o9b.w1(var32.a6(), var32.l6())
               };
               float var36 = var0.i1();
               com.aspose.slides.internal.x4g.s7 var22 = var0.m3();
               com.aspose.slides.internal.o9b.y1 var23 = var0.k7().n5(var32.y4()).y4();
               s4s var24 = var0.m1().l6();
               d2k var21 = var24.n5.u3();
               if (var21.n5 != 0.0F) {
                  var21.n5 = var21.n5 + var24.l6.n5 / 2.0F;
               }

               if (var21.l6 != 0.0F) {
                  var21.l6 = var21.l6 + var24.l6.l6 / 2.0F;
               }

               var21.n5 = var32.x8() + var21.n5 * var32.s7();
               var21.l6 = var32.n3() + var21.l6 * var32.k5();
               switch (var0.t9()) {
                  case 1:
                     var22 = new com.aspose.slides.internal.x4g.s7();
                     var22.l6(var23.y4());
                     break;
                  case 2:
                     float var25 = var23.x8() + var23.s7() / 2.0F;
                     float var26 = var23.n3() + var23.k5() / 2.0F;
                     float var27 = (float)com.aspose.slides.ms.System.q1.z3(var23.s7() * var23.s7() + var23.k5() * var23.k5());
                     var22 = new com.aspose.slides.internal.x4g.s7();
                     var22.n5(var25 - var27 / 2.0F, var26 - var27 / 2.0F, var27, var27);
                     break;
                  case 3:
                     var36 = 0.0F;
               }

               com.aspose.slides.internal.x4g.m3 var28;
               if (var22 != null && var22.h0() > 0 && var22.s7().k5() > 0.0F) {
                  var28 = new com.aspose.slides.internal.x4g.m3(var22);
               } else {
                  var28 = new com.aspose.slides.internal.x4g.m3(var34);
               }

               var28.n5(new com.aspose.slides.internal.o9b.c8[]{var8});
               var28.n5(var7.o8());
               switch (var0.e2()) {
                  case 2:
                     var28.n5(new com.aspose.slides.internal.o9b.w1(var32.a6(), var32.t2()));
                     break;
                  case 3:
                     var28.n5(new com.aspose.slides.internal.o9b.w1(var32.h0(), var32.t2()));
                     break;
                  case 4:
                     var28.n5(new com.aspose.slides.internal.o9b.w1(var32.a6(), var32.l6()));
                     break;
                  case 5:
                     var28.n5(new com.aspose.slides.internal.o9b.w1(var32.h0(), var32.l6()));
                     break;
                  default:
                     var28.n5(new com.aspose.slides.internal.o9b.w1(var21.n5, var21.l6));
                     if (var0.t9() != 2 && d2k.k5(var24.n5, d2k.k5)) {
                        var28.l6(new com.aspose.slides.internal.o9b.w1(var24.l6.n5, var24.l6.l6));
                     }
               }

               if (var31 != null) {
                  if (var28.x8().n5() && var0.t9() != 2) {
                     var28.l6(new com.aspose.slides.internal.o9b.w1(var24.l6.n5 / 10.0F, var24.l6.l6 / 10.0F));
                  }

                  var28.n5(var31);
               } else {
                  var28.k5(com.aspose.slides.ms.System.q1.n5(var10), 1.0F);
               }

               if (com.aspose.slides.ms.System.q1.n5(var36) > 0.1) {
                  float var39 = var0.f2().l6();
                  float var40 = var0.f2().k5();
                  var28.k5(var39, var40, 0);
                  var28.l6(var36, 0);
                  var28.k5(-var39, -var40, 0);
               }

               if (var0.e5() || var0.b3()) {
                  var28.l6(com.aspose.slides.internal.n8e.n1.n5(var0.e5() ? -1.0F : 1.0F, var0.b3() ? -1.0F : 1.0F, var0.f2().l6(), var0.f2().k5()), 0);
               }

               if (var0.j5() != null) {
                  var0.n5(var28);
               }

               return var28;
            }
      }
   }

   private static com.aspose.slides.internal.o9b.y1 l6(u4z var0) {
      if (var0.i1() != 0.0F) {
         return n5(var0.m3(), var0.o0().y4(), -var0.i1(), var0.f2().l6(), var0.f2().k5());
      } else {
         return var0.m3() != null ? com.aspose.slides.internal.o9b.y1.l6(var0.m3().s7().y4(), var0.o0().y4()) : var0.o0();
      }
   }

   private static com.aspose.slides.internal.o9b.u6 n5(m2a var0, float var1, com.aspose.slides.internal.o9b.l6 var2) {
      com.aspose.slides.internal.o9b.u6 var3 = new com.aspose.slides.internal.o9b.u6(var2);
      if (com.aspose.slides.ms.System.q1.n5(var0.i1()) > 0.1) {
         var3.u3(var0.f2().l6(), var0.f2().k5(), 0);
         var3.l6(var0.i1(), 0);
         var3.u3(-var0.f2().l6(), -var0.f2().k5(), 0);
      }

      if (var0.e5() || var0.b3()) {
         var3.l6(com.aspose.slides.internal.n8e.n1.n5(var0.e5() ? -1.0F : 1.0F, var0.b3() ? -1.0F : 1.0F, var0.f2().l6(), var0.f2().k5()), 0);
      }

      float var4 = var1 / n5;
      var3.k5(var4, var4);
      var2.dispose();
      return var3;
   }

   private static com.aspose.slides.internal.o9b.u6 l6(q3d var0, e3 var1, com.aspose.slides.internal.o9b.y1[] var2) {
      com.aspose.slides.internal.o9b.w1 var3 = var0.f2().u3();
      com.aspose.slides.internal.o9b.y1 var4 = (var0.i1() == 0.0F ? var0.o0() : n5(var0.e2(), var0.o0().y4(), -var0.i1(), var3.l6(), var3.k5())).y4();
      com.aspose.slides.internal.o9b.t4 var5 = var0.y1();
      if (com.aspose.slides.internal.n8e.k7.l6(var5)) {
         com.aspose.slides.internal.j9e.c8 var6 = new com.aspose.slides.internal.j9e.c8(var5.u9()[0].k5());
         var5.n5(var6, var0.t2());
         var5 = new com.aspose.slides.internal.o9b.l6(var5);
      }

      com.aspose.slides.internal.k9.u9 var15 = var0.c4();
      if (var15 != null && var15.u3() && com.aspose.slides.internal.n8e.k7.h0(var15.a6())
         || com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.j9e.y4.class)) {
         byte[] var7 = var0.c4().a6();
         new com.aspose.slides.internal.o9b.f2();
         com.aspose.slides.internal.o9b.f2 var8;
         if (com.aspose.slides.internal.v6g.k5.l6(var1, r1c.class)) {
            var8 = new com.aspose.slides.internal.o9b.f2(var4.s7() * 4.0F, var4.k5() * 4.0F);
         } else {
            var8 = new com.aspose.slides.internal.o9b.f2(var4.s7() * 4.0F, var4.k5() * 4.0F);
         }

         var5 = com.aspose.slides.internal.n8e.k7.n5(var7, var8.a6());
         var2[0] = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var5.e2(), var5.h0());
      }

      com.aspose.slides.internal.o9b.p8 var16 = var5.n3().u3();
      byte var17 = 4;
      float var9 = var4.s7() / var2[0].s7();
      float var10 = var4.k5() / var2[0].k5();
      byte var11 = 10;
      if (var9 >= var11 || var10 >= var11) {
         var17 = 0;
         var4.k5(var4.x8() + var9 / 2.0F);
         var4.u3(var4.n3() + var10 / 2.0F);
      }

      com.aspose.slides.internal.o9b.u6 var12 = com.aspose.slides.internal.n2d.y4.n5(
         var5, var17, var16.u3(), com.aspose.slides.internal.v6g.k5.l6(var1, w2.class)
      );
      if (com.aspose.slides.ms.System.q1.n5(var0.i1()) > 0.1) {
         float var13 = var3.l6();
         float var14 = var3.k5();
         var12.u3(var13, var14, 0);
         var12.l6(var0.i1(), 0);
         var12.u3(-var13, -var14, 0);
      }

      if (var0.e5() || var0.b3()) {
         var12.l6(com.aspose.slides.internal.n8e.n1.n5(var0.e5() ? -1.0F : 1.0F, var0.b3() ? -1.0F : 1.0F, var3.l6(), var3.k5()), 0);
      }

      var12.u3(var4.x8(), var4.n3(), 0);
      var12.k5(var9, var10, 0);
      var12.u3(-var2[0].x8(), -var2[0].n3(), 0);
      return var12;
   }

   private static com.aspose.slides.internal.o9b.u6 n5(float var0, q3d var1) {
      com.aspose.slides.internal.o9b.t4 var2 = var1.y1();
      com.aspose.slides.internal.o9b.u6 var3 = com.aspose.slides.internal.n2d.y4.n5(var2);
      float var4 = var1.o0().x8();
      float var5 = var1.o0().n3();
      float var6 = com.aspose.slides.internal.n2d.m1.n5(var2);
      float var7 = com.aspose.slides.internal.n2d.m1.l6(var2);
      com.aspose.slides.internal.k9.u9 var8 = var1.c4();
      if (var8 != null && var8.u3() && com.aspose.slides.internal.n8e.k7.h0(var8.a6())
         || com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.j9e.y4.class)) {
         var7 = 96.0F;
         var6 = 96.0F;
      }

      float var9 = var3.s7().l6() * var0 / var6 * var1.z8().n5;
      float var10 = var3.s7().k5() * var0 / var7 * var1.z8().l6;
      com.aspose.slides.internal.o9b.y1 var11 = (var1.i1() == 0.0F ? var1.o0() : n5(var1.e2(), var1.o0().y4(), -var1.i1(), var1.f2().l6(), var1.f2().k5()))
         .y4();
      switch (var1.k7()) {
         case 1:
            var4 = var11.a6() + (var11.s7() - var9) / 2.0F;
            break;
         case 2:
            var4 = var11.h0() - var9;
            break;
         case 3:
            var5 = var11.t2() + (var11.k5() - var10) / 2.0F;
            break;
         case 4:
            var4 = var11.a6() + (var11.s7() - var9) / 2.0F;
            var5 = var11.t2() + (var11.k5() - var10) / 2.0F;
            break;
         case 5:
            var4 = var11.h0() - var9;
            var5 = var11.t2() + (var11.k5() - var10) / 2.0F;
            break;
         case 6:
            var5 = var11.l6() - var10;
            break;
         case 7:
            var4 = var11.a6() + (var11.s7() - var9) / 2.0F;
            var5 = var11.l6() - var10;
            break;
         case 8:
            var4 = var11.h0() - var9;
            var5 = var11.l6() - var10;
      }

      var3.n5(var1.z3());
      if (com.aspose.slides.ms.System.q1.n5(var1.i1()) > 0.1) {
         var3.u3(var1.f2().l6(), var1.f2().k5(), 0);
         var3.l6(var1.i1(), 0);
         var3.u3(-var1.f2().l6(), -var1.f2().k5(), 0);
      }

      if (var1.e5() || var1.b3()) {
         var3.l6(com.aspose.slides.internal.n8e.n1.n5(var1.e5() ? -1.0F : 1.0F, var1.b3() ? -1.0F : 1.0F, var1.f2().l6(), var1.f2().k5()), 0);
      }

      var3.u3(var4 + var1.m1().n5, var5 + var1.m1().l6, 0);
      var3.k5(var0 / var6 * var1.z8().n5, var0 / var7 * var1.z8().l6);
      return var3;
   }

   public static com.aspose.slides.internal.o9b.u3 k5(a1v var0) {
      return n5(var0, null);
   }

   public static com.aspose.slides.internal.o9b.u3 n5(a1v var0, e3 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var0, y4f.class)) {
         com.aspose.slides.internal.v6g.k5.n5(var0, y4f.class).z7();
      }

      switch (var0.u3()) {
         case 1:
            return new com.aspose.slides.internal.o9b.i1(var0.n5().o8());
         case 2:
            return n5((u4z)var0);
         case 3:
            try {
               m2a var8 = (m2a)var0;
               return n5(var8, n5, (com.aspose.slides.internal.o9b.l6)var8.e2());
            } catch (RuntimeException var7) {
               com.aspose.slides.internal.n8e.v4.n5(var7);
               return new com.aspose.slides.internal.o9b.i1(var0.n5().o8());
            }
         case 4:
            try {
               q3d var2 = (q3d)var0;
               com.aspose.slides.internal.o9b.y1 var3 = var2.q0().y4();
               com.aspose.slides.internal.o9b.y1[] var4 = new com.aspose.slides.internal.o9b.y1[]{var3};
               com.aspose.slides.internal.o9b.u6 var5 = n5(var2, var1, var4);
               var4[0].a6(var3);
               var2.l6(var3.y4());
               return var5;
            } catch (RuntimeException var6) {
               com.aspose.slides.internal.n8e.v4.n5(var6);
               return new com.aspose.slides.internal.o9b.i1(var0.n5().o8());
            }
         default:
            return (com.aspose.slides.internal.o9b.u3)com.aspose.slides.internal.o9b.a6.k5().deepClone();
      }
   }

   public static com.aspose.slides.internal.o9b.u6 n5(q3d var0, e3 var1, com.aspose.slides.internal.o9b.y1[] var2) {
      return var0.z1() == 1 ? l6(var0, var1, var2) : n5(n5, var0);
   }

   public static com.aspose.slides.internal.o9b.y1 n5(
      com.aspose.slides.internal.x4g.s7 var0, com.aspose.slides.internal.o9b.y1 var1, float var2, float var3, float var4
   ) {
      com.aspose.slides.internal.x4g.m1 var5 = new com.aspose.slides.internal.x4g.m1();
      var5.n5(var2, new com.aspose.slides.internal.o9b.w1(var3, var4));
      com.aspose.slides.internal.o9b.w1[] var7;
      if (var0 != null && var0.h0() > 2) {
         int var6 = var0.h0();
         var7 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var6)
         );
         com.aspose.slides.internal.o9b.w1[] var8 = var0.a6();

         for (int var9 = 0; var9 < var6; var9++) {
            var8[var9].n5(var7[var9]);
         }
      } else {
         var7 = new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(var1.a6(), var1.t2()),
            new com.aspose.slides.internal.o9b.w1(var1.h0(), var1.t2()),
            new com.aspose.slides.internal.o9b.w1(var1.h0(), var1.l6()),
            new com.aspose.slides.internal.o9b.w1(var1.a6(), var1.l6())
         };
      }

      var5.n5(var7);
      float var12;
      float var14 = var12 = var7[0].l6();
      float var13;
      float var10 = var13 = var7[0].k5();

      for (int var11 = 1; var11 < var7.length; var11++) {
         if (var14 > var7[var11].l6()) {
            var14 = var7[var11].l6();
         }

         if (var12 < var7[var11].l6()) {
            var12 = var7[var11].l6();
         }

         if (var10 > var7[var11].k5()) {
            var10 = var7[var11].k5();
         }

         if (var13 < var7[var11].k5()) {
            var13 = var7[var11].k5();
         }
      }

      return new com.aspose.slides.internal.o9b.y1(var14, var10, var12 - var14, var13 - var10);
   }
}
