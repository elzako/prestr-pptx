package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class w6g {
   static LayoutSlide n5(IMasterSlide var0, byte var1) {
      return n5(var0, var1, null);
   }

   static LayoutSlide n5(IMasterSlide var0, byte var1, d5f var2) {
      f7p var3 = new f7p(var0, var1);
      switch (var1) {
         case -1:
            return n3(var3);
         case 0:
            return n5(var3);
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 12:
         case 13:
         case 14:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 25:
         case 27:
         case 29:
         case 30:
            if (var2 != null) {
               var2.n5()
                  .a6()
                  .n5(
                     com.aspose.slides.ms.System.d1.n5(new String[]{
                        "SlideLayoutType ", com.aspose.slides.ms.System.s3.n5(SlideLayoutType.class, var1), " PPT deserialization is not implemented yet."
                     }),
                     2
                  );
               var3.n5((byte)11);
               return h0(var3);
            }

            throw new NotImplementedException(
               com.aspose.slides.ms.System.d1.n5(new String[]{"Layout type ", com.aspose.slides.ms.System.s3.n5(SlideLayoutType.class, var1), " is not supported now"})
            );
         case 10:
            return u9(var3);
         case 11:
            return h0(var3);
         case 15:
            return l6(var3);
         case 24:
            return s7(var3);
         case 26:
            return x8(var3);
         case 28:
            return u3(var3);
         case 31:
            return k5(var3);
         case 32:
            return a6(var3);
         case 33:
            return c8(var3);
         case 34:
            return t2(var3);
         default:
            throw new IndexOutOfRangeException();
      }
   }

   static LayoutSlide n5(f7p var0) {
      LayoutSlide var1 = var0.n5("Title Slide");
      var0.n5(54.0 * var0.n5(), 167.75 * var0.l6(), 612.0 * var0.n5(), 115.75 * var0.l6());
      n5(var0, true);
      var0.n5(108.0 * var0.n5(), 306.0 * var0.l6(), 504.0 * var0.n5(), 138.0 * var0.l6());
      var0.n5(n5(0));
      e2(var0);
      t4(var0);
      q0(var0);
      z3(var0);
      return var1;
   }

   static LayoutSlide l6(f7p var0) {
      LayoutSlide var1 = var0.n5("Title and Content");
      n5(var0, false);
      l6(var0, (byte)0);
      t4(var0);
      q0(var0);
      z3(var0);
      return var1;
   }

   static LayoutSlide k5(f7p var0) {
      LayoutSlide var1 = var0.n5("Section Header");
      var0.n5(56.87504F * var0.n5(), 347.0 * var0.l6(), 612.0 * var0.n5(), 107.25 * var0.l6());
      var0.n5(n5(1));
      var0.l6((byte)0);
      n5(var0, false);
      var0.n5(56.87504F * var0.n5(), 228.87505F * var0.l6(), 612.0 * var0.n5(), 118.12496F * var0.l6());
      var0.n5(n5(2));
      var0.l6((byte)2);
      n5(var0, (byte)0);
      t4(var0);
      q0(var0);
      z3(var0);
      return var1;
   }

   static LayoutSlide u3(f7p var0) {
      LayoutSlide var1 = var0.n5("Two Content");
      n5(var0, false);
      var0.n5(36.0 * var0.n5(), 126.0 * var0.l6(), 318.0 * var0.n5(), 356.37503F * var0.l6());
      var0.n5(n5(3));
      l6(var0, (byte)1);
      var0.n5(366.0 * var0.n5(), 126.0 * var0.l6(), 318.0 * var0.n5(), 356.37503F * var0.l6());
      var0.n5(n5(4));
      l6(var0, (byte)1);
      t4(var0);
      q0(var0);
      z3(var0);
      return var1;
   }

   static LayoutSlide a6(f7p var0) {
      LayoutSlide var1 = var0.n5("Comparison");
      var0.n5(n5(5));
      n5(var0, false);
      var0.n5(36.0 * var0.n5(), 120.87504F * var0.l6(), 318.12503F * var0.n5(), 50.37496F * var0.l6());
      var0.n5(n5(6));
      var0.l6((byte)2);
      n5(var0, (byte)0);
      var0.n5(36.0 * var0.n5(), 171.25 * var0.l6(), 318.12503F * var0.n5(), 311.12503F * var0.l6());
      var0.n5(n5(7));
      l6(var0, (byte)1);
      var0.n5(365.75 * var0.n5(), 120.87504F * var0.l6(), 318.25 * var0.n5(), 50.37496F * var0.l6());
      var0.n5(n5(8));
      var0.l6((byte)2);
      n5(var0, (byte)2);
      var0.n5(365.75 * var0.n5(), 171.25 * var0.l6(), 318.25 * var0.n5(), 311.12503F * var0.l6());
      var0.n5(n5(9));
      l6(var0, (byte)2);
      t4(var0);
      q0(var0);
      z3(var0);
      return var1;
   }

   static LayoutSlide u9(f7p var0) {
      LayoutSlide var1 = var0.n5("Title Only");
      n5(var0, false);
      t4(var0);
      q0(var0);
      z3(var0);
      return var1;
   }

   static LayoutSlide h0(f7p var0) {
      LayoutSlide var1 = var0.n5("Blank");
      t4(var0);
      q0(var0);
      z3(var0);
      return var1;
   }

   static LayoutSlide c8(f7p var0) {
      LayoutSlide var1 = var0.n5("Content with Caption");
      var0.n5(36.0 * var0.n5(), 21.5 * var0.l6(), 236.87505F * var0.n5(), 91.5 * var0.l6());
      var0.n5(n5(10));
      var0.l6((byte)2);
      n5(var0, false);
      var0.n5(281.5 * var0.n5(), 21.5 * var0.l6(), 402.5 * var0.n5(), 460.87503F * var0.l6());
      var0.n5(n5(11));
      l6(var0, (byte)0);
      var0.n5(36.0 * var0.n5(), 113.0 * var0.l6(), 236.87505F * var0.n5(), 369.37503F * var0.l6());
      var0.n5(n5(12));
      n5(var0, (byte)1);
      t4(var0);
      q0(var0);
      z3(var0);
      return var1;
   }

   static LayoutSlide t2(f7p var0) {
      LayoutSlide var1 = var0.n5("Picture with Caption");
      var0.n5(141.12505F * var0.n5(), 378.0 * var0.l6(), 432.0 * var0.n5(), 44.62504F * var0.l6());
      var0.n5(n5(13));
      var0.l6((byte)2);
      n5(var0, false);
      var0.n5(141.12505F * var0.n5(), 48.25 * var0.l6(), 432.0 * var0.n5(), 324.0 * var0.l6());
      var0.n5(n5(14));
      z1(var0);
      var0.n5(141.12505F * var0.n5(), 422.62503F * var0.l6(), 432.0 * var0.n5(), 63.37496F * var0.l6());
      var0.n5(n5(15));
      n5(var0, (byte)1);
      t4(var0);
      q0(var0);
      z3(var0);
      return var1;
   }

   static LayoutSlide s7(f7p var0) {
      LayoutSlide var1 = var0.n5("Title and Vertical Text");
      n5(var0, false);
      t9(var0);
      t4(var0);
      q0(var0);
      z3(var0);
      return var1;
   }

   static LayoutSlide x8(f7p var0) {
      LayoutSlide var1 = var0.n5("Vertical Title and Text");
      var0.n5(141.12505F * var0.n5(), 378.0 * var0.l6(), 432.0 * var0.n5(), 44.62504F * var0.l6());
      y4(var0);
      var0.n5(141.12505F * var0.n5(), 48.25 * var0.l6(), 432.0 * var0.n5(), 324.0 * var0.l6());
      t9(var0);
      t4(var0);
      q0(var0);
      z3(var0);
      return var1;
   }

   static LayoutSlide n3(f7p var0) {
      return var0.n5("Custom Layout");
   }

   private static void n5(f7p var0, boolean var1) {
      AutoShape var2 = var0.n5("Title", (byte)0, (byte)0, (byte)(var1 ? 2 : 0));
      if (var2 != null) {
         Paragraph var3 = new Paragraph();
         Portion var4 = new Portion();
         var4.getPortionFormat().setLanguageId("en-US");
         var4.getPortionFormat().setSmartTagClean(false);
         var4.n5("Click to edit Master title style");
         var3.getPortions().add(var4);
         var0.n5(var4);
         Portion var5 = new Portion();
         var5.getPortionFormat().setLanguageId("en-US");
         var3.getPortions().add(var5);
         var2.getTextFrame().getParagraphs().add(var3);
         var2.c8();
      }
   }

   private static void y4(f7p var0) {
      AutoShape var1 = var0.n5("Vertical Title", (byte)1, (byte)0, (byte)0);
      if (var1 != null) {
         var1.getTextFrame().getTextFrameFormat().setTextVerticalType((byte)4);
         Paragraph var2 = new Paragraph();
         Portion var3 = new Portion();
         var3.getPortionFormat().setLanguageId("en-US");
         var3.getPortionFormat().setSmartTagClean(false);
         var3.n5("Click to edit Master title style");
         var2.getPortions().add(var3);
         var3 = new Portion();
         var3.getPortionFormat().setLanguageId("en-US");
         var2.getPortions().add(var3);
         var1.getTextFrame().getParagraphs().add(var2);
         var1.c8();
      }
   }

   private static void e2(f7p var0) {
      AutoShape var1 = var0.n5("Subtitle", (byte)0, (byte)0, (byte)3);
      if (var1 != null) {
         Paragraph var2 = new Paragraph();
         Portion var3 = new Portion();
         var3.getPortionFormat().setLanguageId("en-US");
         var3.getPortionFormat().setSmartTagClean(false);
         var3.n5("Click to edit Master subtitle style");
         var2.getPortions().add(var3);
         Portion var4 = new Portion();
         var4.getPortionFormat().setLanguageId("en-US");
         var2.getPortions().add(var4);
         var1.getTextFrame().getParagraphs().add(var2);
         var1.c8();
      }
   }

   private static void n5(f7p var0, byte var1) {
      AutoShape var2 = var0.n5("Text Placeholder", (byte)0, var1, (byte)1);
      if (var2 != null) {
         Paragraph var3 = new Paragraph();
         var3.getParagraphFormat().setDepth((short)0);
         Portion var4 = new Portion();
         var4.getPortionFormat().setLanguageId("en-US");
         var4.getPortionFormat().setSmartTagClean(false);
         var4.n5("Click to edit Master text styles");
         var3.getPortions().add(var4);
         var2.getTextFrame().getParagraphs().add(var3);
         var2.c8();
      }
   }

   private static void t9(f7p var0) {
      AutoShape var1 = var0.n5("Vertical Text Placeholder", (byte)1, (byte)0, (byte)1);
      if (var1 != null) {
         var1.getTextFrame().getTextFrameFormat().setTextVerticalType((byte)4);
         Paragraph var2 = new Paragraph();
         var2.getParagraphFormat().setDepth((short)0);
         Portion var3 = new Portion();
         var3.getPortionFormat().setLanguageId("en-US");
         var3.getPortionFormat().setSmartTagClean(false);
         var3.n5("Click to edit Master text styles");
         var2.getPortions().add(var3);
         var1.getTextFrame().getParagraphs().add(var2);
         var2 = new Paragraph();
         var2.getParagraphFormat().setDepth((short)1);
         var3 = new Portion();
         var3.getPortionFormat().setLanguageId("en-US");
         var3.getPortionFormat().setSmartTagClean(false);
         var3.n5("Second level");
         var2.getPortions().add(var3);
         var1.getTextFrame().getParagraphs().add(var2);
         var2 = new Paragraph();
         var2.getParagraphFormat().setDepth((short)2);
         var3 = new Portion();
         var3.getPortionFormat().setLanguageId("en-US");
         var3.getPortionFormat().setSmartTagClean(false);
         var3.n5("Third level");
         var2.getPortions().add(var3);
         var1.getTextFrame().getParagraphs().add(var2);
         var2 = new Paragraph();
         var2.getParagraphFormat().setDepth((short)3);
         var3 = new Portion();
         var3.getPortionFormat().setLanguageId("en-US");
         var3.getPortionFormat().setSmartTagClean(false);
         var3.n5("Fourth level");
         var2.getPortions().add(var3);
         var1.getTextFrame().getParagraphs().add(var2);
         var2 = new Paragraph();
         var2.getParagraphFormat().setDepth((short)4);
         var3 = new Portion();
         var3.getPortionFormat().setLanguageId("en-US");
         var3.getPortionFormat().setSmartTagClean(false);
         var3.n5("Fifth level");
         var2.getPortions().add(var3);
         var3 = new Portion();
         var3.getPortionFormat().setLanguageId("en-US");
         var2.getPortions().add(var3);
         var1.getTextFrame().getParagraphs().add(var2);
         var1.c8();
      }
   }

   private static void l6(f7p var0, byte var1) {
      AutoShape var2 = var0.n5("Content Placeholder", (byte)0, var1, (byte)8);
      if (var2 != null) {
         Paragraph var3 = new Paragraph();
         var3.getParagraphFormat().setDepth((short)0);
         Portion var4 = new Portion();
         var4.getPortionFormat().setLanguageId("en-US");
         var4.getPortionFormat().setSmartTagClean(false);
         var4.n5("Click to edit Master text styles");
         var3.getPortions().add(var4);
         var2.getTextFrame().getParagraphs().add(var3);
         var3 = new Paragraph();
         var3.getParagraphFormat().setDepth((short)1);
         var4 = new Portion();
         var4.getPortionFormat().setLanguageId("en-US");
         var4.getPortionFormat().setSmartTagClean(false);
         var4.n5("Second level");
         var3.getPortions().add(var4);
         var2.getTextFrame().getParagraphs().add(var3);
         var3 = new Paragraph();
         var3.getParagraphFormat().setDepth((short)2);
         var4 = new Portion();
         var4.getPortionFormat().setLanguageId("en-US");
         var4.getPortionFormat().setSmartTagClean(false);
         var4.n5("Third level");
         var3.getPortions().add(var4);
         var2.getTextFrame().getParagraphs().add(var3);
         var3 = new Paragraph();
         var3.getParagraphFormat().setDepth((short)3);
         var4 = new Portion();
         var4.getPortionFormat().setLanguageId("en-US");
         var4.getPortionFormat().setSmartTagClean(false);
         var4.n5("Fourth level");
         var3.getPortions().add(var4);
         var2.getTextFrame().getParagraphs().add(var3);
         var3 = new Paragraph();
         var3.getParagraphFormat().setDepth((short)4);
         var4 = new Portion();
         var4.getPortionFormat().setLanguageId("en-US");
         var4.getPortionFormat().setSmartTagClean(false);
         var4.n5("Fifth level");
         var3.getPortions().add(var4);
         var4 = new Portion();
         var4.getPortionFormat().setLanguageId("en-US");
         var3.getPortions().add(var4);
         var2.getTextFrame().getParagraphs().add(var3);
         var2.c8();
      }
   }

   private static void z1(f7p var0) {
      AutoShape var1 = var0.n5("Picture Placeholder", (byte)0, (byte)0, (byte)15);
      if (var1 != null) {
         Paragraph var2 = new Paragraph();
         Portion var3 = new Portion();
         var3.getPortionFormat().setLanguageId("en-US");
         var2.getPortions().add(var3);
         var1.getTextFrame().getParagraphs().add(var2);
         var1.c8();
      }
   }

   private static void t4(f7p var0) {
      AutoShape var1 = var0.n5("Date Placeholder", (byte)0, (byte)1, (byte)4);
      if (var1 != null) {
         if (var0.n5 != null) {
            IGenericEnumerator var8 = var0.n5.getTextFrame().getParagraphs().iterator();

            try {
               while (var8.hasNext()) {
                  Paragraph var10 = (Paragraph)var8.next();
                  Paragraph var4 = new Paragraph();
                  var4.n5(var10);
                  var1.getTextFrame().getParagraphs().add(var4);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }
         } else {
            Paragraph var2 = new Paragraph();
            Portion var3 = new Portion();
            var3.addField("datetimeFigureOut");
            ((Field)var3.getField()).n5(new com.aspose.slides.ms.System.o0("E8FD0B7A-F5DD-4F40-B4CB-3B2C354B893A"));
            var3.getPortionFormat().setLanguageId("en-US");
            var3.getPortionFormat().setSmartTagClean(false);
            var3.n5("Date");
            var2.getPortions().add(var3);
            var0.n5(var3);
            var3 = new Portion();
            var3.getPortionFormat().setLanguageId("en-US");
            var2.getPortions().add(var3);
            var1.getTextFrame().getParagraphs().add(var2);
         }

         var1.c8();
      }
   }

   private static void q0(f7p var0) {
      AutoShape var1 = var0.n5("Footer Placeholder", (byte)0, (byte)2, (byte)6);
      if (var1 != null) {
         if (var0.n5 != null) {
            IGenericEnumerator var8 = var0.n5.getTextFrame().getParagraphs().iterator();

            try {
               while (var8.hasNext()) {
                  Paragraph var9 = (Paragraph)var8.next();
                  Paragraph var4 = new Paragraph();
                  var4.n5(var9);
                  var1.getTextFrame().getParagraphs().add(var4);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }
         } else {
            Paragraph var2 = new Paragraph();
            Portion var3 = new Portion();
            var3.getPortionFormat().setLanguageId("en-US");
            var2.getPortions().add(var3);
            var1.getTextFrame().getParagraphs().add(var2);
            var0.n5(var3);
         }

         var1.c8();
      }
   }

   private static void z3(f7p var0) {
      AutoShape var1 = var0.n5("Slide Number Placeholder", (byte)0, (byte)2, (byte)5);
      if (var1 != null) {
         Paragraph var2 = new Paragraph();
         Portion var3 = new Portion();
         var3.addField("slidenum");
         ((Field)var3.getField()).n5(new com.aspose.slides.ms.System.o0("93AE1883-0942-4AA3-9DB2-9C7C3A0314B1"));
         var3.getPortionFormat().setLanguageId("en-US");
         var3.getPortionFormat().setSmartTagClean(false);
         var3.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"‹", "#", "›"}));
         var2.getPortions().add(var3);
         var0.n5(var3);
         var3 = new Portion();
         var3.getPortionFormat().setLanguageId("en-US");
         var2.getPortions().add(var3);
         var1.getTextFrame().getParagraphs().add(var2);
         var1.c8();
      }
   }

   private static TextStyle n5(int var0) {
      TextStyle var1 = new TextStyle(null);
      switch (var0) {
         case 0:
            IParagraphFormat var104 = var1.l6(0);
            var104.getBullet().setType((byte)0);
            var104.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var104.setAlignment(1);
            var104.setMarginLeft(0.0F);
            var104.setIndent(0.0F);
            var104 = var1.l6(1);
            var104.getBullet().setType((byte)0);
            var104.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var104.setAlignment(1);
            var104.setMarginLeft(36.0F);
            var104.setIndent(0.0F);
            var104 = var1.l6(2);
            var104.getBullet().setType((byte)0);
            var104.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var104.setAlignment(1);
            var104.setMarginLeft(72.0F);
            var104.setIndent(0.0F);
            var104 = var1.l6(3);
            var104.getBullet().setType((byte)0);
            var104.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var104.setAlignment(1);
            var104.setMarginLeft(108.0F);
            var104.setIndent(0.0F);
            var104 = var1.l6(4);
            var104.getBullet().setType((byte)0);
            var104.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var104.setAlignment(1);
            var104.setMarginLeft(144.0F);
            var104.setIndent(0.0F);
            var104 = var1.l6(5);
            var104.getBullet().setType((byte)0);
            var104.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var104.setAlignment(1);
            var104.setMarginLeft(180.0F);
            var104.setIndent(0.0F);
            var104 = var1.l6(6);
            var104.getBullet().setType((byte)0);
            var104.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var104.setAlignment(1);
            var104.setMarginLeft(216.0F);
            var104.setIndent(0.0F);
            var104 = var1.l6(7);
            var104.getBullet().setType((byte)0);
            var104.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var104.setAlignment(1);
            var104.setMarginLeft(252.0F);
            var104.setIndent(0.0F);
            var104 = var1.l6(8);
            var104.getBullet().setType((byte)0);
            var104.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var104.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var104.setAlignment(1);
            var104.setMarginLeft(288.0F);
            var104.setIndent(0.0F);
            break;
         case 1:
            IParagraphFormat var103 = var1.l6(0);
            var103.getDefaultPortionFormat().setFontHeight(40.0F);
            var103.getDefaultPortionFormat().setFontBold((byte)1);
            var103.getDefaultPortionFormat().setTextCapType((byte)2);
            var103.setAlignment(0);
            break;
         case 2:
            IParagraphFormat var94 = var1.l6(0);
            var94.getBullet().setType((byte)0);
            var94.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var94.getDefaultPortionFormat().setFontHeight(20.0F);
            var94.setMarginLeft(0.0F);
            var94.setIndent(0.0F);
            var94 = var1.l6(1);
            var94.getBullet().setType((byte)0);
            var94.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var94.getDefaultPortionFormat().setFontHeight(18.0F);
            var94.setMarginLeft(36.0F);
            var94.setIndent(0.0F);
            var94 = var1.l6(2);
            var94.getBullet().setType((byte)0);
            var94.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var94.getDefaultPortionFormat().setFontHeight(16.0F);
            var94.setMarginLeft(72.0F);
            var94.setIndent(0.0F);
            var94 = var1.l6(3);
            var94.getBullet().setType((byte)0);
            var94.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var94.getDefaultPortionFormat().setFontHeight(14.0F);
            var94.setMarginLeft(108.0F);
            var94.setIndent(0.0F);
            var94 = var1.l6(4);
            var94.getBullet().setType((byte)0);
            var94.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var94.getDefaultPortionFormat().setFontHeight(14.0F);
            var94.setMarginLeft(144.0F);
            var94.setIndent(0.0F);
            var94 = var1.l6(5);
            var94.getBullet().setType((byte)0);
            var94.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var94.getDefaultPortionFormat().setFontHeight(14.0F);
            var94.setMarginLeft(180.0F);
            var94.setIndent(0.0F);
            var94 = var1.l6(6);
            var94.getBullet().setType((byte)0);
            var94.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var94.getDefaultPortionFormat().setFontHeight(14.0F);
            var94.setMarginLeft(216.0F);
            var94.setIndent(0.0F);
            var94 = var1.l6(7);
            var94.getBullet().setType((byte)0);
            var94.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var94.getDefaultPortionFormat().setFontHeight(14.0F);
            var94.setMarginLeft(252.0F);
            var94.setIndent(0.0F);
            var94 = var1.l6(8);
            var94.getBullet().setType((byte)0);
            var94.getDefaultPortionFormat().getFillFormat().setFillType((byte)1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
            var94.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75F);
            var94.getDefaultPortionFormat().setFontHeight(14.0F);
            var94.setMarginLeft(288.0F);
            var94.setIndent(0.0F);
            break;
         case 3:
            IParagraphFormat var85 = var1.l6(0);
            var85.getDefaultPortionFormat().setFontHeight(28.0F);
            var85 = var1.l6(1);
            var85.getDefaultPortionFormat().setFontHeight(24.0F);
            var85 = var1.l6(2);
            var85.getDefaultPortionFormat().setFontHeight(20.0F);
            var85 = var1.l6(3);
            var85.getDefaultPortionFormat().setFontHeight(18.0F);
            var85 = var1.l6(4);
            var85.getDefaultPortionFormat().setFontHeight(18.0F);
            var85 = var1.l6(5);
            var85.getDefaultPortionFormat().setFontHeight(18.0F);
            var85 = var1.l6(6);
            var85.getDefaultPortionFormat().setFontHeight(18.0F);
            var85 = var1.l6(7);
            var85.getDefaultPortionFormat().setFontHeight(18.0F);
            var85 = var1.l6(8);
            var85.getDefaultPortionFormat().setFontHeight(18.0F);
            break;
         case 4:
            IParagraphFormat var76 = var1.l6(0);
            var76.getDefaultPortionFormat().setFontHeight(28.0F);
            var76 = var1.l6(1);
            var76.getDefaultPortionFormat().setFontHeight(24.0F);
            var76 = var1.l6(2);
            var76.getDefaultPortionFormat().setFontHeight(20.0F);
            var76 = var1.l6(3);
            var76.getDefaultPortionFormat().setFontHeight(18.0F);
            var76 = var1.l6(4);
            var76.getDefaultPortionFormat().setFontHeight(18.0F);
            var76 = var1.l6(5);
            var76.getDefaultPortionFormat().setFontHeight(18.0F);
            var76 = var1.l6(6);
            var76.getDefaultPortionFormat().setFontHeight(18.0F);
            var76 = var1.l6(7);
            var76.getDefaultPortionFormat().setFontHeight(18.0F);
            var76 = var1.l6(8);
            var76.getDefaultPortionFormat().setFontHeight(18.0F);
            break;
         case 5:
            var1.l6(0);
            break;
         case 6:
            IParagraphFormat var67 = var1.l6(0);
            var67.getBullet().setType((byte)0);
            var67.getDefaultPortionFormat().setFontHeight(24.0F);
            var67.getDefaultPortionFormat().setFontBold((byte)1);
            var67.setMarginLeft(0.0F);
            var67.setIndent(0.0F);
            var67 = var1.l6(1);
            var67.getBullet().setType((byte)0);
            var67.getDefaultPortionFormat().setFontHeight(20.0F);
            var67.getDefaultPortionFormat().setFontBold((byte)1);
            var67.setMarginLeft(36.0F);
            var67.setIndent(0.0F);
            var67 = var1.l6(2);
            var67.getBullet().setType((byte)0);
            var67.getDefaultPortionFormat().setFontHeight(18.0F);
            var67.getDefaultPortionFormat().setFontBold((byte)1);
            var67.setMarginLeft(72.0F);
            var67.setIndent(0.0F);
            var67 = var1.l6(3);
            var67.getBullet().setType((byte)0);
            var67.getDefaultPortionFormat().setFontHeight(16.0F);
            var67.getDefaultPortionFormat().setFontBold((byte)1);
            var67.setMarginLeft(108.0F);
            var67.setIndent(0.0F);
            var67 = var1.l6(4);
            var67.getBullet().setType((byte)0);
            var67.getDefaultPortionFormat().setFontHeight(16.0F);
            var67.getDefaultPortionFormat().setFontBold((byte)1);
            var67.setMarginLeft(144.0F);
            var67.setIndent(0.0F);
            var67 = var1.l6(5);
            var67.getBullet().setType((byte)0);
            var67.getDefaultPortionFormat().setFontHeight(16.0F);
            var67.getDefaultPortionFormat().setFontBold((byte)1);
            var67.setMarginLeft(180.0F);
            var67.setIndent(0.0F);
            var67 = var1.l6(6);
            var67.getBullet().setType((byte)0);
            var67.getDefaultPortionFormat().setFontHeight(16.0F);
            var67.getDefaultPortionFormat().setFontBold((byte)1);
            var67.setMarginLeft(216.0F);
            var67.setIndent(0.0F);
            var67 = var1.l6(7);
            var67.getBullet().setType((byte)0);
            var67.getDefaultPortionFormat().setFontHeight(16.0F);
            var67.getDefaultPortionFormat().setFontBold((byte)1);
            var67.setMarginLeft(252.0F);
            var67.setIndent(0.0F);
            var67 = var1.l6(8);
            var67.getBullet().setType((byte)0);
            var67.getDefaultPortionFormat().setFontHeight(16.0F);
            var67.getDefaultPortionFormat().setFontBold((byte)1);
            var67.setMarginLeft(288.0F);
            var67.setIndent(0.0F);
            break;
         case 7:
            IParagraphFormat var58 = var1.l6(0);
            var58.getDefaultPortionFormat().setFontHeight(24.0F);
            var58 = var1.l6(1);
            var58.getDefaultPortionFormat().setFontHeight(20.0F);
            var58 = var1.l6(2);
            var58.getDefaultPortionFormat().setFontHeight(18.0F);
            var58 = var1.l6(3);
            var58.getDefaultPortionFormat().setFontHeight(16.0F);
            var58 = var1.l6(4);
            var58.getDefaultPortionFormat().setFontHeight(16.0F);
            var58 = var1.l6(5);
            var58.getDefaultPortionFormat().setFontHeight(16.0F);
            var58 = var1.l6(6);
            var58.getDefaultPortionFormat().setFontHeight(16.0F);
            var58 = var1.l6(7);
            var58.getDefaultPortionFormat().setFontHeight(16.0F);
            var58 = var1.l6(8);
            var58.getDefaultPortionFormat().setFontHeight(16.0F);
            break;
         case 8:
            IParagraphFormat var49 = var1.l6(0);
            var49.getBullet().setType((byte)0);
            var49.getDefaultPortionFormat().setFontHeight(24.0F);
            var49.getDefaultPortionFormat().setFontBold((byte)1);
            var49.setMarginLeft(0.0F);
            var49.setIndent(0.0F);
            var49 = var1.l6(1);
            var49.getBullet().setType((byte)0);
            var49.getDefaultPortionFormat().setFontHeight(20.0F);
            var49.getDefaultPortionFormat().setFontBold((byte)1);
            var49.setMarginLeft(36.0F);
            var49.setIndent(0.0F);
            var49 = var1.l6(2);
            var49.getBullet().setType((byte)0);
            var49.getDefaultPortionFormat().setFontHeight(18.0F);
            var49.getDefaultPortionFormat().setFontBold((byte)1);
            var49.setMarginLeft(72.0F);
            var49.setIndent(0.0F);
            var49 = var1.l6(3);
            var49.getBullet().setType((byte)0);
            var49.getDefaultPortionFormat().setFontHeight(16.0F);
            var49.getDefaultPortionFormat().setFontBold((byte)1);
            var49.setMarginLeft(108.0F);
            var49.setIndent(0.0F);
            var49 = var1.l6(4);
            var49.getBullet().setType((byte)0);
            var49.getDefaultPortionFormat().setFontHeight(16.0F);
            var49.getDefaultPortionFormat().setFontBold((byte)1);
            var49.setMarginLeft(144.0F);
            var49.setIndent(0.0F);
            var49 = var1.l6(5);
            var49.getBullet().setType((byte)0);
            var49.getDefaultPortionFormat().setFontHeight(16.0F);
            var49.getDefaultPortionFormat().setFontBold((byte)1);
            var49.setMarginLeft(180.0F);
            var49.setIndent(0.0F);
            var49 = var1.l6(6);
            var49.getBullet().setType((byte)0);
            var49.getDefaultPortionFormat().setFontHeight(16.0F);
            var49.getDefaultPortionFormat().setFontBold((byte)1);
            var49.setMarginLeft(216.0F);
            var49.setIndent(0.0F);
            var49 = var1.l6(7);
            var49.getBullet().setType((byte)0);
            var49.getDefaultPortionFormat().setFontHeight(16.0F);
            var49.getDefaultPortionFormat().setFontBold((byte)1);
            var49.setMarginLeft(252.0F);
            var49.setIndent(0.0F);
            var49 = var1.l6(8);
            var49.getBullet().setType((byte)0);
            var49.getDefaultPortionFormat().setFontHeight(16.0F);
            var49.getDefaultPortionFormat().setFontBold((byte)1);
            var49.setMarginLeft(288.0F);
            var49.setIndent(0.0F);
            break;
         case 9:
            IParagraphFormat var40 = var1.l6(0);
            var40.getDefaultPortionFormat().setFontHeight(24.0F);
            var40 = var1.l6(1);
            var40.getDefaultPortionFormat().setFontHeight(20.0F);
            var40 = var1.l6(2);
            var40.getDefaultPortionFormat().setFontHeight(18.0F);
            var40 = var1.l6(3);
            var40.getDefaultPortionFormat().setFontHeight(16.0F);
            var40 = var1.l6(4);
            var40.getDefaultPortionFormat().setFontHeight(16.0F);
            var40 = var1.l6(5);
            var40.getDefaultPortionFormat().setFontHeight(16.0F);
            var40 = var1.l6(6);
            var40.getDefaultPortionFormat().setFontHeight(16.0F);
            var40 = var1.l6(7);
            var40.getDefaultPortionFormat().setFontHeight(16.0F);
            var40 = var1.l6(8);
            var40.getDefaultPortionFormat().setFontHeight(16.0F);
            break;
         case 10:
            IParagraphFormat var39 = var1.l6(0);
            var39.getDefaultPortionFormat().setFontHeight(20.0F);
            var39.getDefaultPortionFormat().setFontBold((byte)1);
            var39.setAlignment(0);
            break;
         case 11:
            IParagraphFormat var30 = var1.l6(0);
            var30.getDefaultPortionFormat().setFontHeight(32.0F);
            var30 = var1.l6(1);
            var30.getDefaultPortionFormat().setFontHeight(28.0F);
            var30 = var1.l6(2);
            var30.getDefaultPortionFormat().setFontHeight(24.0F);
            var30 = var1.l6(3);
            var30.getDefaultPortionFormat().setFontHeight(20.0F);
            var30 = var1.l6(4);
            var30.getDefaultPortionFormat().setFontHeight(20.0F);
            var30 = var1.l6(5);
            var30.getDefaultPortionFormat().setFontHeight(20.0F);
            var30 = var1.l6(6);
            var30.getDefaultPortionFormat().setFontHeight(20.0F);
            var30 = var1.l6(7);
            var30.getDefaultPortionFormat().setFontHeight(20.0F);
            var30 = var1.l6(8);
            var30.getDefaultPortionFormat().setFontHeight(20.0F);
            break;
         case 12:
            IParagraphFormat var21 = var1.l6(0);
            var21.getBullet().setType((byte)0);
            var21.getDefaultPortionFormat().setFontHeight(14.0F);
            var21.setMarginLeft(0.0F);
            var21.setIndent(0.0F);
            var21 = var1.l6(1);
            var21.getBullet().setType((byte)0);
            var21.getDefaultPortionFormat().setFontHeight(12.0F);
            var21.setMarginLeft(36.0F);
            var21.setIndent(0.0F);
            var21 = var1.l6(2);
            var21.getBullet().setType((byte)0);
            var21.getDefaultPortionFormat().setFontHeight(10.0F);
            var21.setMarginLeft(72.0F);
            var21.setIndent(0.0F);
            var21 = var1.l6(3);
            var21.getBullet().setType((byte)0);
            var21.getDefaultPortionFormat().setFontHeight(9.0F);
            var21.setMarginLeft(108.0F);
            var21.setIndent(0.0F);
            var21 = var1.l6(4);
            var21.getBullet().setType((byte)0);
            var21.getDefaultPortionFormat().setFontHeight(9.0F);
            var21.setMarginLeft(144.0F);
            var21.setIndent(0.0F);
            var21 = var1.l6(5);
            var21.getBullet().setType((byte)0);
            var21.getDefaultPortionFormat().setFontHeight(9.0F);
            var21.setMarginLeft(180.0F);
            var21.setIndent(0.0F);
            var21 = var1.l6(6);
            var21.getBullet().setType((byte)0);
            var21.getDefaultPortionFormat().setFontHeight(9.0F);
            var21.setMarginLeft(216.0F);
            var21.setIndent(0.0F);
            var21 = var1.l6(7);
            var21.getBullet().setType((byte)0);
            var21.getDefaultPortionFormat().setFontHeight(9.0F);
            var21.setMarginLeft(252.0F);
            var21.setIndent(0.0F);
            var21 = var1.l6(8);
            var21.getBullet().setType((byte)0);
            var21.getDefaultPortionFormat().setFontHeight(9.0F);
            var21.setMarginLeft(288.0F);
            var21.setIndent(0.0F);
            break;
         case 13:
            IParagraphFormat var20 = var1.l6(0);
            var20.getDefaultPortionFormat().setFontHeight(20.0F);
            var20.getDefaultPortionFormat().setFontBold((byte)1);
            var20.setAlignment(0);
            break;
         case 14:
            IParagraphFormat var11 = var1.l6(0);
            var11.getBullet().setType((byte)0);
            var11.getDefaultPortionFormat().setFontHeight(32.0F);
            var11.setMarginLeft(0.0F);
            var11.setIndent(0.0F);
            var11 = var1.l6(1);
            var11.getBullet().setType((byte)0);
            var11.getDefaultPortionFormat().setFontHeight(28.0F);
            var11.setMarginLeft(36.0F);
            var11.setIndent(0.0F);
            var11 = var1.l6(2);
            var11.getBullet().setType((byte)0);
            var11.getDefaultPortionFormat().setFontHeight(24.0F);
            var11.setMarginLeft(72.0F);
            var11.setIndent(0.0F);
            var11 = var1.l6(3);
            var11.getBullet().setType((byte)0);
            var11.getDefaultPortionFormat().setFontHeight(20.0F);
            var11.setMarginLeft(108.0F);
            var11.setIndent(0.0F);
            var11 = var1.l6(4);
            var11.getBullet().setType((byte)0);
            var11.getDefaultPortionFormat().setFontHeight(20.0F);
            var11.setMarginLeft(144.0F);
            var11.setIndent(0.0F);
            var11 = var1.l6(5);
            var11.getBullet().setType((byte)0);
            var11.getDefaultPortionFormat().setFontHeight(20.0F);
            var11.setMarginLeft(180.0F);
            var11.setIndent(0.0F);
            var11 = var1.l6(6);
            var11.getBullet().setType((byte)0);
            var11.getDefaultPortionFormat().setFontHeight(20.0F);
            var11.setMarginLeft(216.0F);
            var11.setIndent(0.0F);
            var11 = var1.l6(7);
            var11.getBullet().setType((byte)0);
            var11.getDefaultPortionFormat().setFontHeight(20.0F);
            var11.setMarginLeft(252.0F);
            var11.setIndent(0.0F);
            var11 = var1.l6(8);
            var11.getBullet().setType((byte)0);
            var11.getDefaultPortionFormat().setFontHeight(20.0F);
            var11.setMarginLeft(288.0F);
            var11.setIndent(0.0F);
            break;
         case 15:
            IParagraphFormat var2 = var1.l6(0);
            var2.getBullet().setType((byte)0);
            var2.getDefaultPortionFormat().setFontHeight(14.0F);
            var2.setMarginLeft(0.0F);
            var2.setIndent(0.0F);
            var2 = var1.l6(1);
            var2.getBullet().setType((byte)0);
            var2.getDefaultPortionFormat().setFontHeight(12.0F);
            var2.setMarginLeft(36.0F);
            var2.setIndent(0.0F);
            var2 = var1.l6(2);
            var2.getBullet().setType((byte)0);
            var2.getDefaultPortionFormat().setFontHeight(10.0F);
            var2.setMarginLeft(72.0F);
            var2.setIndent(0.0F);
            var2 = var1.l6(3);
            var2.getBullet().setType((byte)0);
            var2.getDefaultPortionFormat().setFontHeight(9.0F);
            var2.setMarginLeft(108.0F);
            var2.setIndent(0.0F);
            var2 = var1.l6(4);
            var2.getBullet().setType((byte)0);
            var2.getDefaultPortionFormat().setFontHeight(9.0F);
            var2.setMarginLeft(144.0F);
            var2.setIndent(0.0F);
            var2 = var1.l6(5);
            var2.getBullet().setType((byte)0);
            var2.getDefaultPortionFormat().setFontHeight(9.0F);
            var2.setMarginLeft(180.0F);
            var2.setIndent(0.0F);
            var2 = var1.l6(6);
            var2.getBullet().setType((byte)0);
            var2.getDefaultPortionFormat().setFontHeight(9.0F);
            var2.setMarginLeft(216.0F);
            var2.setIndent(0.0F);
            var2 = var1.l6(7);
            var2.getBullet().setType((byte)0);
            var2.getDefaultPortionFormat().setFontHeight(9.0F);
            var2.setMarginLeft(252.0F);
            var2.setIndent(0.0F);
            var2 = var1.l6(8);
            var2.getBullet().setType((byte)0);
            var2.getDefaultPortionFormat().setFontHeight(9.0F);
            var2.setMarginLeft(288.0F);
            var2.setIndent(0.0F);
            break;
         default:
            var1 = null;
      }

      return var1;
   }
}
