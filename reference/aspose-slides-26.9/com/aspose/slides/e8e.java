package com.aspose.slides;

class e8e {
   static void n5(NotesSlide var0) {
      GroupShape var1 = var0.k5;
      o4f var2 = var1.R_();
      var2.n5(e4c.k5.u9());
      var1.k5(e4c.k5.u9());
      var1.n5(e4c.k5.u9());
      var1.l6(e4c.k5.u9());
      var1.n5(new EffectFormat(var0.k5));
      var1.setAlternativeText("");
      var1.setName("");
      n5(var0, "Slide Image Placeholder 1");
      l6(var0, "Notes Placeholder 2");
      k5(var0, "Slide Number Placeholder 3");
   }

   static AutoShape n5(NotesSlide var0, String var1) {
      AutoShape var2 = ((ShapeCollection)var0.k5.getShapes()).y4();
      var2.u6();
      var2.setAlternativeText("");
      var2.setName(var1);
      var2.n5((byte)0, (byte)0, (byte)14, 0L, false);
      var2.getAutoShapeLock().setGroupingLocked(true);
      var2.getAutoShapeLock().setRotateLocked(true);
      var2.getAutoShapeLock().setAspectRatioLocked(true);
      var2.c8();
      return var2;
   }

   static AutoShape l6(NotesSlide var0, String var1) {
      AutoShape var2 = ((ShapeCollection)var0.k5.getShapes()).y4();
      var2.u6();
      var2.setAlternativeText("");
      var2.setName(var1);
      var2.n5((byte)0, (byte)0, (byte)1, 1L, false);
      var2.getAutoShapeLock().setGroupingLocked(true);
      var2.addTextFrame("");
      var2.getTextFrame().getTextFrameFormat().setAutofitType((byte)1);
      var2.c8();
      return var2;
   }

   static AutoShape k5(NotesSlide var0, String var1) {
      AutoShape var2 = ((ShapeCollection)var0.k5.getShapes()).y4();
      var2.u6();
      var2.setAlternativeText("");
      var2.setName(var1);
      var2.n5((byte)0, (byte)2, (byte)5, 10L, false);
      var2.getAutoShapeLock().setGroupingLocked(true);
      var2.x8();
      Paragraph var3 = new Paragraph();
      Portion var4 = new Portion();
      var4.addField("slidenum");
      ((Field)var4.getField()).n5(new com.aspose.slides.ms.System.o0("6101C5E1-D8E9-464D-A93E-CE21651935A7"));
      var4.getPortionFormat().setLanguageId("en-US");
      var4.getPortionFormat().setSmartTagClean(false);
      var4.n5("1");
      var3.getPortions().add(var4);
      Portion var5 = new Portion();
      var5.getPortionFormat().setLanguageId("en-US");
      var3.getPortions().add(var5);
      var2.getTextFrame().getParagraphs().add(var3);
      var2.c8();
      return var2;
   }
}
