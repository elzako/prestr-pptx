package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

public class LayoutPlaceholderManager implements ILayoutPlaceholderManager {
   private final LayoutSlide n5;

   @Override
   public final IAutoShape addContentPlaceholder(float x, float y, float width, float height) {
      return this.n5(x, y, width, height, "Content Placeholder ", (byte)0, (byte)8);
   }

   @Override
   public final IAutoShape addVerticalContentPlaceholder(float x, float y, float width, float height) {
      return this.n5(x, y, width, height, "Vertical Content Placeholder ", (byte)1, (byte)8);
   }

   @Override
   public final IAutoShape addTextPlaceholder(float x, float y, float width, float height) {
      return this.n5(x, y, width, height, "Text Placeholder ", (byte)0, (byte)1);
   }

   @Override
   public final IAutoShape addVerticalTextPlaceholder(float x, float y, float width, float height) {
      return this.n5(x, y, width, height, "Vertical Text Placeholder ", (byte)1, (byte)1);
   }

   @Override
   public final IAutoShape addPicturePlaceholder(float x, float y, float width, float height) {
      return this.n5(x, y, width, height, "Picture Placeholder ", (byte)0, (byte)15);
   }

   @Override
   public final IAutoShape addChartPlaceholder(float x, float y, float width, float height) {
      return this.n5(x, y, width, height, "Chart Placeholder ", (byte)0, (byte)9);
   }

   @Override
   public final IAutoShape addTablePlaceholder(float x, float y, float width, float height) {
      return this.n5(x, y, width, height, "Table Placeholder ", (byte)0, (byte)10);
   }

   @Override
   public final IAutoShape addSmartArtPlaceholder(float x, float y, float width, float height) {
      return this.n5(x, y, width, height, "SmartArt Placeholder ", (byte)0, (byte)12);
   }

   @Override
   public final IAutoShape addMediaPlaceholder(float x, float y, float width, float height) {
      return this.n5(x, y, width, height, "Media Placeholder ", (byte)0, (byte)13);
   }

   @Override
   public final IAutoShape addOnlineImagePlaceholder(float x, float y, float width, float height) {
      return this.n5(x, y, width, height, "Online Image Placeholder ", (byte)0, (byte)11);
   }

   private AutoShape n5(float var1, float var2, float var3, float var4, String var5, byte var6, byte var7) {
      if (com.aspose.slides.ms.System.n1.k5(var1)) {
         throw new ArgumentException("Value of x parameter must be defined (not a float.NaN).");
      }

      if (com.aspose.slides.ms.System.n1.k5(var2)) {
         throw new ArgumentException("Value of y parameter must be defined (not a float.NaN).");
      }

      if (com.aspose.slides.ms.System.n1.k5(var3)) {
         throw new ArgumentException("Value of width parameter must be defined (not a float.NaN).");
      }

      if (com.aspose.slides.ms.System.n1.k5(var4)) {
         throw new ArgumentException("Value of height parameter must be defined (not a float.NaN).");
      }

      AutoShape var8 = ((ShapeCollection)this.n5.getShapes()).y4();
      var8.u6();
      var8.setName(com.aspose.slides.ms.System.d1.n5(new String[]{var5, com.aspose.slides.ms.System.l4.l6(var8.v4())}));
      o4f var9 = var8.R_();
      var9.n5(new e4c(var1, var2));
      var8.n5((double)var3, (double)var4);
      var8.getAutoShapeLock().setGroupingLocked(true);
      var8.n5(var6, (byte)2, var7, this.n5.l6.l6(), false);
      TextFrame var10 = var8.x8();
      if (var7 == 1 || var7 == 8) {
         String var11 = this.n5.z1().c8();
         if (com.aspose.slides.ms.System.d1.n5(var11)) {
            IParagraphFormat var12 = this.n5.z1().getDefaultTextStyle().getLevel(0);
            if (var12 != null) {
               var11 = var12.getDefaultPortionFormat().getLanguageId();
            }
         }

         String var13 = var11;
         if (var13 == null) {
            var13 = "en-US";
         }

         this.n5(var10, var13, var6);
         var8.c8();
      }

      this.n5.l6.l6(var8);
      return var8;
   }

   private void n5(TextFrame var1, String var2, byte var3) {
      TextFrameFormat var4 = (TextFrameFormat)var1.getTextFrameFormat();
      var4.setAutofitType((byte)1);
      var4.setTextVerticalType((byte)(var3 == 1 ? 1 : 0));
      var4.n5(c0u.l6(i6f.n5, 12700.0).l6());
      var4.l6((byte)0);
      IParagraphCollection var5 = var1.getParagraphs();
      var5.add(this.n5((short)0, var2, "Click to edit Master text styles"));
      var5.add(this.n5((short)1, var2, "Second level"));
      var5.add(this.n5((short)2, var2, "Third level"));
      var5.add(this.n5((short)3, var2, "Fourth level"));
      var5.add(this.n5((short)4, var2, "Fifth level"));
   }

   private Paragraph n5(short var1, String var2, String var3) {
      Paragraph var4 = new Paragraph();
      var4.getParagraphFormat().setDepth(var1);
      Portion var5 = new Portion();
      var5.getPortionFormat().setLanguageId(var2);
      var5.getPortionFormat().setSmartTagClean(false);
      var5.n5(var3);
      var4.getPortions().add(var5);
      Portion var6 = new Portion();
      var6.getPortionFormat().setLanguageId(var2);
      var4.getPortions().add(var6);
      return var4;
   }

   LayoutPlaceholderManager(LayoutSlide layoutSlide) {
      this.n5 = layoutSlide;
   }
}
