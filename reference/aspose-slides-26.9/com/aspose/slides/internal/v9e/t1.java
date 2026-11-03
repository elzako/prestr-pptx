package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XsltException;

public class t1 extends t4 {
   private static t1$n5 n5 = new t1$n5(false, "0");
   private static t1$n5 u3 = new t1$n5(true, ".");
   private String a6;
   private String u9;
   private int h0 = -1;
   private String c8;
   private int t2 = -1;
   private String s7;
   private int x8 = -1;
   private h0 n3;
   private h0 y4;
   private h0 e2;
   private h0 t9;
   private h0 z1;
   private List<t1$n5> t4;
   private String q0;
   private String z3;
   private String m1;
   private String k7;
   private boolean m3;

   @Override
   public boolean k5(z1 var1) {
      String var2 = var1.u3().e2();
      String var3 = var1.u3().t4();
      if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().e9)) {
         if (!"any".equals(var3) && !"multiple".equals(var3) && !"single".equals(var3)) {
            throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "level", var3);
         }

         this.a6 = var3;
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().t4)) {
         this.u9 = var3;
         this.h0 = var1.n5(var3, true, true, true);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().e5)) {
         this.c8 = var3;
         this.t2 = var1.n5(var3, true, true, true);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().t5)) {
         this.s7 = var3;
         this.x8 = var1.e2(var3);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().i1)) {
         this.n3 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().y0)) {
         this.y4 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().z6)) {
         this.e2 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      } else if (com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().o0)) {
         this.t9 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      } else {
         if (!com.aspose.slides.ms.System.Xml.v8.n5(var2, var1.n5().z7)) {
            return false;
         }

         this.z1 = com.aspose.slides.internal.v9e.h0.n5(var1, var3);
      }

      return true;
   }

   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      this.a6(var1);
      this.m3 = var1.n3();
      h0[] var2 = new h0[]{this.n3};
      this.t4 = n5(n5(var2));
      this.n3 = var2[0];
      h0[] var3 = new h0[]{this.e2};
      this.z3 = this.l6(n5(var3));
      this.e2 = var3[0];
      h0[] var4 = new h0[]{this.y4};
      this.q0 = n5(var4);
      this.y4 = var4[0];
      h0[] var5 = new h0[]{this.t9};
      this.m1 = n5(var5);
      this.t9 = var5[0];
      if (this.m1 != null && this.m1.length() > 1) {
         throw XsltException.create("The value of the '{0}' attribute must be a single character.", "grouping-separator");
      }

      h0[] var6 = new h0[]{this.z1};
      this.k7 = n5(var6);
      this.z1 = var6[0];
   }

   private int l6(p3 var1, l6 var2) {
      int var3 = 0;
      com.aspose.slides.internal.x6s.a6 var4 = var2.a6();
      if (var4.k5() == 2 || var4.k5() == 3) {
         var4 = var4.n5();
         var4.q0();
      }

      com.aspose.slides.internal.x6s.a6 var5 = var4.n5();
      if (this.t2 != -1) {
         boolean var6 = false;

         do {
            if (var1.n5(var5, this.t2)) {
               var6 = true;
               break;
            }
         } while (var5.q0());

         com.aspose.slides.internal.x6s.h0 var7 = var5.n5(9, true);

         while (var7.l6()) {
            if (var1.n5(var7.k5(), this.t2)) {
               var6 = true;
               var3 = 0;
            } else if (this.n5(var1, var2.a6(), var7.k5())) {
               var3++;
            }

            if (var7.k5().l6(var4)) {
               break;
            }
         }

         if (!var6) {
            var3 = 0;
         }
      } else {
         var5.z3();
         com.aspose.slides.internal.x6s.h0 var8 = var5.n5(9, true);

         while (var8.l6()) {
            if (this.n5(var1, var2.a6(), var8.k5())) {
               var3++;
            }

            if (var8.k5().l6(var4)) {
               break;
            }
         }
      }

      return var3;
   }

   private boolean n5(p3 var1, com.aspose.slides.internal.x6s.a6 var2) {
      if (this.t2 == -1) {
         return true;
      }

      while (!var1.n5(var2, this.t2)) {
         if (!var2.q0()) {
            return false;
         }
      }

      return true;
   }

   private boolean n5(com.aspose.slides.internal.x6s.a6 var1, p3 var2, com.aspose.slides.internal.x6s.a6 var3) {
      while (this.t2 == -1 || !var2.n5(var1, this.t2)) {
         if (this.n5(var2, var3, var1)) {
            return true;
         }

         if (!var1.q0()) {
            return false;
         }
      }

      return false;
   }

   private int l6(com.aspose.slides.internal.x6s.a6 var1, p3 var2, com.aspose.slides.internal.x6s.a6 var3) {
      com.aspose.slides.internal.x6s.a6 var4 = var1.n5();
      int var5 = 1;
      if (var4.q0()) {
         var4.t4();

         while (!var4.l6(var1)) {
            if (this.n5(var2, var3, var4)) {
               var5++;
            }

            if (!var4.z1()) {
               com.aspose.slides.internal.f8y.n5.n5("We implementing preceding-sibling::node() and some how miss context node 'nav'");
               break;
            }
         }
      }

      return var5;
   }

   private static Object n5(Object var0) {
      if (com.aspose.slides.ms.System.y8.u3(com.aspose.slides.ms.System.j8.n5(var0)) == 1) {
         com.aspose.slides.internal.x6s.h0 var1 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.x6s.h0.class);
         if (var1 != null) {
            if (var1.l6()) {
               return var1.k5().c8();
            }

            return com.aspose.slides.ms.System.d1.n5;
         }

         com.aspose.slides.internal.x6s.a6 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.x6s.a6.class);
         if (var2 != null) {
            return var2.c8();
         }
      }

      return var0;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      ArrayList var3 = var1.x8();
      switch (var2.k5()) {
         case 0:
            var3.clear();
            if (this.x8 != -1) {
               var3.addItem(n5(var1.l6(var2, this.x8)));
            } else if ("any".equals(this.a6)) {
               int var7 = this.l6(var1, var2);
               if (var7 != 0) {
                  var3.addItem(var7);
               }
            } else {
               boolean var4 = "multiple".equals(this.a6);
               com.aspose.slides.internal.x6s.a6 var5 = var2.a6();
               com.aspose.slides.internal.x6s.a6 var6 = var2.a6().n5();
               if (var6.k5() == 2 || var6.k5() == 3) {
                  var6.q0();
               }

               while (this.n5(var6, var1, var5)) {
                  var3.insertItem(0, this.l6(var6, var1, var5));
                  if (!var4 || !var6.q0()) {
                     break;
                  }
               }

               if (!this.n5(var1, var6)) {
                  var3.clear();
               }
            }

            var2.n5(
               n5(
                  var3,
                  this.n3 == null ? this.t4 : n5(this.n3.n5(var1, var2)),
                  this.y4 == null ? this.q0 : this.y4.n5(var1, var2),
                  this.e2 == null ? this.z3 : this.l6(this.e2.n5(var1, var2)),
                  this.t9 == null ? this.m1 : this.t9.n5(var1, var2),
                  this.z1 == null ? this.k7 : this.z1.n5(var1, var2)
               )
            );
            if (!var1.k5(var2.l6())) {
               var2.n5(2);
            } else {
               var2.s7();
            }
            break;
         case 2:
            if (!var1.k5(var2.l6())) {
               var2.n5(2);
            } else {
               var2.s7();
            }
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid Number Action execution state");
      }
   }

   private boolean n5(p3 var1, com.aspose.slides.internal.x6s.a6 var2, com.aspose.slides.internal.x6s.a6 var3) {
      return this.h0 != -1 ? var1.n5(var3, this.h0) : com.aspose.slides.ms.System.d1.a6(var2.u9(), var3.u9()) && this.l6(var2.k5()) == this.l6(var3.k5());
   }

   private int l6(int var1) {
      return var1 != 5 && var1 != 6 ? var1 : 4;
   }

   private static String n5(ArrayList var0, List<t1$n5> var1, String var2, String var3, String var4, String var5) {
      com.aspose.slides.internal.l7h.a5 var6 = new com.aspose.slides.internal.l7h.a5();
      int var7 = 0;
      if (var1 != null) {
         var7 = var1.size();
      }

      t1$l6 var8 = new t1$l6();
      if (var5 != null) {
         try {
            var8.k5(com.aspose.slides.ms.System.z3.h0(var5, com.aspose.slides.internal.x7n.l6.k5()));
         } catch (FormatException var18) {
         } catch (OverflowException var19) {
         }
      }

      if (var4 != null) {
         if (var4.length() > 1) {
         }

         var8.n5(var4);
      }

      if (0 < var7) {
         t1$n5 var9 = (t1$n5)var1.get_Item(0);
         t1$n5 var10 = null;
         if (var7 % 2 == 1) {
            var10 = (t1$n5)var1.get_Item(var7 - 1);
            var7--;
         }

         t1$n5 var11 = 2 < var7 ? (t1$n5)var1.get_Item(var7 - 2) : u3;
         t1$n5 var12 = 0 < var7 ? (t1$n5)var1.get_Item(var7 - 1) : n5;
         if (var9 != null) {
            var6.n5(var9.u3);
         }

         int var13 = var0.size();

         for (int var14 = 0; var14 < var13; var14++) {
            int var15 = var14 * 2;
            boolean var16 = var15 < var7;
            if (0 < var14) {
               t1$n5 var17 = var16 ? (t1$n5)var1.get_Item(var15 + 0) : var11;
               var6.n5(var17.u3);
            }

            t1$n5 var21 = var16 ? (t1$n5)var1.get_Item(var15 + 1) : var12;
            var8.n5(var21.l6);
            var8.l6(var21.k5);
            var6.n5(var8.n5(var0.get_Item(var14)));
         }

         if (var10 != null) {
            var6.n5(var10.u3);
         }
      } else {
         var8.n5(0);

         for (int var20 = 0; var20 < var0.size(); var20++) {
            if (var20 != 0) {
               var6.n5(".");
            }

            var6.n5(var8.n5(var0.get_Item(var20)));
         }
      }

      return var6.toString();
   }

   private static void n5(String var0, int var1, int var2, int[] var3, int[] var4) {
      char var5 = var0.charAt(var1);
      boolean var6 = false;
      var4[0] = 1;
      var3[0] = -1;
      switch (var5) {
         case '0':
         case '०':
         case '๐':
         case '읻':
         case '０':
            while (true) {
               var4[0]++;
               if (--var2 > 0) {
                  if (var5 == var0.charAt(++var1)) {
                     continue;
                  }
               }

               if (var0.charAt(var1) != (char)(var5 + 1)) {
                  var6 = true;
               }
               break;
            }
      }

      if (!var6) {
         switch (var0.charAt(var1)) {
            case '1':
               var3[0] = 0;
               break;
            case 'A':
               var3[0] = 6;
               break;
            case 'I':
               var3[0] = 20;
               break;
            case 'a':
               var3[0] = 7;
               break;
            case 'i':
               var3[0] = 21;
               break;
            case 'А':
               var3[0] = 8;
               break;
            case 'а':
               var3[0] = 9;
               break;
            case 'א':
               var3[0] = 22;
               break;
            case 'أ':
               var3[0] = 19;
               break;
            case 'अ':
               var3[0] = 12;
               break;
            case 'क':
               var3[0] = 11;
               break;
            case '१':
               var3[0] = 2;
               break;
            case 'ก':
               var3[0] = 10;
               break;
            case '๑':
               var3[0] = 3;
               break;
            case 'ア':
               var3[0] = 14;
               break;
            case 'イ':
               var3[0] = 16;
               break;
            case 'ㄱ':
               var3[0] = 17;
               break;
            case '一':
               var3[0] = 4;
               break;
            case '壱':
               var3[0] = 23;
               break;
            case '壹':
               var3[0] = 24;
               break;
            case '子':
               var3[0] = 27;
               break;
            case '甲':
               if (var2 > 1 && var0.charAt(var1 + 1) == 23376) {
                  var3[0] = 28;
                  var2--;
                  var1++;
               } else {
                  var3[0] = 26;
               }
               break;
            case '가':
               var3[0] = 18;
               break;
            case '일':
               var3[0] = 5;
               break;
            case '하':
               var3[0] = 25;
               break;
            case '１':
               var3[0] = 1;
               break;
            case 'ｱ':
               var3[0] = 13;
               break;
            case 'ｲ':
               var3[0] = 15;
               break;
            default:
               var3[0] = 0;
         }
      }

      if (var6) {
         var3[0] = 0;
         var4[0] = 0;
      }
   }

   private static List<t1$n5> n5(String var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = 0;
         boolean var2 = com.aspose.slides.internal.x7i.n5.n5(var0.charAt(var1));
         List var3 = new List();
         int var4 = 0;
         if (var2) {
            var3.addItem(null);
         }

         while (var1 <= var0.length()) {
            boolean var5 = var1 < var0.length() ? com.aspose.slides.internal.x7i.n5.n5(var0.charAt(var1)) : !var2;
            if (var2 != var5) {
               t1$n5 var6 = new t1$n5();
               if (var2) {
                  int[] var7 = new int[]{var6.l6};
                  int[] var8 = new int[]{var6.k5};
                  n5(var0, var4, var1 - var4, var7, var8);
                  var6.l6 = var7[0];
                  var6.k5 = var8[0];
               } else {
                  var6.n5 = true;
                  var6.u3 = com.aspose.slides.ms.System.d1.l6(var0, var4, var1 - var4);
               }

               var4 = var1++;
               var3.addItem(var6);
               var2 = var5;
            } else {
               var1++;
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private String l6(String var1) {
      if (var1 == null || "traditional".equals(var1) || "alphabetic".equals(var1)) {
         return var1;
      } else if (!this.m3) {
         throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "letter-value", var1);
      } else {
         return null;
      }
   }
}
