package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class l4t {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "list-level-style-number", "list-level-style-bullet", "list-level-style-image"
   );

   public static void n5(
      TextFrame var0, q4v var1, IGenericList<com.aspose.slides.internal.k4y.g7> var2, com.aspose.slides.internal.k4y.a8r var3, int var4, h6j var5, h2k var6
   ) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (var2 == null) {
         throw new ArgumentNullException("textElementsList");
      }

      n5(var0, var1, var5);
      IGenericEnumerator var7 = var2.iterator();

      try {
         while (var7.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var8 = (com.aspose.slides.internal.k4y.g7)var7.next();
            if ("p".equals(var8.n5())) {
               com.aspose.slides.internal.k4y.u1x var18 = (com.aspose.slides.internal.k4y.u1x)var8.l6();
               if (var3 == null) {
                  Paragraph var19 = n5(var0, var18, var5, var6);
                  if (com.aspose.slides.ms.System.d1.n5(var19.getText())) {
                     Paragraph var20 = n5(var0.getParagraphs(), var4);
                     if (var20 != null) {
                        var19.getParagraphFormat().getBullet().setType(var20.getParagraphFormat().getBullet().getType());
                        var19.getParagraphFormat().getBullet().setNumberedBulletStyle(var20.getParagraphFormat().getBullet().getNumberedBulletStyle());
                        var19.getParagraphFormat().getBullet().setHeight(var20.getParagraphFormat().getBullet().getHeight());
                     }
                  }
               } else {
                  n5(var0, var1, new com.aspose.slides.internal.k4y.u1x[]{var18}, var2.size() == 1, var3, var4, var5, var6);
               }
            } else if ("list".equals(var8.n5())) {
               com.aspose.slides.internal.k4y.u0y var9 = (com.aspose.slides.internal.k4y.u0y)var8.l6();
               com.aspose.slides.internal.k4y.a8r var10 = var5.u3().containsKey(var9.k5()) ? var5.u3().get_Item(var9.k5()) : var3;
               if (n5(var10, var4)) {
                  n5(var0, var1, var3, var4 + 1, var5, var6, var9);
               } else {
                  if (var9.u3() != null) {
                     n5(var0, var1, var9.u3().n5(), var10, 0, var5, var6);
                  }

                  for (com.aspose.slides.internal.k4y.b2k var14 : var9.a6()) {
                     n5(var0, var1, var14.n5(), var10, var4 + 1, var5, var6);
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }
   }

   private static Paragraph n5(IParagraphCollection var0, int var1) {
      for (int var2 = var0.getCount() - 1; var2 >= 0; var2--) {
         Paragraph var3 = (Paragraph)var0.get_Item(var2);
         if (var3.getParagraphFormat().getBullet().getType() != 0
            && var3.getParagraphFormat().getBullet().getType() != -1
            && var3.getParagraphFormat().getDepth() == var1 - 1) {
            return var3;
         }
      }

      return null;
   }

   private static void n5(
      TextFrame var0, q4v var1, com.aspose.slides.internal.k4y.a8r var2, int var3, h6j var4, h2k var5, com.aspose.slides.internal.k4y.u0y var6
   ) {
      if (var6.u3() != null) {
         List$Enumerator var7 = var6.u3().n5().iterator();

         try {
            while (var7.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var8 = (com.aspose.slides.internal.k4y.g7)var7.next();
               if ("p".equals(var8.n5())) {
                  n5(var0, var1, com.aspose.slides.ms.System.u3.n5(new com.aspose.slides.internal.k4y.g7[]{var8}), var2, var3, var4, var5);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      }

      for (com.aspose.slides.internal.k4y.b2k var10 : var6.a6()) {
         List$Enumerator var11 = var10.n5().iterator();

         try {
            while (var11.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var12 = (com.aspose.slides.internal.k4y.g7)var11.next();
               if ("p".equals(var12.n5())) {
                  n5(var0, var1, com.aspose.slides.ms.System.u3.n5(new com.aspose.slides.internal.k4y.g7[]{var12}), var2, var3, var4, var5);
               } else if ("list".equals(var12.n5())) {
                  com.aspose.slides.internal.k4y.u0y var13 = (com.aspose.slides.internal.k4y.u0y)var12.l6();

                  for (com.aspose.slides.internal.k4y.b2k var17 : var13.a6()) {
                     n5(var0, var1, var17.n5(), var2, var3 + 1, var4, var5);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
               var11.dispose();
            }
         }
      }
   }

   private static boolean n5(com.aspose.slides.internal.k4y.a8r var0, int var1) {
      if (var0 == null) {
         return true;
      }

      List$Enumerator var2 = var0.l6().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var3 = (com.aspose.slides.internal.k4y.g7)var2.next();
            switch (n5.n5(var3.n5())) {
               case 0:
                  com.aspose.slides.internal.k4y.x8m var4 = (com.aspose.slides.internal.k4y.x8m)var3.l6();
                  if ((var4.k5() & 4294967295L) == var1 + 1) {
                     return com.aspose.slides.ms.System.d1.n5(var4.u3());
                  }
               case 1:
               case 2:
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   public static void n5(
      TextFrame var0, q4v var1, com.aspose.slides.internal.k4y.u1x[] var2, boolean var3, com.aspose.slides.internal.k4y.a8r var4, int var5, h6j var6, h2k var7
   ) {
      for (com.aspose.slides.internal.k4y.u1x var11 : var2) {
         if (var11 == null) {
            throw new InvalidOperationException();
         }

         Paragraph var12 = n5(var0, var11, var4, var6, var7);
         if (t2f.k5(var1.n5())) {
            n7n.n5(var12, var1.n5(), var6);
         }

         n5(var12, var4, var5, var6);
         if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.n5, var12.u3()) && var3 && var12.getPortions().getCount() == 1) {
            var12.getPortions().get_Item(0).setText(" ");
         }
      }
   }

   public static void n5(TextFrame var0, com.aspose.slides.internal.k4y.u1x[] var1, h6j var2, h2k var3) {
      for (com.aspose.slides.internal.k4y.u1x var7 : var1) {
         if (var7 == null) {
            throw new InvalidOperationException();
         }

         n5(var0, var7, var2, var3);
      }
   }

   static void n5(Paragraph var0, com.aspose.slides.internal.k4y.a8r var1, int var2, h6j var3) {
      PortionCollection var4 = (PortionCollection)var0.getPortions();
      z2.n5(var0.getParagraphFormat(), var4, var1, var2, var3);
   }

   public static Paragraph n5(TextFrame var0, com.aspose.slides.internal.k4y.u1x var1, com.aspose.slides.internal.k4y.a8r var2, h6j var3, h2k var4) {
      Paragraph var5 = new Paragraph();
      var0.getParagraphs().add(var5);
      i3h.n5(var5, var0, var1, var3, var4);
      return var5;
   }

   public static Paragraph n5(TextFrame var0, com.aspose.slides.internal.k4y.u1x var1, h6j var2, h2k var3) {
      Paragraph var4 = new Paragraph();
      var0.getParagraphs().add(var4);
      i3h.n5(var4, var0, var1, var2, var3);
      return var4;
   }

   public static void n5(TextFrame var0, h6j var1) {
      var0.getTextFrameFormat().setAnchoringType((byte)-1);
      var0.getTextFrameFormat().setCenterText((byte)1);
      var0.getTextFrameFormat().setMarginTop(0.0);
      var0.getTextFrameFormat().setMarginRight(0.0);
      var0.getTextFrameFormat().setMarginBottom(0.0);
      var0.getTextFrameFormat().setMarginLeft(0.0);
      ((TextFrameFormat)var0.getTextFrameFormat()).c8((byte)-1);
      var0.getParagraphs().clear();
   }

   public static void n5(TextFrame var0, q4v var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.l6())) {
         l6(var0, var1.l6(), var2);
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.k5())) {
         n5(var0, var1.k5(), var2);
      }
   }

   private static void n5(TextFrame var0, String var1, h6j var2) {
      if (var1 == null) {
         throw new ArgumentNullException("textStyleName");
      }

      if (var2.k5().containsKey(var1)) {
         com.aspose.slides.internal.k4y.y2i var3 = var2.k5().get_Item(var1);
         if (var3.k5() != 2) {
            com.aspose.slides.internal.k4y.v5n var4 = t2f.n5(com.aspose.slides.internal.k4y.v5n.class, "paragraph-properties", var3.u3());
            if (var4 != null) {
               l6(var0, var4);
               n5(var0, var4);
               double var5 = t2f.u9(var4.u9());
               if (!com.aspose.slides.ms.System.d2.k5(var5)) {
                  var0.getTextFrameFormat().setMarginTop((float)var5);
               }
            }
         }
      }
   }

   private static void l6(TextFrame var0, String var1, h6j var2) {
      if (var1 == null) {
         throw new ArgumentNullException("drawStyleName");
      }

      if (var2.k5().containsKey(var1)) {
         com.aspose.slides.internal.k4y.y2i var3 = var2.k5().get_Item(var1);
         String var4 = com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k4y.d9f.class), var3.k5());
         if (var2.l6().k5().containsKey(var4)) {
            com.aspose.slides.internal.k4y.m3i var5 = var2.l6().k5().get_Item(var4);
            com.aspose.slides.internal.k4y.p3w var6 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var5.l6());
            u3(var0, var6);
         }

         com.aspose.slides.internal.k4y.p3w var7 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var3.u3());
         com.aspose.slides.internal.k4y.v5n var8 = t2f.n5(com.aspose.slides.internal.k4y.v5n.class, "paragraph-properties", var3.u3());
         n5(var0, var7);
         n5(var0, var8);
         l6(var0, var7);
         k5(var0, var7);
         u3(var0, var7);
         n5(var0, var3, var2);
      }
   }

   private static void n5(TextFrame var0, com.aspose.slides.internal.k4y.y2i var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (var1 == null) {
         throw new ArgumentNullException("styleElementData");
      }

      if (t2f.k5(var1.l6()) && var2.l6().t2().containsKey(var1.l6())) {
         com.aspose.slides.internal.k4y.y2i var3 = var2.l6().t2().get_Item(var1.l6());
         com.aspose.slides.internal.k4y.p3w var4 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var3.u3());
         if (var4 != null) {
            n5(var0, var4);
            l6(var0, var4);
         }

         com.aspose.slides.internal.k4y.v5n var5 = t2f.n5(com.aspose.slides.internal.k4y.v5n.class, "paragraph-properties", var3.u3());
         if (var5 != null) {
            if (var5.l6() != -1) {
               ((TextFrameFormat)var0.getTextFrameFormat()).c8(var5.l6());
            }

            n5(var0, var5);
         }
      }
   }

   private static void n5(TextFrame var0, com.aspose.slides.internal.k4y.p3w var1) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (var1 != null) {
         if (t2f.k5(var1.z8())) {
            var0.getTextFrameFormat().setMarginBottom((float)t2f.u9(var1.z8()));
         }

         if (t2f.k5(var1.m3())) {
            var0.getTextFrameFormat().setMarginTop((float)t2f.u9(var1.m3()));
         }

         if (t2f.k5(var1.m1())) {
            var0.getTextFrameFormat().setMarginLeft((float)t2f.u9(var1.m1()));
         }

         if (t2f.k5(var1.k7())) {
            var0.getTextFrameFormat().setMarginRight((float)t2f.u9(var1.k7()));
         }
      }
   }

   private static void n5(TextFrame var0, com.aspose.slides.internal.k4y.v5n var1) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (var1 != null) {
         if (t2f.k5(var1.c8())) {
            float var2 = (float)t2f.u9(var1.c8());
            if (!com.aspose.slides.ms.System.d2.k5(var2)) {
               var0.getTextFrameFormat().setMarginBottom(var2);
            }
         }

         if (t2f.k5(var1.h0())) {
            float var3 = (float)t2f.u9(var1.h0());
            if (!com.aspose.slides.ms.System.d2.k5(var3)) {
               var0.getTextFrameFormat().setMarginTop(var3);
            }
         }

         if (t2f.k5(var1.u3())) {
            float var4 = (float)t2f.u9(var1.u3());
            if (!com.aspose.slides.ms.System.d2.k5(var4)) {
               var0.getTextFrameFormat().setMarginLeft(var4);
            }
         }

         if (t2f.k5(var1.a6())) {
            float var5 = (float)t2f.u9(var1.a6());
            if (!com.aspose.slides.ms.System.d2.k5(var5)) {
               var0.getTextFrameFormat().setMarginRight(var5);
            }
         }
      }
   }

   private static void l6(TextFrame var0, com.aspose.slides.internal.k4y.p3w var1) {
      if (var1 != null) {
         switch (var1.n3()) {
            case 0:
               var0.getTextFrameFormat().setAnchoringType((byte)-1);
               break;
            case 1:
               var0.getTextFrameFormat().setAnchoringType((byte)0);
               break;
            case 2:
               var0.getTextFrameFormat().setAnchoringType((byte)1);
               break;
            case 3:
               var0.getTextFrameFormat().setAnchoringType((byte)2);
               break;
            case 4:
               var0.getTextFrameFormat().setAnchoringType((byte)3);
               break;
            default:
               throw new ArgumentOutOfRangeException();
         }
      }
   }

   private static void k5(TextFrame var0, com.aspose.slides.internal.k4y.p3w var1) {
      if (var1 != null) {
         if (var1.x8() == 1) {
            var0.getTextFrameFormat().setAutofitType((byte)2);
         } else {
            var0.getTextFrameFormat().setAutofitType((byte)0);
         }
      }
   }

   private static void u3(TextFrame var0, com.aspose.slides.internal.k4y.p3w var1) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (var1 != null) {
         switch (var1.y4()) {
            case 0:
               break;
            case 1:
               var0.getTextFrameFormat().setWrapText((byte)0);
               break;
            case 2:
               var0.getTextFrameFormat().setWrapText((byte)1);
               break;
            default:
               throw new ArgumentOutOfRangeException();
         }
      }
   }

   private static void l6(TextFrame var0, com.aspose.slides.internal.k4y.v5n var1) {
      if (var1 != null) {
         switch (var1.k5()) {
            case 0:
            case 3:
            case 4:
               break;
            case 1:
               var0.getTextFrameFormat().setAnchoringType((byte)0);
               break;
            case 2:
               var0.getTextFrameFormat().setAnchoringType((byte)2);
               break;
            case 5:
               var0.getTextFrameFormat().setAnchoringType((byte)1);
               break;
            case 6:
               var0.getTextFrameFormat().setAnchoringType((byte)3);
               break;
            default:
               throw new ArgumentOutOfRangeException();
         }
      }
   }
}
