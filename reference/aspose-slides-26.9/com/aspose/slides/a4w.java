package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

final class a4w {
   private int n3;
   private int y4;
   static final com.aspose.slides.internal.j9e.s7 n5 = h0();
   final Dictionary<String, String> l6;
   private final Dictionary<String, Integer> e2 = new Dictionary<>();
   private final Dictionary<String, String> t9 = new Dictionary<>();
   final List<String> k5 = new List<>();
   final Dictionary<String, a4w$l6> u3;
   final Dictionary<String, a4w$n5> a6;
   final Dictionary<String, a4w$k5> u9;
   final Dictionary<String, a4w$u9> h0;
   final Dictionary<String, a4w$u3> c8;
   final Dictionary<String, a4w$a6> t2;
   final Dictionary<String, Object> s7;
   private final v3s z1;
   private j0v[] t4 = new j0v[0];
   private String[] q0 = new String[0];
   List<String> x8;
   private static final com.aspose.slides.internal.v6g.u9 z3 = new com.aspose.slides.internal.v6g.u9("image/x-wmf", "image/x-emf", "image/jpeg");

   public a4w(v3s var1) {
      this.z1 = var1;
      this.u3 = new Dictionary<>();
      this.a6 = new Dictionary<>();
      this.u9 = new Dictionary<>();
      this.h0 = new Dictionary<>();
      this.c8 = new Dictionary<>();
      this.t2 = new Dictionary<>();
      this.l6 = new Dictionary<>();
      this.s7 = new Dictionary<>();
      this.x8 = new List<>();
   }

   final v3s n5() {
      return this.z1;
   }

   public final int l6() {
      return this.y4;
   }

   public final void n5(int var1) {
      this.y4 = var1;
   }

   public final j0v[] k5() {
      return this.t4;
   }

   public final void n5(j0v[] var1) {
      this.t4 = var1;
   }

   public final String[] u3() {
      return this.q0;
   }

   public final void n5(String[] var1) {
      this.q0 = var1;
   }

   final String n5(String var1, String var2) {
      String var3 = null;
      String[] var4 = new String[]{var3};
      boolean var5 = !this.t9.tryGetValue(var1, var4);
      var3 = var4[0];
      if (var5) {
         int var6 = 0;
         Integer[] var7 = new Integer[]{var6};
         this.e2.tryGetValue(var2, var7);
         var6 = var7[0];
         this.e2.set_Item(var2, ++var6);
         var3 = com.aspose.slides.ms.System.d1.n5(new String[]{var2, com.aspose.slides.ms.System.a3.l6(var6)});
         this.t9.set_Item(var1, var3);
      }

      return var3;
   }

   final String n5(String var1) {
      String var2 = null;
      String[] var3 = new String[]{var2};
      boolean var4 = !this.t9.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         var2 = null;
      }

      return var2;
   }

   final String l6(String var1) {
      int var2 = 0;
      Integer[] var3 = new Integer[]{var2};
      this.e2.tryGetValue(var1, var3);
      var2 = var3[0];
      this.e2.set_Item(var1, ++var2);
      return com.aspose.slides.ms.System.d1.n5(new String[]{var1, com.aspose.slides.ms.System.a3.l6(var2)});
   }

   public final String k5(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5(new String[]{"clp_", com.aspose.slides.ms.System.a3.n5(this.n3++, com.aspose.slides.internal.x7n.l6.k5())});
      if (this.l6.containsKey(var1)) {
         var2 = this.l6.get_Item(var1);
      } else {
         this.l6.addItem(var1, var2);
      }

      return var2;
   }

   final String n5(u4z var1) {
      float var2 = var1.k5(var1.q0() - 180) + var1.i1();
      SortedList var3 = l6(var1);
      if (var1.e2() == 1) {
         var2 = com.aspose.slides.internal.v6g.k5.u3(var2 / 1.0F + 0.5F, 13) * 1.0F;
         com.aspose.slides.internal.o9b.y1 var16 = var1.k7().n5(var1.o0().y4()).y4();
         float var30;
         float var31;
         if (com.aspose.slides.ms.System.q1.n5(var1.i1()) > 0.1) {
            com.aspose.slides.internal.o9b.w1[] var17 = new com.aspose.slides.internal.o9b.w1[]{
               new com.aspose.slides.internal.o9b.w1(var16.a6(), var16.t2()),
               new com.aspose.slides.internal.o9b.w1(var16.h0(), var16.t2()),
               new com.aspose.slides.internal.o9b.w1(var16.h0(), var16.l6()),
               new com.aspose.slides.internal.o9b.w1(var16.a6(), var16.l6())
            };
            com.aspose.slides.internal.x4g.m1 var19 = new com.aspose.slides.internal.x4g.m1();
            var19.n5(-var1.i1(), var1.f2().u3());
            var19.n5(var17);
            float var21 = n5(var17[0].l6(), var17[0].k5(), var2);
            var30 = var21;
            var31 = var21;

            for (int var32 = 1; var32 < var17.length; var32++) {
               var21 = n5(var17[var32].l6(), var17[var32].k5(), var2);
               if (var31 > var21) {
                  var31 = var21;
               }

               if (var30 < var21) {
                  var30 = var21;
               }
            }
         } else {
            float var23 = n5(var16.a6(), var16.t2(), var2);
            var30 = var23;
            var31 = var23;
            var23 = n5(var16.h0(), var16.t2(), var2);
            if (var31 > var23) {
               var31 = var23;
            }

            if (var30 < var23) {
               var30 = var23;
            }

            var23 = n5(var16.h0(), var16.l6(), var2);
            if (var31 > var23) {
               var31 = var23;
            }

            if (var30 < var23) {
               var30 = var23;
            }

            var23 = n5(var16.a6(), var16.l6(), var2);
            if (var31 > var23) {
               var31 = var23;
            }

            if (var30 < var23) {
               var30 = var23;
            }
         }

         float var18 = (var30 - var31) * 2.0F;
         float var20 = var31 % var18;
         if (var20 < 0.0F) {
            var20 += var18;
         }

         a4w$k5 var33 = new a4w$k5(
            com.aspose.slides.internal.v6g.k5.u3(var2, 13),
            var3,
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var18 * 4096.0F), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var20 / var18 * 256.0F), 14)
         );
         return this.n5(var33);
      } else {
         float var8 = 0.0F;
         com.aspose.slides.internal.o9b.y1 var5 = var1.o0().y4();
         if (var5.s7() <= 0.0F) {
            var5.l6(1.0F);
         }

         int var6 = com.aspose.slides.internal.v6g.k5.u3(var5.k5() / var5.s7() * 16.0F, 13);
         if (var6 == 0) {
            var6 = 1;
         }

         float var10 = var6 / 16.0F;
         float var4;
         float var7;
         switch (var1.e2()) {
            case 2:
               var4 = var5.a6();
               var7 = var5.t2();
               break;
            case 3:
               var4 = var5.h0();
               var7 = var5.t2();
               break;
            case 4:
               var4 = var5.a6();
               var7 = var5.l6();
               break;
            case 5:
               var4 = var5.h0();
               var7 = var5.l6();
               break;
            case 6:
            default:
               com.aspose.slides.internal.o9b.y1 var11 = var1.k7().n5(var5.y4()).y4();
               var4 = (var11.a6() + var11.h0()) / 2.0F;
               var7 = (var11.t2() + var11.l6()) / 2.0F;
         }

         float var9;
         int var34;
         if (var1.m3() != null && var1.m3().h0() >= 3) {
            com.aspose.slides.internal.o9b.w1[] var37 = var1.m3().a6();
            var9 = 0.0F;

            for (int var13 = 0; var13 < var37.length; var13++) {
               float var14 = n5(var4, var7, var37[var13].l6(), var37[var13].k5(), var10);
               if (var14 > var9) {
                  var9 = var14;
               }

               var8 += var14;
            }

            var34 = var37.length;
         } else {
            var9 = n5(var4, var7, var5.a6(), var5.t2(), var10);
            var8 += var9;
            float var12 = n5(var4, var7, var5.h0(), var5.t2(), var10);
            if (var12 > var9) {
               var9 = var12;
            }

            var8 += var12;
            var12 = n5(var4, var7, var5.h0(), var5.l6(), var10);
            var8 += var12;
            if (var12 > var9) {
               var9 = var12;
            }

            var12 = n5(var4, var7, var5.a6(), var5.l6(), var10);
            var8 += var12;
            if (var12 > var9) {
               var9 = var12;
            }

            var34 = 4;
         }

         a4w$u9 var38 = new a4w$u9(
            var3,
            com.aspose.slides.internal.v6g.k5.u3(var4 + 0.5, 14),
            com.aspose.slides.internal.v6g.k5.u3(var7 + 0.5, 14),
            com.aspose.slides.internal.v6g.k5.u3(var9 + 0.5, 14),
            com.aspose.slides.internal.v6g.k5.u3(var8 / var34 + 0.5, 14),
            var6
         );
         return this.n5(var38);
      }
   }

   final String n5(
      u4z var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1 var4,
      com.aspose.slides.internal.o9b.y1 var5
   ) {
      if (var1.t9() == 2) {
         float var19 = 0.0F;
         float var20 = n5(var4.l6(), var4.k5(), var2.l6(), var2.k5(), 1.0F);
         if (var20 > var19) {
            var19 = var20;
         }

         SortedList var21 = l6(var1);
         a4w$u9 var22 = new a4w$u9(
            var21,
            com.aspose.slides.internal.v6g.k5.u3(var4.l6() + 0.5, 14),
            com.aspose.slides.internal.v6g.k5.u3(var4.k5() + 0.5, 14),
            com.aspose.slides.internal.v6g.k5.u3(var19 + 0.5, 14),
            0,
            16
         );
         return this.n5(var22);
      } else {
         float var6 = var2.l6() - var3.l6();
         float var7 = var2.k5() - var3.k5();
         float var8 = (var7 * (var4.l6() - var3.l6()) - var6 * (var4.k5() - var3.k5())) / (var7 * var7 + var6 * var6);
         float var9 = -var7 * var8;
         float var10 = var6 * var8;
         float var11 = (float)(com.aspose.slides.ms.System.q1.u3(var10, var9) * 180.0 / Math.PI);
         var11 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var11 / 1.0F), 14) * 1.0F;
         float var12 = n5(var4.l6(), var4.k5(), var11);
         float var13 = var12;
         float var14 = var12;
         var12 = n5(var4.l6() + var9, var4.k5() + var10, var11);
         if (var13 > var12) {
            var13 = var12;
         }

         if (var14 < var12) {
            var14 = var12;
         }

         float var15 = (var14 - var13) * 2.0F;
         float var16 = var13 % var15;
         if (var16 < 0.0F) {
            var16 += var15;
         }

         SortedList var17 = l6(var1);
         a4w$k5 var18 = new a4w$k5(
            com.aspose.slides.internal.v6g.k5.u3(var11, 13),
            var17,
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var15 * 4096.0F), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var16 / var15 * 256.0F), 14)
         );
         return this.n5(var18);
      }
   }

   final String n5(a4w$u9 var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5(new Object[]{
         "rg_",
         n5(var1.n5),
         '_',
         com.aspose.slides.ms.System.Xml.f4.n5(var1.l6),
         '_',
         com.aspose.slides.ms.System.Xml.f4.n5(var1.k5),
         '_',
         com.aspose.slides.ms.System.Xml.f4.n5(var1.u3),
         '_',
         com.aspose.slides.ms.System.Xml.f4.n5(var1.a6),
         '_',
         com.aspose.slides.ms.System.a3.n5(var1.u9, "x")
      });
      if (!this.h0.containsKey(var2)) {
         this.h0.set_Item(var2, var1);
      }

      return var2;
   }

   final String n5(a4w$k5 var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5(new Object[]{
         "lg_",
         n5(var1.l6),
         '_',
         com.aspose.slides.ms.System.Xml.f4.n5(var1.n5),
         '_',
         com.aspose.slides.ms.System.a3.n5(var1.u3, "x"),
         '_',
         com.aspose.slides.ms.System.a3.n5(var1.k5, "x")
      });
      if (!this.u9.containsKey(var2)) {
         this.u9.set_Item(var2, var1);
      }

      return var2;
   }

   private static SortedList<Float, com.aspose.slides.internal.o9b.c8> l6(u4z var0) {
      SortedList var1 = var0.t4();
      if (var1 == null) {
         com.aspose.slides.internal.o9b.c8 var2 = var0.n5().o8();
         com.aspose.slides.internal.o9b.c8 var3 = var0.l6().o8();
         if (var0.y4() == 1) {
            int var4 = var0.z1();
            int var5;
            int var6;
            int var7;
            if (var4 < 10) {
               var5 = (var2.x8() & 255) * var4 / 9;
               var6 = (var2.n3() & 255) * var4 / 9;
               var7 = (var2.y4() & 255) * var4 / 9;
            } else {
               var5 = (255 - (var2.x8() & 255)) * (var4 - 9) / 10 + (var2.x8() & 255);
               var6 = (255 - (var2.n3() & 255)) * (var4 - 9) / 10 + (var2.n3() & 255);
               var7 = (255 - (var2.y4() & 255)) * (var4 - 9) / 10 + (var2.y4() & 255);
            }

            com.aspose.slides.internal.o9b.c8.n5(var0.l6().s7() & 255, var5, var6, var7).n5(var3);
         }

         var1 = new SortedList(2);
         var1.set_Item(0.0F, var2.o8());
         var1.set_Item(1.0F, var3.o8());
      }

      return var1;
   }

   private static String n5(SortedList<Float, com.aspose.slides.internal.o9b.c8> var0) {
      int var1 = var0.size();
      if (var1 < 1) {
         return "";
      }

      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5(11 * var1 - 4);
      com.aspose.slides.internal.o9b.c8 var3 = ((com.aspose.slides.internal.o9b.c8)var0.getValues().get_Item(0)).o8();
      if ((var3.s7() & 255) != 255) {
         var2.n5(com.aspose.slides.ms.System.e2.n5(var3.s7(), "x2"));
      }

      var2.n5("{0:x2}{1:x2}{2:x2}", var3.x8(), var3.n3(), var3.y4());

      for (int var4 = 1; var4 < var1 - 1; var4++) {
         var2.n5('_');
         ((com.aspose.slides.internal.o9b.c8)var0.getValues().get_Item(var4)).n5(var3);
         float var5 = (Float)var0.getKeys().get_Item(var4);
         var2.n5(n5(var5));
         if ((var3.s7() & 255) != 255) {
            var2.n5(com.aspose.slides.ms.System.e2.n5(var3.s7(), "x2"));
         }

         var2.n5("{0:x2}{1:x2}{2:x2}", var3.x8(), var3.n3(), var3.y4());
      }

      if (var1 > 1) {
         var2.n5('_');
         ((com.aspose.slides.internal.o9b.c8)var0.getValues().get_Item(var1 - 1)).n5(var3);
         if ((var3.s7() & 255) != 255) {
            var2.n5(com.aspose.slides.ms.System.e2.n5(var3.s7(), "x2"));
         }

         var2.n5("{0:x2}{1:x2}{2:x2}", var3.x8(), var3.n3(), var3.y4());
      }

      return var2.toString();
   }

   private static String n5(float var0) {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(var0 * 1296.0F, 13);
      if (var1 < 0) {
         var1 = 0;
      }

      if (var1 >= 1296) {
         var1 = 1295;
      }

      char[] var2 = new char[2];
      int var3 = var1 / 36;
      var2[0] = var3 < 10 ? (char)(48 + var3) : (char)(65 + var3 - 10);
      var3 = var1 % 36;
      var2[1] = var3 < 10 ? (char)(48 + var3) : (char)(65 + var3 - 10);
      return com.aspose.slides.ms.System.d1.n5(var2);
   }

   final String n5(q4b var1, m2a var2) {
      c3t var3 = null;
      if (var2.i1() != 0.0F) {
         var3 = c3t.n5(var2.i1(), var2.f2().l6(), var2.f2().k5());
      }

      com.aspose.slides.internal.x4g.m1 var4 = new com.aspose.slides.internal.x4g.m1(var1.q0().u3(), var1.q0().a6(), var1.q0().u9(), var1.q0().h0(), 0.0F, 0.0F);
      if (!var4.l6() && var4.k5()) {
         var4.h0();
         if (var3 == null) {
            var3 = new c3t(var4, 4);
         }
      }

      String var8 = c3t.n5(var3);
      if (var8.length() != 0) {
         String var9 = com.aspose.slides.ms.System.d1.n5(var8, "-", "m");
         String var10 = com.aspose.slides.ms.System.d1.n5(var9, ")", com.aspose.slides.ms.System.d1.n5);
         var8 = com.aspose.slides.ms.System.d1.n5(new String[]{"_", com.aspose.slides.ms.System.d1.n5(var10, ".", "dot")});
      }

      String var5 = com.aspose.slides.ms.System.d1.n5(new Object[]{
         com.aspose.slides.ms.System.s3.n5(PatternStyle.class, var2.y4()),
         '_',
         com.aspose.slides.ms.System.e2.n5(var2.n5().s7(), "x2"),
         com.aspose.slides.ms.System.e2.n5(var2.n5().x8(), "x2"),
         com.aspose.slides.ms.System.e2.n5(var2.n5().n3(), "x2"),
         com.aspose.slides.ms.System.e2.n5(var2.n5().y4(), "x2"),
         '_',
         com.aspose.slides.ms.System.e2.n5(var2.l6().s7(), "x2"),
         com.aspose.slides.ms.System.e2.n5(var2.l6().x8(), "x2"),
         com.aspose.slides.ms.System.e2.n5(var2.l6().n3(), "x2"),
         com.aspose.slides.ms.System.e2.n5(var2.l6().y4(), "x2"),
         var8
      });
      String var6 = this.n5(var5, this.u9());
      if (!this.c8.containsKey(var5)) {
         com.aspose.slides.internal.o9b.t4 var7 = var2.e2();
         this.n5(
            var1, var6, new com.aspose.slides.internal.k9.u9(var7), null, var7.e2() * var1.e2(), var7.h0() * var1.e2(), com.aspose.slides.internal.j9e.x8.s7()
         );
         this.c8.set_Item(var5, new a4w$u3(var6, var7.e2(), var7.h0(), var3));
      }

      return var5;
   }

   final String n5(q4b var1, q3d var2) {
      if (var2.z1() != 0) {
         return "";
      }

      String var3 = var2.t4();
      String var4 = this.n5(var3, this.u9());
      com.aspose.slides.internal.o9b.y1 var5 = var2.l6(var1.y4() * w5k.n5()).y4();
      var5.k5(var5.x8() % var5.s7());
      var5.u3(var5.n3() % var5.k5());
      int var6 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var5.x8()), 14);
      int var7 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var5.n3()), 14);
      int var8 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var5.h0()), 14) - var6;
      int var9 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var5.l6()), 14) - var7;
      if (var9 < 1) {
         var9 = 1;
      }

      if (var8 < 1) {
         var8 = 1;
      }

      c3t var10 = null;
      if (var2.i1() != 0.0F) {
         var10 = c3t.n5(var2.i1(), var2.f2().l6(), var2.f2().k5());
      }

      String var11 = c3t.n5(var10);
      if (var11.length() != 0) {
         var11 = com.aspose.slides.ms.System.d1.n5(new Object[]{'_', var11});
      }

      var3 = this.n5(
         com.aspose.slides.ms.System.d1.n5(
            "tx_{0}_{1}_{2}_{3}_{4}{5}",new Object[]{
            var3,
            com.aspose.slides.ms.System.Xml.f4.n5(var6),
            com.aspose.slides.ms.System.Xml.f4.n5(var7),
            com.aspose.slides.ms.System.Xml.f4.n5(var8),
            com.aspose.slides.ms.System.Xml.f4.n5(var9),
            var11
         }),
         "tx"
      );
      if (!this.c8.containsKey(var3)) {
         if (var2.z8().n5 == 1.0F && var2.z8().l6 == 1.0F && (var2.q0().k5() % var9 > var9 * 0.3F || var2.q0().s7() % var8 > var8 * 0.3F)) {
            com.aspose.slides.internal.o9b.t4 var12 = var2.y1();
            if (var12 == null) {
               throw new NullReferenceException("Image couldn't be empty.");
            }

            int var13 = var12.s7();
            if (var13 < 2498570) {
               var13 = 2498570;
            }

            com.aspose.slides.internal.o9b.l6 var14 = new com.aspose.slides.internal.o9b.l6(var8, var9, var13);
            com.aspose.slides.internal.k9.u9 var15 = var2.c4();
            if (var15 != null && var15.u3() && com.aspose.slides.internal.n8e.k7.h0(var15.a6())) {
               var14 = com.aspose.slides.internal.n8e.k7.n5(var15.a6(), new com.aspose.slides.internal.o9b.f2(var8, var9));
            } else {
               com.aspose.slides.internal.o9b.z1 var16 = com.aspose.slides.internal.o9b.z1.n5(var14);

               try {
                  com.aspose.slides.internal.o9b.y1 var17 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var8, var9);
                  var16.k5(7);
                  var16.n5(var12, var17.y4(), var2.q0().y4(), 2);
               } finally {
                  if (var16 != null) {
                     var16.dispose();
                  }
               }
            }

            this.n5(var1, var4, new com.aspose.slides.internal.k9.u9(var14), null, var8, var9, com.aspose.slides.internal.j9e.x8.s7());
         } else {
            this.n5(var1, var4, null, var2.c4(), var8, var9, com.aspose.slides.internal.j9e.x8.s7());
         }

         this.c8.set_Item(var3, new a4w$u3(var4, var6, var7, var8, var9, var10));
      }

      return var3;
   }

   final String n5(q4b var1, l6v var2, boolean var3, float[] var4) {
      var4[0] = 0.0F;
      byte var5 = var3 ? var2.s7() : var2.x8();
      if (var5 == 0) {
         return "none";
      }

      byte var6 = var3 ? var2.n3() : var2.y4();
      byte var7 = var3 ? var2.e2() : var2.t9();
      com.aspose.slides.internal.o9b.c8 var8 = var2.h0().o8();
      String var9 = this.n5(
         com.aspose.slides.ms.System.d1.n5(new Object[]{
            var3 ? "ms_" : "me_",
            com.aspose.slides.ms.System.s3.n5(LineArrowheadStyle.class, var5),
            '_',
            com.aspose.slides.ms.System.a3.l6(var6),
            'x',
            com.aspose.slides.ms.System.a3.l6(var7),
            '_',
            com.aspose.slides.ms.System.n1.u9((float)var2.n5()),
            '_',
            com.aspose.slides.ms.System.e2.n5(var8.s7(), "x2"),
            com.aspose.slides.ms.System.e2.n5(var8.x8(), "x2"),
            com.aspose.slides.ms.System.e2.n5(var8.n3(), "x2"),
            com.aspose.slides.ms.System.e2.n5(var8.y4(), "x2")
         }),
         "ah"
      );
      if (this.a6.containsKey(var9)) {
         var4[0] = this.a6.get_Item(var9).h0;
         return var9;
      }

      if (!var1.z1().getDisableLineEndCropping()) {
         l6v.n5(var5, var6, var7, var4);
      }

      this.a6.set_Item(var9, new a4w$n5(var5, var6, var7, var3, var8.o8(), (float)var2.n5(), var4[0]));
      return var9;
   }

   final String n5(q4b var1, q3d var2, com.aspose.slides.internal.x4g.s7 var3) {
      String var4 = var2.t4();
      String var5 = this.n5(var4, this.u9());
      com.aspose.slides.internal.o9b.y1 var6 = var2.q0().y4();
      com.aspose.slides.internal.o9b.y1 var7 = n5(var2.o0().y4()).y4();
      com.aspose.slides.internal.o9b.y1 var8 = n5(var6.y4()).y4();
      if (com.aspose.slides.ms.System.q1.n5(var2.i1()) > 0.1) {
         com.aspose.slides.internal.x4g.m1 var9 = new com.aspose.slides.internal.x4g.m1();
         var9.n5(var2.i1(), var2.f2().u3());
         com.aspose.slides.internal.x4g.s7 var10 = new com.aspose.slides.internal.x4g.s7();
         var10.l6(var7.y4());
         var10.n5(var9).a6(var7);
      }

      com.aspose.slides.internal.o9b.t4 var25 = var2.y1();
      com.aspose.slides.internal.k9.u9 var14;
      if (var2.o0().k5() == var6.k5() && var2.o0().s7() == var6.s7()) {
         var14 = var25 != null ? new com.aspose.slides.internal.k9.u9((com.aspose.slides.internal.o9b.t4)var25.deepClone()) : null;
      } else {
         if (var25 == null) {
            throw new NullReferenceException("Image couldn't be empty.");
         }

         int var26 = var25.s7();
         if (var26 < 2498570) {
            var26 = 2498570;
         }

         int var11 = var2.h0().u9 == null ? 72 : var2.h0().u9.t9();
         com.aspose.slides.internal.o9b.f2 var12 = new com.aspose.slides.internal.o9b.f2();
         if (var11 == 72) {
            var12 = new com.aspose.slides.internal.o9b.f2(var7.s7(), var7.k5());
         } else if (var11 == 0) {
            com.aspose.slides.internal.o9b.p8.n5(var25.n3()).l6(var12);
         } else {
            com.aspose.slides.internal.n8e.k7.n5(var11, var2.o0().c8().a6()).l6(var12);
         }

         if (var25.e2() <= var12.l6() && var25.h0() <= var12.k5()) {
            com.aspose.slides.internal.o9b.p8.n5(var25.n3()).l6(var12);
         }

         com.aspose.slides.internal.k9.u9 var13 = var2.c4();
         if ((var13 == null || !var13.u3() || !com.aspose.slides.internal.n8e.k7.h0(var13.a6()))
            && !com.aspose.slides.internal.v6g.k5.l6(var25, com.aspose.slides.internal.j9e.y4.class)) {
            com.aspose.slides.internal.o9b.l6 var15 = new com.aspose.slides.internal.o9b.l6(
               com.aspose.slides.internal.v6g.k5.u3(var12.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var12.k5(), 13), var26
            );
            com.aspose.slides.internal.o9b.z1 var16 = com.aspose.slides.internal.o9b.z1.n5(var15);

            try {
               com.aspose.slides.internal.o9b.y1 var17 = new com.aspose.slides.internal.o9b.y1(
                  0.0F, 0.0F, com.aspose.slides.internal.v6g.k5.u3(var12.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var12.k5(), 13)
               );
               var16.k5(7);
               var16.n5(var25, var17.y4(), var6.y4(), 2);
            } finally {
               if (var16 != null) {
                  var16.dispose();
               }
            }

            boolean var39 = var6.a6() < 0.0F || var6.t2() < 0.0F || var6.h0() > var25.e2() || var6.l6() > var25.h0();
            if ("image/jpeg".equals(var2.s3().getContentType()) && !var2.d2() && var6.s7() <= var25.e2() && var6.k5() <= var25.h0() && !var39) {
               var14 = new com.aspose.slides.internal.k9.u9(var1.n5(var15));
            } else {
               var14 = new com.aspose.slides.internal.k9.u9(var15);
            }
         } else {
            var14 = new com.aspose.slides.internal.k9.u9(com.aspose.slides.internal.n8e.k7.n5(var13.a6(), var12.a6()));
         }
      }

      if (var2.y4() != null && var2.y4().getFillOverlayEffect() != null && var3 != null) {
         com.aspose.slides.internal.o9b.u6 var27 = null;
         r1c var29 = new r1c(new com.aspose.slides.internal.o9b.l6(var1.s7(), var1.x8(), 139273), var1.s7(), var1.x8());
         var2.z7();

         try {
            com.aspose.slides.internal.o9b.y1 var32 = var6.y4();
            com.aspose.slides.internal.o9b.y1[] var35 = new com.aspose.slides.internal.o9b.y1[]{var32};
            var27 = d4.n5(var2, var29, var35);
            var35[0].a6(var32);
            var2.l6(var32.y4());
         } catch (RuntimeException var21) {
            com.aspose.slides.internal.n8e.v4.n5(var21);
         }

         if (var27 != null) {
            var14 = new com.aspose.slides.internal.k9.u9(var27.h0());
            var27.dispose();
         }
      }

      var5 = this.n5(var5, var14, var2.c4(), this.n5(var1, var7.c8().a6()).u3(), var8.y4(), false, com.aspose.slides.internal.j9e.x8.s7());
      com.aspose.slides.internal.o9b.y1 var28 = var7.y4();
      if (var3 != null) {
         com.aspose.slides.internal.x4g.m1 var30 = new com.aspose.slides.internal.x4g.m1();
         var30.n5(var2.i1(), var2.f2().u3());
         var3.n5(var30).a6(var28);
         if (var28.s7() > var7.s7() || var28.k5() > var7.k5()) {
            var28.l6((float)com.aspose.slides.ms.System.q1.l6((double)(var28.s7() + 0.5F)));
            var28.n5((float)com.aspose.slides.ms.System.q1.l6((double)(var28.k5() + 0.5F)));
         }
      }

      com.aspose.slides.internal.x4g.m1 var31 = new com.aspose.slides.internal.x4g.m1();
      if (com.aspose.slides.ms.System.q1.n5(var2.i1()) > 0.1) {
         float var33 = var2.f2().l6() - var28.x8();
         float var36 = var2.f2().k5() - var28.n3();
         var31.l6(var33, var36, 0);
         var31.n5(var2.i1(), 0);
         var31.l6(-var33, -var36, 0);
      }

      if (var2.e5() || var2.b3()) {
         var31.n5(
            com.aspose.slides.internal.n8e.n1.n5(var2.e5() ? -1.0F : 1.0F, var2.b3() ? -1.0F : 1.0F, var2.f2().l6() - var28.x8(), var2.f2().k5() - var28.n3()),
            0
         );
      }

      c3t var34 = new c3t(var31, 4);
      String var37 = c3t.n5(var34, "_{0}");
      String var38 = com.aspose.slides.ms.System.d1.n5(
         "im_",
         var4,
         "_",
         com.aspose.slides.ms.System.Xml.f4.n5(var7.x8()),
         "_",
         com.aspose.slides.ms.System.Xml.f4.n5(var7.n3()),
         "_",
         com.aspose.slides.ms.System.Xml.f4.n5(var7.s7()),
         "_",
         com.aspose.slides.ms.System.Xml.f4.n5(var7.k5()),
         var37
      );
      var4 = this.n5(var38, com.aspose.slides.ms.System.d1.n5("page{0}-im", new Object[]{this.l6()}));
      if (!this.t2.containsKey(var4)) {
         if (var3 != null) {
            this.t2.set_Item(var4, new a4w$a6(var5, n5(var28.y4()).y4(), var7.y4(), var34));
         } else {
            this.t2.set_Item(var4, new a4w$a6(var5, var28.y4(), var28.y4(), var34));
         }
      }

      return var4;
   }

   final String n5(String var1, String var2, byte[] var3, q4b var4, com.aspose.slides.internal.o9b.f2 var5, com.aspose.slides.internal.o9b.y1 var6) {
      String var7 = this.n5(var1, this.u9());
      com.aspose.slides.internal.j9e.x8 var8;
      switch (z3.n5(var2)) {
         case 0:
            var8 = com.aspose.slides.internal.j9e.x8.n3();
            break;
         case 1:
            var8 = com.aspose.slides.internal.j9e.x8.u3();
            break;
         case 2:
            var8 = com.aspose.slides.internal.j9e.x8.c8();
            break;
         default:
            var8 = com.aspose.slides.internal.j9e.x8.s7();
      }

      return this.n5(var7, new com.aspose.slides.internal.k9.u9(var3), null, this.n5(var4, var5.a6()).u3(), var6.y4(), var4.d2().n5(), var8);
   }

   private static float n5(float var0, float var1, float var2) {
      return (float)(var0 * com.aspose.slides.ms.System.q1.c8(var2 / 180.0F * Math.PI) + var1 * com.aspose.slides.ms.System.q1.h0(var2 / 180.0F * Math.PI));
   }

   private static float n5(float var0, float var1, float var2, float var3, float var4) {
      float var5 = var0 - var2;
      float var6 = (var1 - var3) / var4;
      return (float)com.aspose.slides.ms.System.q1.z3(var5 * var5 + var6 * var6);
   }

   private static com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.o9b.y1 var0) {
      float var1 = (float)com.aspose.slides.ms.System.q1.n5((double)(var0.x8()), 2);
      float var2 = (float)com.aspose.slides.ms.System.q1.n5((double)(var0.n3()), 2);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var0.s7(), 13);
      if (var3 < var0.s7() && var3 / 100 > 0.5F) {
         var3 = com.aspose.slides.internal.v6g.k5.u3(var0.s7() + 0.5F, 13);
      }

      int var4 = com.aspose.slides.internal.v6g.k5.u3(var0.k5(), 13);
      if (var4 < var0.k5() && var4 / 100 > 0.5F) {
         var4 = com.aspose.slides.internal.v6g.k5.u3(var0.k5() + 0.5F, 13);
      }

      return new com.aspose.slides.internal.o9b.y1(var1, var2, var3, var4);
   }

   private void n5(
      q4b var1,
      String var2,
      com.aspose.slides.internal.k9.u9 var3,
      com.aspose.slides.internal.k9.u9 var4,
      float var5,
      float var6,
      com.aspose.slides.internal.j9e.x8 var7
   ) {
      com.aspose.slides.internal.o9b.f2 var8 = new com.aspose.slides.internal.o9b.f2(var5, var6);
      com.aspose.slides.internal.o9b.y2 var9 = new com.aspose.slides.internal.o9b.y2(
         0, 0, com.aspose.slides.internal.v6g.k5.u3(var8.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var8.k5(), 13)
      );
      this.n5(var2, var3, var4, this.n5(var1, var8.a6()).u3(), com.aspose.slides.internal.o9b.y1.n5(var9).y4(), false, var7);
   }

   private String n5(
      String var1,
      com.aspose.slides.internal.k9.u9 var2,
      com.aspose.slides.internal.k9.u9 var3,
      com.aspose.slides.internal.o9b.p8 var4,
      com.aspose.slides.internal.o9b.y1 var5,
      boolean var6,
      com.aspose.slides.internal.j9e.x8 var7
   ) {
      String var8 = var1;
      a4w$l6 var9 = null;
      a4w$l6[] var10 = new a4w$l6[]{var9};
      boolean var11 = this.u3.tryGetValue(var1, var10);
      var9 = var10[0];
      if (var11) {
         com.aspose.slides.internal.k9.u9 var12 = var2;
         if (var12 == null) {
            var12 = var3;
         }

         com.aspose.slides.internal.k9.u9 var13 = var12;
         com.aspose.slides.internal.k9.u9 var14 = var9.n5();
         if ((!var13.u3() || com.aspose.slides.internal.n2d.n5.n5(var14.a6(), var13.a6()))
            && (!var13.l6() || var14.k5() == var13.k5() || var14.k5().e2() == var4.l6() && var14.k5().h0() == var4.k5())) {
            var9.k5.n5(com.aspose.slides.ms.System.q1.n5(var9.k5.l6(), var4.l6()));
            var9.k5.l6(com.aspose.slides.ms.System.q1.n5(var9.k5.k5(), var4.k5()));
         } else {
            var9 = new a4w$l6(var2, var3, var4.u3(), var5.y4(), var6, var7);
            var8 = this.l6(this.u9());
            this.u3.addItem(var8, var9);
         }
      } else {
         var9 = new a4w$l6(var2, var3, var4.u3(), var5.y4(), var6, var7);
         this.u3.set_Item(var1, var9);
      }

      return var8;
   }

   public final void a6() {
      long var1 = 1048576L;
      this.n5(1048576L);
   }

   public final void n5(long var1) {
      long var3 = 0L;
      List var5 = new List();
      Dictionary$Enumerator var6 = this.u3.iterator();

      try {
         while (var6.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var6.next();
            a4w$l6 var8 = (a4w$l6)var7.getValue();
            if (var8.n5 != null) {
               long var9 = var3 + (var8.n5.u3() && var8.n5.a6() != null ? var8.n5.a6().length : 0);
               if (var9 >= var1) {
                  var5.addItem(var7.getKey());
               } else {
                  var3 += var9;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      List$Enumerator var19 = var5.iterator();

      try {
         while (var19.hasNext()) {
            String var20 = (String)var19.next();
            if (this.u3.get_Item(var20).n5.l6()) {
               this.u3.get_Item(var20).n5.k5().dispose();
            }

            this.u3.removeItemByKey(var20);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            var19.dispose();
         }
      }
   }

   private com.aspose.slides.internal.o9b.p8 n5(q4b var1, com.aspose.slides.internal.o9b.f2 var2) {
      if (var1.d2().n5()) {
         return new com.aspose.slides.internal.o9b.p8(
            com.aspose.slides.internal.v6g.k5.u3(var2.l6() + 0.5, 14), com.aspose.slides.internal.v6g.k5.u3(var2.k5() + 0.5, 14)
         );
      }

      com.aspose.slides.internal.o9b.w1[] var3 = new com.aspose.slides.internal.o9b.w1[]{
         new com.aspose.slides.internal.o9b.w1(var2.l6(), 0.0F), new com.aspose.slides.internal.o9b.w1(0.0F, var2.k5())
      };
      com.aspose.slides.internal.n8e.n1.n5(var1.d2(), var3);
      com.aspose.slides.internal.o9b.w1 var4 = var3[0].u3();
      int var5 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.z3(var4.l6() * var4.l6() + var4.k5() * var4.k5()) + 0.5, 14);
      var3[1].n5(var4);
      int var6 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.z3(var4.l6() * var4.l6() + var4.k5() * var4.k5()) + 0.5, 14);
      return new com.aspose.slides.internal.o9b.p8(var5, var6);
   }

   private String u9() {
      return com.aspose.slides.ms.System.d1.n5("page{0}-pic", new Object[]{this.l6()});
   }

   final com.aspose.slides.internal.d8v.n5 n5(q4b var1) {
      com.aspose.slides.internal.d8v.n5 var2 = new com.aspose.slides.internal.d8v.n5();
      this.n5(var1, var2);
      this.n5(var2);
      this.l6(var2);
      this.l6(var1, var2);
      this.k5(var2);
      this.u3(var2);
      this.k5(var1, var2);
      return var2;
   }

   private void n5(q4b var1, com.aspose.slides.internal.d8v.n5 var2) {
      com.aspose.slides.internal.j9e.h0 var3 = new com.aspose.slides.internal.j9e.h0(1);
      var3.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, var1.z1().getJpegQuality());
      Dictionary$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            if (!this.s7.containsKey((String)var5.getKey())) {
               this.s7.addItem((String)var5.getKey(), var5.getValue());
               a4w$l6 var6 = (a4w$l6)var5.getValue();
               if (var6 != null) {
                  String var7 = null;
                  String var8 = null;
                  com.aspose.slides.internal.k9.u9 var9 = !this.n5(var6, var1.z1()) ? var6.l6 : var6.n5();
                  byte[] var10 = null;
                  boolean var11 = var9.u3();
                  if (!var11 || !com.aspose.slides.internal.n8e.k7.k5(var9.a6()) && !com.aspose.slides.internal.n8e.k7.l6(var9.a6())) {
                     if ((!var11 || !com.aspose.slides.internal.n8e.k7.t2(var9.a6())) && (var11 || !com.aspose.slides.internal.n8e.k7.l6(var9.k5()))) {
                        if (var11 && com.aspose.slides.internal.n8e.k7.u3(var9.a6())) {
                           var10 = var9.a6();
                           var7 = "image/png";
                           var8 = "png";
                        } else if (var11 && com.aspose.slides.internal.n8e.k7.a6(var9.a6())) {
                           var10 = var9.a6();
                           var7 = "image/jpeg";
                           var8 = "jpg";
                        }
                     } else {
                        var10 = var11 ? var9.a6() : com.aspose.slides.internal.n8e.k7.n5(var9.k5(), com.aspose.slides.internal.j9e.x8.u9());
                        var7 = "image/gif";
                        var8 = "gif";
                     }
                  } else {
                     float var12 = var1.z1().getMetafileRasterizationDpi() / (var1.y4() * w5k.n5()) * 4.0F / 2.0F;
                     com.aspose.slides.internal.o9b.f2 var13 = new com.aspose.slides.internal.o9b.f2(var6.k5.l6() * var12, var6.k5.k5() * var12);
                     if (var11) {
                        com.aspose.slides.internal.o9b.z1 var14 = com.aspose.slides.internal.n8e.k7.k5(var9.a6()) ? var1.a0() : null;
                        com.aspose.slides.internal.o9b.l6 var15 = com.aspose.slides.internal.n8e.k7.n5(
                           var9.a6(), var14, var13.a6(), new com.aspose.slides.internal.o9b.f2(1.0F, 1.0F)
                        );

                        try {
                           var10 = com.aspose.slides.internal.n8e.k7.n5((com.aspose.slides.internal.o9b.t4)var15);
                           var7 = "image/png";
                           var8 = "png";
                        } finally {
                           if (var15 != null) {
                              var15.dispose();
                           }
                        }
                     } else {
                        int var42 = var13.l6() < 1.0F ? 1 : com.aspose.slides.internal.v6g.k5.u3(var13.l6(), 13);
                        int var45 = var13.k5() < 1.0F ? 1 : com.aspose.slides.internal.v6g.k5.u3(var13.k5(), 13);
                        com.aspose.slides.internal.o9b.l6 var16 = new com.aspose.slides.internal.o9b.l6(var42, var45, 2498570);

                        try {
                           com.aspose.slides.internal.o9b.z1 var17 = com.aspose.slides.internal.o9b.z1.n5(var16);
                           var17.l6(2);
                           var17.k5(7);
                           var17.u9(4);
                           var17.n5(1);
                           var17.n5(var6.n5().k5(), new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var13.l6(), var13.k5()));
                           var17.dispose();
                           var7 = "image/png";
                           var8 = "png";
                           var10 = com.aspose.slides.internal.n8e.k7.n5((com.aspose.slides.internal.o9b.t4)var16);
                        } finally {
                           if (var16 != null) {
                              var16.dispose();
                           }
                        }
                     }
                  }

                  com.aspose.slides.internal.d8v.u9 var39 = new com.aspose.slides.internal.d8v.u9();
                  var39.h0((String)var5.getKey());
                  if (var6.a6) {
                     var39.n5(
                        new com.aspose.slides.internal.b3z.s7(
                           com.aspose.slides.internal.v6g.k5.u3(var6.u3.x8() + 0.5, 14),
                           com.aspose.slides.internal.v6g.k5.u3(var6.u3.n3() + 0.5, 14),
                           com.aspose.slides.internal.v6g.k5.u3(var6.u3.s7() + 0.5, 14),
                           com.aspose.slides.internal.v6g.k5.u3(var6.u3.k5() + 0.5, 14)
                        )
                     );
                  } else {
                     var39.n5(new com.aspose.slides.internal.b3z.s7(0.0F, 0.0F, var6.k5.l6(), var6.k5.k5()));
                  }

                  var39.n5(new com.aspose.slides.internal.b3z.k5(0));
                  if (var7 == null) {
                     com.aspose.slides.internal.o9b.t4 var40 = var9.l6()
                        ? var9.k5()
                        : com.aspose.slides.internal.o9b.t4.n5(new com.aspose.slides.internal.z0k.e2(var9.a6()));
                     if (this.n5(var40)) {
                        com.aspose.slides.internal.z0k.e2 var43 = new com.aspose.slides.internal.z0k.e2();
                        var40.n5(var43, com.aspose.slides.internal.j9e.x8.s7());
                        var7 = "image/png";
                        var8 = "png";
                        var10 = var43.toArray();
                     } else {
                        var10 = var9.u3() ? var9.a6() : com.aspose.slides.internal.n8e.k7.n5(var40);
                        long var19 = Long.MAX_VALUE;
                        if (com.aspose.slides.ms.System.o0.n5(var40.x8().n5(), com.aspose.slides.internal.j9e.x8.c8().n5())) {
                           var19 = var10.length;
                        }

                        com.aspose.slides.internal.z0k.e2 var47 = new com.aspose.slides.internal.z0k.e2();
                        var40.n5(var47, n5, var3);
                        long var21 = com.aspose.slides.internal.v6g.k5.u9(var47.getLength() * 1.05, 14);
                        com.aspose.slides.internal.z0k.e2 var23 = new com.aspose.slides.internal.z0k.e2();
                        var40.n5(var23, com.aspose.slides.internal.j9e.x8.s7());
                        if (var19 < var21) {
                           if (var19 > var23.getLength()) {
                              var10 = var23.toArray();
                              var7 = "image/png";
                              var8 = "png";
                           } else {
                              var7 = "image/jpeg";
                              var8 = "jpg";
                           }
                        } else if (var21 < var23.getLength()) {
                           var10 = var47.toArray();
                           var7 = "image/jpeg";
                           var8 = "jpg";
                        } else {
                           var10 = var23.toArray();
                           var7 = "image/png";
                           var8 = "png";
                        }

                        var23.close();
                        var47.close();
                     }

                     if (!var9.l6()) {
                        var40.dispose();
                     }
                  }

                  String var41 = this.n5(var1.z1(), var10, var7, var8, var1.s7);
                  if (var41 != null) {
                     int var44 = this.n5(var6, var1.z1()) ? var6.k5.l6() : var6.l6.k5().e2();
                     int var46 = this.n5(var6, var1.z1()) ? var6.k5.k5() : var6.l6.k5().h0();
                     com.aspose.slides.internal.d8v.k5 var48 = new com.aspose.slides.internal.d8v.k5();
                     var48.u3(com.aspose.slides.internal.b3z.a6.k5(var44));
                     var48.a6(com.aspose.slides.internal.b3z.a6.k5(var46));
                     var48.n5(new com.aspose.slides.internal.b3z.k5(0));
                     if (!this.n5(var6, var1.z1())) {
                        float var49 = var6.k5.l6() / var6.u3.s7();
                        float var18 = var6.k5.k5() / var6.u3.k5();
                        float var50 = -var6.u3.x8();
                        float var24 = -var6.u3.n3();
                        String var25 = com.aspose.slides.ms.System.d1.n5(
                           "scale({0}, {1}) translate({2}, {3})",new Object[]{
                           com.aspose.slides.ms.System.Xml.f4.n5(var49),
                           com.aspose.slides.ms.System.Xml.f4.n5(var18),
                           com.aspose.slides.ms.System.Xml.f4.n5(var50),
                           com.aspose.slides.ms.System.Xml.f4.n5(var24)
                        });
                        var48.t2(var25);
                     }

                     var48.s7(var41);
                     var39.n5(var48);
                  }

                  var2.n5(var39);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private boolean n5(com.aspose.slides.internal.o9b.t4 var1) {
      return com.aspose.slides.internal.o9b.t4.k5(var1.s7());
   }

   private void n5(com.aspose.slides.internal.d8v.n5 var1) {
      Dictionary$Enumerator var2 = this.u9.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (!this.s7.containsKey((String)var3.getKey())) {
               this.s7.addItem((String)var3.getKey(), var3.getValue());
               a4w$k5 var4 = (a4w$k5)var3.getValue();
               float var5 = var4.k5 / 4096.0F;
               float var6 = var5 / 2.0F;
               float var7 = var4.u3 * var5 / 256.0F;
               int var8 = com.aspose.slides.internal.v6g.k5.u3(var7 * com.aspose.slides.ms.System.q1.c8(var4.n5 / 180.0F * Math.PI), 14);
               int var9 = com.aspose.slides.internal.v6g.k5.u3(var7 * com.aspose.slides.ms.System.q1.h0(var4.n5 / 180.0F * Math.PI), 14);
               int var10 = var8 + com.aspose.slides.internal.v6g.k5.u3(var6 * com.aspose.slides.ms.System.q1.c8(var4.n5 / 180.0F * Math.PI), 14);
               int var11 = var9 + com.aspose.slides.internal.v6g.k5.u3(var6 * com.aspose.slides.ms.System.q1.h0(var4.n5 / 180.0F * Math.PI), 14);
               com.aspose.slides.internal.w5i.l6 var12 = new com.aspose.slides.internal.w5i.l6();
               var12.h0((String)var3.getKey());
               var12.l6(com.aspose.slides.internal.b3z.a6.k5(q4b.n5(var8)));
               var12.k5(com.aspose.slides.internal.b3z.a6.k5(q4b.n5(var9)));
               var12.u3(com.aspose.slides.internal.b3z.a6.k5(q4b.n5(var10)));
               var12.a6(com.aspose.slides.internal.b3z.a6.k5(q4b.n5(var11)));
               var12.c8(1);
               var12.h0(0);
               n5(var12, var4.l6);
               var1.n5(var12);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void l6(com.aspose.slides.internal.d8v.n5 var1) {
      Dictionary$Enumerator var2 = this.h0.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (!this.s7.containsKey((String)var3.getKey())) {
               this.s7.addItem((String)var3.getKey(), var3.getValue());
               a4w$u9 var4 = (a4w$u9)var3.getValue();
               float var5 = var4.u9 / 16.0F;
               float var6 = var4.k5 / var5;
               com.aspose.slides.internal.w5i.a6 var7 = new com.aspose.slides.internal.w5i.a6();
               var7.h0((String)var3.getKey());
               var7.l6(com.aspose.slides.internal.b3z.a6.k5(q4b.n5(var4.l6)));
               var7.k5(com.aspose.slides.internal.b3z.a6.k5(q4b.n5(var6)));
               var7.u3(com.aspose.slides.internal.b3z.a6.k5(q4b.n5(var4.u3)));
               if (var4.u9 != 16) {
                  var7.s7(com.aspose.slides.ms.System.d1.n5(new Object[]{"scale(1, ", com.aspose.slides.ms.System.Xml.f4.n5(var5), ')'}));
               }

               var7.c8(1);
               var7.h0(0);
               n5(var7, var4.n5);
               var1.n5(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void n5(com.aspose.slides.internal.w5i.n5 var0, SortedList<Float, com.aspose.slides.internal.o9b.c8> var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         com.aspose.slides.internal.o9b.c8 var3 = ((com.aspose.slides.internal.o9b.c8)var1.getValues().get_Item(var2)).o8();
         com.aspose.slides.internal.w5i.u9 var4 = new com.aspose.slides.internal.w5i.u9();
         var4.k5((Float)var1.getKeys().get_Item(var2));
         var4.n5(new com.aspose.slides.internal.b3z.u3(var3.o8()));
         if ((var3.s7() & 255) < 255) {
            var4.u3(q4b.l6(var3.o8()));
         }

         var0.n5(var4);
      }
   }

   private void l6(q4b var1, com.aspose.slides.internal.d8v.n5 var2) {
      Dictionary$Enumerator var3 = this.c8.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            if (!this.s7.containsKey((String)var4.getKey())) {
               this.s7.addItem((String)var4.getKey(), var4.getValue());
               a4w$u3 var5 = (a4w$u3)var4.getValue();
               com.aspose.slides.internal.w5i.u3 var6 = new com.aspose.slides.internal.w5i.u3();
               var6.h0((String)var4.getKey());
               var6.u3(com.aspose.slides.internal.b3z.a6.k5(var5.u3 * var1.e2()));
               var6.a6(com.aspose.slides.internal.b3z.a6.k5(var5.a6 * var1.e2()));
               var6.h0(0);
               String var7 = c3t.l6(var5.u9);
               if (var7 != null) {
                  var6.s7(var7);
               }

               com.aspose.slides.internal.d8v.h0 var8 = new com.aspose.slides.internal.d8v.h0();
               var8.u3(com.aspose.slides.internal.b3z.a6.k5(var5.u3 * var1.e2()));
               var8.a6(com.aspose.slides.internal.b3z.a6.k5(var5.a6 * var1.e2()));
               var8.n3(com.aspose.slides.ms.System.d1.n5("#{0}", new Object[]{var5.n5}));
               var6.n5(var8);
               var2.n5(var6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void k5(com.aspose.slides.internal.d8v.n5 var1) {
      Dictionary$Enumerator var2 = this.t2.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (!this.s7.containsKey((String)var3.getKey())) {
               this.s7.addItem((String)var3.getKey(), var3.getValue());
               a4w$a6 var4 = (a4w$a6)var3.getValue();
               float var5 = var4.l6.x8() - var4.k5.x8();
               float var6 = var4.l6.n3() - var4.k5.n3();
               com.aspose.slides.internal.w5i.u3 var7 = new com.aspose.slides.internal.w5i.u3();
               var7.h0((String)var3.getKey());
               var7.l6(com.aspose.slides.internal.b3z.a6.k5(var4.k5.x8()));
               var7.k5(com.aspose.slides.internal.b3z.a6.k5(var4.k5.n3()));
               var7.u3(com.aspose.slides.internal.b3z.a6.k5(var4.l6.s7() + var5));
               var7.a6(com.aspose.slides.internal.b3z.a6.k5(var4.l6.k5() + var6));
               var7.h0(0);
               com.aspose.slides.internal.d8v.h0 var8 = new com.aspose.slides.internal.d8v.h0();
               var8.u3(com.aspose.slides.internal.b3z.a6.k5(var4.k5.s7()));
               var8.a6(com.aspose.slides.internal.b3z.a6.k5(var4.k5.k5()));
               var8.n3(com.aspose.slides.ms.System.d1.n5("#{0}", new Object[]{var4.n5}));
               var8.n5(new com.aspose.slides.internal.b3z.k5(0));
               String var9 = c3t.l6(var4.u3);
               if (var9 != null) {
                  var8.t2(var9);
               }

               var7.n5(var8);
               var1.n5(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void u3(com.aspose.slides.internal.d8v.n5 var1) {
      Dictionary$Enumerator var2 = this.a6.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (!this.s7.containsKey((String)var3.getKey())) {
               this.s7.addItem((String)var3.getKey(), var3.getValue());
               a4w$n5 var4 = (a4w$n5)var3.getValue();
               int var5 = 1 + (1 << var4.l6);
               int var6 = 1 + (1 << var4.k5);
               float var7 = var4.u9 > 1.0F ? var4.u9 : 1.0F;
               com.aspose.slides.internal.w5i.k5 var8 = new com.aspose.slides.internal.w5i.k5();
               var8.h0((String)var3.getKey());
               var8.x8("userSpaceOnUse");
               var8.l6(com.aspose.slides.internal.b3z.a6.k5(12.0F * var7));
               var8.k5(com.aspose.slides.internal.b3z.a6.k5(7.0F * var7));
               var8.n5(new com.aspose.slides.internal.b3z.s7(-6.0F * var7, -3.5F * var7, 12.0F * var7, 7.0F * var7));
               var8.s7("auto");
               float var9 = var4.u3 ? -var4.h0 : var4.h0;
               float var10 = 0.0F;
               com.aspose.slides.internal.d0e.a6 var11 = null;
               com.aspose.slides.internal.l7h.a5 var12 = new com.aspose.slides.internal.l7h.a5();
               switch (var4.n5) {
                  case 1:
                  case 2:
                  case 3:
                  case 5:
                     float[] var31 = new float[]{0.0F};
                     com.aspose.slides.internal.x4g.s7 var14 = l6v.n5(var4.n5, var4.l6, var4.k5, var31);
                     var10 = var31[0];
                     var14.l6(
                        var4.u3
                           ? new com.aspose.slides.internal.x4g.m1(0.0F, 1.0F, -1.0F, 0.0F, var9, 0.0F)
                           : new com.aspose.slides.internal.x4g.m1(0.0F, -1.0F, 1.0F, 0.0F, var9, 0.0F)
                     );
                     if (var14.h0() > 0 && var7 > 1.0F) {
                        com.aspose.slides.internal.o9b.w1[] var32 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
                           com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var14.h0())
                        );

                        for (int var16 = 0; var16 < var14.h0(); var16++) {
                           var32[var16] = new com.aspose.slides.internal.o9b.w1(var14.a6()[var16].l6() * var7, var14.a6()[var16].k5() * var7);
                        }

                        var14 = new com.aspose.slides.internal.x4g.s7(var32, var14.u9(), var14.k5());
                     }

                     com.aspose.slides.internal.n8e.i6.n5(var14, var12, var12);
                     if (var4.n5 == 5) {
                        var11 = n5(var12.toString(), new com.aspose.slides.ms.System.o5<>(), new com.aspose.slides.ms.System.o5<>(var4.a6.o8()));
                        var11.n5(com.aspose.slides.internal.b3z.a6.k5(var7));
                        var11.n5(1);
                     } else {
                        var11 = n5(var12.toString(), new com.aspose.slides.ms.System.o5<>(var4.a6.o8()), new com.aspose.slides.ms.System.o5<>());
                     }
                     break;
                  case 4:
                     com.aspose.slides.internal.i1k.l6 var13 = new com.aspose.slides.internal.i1k.l6();
                     if (com.aspose.slides.ms.System.q1.n5(var9) > 0.1) {
                        var13.l6(com.aspose.slides.internal.b3z.a6.k5(var9));
                     }

                     var13.k5(com.aspose.slides.internal.b3z.a6.k5(var5 * var7 * 0.5F));
                     var13.u3(com.aspose.slides.internal.b3z.a6.k5(var6 * var7 * 0.5F));
                     com.aspose.slides.internal.o9b.c8 var15 = var4.a6.o8();
                     var13.u3(new com.aspose.slides.internal.b3z.u3(var15.o8()).toString());
                     if ((var15.s7() & 255) < 255) {
                        var13.l6(q4b.l6(var15.o8()));
                     }

                     var11 = var13;
               }

               if (var11 != null) {
                  var8.n5(var11);
               }

               var1.n5(var8);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      Dictionary$Enumerator var25 = this.a6.iterator();

      try {
         while (var25.hasNext()) {
            KeyValuePair var26 = (KeyValuePair)var25.next();
            if (!this.s7.containsKey((String)var26.getKey())) {
               this.s7.addItem((String)var26.getKey(), var26.getValue());
               String var27 = ((a4w$n5)var26.getValue()).toString();
               com.aspose.slides.internal.d8v.h0 var28 = new com.aspose.slides.internal.d8v.h0();
               var28.n3(com.aspose.slides.ms.System.d1.n5("#{0}", new Object[]{var27}));
               com.aspose.slides.internal.u3t.n5 var29 = new com.aspose.slides.internal.u3t.n5();
               var29.h0((String)var26.getKey());
               var29.n5(var28);
               var1.n5(var29);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var25, IDisposable.class)) {
            var25.dispose();
         }
      }
   }

   private static com.aspose.slides.internal.z9u.l6 n5(
      String var0,
      com.aspose.slides.ms.System.o5<com.aspose.slides.internal.o9b.c8> var1,
      com.aspose.slides.ms.System.o5<com.aspose.slides.internal.o9b.c8> var2
   ) {
      com.aspose.slides.internal.z9u.l6 var3 = new com.aspose.slides.internal.z9u.l6();
      var3.s7(var0);
      if (var1.l6()) {
         com.aspose.slides.internal.o9b.c8 var4 = ((com.aspose.slides.internal.o9b.c8)var1.n5()).o8();
         var3.u3(new com.aspose.slides.internal.b3z.u3(var4.o8()).toString());
         if ((var4.s7() & 255) < 255) {
            var3.l6(q4b.l6(var4.o8()));
         }
      } else {
         var3.u3("none");
      }

      if (var2.l6()) {
         com.aspose.slides.internal.o9b.c8 var5 = ((com.aspose.slides.internal.o9b.c8)var2.n5()).o8();
         var3.k5(new com.aspose.slides.internal.b3z.u3(var5.o8()).toString());
         if ((var5.s7() & 255) < 255) {
            var3.n5(q4b.l6(var5.o8()));
         }
      }

      return var3;
   }

   private void k5(q4b var1, com.aspose.slides.internal.d8v.n5 var2) {
      if (!var1.z1().getVectorizeText()) {
         if (var1.z1().getExternalFontsHandling() != 2) {
            List$Enumerator var3 = this.k5.iterator();

            try {
               while (var3.hasNext()) {
                  String var4 = (String)var3.next();
                  String var5 = null;
                  byte[] var6 = null;
                  String[] var7 = new String[]{var5};
                  byte[][] var8 = new byte[][]{var6};
                  boolean var9 = this.n5(var4, var7, var8);
                  var5 = var7[0];
                  var6 = var8[0];
                  if (var9) {
                     boolean var10 = this.x8.containsItem(var4);
                     if (!var10) {
                        byte[] var11 = null;
                        byte[] var12 = null;
                        byte[] var13 = null;

                        try {
                           if (var1.z1().getExternalFontsHandling() == 1) {
                              byte[] var14 = var6;
                              if (var14 == null) {
                                 var14 = this.l6(var4, var5);
                              }

                              var11 = var14;
                              byte[] var15 = var6;
                              if (var15 == null) {
                                 var15 = this.l6(var4, com.aspose.slides.ms.System.d1.n5(var5, ".ttf", ".eot"));
                              }

                              var12 = var15;
                              byte[] var16 = var6;
                              if (var16 == null) {
                                 var16 = this.l6(var4, com.aspose.slides.ms.System.d1.n5(var5, ".ttf", ".woff"));
                              }

                              var13 = var16;
                           }
                        } catch (IOException var25) {
                           com.aspose.slides.internal.n8e.v4.n5(var25);
                           if (var1.z1().getWarningCallback() != null) {
                           }
                           break;
                        }

                        com.aspose.slides.internal.l7h.a5 var29 = new com.aspose.slides.internal.l7h.a5();
                        this.n5(var1, var29, var4);
                        if (var1.z1().getExternalFontsHandling() == 0) {
                           var29.n5(", ");
                           var29.n5("url(\"");
                           String var30 = "data:application/x-font-ttf;charset=utf-8;base64,";
                           String var33 = "ttf";
                           if (this.k5().length > 0) {
                              if (var1.l6(var4)) {
                                 var29 = new com.aspose.slides.internal.l7h.a5();
                                 String var17 = com.aspose.slides.internal.n8e.v4.a6(var4);
                                 var29.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"@font-face { font-family: \"", var17, "\"; "}));
                                 var29.n5("src: url(\"");
                              }

                              this.n5(var1.z1(), var29, var6, "data:application/x-font-ttf;charset=utf-8;base64,", "ttf");
                              if (var1.l6(var4)) {
                                 var29.n5("\")}");
                              } else {
                                 var29.n5("\") format('truetype')}");
                              }
                           } else if (com.aspose.slides.ms.System.d1.n5(var5)) {
                              this.n5(var1.z1(), var29, var6, "data:application/x-font-ttf;charset=utf-8;base64,", "ttf");
                           } else {
                              this.n5(var29, com.aspose.slides.ms.System.d1.n5(var5, '\\', '/'));
                              var29.n5("\") format('truetype')}");
                           }
                        } else {
                           boolean var31 = var11 != null;
                           boolean var34 = var13 != null;
                           boolean var36 = var12 != null;
                           String var18 = var31
                              ? "data:application/x-font-ttf;charset=utf-8;base64,"
                              : (
                                 var34
                                    ? "data:application/x-font-woff;charset=utf-8;base64,"
                                    : (var36 ? "data:application/vnd.ms-fontobject;charset=utf-8;base64," : null)
                              );
                           byte[] var19 = var31 ? var11 : (var34 ? var13 : (var36 ? var12 : null));
                           String var20 = var31 ? "ttf" : (var34 ? "woff" : (var36 ? "eot" : null));
                           var29 = new com.aspose.slides.internal.l7h.a5();
                           String var21 = var1.l6(var4) ? com.aspose.slides.internal.n8e.v4.a6(var4) : var4;
                           var29.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"@font-face { font-family: \"", var21, "\"; "}));
                           var29.n5("src: url(\"");
                           this.n5(var1.z1(), var29, var19, var18, var20);
                           var29.n5("\")}");
                        }

                        this.x8.addItem(var4);
                        com.aspose.slides.internal.j7h.n5 var32 = new com.aspose.slides.internal.j7h.n5(
                           com.aspose.slides.ms.System.d1.n5("<![CDATA[{0}]]>", new Object[]{var29}), true
                        );
                        com.aspose.slides.internal.d0e.a6 var35 = new com.aspose.slides.internal.d0e.a6("style");
                        var35.l6.l6("type", "text/css");
                        var35.n5(var32);
                        var2.n5(var35);
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      }
   }

   private void n5(q4b var1, com.aspose.slides.internal.l7h.a5 var2, String var3) {
      String var4 = var1.l6(var3) ? com.aspose.slides.internal.n8e.v4.a6(var3) : var3;
      var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"@font-face { font-family: \"", var4, "\"; "}));
      var2.n5("src: ");
      var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"local(\"", var3, "\"),"}));
      var2.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"local(\"", com.aspose.slides.ms.System.d1.n5(var3, " ", ""), "\")"}));
   }

   private String n5(SVGOptions var1, byte[] var2, String var3, String var4, int var5) {
      int var6 = 0;
      String var7 = null;
      int[] var8 = new int[]{0};
      String[] var9 = new String[]{var7};
      boolean var10 = this.n5(var1, var2, var3, var4, var5, "image", var8, var9);
      var6 = var8[0];
      var7 = var9[0];
      if (var10) {
         return var7;
      } else {
         return var6 == 1 ? com.aspose.slides.ms.System.d1.n5(new String[]{"data:", var3, ";base64,", com.aspose.slides.ms.System.z3.n5(var2, 0, var2.length)}) : "null";
      }
   }

   private void n5(SVGOptions var1, com.aspose.slides.internal.l7h.a5 var2, byte[] var3, String var4, String var5) {
      int var6 = 0;
      String var7 = null;
      int[] var8 = new int[]{0};
      String[] var9 = new String[]{var7};
      boolean var10 = this.n5(var1, var3, var4, var5, 0, "font", var8, var9);
      var6 = var8[0];
      var7 = var9[0];
      if (var10) {
         this.n5(var2, var7);
      } else if (var6 == 1) {
         this.n5(var2, var4, var3);
      } else if (var6 != 2) {
         throw new InvalidOperationException("Unknown decision");
      }
   }

   private boolean n5(SVGOptions var1, byte[] var2, String var3, String var4, int var5, String var6, int[] var7, String[] var8) {
      var8[0] = null;
      ILinkEmbedController var9 = var1.l6();
      int var10 = this.n5().n5(var9, var2, var2, var6, var3, var4, var7);
      if (var7[0] == 0) {
         var8[0] = var9.getUrl(var10, var5);
         if (var8[0] != null) {
            var9.saveExternal(var10, var2);
         }

         var7[0] = 2;
         return true;
      } else {
         return false;
      }
   }

   private void n5(com.aspose.slides.internal.l7h.a5 var1, String var2) {
      var1.n5(var2);
   }

   private void n5(com.aspose.slides.internal.l7h.a5 var1, String var2, byte[] var3) {
      var1.n5(var2);
      var1.n5(com.aspose.slides.ms.System.z3.n5(var3));
   }

   private boolean n5(String var1, String[] var2, byte[][] var3) {
      var2[0] = com.aspose.slides.ms.System.d1.n5;
      var3[0] = null;
      int var4 = com.aspose.slides.ms.System.u3.l6(this.k5(), new a4w$1(this, var1));
      int var5 = com.aspose.slides.ms.System.u3.l6(this.u3(), new a4w$2(this, var1));
      if (var5 != -1) {
         return false;
      }

      if (FontsLoader.n5(var1, var2, var3)) {
         if (var3[0] == null) {
            var3[0] = com.aspose.slides.internal.z0k.u9.h0(var2[0]);
         }

         return true;
      } else if (var4 != -1) {
         j0v var6 = this.k5()[var4];
         com.aspose.slides.internal.z0k.t4 var7 = var6.n5().n5().y1().l6();

         try {
            com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2();

            try {
               com.aspose.slides.internal.q7.n5.n5(var7, var8);
               var3[0] = var8.toArray();
               var2[0] = var6.n5().n5().u9();
               return true;
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }
      } else {
         return false;
      }
   }

   private boolean n5(a4w$l6 var1, SVGOptions var2) {
      return var2.getDeletePicturesCroppedAreas() || var1.l6 == null;
   }

   private byte[] l6(String var1, String var2) {
      com.aspose.slides.internal.z0k.n3 var3 = null;
      byte[] var4 = null;
      if (com.aspose.slides.internal.z0k.u9.k5(var2)) {
         try {
            var3 = com.aspose.slides.internal.z0k.u9.u3(var2);
            var4 = new byte[(int)var3.getLength()];
            if (var3.read(var4, 0, var4.length) != var3.getLength()) {
               throw new IOException(
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     com.aspose.slides.ms.System.d1.t2(com.aspose.slides.internal.z0k.z1.a6(var2)),
                     " font file content for '",
                     var1,
                     "' font wasn't read correctly."
                  })
               );
            }
         } finally {
            if (var3 != null) {
               var3.close();
               var3.dispose();
            }
         }
      }

      return var4;
   }

   private static com.aspose.slides.internal.j9e.s7 h0() {
      for (com.aspose.slides.internal.j9e.s7 var3 : com.aspose.slides.internal.j9e.s7.n5()) {
         if ("image/jpeg".equals(var3.h0())) {
            return var3;
         }
      }

      return null;
   }
}
