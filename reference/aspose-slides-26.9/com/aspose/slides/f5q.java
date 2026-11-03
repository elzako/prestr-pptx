package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class f5q {
   static final char[] n5 = new char[]{'\r'};
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("fld", "r", "br", "m", "oMathPara", "oMath");

   public static void n5(IParagraphCollection var0, com.aspose.slides.internal.k4y.r1x[] var1, t5w var2) {
      if (var1 != null) {
         var0.clear();

         for (int var3 = 0; var3 < var1.length; var3++) {
            com.aspose.slides.internal.k4y.r1x var4 = var1[var3];
            IParagraph var5 = ((ParagraphCollection)var0).n5();
            d4g.n5(var5.getParagraphFormat(), var4.k5(), var2);
            IPortion var6 = null;
            PortionCollection var7 = (PortionCollection)var5.getPortions();

            for (int var8 = 0; var8 < var4.u3().size(); var8++) {
               com.aspose.slides.internal.k4y.g7 var9 = var4.u3().get_Item(var8);
               IPortion var10 = null;
               if (!com.aspose.slides.ms.System.d1.a6(var9.n5(), "m")) {
                  var10 = var7.n5();
               }

               switch (l6.n5(var9.n5())) {
                  case 0:
                  case 1:
                     com.aspose.slides.internal.k4y.m0l var25;
                     String var30;
                     if ("fld".equals(var9.n5())) {
                        com.aspose.slides.internal.k4y.a1g var22 = (com.aspose.slides.internal.k4y.a1g)var9.l6();
                        if ("hfDateTime".equals(var22.u3())) {
                           var22.n5("datetime1");
                        }

                        var10.addField(var22.u3());
                        d4g.n5(((Field)var10.getField()).n5().n5(), var22.u9(), var2);
                        ((Field)var10.getField()).n5().n5(var22.k5().k5());
                        var25 = var22.a6();
                        String var28 = var22.h0();
                        if (var28 == null) {
                           var28 = "";
                        }

                        var30 = var28;
                     } else {
                        com.aspose.slides.internal.k4y.r6a var23 = (com.aspose.slides.internal.k4y.r6a)var9.l6();
                        var25 = var23.l6();
                        var30 = var23.k5();
                     }

                     w5d.n5(var10.getPortionFormat(), var25, var2);
                     int var24 = 0;
                     int[] var29 = new int[]{0};
                     String var32 = null;

                     while ((var32 = n5(var30, var29)) != null) {
                        var24 = var29[0];
                        var10.setText(var32);
                        ((Paragraph)var5).n5(true);
                        var6 = null;
                        var5 = ((ParagraphCollection)var0).n5();
                        d4g.n5(var5.getParagraphFormat(), var4.k5(), var2);
                        var10 = var7.n5();
                        w5d.n5(var10.getPortionFormat(), var25, var2);
                     }

                     var10.setText(var24 > 0 ? com.aspose.slides.ms.System.d1.k5(var30, var24) : var30);
                     break;
                  case 2:
                     com.aspose.slides.internal.k4y.t1h var12 = (com.aspose.slides.internal.k4y.t1h)var9.l6();
                     var10.setText("\u000b");
                     var10.getPortionFormat().setHyperlinkClick(n5(var7, var6));
                     w5d.n5(var10.getPortionFormat(), var12.l6(), var2);
                     break;
                  case 3:
                     com.aspose.slides.internal.k4y.j0 var14 = (com.aspose.slides.internal.k4y.j0)var9.l6();
                     com.aspose.slides.internal.k4y.g7 var11 = var14.n5();
                     if (var11 != null) {
                        var10 = new MathPortion();
                        MathParagraph var13 = (MathParagraph)((MathPortion)var10).getMathParagraph();
                        var13.n5(false);
                        var13.setJustification(1);
                        var7.add(var10);
                        switch (l6.n5(var11.n5())) {
                           case 4:
                              com.aspose.slides.internal.k4y.m1r var15 = (com.aspose.slides.internal.k4y.m1r)var11.l6();
                              q7u.n5(var13, var15, var2, (MathPortion)var10);
                              break;
                           case 5:
                              com.aspose.slides.internal.k4y.o3d var16 = (com.aspose.slides.internal.k4y.o3d)var11.l6();
                              MathBlock var17 = new MathBlock();
                              a9a.n5(var17, var16, var2, (MathPortion)var10);
                              var13.add(var17);
                              break;
                           default:
                              throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var11.n5(), "\""}));
                        }
                     }
                     break;
                  default:
                     throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var9.n5(), "\""}));
               }

               if (var6 != null
                  && !com.aspose.slides.internal.v6g.k5.l6(var6, MathPortion.class)
                  && !com.aspose.slides.internal.v6g.k5.l6(var10, MathPortion.class)
                  && (var6.getPortionFormat().equals(var10.getPortionFormat()) || var5.getParagraphFormat().getBullet().getType() == -1 && n5(var10))
                  && var6.getField() == null
                  && var10.getField() == null) {
                  var6.setText(com.aspose.slides.ms.System.d1.n5(new String[]{((Portion)var6).u9(), ((Portion)var10).u9()}));
                  var7.l6();
               } else {
                  var6 = var10;
               }
            }

            com.aspose.slides.internal.k4y.m0l var18 = var4.a6();
            Paragraph var19 = (Paragraph)var5;
            if (var18 != null) {
               PortionCollection var20 = (PortionCollection)var19.getPortions();
               Portion var26 = new Portion();
               var26.n5(var20);
               PortionFormat var31 = new PortionFormat(var26);
               var19.n5(var31);
               w5d.n5(var31, var18, var2);
               var26.n5((PortionCollection)null);
               var31.n5((Portion)null);
               var19.setEndParagraphPortionFormat(var31);
               if (var20.getCount() == 0) {
                  new Portion(var31, var20);
               }
            } else if ("".equals(((Paragraph)var5).u3()) && var0.getCount() >= 2) {
               IParagraph var21 = var0.get_Item(var0.getCount() - 2);
               if (var21.getPortions().getCount() > 0) {
                  IPortion var27 = var7.n5();
                  ((PortionFormat)var27.getPortionFormat())
                     .n5((PortionFormat)var21.getPortions().get_Item(var21.getPortions().getCount() - 1).getPortionFormat());
               }
            }
         }
      }
   }

   public static void n5(IParagraphCollection var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.r1x> var1, g6c var2) {
      if (var0.getCount() == 0) {
         var1.invoke();
      } else {
         Paragraph var3 = null;
         com.aspose.slides.internal.k4y.r1x var4 = null;
         IGenericEnumerator var5 = var0.iterator();

         try {
            while (var5.hasNext()) {
               Paragraph var6 = (Paragraph)var5.next();
               if (var3 != null && var3.a6() && var3.n5().l6((IParagraphFormat)var6.n5())) {
                  var4.n5((com.aspose.slides.internal.k4y.m0l)null);
                  if (var3.getPortions().getCount() > 0) {
                     Portion var20 = (Portion)var3.getPortions().get_Item(var3.getPortions().getCount() - 1);
                     com.aspose.slides.internal.k4y.r6a var8 = (com.aspose.slides.internal.k4y.r6a)var4.n5("r").l6();
                     w5d.n5(var20.getPortionFormat(), new f5q$1(var8), var2);
                     var8.n5("\r\n");
                  }
               } else {
                  com.aspose.slides.internal.k4y.r1x var7 = (com.aspose.slides.internal.k4y.r1x)var1.invoke();
                  var4 = var7;
                  d4g.n5(var6.getParagraphFormat(), new f5q$2(var7), var2);
               }

               IGenericEnumerator var21 = var6.getPortions().iterator();

               try {
                  while (var21.hasNext()) {
                     IPortion var22 = (IPortion)var21.next();
                     if (com.aspose.slides.internal.v6g.k5.l6(var22, MathPortion.class)) {
                        MathPortion var24 = com.aspose.slides.internal.v6g.k5.n5(var22, MathPortion.class);
                        com.aspose.slides.internal.k4y.j0 var26 = (com.aspose.slides.internal.k4y.j0)var4.n5("m").l6();
                        com.aspose.slides.internal.k4y.m1r var29 = (com.aspose.slides.internal.k4y.m1r)var26.n5("oMathPara").l6();
                        q7u.n5((MathParagraph)var24.getMathParagraph(), var29, var2);
                     } else if (var22.getField() != null || !"".equals(((Portion)var22).u9())) {
                        String[] var9 = com.aspose.slides.ms.System.d1.n5(((Portion)var22).u9(), '\u000b');

                        for (int var10 = 0; var10 < var9.length; var10++) {
                           if (!"".equals(var9[var10]) || var22.getField() != null) {
                              if (var22.getField() != null) {
                                 com.aspose.slides.internal.k4y.a1g var11 = (com.aspose.slides.internal.k4y.a1g)var4.n5("fld").l6();
                                 var11.n5(((Field)var22.getField()).n5().l6().k5());
                                 if (var22.getField().getType() != null
                                    && var22.getField().getType().getInternalString() != null
                                    && var22.getField().getType().getInternalString().length() != 0) {
                                    var11.n5(var22.getField().getType().getInternalString());
                                 }

                                 d4g.n5(((Field)var22.getField()).n5().n5(), new f5q$3(var11), var2);
                                 w5d.n5(var22.getPortionFormat(), new f5q$4(var11), var2);
                                 var11.l6(var9[var10]);
                              } else {
                                 com.aspose.slides.internal.k4y.r6a var27 = (com.aspose.slides.internal.k4y.r6a)var4.n5("r").l6();
                                 w5d.n5(var22.getPortionFormat(), new f5q$5(var27), var2);
                                 var27.n5(var9[var10]);
                              }
                           }

                           if (var10 < var9.length - 1) {
                              com.aspose.slides.internal.k4y.t1h var28 = (com.aspose.slides.internal.k4y.t1h)var4.n5("br").l6();
                              w5d.n5(var22.getPortionFormat(), new f5q$6(var28), var2);
                           }
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
                     var21.dispose();
                  }
               }

               com.aspose.slides.internal.k4y.r1x var23 = var4;
               if (var6.getEndParagraphPortionFormat() != null) {
                  w5d.n5(var6.getEndParagraphPortionFormat(), new f5q$7(var23), var2);
               } else if (var6.getPortions().getCount() > 0) {
                  IPortion var25 = var6.getPortions().get_Item(var6.getPortions().getCount() - 1);
                  if ("".equals(((Portion)var25).u9())) {
                     w5d.n5(var25.getPortionFormat(), new f5q$8(var23), var2);
                  }
               }

               var3 = var6;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }
   }

   private static boolean n5(IPortion var0) {
      return com.aspose.slides.ms.System.n1.k5(var0.getPortionFormat().getFontHeight())
         && com.aspose.slides.ms.System.d1.a6("\u000b", var0.getText())
         && var0.getPortionFormat().getLatinFont() == null
         && var0.getPortionFormat().getEastAsianFont() == null
         && var0.getPortionFormat().getComplexScriptFont() == null
         && var0.getPortionFormat().getSymbolFont() == null;
   }

   private static IHyperlink n5(IPortionCollection var0, IPortion var1) {
      if (var1 == null || var1.getPortionFormat() == null) {
         return null;
      }

      if (var1.getPortionFormat().getHyperlinkClick() != null) {
         return var1.getPortionFormat().getHyperlinkClick();
      }

      int var2 = var0.indexOf(var1);
      return var2 < 1 ? null : var0.get_Item(var2 - 1).getPortionFormat().getHyperlinkClick();
   }

   static String n5(String var0, int[] var1) {
      int var2 = com.aspose.slides.ms.System.d1.n5(var0, n5, var1[0]);
      if (var2 < 0) {
         return null;
      }

      String var3 = com.aspose.slides.ms.System.d1.l6(var0, var1[0], var2 - var1[0]);
      if (var2 < var0.length() - 1
         && (var0.charAt(var2) == '\r' && var0.charAt(var2 + 1) == '\n' || var0.charAt(var2) == '\n' && var0.charAt(var2 + 1) == '\r')) {
         var2++;
      }

      var1[0] = var2 + 1;
      return var3;
   }
}
