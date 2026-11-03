package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class g5x {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "horz", "vert", "vert270", "wordArtVert", "eaVert", "mongolianVert", "wordArtVertRtl"
   );

   static void n5(p3f var0) {
      if (var0.y4()) {
         a6(var0);
      } else {
         if (var0.a6() != null) {
            l6(var0);
         }
      }
   }

   static void l6(p3f var0) {
      TextFrame var1 = var0.h0();
      k5(var0);
      u3(var0);
      c3d var2 = var1.n5.a6();
      if (var0.x8() != null) {
         var2.n5((com.aspose.slides.internal.k0r.z1n[])var0.x8().toArray(new com.aspose.slides.internal.k0r.z1n[0]));
      }
   }

   private static void a6(p3f var0) {
      a9x var1 = var0.l6();
      com.aspose.slides.internal.k0r.q5 var2 = var1.n3();
      TextFrame var3 = var0.h0();
      u3(var0);
      d3r.n5(var3.s7().getThreeDFormat(), true, var1);
      var3.getParagraphs().clear();
      com.aspose.slides.internal.k0r.w8 var4 = var2.a6().l6();
      com.aspose.slides.internal.k0r.i6 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(192), com.aspose.slides.internal.k0r.i6.class);
      if (var5 == null) {
         throw new InvalidOperationException();
      }

      if (var2.u3().t2() == 136) {
         var3.n5.c8().n5((byte)1);
      }

      String var6 = w6n.n5(var5.l6());
      ParagraphCollection var7 = (ParagraphCollection)var3.getParagraphs();
      Paragraph var8 = new Paragraph();
      var8.getParagraphFormat().setAlignment(1);
      IPortion var9 = ((PortionCollection)var8.getPortions()).n5();
      PortionFormat var10 = (PortionFormat)var9.getPortionFormat();
      e7c.n5(var10, var1);
      int var11 = 0;
      int[] var12 = new int[]{0};
      String var13 = null;

      while ((var13 = f5q.n5(var6, var12)) != null) {
         var11 = var12[0];
         var9.setText(var13);
         var8.n5(true);
         var7.add(var8);
         var8 = new Paragraph();
         var8.getParagraphFormat().setAlignment(1);
         var9 = new Portion(var10);
         var8.getPortions().add(var9);
      }

      if (var11 < var6.length()) {
         var9.setText(var11 > 0 ? com.aspose.slides.ms.System.d1.k5(var6, var11) : var6);
         var7.add(var8);
      }

      u9(var0);
   }

   private static void u9(p3f var0) {
      if (var0.y4()) {
         var0.h0().n5.u9((byte)1);
      }

      p6s.n5(var0);
      if (var0.y4()) {
         g6v.n5(var0);
      }
   }

   private static void l6(IParagraphFormat var0, ParagraphFormat var1, byte var2, com.aspose.slides.internal.k0r.t9p var3, d5f var4, boolean var5) {
      if (var5 && var3 != null && var0 != null) {
         SortedList var6 = var4.s7();
         if ((var2 & 255) < var3.l6().size()) {
            com.aspose.slides.internal.k0r.v9e var7 = var3.l6().get_Item(var2 & 255);
            com.aspose.slides.internal.k0r.d2n var8 = var7.n5();
            IBulletFormat var9 = var0.getBullet();
            boolean var10 = var1 != null && var1.l6().t2();
            if (var8.j5()) {
               if (var10 && var1.l6().getType() == 1) {
                  var9.setType((byte)1);
                  var9.setNumberedBulletStyle((byte)-1);
                  if (var1.l6().s7() && (short)var9.getChar() == -1) {
                     var9.setChar(var1.l6().getChar());
                  }
               }

               return;
            }

            if (var8.n5().l6() && (var8.n5().n5() & '\uffff' & 65535) != 65535 && var6.containsKey(Integer.valueOf(var8.n5().n5()))) {
               ((BulletFormat)var0.getBullet()).getPicture().setImage(((y8g)var6.get_Item(var8.n5().n5().intValue())).k5());
               var9.setType((byte)3);
            }

            if (var9.getType() == -1 && !var10) {
               return;
            }

            if (var8.l6() != 1 && var10 && var9.getType() == -1) {
               var9.setType((byte)1);
               var9.setNumberedBulletStyle((byte)-1);
            }

            if (var8.l6() == 1) {
               var9.setType((byte)2);
               var9.setNumberedBulletStyle((byte)3);
               var9.setNumberedBulletStartWith((short)1);
            }

            if (var8.k5() != null) {
               var9.setNumberedBulletStyle((byte)var8.k5().n5());
               var9.setNumberedBulletStartWith(var8.k5().l6());
               var9.setType((byte)2);
            }
         }
      }
   }

   private static void n5(TextFrame var0, com.aspose.slides.internal.k0r.n1g var1) {
      IParagraphCollection var2 = var0.getParagraphs();
      IParagraphFormat[] var3 = new ParagraphFormat[5];

      for (int var4 = 0; var4 < 5; var4++) {
         var3[var4] = var0.getTextFrameFormat().getTextStyle().getLevel(var4);
      }

      TabCollection var21 = null;
      if (var1.l6() != null) {
         var21 = new TabCollection(null);
         IGenericEnumerator var5 = var1.l6().iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.k0r.m5l var6 = (com.aspose.slides.internal.k0r.m5l)var5.next();
               double var7 = var6.n5() / 8.0;
               int var9 = f8b.u3(var6.k5());
               var21.add(var7, var9);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      IGenericEnumerator var22 = var2.iterator();

      try {
         while (var22.hasNext()) {
            Paragraph var23 = (Paragraph)var22.next();
            ParagraphFormat var11 = (ParagraphFormat)var23.getParagraphFormat();
            short var12 = var23.getParagraphFormat().getDepth();
            if (var1.n5().l6()) {
               var11.setDefaultTabSize(f8b.l6(var1.n5().n5()));
            }

            if (var21 != null) {
               ((TabCollection)var11.getTabs()).n5(var21);
            }

            com.aspose.slides.internal.k0r.e6a var24 = var1.n5(var12);
            if (var24 != null) {
               f8b$n5 var10 = new f8b$n5();
               var24.n5().n5(var10.n5);
               var24.l6().n5(var10.l6);
               if ((!var10.n5.l6() || !var10.l6.l6()) && var3[var12] != null) {
                  f8b$n5 var13 = new f8b$n5();
                  var13.k5 = var3[var12].getMarginLeft();
                  var13.u3 = var3[var12].getIndent();
                  f8b.l6(var13);
                  if (!var10.n5.l6()) {
                     var13.n5.n5(var10.n5);
                  }

                  if (!var10.l6.l6()) {
                     var13.l6.n5(var10.l6);
                  }
               }

               if (com.aspose.slides.ms.System.n1.k5(var11.getIndent()) && com.aspose.slides.ms.System.n1.k5(var11.getMarginLeft())) {
                  f8b.n5(var10);
                  var11.setMarginLeft(var10.k5);
                  var11.setIndent(var10.u3);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }
   }

   static void k5(p3f var0) {
      com.aspose.slides.internal.k0r.r5w var1 = var0.a6();
      TextFrame var2 = var0.h0();
      List var3 = var0.s7();
      d5f var4 = var0.c8();
      int var5 = var0.u3();
      ((TextFrameFormat)var2.getTextFrameFormat()).a6().n5(new com.aspose.slides.ms.System.o5<>(var5));
      if (var1.a6()) {
         if (var0.n3()) {
            if (var0.t2() != null) {
               var2.n5.h0().n5(new com.aspose.slides.ms.System.o5<>(var5));
               var2.n5.h0().n5(var0.t2().h0());
            }
         } else if (var4.m3().containsKey(var5) && var4.m3().get_Item(var5).h0() != null) {
            TextStyle var6 = var2.n5.h0();
            if (var6 == null) {
               var6 = new TextStyle(var2.n5);
               var2.n5.h0().n5(var6);
            }

            var2.n5.h0().k5(var4.m3().get_Item(var5).h0());
         }
      }

      String var13 = "";
      if (var1.u9()) {
         var13 = var1.m3();
         if (var4.u3 && !com.aspose.slides.ms.System.d1.n5(var13)) {
            var13 = com.aspose.slides.internal.r7c.c8.n5(var13, "[\\u0001-\\u0008\\u000E-\\u001F]", "");
         }
      }

      g5x$k5 var7 = var1.u9() ? new g5x$k5(var13, var4.m3().get_Item(var5)) : new g5x$k5(com.aspose.slides.ms.System.d1.n5, null);
      if (var1.h0()) {
         var7.n5(var1.w1());
      }

      if (var1.y4()) {
         var7.n5(var1.a0());
      }

      if (var1.s7()) {
         var7.n5(var1.r4());
      }

      if (var1.c8()) {
         var7.n5(var1.y2(), var0.l6().y4().n3() > 4 ? var4.h0().q0() : var4.h0().t4());
      }

      if (var1.x8()) {
         var7.n5(var1.y1(), var0);
      }

      for (int var8 = 0; var8 < var3.size(); var8++) {
         switch (((com.aspose.slides.internal.k0r.e6r)var3.get_Item(var8)).w1().u3()) {
            case 4006:
               l4e.n5(var2.n5.h0(), ((com.aspose.slides.internal.k0r.q8g)var3.get_Item(var8)).l6());
               break;
         }
      }

      for (int var14 = 0; var14 <= 8; var14++) {
         IParagraphFormat var9 = var2.getTextFrameFormat().getTextStyle().getLevel(var14);
         if (var9 != null && !((ParagraphFormat)var9).equals(Presentation.u9)) {
            com.aspose.slides.internal.k0r.r7n var10 = var4.h0().t2().c8();
            if (var9.getDefaultPortionFormat().getLanguageId() == null && var10 != null) {
               com.aspose.slides.ms.System.o5 var11 = var10.l6().n5().k5();
               if (!var11.l6()) {
                  var11 = new com.aspose.slides.ms.System.o5<>(1049);
               }

               var9.getDefaultPortionFormat().setLanguageId(f8b.n5((Integer)var11.n5() & 65535));
            }

            if (var9.getDefaultPortionFormat().getAlternativeLanguageId() == null && var10 != null) {
               com.aspose.slides.ms.System.o5 var15 = var10.l6().l6().k5();
               if (!var15.l6()) {
                  var15 = new com.aspose.slides.ms.System.o5<>(0);
               }

               var9.getDefaultPortionFormat().setAlternativeLanguageId(f8b.n5((Integer)var15.n5() & 65535));
            }
         }
      }

      var7.n5(var0);
      if (var1.n3()) {
         n5(var2, var1.k7().l6());
      }
   }

   static void u3(p3f var0) {
      TextFrame var1 = var0.h0();
      com.aspose.slides.internal.k0r.q5 var2 = var0.k5();
      if (var2 != null) {
         com.aspose.slides.internal.k0r.r3 var3 = var2.a6();
         Object var4 = null;
         if (var0.l6() != null) {
            var4 = var0.l6().y4().y4();
         } else {
            var4 = var1.getSlide();
         }

         if (var3 != null) {
            TextFrameFormat var5 = var1.n5;
            c0u var6 = new c0u(Double.NaN);
            com.aspose.slides.internal.k0r.z5 var7 = (com.aspose.slides.internal.k0r.z5)var3.l6().n5(129);
            if (var7 != null) {
               var6.l6 = (int)var7.j5() / 12700.0;
            }

            var7 = (com.aspose.slides.internal.k0r.z5)var3.l6().n5(130);
            if (var7 != null) {
               var6.k5 = (int)var7.j5() / 12700.0;
            }

            var7 = (com.aspose.slides.internal.k0r.z5)var3.l6().n5(131);
            if (var7 != null) {
               var6.u3 = (int)var7.j5() / 12700.0;
            }

            var7 = (com.aspose.slides.internal.k0r.z5)var3.l6().n5(132);
            if (var7 != null) {
               var6.a6 = (int)var7.j5() / 12700.0;
            }

            var5.n5(var6.l6());
            var7 = (com.aspose.slides.internal.k0r.z5)var3.l6().n5(133);
            if (var7 != null) {
               var5.setWrapText((byte)((var7.j5() & 4294967295L) == 2L ? 0 : 1));
            } else if (var0.y4()) {
               com.aspose.slides.internal.k0r.p6 var8 = com.aspose.slides.internal.v6g.k5.n5(var3.l6().n5(255), com.aspose.slides.internal.k0r.p6.class);
               if (var8.k5() && var8.t2()) {
                  var5.setWrapText((byte)0);
               }
            } else {
               var5.setWrapText((byte)-1);
            }

            boolean var64 = var0.l6().y4().n3() == 0 || var0.l6().y4().n3() == 3;
            var7 = (com.aspose.slides.internal.k0r.z5)var3.l6().n5(135);
            if (var7 != null) {
               var5.setAnchoringType(s1f.c8((int)var7.j5()));
               var5.setCenterText(s1f.t2((int)var7.j5()));
            } else {
               v5s var9 = var0.l6().z1();
               if (var9 != null) {
                  com.aspose.slides.internal.k0r.q5 var10 = (com.aspose.slides.internal.k0r.q5)var9.k5();
                  var7 = (com.aspose.slides.internal.k0r.z5)var10.a6().l6().n5(135);
                  if (var7 != null) {
                     var5.setAnchoringType(s1f.c8((int)var7.j5()));
                     var5.setCenterText(s1f.t2((int)var7.j5()));
                  } else {
                     var5.setAnchoringType((byte)(var64 && var0.e2() ? 0 : -1));
                     var5.setCenterText((byte)-1);
                  }
               } else {
                  var5.setAnchoringType((byte)(var64 && var0.e2() ? 0 : -1));
                  var5.setCenterText((byte)-1);
               }
            }

            var7 = (com.aspose.slides.internal.k0r.z5)var3.l6().n5(136);
            if (var7 != null && (var7.j5() & 4294967295L) != 0L && !var0.y4()) {
               byte var65 = s1f.n5(var7.j5());
               IPortionFormat var67 = var1.getPresentation().getDefaultTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat();
               String var11 = var67.getLanguageId();
               int var12 = 0;
               Fonts$n5 var13 = null;
               Fonts$n5[] var14 = new Fonts$n5[]{var13};
               boolean var15 = !com.aspose.slides.ms.System.d1.n5(var11) && Fonts.l6.tryGetValue(var11, var14);
               var13 = var14[0];
               if (var15) {
                  var12 = var13.k5;
               }

               if (var65 == 1 && !com.aspose.slides.ms.System.d1.n5(var67.getLanguageId()) && var12 == 1) {
                  var65 = 4;
               }

               var5.setTextVerticalType(var65);
            } else {
               var5.setTextVerticalType((byte)-1);
            }

            var7 = (com.aspose.slides.internal.k0r.z5)var3.l6().n5(137);
            if (var7 != null) {
               var5.setRotationAngle((float)(((var7.j5() & 4294967295L) % 4L & 4294967295L) * 90L & 4294967295L));
            } else {
               var5.setRotationAngle(Float.NaN);
            }

            var7 = (com.aspose.slides.internal.k0r.z5)var3.l6().n5(191);
            if (var7 != null && (var7.j5() & 4294967295L & 131072L & 4294967295L) != 0L) {
               var5.n5((byte)((var7.j5() & 4294967295L & 2L & 4294967295L) == 2L ? 2 : 0));
            } else {
               var5.n5((byte)-1);
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var4, ISlide.class)) {
               com.aspose.slides.internal.k0r.a9 var66 = var2.h0();
               if (var66 != null && var66.l6().n5(937) != null) {
                  com.aspose.slides.internal.k0r.r8 var68 = (com.aspose.slides.internal.k0r.r8)var66.l6().n5(937);
                  com.aspose.slides.internal.e5a.d2 var69 = com.aspose.slides.internal.e5a.d2.n5(new com.aspose.slides.internal.z0k.e2(var68.l6()));
                  com.aspose.slides.internal.e5a.y2 var70 = var69.l6("drs/shapexml.xml");
                  byte var72 = 57;
                  if (var70 != null) {
                     com.aspose.slides.internal.z0k.e2 var73 = new com.aspose.slides.internal.z0k.e2();

                     try {
                        var70.n5(var73);
                        var73.seek(0L, 0);
                        if (var73.getLength() > var72) {
                           XmlDocument var74;
                           try {
                              var74 = new XmlDocument();
                              var74.load(var73);
                           } catch (XmlException var51) {
                              var73.seek(0L, 0);
                              com.aspose.slides.internal.z0k.m3 var17 = new com.aspose.slides.internal.z0k.m3(var73);

                              String var18;
                              try {
                                 var18 = com.aspose.slides.internal.n8e.s9.n5(var17.c8());
                              } finally {
                                 if (var17 != null) {
                                    var17.dispose();
                                 }
                              }

                              com.aspose.slides.internal.z0k.w1 var19 = new com.aspose.slides.internal.z0k.w1(var18);

                              try {
                                 var74 = new XmlDocument();
                                 var74.load(var19);
                              } finally {
                                 if (var19 != null) {
                                    var19.dispose();
                                 }
                              }
                           }

                           com.aspose.slides.ms.System.Xml.s2 var16 = new com.aspose.slides.ms.System.Xml.s2(var74.getNameTable());
                           var16.n5("p", "http://schemas.openxmlformats.org/presentationml/2006/main");
                           var16.n5("a", "http://schemas.openxmlformats.org/drawingml/2006/main");
                           var1.n5(true);
                           com.aspose.slides.ms.System.Xml.i0 var77 = var74.selectNodes("p:sp/p:txBody/a:bodyPr", var16);
                           if (var77.n5() == 1 && var77.k5(0).getAttributes().n5("vert") != null) {
                              String var75 = var77.k5(0).getAttributes().n5("vert").getValue();
                              switch (n5.n5(var75)) {
                                 case 0:
                                    var5.setTextVerticalType((byte)0);
                                    break;
                                 case 1:
                                    var5.setTextVerticalType((byte)1);
                                    break;
                                 case 2:
                                    var5.setTextVerticalType((byte)2);
                                    break;
                                 case 3:
                                    var5.setTextVerticalType((byte)3);
                                    break;
                                 case 4:
                                    var5.setTextVerticalType((byte)4);
                                    break;
                                 case 5:
                                    var5.setTextVerticalType((byte)5);
                                    break;
                                 case 6:
                                    var5.setTextVerticalType((byte)6);
                              }
                           }

                           com.aspose.slides.ms.System.Xml.i0 var76 = var74.selectNodes("p:sp/p:txBody/a:p/a:pPr", var16);
                           com.aspose.slides.ms.System.Xml.i0 var78 = var74.selectNodes("p:sp/p:txBody/a:p", var16);
                           if (var76 != null && var1.getParagraphs().getCount() == var76.n5()) {
                              for (int var20 = 0; var20 < var76.n5(); var20++) {
                                 com.aspose.slides.ms.System.Xml.l0 var21 = var76.k5(var20);
                                 IParagraphFormat var22 = var1.getParagraphs().get_Item(var20).getParagraphFormat();
                                 if (com.aspose.slides.ms.System.n1.k5(var22.getMarginLeft()) && com.aspose.slides.ms.System.n1.k5(var22.getIndent())
                                    || var22.getMarginLeft() == 0.0F && var22.getIndent() == 0.0F) {
                                    float var23 = Float.NaN;
                                    float var24 = Float.NaN;
                                    float var25 = Float.NaN;
                                    if (var21.getAttributes().n5("marL") != null) {
                                       var23 = (float)(com.aspose.slides.ms.System.Xml.f4.t9(var21.getAttributes().n5("marL").getValue()) / 12700.0);
                                    }

                                    if (var21.getAttributes().n5("indent") != null) {
                                       var25 = (float)(com.aspose.slides.ms.System.Xml.f4.t9(var21.getAttributes().n5("indent").getValue()) / 12700.0);
                                    }

                                    var22.setMarginLeft(var23);
                                    var22.setMarginRight(var24);
                                    var22.setIndent(var25);
                                    var22.setHangingPunctuation((byte)0);
                                 }

                                 com.aspose.slides.ms.System.Xml.i0 var82 = var78.k5(var20).selectNodes("a:r/a:rPr", var16);
                                 if (var82 != null && var1.getParagraphs().get_Item(var20).getPortions().getCount() >= var82.n5()) {
                                    for (int var84 = 0; var84 < var82.n5(); var84++) {
                                       com.aspose.slides.ms.System.Xml.l0 var86 = var82.k5(var84);
                                       IPortionFormat var87 = var1.getParagraphs().get_Item(var20).getPortions().get_Item(var84).getPortionFormat();
                                       if (var86.getAttributes().n5("sz") != null) {
                                          var87.setFontHeight((float)(com.aspose.slides.ms.System.Xml.f4.t9(var86.getAttributes().n5("sz").getValue()) / 100.0));
                                       }

                                       if (var86.getAttributes().n5("spc") != null) {
                                          var87.setSpacing((float)(com.aspose.slides.ms.System.Xml.f4.t9(var86.getAttributes().n5("spc").getValue()) / 100.0));
                                          if (com.aspose.slides.ms.System.q1.n5(var87.getSpacing()) <= 1.0F) {
                                             var87.setSpacing(0.0F);
                                          }
                                       }
                                    }
                                 } else {
                                    com.aspose.slides.ms.System.Xml.i0 var83 = var78.k5(var20).selectNodes("a:endParaRPr", var16);
                                    if (var83 != null && var83.n5() == 0) {
                                       var83 = var78.k5(var78.n5() - 1).selectNodes("a:endParaRPr", var16);
                                    }

                                    if (var83 != null && var83.n5() > 0) {
                                       for (int var85 = 0; var85 < var1.getParagraphs().get_Item(var20).getPortions().getCount(); var85++) {
                                          IPortionFormat var26 = var1.getParagraphs().get_Item(var20).getPortions().get_Item(var85).getPortionFormat();
                                          if (var83.k5(0).getAttributes().n5("sz") != null && com.aspose.slides.ms.System.n1.k5(var26.getFontHeight())) {
                                             var26.setFontHeight(
                                                (float)(com.aspose.slides.ms.System.Xml.f4.t9(var83.k5(0).getAttributes().n5("sz").getValue()) / 100.0)
                                             );
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           if (var77.n5() > 0) {
                              com.aspose.slides.ms.System.Xml.i0 var79 = var77.k5(0).selectNodes("a:normAutofit", var16);
                              if (var79.n5() == 1) {
                                 if (var79.k5(0).getAttributes().n5("fontScale") != null) {
                                    var5.n5((float)com.aspose.slides.ms.System.Xml.f4.t9(var79.k5(0).getAttributes().n5("fontScale").getValue()) / 100000.0F);
                                 }

                                 if (var79.k5(0).getAttributes().n5("lnSpcReduction") != null) {
                                    var5.l6(
                                       (float)com.aspose.slides.ms.System.Xml.f4.t9(var79.k5(0).getAttributes().n5("lnSpcReduction").getValue()) / 100000.0F
                                    );
                                    IGenericEnumerator var80 = var1.getParagraphs().iterator();

                                    try {
                                       while (var80.hasNext()) {
                                          IParagraph var81 = (IParagraph)var80.next();
                                          var81.getParagraphFormat().setSpaceWithin(100.0F);
                                       }
                                    } finally {
                                       if (com.aspose.slides.internal.v6g.k5.n5(var80, IDisposable.class)) {
                                          var80.dispose();
                                       }
                                    }
                                 }

                                 var5.n5((byte)1);
                                 return;
                              }
                           }

                           return;
                        }
                     } finally {
                        if (var73 != null) {
                           var73.dispose();
                        }
                     }

                     return;
                  }
               }
            }
         }
      }
   }

   static void n5(k1z var0) {
      l6(var0);
      k5(var0);
      u3(var0);
   }

   static void l6(k1z var0) {
      AutoShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), AutoShape.class);
      if (var1 != null && var1.getTextFrame() != null) {
         TextFrame var2 = (TextFrame)var1.getTextFrame();
         TextFrameFormat var3 = new TextFrameFormat();
         var3.n5(var2.s7());
         z4m var4 = var0.k7();
         AutoShape var5 = null;
         if (var4 != null && var4.t2() != null) {
            var5 = com.aspose.slides.internal.v6g.k5.n5(var4.t2().s7(), AutoShape.class);
         }

         if (var5 != null) {
            TextFrame var6 = (TextFrame)var5.getTextFrame();
            if (var6 != null) {
               ITextFrameFormatEffectiveData var7 = var6.getTextFrameFormat().getEffective();
               if (var3.getAnchoringType() == -1) {
                  var3.setAnchoringType(var6.getTextFrameFormat().getAnchoringType());
               }

               var3.n5(var3.u3().n5(TextFrameFormat.n5(var7).l6()).l6());
            }
         }

         n5(var3, var0);
      }
   }

   private static void u3(k1z var0) {
      f7q var1 = var0.m1();
      if (var1 != null) {
         y2q var2 = var0.u3().a6();
         g6o var3 = var2.n5();
         TextFrame var4 = var1.k5();
         IColorFormat var5 = null;
         GeometryShape var6 = com.aspose.slides.internal.v6g.k5.n5(var4.getParentShape(), GeometryShape.class);
         if (var6 != null && var6.getShapeStyle() != null) {
            var5 = var6.getShapeStyle().getFontColor();
         }

         com.aspose.slides.internal.k0r.d2a var7 = var1.a6();
         com.aspose.slides.internal.k0r.c9 var8 = var0.w1();
         com.aspose.slides.internal.k0r.y8m var9 = new com.aspose.slides.internal.k0r.y8m(null);
         var9.n5(var1.n5());
         var7.n5(var9);
         var1.n5(false);
         com.aspose.slides.internal.k0r.x1f var10 = new com.aspose.slides.internal.k0r.x1f(null);
         if (!com.aspose.slides.ms.System.d1.n5(var4.t2())) {
            var7.n5(var10);
         }

         List var11 = new List();
         List var12 = new List();
         List var13 = new List();
         List var14 = new List();
         int var15 = 0;
         String var16 = "";
         int var17 = var4.getParagraphs().getCount();
         if (var17 == 0) {
            com.aspose.slides.internal.k0r.o5k var18 = new com.aspose.slides.internal.k0r.o5k();
            com.aspose.slides.internal.k0r.l8r var19 = new com.aspose.slides.internal.k0r.l8r();
            com.aspose.slides.internal.k0r.p2i var20 = new com.aspose.slides.internal.k0r.p2i();
            IParagraphFormat var21 = var4.getTextFrameFormat().getTextStyle().getDefaultParagraphFormat();
            IPortionFormat var22 = var21.getDefaultPortionFormat();
            var18.n5(0);
            f8b.n5(var21, var18.k5(), var3);
            com.aspose.slides.internal.k0r.n9q var23 = var18.k5().m3();
            var1.l6(var18.l6());
            var1.n5(var18.k5());
            var18.k5().l6(var23);
            f8b.n5(var22, var19.l6(), var3, var5);
            f8b.l6(var22, var19.l6(), var3);
            com.aspose.slides.internal.k0r.u7f var24 = var19.l6().t4();
            var1.n5(var21, var18.k5(), var19.l6(), var22, var1);
            var1.n5(var19.l6());
            var19.l6().l6(var24);
            f8b.n5(var20.l6(), var21, var22);
            var19.n5(1L);
            var20.n5(1L);
            var18.n5(1L);
            var13.addItem(var20);
            var12.addItem(var19);
            var11.addItem(var18);
         }

         IPortionFormat var31 = null;
         TextFrameFormat var33 = var4.s7();

         for (int var34 = 0; var34 < var17; var34++) {
            Paragraph var39 = (Paragraph)var4.getParagraphs().get_Item(var34);
            int var41 = var15;
            com.aspose.slides.internal.k0r.o5k var42 = new com.aspose.slides.internal.k0r.o5k();
            var42.n5(var39.getParagraphFormat().getDepth() & 65535);
            f8b.n5(var39.getParagraphFormat(), var42.k5(), var3, var33);
            var1.l6(var42.l6());
            var1.n5(var42.k5());
            com.aspose.slides.internal.k0r.l8r var43 = null;
            com.aspose.slides.internal.k0r.p2i var25 = null;
            int var26 = var39.getPortions().getCount();

            for (int var27 = 0; var27 < var26; var27++) {
               Portion var28 = com.aspose.slides.internal.v6g.k5.n5(var39.getPortions().get_Item(var27), Portion.class);
               String var29 = var28.u9();
               var31 = var28.getPortionFormat();
               if (var28.k5()) {
                  if (var28.getField().getType() != FieldType.getFooter() || var3.e5() && !com.aspose.slides.ms.System.d1.n5(var29)) {
                     var29 = "*";
                  }

                  n5(var28, var7, var15);
               }

               if (var29.length() >= 1 || var39.getEndParagraphPortionFormat() == null) {
                  var43 = new com.aspose.slides.internal.k0r.l8r();
                  var25 = new com.aspose.slides.internal.k0r.p2i();
                  var43.n5(var29.length() & 4294967295L);
                  var25.n5(var29.length() & 4294967295L);
                  boolean var30 = n5(var43, var42, var31, var5, var39, var3, var1);
                  if (var33.t2() == 1 && !com.aspose.slides.ms.System.n1.k5(var33.n3()) && !com.aspose.slides.ms.System.n1.k5(var31.getFontHeight())) {
                     var43.l6()
                        .u9(new com.aspose.slides.ms.System.o5<>((short)com.aspose.slides.ms.System.q1.n5((double)(var31.getFontHeight() * var33.n3()), (short)((short)1))));
                  }

                  var12.addItem(var43);
                  f8b.n5(var25.l6(), var39.getParagraphFormat(), var31);
                  var13.addItem(var25);
                  if (var31.getTextCapType() == 2) {
                     var29 = com.aspose.slides.ms.System.d1.t2(var29);
                  }

                  var16 = com.aspose.slides.ms.System.d1.n5(var16, var29);
                  var15 += var29.length();
               }
            }

            if (var43 != null) {
               if (var39.getEndParagraphPortionFormat() == null) {
                  var43.n5((var43.n5() & 4294967295L) + 1L & 4294967295L);
               }

               if ((var43.n5() & 4294967295L) == 0L) {
                  var12.removeItem(var43);
               }
            }

            if (var25 != null) {
               if (var39.getEndParagraphPortionFormat() == null) {
                  var25.n5((var25.n5() & 4294967295L) + 1L & 4294967295L);
               } else if ((var25.n5() & 4294967295L) == 0L) {
                  var13.removeItem(var25);
               }
            }

            if (var39.getEndParagraphPortionFormat() != null || var26 == 0) {
               com.aspose.slides.internal.k0r.l8r var44 = new com.aspose.slides.internal.k0r.l8r();
               var44.n5(1L);
               IPortionFormat var46 = var39.getEndParagraphPortionFormat();
               if (var46 == null) {
                  var46 = var39.getParagraphFormat().getDefaultPortionFormat();
               }

               n5(var44, var42, var46, var5, var39, var3, var1);
               var12.addItem(var44);
               com.aspose.slides.internal.k0r.p2i var47 = new com.aspose.slides.internal.k0r.p2i();
               var47.n5(1L);
               IPortionFormat var48 = var39.getEndParagraphPortionFormat();
               if (var48 == null) {
                  var48 = var39.getParagraphFormat().getDefaultPortionFormat();
               }

               f8b.n5(var47.l6(), var39.getParagraphFormat(), var48);
               var13.addItem(var47);
            }

            var15++;
            if (var34 + 1 < var17) {
               var16 = com.aspose.slides.ms.System.d1.n5(var16, "\r");
            }

            var42.n5(var15 - var41 & 4294967295L);
            com.aspose.slides.internal.k0r.t0 var45 = new com.aspose.slides.internal.k0r.t0(var42.n5(), var42.l6());
            var14.addItem(var45);
            var11.addItem(var42);
         }

         var10.n5(var16);
         if (var1.c8()) {
            if (var14.size() > 0) {
               com.aspose.slides.internal.k0r.n8 var35 = new com.aspose.slides.internal.k0r.n8(null);
               var35.n5(var14);
               if (!var35.k5()) {
                  var7.n5(var35);
               }
            }
         } else if (var11.size() > 0 && var12.size() > 0) {
            n5(var11, var7, var4);
            com.aspose.slides.internal.k0r.w4w var36 = new com.aspose.slides.internal.k0r.w4w(null);
            var36.n5((com.aspose.slides.internal.k0r.o5k[])var11.toArray(new com.aspose.slides.internal.k0r.o5k[0]));
            var36.n5((com.aspose.slides.internal.k0r.l8r[])var12.toArray(new com.aspose.slides.internal.k0r.l8r[0]));
            var36.a6();
            if (!var36.u3()) {
               var7.n5(var36);
            }
         }

         if (var13.size() > 0) {
            com.aspose.slides.internal.k0r.c9t var37 = new com.aspose.slides.internal.k0r.c9t(null);
            var37.n5((com.aspose.slides.internal.k0r.p2i[])var13.toArray(new com.aspose.slides.internal.k0r.p2i[0]));
            var37.u3();
            if (!var37.k5()) {
               var7.n5(var37);
            }
         }

         n5(var4, var7, var3);
         if (var1.t4()) {
            com.aspose.slides.internal.k0r.r5w var38 = var7.n5();
            com.aspose.slides.internal.k0r.g9 var40 = new com.aspose.slides.internal.k0r.g9(null);
            var1.u3().l6().n5(var40);
            var40.n5(var38.m1().w1().k5());
            var7.u3().n5(var40.l6() + 1);
         }
      }
   }

   private static boolean n5(
      com.aspose.slides.internal.k0r.l8r var0,
      com.aspose.slides.internal.k0r.o5k var1,
      IPortionFormat var2,
      IColorFormat var3,
      Paragraph var4,
      g6o var5,
      f7q var6
   ) {
      f8b.n5(var2, var0.l6(), var5, var3);
      f8b.l6(var2, var0.l6(), var5);
      com.aspose.slides.internal.k0r.u7f var7 = var0.l6().t4();
      boolean var8 = var6.n5(var4.getParagraphFormat(), var1.k5(), var0.l6(), var2, var6);
      var6.n5(var0.l6());
      if (var6.t9() != null) {
         IParagraphFormat var9 = var6.n3().getLevel(var4.getParagraphFormat().getDepth());
         if (var9 != null) {
            IPortionFormat var10 = var9.getDefaultPortionFormat();
            if (com.aspose.slides.ms.System.o5.n5(var7.t2(), null)
               && com.aspose.slides.ms.System.o5.l6(var6.t9().l6().t2(), null)
               && var2.getLanguageId() != null
               && var10.getLanguageId() != null
               && !com.aspose.slides.ms.System.d1.a6(var2.getLanguageId(), var10.getLanguageId())) {
               var0.l6().l6(new com.aspose.slides.ms.System.o5<>());
            }

            if (var7.n5() == -1 && var0.l6().n5() > -1 && var10.getFontBold() == var0.l6().n5() && var6.t9().l6().n5() == var0.l6().n5()) {
               var0.l6().n5((byte)-1);
            }

            if (var7.l6() == -1 && var0.l6().l6() > -1 && var10.getFontItalic() == var0.l6().l6() && var6.t9().l6().l6() == var0.l6().l6()) {
               var0.l6().l6((byte)-1);
            }
         }
      }

      return var8;
   }

   private static void n5(Portion var0, com.aspose.slides.internal.k0r.d2a var1, int var2) {
      com.aspose.slides.internal.k0r.r6a var3 = n5(var0);
      if (var3 != null) {
         boolean var4 = true;
         if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.k0r.b4.class) && var1.n5().t4()) {
            List var5 = var1.n5().l6(4089);
            if (var5 != null) {
               var3 = (com.aspose.slides.internal.k0r.r6a)var5.get_Item(0);
               var4 = false;
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.k0r.a0.class) && var1.n5().z1()) {
            List var6 = var1.n5().l6(4088);
            if (var6 != null) {
               var3 = (com.aspose.slides.internal.k0r.r6a)var6.get_Item(0);
               var4 = false;
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.k0r.u0a.class) && var1.n5().e2()) {
            List var7 = var1.n5().l6(4056);
            if (var7 != null) {
               var3 = (com.aspose.slides.internal.k0r.r6a)var7.get_Item(0);
               var4 = false;
            }
         }

         var3.n5(var2);
         if (var4) {
            var1.n5(var3);
         }
      }
   }

   private static com.aspose.slides.internal.k0r.r6a n5(Portion var0) {
      String var1 = var0.getField().getType().getInternalString();
      if (com.aspose.slides.ms.System.d1.a6(var1, FieldType.getSlideNumber().getInternalString())) {
         return new com.aspose.slides.internal.k0r.u0a(null);
      } else if (com.aspose.slides.ms.System.d1.t2(var1, FieldType.getDateTime().getInternalString())) {
         com.aspose.slides.internal.k0r.a0 var2 = new com.aspose.slides.internal.k0r.a0(null);
         var2.n5(s1f.n5(var1, f8b.n5(var0.getPortionFormat().getLanguageId()).k5()));
         return var2;
      } else {
         return null;
      }
   }

   private static void n5(g5x$n5 var0, com.aspose.slides.internal.k0r.d2a var1, g6o var2, boolean var3) {
      s6h.n5(var0.n5, var3, var0.u3, var1, var2);
      com.aspose.slides.internal.k0r.c7f var4 = new com.aspose.slides.internal.k0r.c7f(null);
      var4.k5((short)(var3 ? 0 : 1));
      var4.n5(var0.l6);
      var4.l6(var0.k5);
      var1.n5(var4);
   }

   private static void n5(IHyperlink var0, int var1, String var2, g5x$n5[] var3, com.aspose.slides.internal.k0r.d2a var4, g6o var5, boolean var6) {
      if (var0 != null) {
         if (var3[0] != null) {
            if (Hyperlink.op_Inequality(var3[0].n5, (Hyperlink)var0)) {
               var3[0].k5 = var1;
               n5(var3[0], var4, var5, var6);
               var3[0] = new g5x$n5(null);
               var3[0].n5 = (Hyperlink)var0;
               var3[0].l6 = var1;
               var3[0].u3 = var2;
            }
         } else {
            var3[0] = new g5x$n5(null);
            var3[0].n5 = (Hyperlink)var0;
            var3[0].l6 = var1;
            var3[0].u3 = var2;
         }
      } else if (var3[0] != null) {
         var3[0].k5 = var1;
         n5(var3[0], var4, var5, var6);
         var3[0] = null;
      }
   }

   private static void n5(TextFrame var0, com.aspose.slides.internal.k0r.d2a var1, g6o var2) {
      int var3 = 0;
      g5x$n5 var4 = null;
      g5x$n5 var5 = null;
      IGenericEnumerator var6 = var0.getParagraphs().iterator();

      try {
         for (; var6.hasNext(); var3++) {
            Paragraph var7 = (Paragraph)var6.next();
            IGenericEnumerator var8 = var7.getPortions().iterator();

            try {
               while (var8.hasNext()) {
                  Portion var9 = (Portion)var8.next();
                  PortionFormat var10 = (PortionFormat)var9.getPortionFormat();
                  g5x$n5[] var11 = new g5x$n5[]{var4};
                  n5(var10.getHyperlinkClick(), var3, var9.u9(), var11, var1, var2, true);
                  var4 = var11[0];
                  g5x$n5[] var12 = new g5x$n5[]{var5};
                  n5(var10.getHyperlinkMouseOver(), var3, var9.u9(), var12, var1, var2, false);
                  var5 = var12[0];
                  var3 += var9.u9().length();
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if (var4 != null) {
         var4.k5 = var3;
         n5(var4, var1, var2, true);
      }

      if (var5 != null) {
         var5.k5 = var3;
         n5(var5, var1, var2, false);
      }
   }

   private static void n5(List<com.aspose.slides.internal.k0r.o5k> var0, com.aspose.slides.internal.k0r.d2a var1, TextFrame var2) {
      IParagraphCollection var3 = var2.getParagraphs();
      com.aspose.slides.internal.k0r.q8g var4 = new com.aspose.slides.internal.k0r.q8g(null);
      com.aspose.slides.internal.k0r.n1g var5 = null;
      boolean[] var6 = new boolean[]{true, true, true, true, true, true, true};
      int var7 = 0;
      List$Enumerator var8 = var0.iterator();

      try {
         while (var8.hasNext()) {
            com.aspose.slides.internal.k0r.o5k var9 = (com.aspose.slides.internal.k0r.o5k)var8.next();
            com.aspose.slides.internal.k0r.n9q var10 = var9.k5();
            int var11 = var9.l6() & 65535;
            if (var10.w1()) {
               if (var5 == null) {
                  var5 = var4.l6();
               }

               if (var6[5] && var10.t9().l6()) {
                  var6[5] = false;
                  var5.n5(new com.aspose.slides.ms.System.o5<>(var10.t9().n5()));
               }

               if (var6[6] && var10.z1() != null) {
                  var6[6] = false;
                  var5.n5(var10.z1());
               }

               if (var6[var11] && (var10.y4().l6() || var10.e2().l6())) {
                  com.aspose.slides.internal.k0r.e6a var12 = new com.aspose.slides.internal.k0r.e6a();
                  if (var10.y4().l6()) {
                     var12.n5(var10.y4().k5());
                  }

                  if (var10.e2().l6()) {
                     var12.l6(var10.e2().k5());
                  }

                  var5.n5(var11, var12);
                  if (!com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.l6(var3.get_Item(var7).getText()), com.aspose.slides.ms.System.d1.n5)
                     && (var12.n5().n5((short)0) != 0 || var12.l6().n5((short)0) != 0)) {
                     var6[var11] = false;
                  }
               }
            }

            var10.n5(false);
            var7++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      if (var5 != null) {
         var1.n5(var4);
      }
   }

   static void n5(ITextFrameFormat var0, k1z var1) {
      com.aspose.slides.internal.k0r.r3 var2 = var1.z8();
      com.aspose.slides.internal.k0r.z5 var3 = new com.aspose.slides.internal.k0r.z5(128, var1.u3().a6().n5().j5() & 4294967295L);
      var2.l6().l6(var3);
      c0u var4 = TextFrameFormat.n5(var0).l6();
      if (!com.aspose.slides.ms.System.d2.k5(var4.l6)) {
         com.aspose.slides.internal.k0r.z5 var5 = new com.aspose.slides.internal.k0r.z5(129, com.aspose.slides.internal.v6g.k5.a6(var4.l6 * 12700.0, 14));
         var2.l6().l6(var5);
      }

      if (!com.aspose.slides.ms.System.d2.k5(var4.k5)) {
         com.aspose.slides.internal.k0r.z5 var10 = new com.aspose.slides.internal.k0r.z5(130, com.aspose.slides.internal.v6g.k5.a6(var4.k5 * 12700.0, 14));
         var2.l6().l6(var10);
      }

      if (!com.aspose.slides.ms.System.d2.k5(var4.u3)) {
         com.aspose.slides.internal.k0r.z5 var11 = new com.aspose.slides.internal.k0r.z5(131, com.aspose.slides.internal.v6g.k5.a6(var4.u3 * 12700.0, 14));
         var2.l6().l6(var11);
      }

      if (!com.aspose.slides.ms.System.d2.k5(var4.a6)) {
         com.aspose.slides.internal.k0r.z5 var12 = new com.aspose.slides.internal.k0r.z5(132, com.aspose.slides.internal.v6g.k5.a6(var4.a6 * 12700.0, 14));
         var2.l6().l6(var12);
      }

      if (var0.getWrapText() != -1) {
         long var6 = var0.getWrapText() == 1 ? 0L : 2L;
         com.aspose.slides.internal.k0r.z5 var8 = new com.aspose.slides.internal.k0r.z5(133, var6);
         var2.l6().l6(var8);
      }

      if (var0.getAnchoringType() != -1 || var0.getCenterText() == 1) {
         com.aspose.slides.internal.k0r.z5 var13 = new com.aspose.slides.internal.k0r.z5(
            135, s1f.l6(var0.getAnchoringType(), var0.getCenterText()) & 4294967295L
         );
         var2.l6().l6(var13);
      }

      if (var0.getTextVerticalType() > 0) {
         com.aspose.slides.internal.k0r.z5 var14 = new com.aspose.slides.internal.k0r.z5(136, s1f.c8(var0.getTextVerticalType()));
         var2.l6().l6(var14);
      }

      if (!com.aspose.slides.ms.System.n1.k5(((TextFrameFormat)var0).getRotationAngle())) {
         float var15 = ((TextFrameFormat)var0).getRotationAngle() % 360.0F;
         if (var15 < 0.0F) {
            var15 = 360.0F - var15;
         }

         com.aspose.slides.internal.k0r.z5 var9 = new com.aspose.slides.internal.k0r.z5(
            137, com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.ms.System.q1.u3(var15 / 90.0F) % 4.0, 14)
         );
         var2.l6().l6(var9);
      }

      boolean var16 = var0.getAutofitType() == 2;
      if (var16 || var0.getAutofitType() == 0) {
         com.aspose.slides.internal.k0r.a8 var17 = new com.aspose.slides.internal.k0r.a8();
         var17.k5(var16);
         var2.l6().l6(var17);
      }
   }

   static void k5(k1z var0) {
      AutoShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(), AutoShape.class);
      if (var1 != null && var1.getTextFrame() != null) {
         TextFrame var2 = (TextFrame)var1.getTextFrame();
         boolean var3 = n5(var2);
         if (var3) {
            com.aspose.slides.internal.k0r.r3 var4 = var0.z8();
            d3r.n5(var2.getTextFrameFormat().getThreeDFormat(), var4, var0.j5(), var0.a6().n5());
            String var5 = var2.t2();
            if (var5.length() > 0 && var5.charAt(var5.length() - 1) != '\r') {
               var5 = com.aspose.slides.ms.System.d1.n5(var5, "\r");
            }

            com.aspose.slides.internal.k0r.i6 var6 = new com.aspose.slides.internal.k0r.i6(192, var5);
            var4.l6().l6(var6);
            int var7 = p6s.n5(((TextFrameFormat)var2.getTextFrameFormat()).c8().n5());
            if (var7 != 1) {
               var0.z3().u3().n5(var7);
            }

            if (var2.getParagraphs().getCount() > 0 && var2.getParagraphs().get_Item(0).getPortions().getCount() > 0) {
               e7c.n5(var2.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat(), var2.getTextFrameFormat(), var0);
            }
         }
      }
   }

   private static boolean n5(TextFrame var0) {
      byte var1 = var0.n5.z1();
      if (var1 != -1) {
         return var1 == 1;
      }

      if (com.aspose.slides.ms.System.d1.n5(var0.t2())) {
         return false;
      }

      IGenericEnumerator var2 = var0.getParagraphs().iterator();

      try {
         while (var2.hasNext()) {
            IParagraph var3 = (IParagraph)var2.next();
            IGenericEnumerator var4 = var3.getPortions().iterator();

            try {
               while (var4.hasNext()) {
                  IPortion var5 = (IPortion)var4.next();
                  byte var6 = var5.getPortionFormat().getFillFormat().getFillType();
                  if (var6 != 2) {
                     return false;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return true;
   }

   // $VF: synthetic method
   static void n5(IParagraphFormat var0, ParagraphFormat var1, byte var2, com.aspose.slides.internal.k0r.t9p var3, d5f var4, boolean var5) {
      l6(var0, var1, var2, var3, var4, var5);
   }
}
