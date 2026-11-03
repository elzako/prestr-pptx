package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public class SlideUtil {
   public static IShape findShape(IPresentation pres, String altText) {
      for (int var2 = 0; var2 < pres.getMasters().size(); var2++) {
         IShape var3 = findShape(pres.getMasters().get_Item(var2), altText);
         if (var3 != null) {
            return var3;
         }
      }

      for (int var4 = 0; var4 < pres.getSlides().size(); var4++) {
         IShape var5 = findShape(pres.getSlides().get_Item(var4), altText);
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   public static IShape findShape(IBaseSlide slide, String altText) {
      return n5(slide.getShapes(), altText);
   }

   public static IShape[] findShapesByPlaceholderType(IBaseSlide slide, byte placeholderType) {
      List var2 = new List();
      IGenericEnumerator var3 = slide.getShapes().iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            if (var4.getPlaceholder() != null && var4.getPlaceholder().getType() == placeholderType) {
               var2.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return (IShape[])var2.toArray(new IShape[0]);
   }

   public static void alignShapes(int alignmentType, boolean alignToSlide, IBaseSlide slide) {
      int[] var3 = new int[slide.getShapes().size()];
      int var4 = 0;

      while (var4 < var3.length) {
         var3[var4] = var4++;
      }

      n5(alignmentType, alignToSlide, slide.getShapes(), var3);
   }

   public static void alignShapes(int alignmentType, boolean alignToSlide, IBaseSlide slide, int[] shapeIndexes) {
      n5(alignmentType, alignToSlide, slide.getShapes(), shapeIndexes);
   }

   public static void alignShapes(int alignmentType, boolean alignToSlide, IGroupShape groupShape) {
      int[] var3 = new int[groupShape.getShapes().size()];
      int var4 = 0;

      while (var4 < var3.length) {
         var3[var4] = var4++;
      }

      n5(alignmentType, alignToSlide, groupShape.getShapes(), var3);
   }

   public static void alignShapes(int alignmentType, boolean alignToSlide, IGroupShape groupShape, int[] shapeIndexes) {
      n5(alignmentType, alignToSlide, groupShape.getShapes(), shapeIndexes);
   }

   public static void findAndReplaceText(IPresentation presentation, boolean withMasters, String find, String replace) {
      findAndReplaceText(presentation, withMasters, find, replace, null);
   }

   public static void findAndReplaceText(IPresentation presentation, boolean withMasters, String find, String replace, PortionFormat format) {
      if (presentation == null) {
         throw new ArgumentNullException("presentation");
      }

      if (com.aspose.slides.ms.System.d1.n5(find)) {
         throw new ArgumentException("String to find can not be null or empty", "find");
      }

      if (replace == null) {
         throw new ArgumentNullException("replace");
      }

      if (com.aspose.slides.ms.System.d1.a6(find, replace)) {
         throw new ArgumentException("String to find can not be equal to string to find");
      }

      for (ITextFrame var8 : getAllTextFrames(presentation, withMasters)) {
         n5(var8, find, replace, format);
         var8.joinPortionsWithSameFormatting();
      }
   }

   private static void n5(ITextFrame var0, String var1, String var2, PortionFormat var3) {
      IGenericEnumerator var4 = var0.getParagraphs().iterator();

      try {
         while (var4.hasNext()) {
            IParagraph var5 = (IParagraph)var4.next();
            n5(var5, var1, var2, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private static void n5(IParagraph var0, String var1, String var2, PortionFormat var3) {
      if (!com.aspose.slides.ms.System.d1.a6(var1, var2)) {
         x2p var4 = x2p.n5(var0);

         while (var4.n5(var1, var2, var3)) {
         }

         var0.getPortions().clear();
         var4.l6(var0);
      }
   }

   public static ITextFrame[] getAllTextBoxes(IBaseSlide slide) {
      List var1 = new List();
      n5(slide.getShapes(), var1);
      return (ITextFrame[])var1.toArray(new ITextFrame[0]);
   }

   public static ITextFrame[] getTextBoxesContainsText(IBaseSlide slide, String text, boolean checkPlaceholderText) {
      List var3 = new List();
      n5(slide.getShapes(), var3, true, checkPlaceholderText, text);
      return (ITextFrame[])var3.toArray(new ITextFrame[0]);
   }

   public static ITextFrame[] getAllTextFrames(IPresentation pres, boolean withMasters) {
      return n5(pres, withMasters, false);
   }

   public static int toSaveFormat(int format) {
      switch (format) {
         case 0:
            return 0;
         case 1:
            return 3;
         case 2:
            return 6;
         case 3:
            return 7;
         case 4:
            return 4;
         case 5:
            return 9;
         case 6:
            return 10;
         case 7:
            return 11;
         case 8:
            return 19;
         case 9:
            return 20;
         case 10:
            return 17;
         case 11:
            return 21;
         case 12:
            return 25;
         default:
            throw new ArgumentException(
               com.aspose.slides.ms.System.d1.n5(new String[]{"The unknown ", com.aspose.slides.ms.System.s3.n5(SourceFormat.class, format), " presentation format."}),
               "format"
            );
      }
   }

   static ITextFrame[] n5(IPresentation var0, boolean var1, boolean var2) {
      List var3 = new List();
      if (var1) {
         for (int var4 = 0; var4 < var0.getMasters().size(); var4++) {
            n5(var0.getMasters().get_Item(var4).getShapes(), var3);
         }
      }

      for (int var5 = 0; var5 < var0.getSlides().size(); var5++) {
         n5(var0.getSlides().get_Item(var5).getShapes(), var3);
         if (var2 && var0.getSlides().get_Item(var5).getNotesSlideManager().getNotesSlide() != null) {
            var3.addItem(var0.getSlides().get_Item(var5).getNotesSlideManager().getNotesSlide().getNotesTextFrame());
         }
      }

      return (ITextFrame[])var3.toArray(new ITextFrame[0]);
   }

   static ITextFrame[] n5(IPresentation var0, int[] var1, boolean var2) {
      List var3 = new List();

      for (int var7 : var1) {
         n5(var0.getSlides().get_Item(var7 - 1).getShapes(), var3);
         if (var2) {
            n5(var0.getSlides().get_Item(var7 - 1).getLayoutSlide().getShapes(), var3);
            n5(var0.getSlides().get_Item(var7 - 1).getLayoutSlide().getMasterSlide().getShapes(), var3);
         }
      }

      return (ITextFrame[])var3.toArray(new ITextFrame[0]);
   }

   static <T> List<T> n5(Class<T> var0, IPresentation var1) {
      List var2 = new List();
      IGenericEnumerator var3 = var1.getSlides().iterator();

      try {
         while (var3.hasNext()) {
            ISlide var4 = (ISlide)var3.next();
            IGenericEnumerator var5 = var4.getShapes().iterator();

            try {
               while (var5.hasNext()) {
                  IShape var6 = (IShape)var5.next();
                  if (com.aspose.slides.internal.v6g.k5.l6(var6, var0)) {
                     var2.addItem(var6);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   static String n5(IPresentation var0, int[] var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();

      for (int var6 : var1) {
         ISlide var7 = var0.getSlides().get_Item(var6 - 1);
         ITextFrame[] var8 = getAllTextBoxes(var7);

         for (ITextFrame var12 : var8) {
            var2.n5(var12.getText());
         }
      }

      return var2.toString();
   }

   private static void n5(int var0, boolean var1, IShapeCollection var2, int[] var3) {
      if (var3 == null) {
         throw new ArgumentNullException("shapeIndexes");
      }

      if (var3.length == 0) {
         throw new ArgumentException("Indexes of shapes to be aligned should not be empty", "shapeIndexes");
      }

      SortedDictionary var4 = new SortedDictionary();

      for (int var8 : var3) {
         if (var8 < 0) {
            throw new ArgumentException("Indexes of shapes to be aligned should be positive", "shapeIndexes");
         }

         if (!var4.containsKey(var8)) {
            var4.addItem(var8, var8);
         }
      }

      Integer[] var9 = new Integer[var4.size()];
      var4.getKeys().copyTo(var9, 0);
      if (var9[var9.length - 1] > var2.size() - 1) {
         throw new ArgumentException("Indexes of shapes to be aligned should correspond to slide shape indexes", "shapeIndexes");
      }

      List var10 = new List(var4.getKeys().size());

      for (int var11 = 0; var11 < var4.getKeys().size(); var11++) {
         var10.addItem(var2.get_Item(var3[var11]));
      }

      n7p.n5(var0, var1, var10);
   }

   private static IShape n5(IShapeCollection var0, String var1) {
      for (int var2 = 0; var2 < var0.size(); var2++) {
         IShape var3 = var0.get_Item(var2);
         if (com.aspose.slides.ms.System.d1.u9(var3.getAlternativeText(), var1) == 0) {
            return var3;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var3, GroupShape.class)) {
            IShape var4 = n5(((GroupShape)var3).getShapes(), var1);
            if (var4 != null) {
               return var4;
            }
         }
      }

      return null;
   }

   private static void n5(IShapeCollection var0, List<ITextFrame> var1) {
      n5(var0, var1, false);
   }

   private static void n5(IShapeCollection var0, List<ITextFrame> var1, boolean var2) {
      n5(var0, var1, var2, false);
   }

   private static void n5(IShapeCollection var0, List<ITextFrame> var1, boolean var2, boolean var3) {
      n5(var0, var1, var2, var3, "");
   }

   private static void n5(IShapeCollection var0, List<ITextFrame> var1, boolean var2, boolean var3, String var4) {
      for (int var5 = 0; var5 < var0.size(); var5++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var0.get_Item(var5), IGroupShape.class)) {
            n5(((IGroupShape)var0.get_Item(var5)).getShapes(), var1);
         } else {
            IAutoShape var6 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var5), IAutoShape.class);
            if (var6 != null) {
               ITextFrame var16 = var6.getTextFrame();
               if (var16 != null) {
                  if (var2 && !com.aspose.slides.ms.System.d1.t2(var16.getText(), var4)) {
                     if (!var16.getText().isEmpty() || !var3) {
                        continue;
                     }

                     IAutoShape var18 = com.aspose.slides.internal.v6g.k5.n5(var6.getBasePlaceholder(), IAutoShape.class);
                     if (var18 == null || var18.getTextFrame() == null || !com.aspose.slides.ms.System.d1.t2(var18.getTextFrame().getText(), var4)) {
                        continue;
                     }
                  }

                  var1.addItem(var16);
               }
            } else {
               ITable var7 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var5), ITable.class);
               if (var7 == null) {
                  IChart var17 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var5), IChart.class);
                  if (var17 != null && var17.getUserShapes() != null) {
                     n5(var17.getUserShapes().getShapes(), var1);
                  } else {
                     ISmartArt var19 = com.aspose.slides.internal.v6g.k5.n5(var0.get_Item(var5), ISmartArt.class);
                     if (var19 != null) {
                        ISmartArtNodeCollection var20 = var19.getAllNodes();
                        IGenericEnumerator var11 = var20.iterator();

                        try {
                           while (var11.hasNext()) {
                              ISmartArtNode var12 = (ISmartArtNode)var11.next();
                              var1.addItem(var12.getTextFrame());
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                              var11.dispose();
                           }
                        }
                     }
                  }
               } else {
                  for (int var8 = 0; var8 < var7.getRows().size(); var8++) {
                     for (int var9 = 0; var9 < var7.getColumns().size(); var9++) {
                        Cell var10 = ((Row)var7.getRows().get_Item(var8)).n5(var9);
                        if (var10.getTextFrame() != null) {
                           var1.addItem(var10.getTextFrame());
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static b1w n5(Presentation var0, String var1, ITextSearchOptions var2, IFindResultCallback var3) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("Text to highlight can not be null or empty", "text");
      }

      byte var4 = 0;
      if (var2 != null && !var2.getCaseSensitive()) {
         var4 |= 66;
      }

      com.aspose.slides.internal.r7c.c8 var5 = new com.aspose.slides.internal.r7c.c8("\\-\\[\\]\\{\\}\\(\\)\\*\\+\\?\\.\\,\\\\\\^\\$\\|#\\s");
      String var6 = var5.k5(var1, "\\$0");
      if (var2 != null && var2.getWholeWordsOnly()) {
         var6 = com.aspose.slides.ms.System.d1.n5(new String[]{"\\b", var6, "\\b"});
      }

      boolean var7 = var2 != null && var2.getIncludeNotes();
      com.aspose.slides.internal.r7c.c8 var8 = new com.aspose.slides.internal.r7c.c8(var6, var4);
      return n5(var0, var8, var3, var7);
   }

   private static b1w n5(Presentation var0, com.aspose.slides.internal.r7c.c8 var1, IFindResultCallback var2) {
      if (var1 == null) {
         throw new ArgumentException("Regex to highlight can not be null", "regex");
      } else {
         return n5(var0, var1, var2, false);
      }
   }

   private static b1w n5(Presentation var0, com.aspose.slides.internal.r7c.c8 var1, IFindResultCallback var2, boolean var3) {
      b1w var4 = new b1w(var1);

      for (ITextFrame var8 : n5(var0, false, var3)) {
         TextFrame var9 = (TextFrame)var8;
         var9.n5(var1, var2);
         if (var9.k5.a6() > 0) {
            var4.n5(var9);
         }
      }

      return var4;
   }

   static void n5(Presentation var0, String var1, com.aspose.slides.internal.o9b.c8 var2, ITextSearchOptions var3, IFindResultCallback var4) {
      b1w var5 = n5(var0, var1, var3, var4);
      List$Enumerator var6 = var5.l6().iterator();

      try {
         while (var6.hasNext()) {
            TextFrame var7 = (TextFrame)var6.next();
            var7.n5(var5.n5(), var2.o8());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }

   static void n5(Presentation var0, com.aspose.slides.internal.r7c.c8 var1, com.aspose.slides.internal.o9b.c8 var2, IFindResultCallback var3) {
      b1w var4 = n5(var0, var1, var3);
      List$Enumerator var5 = var4.l6().iterator();

      try {
         while (var5.hasNext()) {
            TextFrame var6 = (TextFrame)var5.next();
            var6.n5(var4.n5(), var2.o8());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }

   static void n5(Presentation var0, String var1, String var2, ITextSearchOptions var3, IFindResultCallback var4) {
      b1w var5 = n5(var0, var1, var3, var4);
      List$Enumerator var6 = var5.l6().iterator();

      try {
         while (var6.hasNext()) {
            TextFrame var7 = (TextFrame)var6.next();
            var7.n5(var5.n5(), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }

   static void n5(Presentation var0, com.aspose.slides.internal.r7c.c8 var1, String var2, IFindResultCallback var3) {
      b1w var4 = n5(var0, var1, var3);
      List$Enumerator var5 = var4.l6().iterator();

      try {
         while (var5.hasNext()) {
            TextFrame var6 = (TextFrame)var5.next();
            var6.n5(var4.n5(), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }
}
