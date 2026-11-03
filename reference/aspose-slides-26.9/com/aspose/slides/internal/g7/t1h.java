package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Iterator;

public class t1h extends a4 implements l7 {
   private p9 n5;
   private p9 l6;
   private p9 k5;
   private p9 u3;
   private c4i a6;
   private u7 u9 = new u7();
   private static final com.aspose.slides.internal.r7c.c8 h0 = new com.aspose.slides.internal.r7c.c8(
      "(^\\W*(-?[0-9a-fA-F]*))|(WX\\W+(-?[\\d]+))|(N\\W+([^;\\W\r\n]+))|(B\\W+([^;\r\n]+))", 70
   );
   private static final com.aspose.slides.internal.r7c.c8 c8 = new com.aspose.slides.internal.r7c.c8("^\\W*([^\\W\r\n]*)\\W*([^\\W\r\n]*)\\W*(-?[\\d]*)", 70);
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "EncodingScheme",
      "FontName",
      "FamilyName",
      "Weight",
      "ItalicAngle",
      "UnderlinePosition",
      "UnderlineThickness",
      "CapHeight",
      "XHeight",
      "Ascender",
      "Descender",
      "StdHW",
      "StdVW",
      "IsFixedPitch",
      "FontBBox",
      "StartCharMetrics",
      "StartComposites",
      "StartKernPairs",
      "StartTrackKern",
      "AdobeStandardEncoding",
      "FontSpecific",
      "JIS12-88-CFEncoding",
      "CharStrings",
      "version",
      "Notice",
      "FullName",
      "isFixedPitch",
      "Encoding",
      "PaintType",
      "FontType",
      "FontMatrix",
      "UniqueID",
      "Metrics",
      "StrokeWidth",
      "RD",
      "ND",
      "NP",
      "Subrs",
      "OtherSubrs",
      "BlueValues",
      "OtherBlues",
      "FamilyBlues",
      "FamilyOtherBlues",
      "BlueScale",
      "BlueShift",
      "BlueFuzz",
      "StemSnapH",
      "StemSnapV",
      "ForceBold",
      "LanguageGroup",
      "password",
      "lenIV",
      "MinFeature",
      "RndStemUp"
   );

   @Override
   public i2 n5(n2 var1) {
      try {
         this.l6(var1);
         if (this.l6 != null || this.n5 != null) {
            this.a6 = new c4i(var1);
         } else if (this.u3 != null || this.k5 != null) {
            this.a6 = new v7o(var1);
         }

         this.n5();
         return this.a6;
      } catch (l0 var3) {
         throw var3;
      } catch (RuntimeException var4) {
         throw new f9d("Unexpected font parsing exception", var4);
      }
   }

   private void l6(n2 var1) {
      if (var1 == null) {
         throw new s2("Font creation error. Could not find the font.");
      }

      if (var1.k5().length == 1 && var1.k5()[0].l6() == null) {
         this.n5 = var1.k5()[0];
         this.u9.n5(false);
      } else {
         for (int var2 = var1.k5().length - 1; var2 >= 0; var2--) {
            if (com.aspose.slides.ms.System.d1.a6(var1.k5()[var2].l6(), m2n.n5())) {
               this.n5 = var1.k5()[var2];
               this.u9.n5(false);
            }

            if (com.aspose.slides.ms.System.d1.a6(var1.k5()[var2].l6(), m2n.l6())) {
               this.l6 = var1.k5()[var2];
               this.u9.n5(true);
            } else if (com.aspose.slides.ms.System.d1.a6(var1.k5()[var2].l6(), m2n.k5())) {
               this.k5 = var1.k5()[var2];
            } else if (com.aspose.slides.ms.System.d1.a6(var1.k5()[var2].l6(), m2n.u3())) {
               this.u3 = var1.k5()[var2];
            }
         }
      }
   }

   private void n5() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.a6, c4i.class) && !com.aspose.slides.internal.v6g.k5.l6(this.a6, v7o.class)) {
         z4 var1 = this.u9.k5() ? this.l6.k5() : this.n5.k5();
         com.aspose.slides.internal.z0k.t4 var2 = var1.l6();

         try {
            var2.setPosition(0L);
            byte[] var3 = new byte[(int)var2.getLength()];
            var2.read(var3, 0, (int)var2.getLength());
            this.u9.n5(var3);
            z3b var4 = new z3b(this.u9);
            var4.n5(this);

            try {
               var4.t4();
            } finally {
               var4.n5((l7)null);
            }

            int var5 = 0;
            this.u9.n5(this.a6.n5().n5());
            e3 var6 = new e3(this.u9);
            var6.n5(this);

            try {
               int[] var7 = new int[]{0};
               var6.l6(0, var7);
               var5 = var7[0];
            } finally {
               var6.n5((l7)null);
            }
         } finally {
            if (var1 != null && var1.u3()) {
               var2.close();
            }
         }
      }

      z4 var42 = this.u3 != null ? this.u3.k5() : (this.k5 != null ? this.k5.k5() : null);
      if (var42 != null) {
         com.aspose.slides.internal.z0k.t4 var43 = var42.l6();

         try {
            var43.setPosition(0L);
            byte[] var44 = new byte[(int)var43.getLength()];
            var43.read(var44, 0, (int)var43.getLength());
            this.u9.n5(var44);
            k5 var45 = new k5(this.u9);
            var45.n5(this);

            try {
               var45.u3();
            } finally {
               var45.n5((l7)null);
            }
         } finally {
            if (var42.u3()) {
               var43.close();
            }
         }
      }

      if ("ZapfDingbats".equals(this.a6.u9())) {
         ((u0b)this.a6.s7()).n5(e8b.n5);
      }
   }

   @Override
   public final void n5(Object var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, k5.class)) {
         this.l6(var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, e3.class)) {
         this.k5(var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, z3b.class)) {
         this.u3(var1);
      }
   }

   private void l6(Object var1) {
      k5 var2 = (k5)var1;

      for (Object recoveredElement$var4$5851 : var2.n5().n5()) {
         a1 var4 = (a1)recoveredElement$var4$5851;
         switch (t2.n5(var4.n5())) {
            case 0:
               if (!com.aspose.slides.internal.v6g.k5.l6(this.a6, v7o.class)) {
                  break;
               }

               String var38 = (String)var4.l6();
               switch (t2.n5(var38)) {
                  case 19:
                     ((u0b)this.a6.s7()).n5().n5();
                     continue;
                  case 20:
                     ((u0b)this.a6.s7()).n5().clear();
                     b9 var39 = r6.n5().u3().n5(this.a6.u9());
                     if (var39 != null) {
                        IGenericEnumerator var41 = var39.getKeys().iterator();

                        try {
                           while (var41.hasNext()) {
                              int var43 = com.aspose.slides.internal.v6g.k5.u3(var41.next(), int.class);
                              ((u0b)this.a6.s7()).n5().n5(var43, var39.n5(var43));
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var41, IDisposable.class)) {
                              var41.dispose();
                           }
                        }
                     }
                  case 21:
                  default:
                     continue;
               }
            case 1:
               ((q5v)this.a6.t2()).n5((String)var4.l6());
               break;
            case 2:
               ((q5v)this.a6.t2()).l6((String)var4.l6());
               break;
            case 3:
               ((q5v)this.a6.t2()).k5((String)var4.l6());
               break;
            case 4:
               ((q5v)this.a6.t2()).l6(a6(var4));
               break;
            case 5:
               ((q5v)this.a6.t2()).k5(a6(var4));
               break;
            case 6:
               ((q5v)this.a6.t2()).u3(a6(var4));
               break;
            case 7:
               ((q5v)this.a6.t2()).a6(a6(var4));
               break;
            case 8:
               ((q5v)this.a6.t2()).u9(a6(var4));
               break;
            case 9:
               ((q5v)this.a6.t2()).k5 = a6(var4);
               break;
            case 10:
               ((q5v)this.a6.t2()).u3 = a6(var4);
               break;
            case 11:
               ((q5v)this.a6.t2()).h0(a6(var4));
               break;
            case 12:
               ((q5v)this.a6.t2()).c8(a6(var4));
               break;
            case 13:
               ((q5v)this.a6.t2()).n5(u9(var4));
               break;
            case 14:
               String var37 = (String)var4.l6();
               String[] var6 = com.aspose.slides.ms.System.d1.u9(var37, ' ', '\t');
               if (var6.length == 4) {
                  try {
                     ((q5v)this.a6.t2()).n5(new z9(g9.l6(var6[0]), g9.l6(var6[1]), g9.l6(var6[2]), g9.l6(var6[3])));
                  } catch (FormatException var33) {
                  }
               }
               break;
            case 15:
               u2 var45 = (u2)var4.l6();

               for (Object recoveredElement$var42$8928 : var45.n5()) {
                  a1 var42 = (a1)recoveredElement$var42$8928;
                  if (var42.k5() == 0) {
                     String var36 = (String)var42.l6();
                     com.aspose.slides.internal.r7c.u9 var44 = h0.k5(var36);
                     String var46 = com.aspose.slides.ms.System.d1.n5;
                     String var47 = com.aspose.slides.ms.System.d1.n5;
                     String var48 = com.aspose.slides.ms.System.d1.n5;
                     z9 var14 = null;
                     Iterator var15 = var44.iterator();

                     try {
                        while (var15.hasNext()) {
                           com.aspose.slides.internal.r7c.u3 var16 = (com.aspose.slides.internal.r7c.u3)var15.next();
                           if (var16.a6().n5(4).u3()) {
                              var46 = var16.a6().n5(4).k5();
                           }

                           if (var16.a6().n5(6).u3()) {
                              var47 = var16.a6().n5(6).k5();
                           }

                           if (var16.a6().n5(8).u3()) {
                              var48 = com.aspose.slides.ms.System.d1.l6(var16.a6().n5(8).k5());
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
                           ((IDisposable)var15).dispose();
                        }
                     }

                     if (!com.aspose.slides.ms.System.d1.n5(var48)) {
                        String[] var49 = com.aspose.slides.ms.System.d1.u9(var48, ' ', '\t');
                        if (var49.length == 4) {
                           try {
                              var14 = new z9(g9.l6(var49[0]), g9.l6(var49[1]), g9.l6(var49[2]), g9.l6(var49[3]));
                           } catch (FormatException var32) {
                           }
                        }
                     }

                     try {
                        ((q5v)this.a6.t2()).n5(new k3(var47), com.aspose.slides.ms.System.a3.n5(var46), var14);
                     } catch (FormatException var31) {
                        j1.n5(com.aspose.slides.ms.System.d1.n5("Error happened during parsing glyph {0} metrics", new Object[]{var47}));
                     }
                  }
               }
            case 16:
            case 18:
            default:
               break;
            case 17:
               u2 var10 = (u2)var4.l6();

               for (Object recoveredElement$var8$11427 : var10.n5()) {
                  a1 var8 = (a1)recoveredElement$var8$11427;
                  if (var8.k5() == 0) {
                     String var5 = (String)var8.l6();
                     com.aspose.slides.internal.r7c.u3 var9 = c8.l6(var5);
                     if (var9.u3()) {
                        String var11 = var9.a6().n5(1).k5();
                        String var12 = var9.a6().n5(2).k5();
                        String var13 = var9.a6().n5(3).k5();

                        try {
                           ((q5v)this.a6.t2()).n5(new k3(var11), new k3(var12), g9.l6(var13));
                        } catch (FormatException var30) {
                           j1.n5(com.aspose.slides.ms.System.d1.n5("Error happened during parsing kerning pair glyph1: {0}; glyph2: {0}",new Object[]{ var11, var12}));
                        }
                     }
                  }
               }
         }
      }
   }

   private void k5(Object var1) {
      e3 var2 = (e3)var1;

      for (Object recoveredElement$var4$12362 : var2.n5()) {
         a1 var4 = (a1)recoveredElement$var4$12362;
         this.n5(this.a6, var4);
      }
   }

   private void u3(Object var1) {
      z3b var2 = (z3b)var1;

      for (Object recoveredElement$var4$12506 : var2.u3()) {
         a1 var4 = (a1)recoveredElement$var4$12506;
         this.n5(this.a6, var4);
      }

      this.a6.n5().n5(var2.n5());
   }

   private static void n5(c4i var0, u2 var1) {
      var0.n5().c8().n5 = new r1[var1.n5().size()];
      var0.n5().c8().l6 = new Dictionary<>();

      for (int var2 = 0; var2 < var1.n5().size(); var2++) {
         a1 var3 = var1.n5().n5(var2);
         r1 var4 = new r1();
         var4.n5(var3.n5());
         if (var3.k5() == 8) {
            var4.n5((byte[])var3.l6());
         }

         var0.n5().c8().n5[var2] = var4;
         var0.n5().c8().l6.set_Item(var4.n5(), var2);
      }
   }

   private static void n5(c4i var0, s5r var1) {
      var0.n5().h0().n5(new c1());
      var0.n5().h0().n5().n5 = new h3[var1.n5().size()];

      for (int var2 = 0; var2 < var1.n5().size(); var2++) {
         s7 var3 = var1.n5().n5(var2);
         h3 var4 = new h3();
         if (var3.n5() != null && com.aspose.slides.internal.v6g.k5.l6(var3.n5(), byte[].class)) {
            var4.n5(com.aspose.slides.internal.v6g.k5.k5(var3.n5(), byte[].class));
         }

         if (var3.l6() >= 0 && var3.l6() <= var0.n5().h0().n5().n5.length) {
            var0.n5().h0().n5().n5[var3.l6()] = var4;
         }
      }
   }

   private void n5(c4i var1, a1 var2) {
      if (var2.k5() == 3) {
         switch (t2.n5(var2.n5())) {
            case 22:
               n5(this.a6, (u2)var2.l6());
               break;
            default:
               this.l6(var1, (u2)var2.l6());
         }
      } else {
         switch (t2.n5(var2.n5())) {
            case 1:
               var1.n5().n5(l6(var2));
               break;
            case 2:
               var1.n5().l6().u3(l6(var2));
               break;
            case 3:
               var1.n5().l6().a6(l6(var2));
               break;
            case 4:
               var1.n5().l6().n5(u3(var2));
               break;
            case 5:
               var1.n5().l6().l6(u3(var2));
               break;
            case 6:
               var1.n5().l6().k5(u3(var2));
            case 7:
            case 8:
            case 9:
            case 10:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            default:
               break;
            case 11:
               var1.n5().h0().u3(l6(var2));
               break;
            case 12:
               var1.n5().h0().a6(l6(var2));
               break;
            case 14:
               var1.n5().a6().n5(n5(var2));
               break;
            case 23:
               var1.n5().l6().n5(l6(var2));
               break;
            case 24:
               var1.n5().l6().l6(l6(var2));
               break;
            case 25:
               var1.n5().l6().k5(l6(var2));
               break;
            case 26:
               var1.n5().l6().n5(u9(var2));
               break;
            case 27:
               if (var2.k5() == 0) {
                  String var3 = l6(var2);
                  if (!"StandardEncoding".equals(var3)) {
                     throw new NotSupportedException(com.aspose.slides.ms.System.d1.n5("The encoding named '{0}' is not supporded", new Object[]{var3}));
                  }

                  ((u0b)var1.s7()).n5().n5();
               } else if (var2.k5() == 4) {
                  s5r var16 = (s5r)var2.l6();

                  for (Object recoveredElement$var5$15950 : var16.n5()) {
                     s7 var5 = (s7)recoveredElement$var5$15950;
                     if (var5.k5() == 1) {
                        boolean var6 = true;
                        byte var7 = 2;
                        byte var8 = 3;
                        com.aspose.slides.internal.r7c.c8 var9 = new com.aspose.slides.internal.r7c.c8("(\\d+)\\s(\\d+)\\s(\\d+)");
                        String var10 = com.aspose.slides.internal.l7h.j5.e2().l6(com.aspose.slides.internal.g7.t2.n5((Byte[])var5.n5()));
                        com.aspose.slides.internal.r7c.u3 var11 = var9.l6(var10);
                        if (var11.a6().n5(1).u3() && var11.a6().n5(2).u3() && var11.a6().n5(3).u3()) {
                           int var12 = com.aspose.slides.ms.System.a3.n5(var11.a6().n5(1).k5());
                           int var13 = com.aspose.slides.ms.System.a3.n5(var11.a6().n5(2).k5());
                           int var14 = com.aspose.slides.ms.System.a3.n5(var11.a6().n5(3).k5());

                           for (int var15 = var12; var15 <= var14; var15 += var13) {
                              ((u0b)var1.s7()).n5().n5(var15, ".notdef");
                           }
                        }
                     } else if (var5.k5() == 2) {
                        ((u0b)var1.s7()).n5().n5(var5.l6(), com.aspose.slides.internal.l7h.j5.e2().l6((byte[])var5.n5()));
                     }
                  }
               }
               break;
            case 28:
               var1.n5().n5(k5(var2));
               break;
            case 29:
               var1.n5().l6(k5(var2));
               break;
            case 30:
               var1.n5().u3().n5(n5(var2));
               break;
            case 31:
               var1.n5().k5(k5(var2));
               break;
            case 32:
               var1.n5().u9().n5(l6(var2));
               break;
            case 33:
               var1.n5().n5((double)k5(var2));
               break;
            case 34:
               var1.n5().h0().n5(l6(var2));
               break;
            case 35:
               var1.n5().h0().l6(l6(var2));
               break;
            case 36:
               var1.n5().h0().k5(l6(var2));
               break;
            case 37:
               n5(this.a6, h0(var2));
               break;
            case 38:
               var1.n5().h0().k5(var2.l6().toString());
               break;
            case 39:
               var1.n5().h0().n5(n5(var2));
               break;
            case 40:
               var1.n5().h0().l6(n5(var2));
               break;
            case 41:
               var1.n5().h0().k5(n5(var2));
               break;
            case 42:
               var1.n5().h0().u3(n5(var2));
               break;
            case 43:
               var1.n5().h0().n5(u3(var2));
               break;
            case 44:
               var1.n5().h0().n5(k5(var2));
               break;
            case 45:
               var1.n5().h0().l6(k5(var2));
               break;
            case 46:
               var1.n5().h0().u9(l6(var2));
               break;
            case 47:
               var1.n5().h0().h0(l6(var2));
               break;
            case 48:
               var1.n5().h0().n5(u9(var2));
               break;
            case 49:
               var1.n5().h0().k5(k5(var2));
               break;
            case 50:
               var1.n5().h0().u3(k5(var2));
               break;
            case 51:
               var1.n5().h0().a6(k5(var2));
               this.u9.n5(var1.n5().h0().u9());
               break;
            case 52:
               var1.n5().h0().c8(l6(var2));
               break;
            case 53:
               var1.n5().h0().n5(u9(var2));
         }
      }
   }

   private static double[] n5(a1 var0) {
      try {
         if (var0.k5() == 5) {
            String var1 = (String)var0.l6();
            if (var1.length() > 0) {
               String[] var2 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.l6(var1), ' ', '\t');
               int var3 = 0;

               for (String var7 : var2) {
                  if (!com.aspose.slides.ms.System.d1.n5(var7)) {
                     var3++;
                  }
               }

               double[] var11 = new double[var3];
               int var12 = 0;

               for (String var9 : var2) {
                  if (!com.aspose.slides.ms.System.d1.n5(var9)) {
                     var11[var12++] = g9.l6(var9);
                  }
               }

               return var11;
            }
         }
      } catch (FormatException var10) {
         j1.n5(com.aspose.slides.ms.System.d1.n5("Error happened during parsing array: {0}", new Object[]{(String)var0.l6()}));
      }

      return new double[0];
   }

   private static String l6(a1 var0) {
      return var0.k5() == 0 ? (String)var0.l6() : com.aspose.slides.ms.System.d1.n5;
   }

   private static int k5(a1 var0) {
      if (var0.k5() == 2 || var0.k5() == 1) {
         if (com.aspose.slides.internal.v6g.k5.l6(var0.l6(), Double.class)) {
            return com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.u3(var0.l6(), double.class), 14);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var0.l6(), Integer.class)) {
            return com.aspose.slides.internal.v6g.k5.u3(var0.l6(), int.class);
         }
      }

      return Integer.MIN_VALUE;
   }

   private static double u3(a1 var0) {
      return var0.k5() == 2 && com.aspose.slides.internal.v6g.k5.l6(var0.l6(), Double.class)
         ? com.aspose.slides.internal.v6g.k5.u3(var0.l6(), double.class)
         : -Double.MAX_VALUE;
   }

   private static double a6(a1 var0) {
      if (var0.k5() == 2 && com.aspose.slides.internal.v6g.k5.l6(var0.l6(), Double.class)) {
         return com.aspose.slides.internal.v6g.k5.u3(var0.l6(), double.class);
      } else if (var0.k5() == 0 && com.aspose.slides.internal.v6g.k5.l6(var0.l6(), String.class)) {
         double var1 = -Double.MAX_VALUE;
         double[] var3 = new double[]{-Double.MAX_VALUE};
         com.aspose.slides.ms.System.d2.n5(g9.n5((String)var0.l6()), 167, com.aspose.slides.internal.x7n.l6.k5(), var3);
         return var3[0];
      } else {
         return -Double.MAX_VALUE;
      }
   }

   private static boolean u9(a1 var0) {
      if (var0.k5() == 0 && com.aspose.slides.internal.v6g.k5.l6(var0.l6(), String.class)) {
         try {
            return com.aspose.slides.ms.System.n3.n5((String)var0.l6());
         } catch (FormatException var2) {
         }
      }

      return false;
   }

   private static s5r h0(a1 var0) {
      return var0.k5() == 4 ? (s5r)var0.l6() : null;
   }

   private void l6(c4i var1, u2 var2) {
      for (Object recoveredElement$var4$22654 : var2.n5()) {
         a1 var4 = (a1)recoveredElement$var4$22654;
         this.n5(var1, var4);
      }
   }
}
