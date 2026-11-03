package com.aspose.slides;

public class ForEach {
   public static void slide(Presentation pres, ForEach$ForEachSlideCallback forEachSlide) {
      e7n.n5(pres, "pres");
      e7n.n5(forEachSlide, "forEachSlide");

      for (int var2 = 0; var2 < pres.getSlides().size(); var2++) {
         Slide var3 = (Slide)pres.getSlides().get_Item(var2);
         forEachSlide.invoke(var3, var2);
      }
   }

   public static void masterSlide(Presentation pres, ForEach$ForEachMasterSlideCallback forEachMasterSlide) {
      e7n.n5(pres, "pres");
      e7n.n5(forEachMasterSlide, "forEachMasterSlide");

      for (int var2 = 0; var2 < pres.getMasters().size(); var2++) {
         MasterSlide var3 = (MasterSlide)pres.getMasters().get_Item(var2);
         forEachMasterSlide.invoke(var3, var2);
      }
   }

   public static void layoutSlide(Presentation pres, ForEach$ForEachLayoutSlideCallback forEachLayoutSlide) {
      e7n.n5(pres, "pres");
      e7n.n5(forEachLayoutSlide, "forEachLayoutSlide");

      for (int var2 = 0; var2 < pres.getLayoutSlides().size(); var2++) {
         LayoutSlide var3 = (LayoutSlide)pres.getLayoutSlides().get_Item(var2);
         forEachLayoutSlide.invoke(var3, var2);
      }
   }

   public static void shape(Presentation pres, ForEach$ForEachShapeCallback forEachShape) {
      shape(pres, false, forEachShape);
   }

   public static void shape(Presentation pres, boolean includeNotes, ForEach$ForEachShapeCallback forEachShape) {
      e7n.n5(pres, "pres");
      e7n.n5(forEachShape, "forEachShape");
      slide(pres, new ForEach$1(forEachShape, includeNotes));
      layoutSlide(pres, new ForEach$2(forEachShape));
      masterSlide(pres, new ForEach$3(forEachShape));
   }

   public static void shape(BaseSlide baseSlide, ForEach$ForEachShapeCallback forEachShape) {
      for (int var2 = 0; var2 < baseSlide.getShapes().size(); var2++) {
         Shape var3 = (Shape)baseSlide.getShapes().get_Item(var2);
         forEachShape.invoke(var3, baseSlide, var2);
      }
   }

   public static void paragraph(Presentation pres, ForEach$ForEachParagraphCallback forEachParagraph) {
      paragraph(pres, false, forEachParagraph);
   }

   public static void paragraph(Presentation pres, boolean includeNotes, ForEach$ForEachParagraphCallback forEachParagraph) {
      e7n.n5(pres, "pres");
      e7n.n5(forEachParagraph, "forEachParagraph");
      shape(pres, includeNotes, new ForEach$4(forEachParagraph));
   }

   public static void portion(Presentation pres, ForEach$ForEachPortionCallback forEachPortion) {
      portion(pres, false, forEachPortion);
   }

   public static void portion(Presentation pres, boolean includeNotes, ForEach$ForEachPortionCallback forEachPortion) {
      e7n.n5(pres, "pres");
      e7n.n5(forEachPortion, "forEachPortion");
      paragraph(pres, includeNotes, new ForEach$5(forEachPortion));
   }
}
