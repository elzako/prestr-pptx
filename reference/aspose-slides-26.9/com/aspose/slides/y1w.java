package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import java.net.URI;
import java.net.URISyntaxException;

class y1w {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("tx", "hlink");

   public static void n5(IHyperlinkContainer var0, com.aspose.slides.internal.k4y.x6s var1, com.aspose.slides.internal.k4y.x6s var2, t5w var3) {
      if (var1 != null) {
         var0.setHyperlinkClick(new Hyperlink(true, null, 1));
         IHyperlink var4 = var0.getHyperlinkClick();
         n5(var4, var1, var3);
      }

      if (var2 != null) {
         var0.setHyperlinkMouseOver(new Hyperlink(true, null, 1));
         IHyperlink var5 = var0.getHyperlinkMouseOver();
         n5(var5, var2, var3);
      }
   }

   private static void n5(IHyperlink var0, com.aspose.slides.internal.k4y.x6s var1, t5w var2) {
      h4t var3 = ((Hyperlink)var0).u3();
      String var4 = var1.l6();
      if (!com.aspose.slides.ms.System.d1.n5(var4)) {
         com.aspose.slides.internal.c8m.r7 var5 = var2.k7().n5(var4);
         if (var5.h0() == 1) {
            ((Hyperlink)var0).k5(var5.n5());
         } else {
            com.aspose.slides.internal.c8m.z6 var6 = var2.k7().k5();
            if (var6.u9(var5.n5()) != null) {
               if (!var2.h0().containsKey(var5.n5())) {
                  var2.h0().addItem(var5.n5(), new List<>());
               }

               var2.h0().get_Item(var5.n5()).addItem(var0);
            } else if (var2.u9() == 1) {
               ((Hyperlink)var0).u3().n5(n5(var5.n5(), var2.t9().getSlides()));
            } else {
               ((Hyperlink)var0).k5(var5.n5());
            }
         }
      } else {
         String var9 = "ppaction://hlinksldjump?num=";
         if (!com.aspose.slides.ms.System.d1.n5(var1.u3()) && com.aspose.slides.ms.System.d1.l6(var1.u3(), var9)) {
            int var12 = 0;
            int[] var7 = new int[]{0};
            boolean var8 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.k5(var1.u3(), var9.length()), var7);
            var12 = var7[0];
            if (var8) {
               if (!var2.c8().containsKey(var12 - 1)) {
                  var2.c8().addItem(var12 - 1, new List<>());
               }

               var2.c8().get_Item(var12 - 1).addItem(var0);
            }
         }
      }

      var0.setTargetFrame(var1.a6());
      var0.setTooltip(var1.u9());
      var0.setHistory(var1.h0());
      var0.setHighlightClick(var1.c8());
      var0.setStopSoundOnClick(var1.t2());
      if (var1.s7() != null) {
         String var10 = var1.s7().n5();
         if (!com.aspose.slides.ms.System.d1.n5(var10)) {
            var0.setSound(var2.l6(var2.k7().n5(var10).l6()));
            ((Audio)var0.getSound()).n5().n5(var1.s7().l6());
         }
      }

      var3.n5(var1.x8());
      ((Hyperlink)var0).u3(var1.k5());
      ((Hyperlink)var0).n5(var1.u3());
      com.aspose.slides.ms.System.Xml.m8 var11 = n5(var1.x8());
      if (var11 != null && var11.u9("ahyp", "http://www.w3.org/2000/xmlns/") && var11.u3("val")) {
         String var14 = var11.n5("val");
         if (var14 != null) {
            switch (n5.n5(var14)) {
               case 0:
                  var0.setColorSource(1);
                  break;
               case 1:
                  var0.setColorSource(0);
                  break;
               default:
                  throw new PptxReadException("Unknown value of 'val' attribute in hlinkClr extension.");
            }
         }
      }
   }

   public static void n5(
      IHyperlinkContainer var0,
      com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.x6s> var1,
      com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.x6s> var2,
      g6c var3
   ) {
      if (var0 != null) {
         n5((Hyperlink)var0.getHyperlinkClick(), var1, var3);
         n5((Hyperlink)var0.getHyperlinkMouseOver(), var2, var3);
      }
   }

   private static void n5(Hyperlink var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.x6s> var1, g6c var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.x6s var3 = (com.aspose.slides.internal.k4y.x6s)var1.invoke();
         h4t var4 = var0.u3();
         if ("*".equals(var0.h0())) {
            var3.k5("ppaction://noaction");
         } else {
            if (var0.getTargetFrame() != null) {
               var3.u3(var0.getTargetFrame());
            }

            if (var0.getTooltip() != null) {
               var3.a6(var0.getTooltip());
            }

            var3.n5(var0.getHistory());
            var3.l6(var0.getHighlightClick());
            var3.k5(var0.getStopSoundOnClick());
            if (var0.getSound() != null) {
               com.aspose.slides.internal.c8m.r7 var5 = var2.u6().l6(var2.n5(var0.getSound()));
               com.aspose.slides.internal.k4y.x7n var6 = var3.n5();
               var6.n5(var5.a6());
               var6.l6(((Audio)var0.getSound()).n5().n5());
            }

            if (!com.aspose.slides.ms.System.d1.n5(var0.getExternalUrlOriginal())) {
               if (com.aspose.slides.ms.System.d1.l6(var0.getExternalUrlOriginal(), "#")
                  || var2.z7() != null && var2.z7().getSkipJavaScriptLinks() && var0.k5(true)) {
                  var3.k5("ppaction://noaction");
                  var3.n5(com.aspose.slides.ms.System.d1.n5);
                  return;
               }

               var3.n5(
                  var2.u6()
                     .n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", n5(var0.getExternalUrlOriginal()), (byte)1)
                     .a6()
               );
            } else if (var0.getActionType() == 8) {
               if (var0.getTargetSlide() == null && var2.h0() == 0) {
                  int var10 = 0;
                  int[] var14 = new int[]{0};
                  boolean var7 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.n5(var0.a6(), "ppaction://hlinksldjump?num=", ""), var14);
                  var10 = var14[0];
                  if (var7) {
                     if (var10 > 0 && var10 - 1 < var2.t2().getSlides().size()) {
                        var0.n5("ppaction://hlinksldjump");
                        var0.u3().n5(var2.t2().getSlides().get_Item(var10 - 1));
                     }
                  } else {
                     var0.n5("ppaction://noaction");
                  }
               }

               if (var0.getTargetSlide() != null) {
                  if (var0.getTargetSlide().getPresentation() != var2.t2() || var2.h0() == 2) {
                     var0.n5(
                        com.aspose.slides.ms.System.d1.n5(new String[]{
                           "ppaction://hlinksldjump?num=", com.aspose.slides.ms.System.a3.l6(((Slide)var0.getTargetSlide()).z8() + 1)
                        })
                     );
                  } else if (var2.h0() == 1) {
                     var3.n5(var2.u6().n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/slide", n5(var0), (byte)0).a6());
                  } else {
                     var3.n5(
                        var2.u6()
                           .n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/slide", var2.l6().get_Item(var0.getTargetSlide()), (byte)0)
                           .a6()
                     );
                  }
               }
            } else if (!com.aspose.slides.ms.System.d1.n5(var0.h0())) {
               var3.n5(var2.u6().n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", var0.h0(), (byte)0).a6());
            }

            if (var0.t2() != null) {
               var3.l6(var0.t2());
            }

            if (var2.h0() == 2 && var0.a6() != null && com.aspose.slides.ms.System.d1.l6(var0.a6(), "ppaction://customshow")) {
               var3.k5("ppaction://noaction");
            } else if (var0.a6() != null) {
               var3.k5(var0.a6());
            }

            if (var0.getColorSource() == 1) {
               if (var4.l6() == null) {
                  var4.n5(new com.aspose.slides.internal.k4y.l8r());
               }

               com.aspose.slides.ms.System.Xml.m8 var12 = n5(var4.l6());
               if (var12 == null) {
                  com.aspose.slides.internal.k4y.w8d var15 = com.aspose.slides.internal.k4y.x1f.l6(var4.l6(), "{A12FA001-AC4F-418D-AE19-62706E023703}");
                  XmlDocument var16 = new XmlDocument();
                  com.aspose.slides.ms.System.Xml.t5 var8 = var16.createDocumentFragment();
                  var8.setInnerXml(var15.n5());
                  com.aspose.slides.ms.System.Xml.m8 var9 = var8.getChildNodes()
                     .k5(0)
                     .getOwnerDocument()
                     .createElement("ahyp", "hlinkClr", "http://schemas.microsoft.com/office/drawing/2018/hyperlinkcolor");
                  var8.getChildNodes().k5(0).appendChild(var9);
                  var15.n5(var8.getOuterXml());
               }
            }

            com.aspose.slides.ms.System.Xml.m8 var13 = n5(var4.l6());
            if (var13 != null && var13.u9("ahyp", "http://www.w3.org/2000/xmlns/")) {
               switch (var0.getColorSource()) {
                  case 0:
                     var13.k5("val", "hlink");
                     break;
                  case 1:
                     var13.k5("val", "tx");
                     break;
                  default:
                     throw new PptxReadException("Unknown value of 'val' attribute in hlinkClr extension.");
               }
            }

            var3.n5(var4.l6());
         }
      }
   }

   public static String n5(IHyperlink var0) {
      return com.aspose.slides.ms.System.d1.n5(new String[]{"slide", com.aspose.slides.ms.System.a3.l6(((Slide)var0.getTargetSlide()).z8())});
   }

   public static Slide n5(String var0, ISlideCollection var1) {
      if (!com.aspose.slides.ms.System.d1.l6(var0, "slide")) {
         return null;
      }

      String var2 = com.aspose.slides.ms.System.d1.l6(var0, "slide".length(), var0.length() - "slide".length());
      int var3 = 0;
      int[] var4 = new int[]{0};
      boolean var5 = com.aspose.slides.ms.System.a3.n5(var2, var4);
      var3 = var4[0];
      return var5 && var1.size() > var3 && var3 >= 0 ? (Slide)var1.get_Item(var3) : null;
   }

   public static ISlide n5(String var0, t5w var1) {
      return var1.t9().getSlides().get_Item(com.aspose.slides.ms.System.z3.u3(com.aspose.slides.ms.System.d1.n5(var0, "slide", "")));
   }

   static String n5(String var0) {
      com.aspose.slides.ms.System.r8 var1 = null;
      com.aspose.slides.ms.System.r8[] var2 = new com.aspose.slides.ms.System.r8[]{var1};
      boolean var3 = com.aspose.slides.ms.System.r8.n5(var0, 1, var2);
      var1 = var2[0];
      if (var3) {
         if (com.aspose.slides.ms.System.d1.n5(var1.t9())) {
            try {
               return com.aspose.slides.ms.System.r8.n5(
                     new URI(
                        com.aspose.slides.ms.System.r8.l6,
                        com.aspose.slides.ms.System.r8.l6(var1).getSchemeSpecificPart(),
                        com.aspose.slides.ms.System.r8.l6(var1).getFragment()
                     )
                  )
                  .l6();
            } catch (URISyntaxException var5) {
               com.aspose.slides.internal.n8e.v4.n5(var5);
               return var1.l6();
            }
         }

         if (com.aspose.slides.ms.System.d1.a6("file", var1.t9()) && !com.aspose.slides.ms.System.d1.l6(var0, "file")) {
            return com.aspose.slides.ms.System.d1.n5(new String[]{"file:///", com.aspose.slides.ms.System.d1.n5(var0, " ", "%20")});
         }
      }

      return var0;
   }

   static com.aspose.slides.ms.System.Xml.m8 n5(com.aspose.slides.internal.k4y.x8 var0) {
      if (var0 != null && var0.n5().length != 0) {
         XmlDocument var1 = com.aspose.slides.internal.k4y.i8w.n5(var0, "{A12FA001-AC4F-418D-AE19-62706E023703}");
         if (var1 == null) {
            return null;
         }

         com.aspose.slides.ms.System.Xml.m8 var2 = var1.getDocumentElement();
         return var2 != null
            ? (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var2, "hlinkClr", "http://schemas.microsoft.com/office/drawing/2018/hyperlinkcolor")
            : null;
      } else {
         return null;
      }
   }
}
