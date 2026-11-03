package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.ms.System.IDisposable;

class r2v {
   static Shape n5(v5s var0) {
      if (var0.n3() == null) {
         return null;
      }

      if (var0.c8() == 4) {
         return null;
      }

      Shape var1 = l6(var0);
      if (var1 == null) {
         return null;
      }

      a9x var2 = var0.a6();
      var2.n5(var1);
      var0.l6(var1.v4());
      var1.u3(var0.t2());
      com.aspose.slides.internal.k0r.q5 var3 = var2.n3();
      if (var1.isGrouped() && var1.x9().getParentGroup() != null) {
         n5(var1, var3);
      }

      boolean var4 = false;
      if (var0.e2()) {
         IFontData[] var5 = var2.z8();
         Dictionary var6 = new Dictionary();
         AutoShape var7 = com.aspose.slides.internal.v6g.k5.n5(var1, AutoShape.class);
         TextFrameFormat var8 = var7.l6().s7();
         if (var3.x8() != null && var3.x8().u3() != null) {
            String var9 = var3.x8().u3();
            int var10 = 0;
            int var11 = 0;
            String var12 = "";
            List var13 = n5(var3);

            try {
               for (int var14 = 0; var14 < var7.getTextFrame().getParagraphs().getCount(); var14++) {
                  Paragraph var15 = (Paragraph)var7.getTextFrame().getParagraphs().get_Item(var14);

                  for (int var16 = 0; var16 < var15.getPortions().getCount(); var16++) {
                     Portion var17 = (Portion)var15.getPortions().get_Item(var16);
                     if (com.aspose.slides.internal.v6g.k5.l6(var1.getSlide(), Slide.class)) {
                        n5(var5, var6, var17.l6());
                     }

                     var12 = var17.u9();
                     int var18 = com.aspose.slides.ms.System.q1.l6(var12.length(), var9.length());
                     var10 += var18;
                     if (var17.getPortionFormat().getHyperlinkClick() != null && var11 < var13.size()) {
                        while (var11 < var13.size() && ((Integer)((KeyValuePair)var13.get_Item(var11)).getKey()).intValue() < var10) {
                           var11++;
                        }

                        if (var11 >= var13.size()) {
                           throw new Exception("Hyperlink restoring for MetroBlob went wrong");
                        }

                        var17.getPortionFormat()
                           .setHyperlinkClick(s6h.n5((com.aspose.slides.internal.k0r.k6)((KeyValuePair)var13.get_Item(var11)).getValue(), var2));
                     }

                     if (!com.aspose.slides.ms.System.d1.n5(var9)) {
                        if (!com.aspose.slides.ms.System.d1.n5(var17.getText())
                           && "".equals(com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var17.getText(), "_", ""), " ", ""))) {
                           String var19 = com.aspose.slides.ms.System.d1.l6(var9, 0, var18);
                           String var20 = var17.getText();
                           com.aspose.slides.internal.l7h.a5 var21 = new com.aspose.slides.internal.l7h.a5();

                           for (int var22 = 0; var22 < var19.length(); var22++) {
                              if (var22 < var20.length()) {
                                 if (var20.charAt(var22) == '_') {
                                    var21.n5(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.t9.q0(var19.charAt(var22))));
                                 } else {
                                    var21.n5(com.aspose.slides.internal.n2d.u9.l6(com.aspose.slides.ms.System.t9.q0(var19.charAt(var22))));
                                 }
                              } else {
                                 var21.n5(var19.charAt(var22));
                              }
                           }

                           var17.setText(var21.toString());
                        } else {
                           var17.setText(com.aspose.slides.ms.System.d1.l6(var9, 0, var18));
                        }

                        var9 = com.aspose.slides.ms.System.d1.n5(var9, 0, var18);
                        if (com.aspose.slides.ms.System.d1.l6(var9, "\r")) {
                           break;
                        }
                     }
                  }

                  if (com.aspose.slides.ms.System.d1.l6(var9, "\r")) {
                     var9 = com.aspose.slides.ms.System.d1.n5(var9, 0, 1);
                  }
               }
            } catch (RuntimeException var23) {
               var4 = true;
            }

            if (var8.z1() == 1 && var2.z3().y4()) {
               ((FillFormat)var7.getFillFormat()).u9();
               ((EffectFormat)var7.getEffectFormat()).u9();
               if (var7.getLineFormat() != null) {
                  ((LineFormat)var7.getLineFormat()).u9();
               }

               if (var7.getThreeDFormat() != null) {
                  ((ThreeDFormat)var7.getThreeDFormat()).s7();
               }
            }
         }

         if (var3 != null && var3.s7() != null && var3.s7().x8() != null) {
            u5b.n5(var1.getCustomData(), var3.s7().x8());
            String var26 = var1.getCustomData().getTags().get_Item("AS_UNIQUEID");
            if (var26 != null) {
               var1.u3(var26);
               var1.getCustomData().getTags().remove("AS_UNIQUEID");
            }
         }

         if (var8.getAutofitType() == 1) {
            var7.c8();
         } else if (var7.isTextBox() && var8.getAutofitType() == 2) {
            n5(var7, var3);
         }
      }

      if (!var0.e2() || var4) {
         t3.n5(var2);
         AutoShape var24 = com.aspose.slides.internal.v6g.k5.n5(var1, AutoShape.class);
         if (var24 != null) {
            com.aspose.slides.internal.k0r.z5 var25 = com.aspose.slides.internal.v6g.k5.n5(var3.a6().l6().n5(191), com.aspose.slides.internal.k0r.z5.class);
            if (var25 != null && (var25.j5() & 4294967295L & 2L & 4294967295L) != 2L) {
               n5(var24, var3);
            }
         }

         w6n.a6(var0);
      }

      return var1;
   }

   private static void n5(Shape var0, com.aspose.slides.internal.k0r.q5 var1) {
      e4c var2 = new e4c();
      e4c var3 = new e4c();
      x4t var4 = new x4t();
      e4c[] var5 = new e4c[]{var2};
      e4c[] var6 = new e4c[]{var3};
      x4t[] var7 = new x4t[]{var4};
      w9v.n5(var1, var5, var6, var7);
      var5[0].l6(var2);
      var6[0].l6(var3);
      var7[0].n5(var4);
      var0.n5(var2.u9(), var3.u9(), var4.n5());
   }

   private static void n5(IFontData[] var0, Dictionary<String, FontData> var1, PortionFormat var2) {
      IFontData var3 = var2.getLatinFont();
      IFontData var4 = var2.getEastAsianFont();
      IFontData var5 = var2.getComplexScriptFont();
      IFontData var6 = var2.getSymbolFont();
      IPortionFormatEffectiveData var7 = null;
      if (n5(var3)) {
         if (!var1.containsKey(var3.getFontName())) {
            if (var7 == null) {
               var7 = var2.getEffective();
            }

            n5(var0, var1, var3, var7.getLatinFont());
         }

         FontData var8 = n5(var1, var3);
         if (var8 != null) {
            var2.setLatinFont(var8);
         }
      }

      if (n5(var4)) {
         if (!var1.containsKey(var4.getFontName())) {
            if (var7 == null) {
               var7 = var2.getEffective();
            }

            n5(var0, var1, var4, var7.getEastAsianFont());
         }

         FontData var9 = n5(var1, var4);
         if (var9 != null) {
            var2.setEastAsianFont(var9);
         }
      }

      if (n5(var5)) {
         if (!var1.containsKey(var5.getFontName())) {
            if (var7 == null) {
               var7 = var2.getEffective();
            }

            n5(var0, var1, var5, var7.getComplexScriptFont());
         }

         FontData var10 = n5(var1, var5);
         if (var10 != null) {
            var2.setComplexScriptFont(var10);
         }
      }

      if (n5(var6)) {
         if (!var1.containsKey(var6.getFontName())) {
            if (var7 == null) {
               var7 = var2.getEffective();
            }

            n5(var0, var1, var6, var7.getSymbolFont());
         }

         FontData var11 = n5(var1, var6);
         if (var11 != null) {
            var2.setSymbolFont(var11);
         }
      }
   }

   private static boolean n5(IFontData var0) {
      return var0 != null
         && ((((FontData)var0).n5() & 255) == 1 || (((FontData)var0).l6() & 255) == 0)
         && com.aspose.slides.ms.System.d1.l6(var0.getFontName(), "+");
   }

   private static void n5(IFontData[] var0, Dictionary<String, FontData> var1, IFontData var2, IFontData var3) {
      for (IFontData var7 : var0) {
         if (com.aspose.slides.ms.System.d1.a6(var7.getFontName(), var3.getFontName())) {
            if (com.aspose.slides.internal.v6g.k5.l6(var7, c4y.class)) {
               var1.addItem(var2.getFontName(), ((c4y)var7).n5());
            } else {
               var1.addItem(var2.getFontName(), (FontData)var7);
            }

            return;
         }
      }

      var1.addItem(var2.getFontName(), null);
   }

   private static FontData n5(Dictionary<String, FontData> var0, IFontData var1) {
      FontData var2 = (FontData)var0.get_Item(var1.getFontName());
      return var2 == null ? null : new FontData(var1.getFontName(), var2.n5(), var2.l6(), ((FontData)var1).u3(), var2.k5());
   }

   private static List<KeyValuePair<Integer, com.aspose.slides.internal.k0r.k6>> n5(com.aspose.slides.internal.k0r.q5 var0) {
      List var1 = new List();
      List var2 = new List();
      int var3 = 0;
      if (var0 != null && var0.x8() != null && var0.x8().l6() != null) {
         List$Enumerator var4 = var0.x8().l6().y1().iterator();

         try {
            while (var4.hasNext()) {
               com.aspose.slides.internal.k0r.b1 var5 = (com.aspose.slides.internal.k0r.b1)var4.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.k0r.o7.class)) {
                  List$Enumerator var6 = ((com.aspose.slides.internal.k0r.o7)var5).e2().iterator();

                  try {
                     while (var6.hasNext()) {
                        com.aspose.slides.internal.k0r.e6r var7 = (com.aspose.slides.internal.k0r.e6r)var6.next();
                        if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.k0r.k6.class)) {
                           var2.addItem((com.aspose.slides.internal.k0r.k6)var7);
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                        var6.dispose();
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         List$Enumerator var23 = var0.x8().l6().y1().iterator();

         try {
            while (var23.hasNext()) {
               com.aspose.slides.internal.k0r.b1 var24 = (com.aspose.slides.internal.k0r.b1)var23.next();
               com.aspose.slides.internal.k0r.c7f var25 = com.aspose.slides.internal.v6g.k5.n5(var24, com.aspose.slides.internal.k0r.c7f.class);
               if (var25 != null && var25.y2() == 0) {
                  var1.addItem(new KeyValuePair<>(var25.k5(), var2.get_Item(var3++)));
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
               var23.dispose();
            }
         }
      }

      return var1;
   }

   private static Shape l6(v5s var0) {
      GroupShape var1 = var0.u9().u3();
      List var2 = var0.n3().e2();
      i1x var3 = var0.u3().u9();
      n0r.n5(null, null, var3.n5());
      List$Enumerator var4 = var2.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.c8m.j8 var5 = (com.aspose.slides.internal.c8m.j8)var4.next();
            n1n var6 = new n1n(var5, var3.n5());
            com.aspose.slides.internal.k4y.e2 var7 = null;

            try {
               var7 = var6.n5(var3);
            } catch (XmlException var20) {
               com.aspose.slides.internal.n8e.v4.n5(var20);
            }

            if (var7 == null) {
               return null;
            }

            var3.n5().n5(var5.e2());
            List$Enumerator var8 = var7.k5().iterator();

            try {
               while (var8.hasNext()) {
                  com.aspose.slides.internal.k4y.g7 var9 = (com.aspose.slides.internal.k4y.g7)var8.next();
                  IShape var10 = r3m.n5(var9, var1, var3);
                  if (var10 != null) {
                     return (Shape)var10;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return null;
   }

   static void n5(k1z var0) {
      y2q var1 = var0.u3().a6();
      com.aspose.slides.internal.k0r.q5 var2 = var0.z3();
      com.aspose.slides.internal.k0r.a9 var3 = var2.h0();
      Shape var4 = var0.q0();
      if (var4 == null) {
         var4 = var0.s7();
      }

      Shape var5 = var4;
      if (var0.r4().n5() != null) {
         boolean var6 = com.aspose.slides.internal.v6g.k5.l6(var0, x1k.class) || com.aspose.slides.internal.v6g.k5.l6(var0, w2h.class);
         com.aspose.slides.internal.c8m.t6 var7 = new com.aspose.slides.internal.c8m.t6();
         var0.u3().a6().n5().t9().n5(var7.c8());
         com.aspose.slides.internal.c8m.j8 var8 = null;
         if (var5 != null) {
            if (com.aspose.slides.internal.v6g.k5.l6(var5, AutoShape.class)) {
               var8 = var7.n5("/drs/shapexml.xml", null, new com.aspose.slides.internal.c8m.y0());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, IGroupShape.class)
               || com.aspose.slides.internal.v6g.k5.l6(var5, ITable.class)
               || com.aspose.slides.internal.v6g.k5.l6(var5, SmartArt.class)) {
               var8 = var7.n5("/drs/e2oDoc.xml", null, new com.aspose.slides.internal.c8m.a3());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, IConnector.class)) {
               var8 = var7.n5("/drs/connector.xml", null, new com.aspose.slides.internal.c8m.v0());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, IPictureFrame.class)) {
               var8 = var7.n5("/drs/picturexml.xml", null, new com.aspose.slides.internal.c8m.x9());
            } else if (com.aspose.slides.internal.v6g.k5.l6(var5, Ink.class)) {
               var8 = var7.n5("/drs/inkxml.xml", null, new com.aspose.slides.internal.c8m.p3());
            }
         }

         if (var8 != null) {
            var7.c8().l6(var8);
            n1n var9 = new n1n(var8, var1.n5().t9());
            if (var9.n5(var5, var1.z3())) {
               n5(var8, var7, var1.z3().n5().a6());
               var6 = true;
            }
         }

         com.aspose.slides.internal.c8m.j8 var12 = var7.n5("/drs/downrev.xml", null, new com.aspose.slides.internal.c8m.f0());
         var7.c8().l6(var12);
         l6z var10 = new l6z(var12, var1.n5().t9());
         var10.n5(var5, var0);
         if (var6) {
            com.aspose.slides.internal.k0r.v8 var11 = new com.aspose.slides.internal.k0r.v8(937, var7.k7());
            var3.l6().l6(var11);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.c8m.j8 var0, com.aspose.slides.internal.c8m.t6 var1, com.aspose.slides.internal.c8m.d9 var2) {
      IGenericEnumerator var3 = var0.e2().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.c8m.r7 var4 = (com.aspose.slides.internal.c8m.r7)var3.next();
            com.aspose.slides.internal.c8m.j8 var5 = var2.u9(var4.n5());
            if (var5 != null) {
               if (var5.e2() != null && var5.e2().n5() > 0) {
                  IGenericEnumerator var6 = var5.e2().iterator();

                  try {
                     while (var6.hasNext()) {
                        com.aspose.slides.internal.c8m.r7 var7 = (com.aspose.slides.internal.c8m.r7)var6.next();
                        if (var7.h0() != 1) {
                           com.aspose.slides.internal.c8m.j8 var8 = var2.u9(var7.n5());
                           String var9 = com.aspose.slides.ms.System.d1.n5(var8.l6(), "ppt", "drs");
                           var7.n5(var9);
                           if (var1.u9(var9) == null) {
                              var1.n5(var9, null, var8.y4(), var8.a6());
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                        var6.dispose();
                     }
                  }

                  var1.l6(var2.u9(com.aspose.slides.internal.c8m.z6.a6(var5.l6())));
               }

               var1.l6(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }
}
