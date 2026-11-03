package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class n7n {
   public static void n5(IBaseSlide var0, String var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("slide");
      }

      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("styleId");
      }

      n5(new m4n(null, var0.getBackground().getFillFormat(), null, null, null, null), var1, var2);
      if (var0.getBackground().getFillFormat().getFillType() != -1) {
         var0.getBackground().setType((byte)1);
      }
   }

   public static void n5(AutoShape var0, String var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("autoShape");
      }

      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("styleId");
      }

      n5(
         new m4n(var0.getLineFormat(), var0.getFillFormat(), var0.getEffectFormat(), null, null, (TextFrameFormat)var0.getTextFrame().getTextFrameFormat()),
         var1,
         var2
      );
   }

   public static void n5(AutoShape var0, q4v var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("autoShape");
      }

      if (var1 == null) {
         throw new ArgumentNullException("propertiesProviderContext");
      }

      com.aspose.slides.internal.k4y.y2i var3 = n5(var1.n5(), var2);
      if (var3 == null) {
         throw new InvalidOperationException(com.aspose.slides.ms.System.d1.n5("Style with id {0} not found", new Object[]{var1.n5()}));
      }

      if (t2f.k5(var3.l6())) {
         com.aspose.slides.internal.k4y.y2i var4 = n5(var3.l6(), var2);
         if (var4 == null) {
            throw new InvalidOperationException(com.aspose.slides.ms.System.d1.n5("Parent style with id {0} not found", new Object[]{var1.n5()}));
         }

         String var5 = null;
         int var6 = 0;
         String[] var7 = new String[]{var5};
         int[] var8 = new int[]{0};
         boolean var9 = !n5(var4.n5(), var7, var8);
         var5 = var7[0];
         var6 = var8[0];
         if (!var9) {
            IGenericEnumerator var10 = var0.getTextFrame().getParagraphs().iterator();

            try {
               while (var10.hasNext()) {
                  Paragraph var11 = (Paragraph)var10.next();
                  byte var12 = 0;
                  byte[] var13 = new byte[]{0};
                  boolean var14 = !b3e.n5(var11, var13);
                  var12 = var13[0];
                  if (!var14) {
                     l6(var11, var5, var2);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                  var10.dispose();
               }
            }
         }
      }
   }

   private static void l6(Paragraph var0, String var1, h6j var2) {
      String var3 = com.aspose.slides.ms.System.d1.n5("{0}outline{1}",new Object[]{ var1, var0.getParagraphFormat().getDepth() + 1});
      com.aspose.slides.internal.k4y.y2i var4 = n5(var3, var2);
      if (var4 != null) {
         com.aspose.slides.internal.k4y.v5n var5 = t2f.n5(com.aspose.slides.internal.k4y.v5n.class, "paragraph-properties", var4.u3());
         if (var5 != null) {
            if (t2f.k5(var5.h0())) {
               double var6 = t2f.u9(var5.h0());
               var0.getParagraphFormat().setSpaceBefore((float)var6 * -1.0F);
            }

            double var16 = t2f.u9(var5.c8());
            if (!com.aspose.slides.ms.System.d2.k5(var16) && var16 != 0.0 && var0.getParagraphFormat().getSpaceAfter() != 0.0F) {
               var0.getParagraphFormat().setSpaceAfter((float)var16 * -1.0F);
            }

            double var8 = t2f.u9(var5.u3());
            if (!com.aspose.slides.ms.System.d2.k5(var8) && var8 != 0.0 && var0.getParagraphFormat().getMarginLeft() != 0.0F) {
               var0.getParagraphFormat().setMarginLeft((float)var8);
            }
         }

         com.aspose.slides.internal.k4y.j9d var10 = t2f.n5(com.aspose.slides.internal.k4y.j9d.class, "text-properties", var4.u3());
         if (var10 != null) {
            q8e.n5(var0.getParagraphFormat(), var10, var2);
            IGenericEnumerator var11 = var0.getPortions().iterator();

            try {
               while (var11.hasNext()) {
                  Portion var12 = (Portion)var11.next();
                  if (com.aspose.slides.ms.System.d2.k5(var12.getPortionFormat().getFontHeight())) {
                     var12.getPortionFormat().setFontHeight(var0.getParagraphFormat().getDefaultPortionFormat().getFontHeight());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                  var11.dispose();
               }
            }
         }
      }
   }

   private static boolean n5(String var0, String[] var1, int[] var2) {
      var1[0] = null;
      var2[0] = 0;
      int var3 = com.aspose.slides.ms.System.d1.u3(var0, "outline");
      if (var3 + "outline".length() + 1 != var0.length()) {
         return false;
      }

      int var4 = 0;
      int[] var5 = new int[]{0};
      boolean var6 = !com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.l6(var0, var0.length() - 1, 1), var5);
      var4 = var5[0];
      if (var6) {
         return false;
      }

      var1[0] = com.aspose.slides.ms.System.d1.l6(var0, 0, var3);
      var2[0] = var4;
      return true;
   }

   public static void n5(Connector var0, String var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("connector");
      }

      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("styleId");
      }

      n5(new m4n(var0.getLineFormat(), var0.getFillFormat()), var1, var2);
   }

   public static void n5(Paragraph var0, String var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("paragraph");
      }

      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("styleId");
      }

      n5(new m4n((ParagraphFormat)var0.getParagraphFormat()), var1, var2);
   }

   public static void n5(TextFrame var0, String var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("textFrame");
      }

      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("styleId");
      }

      n5(new m4n((TextFrameFormat)var0.getTextFrameFormat()), var1, var2);
   }

   public static void n5(PictureFrame var0, com.aspose.slides.internal.k4y.s3o var1, String var2, h6j var3) {
      if (var0 == null) {
         throw new ArgumentNullException("pictureFrame");
      }

      if (com.aspose.slides.ms.System.d1.n5(var2)) {
         throw new ArgumentException("styleId");
      }

      n5(new m4n(var0.getLineFormat(), var0.getFillFormat(), var0.getEffectFormat()), var2, var3);
      com.aspose.slides.internal.k4y.y2i var4 = n5(var2, var3);
      if (var4 != null) {
         q8e.n5(var0, var1, var4, var3);
      }
   }

   public static void n5(Portion var0, String var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("portion");
      }

      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("styleId");
      }

      n5(new m4n((PortionFormat)var0.getPortionFormat()), var1, var2);
   }

   public static void n5(IParagraphCollection var0, String var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("portion");
      }

      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         throw new ArgumentException("styleId");
      }

      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            Paragraph var4 = (Paragraph)var3.next();
            IGenericEnumerator var5 = var4.getPortions().iterator();

            try {
               while (var5.hasNext()) {
                  Portion var6 = (Portion)var5.next();
                  n5(new m4n(var6.getPortionFormat().getLineFormat(), var6.getPortionFormat().getFillFormat()), var1, var2);
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
   }

   private static void n5(m4n var0, String var1, h6j var2) {
      com.aspose.slides.internal.k4y.y2i var3 = n5(var1, var2);
      if (var3 != null) {
         if (t2f.k5(var3.l6())) {
            n5(var0, var3.l6(), var2);
         } else {
            String var4 = com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.k4y.d9f.class), var3.k5());
            if (var2.l6().k5().containsKey(var4)) {
               com.aspose.slides.internal.k4y.m3i var5 = var2.l6().k5().get_Item(var4);
               com.aspose.slides.internal.k4y.y2i var6 = new com.aspose.slides.internal.k4y.y2i();
               List$Enumerator var7 = var5.l6().iterator();

               try {
                  while (var7.hasNext()) {
                     com.aspose.slides.internal.k4y.g7 var8 = (com.aspose.slides.internal.k4y.g7)var7.next();
                     var6.n5(var8);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                     var7.dispose();
                  }
               }

               n5(var0, var6, var2);
            }
         }

         n5(var0, var3, var2);
      }
   }

   private static void n5(m4n var0, com.aspose.slides.internal.k4y.y2i var1, h6j var2) {
      if (var0.n5() != null && var0.l6() != null) {
         q8e.n5(var0.n5(), var0.l6(), var1, var2);
      } else {
         if (var0.n5() != null) {
            q8e.n5(var0.n5(), var1, var2);
         }

         if (var0.l6() != null) {
            q8e.n5(var0.l6(), var1, var2);
         }
      }

      if (var0.k5() != null) {
         q8e.n5(var0.k5(), var1, var2);
      }

      if (var0.u3() != null) {
         q8e.n5(var0.u3(), var1, var2);
      }

      if (var0.a6() != null || var0.u9() != null) {
         q8e.n5(var0.a6(), var0.u9(), var1, var2);
      }
   }

   public static com.aspose.slides.internal.k4y.y2i n5(String var0, h6j var1) {
      if (var1.k5().containsKey(var0)) {
         return var1.k5().get_Item(var0);
      } else {
         return var1.l6().t2().containsKey(var0) ? var1.l6().t2().get_Item(var0) : null;
      }
   }
}
